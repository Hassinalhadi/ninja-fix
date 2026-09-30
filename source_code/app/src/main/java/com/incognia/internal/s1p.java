package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s1p {

    /* renamed from: W, reason: collision with root package name */
    public final String f11256W;

    /* renamed from: b, reason: collision with root package name */
    public final List f11257b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f11258f9;
    public final Integer sVU;

    public s1p(List list, String str, String str2, Integer num) {
        this.f11257b = list;
        this.f11256W = str;
        this.f11258f9 = str2;
        this.sVU = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1p)) {
            return false;
        }
        s1p s1pVar = (s1p) obj;
        if (Intrinsics.areEqual(this.f11257b, s1pVar.f11257b) && Intrinsics.areEqual(this.f11256W, s1pVar.f11256W) && Intrinsics.areEqual(this.f11258f9, s1pVar.f11258f9) && Intrinsics.areEqual(this.sVU, s1pVar.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        List list = this.f11257b;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = hashCode * 31;
        String str = this.f11256W;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str2 = this.f11258f9;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num = this.sVU;
        if (num != null) {
            i4 = num.hashCode();
        }
        return i11 + i4;
    }
}
