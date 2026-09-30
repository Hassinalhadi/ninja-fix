package com.fingerprintjs.android.fpjs_pro;

import androidx.appcompat.widget.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\b\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/FingerprintJSProResponse;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FingerprintJSProResponse {
    public final String alpha;
    public final String bravo;
    public final d charlie;
    public final boolean delta;
    public final String echo;
    public final p foxtrot;
    public final String golf;
    public final String hotel;
    public final z india;
    public final z juliet;
    public final String kilo;
    public final String lima;

    public FingerprintJSProResponse(String str, String str2, d dVar, boolean z2, String str3, p pVar, String str4, String str5, z zVar, z zVar2, String str6, String str7) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = dVar;
        this.delta = z2;
        this.echo = str3;
        this.foxtrot = pVar;
        this.golf = str4;
        this.hotel = str5;
        this.india = zVar;
        this.juliet = zVar2;
        this.kilo = str6;
        this.lima = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FingerprintJSProResponse) {
                FingerprintJSProResponse fingerprintJSProResponse = (FingerprintJSProResponse) obj;
                if (!Intrinsics.areEqual(this.alpha, fingerprintJSProResponse.alpha) || !Intrinsics.areEqual(this.bravo, fingerprintJSProResponse.bravo) || !Intrinsics.areEqual(this.charlie, fingerprintJSProResponse.charlie) || this.delta != fingerprintJSProResponse.delta || !Intrinsics.areEqual(this.echo, fingerprintJSProResponse.echo) || !Intrinsics.areEqual(this.foxtrot, fingerprintJSProResponse.foxtrot) || !Intrinsics.areEqual(this.golf, fingerprintJSProResponse.golf) || !Intrinsics.areEqual(this.hotel, fingerprintJSProResponse.hotel) || !Intrinsics.areEqual(this.india, fingerprintJSProResponse.india) || !Intrinsics.areEqual(this.juliet, fingerprintJSProResponse.juliet) || !Intrinsics.areEqual(this.kilo, fingerprintJSProResponse.kilo) || !Intrinsics.areEqual(this.lima, fingerprintJSProResponse.lima) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = (this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31;
        if (this.delta) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode3 = (this.echo.hashCode() + ((hashCode2 + i4) * 31)) * 31;
        int i5 = 0;
        p pVar = this.foxtrot;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        int hashCode4 = (this.juliet.hashCode() + ((this.india.hashCode() + ((this.hotel.hashCode() + ((this.golf.hashCode() + ((hashCode3 + hashCode) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.kilo;
        if (str != null) {
            i5 = str.hashCode();
        }
        return (this.lima.hashCode() + ((hashCode4 + i5) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FingerprintJSProResponse(requestId=");
        sb2.append(this.alpha);
        sb2.append(", visitorId=");
        sb2.append(this.bravo);
        sb2.append(", confidenceScore=");
        sb2.append(this.charlie);
        sb2.append(", visitorFound=");
        sb2.append(this.delta);
        sb2.append(", ipAddress=");
        sb2.append(this.echo);
        sb2.append(", ipLocation=");
        sb2.append(this.foxtrot);
        sb2.append(", osName=");
        sb2.append(this.golf);
        sb2.append(", osVersion=");
        sb2.append(this.hotel);
        sb2.append(", firstSeenAt=");
        sb2.append(this.india);
        sb2.append(", lastSeenAt=");
        sb2.append(this.juliet);
        sb2.append(", sealedResult=");
        sb2.append(this.kilo);
        sb2.append(", asJson=");
        return P0.gold(sb2, this.lima, ", errorMessage=null)");
    }
}
