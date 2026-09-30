package com.incognia.internal;

import Q0.c;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Lsw extends cQM {

    /* renamed from: f9, reason: collision with root package name */
    public final String f9088f9;
    public final SocketTimeoutException sVU;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Lsw(String str, SocketTimeoutException socketTimeoutException) {
        super(r0.toString(), socketTimeoutException, 1);
        StringBuilder victor = c.victor("Network Exception: Network timeout URL: ", str, " Cause: ");
        victor.append(socketTimeoutException.getMessage());
        this.f9088f9 = str;
        this.sVU = socketTimeoutException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lsw)) {
            return false;
        }
        Lsw lsw = (Lsw) obj;
        if (Intrinsics.areEqual(this.f9088f9, lsw.f9088f9) && Intrinsics.areEqual(this.sVU, lsw.sVU)) {
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
        int hashCode2 = this.f9088f9.hashCode() * 31;
        SocketTimeoutException socketTimeoutException = this.sVU;
        if (socketTimeoutException == null) {
            hashCode = 0;
        } else {
            hashCode = socketTimeoutException.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
