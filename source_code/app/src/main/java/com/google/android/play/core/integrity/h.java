package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.af;
import p7.u;

/* loaded from: classes2.dex */
public abstract class h extends u {
    public final /* synthetic */ i purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, G6.h hVar) {
        super(hVar);
        this.purple = iVar;
    }

    @Override // p7.u
    public final void alpha(Exception exc) {
        if (!(exc instanceof af)) {
            super.alpha(exc);
        } else if (i.delta(this.purple)) {
            super.alpha(new StandardIntegrityException(-2, exc));
        } else {
            super.alpha(new StandardIntegrityException(-9, exc));
        }
    }
}
