// Generated by view binder compiler. Do not edit!
package com.metallic.chiaki.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.metallic.chiaki.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLogFileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView iconImageView;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final AppCompatImageButton shareButton;

  @NonNull
  public final TextView summaryTextView;

  private ItemLogFileBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView iconImageView,
      @NonNull TextView nameTextView, @NonNull AppCompatImageButton shareButton,
      @NonNull TextView summaryTextView) {
    this.rootView = rootView;
    this.iconImageView = iconImageView;
    this.nameTextView = nameTextView;
    this.shareButton = shareButton;
    this.summaryTextView = summaryTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLogFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLogFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_log_file, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLogFileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iconImageView;
      ImageView iconImageView = rootView.findViewById(id);
      if (iconImageView == null) {
        break missingId;
      }

      id = R.id.nameTextView;
      TextView nameTextView = rootView.findViewById(id);
      if (nameTextView == null) {
        break missingId;
      }

      id = R.id.shareButton;
      AppCompatImageButton shareButton = rootView.findViewById(id);
      if (shareButton == null) {
        break missingId;
      }

      id = R.id.summaryTextView;
      TextView summaryTextView = rootView.findViewById(id);
      if (summaryTextView == null) {
        break missingId;
      }

      return new ItemLogFileBinding((ConstraintLayout) rootView, iconImageView, nameTextView,
          shareButton, summaryTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
