package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class v implements TextWatcher {
    public int alpha;
    public final /* synthetic */ EditText purple;
    public final /* synthetic */ TextInputLayout red;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.red = textInputLayout;
        this.purple = editText;
        this.alpha = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.red;
        textInputLayout.whiskey(!textInputLayout.f8218u0, false);
        if (textInputLayout.e) {
            textInputLayout.papa(editable);
        }
        if (textInputLayout.f8201m) {
            textInputLayout.xray(editable);
        }
        EditText editText = this.purple;
        int lineCount = editText.getLineCount();
        int i4 = this.alpha;
        if (lineCount != i4) {
            if (lineCount < i4) {
                int minimumHeight = editText.getMinimumHeight();
                int i5 = textInputLayout.f8204n0;
                if (minimumHeight != i5) {
                    editText.setMinimumHeight(i5);
                }
            }
            this.alpha = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
    }
}
