package s6;

/* renamed from: s6.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2804w5 {
    public static final long alpha(long j5, long j6) {
        boolean z2;
        boolean z10;
        int delta;
        boolean z11;
        boolean z12;
        boolean z13;
        int foxtrot = D0.am.foxtrot(j5);
        int echo = D0.am.echo(j5);
        boolean z14 = true;
        if (D0.am.foxtrot(j6) < D0.am.echo(j5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (D0.am.foxtrot(j5) < D0.am.echo(j6)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z2 & z10) {
            if (D0.am.foxtrot(j6) <= D0.am.foxtrot(j5)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (D0.am.echo(j5) <= D0.am.echo(j6)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 & z12) {
                foxtrot = D0.am.foxtrot(j6);
                echo = foxtrot;
            } else {
                if (D0.am.foxtrot(j5) <= D0.am.foxtrot(j6)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (D0.am.echo(j6) > D0.am.echo(j5)) {
                    z14 = false;
                }
                if (z13 & z14) {
                    delta = D0.am.delta(j6);
                } else {
                    int foxtrot2 = D0.am.foxtrot(j6);
                    if (foxtrot < D0.am.echo(j6) && foxtrot2 <= foxtrot) {
                        foxtrot = D0.am.foxtrot(j6);
                        delta = D0.am.delta(j6);
                    } else {
                        echo = D0.am.foxtrot(j6);
                    }
                }
                echo -= delta;
            }
        } else if (echo > D0.am.foxtrot(j6)) {
            foxtrot -= D0.am.delta(j6);
            delta = D0.am.delta(j6);
            echo -= delta;
        }
        return D0.ae.bravo(foxtrot, echo);
    }

    public static final int bravo(boolean z2, j.l lVar, int i4) {
        if (z2) {
            return ((j.m) lVar.mike.get(i4)).papa;
        }
        return ((j.m) lVar.mike.get(i4)).quebec;
    }
}
