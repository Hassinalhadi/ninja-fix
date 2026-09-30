package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bXV {

    /* renamed from: W, reason: collision with root package name */
    public final String f10187W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10188b;

    public bXV(String str, String str2) {
        this.f10188b = str;
        this.f10187W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bXV)) {
            return false;
        }
        bXV bxv = (bXV) obj;
        if (Intrinsics.areEqual(this.f10188b, bxv.f10188b) && Intrinsics.areEqual(this.f10187W, bxv.f10187W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10188b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((int) 1776277728821L) + ZnG.b(70901, VpS.b(this.f10187W, hashCode * 31, 31), 31);
    }
}
