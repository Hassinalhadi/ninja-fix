package com.incognia.internal;

import Q0.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class HOf extends cQM {

    /* renamed from: f9, reason: collision with root package name */
    public final String f8840f9;
    public final Throwable sVU;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HOf(String str, Throwable th) {
        super(r0.toString(), th, 1);
        String str2;
        StringBuilder victor = c.victor("Network Exception: Unknown error URL: ", str, " Cause: ");
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = null;
        }
        victor.append(str2);
        this.f8840f9 = str;
        this.sVU = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HOf)) {
            return false;
        }
        HOf hOf = (HOf) obj;
        if (Intrinsics.areEqual(this.f8840f9, hOf.f8840f9) && Intrinsics.areEqual(this.sVU, hOf.sVU)) {
            return true;
        }
        return false;
    }

    @Override // com.incognia.internal.cQM, java.lang.Throwable
    public final Throwable getCause() {
        return this.sVU;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f8840f9.hashCode() * 31;
        Throwable th = this.sVU;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
