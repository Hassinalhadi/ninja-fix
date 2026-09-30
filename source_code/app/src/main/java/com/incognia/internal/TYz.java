package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TYz extends Oe5 {

    /* renamed from: W, reason: collision with root package name */
    public final String f9678W;

    public TYz(String str) {
        super(av.q.echo("Data Exception: no new data available for ", str));
        this.f9678W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TYz) && Intrinsics.areEqual(this.f9678W, ((TYz) obj).f9678W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9678W.hashCode();
    }
}
