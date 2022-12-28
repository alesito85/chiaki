// Generated by view binder compiler. Do not edit!
package com.metallic.chiaki.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.metallic.chiaki.R;
import com.metallic.chiaki.stream.AspectRatioFrameLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStreamBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AspectRatioFrameLayout aspectRatioLayout;

  @NonNull
  public final MaterialButton displayModeNormalButton;

  @NonNull
  public final MaterialButton displayModeStretchButton;

  @NonNull
  public final MaterialButtonToggleGroup displayModeToggle;

  @NonNull
  public final MaterialButton displayModeZoomButton;

  @NonNull
  public final FrameLayout mainStreamLayout;

  @NonNull
  public final SwitchMaterial onScreenControlsSwitch;

  @NonNull
  public final ConstraintLayout overlay;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final SurfaceView surfaceView;

  @NonNull
  public final SwitchMaterial touchpadOnlySwitch;

  private ActivityStreamBinding(@NonNull FrameLayout rootView,
      @NonNull AspectRatioFrameLayout aspectRatioLayout,
      @NonNull MaterialButton displayModeNormalButton,
      @NonNull MaterialButton displayModeStretchButton,
      @NonNull MaterialButtonToggleGroup displayModeToggle,
      @NonNull MaterialButton displayModeZoomButton, @NonNull FrameLayout mainStreamLayout,
      @NonNull SwitchMaterial onScreenControlsSwitch, @NonNull ConstraintLayout overlay,
      @NonNull ProgressBar progressBar, @NonNull SurfaceView surfaceView,
      @NonNull SwitchMaterial touchpadOnlySwitch) {
    this.rootView = rootView;
    this.aspectRatioLayout = aspectRatioLayout;
    this.displayModeNormalButton = displayModeNormalButton;
    this.displayModeStretchButton = displayModeStretchButton;
    this.displayModeToggle = displayModeToggle;
    this.displayModeZoomButton = displayModeZoomButton;
    this.mainStreamLayout = mainStreamLayout;
    this.onScreenControlsSwitch = onScreenControlsSwitch;
    this.overlay = overlay;
    this.progressBar = progressBar;
    this.surfaceView = surfaceView;
    this.touchpadOnlySwitch = touchpadOnlySwitch;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStreamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStreamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_stream, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStreamBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.aspectRatioLayout;
      AspectRatioFrameLayout aspectRatioLayout = rootView.findViewById(id);
      if (aspectRatioLayout == null) {
        break missingId;
      }

      id = R.id.display_mode_normal_button;
      MaterialButton displayModeNormalButton = rootView.findViewById(id);
      if (displayModeNormalButton == null) {
        break missingId;
      }

      id = R.id.display_mode_stretch_button;
      MaterialButton displayModeStretchButton = rootView.findViewById(id);
      if (displayModeStretchButton == null) {
        break missingId;
      }

      id = R.id.displayModeToggle;
      MaterialButtonToggleGroup displayModeToggle = rootView.findViewById(id);
      if (displayModeToggle == null) {
        break missingId;
      }

      id = R.id.display_mode_zoom_button;
      MaterialButton displayModeZoomButton = rootView.findViewById(id);
      if (displayModeZoomButton == null) {
        break missingId;
      }

      FrameLayout mainStreamLayout = (FrameLayout) rootView;

      id = R.id.onScreenControlsSwitch;
      SwitchMaterial onScreenControlsSwitch = rootView.findViewById(id);
      if (onScreenControlsSwitch == null) {
        break missingId;
      }

      id = R.id.overlay;
      ConstraintLayout overlay = rootView.findViewById(id);
      if (overlay == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.surfaceView;
      SurfaceView surfaceView = rootView.findViewById(id);
      if (surfaceView == null) {
        break missingId;
      }

      id = R.id.touchpadOnlySwitch;
      SwitchMaterial touchpadOnlySwitch = rootView.findViewById(id);
      if (touchpadOnlySwitch == null) {
        break missingId;
      }

      return new ActivityStreamBinding((FrameLayout) rootView, aspectRatioLayout,
          displayModeNormalButton, displayModeStretchButton, displayModeToggle,
          displayModeZoomButton, mainStreamLayout, onScreenControlsSwitch, overlay, progressBar,
          surfaceView, touchpadOnlySwitch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}