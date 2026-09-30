package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import s1.I;
import s1.a0;

/* loaded from: classes2.dex */
public final class n extends Pf.g {
    public final View red;
    public int silver;
    public int teal;
    public final int[] white;

    public n(View view) {
        super(0);
        this.white = new int[2];
        this.red = view;
    }

    @Override // Pf.g
    public final void delta(I i4) {
        this.red.setTranslationY(0.0f);
    }

    @Override // Pf.g
    public final void echo() {
        View view = this.red;
        int[] iArr = this.white;
        view.getLocationOnScreen(iArr);
        this.silver = iArr[1];
    }

    @Override // Pf.g
    public final a0 foxtrot(a0 a0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((I) it.next()).alpha.delta() & 8) != 0) {
                this.red.setTranslationY(M6.a.charlie(this.teal, 0, r0.alpha.charlie()));
                break;
            }
        }
        return a0Var;
    }

    @Override // Pf.g
    public final com.google.android.play.core.integrity.k golf(I i4, com.google.android.play.core.integrity.k kVar) {
        View view = this.red;
        int[] iArr = this.white;
        view.getLocationOnScreen(iArr);
        int i5 = this.silver - iArr[1];
        this.teal = i5;
        view.setTranslationY(i5);
        return kVar;
    }
}
