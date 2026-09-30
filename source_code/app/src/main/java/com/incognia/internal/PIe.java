package com.incognia.internal;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class PIe {
    public final String DOu;

    /* renamed from: E, reason: collision with root package name */
    public final String f9403E;
    public final String FL;
    public final String IB;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f9404J;

    /* renamed from: L, reason: collision with root package name */
    public final long f9405L;

    /* renamed from: P, reason: collision with root package name */
    public final String f9406P;
    public final boolean PqK;
    public final String Qs;

    /* renamed from: R, reason: collision with root package name */
    public final String f9407R;

    /* renamed from: V, reason: collision with root package name */
    public final String f9408V;

    /* renamed from: W, reason: collision with root package name */
    public final String f9409W;

    /* renamed from: Y, reason: collision with root package name */
    public final Long f9410Y;

    /* renamed from: ar, reason: collision with root package name */
    public final dz f9411ar;

    /* renamed from: b, reason: collision with root package name */
    public final long f9412b;

    /* renamed from: f9, reason: collision with root package name */
    public final int f9413f9;
    public final String gmP;

    /* renamed from: n9, reason: collision with root package name */
    public final String f9414n9;
    public final String olU;
    public final String sVU;

    public PIe(long j5, String str, int i4, String str2, String str3, boolean z2, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l10, String str12, long j6, String str13, dz dzVar) {
        this.f9412b = j5;
        this.f9409W = str;
        this.f9413f9 = i4;
        this.sVU = str2;
        this.gmP = str3;
        this.f9404J = z2;
        this.PqK = z10;
        this.f9408V = str4;
        this.olU = str5;
        this.f9407R = str6;
        this.DOu = str7;
        this.IB = str8;
        this.Qs = str9;
        this.f9403E = str10;
        this.f9414n9 = str11;
        this.f9410Y = l10;
        this.f9406P = str12;
        this.f9405L = j6;
        this.FL = str13;
        this.f9411ar = dzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIe)) {
            return false;
        }
        PIe pIe = (PIe) obj;
        if (this.f9412b == pIe.f9412b && Intrinsics.areEqual(this.f9409W, pIe.f9409W) && this.f9413f9 == pIe.f9413f9 && Intrinsics.areEqual(this.sVU, pIe.sVU) && Intrinsics.areEqual(this.gmP, pIe.gmP) && this.f9404J == pIe.f9404J && this.PqK == pIe.PqK && Intrinsics.areEqual(this.f9408V, pIe.f9408V) && Intrinsics.areEqual(this.olU, pIe.olU) && Intrinsics.areEqual(this.f9407R, pIe.f9407R) && Intrinsics.areEqual(this.DOu, pIe.DOu) && Intrinsics.areEqual(this.IB, pIe.IB) && Intrinsics.areEqual(this.Qs, pIe.Qs) && Intrinsics.areEqual(this.f9403E, pIe.f9403E) && Intrinsics.areEqual(this.f9414n9, pIe.f9414n9) && Intrinsics.areEqual(this.f9410Y, pIe.f9410Y) && Intrinsics.areEqual(this.f9406P, pIe.f9406P) && this.f9405L == pIe.f9405L && Intrinsics.areEqual(this.FL, pIe.FL) && Intrinsics.areEqual(this.f9411ar, pIe.f9411ar)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        long j5 = this.f9412b;
        int b2 = VpS.b(this.gmP, VpS.b(this.sVU, ZnG.b(this.f9413f9, VpS.b(this.f9409W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31), 31), 31), 31);
        boolean z2 = this.f9404J;
        int i4 = 1;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (b2 + i5) * 31;
        boolean z10 = this.PqK;
        if (!z10) {
            i4 = z10 ? 1 : 0;
        }
        int i11 = (i10 + i4) * 31;
        String str = this.f9408V;
        int i12 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 + hashCode) * 31;
        String str2 = this.olU;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i14 = (i13 + hashCode2) * 31;
        String str3 = this.f9407R;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i15 = (i14 + hashCode3) * 31;
        String str4 = this.DOu;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i16 = (i15 + hashCode4) * 31;
        String str5 = this.IB;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i17 = (i16 + hashCode5) * 31;
        String str6 = this.Qs;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i18 = (i17 + hashCode6) * 31;
        String str7 = this.f9403E;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i19 = (i18 + hashCode7) * 31;
        String str8 = this.f9414n9;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i20 = (i19 + hashCode8) * 31;
        Long l10 = this.f9410Y;
        if (l10 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l10.hashCode();
        }
        int i21 = (i20 + hashCode9) * 31;
        String str9 = this.f9406P;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int b4 = VpS.b(this.FL, lci.b(this.f9405L, (i21 + hashCode10) * 31, 31), 31);
        dz dzVar = this.f9411ar;
        if (dzVar != null) {
            i12 = dzVar.hashCode();
        }
        return b4 + i12;
    }

    public /* synthetic */ PIe(long j5, String str, String str2, String str3, boolean z2, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l10, String str12, String str13, int i4) {
        this(j5, str, 70901, str2, str3, z2, z10, (i4 & 128) != 0 ? null : str4, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : str7, (i4 & 2048) != 0 ? null : str8, (i4 & 4096) != 0 ? null : str9, (i4 & 8192) != 0 ? null : str10, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str11, (32768 & i4) != 0 ? null : l10, (i4 & 65536) != 0 ? null : str12, 1776277729192L, str13, null);
    }
}
