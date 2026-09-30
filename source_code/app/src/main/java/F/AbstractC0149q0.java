package F;

import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import y.AbstractC3355O;
import y.C3354N;

/* renamed from: F.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0149q0 {
    static {
        C0564b.coral(P.yellow);
    }

    public static final void alpha(O o5, Y1 y12, S2 s22, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        O o10;
        int i10;
        Y1 y13;
        S2 s23;
        Y1 y14;
        char c3;
        char c4;
        Y1 y15;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 3;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2127166334);
        if ((i4 & 6) == 0) {
            if ((i5 & 1) == 0) {
                o10 = o5;
                if (c0585q.golf(o10)) {
                    i14 = 4;
                    i10 = i14 | i4;
                }
            } else {
                o10 = o5;
            }
            i14 = 2;
            i10 = i14 | i4;
        } else {
            o10 = o5;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2) == 0) {
                y13 = y12;
                if (c0585q.golf(y13)) {
                    i13 = 32;
                    i10 |= i13;
                }
            } else {
                y13 = y12;
            }
            i13 = 16;
            i10 |= i13;
        } else {
            y13 = y12;
        }
        if ((i4 & 384) == 0) {
            if ((i5 & 4) == 0) {
                s23 = s22;
                if (c0585q.golf(s23)) {
                    i12 = Barcode.FORMAT_QR_CODE;
                    i10 |= i12;
                }
            } else {
                s23 = s22;
            }
            i12 = 128;
            i10 |= i12;
        } else {
            s23 = s22;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(lVar)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) == 1170 && c0585q.bronze()) {
            c0585q.ochre();
            y15 = y13;
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                y14 = y13;
            } else {
                if ((i5 & 1) != 0) {
                    o10 = (O) c0585q.kilo(Q.alpha);
                }
                if ((i5 & 2) != 0) {
                    y14 = (Y1) c0585q.kilo(Z1.alpha);
                } else {
                    y14 = y13;
                }
                if ((i5 & 4) != 0) {
                    s23 = (S2) c0585q.kilo(T2.alpha);
                }
            }
            c0585q.romeo();
            b.D bravo = L1.bravo(false, 0.0f, c0585q, 0, 7);
            long j5 = o10.alpha;
            boolean foxtrot = c0585q.foxtrot(j5);
            Object jade = c0585q.jade();
            if (!foxtrot && jade != C0580l.alpha) {
                c3 = 2;
                c4 = 4;
            } else {
                c3 = 2;
                c4 = 4;
                jade = new C3354N(j5, C0366t.bravo(0.4f, j5));
                c0585q.f(jade);
            }
            androidx.compose.runtime.O alpha = Q.alpha.alpha(o10);
            androidx.compose.runtime.O alpha2 = androidx.compose.foundation.d.alpha.alpha(bravo);
            androidx.compose.runtime.O alpha3 = E.o.alpha.alpha(S.alpha);
            androidx.compose.runtime.O alpha4 = Z1.alpha.alpha(y14);
            androidx.compose.runtime.O alpha5 = AbstractC3355O.alpha.alpha((C3354N) jade);
            androidx.compose.runtime.O alpha6 = T2.alpha.alpha(s23);
            androidx.compose.runtime.O[] oArr = new androidx.compose.runtime.O[6];
            oArr[0] = alpha;
            oArr[1] = alpha2;
            oArr[c3] = alpha3;
            oArr[3] = alpha4;
            oArr[c4] = alpha5;
            oArr[5] = alpha6;
            C0564b.bravo(oArr, P.e.echo(-1066563262, new C0092c(s23, lVar, i15), c0585q), c0585q, 56);
            y15 = y14;
        }
        O o11 = o10;
        S2 s24 = s23;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0124k(o11, y15, s24, lVar, i4, i5, 1);
        }
    }
}
