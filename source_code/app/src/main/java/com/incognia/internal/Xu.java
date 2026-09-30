package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Xu extends cQM {

    /* renamed from: f9, reason: collision with root package name */
    public final String f9964f9;

    public Xu(String str) {
        super(av.q.echo("Network Exception: Network unavailable URL: ", str), null, 9);
        this.f9964f9 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Xu) && Intrinsics.areEqual(this.f9964f9, ((Xu) obj).f9964f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9964f9.hashCode();
    }
}
