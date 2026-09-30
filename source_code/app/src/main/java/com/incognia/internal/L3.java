package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class L3 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f9040b;

    public L3(Throwable th) {
        super("Reason: SDK Internal error");
        this.f9040b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L3) && Intrinsics.areEqual(this.f9040b, ((L3) obj).f9040b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f9040b;
    }

    public final int hashCode() {
        Throwable th = this.f9040b;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }
}
