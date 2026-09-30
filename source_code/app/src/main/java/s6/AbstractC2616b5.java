package s6;

import Jb.C0194b;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import b.C0704t;
import bz.C0797w;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.C1543m;
import gf.AbstractC1792g;
import i.AbstractC1876y;
import i.C1853b;
import i.C1874w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import oe.C2232c;
import oe.C2233d;
import of.AbstractC2254i;
import okhttp3.internal.http2.Http2;
import pe.InterfaceC2321ad;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import qe.InterfaceC2472h;

/* renamed from: s6.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2616b5 {
    /* JADX WARN: Removed duplicated region for block: B:119:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(T.s sVar, C1874w c1874w, androidx.compose.foundation.layout.M m4, InterfaceC0541g interfaceC0541g, T.i iVar, C1543m c1543m, boolean z2, C0704t c0704t, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        androidx.compose.foundation.layout.M m5;
        int i11;
        int i12;
        InterfaceC0541g interfaceC0541g2;
        int i13;
        T.i iVar2;
        int i14;
        C1543m c1543m2;
        int i15;
        boolean z10;
        int i16;
        C0704t c0704t2;
        int i17;
        boolean z11;
        C0585q c0585q;
        C1874w c1874w2;
        androidx.compose.foundation.layout.M m8;
        InterfaceC0541g interfaceC0541g3;
        T.i iVar3;
        C1543m c1543m3;
        boolean z12;
        C0704t c0704t3;
        androidx.compose.runtime.Q uniform;
        C1874w c1874w3;
        int i18;
        C1874w c1874w4;
        InterfaceC0541g interfaceC0541g4;
        int i19;
        C0704t alpha;
        T.i iVar4;
        C1543m c1543m4;
        boolean z13;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(53695811);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(sVar)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i10 = i25 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2) == 0 && c0585q2.golf(c1874w)) {
                i24 = 32;
                i10 |= i24;
            }
            i24 = 16;
            i10 |= i24;
        }
        int i26 = i5 & 4;
        if (i26 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            m5 = m4;
            if (c0585q2.golf(m5)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i5 & 8) == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                if (c0585q2.hotel(false)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i12;
            }
            if ((i4 & 24576) != 0) {
                if ((i5 & 16) == 0) {
                    interfaceC0541g2 = interfaceC0541g;
                    if (c0585q2.golf(interfaceC0541g2)) {
                        i23 = Http2.INITIAL_MAX_FRAME_SIZE;
                        i10 |= i23;
                    }
                } else {
                    interfaceC0541g2 = interfaceC0541g;
                }
                i23 = 8192;
                i10 |= i23;
            } else {
                interfaceC0541g2 = interfaceC0541g;
            }
            i13 = i5 & 32;
            if (i13 == 0) {
                i10 |= 196608;
            } else if ((196608 & i4) == 0) {
                iVar2 = iVar;
                if (c0585q2.golf(iVar2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i10 |= i14;
                if ((1572864 & i4) == 0) {
                    if ((i5 & 64) == 0) {
                        c1543m2 = c1543m;
                        if (c0585q2.golf(c1543m2)) {
                            i22 = 1048576;
                            i10 |= i22;
                        }
                    } else {
                        c1543m2 = c1543m;
                    }
                    i22 = 524288;
                    i10 |= i22;
                } else {
                    c1543m2 = c1543m;
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i10 |= 12582912;
                } else if ((12582912 & i4) == 0) {
                    z10 = z2;
                    if (c0585q2.hotel(z10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i10 |= i16;
                    if ((100663296 & i4) != 0) {
                        if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
                            c0704t2 = c0704t;
                            if (c0585q2.golf(c0704t2)) {
                                i21 = 67108864;
                                i10 |= i21;
                            }
                        } else {
                            c0704t2 = c0704t;
                        }
                        i21 = 33554432;
                        i10 |= i21;
                    } else {
                        c0704t2 = c0704t;
                    }
                    if ((i4 & 805306368) == 0) {
                        if (c0585q2.india(function1)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i10 |= i20;
                    }
                    i17 = i10;
                    if ((i17 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!c0585q2.magenta(i17 & 1, z11)) {
                        c0585q2.orange();
                        if ((i4 & 1) != 0 && !c0585q2.beige()) {
                            c0585q2.ochre();
                            if ((i5 & 2) != 0) {
                                i19 = i17 & (-113);
                            } else {
                                i19 = i17;
                            }
                            if ((i5 & 16) != 0) {
                                i19 &= -57345;
                            }
                            if ((i5 & 64) != 0) {
                                i19 &= -3670017;
                            }
                            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                                i19 &= -234881025;
                            }
                            c1874w4 = c1874w;
                            interfaceC0541g4 = interfaceC0541g2;
                        } else {
                            if ((i5 & 2) != 0) {
                                c1874w3 = AbstractC1876y.alpha(c0585q2);
                                i17 &= -113;
                            } else {
                                c1874w3 = c1874w;
                            }
                            if (i26 != 0) {
                                float f5 = 0;
                                m5 = new androidx.compose.foundation.layout.M(f5, f5, f5, f5);
                            }
                            if ((i5 & 16) != 0) {
                                i17 &= -57345;
                                interfaceC0541g2 = AbstractC0542h.charlie;
                            }
                            if (i13 != 0) {
                                iVar2 = T.d.f2062f;
                            }
                            if ((i5 & 64) != 0) {
                                C0797w alpha2 = bx.L.alpha(c0585q2);
                                boolean golf = c0585q2.golf(alpha2);
                                Object jade = c0585q2.jade();
                                if (golf || jade == C0580l.alpha) {
                                    jade = new C1543m(alpha2);
                                    c0585q2.f(jade);
                                }
                                i18 = i17 & (-3670017);
                                c1543m2 = (C1543m) jade;
                            } else {
                                i18 = i17;
                            }
                            if (i15 != 0) {
                                z10 = true;
                            }
                            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                                c1874w4 = c1874w3;
                                i19 = (-234881025) & i18;
                                alpha = b.V.alpha(c0585q2);
                                interfaceC0541g4 = interfaceC0541g2;
                                iVar4 = iVar2;
                                c1543m4 = c1543m2;
                                z13 = z10;
                                androidx.compose.foundation.layout.M m10 = m5;
                                c0585q2.romeo();
                                int i27 = i19 >> 3;
                                c0585q = c0585q2;
                                AbstractC2625c5.alpha(sVar, c1874w4, m10, true, c1543m4, z13, alpha, iVar4, interfaceC0541g4, null, null, function1, c0585q, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128) | ((i19 << 12) & 1879048192), ((i19 >> 12) & 14) | ((i19 >> 18) & 7168), 6400);
                                c1874w2 = c1874w4;
                                m8 = m10;
                                c1543m3 = c1543m4;
                                z12 = z13;
                                c0704t3 = alpha;
                                iVar3 = iVar4;
                                interfaceC0541g3 = interfaceC0541g4;
                            } else {
                                c1874w4 = c1874w3;
                                interfaceC0541g4 = interfaceC0541g2;
                                i19 = i18;
                            }
                        }
                        iVar4 = iVar2;
                        c1543m4 = c1543m2;
                        z13 = z10;
                        alpha = c0704t2;
                        androidx.compose.foundation.layout.M m102 = m5;
                        c0585q2.romeo();
                        int i272 = i19 >> 3;
                        c0585q = c0585q2;
                        AbstractC2625c5.alpha(sVar, c1874w4, m102, true, c1543m4, z13, alpha, iVar4, interfaceC0541g4, null, null, function1, c0585q, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (458752 & i272) | (3670016 & i272) | (i272 & 29360128) | ((i19 << 12) & 1879048192), ((i19 >> 12) & 14) | ((i19 >> 18) & 7168), 6400);
                        c1874w2 = c1874w4;
                        m8 = m102;
                        c1543m3 = c1543m4;
                        z12 = z13;
                        c0704t3 = alpha;
                        iVar3 = iVar4;
                        interfaceC0541g3 = interfaceC0541g4;
                    } else {
                        c0585q = c0585q2;
                        c0585q.ochre();
                        c1874w2 = c1874w;
                        m8 = m5;
                        interfaceC0541g3 = interfaceC0541g2;
                        iVar3 = iVar2;
                        c1543m3 = c1543m2;
                        z12 = z10;
                        c0704t3 = c0704t2;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new C1853b(sVar, c1874w2, m8, interfaceC0541g3, iVar3, c1543m3, z12, c0704t3, function1, i4, i5, 0);
                        return;
                    }
                    return;
                }
                z10 = z2;
                if ((100663296 & i4) != 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                i17 = i10;
                if ((i17 & 306783379) == 306783378) {
                }
                if (!c0585q2.magenta(i17 & 1, z11)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            iVar2 = iVar;
            if ((1572864 & i4) == 0) {
            }
            i15 = i5 & 128;
            if (i15 != 0) {
            }
            z10 = z2;
            if ((100663296 & i4) != 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            i17 = i10;
            if ((i17 & 306783379) == 306783378) {
            }
            if (!c0585q2.magenta(i17 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        m5 = m4;
        if ((i5 & 8) == 0) {
        }
        if ((i4 & 24576) != 0) {
        }
        i13 = i5 & 32;
        if (i13 == 0) {
        }
        iVar2 = iVar;
        if ((1572864 & i4) == 0) {
        }
        i15 = i5 & 128;
        if (i15 != 0) {
        }
        z10 = z2;
        if ((100663296 & i4) != 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        i17 = i10;
        if ((i17 & 306783379) == 306783378) {
        }
        if (!c0585q2.magenta(i17 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(T.s sVar, C1874w c1874w, androidx.compose.foundation.layout.M m4, InterfaceC0541g interfaceC0541g, T.i iVar, C1543m c1543m, boolean z2, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z10;
        T.i iVar2;
        C1543m c1543m2;
        boolean z11;
        int i13;
        boolean z12;
        C1543m c1543m3;
        T.i iVar3;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-740714857);
        if (c0585q.golf(c1874w)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i14 = i4 | i5;
        if (c0585q.golf(m4)) {
            i10 = Barcode.FORMAT_QR_CODE;
        } else {
            i10 = 128;
        }
        int i15 = i14 | i10 | 3072;
        if (c0585q.golf(interfaceC0541g)) {
            i11 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i11 = 8192;
        }
        int i16 = i15 | i11 | 13303808;
        if (c0585q.india(function1)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i17 = i16 | i12;
        if ((38347923 & i17) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i17 & 1, z10)) {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i13 = i17 & (-3670017);
                iVar3 = iVar;
                c1543m3 = c1543m;
                z12 = z2;
            } else {
                T.i iVar4 = T.d.f2062f;
                C0797w alpha = bx.L.alpha(c0585q);
                boolean golf = c0585q.golf(alpha);
                Object jade = c0585q.jade();
                if (golf || jade == C0580l.alpha) {
                    jade = new C1543m(alpha);
                    c0585q.f(jade);
                }
                C1543m c1543m4 = (C1543m) jade;
                i13 = i17 & (-3670017);
                z12 = true;
                c1543m3 = c1543m4;
                iVar3 = iVar4;
            }
            c0585q.romeo();
            alpha(sVar, c1874w, m4, interfaceC0541g, iVar3, c1543m3, z12, b.V.alpha(c0585q), function1, c0585q, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
            iVar2 = iVar3;
            c1543m2 = c1543m3;
            z11 = z12;
        } else {
            c0585q.ochre();
            iVar2 = iVar;
            c1543m2 = c1543m;
            z11 = z2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0194b(sVar, c1874w, m4, interfaceC0541g, iVar2, c1543m2, z11, function1, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void charlie(T.s sVar, C1874w c1874w, androidx.compose.foundation.layout.M m4, InterfaceC0539e interfaceC0539e, T.j jVar, C1543m c1543m, boolean z2, C0704t c0704t, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        androidx.compose.foundation.layout.M m5;
        int i11;
        int i12;
        InterfaceC0539e interfaceC0539e2;
        int i13;
        T.j jVar2;
        int i14;
        C1543m c1543m2;
        int i15;
        boolean z10;
        int i16;
        C0704t c0704t2;
        int i17;
        boolean z11;
        C0585q c0585q;
        C1874w c1874w2;
        androidx.compose.foundation.layout.M m8;
        InterfaceC0539e interfaceC0539e3;
        T.j jVar3;
        C1543m c1543m3;
        boolean z12;
        C0704t c0704t3;
        androidx.compose.runtime.Q uniform;
        C1874w c1874w3;
        int i18;
        C1874w c1874w4;
        InterfaceC0539e interfaceC0539e4;
        int i19;
        C0704t alpha;
        T.j jVar4;
        C1543m c1543m4;
        boolean z13;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1884325601);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(sVar)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i10 = i25 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2) == 0 && c0585q2.golf(c1874w)) {
                i24 = 32;
                i10 |= i24;
            }
            i24 = 16;
            i10 |= i24;
        }
        int i26 = i5 & 4;
        if (i26 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            m5 = m4;
            if (c0585q2.golf(m5)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i5 & 8) == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                if (c0585q2.hotel(false)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i12;
            }
            if ((i4 & 24576) != 0) {
                if ((i5 & 16) == 0) {
                    interfaceC0539e2 = interfaceC0539e;
                    if (c0585q2.golf(interfaceC0539e2)) {
                        i23 = Http2.INITIAL_MAX_FRAME_SIZE;
                        i10 |= i23;
                    }
                } else {
                    interfaceC0539e2 = interfaceC0539e;
                }
                i23 = 8192;
                i10 |= i23;
            } else {
                interfaceC0539e2 = interfaceC0539e;
            }
            i13 = i5 & 32;
            if (i13 == 0) {
                i10 |= 196608;
            } else if ((196608 & i4) == 0) {
                jVar2 = jVar;
                if (c0585q2.golf(jVar2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i10 |= i14;
                if ((1572864 & i4) == 0) {
                    if ((i5 & 64) == 0) {
                        c1543m2 = c1543m;
                        if (c0585q2.golf(c1543m2)) {
                            i22 = 1048576;
                            i10 |= i22;
                        }
                    } else {
                        c1543m2 = c1543m;
                    }
                    i22 = 524288;
                    i10 |= i22;
                } else {
                    c1543m2 = c1543m;
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i10 |= 12582912;
                } else if ((12582912 & i4) == 0) {
                    z10 = z2;
                    if (c0585q2.hotel(z10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i10 |= i16;
                    if ((100663296 & i4) != 0) {
                        if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
                            c0704t2 = c0704t;
                            if (c0585q2.golf(c0704t2)) {
                                i21 = 67108864;
                                i10 |= i21;
                            }
                        } else {
                            c0704t2 = c0704t;
                        }
                        i21 = 33554432;
                        i10 |= i21;
                    } else {
                        c0704t2 = c0704t;
                    }
                    if ((i4 & 805306368) == 0) {
                        if (c0585q2.india(function1)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i10 |= i20;
                    }
                    i17 = i10;
                    if ((i17 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!c0585q2.magenta(i17 & 1, z11)) {
                        c0585q2.orange();
                        if ((i4 & 1) != 0 && !c0585q2.beige()) {
                            c0585q2.ochre();
                            if ((i5 & 2) != 0) {
                                i19 = i17 & (-113);
                            } else {
                                i19 = i17;
                            }
                            if ((i5 & 16) != 0) {
                                i19 &= -57345;
                            }
                            if ((i5 & 64) != 0) {
                                i19 &= -3670017;
                            }
                            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                                i19 &= -234881025;
                            }
                            c1874w4 = c1874w;
                            interfaceC0539e4 = interfaceC0539e2;
                        } else {
                            if ((i5 & 2) != 0) {
                                c1874w3 = AbstractC1876y.alpha(c0585q2);
                                i17 &= -113;
                            } else {
                                c1874w3 = c1874w;
                            }
                            if (i26 != 0) {
                                float f5 = 0;
                                m5 = new androidx.compose.foundation.layout.M(f5, f5, f5, f5);
                            }
                            if ((i5 & 16) != 0) {
                                i17 &= -57345;
                                interfaceC0539e2 = AbstractC0542h.alpha;
                            }
                            if (i13 != 0) {
                                jVar2 = T.d.f2060c;
                            }
                            if ((i5 & 64) != 0) {
                                C0797w alpha2 = bx.L.alpha(c0585q2);
                                boolean golf = c0585q2.golf(alpha2);
                                Object jade = c0585q2.jade();
                                if (golf || jade == C0580l.alpha) {
                                    jade = new C1543m(alpha2);
                                    c0585q2.f(jade);
                                }
                                i18 = i17 & (-3670017);
                                c1543m2 = (C1543m) jade;
                            } else {
                                i18 = i17;
                            }
                            if (i15 != 0) {
                                z10 = true;
                            }
                            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                                c1874w4 = c1874w3;
                                i19 = (-234881025) & i18;
                                alpha = b.V.alpha(c0585q2);
                                interfaceC0539e4 = interfaceC0539e2;
                                jVar4 = jVar2;
                                c1543m4 = c1543m2;
                                z13 = z10;
                                androidx.compose.foundation.layout.M m10 = m5;
                                c0585q2.romeo();
                                int i27 = i19 >> 3;
                                c0585q = c0585q2;
                                AbstractC2625c5.alpha(sVar, c1874w4, m10, false, c1543m4, z13, alpha, null, null, jVar4, interfaceC0539e4, function1, c0585q, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128), ((i19 >> 12) & 112) | ((i19 >> 6) & 896) | ((i19 >> 18) & 7168), 1792);
                                c1874w2 = c1874w4;
                                m8 = m10;
                                c1543m3 = c1543m4;
                                z12 = z13;
                                c0704t3 = alpha;
                                jVar3 = jVar4;
                                interfaceC0539e3 = interfaceC0539e4;
                            } else {
                                c1874w4 = c1874w3;
                                interfaceC0539e4 = interfaceC0539e2;
                                i19 = i18;
                            }
                        }
                        jVar4 = jVar2;
                        c1543m4 = c1543m2;
                        z13 = z10;
                        alpha = c0704t2;
                        androidx.compose.foundation.layout.M m102 = m5;
                        c0585q2.romeo();
                        int i272 = i19 >> 3;
                        c0585q = c0585q2;
                        AbstractC2625c5.alpha(sVar, c1874w4, m102, false, c1543m4, z13, alpha, null, null, jVar4, interfaceC0539e4, function1, c0585q, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (458752 & i272) | (3670016 & i272) | (i272 & 29360128), ((i19 >> 12) & 112) | ((i19 >> 6) & 896) | ((i19 >> 18) & 7168), 1792);
                        c1874w2 = c1874w4;
                        m8 = m102;
                        c1543m3 = c1543m4;
                        z12 = z13;
                        c0704t3 = alpha;
                        jVar3 = jVar4;
                        interfaceC0539e3 = interfaceC0539e4;
                    } else {
                        c0585q = c0585q2;
                        c0585q.ochre();
                        c1874w2 = c1874w;
                        m8 = m5;
                        interfaceC0539e3 = interfaceC0539e2;
                        jVar3 = jVar2;
                        c1543m3 = c1543m2;
                        z12 = z10;
                        c0704t3 = c0704t2;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new C1853b(sVar, c1874w2, m8, interfaceC0539e3, jVar3, c1543m3, z12, c0704t3, function1, i4, i5, 1);
                        return;
                    }
                    return;
                }
                z10 = z2;
                if ((100663296 & i4) != 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                i17 = i10;
                if ((i17 & 306783379) == 306783378) {
                }
                if (!c0585q2.magenta(i17 & 1, z11)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            jVar2 = jVar;
            if ((1572864 & i4) == 0) {
            }
            i15 = i5 & 128;
            if (i15 != 0) {
            }
            z10 = z2;
            if ((100663296 & i4) != 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            i17 = i10;
            if ((i17 & 306783379) == 306783378) {
            }
            if (!c0585q2.magenta(i17 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        m5 = m4;
        if ((i5 & 8) == 0) {
        }
        if ((i4 & 24576) != 0) {
        }
        i13 = i5 & 32;
        if (i13 == 0) {
        }
        jVar2 = jVar;
        if ((1572864 & i4) == 0) {
        }
        i15 = i5 & 128;
        if (i15 != 0) {
        }
        z10 = z2;
        if ((100663296 & i4) != 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        i17 = i10;
        if ((i17 & 306783379) == 306783378) {
        }
        if (!c0585q2.magenta(i17 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void delta(T.s sVar, C1874w c1874w, androidx.compose.foundation.layout.M m4, InterfaceC0539e interfaceC0539e, T.j jVar, C1543m c1543m, boolean z2, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        int i11;
        int i12;
        boolean z10;
        C1874w c1874w2;
        androidx.compose.foundation.layout.M m5;
        T.j jVar2;
        C1543m c1543m2;
        boolean z11;
        T.s sVar3;
        T.s sVar4;
        C1874w alpha;
        int i13;
        androidx.compose.foundation.layout.M m8;
        boolean z12;
        T.j jVar3;
        C1543m c1543m3;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1724297413);
        int i14 = i5 & 1;
        if (i14 != 0) {
            i11 = i4 | 6;
            sVar2 = sVar;
        } else {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i11 = i4 | i10;
        }
        int i15 = i11 | 13307280;
        if (c0585q.india(function1)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i16 = i15 | i12;
        if ((38347923 & i16) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i16 & 1, z10)) {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                int i17 = i16 & (-3670129);
                m8 = m4;
                jVar3 = jVar;
                c1543m3 = c1543m;
                z12 = z2;
                i13 = i17;
                sVar4 = sVar2;
                alpha = c1874w;
            } else {
                if (i14 != 0) {
                    sVar4 = T.p.alpha;
                } else {
                    sVar4 = sVar2;
                }
                alpha = AbstractC1876y.alpha(c0585q);
                float f5 = 0;
                androidx.compose.foundation.layout.M m10 = new androidx.compose.foundation.layout.M(f5, f5, f5, f5);
                T.j jVar4 = T.d.f2060c;
                C0797w alpha2 = bx.L.alpha(c0585q);
                boolean golf = c0585q.golf(alpha2);
                Object jade = c0585q.jade();
                if (golf || jade == C0580l.alpha) {
                    jade = new C1543m(alpha2);
                    c0585q.f(jade);
                }
                i13 = i16 & (-3670129);
                m8 = m10;
                z12 = true;
                jVar3 = jVar4;
                c1543m3 = (C1543m) jade;
            }
            c0585q.romeo();
            charlie(sVar4, alpha, m8, interfaceC0539e, jVar3, c1543m3, z12, b.V.alpha(c0585q), function1, c0585q, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
            sVar3 = sVar4;
            c1874w2 = alpha;
            m5 = m8;
            jVar2 = jVar3;
            c1543m2 = c1543m3;
            z11 = z12;
        } else {
            c0585q.ochre();
            c1874w2 = c1874w;
            m5 = m4;
            jVar2 = jVar;
            c1543m2 = c1543m;
            z11 = z2;
            sVar3 = sVar2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.view.challenge.b(sVar3, c1874w2, m5, interfaceC0539e, jVar2, c1543m2, z11, function1, i4, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r1.purple == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String echo(InterfaceC2330f klass, Ge.f typeMappingConfiguration) {
        InterfaceC2330f interfaceC2330f;
        Intrinsics.echo(klass, "klass");
        Intrinsics.echo(typeMappingConfiguration, "typeMappingConfiguration");
        InterfaceC2335k lima = klass.lima();
        Intrinsics.delta(lima, "klass.containingDeclaration");
        Ne.f name = klass.getName();
        if (name != null) {
            Ne.f fVar = Ne.h.alpha;
        }
        name = Ne.h.charlie;
        String charlie = name.charlie();
        if (lima instanceof InterfaceC2321ad) {
            Ne.c cVar = ((se.ab) ((InterfaceC2321ad) lima)).teal;
            if (cVar.delta()) {
                return charlie;
            }
            return kotlin.text.r.november(cVar.bravo(), '.', '/') + '/' + charlie;
        }
        if (lima instanceof InterfaceC2330f) {
            interfaceC2330f = (InterfaceC2330f) lima;
        } else {
            interfaceC2330f = null;
        }
        if (interfaceC2330f != null) {
            return echo(interfaceC2330f, typeMappingConfiguration) + '$' + charlie;
        }
        throw new IllegalArgumentException("Unexpected container: " + lima + " for " + klass);
    }

    public static final Object foxtrot(kotlin.reflect.jvm.internal.impl.types.y kotlinType, Ge.q qVar, Xd.m writeGenericType) {
        Ge.i delta;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        Ge.q qVar2;
        Object foxtrot;
        int mike;
        boolean z2;
        List list;
        Ge.j jVar;
        boolean z10;
        kotlin.reflect.jvm.internal.impl.types.s golf;
        int collectionSizeOrDefault;
        Ge.f fVar = Ge.f.delta;
        Intrinsics.echo(kotlinType, "kotlinType");
        Intrinsics.echo(writeGenericType, "writeGenericType");
        if (D6.india(kotlinType)) {
            se.aa aaVar = me.o.alpha;
            D6.india(kotlinType);
            AbstractC2120h echo = O5.echo(kotlinType);
            InterfaceC2472h annotations = kotlinType.getAnnotations();
            kotlin.reflect.jvm.internal.impl.types.y foxtrot2 = D6.foxtrot(kotlinType);
            List delta2 = D6.delta(kotlinType);
            List golf2 = D6.golf(kotlinType);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(golf2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = golf2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.types.as) it.next()).bravo());
            }
            kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
            kotlin.reflect.jvm.internal.impl.types.al alVar = kotlin.reflect.jvm.internal.impl.types.al.red;
            kotlin.reflect.jvm.internal.impl.types.ap tango = me.o.alpha.tango();
            D6.hotel(kotlinType);
            kotlin.reflect.jvm.internal.impl.types.y bravo = ((kotlin.reflect.jvm.internal.impl.types.as) CollectionsKt.ochre(kotlinType.cyan())).bravo();
            Intrinsics.delta(bravo, "arguments.last().type");
            return foxtrot(D6.bravo(echo, annotations, foxtrot2, delta2, CollectionsKt.plus(arrayList, kotlin.reflect.jvm.internal.impl.types.ab.charlie(kotlin.collections.ab.juliet(O5.alpha(bravo)), alVar, tango, false)), O5.echo(kotlinType).november(), false).pink(kotlinType.indigo()), qVar, writeGenericType);
        }
        kotlin.reflect.jvm.internal.impl.types.ae hotel = AbstractC1792g.hotel(kotlinType);
        if (hotel == null && ((golf = AbstractC1792g.golf(kotlinType)) == null || (hotel = AbstractC1792g.green(golf)) == null)) {
            hotel = AbstractC1792g.hotel(kotlinType);
            Intrinsics.checkNotNull(hotel);
        }
        kotlin.reflect.jvm.internal.impl.types.ap receiver = AbstractC1792g.olive(hotel);
        Object obj = null;
        if (AbstractC1792g.yankee(receiver)) {
            Intrinsics.echo(receiver, "$receiver");
            if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.ap) {
                InterfaceC2332h kilo = receiver.kilo();
                Intrinsics.charlie(kilo, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                me.j sierra = AbstractC2120h.sierra((InterfaceC2330f) kilo);
                if (sierra != null) {
                    switch (sierra) {
                        case BOOLEAN:
                            jVar = Ge.k.alpha;
                            break;
                        case CHAR:
                            jVar = Ge.k.bravo;
                            break;
                        case BYTE:
                            jVar = Ge.k.charlie;
                            break;
                        case SHORT:
                            jVar = Ge.k.delta;
                            break;
                        case INT:
                            jVar = Ge.k.echo;
                            break;
                        case FLOAT:
                            jVar = Ge.k.foxtrot;
                            break;
                        case LONG:
                            jVar = Ge.k.golf;
                            break;
                        case DOUBLE:
                            jVar = Ge.k.hotel;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (!AbstractC1792g.crimson(kotlinType)) {
                        Ne.c ENHANCED_NULLABILITY_ANNOTATION = ye.ab.papa;
                        Intrinsics.delta(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                        if (!AbstractC1792g.uniform(kotlinType, ENHANCED_NULLABILITY_ANNOTATION)) {
                            z10 = false;
                            obj = AbstractC2670h5.alpha(jVar, z10);
                        }
                    }
                    z10 = true;
                    obj = AbstractC2670h5.alpha(jVar, z10);
                } else {
                    Intrinsics.echo(receiver, "$receiver");
                    if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.ap) {
                        InterfaceC2332h kilo2 = receiver.kilo();
                        Intrinsics.charlie(kilo2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        me.j quebec = AbstractC2120h.quebec((InterfaceC2330f) kilo2);
                        if (quebec != null) {
                            StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
                            Ve.c cVar = (Ve.c) Ve.c.f2186h.get(quebec);
                            if (cVar != null) {
                                sb2.append(cVar.charlie());
                                obj = Ge.f.charlie(sb2.toString());
                            } else {
                                Ve.c.alpha(4);
                                throw null;
                            }
                        } else {
                            Intrinsics.echo(receiver, "$receiver");
                            if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.ap) {
                                InterfaceC2332h kilo3 = receiver.kilo();
                                if (kilo3 != null && AbstractC2120h.crimson(kilo3)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    Intrinsics.echo(receiver, "$receiver");
                                    if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.ap) {
                                        InterfaceC2332h kilo4 = receiver.kilo();
                                        Intrinsics.charlie(kilo4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                        Ne.e hotel2 = Ue.e.hotel((InterfaceC2330f) kilo4);
                                        String str = C2233d.alpha;
                                        Ne.b foxtrot3 = C2233d.foxtrot(hotel2);
                                        if (foxtrot3 != null) {
                                            if (!qVar.golf && ((list = C2233d.november) == null || !list.isEmpty())) {
                                                Iterator it2 = list.iterator();
                                                while (it2.hasNext()) {
                                                    if (Intrinsics.areEqual(((C2232c) it2.next()).alpha, foxtrot3)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            String echo2 = Ve.b.bravo(foxtrot3).echo();
                                            Intrinsics.delta(echo2, "byClassId(classId).internalName");
                                            obj = Ge.f.delta(echo2);
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                                        sb3.append(receiver);
                                        sb3.append(", ");
                                        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb3).toString());
                                    }
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                                sb4.append(receiver);
                                sb4.append(", ");
                                throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb4).toString());
                            }
                        }
                    } else {
                        StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb5.append(receiver);
                        sb5.append(", ");
                        throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb5).toString());
                    }
                }
            } else {
                StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb6.append(receiver);
                sb6.append(", ");
                throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb6).toString());
            }
        }
        if (obj != null) {
            Object alpha = AbstractC2670h5.alpha(obj, qVar.alpha);
            writeGenericType.invoke(kotlinType, alpha, qVar);
            return alpha;
        }
        kotlin.reflect.jvm.internal.impl.types.ap green = kotlinType.green();
        if (green instanceof kotlin.reflect.jvm.internal.impl.types.x) {
            kotlin.reflect.jvm.internal.impl.types.x xVar = (kotlin.reflect.jvm.internal.impl.types.x) green;
            kotlin.reflect.jvm.internal.impl.types.y yVar2 = xVar.alpha;
            if (yVar2 != null) {
                return foxtrot(O5.lima(yVar2), qVar, writeGenericType);
            }
            LinkedHashSet types = xVar.bravo;
            Intrinsics.echo(types, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.maroon(types, null, null, null, null, 63));
        }
        InterfaceC2332h kilo5 = green.kilo();
        if (kilo5 != null) {
            if (hf.i.foxtrot(kilo5)) {
                return Ge.f.delta("error/NonExistentClass");
            }
            boolean z11 = kilo5 instanceof InterfaceC2330f;
            boolean z12 = qVar.charlie;
            if (z11 && AbstractC2120h.xray(kotlinType)) {
                if (kotlinType.cyan().size() == 1) {
                    kotlin.reflect.jvm.internal.impl.types.as asVar = (kotlin.reflect.jvm.internal.impl.types.as) kotlinType.cyan().get(0);
                    kotlin.reflect.jvm.internal.impl.types.y bravo2 = asVar.bravo();
                    Intrinsics.delta(bravo2, "memberProjection.type");
                    if (asVar.alpha() == 2) {
                        foxtrot = Ge.f.delta("java/lang/Object");
                    } else {
                        int alpha2 = asVar.alpha();
                        com.google.android.material.datepicker.j.sierra(alpha2, "memberProjection.projectionKind");
                        if (z12 || ((mike = av.q.mike(alpha2)) == 0 ? (qVar2 = qVar.india) == null : !(mike == 1 ? (qVar2 = qVar.hotel) != null : (qVar2 = qVar.foxtrot) != null))) {
                            qVar2 = qVar;
                        }
                        foxtrot = foxtrot(bravo2, qVar2, writeGenericType);
                    }
                    return Ge.f.charlie(Constants.AES_PREFIX + Ge.f.hotel((Ge.k) foxtrot));
                }
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            if (z11) {
                if (Qe.g.bravo(kilo5) && !qVar.bravo && (yVar = (kotlin.reflect.jvm.internal.impl.types.y) kotlin.reflect.jvm.internal.impl.types.c.delta(kotlinType, new HashSet())) != null) {
                    return foxtrot(yVar, new Ge.q(qVar.alpha, true, qVar.charlie, qVar.delta, qVar.echo, qVar.foxtrot, qVar.golf, qVar.hotel, qVar.india, 512), writeGenericType);
                }
                if (z12 && AbstractC2120h.bravo((InterfaceC2330f) kilo5, me.m.ivory)) {
                    delta = Ge.f.delta("java/lang/Class");
                } else {
                    InterfaceC2330f interfaceC2330f = (InterfaceC2330f) kilo5;
                    Intrinsics.delta(interfaceC2330f.alpha(), "descriptor.original");
                    if (interfaceC2330f.c() == 4) {
                        InterfaceC2335k lima = interfaceC2330f.lima();
                        Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        interfaceC2330f = (InterfaceC2330f) lima;
                    }
                    InterfaceC2330f alpha3 = interfaceC2330f.alpha();
                    Intrinsics.delta(alpha3, "enumClassIfEnumEntry.original");
                    delta = Ge.f.delta(echo(alpha3, fVar));
                }
                writeGenericType.invoke(kotlinType, delta, qVar);
                return delta;
            }
            if (kilo5 instanceof pe.aq) {
                kotlin.reflect.jvm.internal.impl.types.y foxtrot4 = O5.foxtrot((pe.aq) kilo5);
                if (kotlinType.indigo()) {
                    foxtrot4 = O5.juliet(foxtrot4);
                }
                return foxtrot(foxtrot4, qVar, AbstractC2254i.bravo);
            }
            if ((kilo5 instanceof ef.s) && qVar.juliet) {
                return foxtrot(((ef.s) kilo5).a0(), qVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
    }
}
