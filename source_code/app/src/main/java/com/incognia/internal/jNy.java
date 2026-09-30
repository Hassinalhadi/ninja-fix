package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jNy {

    /* renamed from: J, reason: collision with root package name */
    public final List f10681J;

    /* renamed from: W, reason: collision with root package name */
    public final long f10682W;

    /* renamed from: b, reason: collision with root package name */
    public final long f10683b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f10684f9;
    public final Long gmP;
    public final Long sVU;

    public jNy(long j5, long j6, String str, Long l10, Long l11, List list) {
        this.f10683b = j5;
        this.f10682W = j6;
        this.f10684f9 = str;
        this.sVU = l10;
        this.gmP = l11;
        this.f10681J = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jNy)) {
            return false;
        }
        jNy jny = (jNy) obj;
        if (this.f10683b == jny.f10683b && this.f10682W == jny.f10682W && Intrinsics.areEqual(this.f10684f9, jny.f10684f9) && Intrinsics.areEqual(this.sVU, jny.sVU) && Intrinsics.areEqual(this.gmP, jny.gmP) && Intrinsics.areEqual(this.f10681J, jny.f10681J)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j5 = this.f10683b;
        int b2 = lci.b(this.f10682W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31);
        String str = this.f10684f9;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        Long l10 = this.sVU;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Long l11 = this.gmP;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list = this.f10681J;
        if (list != null) {
            i4 = list.hashCode();
        }
        return i11 + i4;
    }
}
