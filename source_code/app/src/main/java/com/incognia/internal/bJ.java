package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bJ extends Oe5 {

    /* renamed from: W, reason: collision with root package name */
    public final String f10169W;

    public bJ(String str) {
        super(av.q.echo("Data Exception: collection disabled for ", str));
        this.f10169W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bJ) && Intrinsics.areEqual(this.f10169W, ((bJ) obj).f10169W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10169W.hashCode();
    }
}
