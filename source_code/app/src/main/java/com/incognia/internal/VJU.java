package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class VJU {

    /* renamed from: J, reason: collision with root package name */
    public final String f9768J;
    public final List PqK;

    /* renamed from: W, reason: collision with root package name */
    public final Long f9769W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f9770b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f9771f9;
    public final int gmP;
    public final String sVU;

    public VJU(Long l10, Long l11, Long l12, String str, int i4, String str2, List list) {
        this.f9770b = l10;
        this.f9769W = l11;
        this.f9771f9 = l12;
        this.sVU = str;
        this.gmP = i4;
        this.f9768J = str2;
        this.PqK = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VJU)) {
            return false;
        }
        VJU vju = (VJU) obj;
        if (Intrinsics.areEqual(this.f9770b, vju.f9770b) && Intrinsics.areEqual(this.f9769W, vju.f9769W) && Intrinsics.areEqual(this.f9771f9, vju.f9771f9) && Intrinsics.areEqual(this.sVU, vju.sVU) && this.gmP == vju.gmP && Intrinsics.areEqual(this.f9768J, vju.f9768J) && Intrinsics.areEqual(this.PqK, vju.PqK)) {
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
        Long l10 = this.f9770b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        Long l11 = this.f9769W;
        if (l11 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l11.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Long l12 = this.f9771f9;
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
        int b2 = ZnG.b(this.gmP, (i11 + hashCode4) * 31, 31);
        String str2 = this.f9768J;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i12 = (b2 + hashCode5) * 31;
        List list = this.PqK;
        if (list != null) {
            i4 = list.hashCode();
        }
        return i12 + i4;
    }

    public /* synthetic */ VJU(Long l10, Long l11, Long l12, int i4, String str, List list, int i5) {
        this((i5 & 1) != 0 ? null : l10, (i5 & 2) != 0 ? null : l11, (i5 & 4) != 0 ? null : l12, (String) null, i4, str, (i5 & 64) != 0 ? null : list);
    }
}
