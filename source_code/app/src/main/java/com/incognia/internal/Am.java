package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Am {

    /* renamed from: W, reason: collision with root package name */
    public final long f8379W;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f8380b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f8381f9;

    public Am(JSONObject jSONObject, long j5, long j6) {
        this.f8380b = jSONObject;
        this.f8379W = j5;
        this.f8381f9 = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Am)) {
            return false;
        }
        Am am2 = (Am) obj;
        if (Intrinsics.areEqual(this.f8380b, am2.f8380b) && this.f8379W == am2.f8379W && this.f8381f9 == am2.f8381f9) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b2 = lci.b(this.f8379W, this.f8380b.hashCode() * 31, 31);
        long j5 = this.f8381f9;
        return ((int) (j5 ^ (j5 >>> 32))) + b2;
    }
}
