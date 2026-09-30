package z;

import a0.C0366t;
import sb.C2844c;

/* loaded from: classes3.dex */
public abstract class aa {
    public static final androidx.compose.runtime.aa alpha = new androidx.compose.runtime.aa(new C2844c(23));
    public static final ab bravo;
    public static final ab charlie;
    public static final E.g delta;
    public static final E.g echo;
    public static final E.g foxtrot;

    static {
        long j5 = C0366t.kilo;
        bravo = new ab(Float.NaN, j5, true);
        charlie = new ab(Float.NaN, j5, false);
        delta = new E.g(0.16f, 0.24f, 0.08f, 0.24f);
        echo = new E.g(0.08f, 0.12f, 0.04f, 0.12f);
        foxtrot = new E.g(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static ab alpha(int i4) {
        boolean z2;
        float f5 = r.alpha;
        if ((i4 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i4 & 2) != 0) {
            f5 = Float.NaN;
        }
        long j5 = C0366t.kilo;
        if (Q0.g.alpha(f5, Float.NaN) && C0366t.charlie(j5, j5)) {
            if (z2) {
                return bravo;
            }
            return charlie;
        }
        return new ab(f5, j5, z2);
    }
}
