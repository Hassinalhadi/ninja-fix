package F;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class P2 {
    public static final float alpha;
    public static final float bravo;
    public static final float charlie;

    static {
        float f5 = H.x.alpha;
        alpha = f5;
        bravo = f5;
        charlie = H.v.alpha;
        int i4 = H.u.alpha;
    }

    public static M2 alpha(long j5, long j6, long j7, long j10, C0585q c0585q) {
        M2 m22;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15 = C0366t.kilo;
        O o5 = (O) c0585q.kilo(Q.alpha);
        M2 m23 = o5.jade;
        if (m23 == null) {
            int i4 = H.w.alpha;
            M2 m24 = new M2(Q.charlie(o5, 35), Q.charlie(o5, H.w.charlie), Q.charlie(o5, H.w.bravo), Q.charlie(o5, H.w.alpha), Q.charlie(o5, H.w.delta));
            o5.jade = m24;
            m22 = m24;
            j14 = j5;
            j12 = j7;
            j13 = j10;
            j11 = j6;
        } else {
            m22 = m23;
            j11 = j6;
            j12 = j7;
            j13 = j10;
            j14 = j5;
        }
        return m22.alpha(j14, j15, j11, j12, j13);
    }

    public static B9.ab bravo(R2 r22, C0585q c0585q) {
        return new B9.ab(r22, AbstractC0779d.juliet(400.0f, null, 5), bx.L.alpha(c0585q), N2.alpha, 13);
    }

    public static androidx.compose.foundation.layout.G charlie(InterfaceC0581m interfaceC0581m) {
        WeakHashMap weakHashMap = androidx.compose.foundation.layout.b0.whiskey;
        androidx.compose.foundation.layout.b0 foxtrot = C0537c.foxtrot(interfaceC0581m);
        return new androidx.compose.foundation.layout.G(foxtrot.golf, AbstractC0538d.hotel | 16);
    }

    public static M2 delta(long j5, long j6, long j7, InterfaceC0581m interfaceC0581m, int i4) {
        long j10;
        long j11;
        M2 m22;
        if ((i4 & 2) != 0) {
            j10 = C0366t.kilo;
        } else {
            j10 = j6;
        }
        long j12 = C0366t.kilo;
        if ((i4 & 8) != 0) {
            j11 = j12;
        } else {
            j11 = j7;
        }
        O o5 = (O) ((C0585q) interfaceC0581m).kilo(Q.alpha);
        M2 m23 = o5.ivory;
        if (m23 == null) {
            float f5 = H.x.alpha;
            M2 m24 = new M2(Q.charlie(o5, 35), Q.charlie(o5, H.x.echo), Q.charlie(o5, H.x.delta), Q.charlie(o5, H.x.bravo), Q.charlie(o5, H.x.foxtrot));
            o5.ivory = m24;
            m22 = m24;
        } else {
            m22 = m23;
        }
        return m22.alpha(j5, j10, j12, j11, j12);
    }
}
