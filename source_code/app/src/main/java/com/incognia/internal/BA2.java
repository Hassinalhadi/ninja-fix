package com.incognia.internal;

import g9.a;
import h9.C1823a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class BA2 {

    /* renamed from: b, reason: collision with root package name */
    public static final pl2 f8399b = new pl2(G6.f8761b, true);

    /* renamed from: W, reason: collision with root package name */
    public static final W6 f8398W = new W6();

    /* renamed from: f9, reason: collision with root package name */
    public static final XKr f8400f9 = new XKr();
    public static final ArrayList sVU = new ArrayList();
    public static final ArrayList gmP = new ArrayList();

    public static final void W(sD sDVar) {
        ArrayList B = CollectionsKt.B(f8400f9.b());
        if (!B.isEmpty()) {
            Iterator it = B.iterator();
            while (it.hasNext()) {
                sD sDVar2 = (sD) it.next();
                if (Intrinsics.areEqual(sDVar2.f11281b, sDVar.f11281b) && sDVar2.f11280W == sDVar.f11280W) {
                    return;
                }
            }
        }
        if (!B.isEmpty()) {
            Iterator it2 = B.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((sD) it2.next()).f11281b, sDVar.f11281b)) {
                    Iterator it3 = B.iterator();
                    while (it3.hasNext()) {
                        sD sDVar3 = (sD) it3.next();
                        if (Intrinsics.areEqual(sDVar3.f11281b, sDVar.f11281b)) {
                            CollectionsKt.d(B, new s8J(sDVar));
                            B.add(new sD(sDVar.f11281b, sDVar.f11280W, sDVar3.f11282f9));
                            XKr xKr = f8400f9;
                            xKr.getClass();
                            QHn.f9492b.b(XKr.f9909W, CollectionsKt.z(B), new h5(xKr));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        B.add(sDVar);
        XKr xKr2 = f8400f9;
        xKr2.getClass();
        QHn.f9492b.b(XKr.f9909W, CollectionsKt.z(B), new h5(xKr2));
    }

    public static void b(sD sDVar) {
        f8399b.b(new a(1, sDVar));
    }

    public static void b() {
        f8399b.b(new C1823a(0));
    }

    public static final void b(Function0 function0) {
        Object obj;
        if (function0 != null) {
            gmP.add(function0);
        }
        f8398W.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        List b2 = f8400f9.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b2) {
            sD sDVar = (sD) obj2;
            Long l10 = sDVar.f11282f9;
            if (l10 != null) {
                long longValue = l10.longValue();
                if (currentTimeMillis > longValue && currentTimeMillis - longValue <= sDVar.f11280W) {
                }
            }
            arrayList.add(obj2);
        }
        if (!arrayList.isEmpty()) {
            ((Q6I) X8.W()).FL.b(new xkS(arrayList, oBS.f11002b));
        }
        List b4 = f8400f9.b();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj3 = arrayList.get(i5);
            i5++;
            sD sDVar2 = (sD) obj3;
            Iterator it = b4.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((sD) obj).f11281b, sDVar2.f11281b)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            sD sDVar3 = (sD) obj;
            if (sDVar3 != null) {
                sDVar3.f11282f9 = Long.valueOf(currentTimeMillis);
            }
        }
        XKr xKr = f8400f9;
        xKr.getClass();
        QHn.f9492b.b(XKr.f9909W, CollectionsKt.z(b4), new h5(xKr));
        ArrayList arrayList2 = sVU;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = gmP;
            int size2 = arrayList3.size();
            while (i4 < size2) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                try {
                    ((Function0) obj4).invoke();
                } catch (Exception unused) {
                }
            }
            gmP.clear();
        }
    }
}
