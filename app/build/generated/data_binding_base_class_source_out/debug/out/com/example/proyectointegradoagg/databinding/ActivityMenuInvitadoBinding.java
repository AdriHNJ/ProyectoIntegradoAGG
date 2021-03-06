// Generated by view binder compiler. Do not edit!
package com.example.proyectointegradoagg.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.example.proyectointegradoagg.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenuInvitadoBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtProvider2;

  @NonNull
  public final ViewPager viewPagerInvitado;

  private ActivityMenuInvitadoBinding(@NonNull RelativeLayout rootView, @NonNull TextView txtEmail,
      @NonNull TextView txtProvider2, @NonNull ViewPager viewPagerInvitado) {
    this.rootView = rootView;
    this.txtEmail = txtEmail;
    this.txtProvider2 = txtProvider2;
    this.viewPagerInvitado = viewPagerInvitado;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuInvitadoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuInvitadoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_invitado, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuInvitadoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txtEmail;
      TextView txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtProvider2;
      TextView txtProvider2 = ViewBindings.findChildViewById(rootView, id);
      if (txtProvider2 == null) {
        break missingId;
      }

      id = R.id.viewPagerInvitado;
      ViewPager viewPagerInvitado = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerInvitado == null) {
        break missingId;
      }

      return new ActivityMenuInvitadoBinding((RelativeLayout) rootView, txtEmail, txtProvider2,
          viewPagerInvitado);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
