package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xkS implements L46 {

    /* renamed from: W, reason: collision with root package name */
    public final oBS f11812W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11813b;

    public xkS(ArrayList arrayList, oBS obs) {
        this.f11813b = arrayList;
        this.f11812W = obs;
    }

    public final boolean b(String str) {
        ArrayList arrayList = this.f11813b;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (Intrinsics.areEqual(((sD) obj).f11281b, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkS)) {
            return false;
        }
        xkS xks = (xkS) obj;
        if (Intrinsics.areEqual(this.f11813b, xks.f11813b) && Intrinsics.areEqual(this.f11812W, xks.f11812W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11812W.hashCode() + (this.f11813b.hashCode() * 31);
    }
}
