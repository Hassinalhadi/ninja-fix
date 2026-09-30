package com.fingerprintjs.android.fpjs_pro_internal;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0080\b\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/q2;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C1252q2 {
    public static int kilo;
    public static int lima;
    public volatile String alpha;
    public volatile String bravo;
    public volatile Integer charlie;
    public volatile int delta;
    public volatile Long echo;
    public volatile Long foxtrot;
    public volatile Long golf;
    public volatile Long hotel;
    public volatile Long india;
    public volatile Long juliet;

    public C1252q2(String str, String str2, Integer num, int i4, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i5 & 1) != 0 ? null : str;
        str2 = (i5 & 2) != 0 ? null : str2;
        num = (i5 & 4) != 0 ? null : num;
        i4 = (i5 & 8) != 0 ? 0 : i4;
        l10 = (i5 & 16) != 0 ? null : l10;
        l11 = (i5 & 32) != 0 ? null : l11;
        l12 = (i5 & 64) != 0 ? null : l12;
        l13 = (i5 & 128) != 0 ? null : l13;
        l14 = (i5 & Barcode.FORMAT_QR_CODE) != 0 ? null : l14;
        l15 = (i5 & 512) != 0 ? null : l15;
        this.alpha = str;
        this.bravo = str2;
        this.charlie = num;
        this.delta = i4;
        this.echo = l10;
        this.foxtrot = l11;
        this.golf = l12;
        this.hotel = l13;
        this.india = l14;
        this.juliet = l15;
    }

    public static int alpha() {
        int i4 = kilo;
        int i5 = i4 % 8977803;
        kilo = i4 + 1;
        if (i5 != 0) {
            return lima;
        }
        int tango = ao.ad.tango(1651540146);
        lima = tango;
        return tango;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1252q2)) {
            return false;
        }
        C1252q2 c1252q2 = (C1252q2) obj;
        if (Intrinsics.areEqual(this.alpha, c1252q2.alpha) && Intrinsics.areEqual(this.bravo, c1252q2.bravo) && Intrinsics.areEqual(this.charlie, c1252q2.charlie) && this.delta == c1252q2.delta && Intrinsics.areEqual(this.echo, c1252q2.echo) && Intrinsics.areEqual(this.foxtrot, c1252q2.foxtrot) && Intrinsics.areEqual(this.golf, c1252q2.golf) && Intrinsics.areEqual(this.hotel, c1252q2.hotel) && Intrinsics.areEqual(this.india, c1252q2.india) && Intrinsics.areEqual(this.juliet, c1252q2.juliet)) {
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
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i4 = 0;
        if (this.alpha == null) {
            hashCode = 0;
        } else {
            hashCode = this.alpha.hashCode();
        }
        int i5 = hashCode * 31;
        if (this.bravo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = this.bravo.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        if (this.charlie == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = this.charlie.hashCode();
        }
        int i11 = (((i10 + hashCode3) * 31) + this.delta) * 31;
        if (this.echo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = this.echo.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        if (this.foxtrot == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = this.foxtrot.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        if (this.golf == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = this.golf.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        if (this.hotel == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = this.hotel.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        if (this.india == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = this.india.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        if (this.juliet != null) {
            i4 = this.juliet.hashCode();
        }
        return i16 + i4;
    }

    public final String toString() {
        return "";
    }

    public C1252q2() {
        this(null, null, null, 0, null, null, null, null, null, null, 1023, null);
    }
}
