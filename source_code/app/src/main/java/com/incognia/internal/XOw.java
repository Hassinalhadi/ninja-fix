package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class XOw {

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f9922W;

    /* renamed from: b, reason: collision with root package name */
    public final List f9923b;

    public XOw(List list, Boolean bool) {
        this.f9923b = list;
        this.f9922W = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XOw)) {
            return false;
        }
        XOw xOw = (XOw) obj;
        if (Intrinsics.areEqual(this.f9923b, xOw.f9923b) && Intrinsics.areEqual(this.f9922W, xOw.f9922W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        List list = this.f9923b;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = hashCode * 31;
        Boolean bool = this.f9922W;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return i5 + i4;
    }
}
