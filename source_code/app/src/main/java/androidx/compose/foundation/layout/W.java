package androidx.compose.foundation.layout;

import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class W extends T.r implements s0.ab {
    public float alpha;
    public float purple;
    public float red;
    public float silver;
    public boolean teal;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(InterfaceC2402u interfaceC2402u) {
        int i4;
        int i5;
        int i10;
        int i11 = 0;
        if (!Float.isNaN(this.red)) {
            i4 = interfaceC2402u.ochre(this.red);
            if (i4 < 0) {
                i4 = 0;
            }
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (!Float.isNaN(this.silver)) {
            i5 = interfaceC2402u.ochre(this.silver);
            if (i5 < 0) {
                i5 = 0;
            }
        } else {
            i5 = Integer.MAX_VALUE;
        }
        if (!Float.isNaN(this.alpha)) {
            i10 = interfaceC2402u.ochre(this.alpha);
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 > i4) {
                i10 = i4;
            }
        }
        i10 = 0;
        if (!Float.isNaN(this.purple)) {
            int ochre = interfaceC2402u.ochre(this.purple);
            if (ochre < 0) {
                ochre = 0;
            }
            if (ochre > i5) {
                ochre = i5;
            }
            if (ochre != Integer.MAX_VALUE) {
                i11 = ochre;
            }
        }
        return Q0.b.alpha(i10, i4, i11, i5);
    }

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        long b2 = b(interfaceC2402u);
        if (Q0.a.echo(b2)) {
            return Q0.a.golf(b2);
        }
        if (!this.teal) {
            i4 = Q0.b.golf(i4, b2);
        }
        return Q0.b.foxtrot(interfaceC2401t.delta(i4), b2);
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        long b2 = b(interfaceC2402u);
        if (Q0.a.foxtrot(b2)) {
            return Q0.a.hotel(b2);
        }
        if (!this.teal) {
            i4 = Q0.b.foxtrot(i4, b2);
        }
        return Q0.b.golf(interfaceC2401t.romeo(i4), b2);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        int juliet;
        int hotel;
        int india;
        int golf;
        long alpha;
        long b2 = b(arVar);
        if (this.teal) {
            alpha = Q0.b.echo(j5, b2);
        } else {
            if (!Float.isNaN(this.alpha)) {
                juliet = Q0.a.juliet(b2);
            } else {
                juliet = Q0.a.juliet(j5);
                int hotel2 = Q0.a.hotel(b2);
                if (juliet > hotel2) {
                    juliet = hotel2;
                }
            }
            if (!Float.isNaN(this.red)) {
                hotel = Q0.a.hotel(b2);
            } else {
                hotel = Q0.a.hotel(j5);
                int juliet2 = Q0.a.juliet(b2);
                if (hotel < juliet2) {
                    hotel = juliet2;
                }
            }
            if (!Float.isNaN(this.purple)) {
                india = Q0.a.india(b2);
            } else {
                india = Q0.a.india(j5);
                int golf2 = Q0.a.golf(b2);
                if (india > golf2) {
                    india = golf2;
                }
            }
            if (!Float.isNaN(this.silver)) {
                golf = Q0.a.golf(b2);
            } else {
                golf = Q0.a.golf(j5);
                int india2 = Q0.a.india(b2);
                if (golf < india2) {
                    golf = india2;
                }
            }
            alpha = Q0.b.alpha(juliet, hotel, india, golf);
        }
        AbstractC2367C victor = aoVar.victor(alpha);
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 5));
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        long b2 = b(interfaceC2402u);
        if (Q0.a.echo(b2)) {
            return Q0.a.golf(b2);
        }
        if (!this.teal) {
            i4 = Q0.b.golf(i4, b2);
        }
        return Q0.b.foxtrot(interfaceC2401t.jade(i4), b2);
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        long b2 = b(interfaceC2402u);
        if (Q0.a.foxtrot(b2)) {
            return Q0.a.hotel(b2);
        }
        if (!this.teal) {
            i4 = Q0.b.foxtrot(i4, b2);
        }
        return Q0.b.golf(interfaceC2401t.lima(i4), b2);
    }
}
