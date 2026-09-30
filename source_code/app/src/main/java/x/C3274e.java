package x;

import D0.ae;
import D0.an;
import D0.s;
import Q0.n;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.maps.android.BuildConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n.at;
import q0.InterfaceC2402u;
import t6.Y2;
import t6.Z2;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3274e {
    public String alpha;
    public an bravo;
    public H0.j charlie;
    public int delta;
    public boolean echo;
    public int foxtrot;
    public int golf;
    public InterfaceC2402u india;
    public D0.a juliet;
    public boolean kilo;
    public long lima;
    public C3271b mike;
    public s november;
    public n oscar;
    public long sierra;
    public long hotel = AbstractC3270a.alpha;
    public long papa = Q0.b.hotel(0, 0, 0, 0);
    public int quebec = -1;
    public int romeo = -1;

    public C3274e(String str, an anVar, H0.j jVar, int i4, boolean z2, int i5, int i10) {
        this.alpha = str;
        this.bravo = anVar;
        this.charlie = jVar;
        this.delta = i4;
        this.echo = z2;
        this.foxtrot = i5;
        this.golf = i10;
        long j5 = 0;
        this.lima = (j5 & 4294967295L) | (j5 << 32);
    }

    public static long foxtrot(C3274e c3274e, long j5, n nVar) {
        an anVar = c3274e.bravo;
        C3271b c3271b = c3274e.mike;
        InterfaceC2402u interfaceC2402u = c3274e.india;
        Intrinsics.checkNotNull(interfaceC2402u);
        C3271b alpha = Z2.alpha(c3271b, nVar, anVar, interfaceC2402u, c3274e.charlie);
        c3274e.mike = alpha;
        return alpha.alpha(c3274e.golf, j5);
    }

    public final int alpha(int i4, n nVar) {
        int i5;
        int i10 = this.quebec;
        int i11 = this.romeo;
        if (i4 == i10 && i10 != -1) {
            return i11;
        }
        long alpha = Q0.b.alpha(0, i4, 0, LottieConstants.IterateForever);
        if (this.golf > 1) {
            alpha = foxtrot(this, alpha, nVar);
        }
        s echo = echo(nVar);
        long delta = Y2.delta(alpha, this.echo, this.delta, echo.romeo());
        boolean z2 = this.echo;
        int i12 = this.delta;
        int i13 = this.foxtrot;
        if ((!z2 && (i12 == 2 || i12 == 4 || i12 == 5)) || i13 < 1) {
            i5 = 1;
        } else {
            i5 = i13;
        }
        int oscar = at.oscar(new D0.a((L0.d) echo, i5, i12, delta).bravo());
        int india = Q0.a.india(alpha);
        if (oscar < india) {
            oscar = india;
        }
        this.quebec = i4;
        this.romeo = oscar;
        return oscar;
    }

    public final boolean bravo(long j5, n nVar) {
        long j6;
        int i4;
        s sVar;
        this.sierra = (this.sierra << 2) | 3;
        boolean z2 = true;
        if (this.golf > 1) {
            j6 = foxtrot(this, j5, nVar);
        } else {
            j6 = j5;
        }
        D0.a aVar = this.juliet;
        boolean z10 = false;
        if (aVar != null && (sVar = this.november) != null && !sVar.delta() && nVar == this.oscar && (Q0.a.bravo(j6, this.papa) || (Q0.a.hotel(j6) == Q0.a.hotel(this.papa) && Q0.a.juliet(j6) == Q0.a.juliet(this.papa) && Q0.a.golf(j6) >= aVar.bravo() && !aVar.delta.delta))) {
            if (!Q0.a.bravo(j6, this.papa)) {
                D0.a aVar2 = this.juliet;
                Intrinsics.checkNotNull(aVar2);
                this.lima = Q0.b.delta(j6, (at.oscar(Math.min(aVar2.alpha.f1701b.charlie(), aVar2.delta())) << 32) | (at.oscar(aVar2.bravo()) & 4294967295L));
                if (this.delta == 3 || (((int) (r12 >> 32)) >= aVar2.delta() && ((int) (4294967295L & r12)) >= aVar2.bravo())) {
                    z2 = false;
                }
                this.kilo = z2;
                this.papa = j6;
            }
            return false;
        }
        s echo = echo(nVar);
        long delta = Y2.delta(j6, this.echo, this.delta, echo.romeo());
        boolean z11 = this.echo;
        int i5 = this.delta;
        int i10 = this.foxtrot;
        if ((!z11 && (i5 == 2 || i5 == 4 || i5 == 5)) || i10 < 1) {
            i4 = 1;
        } else {
            i4 = i10;
        }
        D0.a aVar3 = new D0.a((L0.d) echo, i4, i5, delta);
        this.papa = j6;
        this.lima = Q0.b.delta(j6, (at.oscar(aVar3.bravo()) & 4294967295L) | (at.oscar(aVar3.delta()) << 32));
        if (this.delta != 3 && (((int) (r1 >> 32)) < aVar3.delta() || ((int) (r1 & 4294967295L)) < aVar3.bravo())) {
            z10 = true;
        }
        this.kilo = z10;
        this.juliet = aVar3;
        return true;
    }

    public final void charlie() {
        this.juliet = null;
        this.november = null;
        this.oscar = null;
        this.quebec = -1;
        this.romeo = -1;
        this.papa = Q0.b.hotel(0, 0, 0, 0);
        long j5 = 0;
        this.lima = (j5 & 4294967295L) | (j5 << 32);
        this.kilo = false;
    }

    public final void delta(InterfaceC2402u interfaceC2402u) {
        long j5;
        InterfaceC2402u interfaceC2402u2 = this.india;
        if (interfaceC2402u != null) {
            int i4 = AbstractC3270a.bravo;
            j5 = AbstractC3270a.alpha(interfaceC2402u.alpha(), interfaceC2402u.indigo());
        } else {
            j5 = AbstractC3270a.alpha;
        }
        if (interfaceC2402u2 == null) {
            this.india = interfaceC2402u;
            this.hotel = j5;
        } else {
            if (interfaceC2402u != null && this.hotel == j5) {
                return;
            }
            this.india = interfaceC2402u;
            this.hotel = j5;
            this.sierra = (this.sierra << 2) | 1;
            charlie();
        }
    }

    public final s echo(n nVar) {
        s sVar = this.november;
        if (sVar == null || nVar != this.oscar || sVar.delta()) {
            this.oscar = nVar;
            String str = this.alpha;
            an hotel = ae.hotel(this.bravo, nVar);
            List emptyList = CollectionsKt.emptyList();
            InterfaceC2402u interfaceC2402u = this.india;
            Intrinsics.checkNotNull(interfaceC2402u);
            sVar = new L0.d(str, hotel, emptyList, CollectionsKt.emptyList(), this.charlie, interfaceC2402u);
        }
        this.november = sVar;
        return sVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.juliet != null) {
            str = "<paragraph>";
        } else {
            str = BuildConfig.TRAVIS;
        }
        sb2.append(str);
        sb2.append(", lastDensity=");
        sb2.append((Object) AbstractC3270a.bravo(this.hotel));
        sb2.append(", history=");
        return Q0.c.mike(this.sierra, ", constraints=$)", sb2);
    }
}
