package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i3p {

    /* renamed from: W, reason: collision with root package name */
    public final String f10603W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10604b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f10605f9;
    public final String sVU;

    public i3p(String str, String str2, String str3, String str4) {
        this.f10604b = str;
        this.f10603W = str2;
        this.f10605f9 = str3;
        this.sVU = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3p)) {
            return false;
        }
        i3p i3pVar = (i3p) obj;
        if (Intrinsics.areEqual(this.f10604b, i3pVar.f10604b) && Intrinsics.areEqual(this.f10603W, i3pVar.f10603W) && Intrinsics.areEqual(this.f10605f9, i3pVar.f10605f9) && Intrinsics.areEqual(this.sVU, i3pVar.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b2 = VpS.b(this.f10603W, this.f10604b.hashCode() * 31, 31);
        String str = this.f10605f9;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        String str2 = this.sVU;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
