package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kx3 extends Oe5 {

    /* renamed from: W, reason: collision with root package name */
    public final String f10791W;

    public kx3(String str) {
        super(av.q.echo("Data Exception: error obtaining ", str));
        this.f10791W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kx3) && Intrinsics.areEqual(this.f10791W, ((kx3) obj).f10791W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10791W.hashCode();
    }
}
