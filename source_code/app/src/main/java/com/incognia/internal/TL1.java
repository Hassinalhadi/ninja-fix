package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TL1 {

    /* renamed from: J, reason: collision with root package name */
    public final String f9666J;
    public final Long PqK;

    /* renamed from: V, reason: collision with root package name */
    public final String f9667V;

    /* renamed from: W, reason: collision with root package name */
    public final Long f9668W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f9669b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f9670f9;
    public final Long gmP;
    public final String sVU;

    public TL1(Long l10, Long l11, Long l12, String str, Long l13, String str2, Long l14, String str3) {
        this.f9669b = l10;
        this.f9668W = l11;
        this.f9670f9 = l12;
        this.sVU = str;
        this.gmP = l13;
        this.f9666J = str2;
        this.PqK = l14;
        this.f9667V = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TL1)) {
            return false;
        }
        TL1 tl1 = (TL1) obj;
        if (Intrinsics.areEqual(this.f9669b, tl1.f9669b) && Intrinsics.areEqual(this.f9668W, tl1.f9668W) && Intrinsics.areEqual(this.f9670f9, tl1.f9670f9) && Intrinsics.areEqual(this.sVU, tl1.sVU) && Intrinsics.areEqual(this.gmP, tl1.gmP) && Intrinsics.areEqual(this.f9666J, tl1.f9666J) && Intrinsics.areEqual(this.PqK, tl1.PqK) && Intrinsics.areEqual(this.f9667V, tl1.f9667V)) {
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
        Long l10 = this.f9669b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        Long l11 = this.f9668W;
        if (l11 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l11.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Long l12 = this.f9670f9;
        if (l12 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l12.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str = this.sVU;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l13 = this.gmP;
        if (l13 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l13.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str2 = this.f9666J;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Long l14 = this.PqK;
        if (l14 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l14.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str3 = this.f9667V;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i15 + i4;
    }
}
