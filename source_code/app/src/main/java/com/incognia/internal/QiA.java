package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class QiA {

    /* renamed from: b, reason: collision with root package name */
    public final Vl f9516b;

    public QiA(Vl vl, Zmd zmd) {
        this.f9516b = vl;
    }

    public final ArrayList b() {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        List<b2> b2 = Zmd.b();
        ArrayList arrayList = new ArrayList();
        for (b2 b2Var : b2) {
            List list = b2Var.f10134W;
            hW4 hw4 = null;
            if (list != null) {
                strArr = (String[]) list.toArray(new String[0]);
            } else {
                strArr = null;
            }
            List list2 = b2Var.f10136f9;
            if (list2 != null) {
                strArr2 = (String[]) list2.toArray(new String[0]);
            } else {
                strArr2 = null;
            }
            List list3 = b2Var.sVU;
            if (list3 != null) {
                strArr3 = (String[]) list3.toArray(new String[0]);
            } else {
                strArr3 = null;
            }
            String b4 = this.f9516b.b(strArr, (String[]) null);
            String b6 = this.f9516b.b(strArr2, strArr3);
            if (!Intrinsics.areEqual(b4, b6)) {
                hw4 = new hW4(b2Var.f10135b, b4, b6);
            }
            if (hw4 != null) {
                arrayList.add(hw4);
            }
        }
        return arrayList;
    }
}
