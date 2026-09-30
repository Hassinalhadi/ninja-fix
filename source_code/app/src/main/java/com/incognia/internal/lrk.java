package com.incognia.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class lrk {

    /* renamed from: W, reason: collision with root package name */
    public final boolean f10861W;

    /* renamed from: b, reason: collision with root package name */
    public final int f10862b;
    public static final String olU = (String) wGk.Dm.getValue();

    /* renamed from: R, reason: collision with root package name */
    public static final String f10855R = (String) wGk.xMR.getValue();
    public static final String DOu = (String) wGk.SH2.getValue();
    public static final String IB = (String) wGk.vj.getValue();
    public static final String Qs = (String) wGk.uH.getValue();

    /* renamed from: E, reason: collision with root package name */
    public static final String f10851E = (String) wGk.VOw.getValue();

    /* renamed from: n9, reason: collision with root package name */
    public static final String f10858n9 = (String) wGk.zD.getValue();

    /* renamed from: Y, reason: collision with root package name */
    public static final String f10856Y = (String) wGk.Bs.getValue();

    /* renamed from: P, reason: collision with root package name */
    public static final String f10854P = (String) wGk.g8e.getValue();

    /* renamed from: L, reason: collision with root package name */
    public static final String f10853L = (String) wGk.Up.getValue();
    public static final String FL = (String) wGk.X76.getValue();

    /* renamed from: ar, reason: collision with root package name */
    public static final String f10857ar = (String) wGk.Ay.getValue();
    public static final String a2F = (String) wGk.eIQ.getValue();

    /* renamed from: H, reason: collision with root package name */
    public static final String f10852H = (String) wGk.fZf.getValue();
    public static final String H02 = (String) wGk.GwC.getValue();
    public static final String jgi = (String) wGk.fDo.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public final Regex f10863f9 = new Regex(olU);
    public final Regex sVU = new Regex(f10855R);
    public final Regex gmP = new Regex(DOu);

    /* renamed from: J, reason: collision with root package name */
    public final Regex f10859J = new Regex(IB);
    public final Regex PqK = new Regex(Qs);

    /* renamed from: V, reason: collision with root package name */
    public final Regex f10860V = new Regex(f10851E);

    public lrk(int i4, boolean z2) {
        this.f10862b = i4;
        this.f10861W = z2;
    }

    public final List b(ArrayList arrayList) {
        Object obj;
        RuF ruF;
        RuF ruF2;
        RuF ruF3;
        RuF ruF4;
        List list;
        List list2;
        if (this.f10862b <= 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                obj = arrayList.get(i5);
                i5++;
                if (Intrinsics.areEqual(((ECc) obj).olU, Q9.f9486f9)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ECc eCc = (ECc) obj;
        if (eCc != null) {
            arrayList2.add(eCc);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ECc eCc2 = (ECc) obj2;
            if (Intrinsics.areEqual(eCc2.olU, Kj1.f9019f9) && (list2 = eCc2.f8590V) != null && (!list2.isEmpty())) {
                arrayList3.add(obj2);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ECc eCc3 = (ECc) obj3;
            if (!Intrinsics.areEqual(eCc3.olU, Kj1.f9019f9) && (list = eCc3.f8590V) != null && (!list.isEmpty())) {
                arrayList4.add(obj3);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList.size();
        int i12 = 0;
        while (i12 < size4) {
            Object obj4 = arrayList.get(i12);
            i12++;
            ECc eCc4 = (ECc) obj4;
            if (Intrinsics.areEqual(eCc4.olU, Kj1.f9019f9) && (((ruF3 = eCc4.PqK) != null && ruF3.b()) || ((ruF4 = eCc4.PqK) != null && Intrinsics.areEqual(ruF4, XR.f9926f9)))) {
                arrayList5.add(obj4);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList5);
        ArrayList arrayList6 = new ArrayList();
        int size5 = arrayList.size();
        int i13 = 0;
        while (i13 < size5) {
            Object obj5 = arrayList.get(i13);
            i13++;
            ECc eCc5 = (ECc) obj5;
            if (!Intrinsics.areEqual(eCc5.olU, Kj1.f9019f9) && (((ruF = eCc5.PqK) != null && ruF.b()) || ((ruF2 = eCc5.PqK) != null && Intrinsics.areEqual(ruF2, XR.f9926f9)))) {
                arrayList6.add(obj5);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList6);
        HashSet hashSet = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        int size6 = arrayList2.size();
        while (i4 < size6) {
            Object obj6 = arrayList2.get(i4);
            i4++;
            if (hashSet.add(((ECc) obj6).sVU)) {
                arrayList7.add(obj6);
            }
        }
        return CollectionsKt.r(arrayList7, this.f10862b);
    }
}
