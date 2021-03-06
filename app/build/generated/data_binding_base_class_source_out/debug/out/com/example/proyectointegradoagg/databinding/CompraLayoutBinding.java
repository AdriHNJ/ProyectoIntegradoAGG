// Generated by view binder compiler. Do not edit!
package com.example.proyectointegradoagg.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.proyectointegradoagg.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CompraLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView tvId;

  @NonNull
  public final TextView tvLugar;

  @NonNull
  public final TextView tvPrecio;

  @NonNull
  public final TextView tvProducto;

  private CompraLayoutBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull ImageButton imageButton, @NonNull TextView textView7, @NonNull TextView textView8,
      @NonNull TextView textView9, @NonNull TextView tvId, @NonNull TextView tvLugar,
      @NonNull TextView tvPrecio, @NonNull TextView tvProducto) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.imageButton = imageButton;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.tvId = tvId;
    this.tvLugar = tvLugar;
    this.tvPrecio = tvPrecio;
    this.tvProducto = tvProducto;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CompraLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CompraLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.compra_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CompraLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.tv_id;
      TextView tvId = ViewBindings.findChildViewById(rootView, id);
      if (tvId == null) {
        break missingId;
      }

      id = R.id.tv_lugar;
      TextView tvLugar = ViewBindings.findChildViewById(rootView, id);
      if (tvLugar == null) {
        break missingId;
      }

      id = R.id.tv_precio;
      TextView tvPrecio = ViewBindings.findChildViewById(rootView, id);
      if (tvPrecio == null) {
        break missingId;
      }

      id = R.id.tv_producto;
      TextView tvProducto = ViewBindings.findChildViewById(rootView, id);
      if (tvProducto == null) {
        break missingId;
      }

      return new CompraLayoutBinding((CardView) rootView, cardView, imageButton, textView7,
          textView8, textView9, tvId, tvLugar, tvPrecio, tvProducto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
