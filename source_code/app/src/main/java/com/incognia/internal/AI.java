package com.incognia.internal;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class AI {
    public static final long PqK = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f8345V = 0;

    /* renamed from: J, reason: collision with root package name */
    public final Boolean f8346J;

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f8347W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f8348b;

    /* renamed from: f9, reason: collision with root package name */
    public final Boolean f8349f9;
    public final Boolean gmP;
    public final ArrayList sVU;

    public AI(Long l10, Boolean bool, Boolean bool2, ArrayList arrayList, Boolean bool3, Boolean bool4) {
        this.f8348b = l10;
        this.f8347W = bool;
        this.f8349f9 = bool2;
        this.sVU = arrayList;
        this.gmP = bool3;
        this.f8346J = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AI)) {
            return false;
        }
        AI ai2 = (AI) obj;
        if (Intrinsics.areEqual(this.f8348b, ai2.f8348b) && Intrinsics.areEqual(this.f8347W, ai2.f8347W) && Intrinsics.areEqual(this.f8349f9, ai2.f8349f9) && Intrinsics.areEqual(this.sVU, ai2.sVU) && Intrinsics.areEqual(this.gmP, ai2.gmP) && Intrinsics.areEqual(this.f8346J, ai2.f8346J)) {
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
        Long l10 = this.f8348b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        Boolean bool = this.f8347W;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Boolean bool2 = this.f8349f9;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        ArrayList arrayList = this.sVU;
        if (arrayList == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = arrayList.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool3 = this.gmP;
        if (bool3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Boolean bool4 = this.f8346J;
        if (bool4 != null) {
            i4 = bool4.hashCode();
        }
        return i13 + i4;
    }

    public /* synthetic */ AI(Long l10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i4) {
        this(l10, bool, bool2, (ArrayList) null, bool3, (i4 & 32) != 0 ? null : bool4);
    }
}
