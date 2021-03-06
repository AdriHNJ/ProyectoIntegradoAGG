// Generated by view binder compiler. Do not edit!
package com.example.proyectointegradoagg.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.proyectointegradoagg.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGameBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView eight;

  @NonNull
  public final TextView five;

  @NonNull
  public final TextView four;

  @NonNull
  public final TextView nine;

  @NonNull
  public final TextView one;

  @NonNull
  public final TextView playerOneScore;

  @NonNull
  public final TextView playerTwoScore;

  @NonNull
  public final TextView seven;

  @NonNull
  public final TextView six;

  @NonNull
  public final Button startNewGameButton;

  @NonNull
  public final TextView three;

  @NonNull
  public final TextView two;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  @NonNull
  public final View view4;

  private ActivityGameBinding(@NonNull ConstraintLayout rootView, @NonNull TextView eight,
      @NonNull TextView five, @NonNull TextView four, @NonNull TextView nine, @NonNull TextView one,
      @NonNull TextView playerOneScore, @NonNull TextView playerTwoScore, @NonNull TextView seven,
      @NonNull TextView six, @NonNull Button startNewGameButton, @NonNull TextView three,
      @NonNull TextView two, @NonNull View view, @NonNull View view2, @NonNull View view3,
      @NonNull View view4) {
    this.rootView = rootView;
    this.eight = eight;
    this.five = five;
    this.four = four;
    this.nine = nine;
    this.one = one;
    this.playerOneScore = playerOneScore;
    this.playerTwoScore = playerTwoScore;
    this.seven = seven;
    this.six = six;
    this.startNewGameButton = startNewGameButton;
    this.three = three;
    this.two = two;
    this.view = view;
    this.view2 = view2;
    this.view3 = view3;
    this.view4 = view4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_game, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.eight;
      TextView eight = ViewBindings.findChildViewById(rootView, id);
      if (eight == null) {
        break missingId;
      }

      id = R.id.five;
      TextView five = ViewBindings.findChildViewById(rootView, id);
      if (five == null) {
        break missingId;
      }

      id = R.id.four;
      TextView four = ViewBindings.findChildViewById(rootView, id);
      if (four == null) {
        break missingId;
      }

      id = R.id.nine;
      TextView nine = ViewBindings.findChildViewById(rootView, id);
      if (nine == null) {
        break missingId;
      }

      id = R.id.one;
      TextView one = ViewBindings.findChildViewById(rootView, id);
      if (one == null) {
        break missingId;
      }

      id = R.id.player_one_score;
      TextView playerOneScore = ViewBindings.findChildViewById(rootView, id);
      if (playerOneScore == null) {
        break missingId;
      }

      id = R.id.player_two_score;
      TextView playerTwoScore = ViewBindings.findChildViewById(rootView, id);
      if (playerTwoScore == null) {
        break missingId;
      }

      id = R.id.seven;
      TextView seven = ViewBindings.findChildViewById(rootView, id);
      if (seven == null) {
        break missingId;
      }

      id = R.id.six;
      TextView six = ViewBindings.findChildViewById(rootView, id);
      if (six == null) {
        break missingId;
      }

      id = R.id.start_new_game_button;
      Button startNewGameButton = ViewBindings.findChildViewById(rootView, id);
      if (startNewGameButton == null) {
        break missingId;
      }

      id = R.id.three;
      TextView three = ViewBindings.findChildViewById(rootView, id);
      if (three == null) {
        break missingId;
      }

      id = R.id.two;
      TextView two = ViewBindings.findChildViewById(rootView, id);
      if (two == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      id = R.id.view4;
      View view4 = ViewBindings.findChildViewById(rootView, id);
      if (view4 == null) {
        break missingId;
      }

      return new ActivityGameBinding((ConstraintLayout) rootView, eight, five, four, nine, one,
          playerOneScore, playerTwoScore, seven, six, startNewGameButton, three, two, view, view2,
          view3, view4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
