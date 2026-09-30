package com.google.android.material.internal;

import android.view.SubMenu;
import ao.ae;

/* loaded from: classes2.dex */
public final class f extends ao.l {
    @Override // ao.l, android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i10, CharSequence charSequence) {
        ao.n alpha = alpha(i4, i5, i10, charSequence);
        ae aeVar = new ae(this.alpha, this, alpha);
        alpha.f3225h = aeVar;
        aeVar.setHeaderTitle(alpha.teal);
        return aeVar;
    }
}
