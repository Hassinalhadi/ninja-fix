package com.incognia.internal;

import h9.aq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public final class yC1 {

    /* renamed from: W, reason: collision with root package name */
    public static final String f11844W = (String) wGk.Yq.getValue();

    /* renamed from: b, reason: collision with root package name */
    public final MDG f11845b;

    public yC1(MDG mdg) {
        this.f11845b = mdg;
    }

    public static final void b(y6 y6Var, boolean z2, List list) {
        if (y6Var != null) {
            y6Var.b(z2);
        }
    }

    public final void b(List list, rCM rcm, y6 y6Var) {
        int collectionSizeOrDefault;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PIe pIe = (PIe) it.next();
            arrayList.add(new XD(f11844W, vkA.b(pIe), pIe.f9412b, pIe.f9409W));
        }
        this.f11845b.b(arrayList, rcm, new aq(3, y6Var));
    }
}
