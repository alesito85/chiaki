// Generated by view binder compiler. Do not edit!
package com.metallic.chiaki.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.metallic.chiaki.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout settingsFragment;

  @NonNull
  public final AppCompatTextView titleTextView;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivitySettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull FrameLayout settingsFragment, @NonNull AppCompatTextView titleTextView,
      @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.settingsFragment = settingsFragment;
    this.titleTextView = titleTextView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.settingsFragment;
      FrameLayout settingsFragment = rootView.findViewById(id);
      if (settingsFragment == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      AppCompatTextView titleTextView = rootView.findViewById(id);
      if (titleTextView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((ConstraintLayout) rootView, settingsFragment,
          titleTextView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}