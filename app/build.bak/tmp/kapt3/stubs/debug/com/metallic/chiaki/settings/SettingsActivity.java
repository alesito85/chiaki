package com.metallic.chiaki.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/metallic/chiaki/settings/SettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "()V", "binding", "Lcom/metallic/chiaki/databinding/ActivitySettingsBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPreferenceStartFragment", "", "caller", "Landroidx/preference/PreferenceFragmentCompat;", "pref", "Landroidx/preference/Preference;", "replaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "addToBackStack", "app_debug"})
public final class SettingsActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    private com.metallic.chiaki.databinding.ActivitySettingsBinding binding;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onPreferenceStartFragment(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat caller, @org.jetbrains.annotations.NotNull()
    androidx.preference.Preference pref) {
        return false;
    }
    
    private final void replaceFragment(androidx.fragment.app.Fragment fragment, boolean addToBackStack) {
    }
    
    public SettingsActivity() {
        super();
    }
}