package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class oMh extends Exception {

    /* renamed from: W, reason: collision with root package name */
    public final String f11009W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11010b;

    public oMh() {
        super("Failed to generate request token.");
        this.f11010b = "Failed to generate request token.";
        this.f11009W = "Failed to generate request token.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oMh) && Intrinsics.areEqual(this.f11009W, ((oMh) obj).f11009W)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f11010b;
    }

    public final int hashCode() {
        return this.f11009W.hashCode();
    }
}
