package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class IlU {

    /* renamed from: W, reason: collision with root package name */
    public final String f8917W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8918b;

    /* renamed from: f9, reason: collision with root package name */
    public final Integer f8919f9;
    public final Float sVU;

    public IlU(String str, String str2, Integer num, Float f5) {
        this.f8918b = str;
        this.f8917W = str2;
        this.f8919f9 = num;
        this.sVU = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IlU)) {
            return false;
        }
        IlU ilU = (IlU) obj;
        if (Intrinsics.areEqual(this.f8918b, ilU.f8918b) && Intrinsics.areEqual(this.f8917W, ilU.f8917W) && Intrinsics.areEqual(this.f8919f9, ilU.f8919f9) && Intrinsics.areEqual(this.sVU, ilU.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f8918b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f8917W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Integer num = this.f8919f9;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Float f5 = this.sVU;
        if (f5 != null) {
            i4 = f5.hashCode();
        }
        return i11 + i4;
    }
}
