package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vh {
    public static final String sVU = (String) wGk.WJ.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final String f11563W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11564b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11565f9 = LazyKt.lazy(new HZV(this));

    public vh(String str, String str2) {
        this.f11564b = str;
        this.f11563W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return Intrinsics.areEqual(this.f11564b, vhVar.f11564b) && Intrinsics.areEqual(this.f11563W, vhVar.f11563W);
    }

    public final int hashCode() {
        return this.f11563W.hashCode() + (this.f11564b.hashCode() * 31);
    }
}
