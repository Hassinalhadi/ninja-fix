package com.incognia.internal;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k7Q {

    /* renamed from: W, reason: collision with root package name */
    public final String f10736W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10737b;

    /* renamed from: f9, reason: collision with root package name */
    public final LinkedHashMap f10738f9;
    public final String gmP;
    public final String sVU;

    public k7Q(String str, String str2, LinkedHashMap linkedHashMap, String str3, String str4) {
        this.f10737b = str;
        this.f10736W = str2;
        this.f10738f9 = linkedHashMap;
        this.sVU = str3;
        this.gmP = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7Q)) {
            return false;
        }
        k7Q k7q = (k7Q) obj;
        if (Intrinsics.areEqual(this.f10737b, k7q.f10737b) && Intrinsics.areEqual(this.f10736W, k7q.f10736W) && Intrinsics.areEqual(this.f10738f9, k7q.f10738f9) && Intrinsics.areEqual(this.sVU, k7q.sVU) && Intrinsics.areEqual(this.gmP, k7q.gmP)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f10737b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f10736W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        LinkedHashMap linkedHashMap = this.f10738f9;
        if (linkedHashMap == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = linkedHashMap.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.sVU;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str4 = this.gmP;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i12 + i4;
    }
}
