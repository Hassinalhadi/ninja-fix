package com.google.android.material.internal;

import android.view.View;
import s1.C2569b;
import s1.C2576i;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class h extends C2569b {
    public final /* synthetic */ int delta;
    public final /* synthetic */ boolean echo;
    public final /* synthetic */ i foxtrot;

    public h(i iVar, int i4, boolean z2) {
        this.foxtrot = iVar;
        this.delta = i4;
        this.echo = z2;
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
        int i4 = this.delta;
        int i5 = 0;
        int i10 = i4;
        while (true) {
            i iVar = this.foxtrot;
            if (i5 < i4) {
                q qVar = iVar.delta;
                if (qVar.teal.getItemViewType(i5) == 2 || qVar.teal.getItemViewType(i5) == 3) {
                    i10--;
                }
                i5++;
            } else {
                iVar.getClass();
                c2952d.lima(C2576i.hotel(i10, 1, 1, 1, this.echo, view.isSelected()));
                return;
            }
        }
    }
}
