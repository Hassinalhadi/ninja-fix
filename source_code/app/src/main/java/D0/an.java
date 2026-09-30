package D0;

import a0.C0366t;
import a0.ar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class an {
    public static final an delta = new an(0, 0, null, null, null, 0, 0, 0, 0, 16777215);
    public final af alpha;
    public final t bravo;
    public final x charlie;

    public an(af afVar, t tVar, x xVar) {
        this.alpha = afVar;
        this.bravo = tVar;
        this.charlie = xVar;
    }

    public static an alpha(an anVar, long j5, long j6, H0.v vVar, H0.k kVar, long j7, int i4, long j10, x xVar, O0.i iVar, int i5) {
        long j11;
        long j12;
        H0.v vVar2;
        H0.k kVar2;
        long j13;
        O0.l lVar;
        int i10;
        long j14;
        x xVar2;
        O0.i iVar2;
        O0.o oVar;
        w wVar;
        O0.l lVar2 = O0.l.charlie;
        if ((i5 & 1) != 0) {
            j11 = anVar.alpha.alpha.bravo();
        } else {
            j11 = j5;
        }
        if ((i5 & 2) != 0) {
            j12 = anVar.alpha.bravo;
        } else {
            j12 = j6;
        }
        if ((i5 & 4) != 0) {
            vVar2 = anVar.alpha.charlie;
        } else {
            vVar2 = vVar;
        }
        af afVar = anVar.alpha;
        H0.r rVar = afVar.delta;
        H0.s sVar = afVar.echo;
        if ((i5 & 32) != 0) {
            kVar2 = afVar.foxtrot;
        } else {
            kVar2 = kVar;
        }
        String str = afVar.golf;
        if ((i5 & 128) != 0) {
            j13 = afVar.hotel;
        } else {
            j13 = j7;
        }
        O0.a aVar = afVar.india;
        O0.p pVar = afVar.juliet;
        K0.b bVar = afVar.kilo;
        long j15 = afVar.lima;
        if ((i5 & 4096) != 0) {
            lVar = afVar.mike;
        } else {
            lVar = lVar2;
        }
        ar arVar = afVar.november;
        c0.e eVar = afVar.papa;
        if ((i5 & 32768) != 0) {
            i10 = anVar.bravo.alpha;
        } else {
            i10 = i4;
        }
        t tVar = anVar.bravo;
        int i11 = tVar.bravo;
        if ((i5 & 131072) != 0) {
            j14 = tVar.charlie;
        } else {
            j14 = j10;
        }
        O0.q qVar = tVar.delta;
        if ((i5 & 524288) != 0) {
            xVar2 = anVar.charlie;
        } else {
            xVar2 = xVar;
        }
        if ((i5 & 1048576) != 0) {
            iVar2 = tVar.foxtrot;
        } else {
            iVar2 = iVar;
        }
        int i12 = tVar.golf;
        int i13 = tVar.hotel;
        O0.s sVar2 = tVar.india;
        if (C0366t.charlie(j11, afVar.alpha.bravo())) {
            oVar = afVar.alpha;
        } else if (j11 != 16) {
            oVar = new O0.c(j11);
        } else {
            oVar = O0.n.alpha;
        }
        v vVar3 = null;
        if (xVar2 != null) {
            wVar = xVar2.alpha;
        } else {
            wVar = null;
        }
        af afVar2 = new af(oVar, j12, vVar2, rVar, sVar, kVar2, str, j13, aVar, pVar, bVar, j15, lVar, arVar, wVar, eVar);
        if (xVar2 != null) {
            vVar3 = xVar2.bravo;
        }
        return new an(afVar2, new t(i10, i11, j14, qVar, vVar3, iVar2, i12, i13, sVar2), xVar2);
    }

    public static an echo(an anVar, long j5, long j6, H0.v vVar, H0.r rVar, H0.k kVar, long j7, O0.l lVar, int i4, long j10, int i5) {
        long j11;
        long j12;
        H0.v vVar2;
        H0.r rVar2;
        H0.k kVar2;
        long j13;
        O0.l lVar2;
        int i10;
        long j14;
        if ((i5 & 1) != 0) {
            j11 = C0366t.kilo;
        } else {
            j11 = j5;
        }
        if ((i5 & 2) != 0) {
            j12 = Q0.p.charlie;
        } else {
            j12 = j6;
        }
        if ((i5 & 4) != 0) {
            vVar2 = null;
        } else {
            vVar2 = vVar;
        }
        if ((i5 & 8) != 0) {
            rVar2 = null;
        } else {
            rVar2 = rVar;
        }
        if ((i5 & 32) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if ((i5 & 128) != 0) {
            j13 = Q0.p.charlie;
        } else {
            j13 = j7;
        }
        long j15 = C0366t.kilo;
        if ((i5 & 4096) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if ((32768 & i5) != 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        } else {
            i10 = i4;
        }
        if ((i5 & 131072) != 0) {
            j14 = Q0.p.charlie;
        } else {
            j14 = j10;
        }
        af alpha = ag.alpha(anVar.alpha, j11, null, Float.NaN, j12, vVar2, rVar2, null, kVar2, null, j13, null, null, null, j15, lVar2, null, null, null);
        t alpha2 = u.alpha(anVar.bravo, i10, RecyclerView.UNDEFINED_DURATION, j14, null, null, null, 0, RecyclerView.UNDEFINED_DURATION, null);
        if (anVar.alpha == alpha && anVar.bravo == alpha2) {
            return anVar;
        }
        return new an(alpha, alpha2);
    }

    public final long bravo() {
        return this.alpha.alpha.bravo();
    }

    public final boolean charlie(an anVar) {
        if (this != anVar) {
            if (!Intrinsics.areEqual(this.bravo, anVar.bravo) || !this.alpha.alpha(anVar.alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final an delta(an anVar) {
        if (anVar != null && !Intrinsics.areEqual(anVar, delta)) {
            return new an(this.alpha.charlie(anVar.alpha), this.bravo.alpha(anVar.bravo));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if (Intrinsics.areEqual(this.alpha, anVar.alpha) && Intrinsics.areEqual(this.bravo, anVar.bravo) && Intrinsics.areEqual(this.charlie, anVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        x xVar = this.charlie;
        if (xVar != null) {
            i4 = xVar.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) C0366t.india(bravo()));
        sb2.append(", brush=");
        af afVar = this.alpha;
        sb2.append(afVar.alpha.echo());
        sb2.append(", alpha=");
        sb2.append(afVar.alpha.alpha());
        sb2.append(", fontSize=");
        sb2.append((Object) Q0.p.echo(afVar.bravo));
        sb2.append(", fontWeight=");
        sb2.append(afVar.charlie);
        sb2.append(", fontStyle=");
        sb2.append(afVar.delta);
        sb2.append(", fontSynthesis=");
        sb2.append(afVar.echo);
        sb2.append(", fontFamily=");
        sb2.append(afVar.foxtrot);
        sb2.append(", fontFeatureSettings=");
        sb2.append(afVar.golf);
        sb2.append(", letterSpacing=");
        sb2.append((Object) Q0.p.echo(afVar.hotel));
        sb2.append(", baselineShift=");
        sb2.append(afVar.india);
        sb2.append(", textGeometricTransform=");
        sb2.append(afVar.juliet);
        sb2.append(", localeList=");
        sb2.append(afVar.kilo);
        sb2.append(", background=");
        ao.ad.bronze(afVar.lima, ", textDecoration=", sb2);
        sb2.append(afVar.mike);
        sb2.append(", shadow=");
        sb2.append(afVar.november);
        sb2.append(", drawStyle=");
        sb2.append(afVar.papa);
        sb2.append(", textAlign=");
        t tVar = this.bravo;
        sb2.append((Object) O0.k.alpha(tVar.alpha));
        sb2.append(", textDirection=");
        sb2.append((Object) O0.m.alpha(tVar.bravo));
        sb2.append(", lineHeight=");
        sb2.append((Object) Q0.p.echo(tVar.charlie));
        sb2.append(", textIndent=");
        sb2.append(tVar.delta);
        sb2.append(", platformStyle=");
        sb2.append(this.charlie);
        sb2.append(", lineHeightStyle=");
        sb2.append(tVar.foxtrot);
        sb2.append(", lineBreak=");
        sb2.append((Object) O0.e.alpha(tVar.golf));
        sb2.append(", hyphens=");
        sb2.append((Object) O0.d.alpha(tVar.hotel));
        sb2.append(", textMotion=");
        sb2.append(tVar.india);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public an(af afVar, t tVar) {
        this(afVar, tVar, (r0 == null && r1 == null) ? null : new x(r0, r1));
        w wVar = afVar.oscar;
        v vVar = tVar.echo;
    }

    public an(long j5, long j6, H0.v vVar, H0.r rVar, H0.k kVar, long j7, int i4, long j10, int i5, int i10) {
        this(new af((i10 & 1) != 0 ? C0366t.kilo : j5, (i10 & 2) != 0 ? Q0.p.charlie : j6, (i10 & 4) != 0 ? null : vVar, (i10 & 8) != 0 ? null : rVar, (H0.s) null, (i10 & 32) != 0 ? null : kVar, (String) null, (i10 & 128) != 0 ? Q0.p.charlie : j7, (O0.a) null, (O0.p) null, (K0.b) null, C0366t.kilo, (O0.l) null, (ar) null, (w) null), new t((32768 & i10) != 0 ? RecyclerView.UNDEFINED_DURATION : i4, RecyclerView.UNDEFINED_DURATION, (131072 & i10) != 0 ? Q0.p.charlie : j10, null, null, null, (i10 & 2097152) != 0 ? 0 : i5, RecyclerView.UNDEFINED_DURATION, null), null);
    }
}
