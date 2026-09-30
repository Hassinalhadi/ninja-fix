package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Ye8 {

    /* renamed from: J, reason: collision with root package name */
    public final Integer f10001J;
    public final Integer PqK;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f10002W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10003b;

    /* renamed from: f9, reason: collision with root package name */
    public final ArrayList f10004f9;
    public final String gmP;
    public final ArrayList sVU;

    public Ye8(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str, Integer num, Integer num2) {
        this.f10003b = arrayList;
        this.f10002W = arrayList2;
        this.f10004f9 = arrayList3;
        this.sVU = arrayList4;
        this.gmP = str;
        this.f10001J = num;
        this.PqK = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ye8)) {
            return false;
        }
        Ye8 ye8 = (Ye8) obj;
        if (Intrinsics.areEqual(this.f10003b, ye8.f10003b) && Intrinsics.areEqual(this.f10002W, ye8.f10002W) && Intrinsics.areEqual(this.f10004f9, ye8.f10004f9) && Intrinsics.areEqual(this.sVU, ye8.sVU) && Intrinsics.areEqual(this.gmP, ye8.gmP) && Intrinsics.areEqual(this.f10001J, ye8.f10001J) && Intrinsics.areEqual(this.PqK, ye8.PqK)) {
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
        ArrayList arrayList = this.f10003b;
        int i4 = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i5 = hashCode * 31;
        ArrayList arrayList2 = this.f10002W;
        if (arrayList2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arrayList2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        ArrayList arrayList3 = this.f10004f9;
        if (arrayList3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arrayList3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        ArrayList arrayList4 = this.sVU;
        if (arrayList4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = arrayList4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str = this.gmP;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Integer num = this.f10001J;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Integer num2 = this.PqK;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        return i14 + i4;
    }
}
