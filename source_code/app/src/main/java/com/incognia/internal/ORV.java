package com.incognia.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ORV {

    /* renamed from: W, reason: collision with root package name */
    public final List f9306W;

    /* renamed from: b, reason: collision with root package name */
    public final List f9307b;

    public ORV(List list, List list2) {
        this.f9307b = list;
        this.f9306W = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ORV)) {
            return false;
        }
        ORV orv = (ORV) obj;
        if (Intrinsics.areEqual(this.f9307b, orv.f9307b) && Intrinsics.areEqual(this.f9306W, orv.f9306W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9306W.hashCode() + (this.f9307b.hashCode() * 31);
    }

    public ORV() {
        List emptyList = CollectionsKt.emptyList();
        List emptyList2 = CollectionsKt.emptyList();
        this.f9307b = emptyList;
        this.f9306W = emptyList2;
    }
}
