package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cs5 {

    /* renamed from: W, reason: collision with root package name */
    public final Lmj f8489W;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f8490b;

    /* renamed from: f9, reason: collision with root package name */
    public final int f8491f9;
    public final Integer sVU;

    public Cs5(JSONObject jSONObject, Lmj lmj, int i4, Integer num) {
        this.f8490b = jSONObject;
        this.f8489W = lmj;
        this.f8491f9 = i4;
        this.sVU = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cs5)) {
            return false;
        }
        Cs5 cs5 = (Cs5) obj;
        if (Intrinsics.areEqual(this.f8490b, cs5.f8490b) && Intrinsics.areEqual(this.f8489W, cs5.f8489W) && this.f8491f9 == cs5.f8491f9 && Intrinsics.areEqual(this.sVU, cs5.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b2 = ZnG.b(this.f8491f9, (this.f8489W.hashCode() + (this.f8490b.hashCode() * 31)) * 31, 31);
        Integer num = this.sVU;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return b2 + hashCode;
    }
}
