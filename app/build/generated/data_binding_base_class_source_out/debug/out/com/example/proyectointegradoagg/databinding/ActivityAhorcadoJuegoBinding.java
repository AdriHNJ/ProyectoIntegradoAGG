// Generated by view binder compiler. Do not edit!
package com.example.proyectointegradoagg.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.proyectointegradoagg.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAhorcadoJuegoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView a;

  @NonNull
  public final TextView b;

  @NonNull
  public final TextView c;

  @NonNull
  public final TextView d;

  @NonNull
  public final TextView e;

  @NonNull
  public final TextView f;

  @NonNull
  public final Flow flow;

  @NonNull
  public final TextView g;

  @NonNull
  public final TextView gameLostTextView;

  @NonNull
  public final TextView gameWonTextView;

  @NonNull
  public final TextView h;

  @NonNull
  public final TextView i;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView j;

  @NonNull
  public final TextView k;

  @NonNull
  public final TextView l;

  @NonNull
  public final ConstraintLayout lettersLayout;

  @NonNull
  public final TextView lettersUsedTextView;

  @NonNull
  public final TextView m;

  @NonNull
  public final TextView n;

  @NonNull
  public final Button newGameButton;

  @NonNull
  public final TextView o;

  @NonNull
  public final TextView p;

  @NonNull
  public final TextView q;

  @NonNull
  public final TextView r;

  @NonNull
  public final TextView s;

  @NonNull
  public final TextView t;

  @NonNull
  public final TextView u;

  @NonNull
  public final TextView v;

  @NonNull
  public final TextView w;

  @NonNull
  public final TextView wordTextView;

  @NonNull
  public final TextView x;

  @NonNull
  public final TextView y;

  @NonNull
  public final TextView z;

  private ActivityAhorcadoJuegoBinding(@NonNull ConstraintLayout rootView, @NonNull TextView a,
      @NonNull TextView b, @NonNull TextView c, @NonNull TextView d, @NonNull TextView e,
      @NonNull TextView f, @NonNull Flow flow, @NonNull TextView g,
      @NonNull TextView gameLostTextView, @NonNull TextView gameWonTextView, @NonNull TextView h,
      @NonNull TextView i, @NonNull ImageView imageView, @NonNull TextView j, @NonNull TextView k,
      @NonNull TextView l, @NonNull ConstraintLayout lettersLayout,
      @NonNull TextView lettersUsedTextView, @NonNull TextView m, @NonNull TextView n,
      @NonNull Button newGameButton, @NonNull TextView o, @NonNull TextView p, @NonNull TextView q,
      @NonNull TextView r, @NonNull TextView s, @NonNull TextView t, @NonNull TextView u,
      @NonNull TextView v, @NonNull TextView w, @NonNull TextView wordTextView, @NonNull TextView x,
      @NonNull TextView y, @NonNull TextView z) {
    this.rootView = rootView;
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
    this.flow = flow;
    this.g = g;
    this.gameLostTextView = gameLostTextView;
    this.gameWonTextView = gameWonTextView;
    this.h = h;
    this.i = i;
    this.imageView = imageView;
    this.j = j;
    this.k = k;
    this.l = l;
    this.lettersLayout = lettersLayout;
    this.lettersUsedTextView = lettersUsedTextView;
    this.m = m;
    this.n = n;
    this.newGameButton = newGameButton;
    this.o = o;
    this.p = p;
    this.q = q;
    this.r = r;
    this.s = s;
    this.t = t;
    this.u = u;
    this.v = v;
    this.w = w;
    this.wordTextView = wordTextView;
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAhorcadoJuegoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAhorcadoJuegoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ahorcado_juego, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAhorcadoJuegoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.a;
      TextView a = ViewBindings.findChildViewById(rootView, id);
      if (a == null) {
        break missingId;
      }

      id = R.id.b;
      TextView b = ViewBindings.findChildViewById(rootView, id);
      if (b == null) {
        break missingId;
      }

      id = R.id.c;
      TextView c = ViewBindings.findChildViewById(rootView, id);
      if (c == null) {
        break missingId;
      }

      id = R.id.d;
      TextView d = ViewBindings.findChildViewById(rootView, id);
      if (d == null) {
        break missingId;
      }

      id = R.id.e;
      TextView e = ViewBindings.findChildViewById(rootView, id);
      if (e == null) {
        break missingId;
      }

      id = R.id.f;
      TextView f = ViewBindings.findChildViewById(rootView, id);
      if (f == null) {
        break missingId;
      }

      id = R.id.flow;
      Flow flow = ViewBindings.findChildViewById(rootView, id);
      if (flow == null) {
        break missingId;
      }

      id = R.id.g;
      TextView g = ViewBindings.findChildViewById(rootView, id);
      if (g == null) {
        break missingId;
      }

      id = R.id.gameLostTextView;
      TextView gameLostTextView = ViewBindings.findChildViewById(rootView, id);
      if (gameLostTextView == null) {
        break missingId;
      }

      id = R.id.gameWonTextView;
      TextView gameWonTextView = ViewBindings.findChildViewById(rootView, id);
      if (gameWonTextView == null) {
        break missingId;
      }

      id = R.id.h;
      TextView h = ViewBindings.findChildViewById(rootView, id);
      if (h == null) {
        break missingId;
      }

      id = R.id.i;
      TextView i = ViewBindings.findChildViewById(rootView, id);
      if (i == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.j;
      TextView j = ViewBindings.findChildViewById(rootView, id);
      if (j == null) {
        break missingId;
      }

      id = R.id.k;
      TextView k = ViewBindings.findChildViewById(rootView, id);
      if (k == null) {
        break missingId;
      }

      id = R.id.l;
      TextView l = ViewBindings.findChildViewById(rootView, id);
      if (l == null) {
        break missingId;
      }

      id = R.id.lettersLayout;
      ConstraintLayout lettersLayout = ViewBindings.findChildViewById(rootView, id);
      if (lettersLayout == null) {
        break missingId;
      }

      id = R.id.lettersUsedTextView;
      TextView lettersUsedTextView = ViewBindings.findChildViewById(rootView, id);
      if (lettersUsedTextView == null) {
        break missingId;
      }

      id = R.id.m;
      TextView m = ViewBindings.findChildViewById(rootView, id);
      if (m == null) {
        break missingId;
      }

      id = R.id.n;
      TextView n = ViewBindings.findChildViewById(rootView, id);
      if (n == null) {
        break missingId;
      }

      id = R.id.newGameButton;
      Button newGameButton = ViewBindings.findChildViewById(rootView, id);
      if (newGameButton == null) {
        break missingId;
      }

      id = R.id.o;
      TextView o = ViewBindings.findChildViewById(rootView, id);
      if (o == null) {
        break missingId;
      }

      id = R.id.p;
      TextView p = ViewBindings.findChildViewById(rootView, id);
      if (p == null) {
        break missingId;
      }

      id = R.id.q;
      TextView q = ViewBindings.findChildViewById(rootView, id);
      if (q == null) {
        break missingId;
      }

      id = R.id.r;
      TextView r = ViewBindings.findChildViewById(rootView, id);
      if (r == null) {
        break missingId;
      }

      id = R.id.s;
      TextView s = ViewBindings.findChildViewById(rootView, id);
      if (s == null) {
        break missingId;
      }

      id = R.id.t;
      TextView t = ViewBindings.findChildViewById(rootView, id);
      if (t == null) {
        break missingId;
      }

      id = R.id.u;
      TextView u = ViewBindings.findChildViewById(rootView, id);
      if (u == null) {
        break missingId;
      }

      id = R.id.v;
      TextView v = ViewBindings.findChildViewById(rootView, id);
      if (v == null) {
        break missingId;
      }

      id = R.id.w;
      TextView w = ViewBindings.findChildViewById(rootView, id);
      if (w == null) {
        break missingId;
      }

      id = R.id.wordTextView;
      TextView wordTextView = ViewBindings.findChildViewById(rootView, id);
      if (wordTextView == null) {
        break missingId;
      }

      id = R.id.x;
      TextView x = ViewBindings.findChildViewById(rootView, id);
      if (x == null) {
        break missingId;
      }

      id = R.id.y;
      TextView y = ViewBindings.findChildViewById(rootView, id);
      if (y == null) {
        break missingId;
      }

      id = R.id.z;
      TextView z = ViewBindings.findChildViewById(rootView, id);
      if (z == null) {
        break missingId;
      }

      return new ActivityAhorcadoJuegoBinding((ConstraintLayout) rootView, a, b, c, d, e, f, flow,
          g, gameLostTextView, gameWonTextView, h, i, imageView, j, k, l, lettersLayout,
          lettersUsedTextView, m, n, newGameButton, o, p, q, r, s, t, u, v, w, wordTextView, x, y,
          z);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}