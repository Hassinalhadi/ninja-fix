package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b2 {

    /* renamed from: W, reason: collision with root package name */
    public final List f10134W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10135b;

    /* renamed from: f9, reason: collision with root package name */
    public final List f10136f9;
    public final List sVU;

    public b2(String str, List list, List list2, List list3) {
        this.f10135b = str;
        this.f10134W = list;
        this.f10136f9 = list2;
        this.sVU = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        if (Intrinsics.areEqual(this.f10135b, b2Var.f10135b) && Intrinsics.areEqual(this.f10134W, b2Var.f10134W) && Intrinsics.areEqual(this.f10136f9, b2Var.f10136f9) && Intrinsics.areEqual(this.sVU, b2Var.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f10135b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        List list = this.f10134W;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        List list2 = this.f10136f9;
        if (list2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list3 = this.sVU;
        if (list3 != null) {
            i4 = list3.hashCode();
        }
        return i11 + i4;
    }
}
