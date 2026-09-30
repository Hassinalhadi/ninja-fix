package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Ve {

    /* renamed from: J, reason: collision with root package name */
    public final Integer f9784J;
    public final Integer PqK;

    /* renamed from: V, reason: collision with root package name */
    public final ArrayList f9785V;

    /* renamed from: W, reason: collision with root package name */
    public final String f9786W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9787b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f9788f9;
    public final int gmP;
    public final Integer olU;
    public final int sVU;

    public Ve(String str, String str2, String str3, int i4, int i5, Integer num, Integer num2, ArrayList arrayList, Integer num3) {
        this.f9787b = str;
        this.f9786W = str2;
        this.f9788f9 = str3;
        this.sVU = i4;
        this.gmP = i5;
        this.f9784J = num;
        this.PqK = num2;
        this.f9785V = arrayList;
        this.olU = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ve)) {
            return false;
        }
        Ve ve2 = (Ve) obj;
        if (Intrinsics.areEqual(this.f9787b, ve2.f9787b) && Intrinsics.areEqual(this.f9786W, ve2.f9786W) && Intrinsics.areEqual(this.f9788f9, ve2.f9788f9) && this.sVU == ve2.sVU && this.gmP == ve2.gmP && Intrinsics.areEqual(this.f9784J, ve2.f9784J) && Intrinsics.areEqual(this.PqK, ve2.PqK) && Intrinsics.areEqual(this.f9785V, ve2.f9785V) && Intrinsics.areEqual(this.olU, ve2.olU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f9787b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b2 = VpS.b(this.f9786W, hashCode * 31, 31);
        String str2 = this.f9788f9;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int b4 = ZnG.b(this.gmP, ZnG.b(this.sVU, (b2 + hashCode2) * 31, 31), 31);
        Integer num = this.f9784J;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i5 = (b4 + hashCode3) * 31;
        Integer num2 = this.PqK;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i10 = (i5 + hashCode4) * 31;
        ArrayList arrayList = this.f9785V;
        if (arrayList == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = arrayList.hashCode();
        }
        int i11 = (i10 + hashCode5) * 31;
        Integer num3 = this.olU;
        if (num3 != null) {
            i4 = num3.hashCode();
        }
        return i11 + i4;
    }
}
