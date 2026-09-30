package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.aa;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip alpha;
    public final EditText purple;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LocaleList locales;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.alpha = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.purple = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            editText.setImeHintLocales(locales);
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String alpha(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.alpha.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.purple.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z2) {
        int i4;
        Chip chip = this.alpha;
        chip.setChecked(z2);
        int i5 = 0;
        if (z2) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        EditText editText = this.purple;
        editText.setVisibility(i4);
        if (z2) {
            i5 = 8;
        }
        chip.setVisibility(i5);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new aa(0, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.alpha.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i4, Object obj) {
        this.alpha.setTag(i4, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.alpha.toggle();
    }
}
