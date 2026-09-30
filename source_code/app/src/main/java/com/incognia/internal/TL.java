package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TL {

    /* renamed from: W, reason: collision with root package name */
    public final String f9664W;

    /* renamed from: b, reason: collision with root package name */
    public final List f9665b;

    public TL(List list, String str, int i4) {
        list = (i4 & 1) != 0 ? null : list;
        str = (i4 & 2) != 0 ? null : str;
        this.f9665b = list;
        this.f9664W = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TL)) {
            return false;
        }
        TL tl = (TL) obj;
        if (Intrinsics.areEqual(this.f9665b, tl.f9665b) && Intrinsics.areEqual(this.f9664W, tl.f9664W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        List list = this.f9665b;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = hashCode * 31;
        String str = this.f9664W;
        if (str != null) {
            i4 = str.hashCode();
        }
        return i5 + i4;
    }
}
