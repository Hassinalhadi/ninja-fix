package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hW4 {

    /* renamed from: W, reason: collision with root package name */
    public final String f10544W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10545b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f10546f9;

    public hW4(String str, String str2, String str3) {
        this.f10545b = str;
        this.f10544W = str2;
        this.f10546f9 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hW4)) {
            return false;
        }
        hW4 hw4 = (hW4) obj;
        if (Intrinsics.areEqual(this.f10545b, hw4.f10545b) && Intrinsics.areEqual(this.f10544W, hw4.f10544W) && Intrinsics.areEqual(this.f10546f9, hw4.f10546f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f10545b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f10544W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.f10546f9;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i10 + i4;
    }
}
