package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: W, reason: collision with root package name */
    public final Integer f10081W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10082b;

    public a1(String str, Integer num) {
        this.f10082b = str;
        this.f10081W = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (Intrinsics.areEqual(this.f10082b, a1Var.f10082b) && Intrinsics.areEqual(this.f10081W, a1Var.f10081W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10082b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        Integer num = this.f10081W;
        if (num != null) {
            i4 = num.hashCode();
        }
        return i5 + i4;
    }
}
