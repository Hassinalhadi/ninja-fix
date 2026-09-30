package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Xqi {

    /* renamed from: W, reason: collision with root package name */
    public final i3p f9954W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9955b;

    /* renamed from: f9, reason: collision with root package name */
    public final i3p f9956f9;
    public final String gmP;
    public final String sVU;

    public Xqi(String str, i3p i3pVar, i3p i3pVar2, String str2, String str3) {
        this.f9955b = str;
        this.f9954W = i3pVar;
        this.f9956f9 = i3pVar2;
        this.sVU = str2;
        this.gmP = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xqi)) {
            return false;
        }
        Xqi xqi = (Xqi) obj;
        if (Intrinsics.areEqual(this.f9955b, xqi.f9955b) && Intrinsics.areEqual(this.f9954W, xqi.f9954W) && Intrinsics.areEqual(this.f9956f9, xqi.f9956f9) && Intrinsics.areEqual(this.sVU, xqi.sVU) && Intrinsics.areEqual(this.gmP, xqi.gmP)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f9955b.hashCode() * 31;
        i3p i3pVar = this.f9954W;
        int i4 = 0;
        if (i3pVar == null) {
            hashCode = 0;
        } else {
            hashCode = i3pVar.hashCode();
        }
        int i5 = (hashCode4 + hashCode) * 31;
        i3p i3pVar2 = this.f9956f9;
        if (i3pVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = i3pVar2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str = this.sVU;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.gmP;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i11 + i4;
    }
}
