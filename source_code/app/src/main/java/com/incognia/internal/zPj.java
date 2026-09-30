package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zPj {

    /* renamed from: W, reason: collision with root package name */
    public final String f11909W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11910b;

    public zPj(String str, String str2) {
        this.f11910b = str;
        this.f11909W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zPj)) {
            return false;
        }
        zPj zpj = (zPj) obj;
        if (Intrinsics.areEqual(this.f11910b, zpj.f11910b) && Intrinsics.areEqual(this.f11909W, zpj.f11909W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f11910b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f11909W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
