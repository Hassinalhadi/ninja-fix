package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xf7 {

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f11809W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11810b;

    public xf7(ArrayList arrayList, Boolean bool) {
        this.f11810b = arrayList;
        this.f11809W = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf7)) {
            return false;
        }
        xf7 xf7Var = (xf7) obj;
        if (Intrinsics.areEqual(this.f11810b, xf7Var.f11810b) && Intrinsics.areEqual(this.f11809W, xf7Var.f11809W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11809W.hashCode() + (this.f11810b.hashCode() * 31);
    }
}
