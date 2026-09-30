package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.h0;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class n extends h0 {
    public final /* synthetic */ q foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.foxtrot = qVar;
    }

    @Override // androidx.recyclerview.widget.h0, s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        super.delta(view, c2952d);
        i iVar = this.foxtrot.teal;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            q qVar = iVar.delta;
            if (i4 < qVar.teal.alpha.size()) {
                int itemViewType = qVar.teal.getItemViewType(i4);
                if (itemViewType == 0 || itemViewType == 1) {
                    i5++;
                }
                i4++;
            } else {
                c2952d.alpha.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i5, 1, false));
                return;
            }
        }
    }
}
