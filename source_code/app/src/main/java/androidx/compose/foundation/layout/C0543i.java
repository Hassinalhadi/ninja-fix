package androidx.compose.foundation.layout;

import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* renamed from: androidx.compose.foundation.layout.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0543i extends T.r implements s0.ab {
    public float alpha;

    public final long b(long j5, boolean z2) {
        int round;
        int golf = Q0.a.golf(j5);
        if (golf != Integer.MAX_VALUE && (round = Math.round(golf * this.alpha)) > 0) {
            if (!z2 || AbstractC0538d.oscar(round, golf, j5)) {
                return (round << 32) | (golf & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long c(long j5, boolean z2) {
        int round;
        int hotel = Q0.a.hotel(j5);
        if (hotel != Integer.MAX_VALUE && (round = Math.round(hotel / this.alpha)) > 0) {
            if (!z2 || AbstractC0538d.oscar(hotel, round, j5)) {
                return (hotel << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long d(long j5, boolean z2) {
        int india = Q0.a.india(j5);
        int round = Math.round(india * this.alpha);
        if (round > 0) {
            if (!z2 || AbstractC0538d.oscar(round, india, j5)) {
                return (round << 32) | (india & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long e(long j5, boolean z2) {
        int juliet = Q0.a.juliet(j5);
        int round = Math.round(juliet / this.alpha);
        if (round > 0) {
            if (!z2 || AbstractC0538d.oscar(juliet, round, j5)) {
                return (juliet << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (i4 != Integer.MAX_VALUE) {
            return Math.round(i4 / this.alpha);
        }
        return interfaceC2401t.delta(i4);
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (i4 != Integer.MAX_VALUE) {
            return Math.round(i4 * this.alpha);
        }
        return interfaceC2401t.romeo(i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        boolean z2;
        boolean z10 = true;
        long c3 = c(j5, true);
        if (Q0.m.alpha(c3, 0L)) {
            c3 = b(j5, true);
            if (Q0.m.alpha(c3, 0L)) {
                c3 = e(j5, true);
                if (Q0.m.alpha(c3, 0L)) {
                    c3 = d(j5, true);
                    if (Q0.m.alpha(c3, 0L)) {
                        c3 = c(j5, false);
                        if (Q0.m.alpha(c3, 0L)) {
                            c3 = b(j5, false);
                            if (Q0.m.alpha(c3, 0L)) {
                                c3 = e(j5, false);
                                if (Q0.m.alpha(c3, 0L)) {
                                    c3 = d(j5, false);
                                    if (Q0.m.alpha(c3, 0L)) {
                                        c3 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!Q0.m.alpha(c3, 0L)) {
            int i4 = (int) (c3 >> 32);
            int i5 = (int) (c3 & 4294967295L);
            if (i4 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i5 < 0) {
                z10 = false;
            }
            if (!(z10 & z2)) {
                Q0.j.alpha("width and height must be >= 0");
            }
            j5 = Q0.b.hotel(i4, i4, i5, i5);
        }
        AbstractC2367C victor = aoVar.victor(j5);
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 2));
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (i4 != Integer.MAX_VALUE) {
            return Math.round(i4 / this.alpha);
        }
        return interfaceC2401t.jade(i4);
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (i4 != Integer.MAX_VALUE) {
            return Math.round(i4 * this.alpha);
        }
        return interfaceC2401t.lima(i4);
    }
}
