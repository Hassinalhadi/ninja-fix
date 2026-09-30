package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fKw {

    /* renamed from: W, reason: collision with root package name */
    public final String f10408W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10409b;

    /* renamed from: f9, reason: collision with root package name */
    public final Integer f10410f9;
    public final String sVU;

    public fKw(Integer num, String str, String str2, String str3) {
        this.f10409b = str;
        this.f10408W = str2;
        this.f10410f9 = num;
        this.sVU = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fKw)) {
            return false;
        }
        fKw fkw = (fKw) obj;
        if (Intrinsics.areEqual(this.f10409b, fkw.f10409b) && Intrinsics.areEqual(this.f10408W, fkw.f10408W) && Intrinsics.areEqual(this.f10410f9, fkw.f10410f9) && Intrinsics.areEqual(this.sVU, fkw.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f10409b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f10408W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Integer num = this.f10410f9;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.sVU;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i11 + i4;
    }
}
