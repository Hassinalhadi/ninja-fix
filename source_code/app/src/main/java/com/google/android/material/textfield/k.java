package com.google.android.material.textfield;

import android.widget.EditText;

/* loaded from: classes2.dex */
public final class k {
    public final /* synthetic */ l alpha;

    public k(l lVar) {
        this.alpha = lVar;
    }

    public final void alpha(TextInputLayout textInputLayout) {
        l lVar = this.alpha;
        if (lVar.f8234l == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = lVar.f8234l;
        j jVar = lVar.f8237o;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (lVar.f8234l.getOnFocusChangeListener() == lVar.bravo().echo()) {
                lVar.f8234l.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        lVar.f8234l = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        lVar.bravo().mike(lVar.f8234l);
        lVar.juliet(lVar.bravo());
    }
}
