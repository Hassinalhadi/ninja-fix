package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vY {

    /* renamed from: W, reason: collision with root package name */
    public final boolean f11552W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11553b;

    /* renamed from: f9, reason: collision with root package name */
    public final boolean f11554f9;
    public final boolean gmP;
    public final boolean sVU;

    public vY(String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.f11553b = str;
        this.f11552W = z2;
        this.f11554f9 = z10;
        this.sVU = z11;
        this.gmP = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vY)) {
            return false;
        }
        vY vYVar = (vY) obj;
        if (Intrinsics.areEqual(this.f11553b, vYVar.f11553b) && this.f11552W == vYVar.f11552W && this.f11554f9 == vYVar.f11554f9 && this.sVU == vYVar.sVU && this.gmP == vYVar.gmP) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.f11553b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = hashCode * 31;
        boolean z2 = this.f11552W;
        int i5 = 1;
        int i10 = z2;
        if (z2 != 0) {
            i10 = 1;
        }
        int i11 = (i4 + i10) * 31;
        boolean z10 = this.f11554f9;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z11 = this.sVU;
        int i14 = z11;
        if (z11 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z12 = this.gmP;
        if (!z12) {
            i5 = z12 ? 1 : 0;
        }
        return i15 + i5;
    }

    public /* synthetic */ vY(String str, boolean z2, boolean z10, boolean z11, int i4) {
        this(str, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? true : z10, (i4 & 8) != 0 ? false : z11, false);
    }
}
