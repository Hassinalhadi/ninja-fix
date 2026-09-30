package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jo {

    /* renamed from: W, reason: collision with root package name */
    public final uR2 f10712W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10713b;

    public jo(String str, uR2 ur2) {
        this.f10713b = str;
        this.f10712W = ur2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        if (Intrinsics.areEqual(this.f10713b, joVar.f10713b) && Intrinsics.areEqual(this.f10712W, joVar.f10712W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10713b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        uR2 ur2 = this.f10712W;
        if (ur2 != null) {
            i4 = ur2.hashCode();
        }
        return i5 + i4;
    }
}
