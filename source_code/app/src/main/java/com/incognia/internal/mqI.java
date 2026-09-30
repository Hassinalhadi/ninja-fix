package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mqI {

    /* renamed from: W, reason: collision with root package name */
    public final Integer f10922W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10923b;

    public mqI(String str, Integer num) {
        this.f10923b = str;
        this.f10922W = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqI)) {
            return false;
        }
        mqI mqi = (mqI) obj;
        if (Intrinsics.areEqual(this.f10923b, mqi.f10923b) && Intrinsics.areEqual(this.f10922W, mqi.f10922W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10923b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        Integer num = this.f10922W;
        if (num != null) {
            i4 = num.hashCode();
        }
        return i5 + i4;
    }
}
