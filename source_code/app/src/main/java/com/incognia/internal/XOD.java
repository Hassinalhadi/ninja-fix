package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class XOD {

    /* renamed from: J, reason: collision with root package name */
    public final List f9916J;
    public final List PqK;

    /* renamed from: R, reason: collision with root package name */
    public final List f9917R;

    /* renamed from: V, reason: collision with root package name */
    public final List f9918V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9919W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9920b;

    /* renamed from: f9, reason: collision with root package name */
    public final ArrayList f9921f9;
    public final ArrayList gmP;
    public final Boolean olU;
    public final Boolean sVU;

    public XOD(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bool, ArrayList arrayList4, List list, List list2, List list3, Boolean bool2, List list4) {
        this.f9920b = arrayList;
        this.f9919W = arrayList2;
        this.f9921f9 = arrayList3;
        this.sVU = bool;
        this.gmP = arrayList4;
        this.f9916J = list;
        this.PqK = list2;
        this.f9918V = list3;
        this.olU = bool2;
        this.f9917R = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XOD)) {
            return false;
        }
        XOD xod = (XOD) obj;
        if (Intrinsics.areEqual(this.f9920b, xod.f9920b) && Intrinsics.areEqual(this.f9919W, xod.f9919W) && Intrinsics.areEqual(this.f9921f9, xod.f9921f9) && Intrinsics.areEqual(this.sVU, xod.sVU) && Intrinsics.areEqual(this.gmP, xod.gmP) && Intrinsics.areEqual(this.f9916J, xod.f9916J) && Intrinsics.areEqual(this.PqK, xod.PqK) && Intrinsics.areEqual(this.f9918V, xod.f9918V) && Intrinsics.areEqual(this.olU, xod.olU) && Intrinsics.areEqual(this.f9917R, xod.f9917R)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        ArrayList arrayList = this.f9920b;
        int i4 = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i5 = hashCode * 31;
        ArrayList arrayList2 = this.f9919W;
        if (arrayList2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arrayList2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        ArrayList arrayList3 = this.f9921f9;
        if (arrayList3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arrayList3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.sVU;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int hashCode9 = (this.gmP.hashCode() + ((i11 + hashCode4) * 31)) * 31;
        List list = this.f9916J;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i12 = (hashCode9 + hashCode5) * 31;
        List list2 = this.PqK;
        if (list2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list2.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        List list3 = this.f9918V;
        if (list3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list3.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        Boolean bool2 = this.olU;
        if (bool2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool2.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        List list4 = this.f9917R;
        if (list4 != null) {
            i4 = list4.hashCode();
        }
        return i15 + i4;
    }
}
