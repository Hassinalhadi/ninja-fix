package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class EG7 {

    /* renamed from: J, reason: collision with root package name */
    public final Xh f8596J;
    public final String PqK;

    /* renamed from: W, reason: collision with root package name */
    public final zm f8597W;

    /* renamed from: b, reason: collision with root package name */
    public final k7Q f8598b;

    /* renamed from: f9, reason: collision with root package name */
    public final ArrayList f8599f9;
    public final ArrayList gmP;
    public final JCV sVU;

    public EG7(k7Q k7q, zm zmVar, ArrayList arrayList, JCV jcv, ArrayList arrayList2, Xh xh, String str) {
        this.f8598b = k7q;
        this.f8597W = zmVar;
        this.f8599f9 = arrayList;
        this.sVU = jcv;
        this.gmP = arrayList2;
        this.f8596J = xh;
        this.PqK = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EG7)) {
            return false;
        }
        EG7 eg7 = (EG7) obj;
        if (Intrinsics.areEqual(this.f8598b, eg7.f8598b) && Intrinsics.areEqual(this.f8597W, eg7.f8597W) && Intrinsics.areEqual(this.f8599f9, eg7.f8599f9) && Intrinsics.areEqual(this.sVU, eg7.sVU) && Intrinsics.areEqual(this.gmP, eg7.gmP) && Intrinsics.areEqual(this.f8596J, eg7.f8596J) && Intrinsics.areEqual(this.PqK, eg7.PqK)) {
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
        k7Q k7q = this.f8598b;
        int i4 = 0;
        if (k7q == null) {
            hashCode = 0;
        } else {
            hashCode = k7q.hashCode();
        }
        int i5 = hashCode * 31;
        zm zmVar = this.f8597W;
        if (zmVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = zmVar.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        ArrayList arrayList = this.f8599f9;
        if (arrayList == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arrayList.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        JCV jcv = this.sVU;
        if (jcv == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = jcv.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        ArrayList arrayList2 = this.gmP;
        if (arrayList2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = arrayList2.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Xh xh = this.f8596J;
        if (xh == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = xh.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str = this.PqK;
        if (str != null) {
            i4 = str.hashCode();
        }
        return i14 + i4;
    }
}
