package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mKN extends cQM {

    /* renamed from: f9, reason: collision with root package name */
    public final int f10899f9;
    public final Throwable gmP;
    public final String sVU;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mKN(int i4, String str, Throwable th, int i5) {
        super(r7.toString(), th);
        i4 = (i5 & 1) != 0 ? 0 : i4;
        th = (i5 & 4) != 0 ? null : th;
        StringBuilder green = androidx.appcompat.widget.P0.green("Network Exception: URL: ", str, " Status: ", " Cause: ", i4);
        green.append(th != null ? th.getMessage() : null);
        this.f10899f9 = i4;
        this.sVU = str;
        this.gmP = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mKN)) {
            return false;
        }
        mKN mkn = (mKN) obj;
        if (this.f10899f9 == mkn.f10899f9 && Intrinsics.areEqual(this.sVU, mkn.sVU) && Intrinsics.areEqual(this.gmP, mkn.gmP)) {
            return true;
        }
        return false;
    }

    @Override // com.incognia.internal.cQM, java.lang.Throwable
    public final Throwable getCause() {
        return this.gmP;
    }

    public final int hashCode() {
        int hashCode;
        int b2 = VpS.b(this.sVU, this.f10899f9 * 31, 31);
        Throwable th = this.gmP;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return b2 + hashCode;
    }
}
