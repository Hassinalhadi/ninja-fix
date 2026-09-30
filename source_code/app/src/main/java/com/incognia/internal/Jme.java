package com.incognia.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Jme {

    /* renamed from: W, reason: collision with root package name */
    public final LinkedHashMap f8965W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8966b;

    public Jme() {
        this.f8966b = null;
        this.f8965W = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jme)) {
            return false;
        }
        Jme jme = (Jme) obj;
        if (Intrinsics.areEqual(this.f8966b, jme.f8966b) && Intrinsics.areEqual(this.f8965W, jme.f8965W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ArrayList arrayList = this.f8966b;
        int i4 = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i5 = hashCode * 31;
        LinkedHashMap linkedHashMap = this.f8965W;
        if (linkedHashMap != null) {
            i4 = linkedHashMap.hashCode();
        }
        return i5 + i4;
    }

    public Jme(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f8966b = arrayList;
        this.f8965W = linkedHashMap;
    }
}
