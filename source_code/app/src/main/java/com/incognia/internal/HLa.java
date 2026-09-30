package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class HLa {

    /* renamed from: W, reason: collision with root package name */
    public final String f8835W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8836b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f8837f9;
    public final Integer sVU;

    public HLa(Integer num, String str, String str2, String str3) {
        this.f8836b = str;
        this.f8835W = str2;
        this.f8837f9 = str3;
        this.sVU = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HLa)) {
            return false;
        }
        HLa hLa = (HLa) obj;
        if (Intrinsics.areEqual(this.f8836b, hLa.f8836b) && Intrinsics.areEqual(this.f8835W, hLa.f8835W) && Intrinsics.areEqual(this.f8837f9, hLa.f8837f9) && Intrinsics.areEqual(this.sVU, hLa.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f8836b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f8835W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.f8837f9;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num = this.sVU;
        if (num != null) {
            i4 = num.hashCode();
        }
        return i11 + i4;
    }
}
