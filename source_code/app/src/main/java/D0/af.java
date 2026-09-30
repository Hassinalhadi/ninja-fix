package D0;

import a0.AbstractC0362p;
import a0.C0366t;
import a0.ar;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class af implements b {
    public final O0.o alpha;
    public final long bravo;
    public final H0.v charlie;
    public final H0.r delta;
    public final H0.s echo;
    public final H0.k foxtrot;
    public final String golf;
    public final long hotel;
    public final O0.a india;
    public final O0.p juliet;
    public final K0.b kilo;
    public final long lima;
    public final O0.l mike;
    public final ar november;
    public final w oscar;
    public final c0.e papa;

    public af(long j5, long j6, H0.v vVar, H0.r rVar, H0.s sVar, H0.k kVar, String str, long j7, O0.a aVar, O0.p pVar, K0.b bVar, long j10, O0.l lVar, ar arVar, w wVar) {
        this(j5 != 16 ? new O0.c(j5) : O0.n.alpha, j6, vVar, rVar, sVar, kVar, str, j7, aVar, pVar, bVar, j10, lVar, arVar, wVar, null);
    }

    public final boolean alpha(af afVar) {
        if (this == afVar) {
            return true;
        }
        if (Q0.p.alpha(this.bravo, afVar.bravo) && Intrinsics.areEqual(this.charlie, afVar.charlie) && Intrinsics.areEqual(this.delta, afVar.delta) && Intrinsics.areEqual(this.echo, afVar.echo) && Intrinsics.areEqual(this.foxtrot, afVar.foxtrot) && Intrinsics.areEqual(this.golf, afVar.golf) && Q0.p.alpha(this.hotel, afVar.hotel) && Intrinsics.areEqual(this.india, afVar.india) && Intrinsics.areEqual(this.juliet, afVar.juliet) && Intrinsics.areEqual(this.kilo, afVar.kilo) && C0366t.charlie(this.lima, afVar.lima) && Intrinsics.areEqual(this.oscar, afVar.oscar)) {
            return true;
        }
        return false;
    }

    public final boolean bravo(af afVar) {
        if (!Intrinsics.areEqual(this.alpha, afVar.alpha) || !Intrinsics.areEqual(this.mike, afVar.mike) || !Intrinsics.areEqual(this.november, afVar.november) || !Intrinsics.areEqual(this.papa, afVar.papa)) {
            return false;
        }
        return true;
    }

    public final af charlie(af afVar) {
        if (afVar == null) {
            return this;
        }
        O0.o oVar = afVar.alpha;
        return ag.alpha(this, oVar.bravo(), oVar.echo(), oVar.alpha(), afVar.bravo, afVar.charlie, afVar.delta, afVar.echo, afVar.foxtrot, afVar.golf, afVar.hotel, afVar.india, afVar.juliet, afVar.kilo, afVar.lima, afVar.mike, afVar.november, afVar.oscar, afVar.papa);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if (alpha(afVar) && bravo(afVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        O0.o oVar = this.alpha;
        long bravo = oVar.bravo();
        int i20 = C0366t.lima;
        int alpha = kotlin.p.alpha(bravo) * 31;
        AbstractC0362p echo = oVar.echo();
        int i21 = 0;
        if (echo != null) {
            i4 = echo.hashCode();
        } else {
            i4 = 0;
        }
        int delta = (Q0.p.delta(this.bravo) + ((Float.floatToIntBits(oVar.alpha()) + ((alpha + i4) * 31)) * 31)) * 31;
        H0.v vVar = this.charlie;
        if (vVar != null) {
            i5 = vVar.alpha;
        } else {
            i5 = 0;
        }
        int i22 = (delta + i5) * 31;
        H0.r rVar = this.delta;
        if (rVar != null) {
            i10 = rVar.alpha;
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        H0.s sVar = this.echo;
        if (sVar != null) {
            i11 = sVar.alpha;
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        H0.k kVar = this.foxtrot;
        if (kVar != null) {
            i12 = kVar.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        String str = this.golf;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int delta2 = (Q0.p.delta(this.hotel) + ((i25 + i13) * 31)) * 31;
        O0.a aVar = this.india;
        if (aVar != null) {
            i14 = Float.floatToIntBits(aVar.alpha);
        } else {
            i14 = 0;
        }
        int i26 = (delta2 + i14) * 31;
        O0.p pVar = this.juliet;
        if (pVar != null) {
            i15 = pVar.hashCode();
        } else {
            i15 = 0;
        }
        int i27 = (i26 + i15) * 31;
        K0.b bVar = this.kilo;
        if (bVar != null) {
            i16 = bVar.alpha.hashCode();
        } else {
            i16 = 0;
        }
        int whiskey = ao.ad.whiskey((i27 + i16) * 31, 31, this.lima);
        O0.l lVar = this.mike;
        if (lVar != null) {
            i17 = lVar.alpha;
        } else {
            i17 = 0;
        }
        int i28 = (whiskey + i17) * 31;
        ar arVar = this.november;
        if (arVar != null) {
            i18 = arVar.hashCode();
        } else {
            i18 = 0;
        }
        int i29 = (i28 + i18) * 31;
        w wVar = this.oscar;
        if (wVar != null) {
            i19 = wVar.hashCode();
        } else {
            i19 = 0;
        }
        int i30 = (i29 + i19) * 31;
        c0.e eVar = this.papa;
        if (eVar != null) {
            i21 = eVar.hashCode();
        }
        return i30 + i21;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        O0.o oVar = this.alpha;
        sb2.append((Object) C0366t.india(oVar.bravo()));
        sb2.append(", brush=");
        sb2.append(oVar.echo());
        sb2.append(", alpha=");
        sb2.append(oVar.alpha());
        sb2.append(", fontSize=");
        sb2.append((Object) Q0.p.echo(this.bravo));
        sb2.append(", fontWeight=");
        sb2.append(this.charlie);
        sb2.append(", fontStyle=");
        sb2.append(this.delta);
        sb2.append(", fontSynthesis=");
        sb2.append(this.echo);
        sb2.append(", fontFamily=");
        sb2.append(this.foxtrot);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.golf);
        sb2.append(", letterSpacing=");
        sb2.append((Object) Q0.p.echo(this.hotel));
        sb2.append(", baselineShift=");
        sb2.append(this.india);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.juliet);
        sb2.append(", localeList=");
        sb2.append(this.kilo);
        sb2.append(", background=");
        ao.ad.bronze(this.lima, ", textDecoration=", sb2);
        sb2.append(this.mike);
        sb2.append(", shadow=");
        sb2.append(this.november);
        sb2.append(", platformStyle=");
        sb2.append(this.oscar);
        sb2.append(", drawStyle=");
        sb2.append(this.papa);
        sb2.append(')');
        return sb2.toString();
    }

    public af(O0.o oVar, long j5, H0.v vVar, H0.r rVar, H0.s sVar, H0.k kVar, String str, long j6, O0.a aVar, O0.p pVar, K0.b bVar, long j7, O0.l lVar, ar arVar, w wVar, c0.e eVar) {
        this.alpha = oVar;
        this.bravo = j5;
        this.charlie = vVar;
        this.delta = rVar;
        this.echo = sVar;
        this.foxtrot = kVar;
        this.golf = str;
        this.hotel = j6;
        this.india = aVar;
        this.juliet = pVar;
        this.kilo = bVar;
        this.lima = j7;
        this.mike = lVar;
        this.november = arVar;
        this.oscar = wVar;
        this.papa = eVar;
    }

    public af(long j5, long j6, H0.v vVar, H0.r rVar, H0.s sVar, H0.k kVar, String str, long j7, O0.a aVar, O0.p pVar, K0.b bVar, long j10, O0.l lVar, ar arVar, int i4) {
        this((i4 & 1) != 0 ? C0366t.kilo : j5, (i4 & 2) != 0 ? Q0.p.charlie : j6, (i4 & 4) != 0 ? null : vVar, (i4 & 8) != 0 ? null : rVar, (i4 & 16) != 0 ? null : sVar, (i4 & 32) != 0 ? null : kVar, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? Q0.p.charlie : j7, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : aVar, (i4 & 512) != 0 ? null : pVar, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : bVar, (i4 & 2048) != 0 ? C0366t.kilo : j10, (i4 & 4096) != 0 ? null : lVar, (i4 & 8192) != 0 ? null : arVar, (w) null);
    }
}
