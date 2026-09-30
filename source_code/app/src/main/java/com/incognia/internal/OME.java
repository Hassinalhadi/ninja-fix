package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class OME {

    /* renamed from: W, reason: collision with root package name */
    public final String f9299W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9300b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f9301f9;
    public final String sVU;

    public OME(String str, String str2, String str3, String str4) {
        this.f9300b = str;
        this.f9299W = str2;
        this.f9301f9 = str3;
        this.sVU = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OME)) {
            return false;
        }
        OME ome = (OME) obj;
        if (Intrinsics.areEqual(this.f9300b, ome.f9300b) && Intrinsics.areEqual(this.f9299W, ome.f9299W) && Intrinsics.areEqual(this.f9301f9, ome.f9301f9) && Intrinsics.areEqual(this.sVU, ome.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f9300b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f9299W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return this.sVU.hashCode() + VpS.b(this.f9301f9, (i5 + i4) * 31, 31);
    }
}
