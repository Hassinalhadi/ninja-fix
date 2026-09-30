package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class KcS extends Oe5 {

    /* renamed from: W, reason: collision with root package name */
    public final String f9013W;

    public KcS(String str) {
        super(av.q.echo("Data Exception: SDK stopped. Failure collecting ", str));
        this.f9013W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof KcS) && Intrinsics.areEqual(this.f9013W, ((KcS) obj).f9013W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9013W.hashCode();
    }
}
