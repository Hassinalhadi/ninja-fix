package N2;

import av.ah;
import q0.AbstractC2367C;
import q0.AbstractC2372H;
import q0.AbstractC2375K;
import q0.InterfaceC2392k;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import q0.ao;
import q0.aq;
import q0.ar;
import s0.InterfaceC2558s;
import s0.an;
import s6.AbstractC2627c7;
import s6.J4;
import t6.M2;

/* loaded from: classes3.dex */
public final class w extends T.r implements InterfaceC2558s, s0.ab {
    public n alpha;
    public T.f purple;
    public InterfaceC2392k red;
    public float silver;

    public final long b(long j5) {
        if (Z.e.echo(j5)) {
            return 0L;
        }
        long mo1getIntrinsicSizeNHjbRc = this.alpha.mo1getIntrinsicSizeNHjbRc();
        if (mo1getIntrinsicSizeNHjbRc != 9205357640488583168L) {
            float delta = Z.e.delta(mo1getIntrinsicSizeNHjbRc);
            if (Float.isInfinite(delta) || Float.isNaN(delta)) {
                delta = Z.e.delta(j5);
            }
            float bravo = Z.e.bravo(mo1getIntrinsicSizeNHjbRc);
            if (Float.isInfinite(bravo) || Float.isNaN(bravo)) {
                bravo = Z.e.bravo(j5);
            }
            long alpha = M2.alpha(delta, bravo);
            long alpha2 = this.red.alpha(alpha, j5);
            int i4 = AbstractC2372H.alpha;
            float intBitsToFloat = Float.intBitsToFloat((int) (alpha2 >> 32));
            if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & alpha2));
                if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                    return AbstractC2375K.juliet(alpha, alpha2);
                }
                return j5;
            }
            return j5;
        }
        return j5;
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    public final long c(long j5) {
        boolean z2;
        float juliet;
        int india;
        float charlie;
        boolean foxtrot = Q0.a.foxtrot(j5);
        boolean echo = Q0.a.echo(j5);
        if (!foxtrot || !echo) {
            if (Q0.a.delta(j5) && Q0.a.charlie(j5)) {
                z2 = true;
            } else {
                z2 = false;
            }
            long mo1getIntrinsicSizeNHjbRc = this.alpha.mo1getIntrinsicSizeNHjbRc();
            if (mo1getIntrinsicSizeNHjbRc == 9205357640488583168L) {
                if (z2) {
                    return Q0.a.alpha(j5, Q0.a.hotel(j5), 0, Q0.a.golf(j5), 0, 10);
                }
            } else {
                if (z2 && (foxtrot || echo)) {
                    juliet = Q0.a.hotel(j5);
                    india = Q0.a.golf(j5);
                } else {
                    float delta = Z.e.delta(mo1getIntrinsicSizeNHjbRc);
                    float bravo = Z.e.bravo(mo1getIntrinsicSizeNHjbRc);
                    if (!Float.isInfinite(delta) && !Float.isNaN(delta)) {
                        Y2.e eVar = af.bravo;
                        juliet = J4.charlie(delta, Q0.a.juliet(j5), Q0.a.hotel(j5));
                    } else {
                        juliet = Q0.a.juliet(j5);
                    }
                    if (!Float.isInfinite(bravo) && !Float.isNaN(bravo)) {
                        Y2.e eVar2 = af.bravo;
                        charlie = J4.charlie(bravo, Q0.a.india(j5), Q0.a.golf(j5));
                        long b2 = b(M2.alpha(juliet, charlie));
                        return Q0.a.alpha(j5, Q0.b.golf(Zd.a.delta(Z.e.delta(b2)), j5), 0, Q0.b.foxtrot(Zd.a.delta(Z.e.bravo(b2)), j5), 0, 10);
                    }
                    india = Q0.a.india(j5);
                }
                charlie = india;
                long b22 = b(M2.alpha(juliet, charlie));
                return Q0.a.alpha(j5, Q0.b.golf(Zd.a.delta(Z.e.delta(b22)), j5), 0, Q0.b.foxtrot(Zd.a.delta(Z.e.bravo(b22)), j5), 0, 10);
            }
        }
        return j5;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.InterfaceC2558s
    public final void jade(an anVar) {
        c0.b bVar = anVar.alpha;
        long b2 = b(bVar.purple.oscar());
        T.f fVar = this.purple;
        Y2.e eVar = af.bravo;
        long alpha = AbstractC2627c7.alpha(Zd.a.delta(Z.e.delta(b2)), Zd.a.delta(Z.e.bravo(b2)));
        long oscar = bVar.purple.oscar();
        long alpha2 = fVar.alpha(alpha, AbstractC2627c7.alpha(Zd.a.delta(Z.e.delta(oscar)), Zd.a.delta(Z.e.bravo(oscar))), anVar.getLayoutDirection());
        float f5 = (int) (alpha2 >> 32);
        float f10 = (int) (alpha2 & 4294967295L);
        ((ah) bVar.purple.alpha).red(f5, f10);
        this.alpha.m205drawx_KDEd0(anVar, b2, this.silver, null);
        ((ah) bVar.purple.alpha).red(-f5, -f10);
        anVar.charlie();
    }

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.alpha.mo1getIntrinsicSizeNHjbRc() != 9205357640488583168L) {
            int delta = interfaceC2401t.delta(Q0.a.hotel(c(Q0.b.bravo(i4, 0, 13))));
            return Math.max(Zd.a.delta(Z.e.bravo(b(M2.alpha(i4, delta)))), delta);
        }
        return interfaceC2401t.delta(i4);
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.alpha.mo1getIntrinsicSizeNHjbRc() != 9205357640488583168L) {
            int romeo = interfaceC2401t.romeo(Q0.a.golf(c(Q0.b.bravo(0, i4, 7))));
            return Math.max(Zd.a.delta(Z.e.delta(b(M2.alpha(romeo, i4)))), romeo);
        }
        return interfaceC2401t.romeo(i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final aq mo0measure3p2s80s(ar arVar, ao aoVar, long j5) {
        AbstractC2367C victor = aoVar.victor(c(j5));
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new t(victor, 1));
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.alpha.mo1getIntrinsicSizeNHjbRc() != 9205357640488583168L) {
            int jade = interfaceC2401t.jade(Q0.a.hotel(c(Q0.b.bravo(i4, 0, 13))));
            return Math.max(Zd.a.delta(Z.e.bravo(b(M2.alpha(i4, jade)))), jade);
        }
        return interfaceC2401t.jade(i4);
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.alpha.mo1getIntrinsicSizeNHjbRc() != 9205357640488583168L) {
            int lima = interfaceC2401t.lima(Q0.a.golf(c(Q0.b.bravo(0, i4, 7))));
            return Math.max(Zd.a.delta(Z.e.delta(b(M2.alpha(lima, i4)))), lima);
        }
        return interfaceC2401t.lima(i4);
    }
}
