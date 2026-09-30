package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final class d extends m {
    public final /* synthetic */ int echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i4) {
        super(lVar);
        this.echo = i4;
    }

    @Override // com.google.android.material.textfield.m
    public void romeo() {
        switch (this.echo) {
            case 0:
                l lVar = this.bravo;
                lVar.f8230h = null;
                CheckableImageButton checkableImageButton = lVar.yellow;
                checkableImageButton.setOnLongClickListener(null);
                r6.s.delta(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
