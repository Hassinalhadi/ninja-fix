package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Ip7 {

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f8922W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8923b;

    public Ip7(ArrayList arrayList, ArrayList arrayList2) {
        this.f8923b = arrayList;
        this.f8922W = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ip7)) {
            return false;
        }
        Ip7 ip7 = (Ip7) obj;
        if (Intrinsics.areEqual(this.f8923b, ip7.f8923b) && Intrinsics.areEqual(this.f8922W, ip7.f8922W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f8923b.hashCode() * 31;
        ArrayList arrayList = this.f8922W;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
