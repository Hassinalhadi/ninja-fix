package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class e extends g7.g {
    public final RectF romeo;

    public e(g7.m mVar, RectF rectF) {
        super(mVar);
        this.romeo = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.textfield.f, g7.i, android.graphics.drawable.Drawable] */
    @Override // g7.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? iVar = new g7.i(this);
        iVar.A = this;
        iVar.invalidateSelf();
        return iVar;
    }

    public e(e eVar) {
        super(eVar);
        this.romeo = eVar.romeo;
    }
}
