package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class RUd {
    public final Long DOu;
    public final Long IB;

    /* renamed from: J, reason: collision with root package name */
    public final Long f9543J;
    public final Long PqK;

    /* renamed from: R, reason: collision with root package name */
    public final Long f9544R;

    /* renamed from: V, reason: collision with root package name */
    public final Long f9545V;

    /* renamed from: W, reason: collision with root package name */
    public final Long f9546W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f9547b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f9548f9;
    public final Long gmP;
    public final Long olU;
    public final Long sVU;

    public RUd(Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l20, Long l21) {
        this.f9547b = l10;
        this.f9546W = l11;
        this.f9548f9 = l12;
        this.sVU = l13;
        this.gmP = l14;
        this.f9543J = l15;
        this.PqK = l16;
        this.f9545V = l17;
        this.olU = l18;
        this.f9544R = l19;
        this.DOu = l20;
        this.IB = l21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RUd)) {
            return false;
        }
        RUd rUd = (RUd) obj;
        if (Intrinsics.areEqual(this.f9547b, rUd.f9547b) && Intrinsics.areEqual(this.f9546W, rUd.f9546W) && Intrinsics.areEqual(this.f9548f9, rUd.f9548f9) && Intrinsics.areEqual(this.sVU, rUd.sVU) && Intrinsics.areEqual(this.gmP, rUd.gmP) && Intrinsics.areEqual(this.f9543J, rUd.f9543J) && Intrinsics.areEqual(this.PqK, rUd.PqK) && Intrinsics.areEqual(this.f9545V, rUd.f9545V) && Intrinsics.areEqual(this.olU, rUd.olU) && Intrinsics.areEqual(this.f9544R, rUd.f9544R) && Intrinsics.areEqual(this.DOu, rUd.DOu) && Intrinsics.areEqual(this.IB, rUd.IB)) {
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
        int hashCode9;
        int hashCode10;
        int hashCode11;
        Long l10 = this.f9547b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        Long l11 = this.f9546W;
        if (l11 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l11.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Long l12 = this.f9548f9;
        if (l12 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l12.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Long l13 = this.sVU;
        if (l13 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l13.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l14 = this.gmP;
        if (l14 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l14.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Long l15 = this.f9543J;
        if (l15 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l15.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Long l16 = this.PqK;
        if (l16 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l16.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Long l17 = this.f9545V;
        if (l17 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l17.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        Long l18 = this.olU;
        if (l18 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l18.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Long l19 = this.f9544R;
        if (l19 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l19.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Long l20 = this.DOu;
        if (l20 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l20.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Long l21 = this.IB;
        if (l21 != null) {
            i4 = l21.hashCode();
        }
        return i19 + i4;
    }
}
