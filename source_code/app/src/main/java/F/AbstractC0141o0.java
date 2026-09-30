package F;

import a0.AbstractC0367u;
import a0.C0360n;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import g0.AbstractC1722b;
import g0.C1726f;
import kotlin.jvm.functions.Function1;
import q0.C2391j;
import t0.AbstractC2911e0;
import t0.C2932p;

/* renamed from: F.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0141o0 {
    public static final T.s alpha = androidx.compose.foundation.layout.V.kilo(T.p.alpha, H.j.alpha);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if ((r23 & 8) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        if (java.lang.Float.isInfinite(Z.e.bravo(r1)) != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(AbstractC1680b abstractC1680b, String str, T.s sVar, long j5, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        long j6;
        int i12;
        T.s sVar3;
        long j7;
        boolean z2;
        Object c0360n;
        T.s sVar4;
        boolean z10;
        androidx.compose.runtime.Q uniform;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2142239481);
        if ((i4 & 6) == 0) {
            if (c0585q.india(abstractC1680b)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        int i16 = i5 & 4;
        if (i16 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) != 0) {
                j6 = j5;
                if ((i5 & 8) == 0 && c0585q.foxtrot(j6)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
            } else {
                j6 = j5;
            }
            if ((i10 & 1171) != 1170 && c0585q.bronze()) {
                c0585q.ochre();
            } else {
                c0585q.orange();
                i12 = i4 & 1;
                sVar3 = T.p.alpha;
                if (i12 == 0 && !c0585q.beige()) {
                    c0585q.ochre();
                } else {
                    if (i16 != 0) {
                        sVar2 = sVar3;
                    }
                    if ((i5 & 8) != 0) {
                        j6 = ((C0366t) c0585q.kilo(Y.alpha)).alpha;
                        i10 &= -7169;
                    }
                    j7 = j6;
                    c0585q.romeo();
                    if ((((i10 & 7168) ^ 3072) <= 2048 && c0585q.foxtrot(j7)) || (i10 & 3072) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object jade = c0585q.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (z2 && jade != asVar) {
                        c0360n = jade;
                    } else {
                        if (!C0366t.charlie(j7, C0366t.kilo)) {
                            c0360n = null;
                        } else {
                            c0360n = new C0360n(j7, 5);
                        }
                        c0585q.f(c0360n);
                    }
                    AbstractC0367u abstractC0367u = (AbstractC0367u) c0360n;
                    c0585q.purple(-2144891392);
                    if (str == null) {
                        if ((i10 & 112) == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Object jade2 = c0585q.jade();
                        if (z10 || jade2 == asVar) {
                            jade2 = new A0.q(str, 3);
                            c0585q.f(jade2);
                        }
                        sVar4 = A0.o.bravo(sVar3, false, (Function1) jade2);
                    } else {
                        sVar4 = sVar3;
                    }
                    c0585q.quebec(false);
                    C2932p c2932p = AbstractC2911e0.alpha;
                    if (!Z.e.alpha(abstractC1680b.mo1getIntrinsicSizeNHjbRc(), 9205357640488583168L)) {
                        long mo1getIntrinsicSizeNHjbRc = abstractC1680b.mo1getIntrinsicSizeNHjbRc();
                        if (Float.isInfinite(Z.e.delta(mo1getIntrinsicSizeNHjbRc))) {
                        }
                        AbstractC0547m.alpha(androidx.compose.ui.draw.a.delta(sVar2.then(sVar3), abstractC1680b, null, C2391j.bravo, 0.0f, abstractC0367u, 22).then(sVar4), c0585q, 0);
                        j6 = j7;
                    }
                    sVar3 = alpha;
                    AbstractC0547m.alpha(androidx.compose.ui.draw.a.delta(sVar2.then(sVar3), abstractC1680b, null, C2391j.bravo, 0.0f, abstractC0367u, 22).then(sVar4), c0585q, 0);
                    j6 = j7;
                }
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0137n0(abstractC1680b, str, sVar2, j6, i4, i5, 1);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i4 & 3072) != 0) {
        }
        if ((i10 & 1171) != 1170) {
        }
        c0585q.orange();
        i12 = i4 & 1;
        sVar3 = T.p.alpha;
        if (i12 == 0) {
        }
        if (i16 != 0) {
        }
        if ((i5 & 8) != 0) {
        }
        j7 = j6;
        c0585q.romeo();
        if (((i10 & 7168) ^ 3072) <= 2048) {
        }
        z2 = false;
        Object jade3 = c0585q.jade();
        androidx.compose.runtime.as asVar2 = C0580l.alpha;
        if (z2) {
        }
        if (!C0366t.charlie(j7, C0366t.kilo)) {
        }
        c0585q.f(c0360n);
        AbstractC0367u abstractC0367u2 = (AbstractC0367u) c0360n;
        c0585q.purple(-2144891392);
        if (str == null) {
        }
        c0585q.quebec(false);
        C2932p c2932p2 = AbstractC2911e0.alpha;
        if (!Z.e.alpha(abstractC1680b.mo1getIntrinsicSizeNHjbRc(), 9205357640488583168L)) {
        }
        sVar3 = alpha;
        AbstractC0547m.alpha(androidx.compose.ui.draw.a.delta(sVar2.then(sVar3), abstractC1680b, null, C2391j.bravo, 0.0f, abstractC0367u2, 22).then(sVar4), c0585q, 0);
        j6 = j7;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(C1726f c1726f, String str, T.s sVar, long j5, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        long j6;
        T.s sVar3;
        T.s sVar4;
        long j7;
        T.s sVar5;
        long j10;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-126890956);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(c1726f)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    j6 = j5;
                    if (c0585q.foxtrot(j6)) {
                        i12 = 2048;
                        i10 |= i12;
                    }
                } else {
                    j6 = j5;
                }
                i12 = Barcode.FORMAT_UPC_E;
                i10 |= i12;
            } else {
                j6 = j5;
            }
            if ((i10 & 1171) != 1170 && c0585q.bronze()) {
                c0585q.ochre();
                j10 = j6;
                sVar5 = sVar2;
            } else {
                c0585q.orange();
                if ((i4 & 1) == 0 && !c0585q.beige()) {
                    c0585q.ochre();
                    if ((i5 & 8) != 0) {
                        i10 &= -7169;
                    }
                    sVar4 = sVar2;
                } else {
                    if (i15 == 0) {
                        sVar3 = T.p.alpha;
                    } else {
                        sVar3 = sVar2;
                    }
                    if ((i5 & 8) == 0) {
                        i10 &= -7169;
                        sVar4 = sVar3;
                        j7 = ((C0366t) c0585q.kilo(Y.alpha)).alpha;
                        c0585q.romeo();
                        alpha(AbstractC1722b.bravo(c1726f, c0585q), str, sVar4, j7, c0585q, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168), 0);
                        sVar5 = sVar4;
                        j10 = j7;
                    } else {
                        sVar4 = sVar3;
                    }
                }
                j7 = j6;
                c0585q.romeo();
                alpha(AbstractC1722b.bravo(c1726f, c0585q), str, sVar4, j7, c0585q, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168), 0);
                sVar5 = sVar4;
                j10 = j7;
            }
            androidx.compose.runtime.Q uniform = c0585q.uniform();
            if (uniform != null) {
                uniform.delta = new C0137n0(c1726f, str, sVar5, j10, i4, i5, 0);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i4 & 3072) != 0) {
        }
        if ((i10 & 1171) != 1170) {
        }
        c0585q.orange();
        if ((i4 & 1) == 0) {
        }
        if (i15 == 0) {
        }
        if ((i5 & 8) == 0) {
        }
    }
}
