package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class y6C {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f11831W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11832b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lambda f11833f9;

    /* JADX WARN: Multi-variable type inference failed */
    public y6C(String str, pl2 pl2Var, Function1 function1) {
        this.f11832b = str;
        this.f11831W = pl2Var;
        this.f11833f9 = (Lambda) function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6C)) {
            return false;
        }
        y6C y6c = (y6C) obj;
        if (Intrinsics.areEqual(this.f11832b, y6c.f11832b) && Intrinsics.areEqual(this.f11831W, y6c.f11831W) && Intrinsics.areEqual(this.f11833f9, y6c.f11833f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11833f9.hashCode() + ((this.f11831W.hashCode() + (this.f11832b.hashCode() * 31)) * 31);
    }
}
