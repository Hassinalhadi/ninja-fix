package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class NF3 {

    /* renamed from: W, reason: collision with root package name */
    public final String f9193W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9194b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f9195f9;

    public NF3(String str, String str2, String str3) {
        this.f9194b = str;
        this.f9193W = str2;
        this.f9195f9 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NF3)) {
            return false;
        }
        NF3 nf3 = (NF3) obj;
        if (Intrinsics.areEqual(this.f9194b, nf3.f9194b) && Intrinsics.areEqual(this.f9193W, nf3.f9193W) && Intrinsics.areEqual(this.f9195f9, nf3.f9195f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f9194b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f9193W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.f9195f9;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i10 + i4;
    }
}
