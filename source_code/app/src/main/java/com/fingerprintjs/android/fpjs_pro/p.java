package com.fingerprintjs.android.fpjs_pro;

import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p {
    public final int alpha;
    public final double bravo;
    public final double charlie;
    public final String delta;
    public final String echo;
    public final l foxtrot;
    public final n golf;
    public final m hotel;
    public final LinkedList india;

    public p(int i4, double d4, double d9, String str, String str2, l lVar, n nVar, m mVar, LinkedList linkedList) {
        this.alpha = i4;
        this.bravo = d4;
        this.charlie = d9;
        this.delta = str;
        this.echo = str2;
        this.foxtrot = lVar;
        this.golf = nVar;
        this.hotel = mVar;
        this.india = linkedList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (this.alpha != pVar.alpha || Double.compare(this.bravo, pVar.bravo) != 0 || Double.compare(this.charlie, pVar.charlie) != 0 || !Intrinsics.areEqual(this.delta, pVar.delta) || !Intrinsics.areEqual(this.echo, pVar.echo) || !Intrinsics.areEqual(this.foxtrot, pVar.foxtrot) || !Intrinsics.areEqual(this.golf, pVar.golf) || !Intrinsics.areEqual(this.hotel, pVar.hotel) || !Intrinsics.areEqual(this.india, pVar.india)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.alpha * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bravo);
        int i5 = (i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.charlie);
        return this.india.hashCode() + ((this.hotel.hashCode() + ((this.golf.hashCode() + ((this.foxtrot.alpha.hashCode() + ((this.echo.hashCode() + ((this.delta.hashCode() + ((i5 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IpLocation(accuracyRadius=" + this.alpha + ", latitude=" + this.bravo + ", longitude=" + this.charlie + ", postalCode=" + this.delta + ", timezone=" + this.echo + ", city=" + this.foxtrot + ", country=" + this.golf + ", continent=" + this.hotel + ", subdivisions=" + this.india + ")";
    }
}
