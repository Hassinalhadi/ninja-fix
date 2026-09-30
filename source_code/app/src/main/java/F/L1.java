package F;

import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;

/* loaded from: classes3.dex */
public abstract class L1 {
    public static final androidx.compose.runtime.E0 alpha = new androidx.compose.runtime.N(P.e);
    public static final androidx.compose.runtime.aa bravo = new androidx.compose.runtime.aa(P.f1047d);
    public static final M1 charlie;
    public static final M1 delta;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.E0, androidx.compose.runtime.N] */
    static {
        long j5 = C0366t.kilo;
        charlie = new M1(Float.NaN, j5, true);
        delta = new M1(Float.NaN, j5, false);
    }

    public static final M1 alpha(float f5, long j5, boolean z2) {
        if (Q0.g.alpha(f5, Float.NaN) && C0366t.charlie(j5, C0366t.kilo)) {
            if (z2) {
                return charlie;
            }
            return delta;
        }
        return new M1(f5, j5, z2);
    }

    public static final b.D bravo(boolean z2, float f5, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        b.D alpha2;
        boolean z10;
        boolean z11 = true;
        if ((i5 & 1) != 0) {
            z2 = true;
        }
        if ((i5 & 2) != 0) {
            f5 = Float.NaN;
        }
        long j5 = C0366t.kilo;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.purple(-1280632857);
        if (((Boolean) c0585q.kilo(alpha)).booleanValue()) {
            bz.f0 f0Var = E.l.alpha;
            androidx.compose.runtime.ax black = C0564b.black(new C0366t(j5), c0585q);
            if ((((i4 & 14) ^ 6) > 4 && c0585q.hotel(z2)) || (i4 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((((i4 & 112) ^ 48) <= 32 || !c0585q.delta(f5)) && (i4 & 48) != 32) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object jade = c0585q.jade();
            if (z12 || jade == C0580l.alpha) {
                jade = new E.d(z2, f5, black);
                c0585q.f(jade);
            }
            alpha2 = (E.d) jade;
        } else {
            alpha2 = alpha(f5, j5, z2);
        }
        c0585q.quebec(false);
        return alpha2;
    }
}
