package com.incognia.internal;

import fe.C1713e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zhK {

    /* renamed from: J, reason: collision with root package name */
    public final String f11935J;
    public final String PqK;

    /* renamed from: W, reason: collision with root package name */
    public final int f11936W;

    /* renamed from: b, reason: collision with root package name */
    public final c89 f11937b;

    /* renamed from: f9, reason: collision with root package name */
    public final int f11938f9;
    public final long gmP;
    public final int sVU;

    public zhK(c89 c89Var, int i4, int i5, int i10, long j5, String str, String str2) {
        this.f11937b = c89Var;
        this.f11936W = i4;
        this.f11938f9 = i5;
        this.sVU = i10;
        this.gmP = j5;
        this.f11935J = str;
        this.PqK = str2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [fe.g, fe.e] */
    /* JADX WARN: Type inference failed for: r5v0, types: [fe.g, fe.e] */
    public final boolean b() {
        Integer num;
        int i4;
        int i5;
        String str = this.f11935J;
        Integer num2 = null;
        if (str != null) {
            num = kotlin.text.r.tango(str);
        } else {
            num = null;
        }
        String str2 = this.PqK;
        if (str2 != null) {
            num2 = kotlin.text.r.tango(str2);
        }
        int i10 = this.f11936W;
        if (i10 == Integer.MAX_VALUE || i10 == 0 || (i4 = this.f11938f9) == Integer.MAX_VALUE || i4 == 0 || -150 > (i5 = this.sVU) || i5 >= 0 || this.f11935J == null || ((num != null && !new C1713e(1, 999, 1).alpha(num.intValue())) || this.PqK == null || (num2 != null && !new C1713e(1, 999, 1).alpha(num2.intValue())))) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhK)) {
            return false;
        }
        zhK zhk = (zhK) obj;
        if (Intrinsics.areEqual(this.f11937b, zhk.f11937b) && this.f11936W == zhk.f11936W && this.f11938f9 == zhk.f11938f9 && this.sVU == zhk.sVU && this.gmP == zhk.gmP && Intrinsics.areEqual(this.f11935J, zhk.f11935J) && Intrinsics.areEqual(this.PqK, zhk.PqK)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b2 = lci.b(this.gmP, ZnG.b(this.sVU, ZnG.b(this.f11938f9, ZnG.b(this.f11936W, this.f11937b.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f11935J;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        String str2 = this.PqK;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
