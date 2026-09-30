package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class CS {

    /* renamed from: W, reason: collision with root package name */
    public final String f8455W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8456b;

    /* renamed from: f9, reason: collision with root package name */
    public final Boolean f8457f9;

    public CS(String str, String str2, Boolean bool) {
        this.f8456b = str;
        this.f8455W = str2;
        this.f8457f9 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CS)) {
            return false;
        }
        CS cs = (CS) obj;
        if (Intrinsics.areEqual(this.f8456b, cs.f8456b) && Intrinsics.areEqual(this.f8455W, cs.f8455W) && Intrinsics.areEqual(this.f8457f9, cs.f8457f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f8456b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f8455W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Boolean bool = this.f8457f9;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return i10 + i4;
    }
}
