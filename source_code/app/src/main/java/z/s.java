package z;

import a0.AbstractC0367u;
import a0.C0360n;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import g0.AbstractC1722b;
import g0.C1726f;
import kotlin.jvm.functions.Function1;
import q0.C2391j;
import t0.AbstractC2911e0;
import t0.C2932p;

/* loaded from: classes3.dex */
public abstract class s {
    public static final T.s alpha = V.kilo(T.p.alpha, 24);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if ((r23 & 8) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r7 & 4294967295L))) != false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(AbstractC1680b abstractC1680b, String str, T.s sVar, long j5, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        long j6;
        boolean z2;
        Q uniform;
        boolean z10;
        C0360n c0360n;
        T.s sVar3;
        int i12;
        int i13;
        boolean z11 = true;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1142959010);
        if (c0585q.india(abstractC1680b)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i4;
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i14 |= i13;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i14 |= i11;
            if ((i4 & 3072) != 0) {
                j6 = j5;
                if ((i5 & 8) == 0 && c0585q.foxtrot(j6)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i14 |= i12;
            } else {
                j6 = j5;
            }
            if ((i14 & 1171) == 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i14 & 1, z2)) {
                c0585q.orange();
                int i16 = i4 & 1;
                T.s sVar4 = T.p.alpha;
                if (i16 != 0 && !c0585q.beige()) {
                    c0585q.ochre();
                } else {
                    if (i15 != 0) {
                        sVar2 = sVar4;
                    }
                    if ((i5 & 8) != 0) {
                        j6 = C0366t.bravo(((Number) c0585q.kilo(AbstractC3451e.alpha)).floatValue(), ((C0366t) c0585q.kilo(g.alpha)).alpha);
                        i14 &= -7169;
                    }
                    c0585q.romeo();
                    if ((((i14 & 7168) ^ 3072) > 2048 && c0585q.foxtrot(j6)) || (i14 & 3072) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object jade = c0585q.jade();
                    as asVar = C0580l.alpha;
                    if (z10 || jade == asVar) {
                        if (C0366t.charlie(j6, C0366t.kilo)) {
                            c0360n = null;
                        } else {
                            c0360n = new C0360n(j6, 5);
                        }
                        jade = c0360n;
                        c0585q.f(jade);
                    }
                    AbstractC0367u abstractC0367u = (AbstractC0367u) jade;
                    if (str != null) {
                        c0585q.purple(609231686);
                        if ((i14 & 112) != 32) {
                            z11 = false;
                        }
                        Object jade2 = c0585q.jade();
                        if (z11 || jade2 == asVar) {
                            jade2 = new Lb.ae(str, 12);
                            c0585q.f(jade2);
                        }
                        sVar3 = A0.o.bravo(sVar4, false, (Function1) jade2);
                        c0585q.quebec(false);
                    } else {
                        c0585q.purple(609390468);
                        c0585q.quebec(false);
                        sVar3 = sVar4;
                    }
                    C2932p c2932p = AbstractC2911e0.alpha;
                    if (!Z.e.alpha(abstractC1680b.mo1getIntrinsicSizeNHjbRc(), 9205357640488583168L)) {
                        long mo1getIntrinsicSizeNHjbRc = abstractC1680b.mo1getIntrinsicSizeNHjbRc();
                        if (Float.isInfinite(Float.intBitsToFloat((int) (mo1getIntrinsicSizeNHjbRc >> 32)))) {
                        }
                        AbstractC0547m.alpha(androidx.compose.ui.draw.a.delta(sVar2.then(sVar4), abstractC1680b, null, C2391j.bravo, 0.0f, abstractC0367u, 22).then(sVar3), c0585q, 0);
                        j6 = j6;
                    }
                    sVar4 = alpha;
                    AbstractC0547m.alpha(androidx.compose.ui.draw.a.delta(sVar2.then(sVar4), abstractC1680b, null, C2391j.bravo, 0.0f, abstractC0367u, 22).then(sVar3), c0585q, 0);
                    j6 = j6;
                }
            } else {
                c0585q.ochre();
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Ec.ak(abstractC1680b, str, sVar2, j6, i4, i5);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i4 & 3072) != 0) {
        }
        if ((i14 & 1171) == 1170) {
        }
        if (!c0585q.magenta(i14 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(C1726f c1726f, String str, T.s sVar, long j5, C0585q c0585q, int i4, int i5) {
        if ((i5 & 4) != 0) {
            sVar = T.p.alpha;
        }
        alpha(AbstractC1722b.bravo(c1726f, c0585q), str, sVar, j5, c0585q, (i4 & 112) | 8 | (i4 & 896) | 3072, 0);
    }
}
