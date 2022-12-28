// Generated by view binder compiler. Do not edit!
package com.metallic.chiaki.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.metallic.chiaki.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditManualBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextInputEditText hostEditText;

  @NonNull
  public final TextInputLayout hostTextInputLayout;

  @NonNull
  public final ImageView iconImageView;

  @NonNull
  public final TextInputLayout registeredHostTextInputLayout;

  @NonNull
  public final AutoCompleteTextView registeredHostTextView;

  @NonNull
  public final ScrollView rootLayout;

  @NonNull
  public final MaterialButton saveButton;

  @NonNull
  public final MaterialTextView titleTextView;

  private ActivityEditManualBinding(@NonNull ScrollView rootView,
      @NonNull TextInputEditText hostEditText, @NonNull TextInputLayout hostTextInputLayout,
      @NonNull ImageView iconImageView, @NonNull TextInputLayout registeredHostTextInputLayout,
      @NonNull AutoCompleteTextView registeredHostTextView, @NonNull ScrollView rootLayout,
      @NonNull MaterialButton saveButton, @NonNull MaterialTextView titleTextView) {
    this.rootView = rootView;
    this.hostEditText = hostEditText;
    this.hostTextInputLayout = hostTextInputLayout;
    this.iconImageView = iconImageView;
    this.registeredHostTextInputLayout = registeredHostTextInputLayout;
    this.registeredHostTextView = registeredHostTextView;
    this.rootLayout = rootLayout;
    this.saveButton = saveButton;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditManualBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditManualBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_manual, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditManualBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.hostEditText;
      TextInputEditText hostEditText = rootView.findViewById(id);
      if (hostEditText == null) {
        break missingId;
      }

      id = R.id.hostTextInputLayout;
      TextInputLayout hostTextInputLayout = rootView.findViewById(id);
      if (hostTextInputLayout == null) {
        break missingId;
      }

      id = R.id.iconImageView;
      ImageView iconImageView = rootView.findViewById(id);
      if (iconImageView == null) {
        break missingId;
      }

      id = R.id.registeredHostTextInputLayout;
      TextInputLayout registeredHostTextInputLayout = rootView.findViewById(id);
      if (registeredHostTextInputLayout == null) {
        break missingId;
      }

      id = R.id.registeredHostTextView;
      AutoCompleteTextView registeredHostTextView = rootView.findViewById(id);
      if (registeredHostTextView == null) {
        break missingId;
      }

      ScrollView rootLayout = (ScrollView) rootView;

      id = R.id.saveButton;
      MaterialButton saveButton = rootView.findViewById(id);
      if (saveButton == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      MaterialTextView titleTextView = rootView.findViewById(id);
      if (titleTextView == null) {
        break missingId;
      }

      return new ActivityEditManualBinding((ScrollView) rootView, hostEditText, hostTextInputLayout,
          iconImageView, registeredHostTextInputLayout, registeredHostTextView, rootLayout,
          saveButton, titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
