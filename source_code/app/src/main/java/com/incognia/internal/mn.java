package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mn extends Oe5 {

    /* renamed from: W, reason: collision with root package name */
    public final String f10920W;

    public mn(String str) {
        super(av.q.echo("Data Exception: missing permission to collect ", str));
        this.f10920W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mn) && Intrinsics.areEqual(this.f10920W, ((mn) obj).f10920W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10920W.hashCode();
    }
}
