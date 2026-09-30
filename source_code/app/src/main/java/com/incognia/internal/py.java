package com.incognia.internal;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class py {

    /* renamed from: W, reason: collision with root package name */
    public final HashMap f11114W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11115b;

    public py(ArrayList arrayList, HashMap hashMap) {
        this.f11115b = arrayList;
        this.f11114W = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        if (Intrinsics.areEqual(this.f11115b, pyVar.f11115b) && Intrinsics.areEqual(this.f11114W, pyVar.f11114W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f11115b.hashCode() * 31;
        HashMap hashMap = this.f11114W;
        if (hashMap == null) {
            hashCode = 0;
        } else {
            hashCode = hashMap.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
