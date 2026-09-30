package com.incognia.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Zyk {

    /* renamed from: W, reason: collision with root package name */
    public final String f10076W;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10077b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f10078f9;
    public final LinkedHashMap sVU;

    public Zyk(ArrayList arrayList, String str, String str2, LinkedHashMap linkedHashMap) {
        this.f10077b = arrayList;
        this.f10076W = str;
        this.f10078f9 = str2;
        this.sVU = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zyk)) {
            return false;
        }
        Zyk zyk = (Zyk) obj;
        if (Intrinsics.areEqual(this.f10077b, zyk.f10077b) && Intrinsics.areEqual(this.f10076W, zyk.f10076W) && Intrinsics.areEqual(this.f10078f9, zyk.f10078f9) && Intrinsics.areEqual(this.sVU, zyk.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        ArrayList arrayList = this.f10077b;
        int i4 = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i5 = hashCode * 31;
        String str = this.f10076W;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str2 = this.f10078f9;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        LinkedHashMap linkedHashMap = this.sVU;
        if (linkedHashMap != null) {
            i4 = linkedHashMap.hashCode();
        }
        return i11 + i4;
    }
}
