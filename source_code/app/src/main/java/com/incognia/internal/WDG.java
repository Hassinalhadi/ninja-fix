package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class WDG {

    /* renamed from: W, reason: collision with root package name */
    public final long f9839W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9840b;
    public final v73 gmP;

    /* renamed from: f9, reason: collision with root package name */
    public Long f9841f9 = null;
    public Long sVU = null;

    public WDG(String str, long j5, v73 v73Var) {
        this.f9840b = str;
        this.f9839W = j5;
        this.gmP = v73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WDG)) {
            return false;
        }
        WDG wdg = (WDG) obj;
        if (Intrinsics.areEqual(this.f9840b, wdg.f9840b) && this.f9839W == wdg.f9839W && Intrinsics.areEqual(this.f9841f9, wdg.f9841f9) && Intrinsics.areEqual(this.sVU, wdg.sVU) && Intrinsics.areEqual(this.gmP, wdg.gmP)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b2 = lci.b(this.f9839W, this.f9840b.hashCode() * 31, 31);
        Long l10 = this.f9841f9;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        Long l11 = this.sVU;
        if (l11 != null) {
            i4 = l11.hashCode();
        }
        return this.gmP.hashCode() + ((i5 + i4) * 31);
    }
}
