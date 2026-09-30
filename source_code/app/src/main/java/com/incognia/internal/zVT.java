package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zVT {

    /* renamed from: W, reason: collision with root package name */
    public final List f11914W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11915b;

    public zVT(String str, List list) {
        this.f11915b = str;
        this.f11914W = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zVT)) {
            return false;
        }
        zVT zvt = (zVT) obj;
        if (Intrinsics.areEqual(this.f11915b, zvt.f11915b) && Intrinsics.areEqual(this.f11914W, zvt.f11914W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f11915b.hashCode() * 31;
        List list = this.f11914W;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
