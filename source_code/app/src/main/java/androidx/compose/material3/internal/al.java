package androidx.compose.material3.internal;

import a0.AbstractC0362p;
import a0.C0366t;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.X;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import s6.AbstractC2797v7;
import s6.C6;
import s6.J4;

/* loaded from: classes3.dex */
public final class al extends Lambda implements Xd.l {
    public final /* synthetic */ D0.an alpha;
    public final /* synthetic */ D0.an purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ X silver;
    public final /* synthetic */ Xd.l teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ X yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(D0.an anVar, D0.an anVar2, float f5, X x4, Xd.l lVar, boolean z2, X x5) {
        super(2);
        this.alpha = anVar;
        this.purple = anVar2;
        this.red = f5;
        this.silver = x4;
        this.teal = lVar;
        this.white = z2;
        this.yellow = x5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        float f5;
        D0.w wVar;
        D0.v vVar;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        D0.an anVar = this.alpha;
        D0.an anVar2 = this.purple;
        O0.o oVar = D0.ag.delta;
        D0.af afVar = anVar.alpha;
        O0.o oVar2 = afVar.alpha;
        D0.af afVar2 = anVar2.alpha;
        O0.o oVar3 = afVar2.alpha;
        boolean z2 = oVar2 instanceof O0.b;
        O0.o oVar4 = O0.n.alpha;
        float f10 = this.red;
        if (!z2 && !(oVar3 instanceof O0.b)) {
            long quebec = a0.ao.quebec(oVar2.bravo(), oVar3.bravo(), f10);
            if (quebec != 16) {
                oVar4 = new O0.c(quebec);
            }
        } else if (z2 && (oVar3 instanceof O0.b)) {
            O0.b bVar = (O0.b) oVar2;
            O0.b bVar2 = (O0.b) oVar3;
            AbstractC0362p abstractC0362p = (AbstractC0362p) D0.ag.bravo(bVar.alpha, bVar2.alpha, f10);
            float echo = AbstractC2797v7.echo(bVar.bravo, bVar2.bravo, f10);
            if (abstractC0362p != null) {
                if (abstractC0362p instanceof a0.au) {
                    long bravo = C6.bravo(echo, ((a0.au) abstractC0362p).alpha);
                    if (bravo != 16) {
                        oVar4 = new O0.c(bravo);
                    }
                } else if (abstractC0362p instanceof a0.aq) {
                    oVar4 = new O0.b((a0.aq) abstractC0362p, echo);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            oVar4 = (O0.o) D0.ag.bravo(oVar2, oVar3, f10);
        }
        O0.o oVar5 = oVar4;
        H0.k kVar = (H0.k) D0.ag.bravo(afVar.foxtrot, afVar2.foxtrot, f10);
        long charlie = D0.ag.charlie(afVar.bravo, afVar2.bravo, f10);
        H0.v vVar2 = afVar.charlie;
        if (vVar2 == null) {
            vVar2 = H0.v.yellow;
        }
        H0.v vVar3 = afVar2.charlie;
        if (vVar3 == null) {
            vVar3 = H0.v.yellow;
        }
        H0.v vVar4 = new H0.v(J4.delta(AbstractC2797v7.foxtrot(vVar2.alpha, vVar3.alpha, f10), 1, 1000));
        H0.r rVar = (H0.r) D0.ag.bravo(afVar.delta, afVar2.delta, f10);
        H0.s sVar = (H0.s) D0.ag.bravo(afVar.echo, afVar2.echo, f10);
        String str = (String) D0.ag.bravo(afVar.golf, afVar2.golf, f10);
        long charlie2 = D0.ag.charlie(afVar.hotel, afVar2.hotel, f10);
        float f11 = 0.0f;
        O0.a aVar = afVar.india;
        if (aVar != null) {
            f5 = aVar.alpha;
        } else {
            f5 = 0.0f;
        }
        O0.a aVar2 = afVar2.india;
        if (aVar2 != null) {
            f11 = aVar2.alpha;
        }
        float echo2 = AbstractC2797v7.echo(f5, f11, f10);
        O0.p pVar = O0.p.charlie;
        O0.p pVar2 = afVar.juliet;
        if (pVar2 == null) {
            pVar2 = pVar;
        }
        O0.p pVar3 = afVar2.juliet;
        if (pVar3 != null) {
            pVar = pVar3;
        }
        O0.p pVar4 = new O0.p(AbstractC2797v7.echo(pVar2.alpha, pVar.alpha, f10), AbstractC2797v7.echo(pVar2.bravo, pVar.bravo, f10));
        K0.b bVar3 = (K0.b) D0.ag.bravo(afVar.kilo, afVar2.kilo, f10);
        long quebec2 = a0.ao.quebec(afVar.lima, afVar2.lima, f10);
        O0.l lVar = (O0.l) D0.ag.bravo(afVar.mike, afVar2.mike, f10);
        a0.ar arVar = afVar.november;
        if (arVar == null) {
            arVar = new a0.ar();
        }
        a0.ar arVar2 = afVar2.november;
        if (arVar2 == null) {
            arVar2 = new a0.ar();
        }
        long quebec3 = a0.ao.quebec(arVar.alpha, arVar2.alpha, f10);
        long j5 = arVar.bravo;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        long j6 = arVar2.bravo;
        float echo3 = AbstractC2797v7.echo(intBitsToFloat, Float.intBitsToFloat((int) (j6 >> 32)), f10);
        float echo4 = AbstractC2797v7.echo(Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j6 & 4294967295L)), f10);
        a0.ar arVar3 = new a0.ar(quebec3, (Float.floatToRawIntBits(echo3) << 32) | (Float.floatToRawIntBits(echo4) & 4294967295L), AbstractC2797v7.echo(arVar.charlie, arVar2.charlie, f10));
        D0.w wVar2 = afVar.oscar;
        if (wVar2 == null && afVar2.oscar == null) {
            wVar = null;
        } else {
            if (wVar2 == null) {
                wVar2 = D0.w.alpha;
            }
            wVar = wVar2;
        }
        D0.af afVar3 = new D0.af(oVar5, charlie, vVar4, rVar, sVar, kVar, str, charlie2, new O0.a(echo2), pVar4, bVar3, quebec2, lVar, arVar3, wVar, (c0.e) D0.ag.bravo(afVar.papa, afVar2.papa, f10));
        int i4 = D0.u.bravo;
        D0.t tVar = anVar.bravo;
        O0.k kVar2 = new O0.k(tVar.alpha);
        D0.t tVar2 = anVar2.bravo;
        int i5 = ((O0.k) D0.ag.bravo(kVar2, new O0.k(tVar2.alpha), f10)).alpha;
        int i10 = ((O0.m) D0.ag.bravo(new O0.m(tVar.bravo), new O0.m(tVar2.bravo), f10)).alpha;
        long charlie3 = D0.ag.charlie(tVar.charlie, tVar2.charlie, f10);
        O0.q qVar = tVar.delta;
        if (qVar == null) {
            qVar = O0.q.charlie;
        }
        O0.q qVar2 = tVar2.delta;
        if (qVar2 == null) {
            qVar2 = O0.q.charlie;
        }
        O0.q qVar3 = new O0.q(D0.ag.charlie(qVar.alpha, qVar2.alpha, f10), D0.ag.charlie(qVar.bravo, qVar2.bravo, f10));
        D0.v vVar5 = tVar.echo;
        D0.v vVar6 = tVar2.echo;
        if (vVar5 == null && vVar6 == null) {
            vVar = null;
        } else {
            D0.v vVar7 = D0.v.bravo;
            if (vVar5 == null) {
                vVar5 = vVar7;
            }
            if (vVar6 == null) {
                vVar6 = vVar7;
            }
            boolean z10 = vVar5.alpha;
            boolean z11 = vVar6.alpha;
            if (z10 != z11) {
                ((D0.j) D0.ag.bravo(new Object(), new Object(), f10)).getClass();
                vVar5 = new D0.v(((Boolean) D0.ag.bravo(Boolean.valueOf(z10), Boolean.valueOf(z11), f10)).booleanValue());
            }
            vVar = vVar5;
        }
        D0.an anVar3 = new D0.an(afVar3, new D0.t(i5, i10, charlie3, qVar3, vVar, (O0.i) D0.ag.bravo(tVar.foxtrot, tVar2.foxtrot, f10), ((O0.e) D0.ag.bravo(new O0.e(tVar.golf), new O0.e(tVar2.golf), f10)).alpha, ((O0.d) D0.ag.bravo(new O0.d(tVar.hotel), new O0.d(tVar2.hotel), f10)).alpha, (O0.s) D0.ag.bravo(tVar.india, tVar2.india, f10)));
        if (this.white) {
            anVar3 = D0.an.alpha(anVar3, ((C0366t) this.yellow.getValue()).alpha, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
        }
        at.bravo(((C0366t) this.silver.getValue()).alpha, anVar3, this.teal, interfaceC0581m, 0);
        return Unit.INSTANCE;
    }
}
