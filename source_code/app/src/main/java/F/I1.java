package F;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import bz.AbstractC0782g;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;
import t6.T3;

/* loaded from: classes3.dex */
public abstract class I1 {
    public static final float alpha;
    public static final float bravo = 12;
    public static final float charlie;

    static {
        float f5 = 2;
        alpha = f5;
        charlie = f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005a  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(boolean z2, Function0 function0, T.s sVar, boolean z10, H1 h1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        float f5;
        long j5;
        boolean z13;
        androidx.compose.runtime.D0 d02;
        Object black;
        ?? r10;
        androidx.compose.runtime.D0 d03;
        T.s sVar3;
        boolean z14;
        T.s sVar4;
        boolean golf;
        Object jade;
        T.s sVar5;
        androidx.compose.runtime.Q uniform;
        int i15;
        int i16;
        int i17;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(408580840);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function0)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                z11 = z10;
                if (c0585q.hotel(z11)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                if ((i4 & 24576) == 0) {
                    if (c0585q.golf(h1)) {
                        i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i15 = 8192;
                    }
                    i10 |= i15;
                }
                if (((i10 | 196608) & 74899) != 74898 && c0585q.bronze()) {
                    c0585q.ochre();
                    sVar5 = sVar2;
                    z14 = z11;
                } else {
                    c0585q.orange();
                    i14 = i4 & 1;
                    T.s sVar6 = T.p.alpha;
                    if (i14 == 0 && !c0585q.beige()) {
                        c0585q.ochre();
                    } else {
                        if (i18 != 0) {
                            sVar2 = sVar6;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                    }
                    T.s sVar7 = sVar2;
                    z12 = z11;
                    c0585q.romeo();
                    if (z2) {
                        f5 = bravo / 2;
                    } else {
                        f5 = 0;
                    }
                    androidx.compose.runtime.D0 alpha2 = AbstractC0782g.alpha(f5, AbstractC0779d.kilo(100, 0, null, 6), c0585q);
                    if (!z12 && z2) {
                        j5 = h1.alpha;
                    } else if (!z12 && !z2) {
                        j5 = h1.bravo;
                    } else if (z12 && z2) {
                        j5 = h1.charlie;
                    } else {
                        j5 = h1.delta;
                    }
                    if (z12) {
                        c0585q.purple(350067971);
                        long j6 = j5;
                        z13 = false;
                        d02 = alpha2;
                        black = bx.F.alpha(j6, AbstractC0779d.kilo(100, 0, null, 6), c0585q, 48, 12);
                        c0585q.quebec(false);
                    } else {
                        long j7 = j5;
                        z13 = false;
                        d02 = alpha2;
                        c0585q.purple(350170674);
                        black = C0564b.black(new C0366t(j7), c0585q);
                        c0585q.quebec(false);
                    }
                    c0585q.purple(1327106656);
                    if (function0 != null) {
                        sVar3 = sVar7;
                        r10 = z13;
                        d03 = d02;
                        z14 = z12;
                        sVar4 = androidx.compose.foundation.selection.b.alpha(sVar6, z2, null, L1.bravo(z13, H.q.bravo / 2, c0585q, 54, 4), z14, new A0.h(3), function0);
                    } else {
                        r10 = z13;
                        d03 = d02;
                        sVar3 = sVar7;
                        z14 = z12;
                        sVar4 = sVar6;
                    }
                    c0585q.quebec(r10);
                    if (function0 != null) {
                        androidx.compose.runtime.E0 e02 = AbstractC0145p0.alpha;
                        sVar6 = MinimumInteractiveModifier.alpha;
                    }
                    T.s hotel = androidx.compose.foundation.layout.V.hotel(AbstractC0538d.sierra(androidx.compose.foundation.layout.V.sierra(sVar3.then(sVar6).then(sVar4), T.d.teal, 2), alpha), H.q.alpha);
                    golf = c0585q.golf(black) | c0585q.golf(d03);
                    jade = c0585q.jade();
                    if (!golf || jade == C0580l.alpha) {
                        jade = new B2.ap(7, black, d03);
                        c0585q.f(jade);
                    }
                    T3.alpha(hotel, (Function1) jade, c0585q, r10);
                    sVar5 = sVar3;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new A(z2, function0, sVar5, z14, h1, i4, i5, 1);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((i4 & 24576) == 0) {
            }
            if (((i10 | 196608) & 74899) != 74898) {
            }
            c0585q.orange();
            i14 = i4 & 1;
            T.s sVar62 = T.p.alpha;
            if (i14 == 0) {
            }
            if (i18 != 0) {
            }
            if (i12 != 0) {
            }
            T.s sVar72 = sVar2;
            z12 = z11;
            c0585q.romeo();
            if (z2) {
            }
            androidx.compose.runtime.D0 alpha22 = AbstractC0782g.alpha(f5, AbstractC0779d.kilo(100, 0, null, 6), c0585q);
            if (!z12) {
            }
            if (!z12) {
            }
            if (z12) {
            }
            j5 = h1.delta;
            if (z12) {
            }
            c0585q.purple(1327106656);
            if (function0 != null) {
            }
            c0585q.quebec(r10);
            if (function0 != null) {
            }
            T.s hotel2 = androidx.compose.foundation.layout.V.hotel(AbstractC0538d.sierra(androidx.compose.foundation.layout.V.sierra(sVar3.then(sVar62).then(sVar4), T.d.teal, 2), alpha), H.q.alpha);
            golf = c0585q.golf(black) | c0585q.golf(d03);
            jade = c0585q.jade();
            if (!golf) {
            }
            jade = new B2.ap(7, black, d03);
            c0585q.f(jade);
            T3.alpha(hotel2, (Function1) jade, c0585q, r10);
            sVar5 = sVar3;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        sVar2 = sVar;
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        z11 = z10;
        if ((i4 & 24576) == 0) {
        }
        if (((i10 | 196608) & 74899) != 74898) {
        }
        c0585q.orange();
        i14 = i4 & 1;
        T.s sVar622 = T.p.alpha;
        if (i14 == 0) {
        }
        if (i18 != 0) {
        }
        if (i12 != 0) {
        }
        T.s sVar722 = sVar2;
        z12 = z11;
        c0585q.romeo();
        if (z2) {
        }
        androidx.compose.runtime.D0 alpha222 = AbstractC0782g.alpha(f5, AbstractC0779d.kilo(100, 0, null, 6), c0585q);
        if (!z12) {
        }
        if (!z12) {
        }
        if (z12) {
        }
        j5 = h1.delta;
        if (z12) {
        }
        c0585q.purple(1327106656);
        if (function0 != null) {
        }
        c0585q.quebec(r10);
        if (function0 != null) {
        }
        T.s hotel22 = androidx.compose.foundation.layout.V.hotel(AbstractC0538d.sierra(androidx.compose.foundation.layout.V.sierra(sVar3.then(sVar622).then(sVar4), T.d.teal, 2), alpha), H.q.alpha);
        golf = c0585q.golf(black) | c0585q.golf(d03);
        jade = c0585q.jade();
        if (!golf) {
        }
        jade = new B2.ap(7, black, d03);
        c0585q.f(jade);
        T3.alpha(hotel22, (Function1) jade, c0585q, r10);
        sVar5 = sVar3;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }
}
