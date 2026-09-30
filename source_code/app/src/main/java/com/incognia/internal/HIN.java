package com.incognia.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class HIN {

    /* renamed from: W, reason: collision with root package name */
    public final LinkedHashSet f8830W;

    /* renamed from: b, reason: collision with root package name */
    public final Set f8831b;

    /* renamed from: f9, reason: collision with root package name */
    public final LinkedHashSet f8832f9;
    public final NEA sVU;

    public HIN(Set set, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, NEA nea) {
        this.f8831b = set;
        this.f8830W = linkedHashSet;
        this.f8832f9 = linkedHashSet2;
        this.sVU = nea;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HIN)) {
            return false;
        }
        HIN hin = (HIN) obj;
        if (Intrinsics.areEqual(this.f8831b, hin.f8831b) && Intrinsics.areEqual(this.f8830W, hin.f8830W) && Intrinsics.areEqual(this.f8832f9, hin.f8832f9) && Intrinsics.areEqual(this.sVU, hin.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.sVU.hashCode() + ((this.f8832f9.hashCode() + ((this.f8830W.hashCode() + (this.f8831b.hashCode() * 31)) * 31)) * 31);
    }
}
