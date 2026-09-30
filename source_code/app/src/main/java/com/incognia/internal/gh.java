package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gh {

    /* renamed from: W, reason: collision with root package name */
    public final String f10487W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10488b;

    public gh(String str, String str2) {
        this.f10488b = str;
        this.f10487W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        if (Intrinsics.areEqual(this.f10488b, ghVar.f10488b) && Intrinsics.areEqual(this.f10487W, ghVar.f10487W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10488b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f10487W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
