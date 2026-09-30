package com.incognia.internal;

import ao.ad;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uAV extends Oe5 {

    /* renamed from: W, reason: collision with root package name */
    public final String f11447W;

    public uAV(String str) {
        super(ad.gray("Data Exception: producer for ", str, " is busy"));
        this.f11447W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uAV) && Intrinsics.areEqual(this.f11447W, ((uAV) obj).f11447W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11447W.hashCode();
    }
}
