package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Kq {

    /* renamed from: W, reason: collision with root package name */
    public final Integer f9027W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9028b;

    /* renamed from: f9, reason: collision with root package name */
    public final Integer f9029f9;
    public final Boolean sVU;

    public Kq(ArrayList arrayList, Integer num, Integer num2, Boolean bool) {
        this.f9028b = arrayList;
        this.f9027W = num;
        this.f9029f9 = num2;
        this.sVU = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kq)) {
            return false;
        }
        Kq kq = (Kq) obj;
        if (Intrinsics.areEqual(this.f9028b, kq.f9028b) && Intrinsics.areEqual(this.f9027W, kq.f9027W) && Intrinsics.areEqual(this.f9029f9, kq.f9029f9) && Intrinsics.areEqual(this.sVU, kq.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.sVU.hashCode() + ((this.f9029f9.hashCode() + ((this.f9027W.hashCode() + (this.f9028b.hashCode() * 31)) * 31)) * 31);
    }
}
