package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zMr {

    /* renamed from: J, reason: collision with root package name */
    public final Long f11905J;
    public final Long PqK;

    /* renamed from: W, reason: collision with root package name */
    public final String f11906W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f11907b;

    /* renamed from: f9, reason: collision with root package name */
    public final ArrayList f11908f9;
    public final ArrayList gmP;
    public final ArrayList sVU;

    public zMr(Long l10, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Long l11, Long l12) {
        this.f11907b = l10;
        this.f11906W = str;
        this.f11908f9 = arrayList;
        this.sVU = arrayList2;
        this.gmP = arrayList3;
        this.f11905J = l11;
        this.PqK = l12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zMr)) {
            return false;
        }
        zMr zmr = (zMr) obj;
        if (Intrinsics.areEqual(this.f11907b, zmr.f11907b) && Intrinsics.areEqual(this.f11906W, zmr.f11906W) && Intrinsics.areEqual(this.f11908f9, zmr.f11908f9) && Intrinsics.areEqual(this.sVU, zmr.sVU) && Intrinsics.areEqual(this.gmP, zmr.gmP) && Intrinsics.areEqual(this.f11905J, zmr.f11905J) && Intrinsics.areEqual(this.PqK, zmr.PqK)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f11907b.hashCode() * 31;
        String str = this.f11906W;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.PqK.hashCode() + ((this.f11905J.hashCode() + ((this.gmP.hashCode() + ((this.sVU.hashCode() + ((this.f11908f9.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
