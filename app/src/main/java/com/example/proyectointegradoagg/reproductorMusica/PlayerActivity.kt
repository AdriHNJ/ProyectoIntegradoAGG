package com.example.proyectointegradoagg.reproductorMusica

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.widget.SeekBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.proyectointegradoagg.R
import com.example.proyectointegradoagg.databinding.ActivityPlayerBinding
import java.lang.Exception

class PlayerActivity : AppCompatActivity(), ServiceConnection {

    lateinit var binding: ActivityPlayerBinding
    companion object {
        lateinit var musicListPA : ArrayList<Music>
        var posicionCancion: Int = 0
        var isReproduciendo: Boolean = false
        var musicService: MusicService? = null
        private lateinit var runnable: Runnable
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPlayerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //Iniciar Servicio
        val intent = Intent(this, MusicService::class.java)
        bindService(intent, this, BIND_AUTO_CREATE)
        startService(intent)
        iniciarLayout()
        setListeners()
    }

    private fun setListeners() {
        binding.backBtn.setOnClickListener {
            onBackPressed()
        }
        binding.playPauseButton.setOnClickListener {
            if(isReproduciendo) pauseMusica()
            else playMusica()
        }
        binding.siguienteBtn.setOnClickListener {
            prevNextSong(increment = true)
        }
        binding.anteriorBtn.setOnClickListener{
            prevNextSong(increment = false)
        }
        binding.seekBarPA.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p2) musicService!!.mediaPlayer!!.seekTo(p1)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) = Unit
            override fun onStopTrackingTouch(p0: SeekBar?) = Unit
        })

    }

    private fun iniciarLayout() {
        posicionCancion = intent.getIntExtra("index", 0)
        when(intent.getStringExtra("class")){
            "MusicAdapter" ->{
                musicListPA = ArrayList()
                musicListPA.addAll(ReproductorMusicaActivity.MusicListMA)
                setLayout()

            }
        }
    }

    private fun crearMediaPlayer(){
        try {
            if (musicService!!.mediaPlayer == null) musicService!!.mediaPlayer = MediaPlayer()
            musicService!!.mediaPlayer!!.reset()
            musicService!!.mediaPlayer!!.setDataSource(musicListPA[posicionCancion].path)
            musicService!!.mediaPlayer!!.prepare()
            musicService!!.mediaPlayer!!.start()
            isReproduciendo = true
            binding.playPauseButton.setIconResource(R.drawable.pause_icon)
            binding.tvSeekBarStart.text = formatDuration(musicService!!.mediaPlayer!!.currentPosition.toLong())
            binding.tvSeekBarEnd.text = formatDuration(musicService!!.mediaPlayer!!.duration.toLong())
            binding.seekBarPA.max = musicService!!.mediaPlayer!!.duration
        } catch (e: Exception){return}
    }

    //Funcion para que el seekBar avance y escriba el minuto y segundo de canción
    fun seekBarSetup(){
        runnable = Runnable {
            binding.tvSeekBarStart.text = formatDuration(musicService!!.mediaPlayer!!.currentPosition.toLong())
            binding.seekBarPA.progress = musicService!!.mediaPlayer!!.currentPosition
            Handler(Looper.getMainLooper()).postDelayed(runnable, 200)
        }
        Handler(Looper.getMainLooper()).postDelayed(runnable, 0)
    }

    private fun setLayout(){
        Glide.with(this)
            .load(musicListPA[posicionCancion].artUri)
            .apply(RequestOptions().placeholder(R.drawable.logo_app).centerCrop())
            .into(binding.imagenCancionPA)
        binding.nombreCancionPA.text = musicListPA[posicionCancion].titulo
    }

    private fun playMusica(){
        binding.playPauseButton.setIconResource(R.drawable.pause_icon)
        isReproduciendo = true
        musicService!!.mediaPlayer!!.start()
    }

    private fun pauseMusica(){
        binding.playPauseButton.setIconResource(R.drawable.play_icon)
        isReproduciendo = false
        musicService!!.mediaPlayer!!.pause()
    }
    private fun prevNextSong(increment: Boolean){
        if (increment) {
            setPosicionCancion(increment = true)
            setLayout()
            crearMediaPlayer()
        }
        else{
            setPosicionCancion(increment = false)
            setLayout()
            crearMediaPlayer()
        }
    }
    private fun setPosicionCancion(increment: Boolean){
        if(increment){
             if (musicListPA.size - 1 == posicionCancion)
                 posicionCancion = 0
             else ++posicionCancion
        } else {
            if (0 == posicionCancion)
                posicionCancion = musicListPA.size-1
            else --posicionCancion
        }
    }

    override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
        val binder = p1 as MusicService.MyBinder
        musicService = binder.currentService()
        crearMediaPlayer()
        seekBarSetup()
    }

    override fun onServiceDisconnected(p0: ComponentName?) {
        musicService = null
    }
}