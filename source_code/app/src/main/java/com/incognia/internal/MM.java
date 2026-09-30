package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class MM {

    /* renamed from: J, reason: collision with root package name */
    public final String f9113J;
    public final String PqK;

    /* renamed from: V, reason: collision with root package name */
    public final Integer f9114V;

    /* renamed from: W, reason: collision with root package name */
    public final int f9115W;

    /* renamed from: b, reason: collision with root package name */
    public final int f9116b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f9117f9;
    public final boolean gmP;
    public final Boolean olU;
    public final boolean sVU;

    public MM(int i4, int i5, long j5, boolean z2, boolean z10, String str, String str2, Integer num, Boolean bool) {
        this.f9116b = i4;
        this.f9115W = i5;
        this.f9117f9 = j5;
        this.sVU = z2;
        this.gmP = z10;
        this.f9113J = str;
        this.PqK = str2;
        this.f9114V = num;
        this.olU = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MM)) {
            return false;
        }
        MM mm = (MM) obj;
        if (this.f9116b == mm.f9116b && this.f9115W == mm.f9115W && this.f9117f9 == mm.f9117f9 && this.sVU == mm.sVU && this.gmP == mm.gmP && Intrinsics.areEqual(this.f9113J, mm.f9113J) && Intrinsics.areEqual(this.PqK, mm.PqK) && Intrinsics.areEqual(this.f9114V, mm.f9114V) && Intrinsics.areEqual(this.olU, mm.olU)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int b2 = lci.b(this.f9117f9, ZnG.b(this.f9115W, this.f9116b * 31, 31), 31);
        boolean z2 = this.sVU;
        int i4 = 1;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (b2 + i5) * 31;
        boolean z10 = this.gmP;
        if (!z10) {
            i4 = z10 ? 1 : 0;
        }
        int i11 = (i10 + i4) * 31;
        String str = this.f9113J;
        int i12 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 + hashCode) * 31;
        String str2 = this.PqK;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i14 = (i13 + hashCode2) * 31;
        Integer num = this.f9114V;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i15 = (i14 + hashCode3) * 31;
        Boolean bool = this.olU;
        if (bool != null) {
            i12 = bool.hashCode();
        }
        return i15 + i12;
    }
}
