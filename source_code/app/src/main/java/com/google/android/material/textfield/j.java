package com.google.android.material.textfield;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class j extends com.google.android.material.internal.y {
    public final /* synthetic */ l alpha;

    public j(l lVar) {
        this.alpha = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.alpha.bravo().alpha();
    }

    @Override // com.google.android.material.internal.y, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        this.alpha.bravo().bravo();
    }
}
