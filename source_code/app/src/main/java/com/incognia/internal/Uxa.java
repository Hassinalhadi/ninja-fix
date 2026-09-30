package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Uxa {

    /* renamed from: J, reason: collision with root package name */
    public final ipD f9741J;

    /* renamed from: W, reason: collision with root package name */
    public final String f9742W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f9743b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f9744f9;
    public final Long gmP;
    public final ArrayList sVU;

    public Uxa(Long l10, String str, Long l11, ArrayList arrayList, Long l12, ipD ipd) {
        this.f9743b = l10;
        this.f9742W = str;
        this.f9744f9 = l11;
        this.sVU = arrayList;
        this.gmP = l12;
        this.f9741J = ipd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uxa)) {
            return false;
        }
        Uxa uxa = (Uxa) obj;
        if (Intrinsics.areEqual(this.f9743b, uxa.f9743b) && Intrinsics.areEqual(this.f9742W, uxa.f9742W) && Intrinsics.areEqual(this.f9744f9, uxa.f9744f9) && Intrinsics.areEqual(this.sVU, uxa.sVU) && Intrinsics.areEqual(this.gmP, uxa.gmP) && Intrinsics.areEqual(this.f9741J, uxa.f9741J)) {
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
        Long l10 = this.f9743b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        String str = this.f9742W;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Long l11 = this.f9744f9;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        ArrayList arrayList = this.sVU;
        if (arrayList == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = arrayList.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l12 = this.gmP;
        if (l12 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l12.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        ipD ipd = this.f9741J;
        if (ipd != null) {
            i4 = ipd.hashCode();
        }
        return i13 + i4;
    }
}
