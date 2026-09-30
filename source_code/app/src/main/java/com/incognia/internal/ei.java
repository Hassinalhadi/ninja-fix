package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ei extends Oe5 {

    /* renamed from: W, reason: collision with root package name */
    public final String f10384W;

    public ei(String str) {
        super(av.q.echo("Data Exception: timeout obtaining ", str));
        this.f10384W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ei) && Intrinsics.areEqual(this.f10384W, ((ei) obj).f10384W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10384W.hashCode();
    }
}
