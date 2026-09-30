package x;

import B9.ab;
import D0.ae;
import D0.aj;
import D0.ak;
import D0.an;
import D0.o;
import Q0.n;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.maps.android.BuildConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n.at;
import t6.Y2;
import t6.Z2;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3273d {
    public D0.g alpha;
    public H0.j bravo;
    public int charlie;
    public boolean delta;
    public int echo;
    public int foxtrot;
    public List golf;
    public C3271b hotel;
    public Q0.d juliet;
    public an kilo;
    public ab lima;
    public n mike;
    public ak november;
    public long quebec;
    public long india = AbstractC3270a.alpha;
    public int oscar = -1;
    public int papa = -1;

    public C3273d(D0.g gVar, an anVar, H0.j jVar, int i4, boolean z2, int i5, int i10, List list) {
        this.alpha = gVar;
        this.bravo = jVar;
        this.charlie = i4;
        this.delta = z2;
        this.echo = i5;
        this.foxtrot = i10;
        this.golf = list;
        this.kilo = anVar;
    }

    public final int alpha(int i4, n nVar) {
        int i5 = this.oscar;
        int i10 = this.papa;
        if (i4 == i5 && i5 != -1) {
            return i10;
        }
        long alpha = Q0.b.alpha(0, i4, 0, LottieConstants.IterateForever);
        if (this.foxtrot > 1) {
            C3271b c3271b = this.hotel;
            an anVar = this.kilo;
            Q0.d dVar = this.juliet;
            Intrinsics.checkNotNull(dVar);
            C3271b alpha2 = Z2.alpha(c3271b, nVar, anVar, dVar, this.bravo);
            this.hotel = alpha2;
            alpha = alpha2.alpha(this.foxtrot, alpha);
        }
        int oscar = at.oscar(bravo(alpha, nVar).echo);
        int india = Q0.a.india(alpha);
        if (oscar < india) {
            oscar = india;
        }
        this.oscar = i4;
        this.papa = oscar;
        return oscar;
    }

    public final o bravo(long j5, n nVar) {
        int i4;
        ab echo = echo(nVar);
        long delta = Y2.delta(j5, this.delta, this.charlie, echo.romeo());
        boolean z2 = this.delta;
        int i5 = this.charlie;
        int i10 = this.echo;
        if ((!z2 && (i5 == 2 || i5 == 4 || i5 == 5)) || i10 < 1) {
            i4 = 1;
        } else {
            i4 = i10;
        }
        return new o(echo, delta, i4, i5);
    }

    public final boolean charlie(long j5, n nVar) {
        this.quebec = (this.quebec << 2) | 3;
        if (this.foxtrot > 1) {
            C3271b c3271b = this.hotel;
            an anVar = this.kilo;
            Q0.d dVar = this.juliet;
            Intrinsics.checkNotNull(dVar);
            C3271b alpha = Z2.alpha(c3271b, nVar, anVar, dVar, this.bravo);
            this.hotel = alpha;
            j5 = alpha.alpha(this.foxtrot, j5);
        }
        ak akVar = this.november;
        if (akVar != null) {
            o oVar = akVar.bravo;
            if (!oVar.alpha.delta()) {
                aj ajVar = akVar.alpha;
                if (nVar == ajVar.hotel) {
                    long j6 = ajVar.juliet;
                    if (Q0.a.bravo(j5, j6) || (Q0.a.hotel(j5) == Q0.a.hotel(j6) && Q0.a.juliet(j5) == Q0.a.juliet(j6) && Q0.a.golf(j5) >= oVar.echo && !oVar.charlie)) {
                        ak akVar2 = this.november;
                        Intrinsics.checkNotNull(akVar2);
                        if (Q0.a.bravo(j5, akVar2.alpha.juliet)) {
                            return false;
                        }
                        ak akVar3 = this.november;
                        Intrinsics.checkNotNull(akVar3);
                        this.november = foxtrot(nVar, j5, akVar3.bravo);
                        return true;
                    }
                }
            }
        }
        this.november = foxtrot(nVar, j5, bravo(j5, nVar));
        return true;
    }

    public final void delta(Q0.d dVar) {
        long j5;
        Q0.d dVar2 = this.juliet;
        if (dVar != null) {
            int i4 = AbstractC3270a.bravo;
            j5 = AbstractC3270a.alpha(dVar.alpha(), dVar.indigo());
        } else {
            j5 = AbstractC3270a.alpha;
        }
        if (dVar2 == null) {
            this.juliet = dVar;
            this.india = j5;
        } else {
            if (dVar != null && this.india == j5) {
                return;
            }
            this.juliet = dVar;
            this.india = j5;
            this.quebec = (this.quebec << 2) | 1;
            this.lima = null;
            this.november = null;
            this.papa = -1;
            this.oscar = -1;
        }
    }

    public final ab echo(n nVar) {
        ab abVar = this.lima;
        if (abVar == null || nVar != this.mike || abVar.delta()) {
            this.mike = nVar;
            D0.g gVar = this.alpha;
            an hotel = ae.hotel(this.kilo, nVar);
            Q0.d dVar = this.juliet;
            Intrinsics.checkNotNull(dVar);
            H0.j jVar = this.bravo;
            List list = this.golf;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            abVar = new ab(gVar, hotel, list, dVar, jVar);
        }
        this.lima = abVar;
        return abVar;
    }

    public final ak foxtrot(n nVar, long j5, o oVar) {
        float min = Math.min(oVar.alpha.romeo(), oVar.delta);
        D0.g gVar = this.alpha;
        an anVar = this.kilo;
        List list = this.golf;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        int i4 = this.echo;
        boolean z2 = this.delta;
        int i5 = this.charlie;
        Q0.d dVar = this.juliet;
        Intrinsics.checkNotNull(dVar);
        return new ak(new aj(gVar, anVar, list, i4, z2, i5, dVar, nVar, this.bravo, j5), oVar, Q0.b.delta(j5, (at.oscar(min) << 32) | (at.oscar(oVar.echo) & 4294967295L)));
    }

    public final String toString() {
        String str;
        aj ajVar;
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        ak akVar = this.november;
        Object obj = BuildConfig.TRAVIS;
        if (akVar != null) {
            str = "<TextLayoutResult>";
        } else {
            str = BuildConfig.TRAVIS;
        }
        sb2.append(str);
        sb2.append(", lastDensity=");
        sb2.append((Object) AbstractC3270a.bravo(this.india));
        sb2.append(", history=");
        sb2.append(this.quebec);
        sb2.append(", constraints=");
        ak akVar2 = this.november;
        if (akVar2 != null && (ajVar = akVar2.alpha) != null) {
            obj = new Q0.a(ajVar.juliet);
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
