package yb;

import Ac.i;
import F.AbstractC0127k2;
import F.O;
import T.p;
import T.s;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import qb.EnumC2443j;
import sb.C2844c;
import t6.AbstractC3086y3;
import ud.f;

/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3410a {
    public static final P.d alpha = new P.d(new f(18), -1314131680, false);
    public static final P.d bravo = new P.d(new f(19), 1785572357, false);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(String title, s sVar, String str, String str2, P.d dVar, P.d dVar2, Function0 function0, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        String str3;
        int i12;
        String str4;
        int i13;
        int i14;
        P.d dVar3;
        int i15;
        int i16;
        P.d dVar4;
        int i17;
        int i18;
        Function0 function02;
        int i19;
        int i20;
        boolean z2;
        C0585q c0585q;
        String str5;
        P.d dVar5;
        P.d dVar6;
        Function0 function03;
        Q uniform;
        s sVar3;
        String str6;
        P.d dVar7;
        Function0 function04;
        int i21;
        int i22;
        Intrinsics.echo(title, "title");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1559370210);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(title)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i10 = i22 | i4;
        } else {
            i10 = i4;
        }
        int i23 = i5 & 2;
        if (i23 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) != 0) {
                str3 = str;
                if (c0585q2.golf(str3)) {
                    i21 = Barcode.FORMAT_QR_CODE;
                } else {
                    i21 = 128;
                }
                i10 |= i21;
            } else {
                str3 = str;
            }
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                str4 = str2;
                if (c0585q2.golf(str4)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                i14 = i5 & 16;
                if (i14 != 0) {
                    i10 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    dVar3 = dVar;
                    if (c0585q2.india(dVar3)) {
                        i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i15 = 8192;
                    }
                    i10 |= i15;
                    i16 = i5 & 32;
                    if (i16 == 0) {
                        i10 |= 196608;
                    } else if ((196608 & i4) == 0) {
                        dVar4 = dVar2;
                        if (c0585q2.india(dVar4)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i10 |= i17;
                        i18 = i5 & 64;
                        if (i18 != 0) {
                            i10 |= 1572864;
                        } else if ((1572864 & i4) == 0) {
                            function02 = function0;
                            if (c0585q2.india(function02)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i10 |= i19;
                            i20 = i10;
                            if ((599187 & i10) == 599186) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!c0585q2.magenta(i20 & 1, z2)) {
                                s sVar4 = p.alpha;
                                if (i23 != 0) {
                                    sVar3 = sVar4;
                                } else {
                                    sVar3 = sVar2;
                                }
                                if (i12 != 0) {
                                    str6 = null;
                                } else {
                                    str6 = str4;
                                }
                                if (i14 != 0) {
                                    dVar7 = null;
                                } else {
                                    dVar7 = dVar3;
                                }
                                if (i16 != 0) {
                                    dVar4 = null;
                                }
                                if (i18 != 0) {
                                    function04 = null;
                                } else {
                                    function04 = function02;
                                }
                                s charlie = V.charlie(sVar3, 1.0f);
                                if (function04 != null) {
                                    sVar4 = androidx.compose.foundation.a.echo(15, sVar4, null, function04, false);
                                }
                                P.d dVar8 = dVar4;
                                sVar2 = sVar3;
                                c0585q = c0585q2;
                                AbstractC0127k2.alpha(charlie.then(sVar4), null, ((O) c0585q2.kilo(F.Q.alpha)).papa, 0L, 0.0f, 0.0f, null, P.e.echo(429126845, new Ac.e(dVar7, dVar8, title, str3, str6, 7), c0585q2), c0585q, 12582912, 122);
                                function03 = function04;
                                dVar6 = dVar8;
                                str5 = str6;
                                dVar5 = dVar7;
                            } else {
                                c0585q = c0585q2;
                                c0585q.ochre();
                                str5 = str4;
                                dVar5 = dVar3;
                                dVar6 = dVar4;
                                function03 = function02;
                            }
                            s sVar5 = sVar2;
                            uniform = c0585q.uniform();
                            if (uniform == null) {
                                uniform.delta = new N2.a(title, sVar5, str, str5, dVar5, dVar6, function03, i4, i5);
                                return;
                            }
                            return;
                        }
                        function02 = function0;
                        i20 = i10;
                        if ((599187 & i10) == 599186) {
                        }
                        if (!c0585q2.magenta(i20 & 1, z2)) {
                        }
                        s sVar52 = sVar2;
                        uniform = c0585q.uniform();
                        if (uniform == null) {
                        }
                    }
                    dVar4 = dVar2;
                    i18 = i5 & 64;
                    if (i18 != 0) {
                    }
                    function02 = function0;
                    i20 = i10;
                    if ((599187 & i10) == 599186) {
                    }
                    if (!c0585q2.magenta(i20 & 1, z2)) {
                    }
                    s sVar522 = sVar2;
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                    }
                }
                dVar3 = dVar;
                i16 = i5 & 32;
                if (i16 == 0) {
                }
                dVar4 = dVar2;
                i18 = i5 & 64;
                if (i18 != 0) {
                }
                function02 = function0;
                i20 = i10;
                if ((599187 & i10) == 599186) {
                }
                if (!c0585q2.magenta(i20 & 1, z2)) {
                }
                s sVar5222 = sVar2;
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            str4 = str2;
            i14 = i5 & 16;
            if (i14 != 0) {
            }
            dVar3 = dVar;
            i16 = i5 & 32;
            if (i16 == 0) {
            }
            dVar4 = dVar2;
            i18 = i5 & 64;
            if (i18 != 0) {
            }
            function02 = function0;
            i20 = i10;
            if ((599187 & i10) == 599186) {
            }
            if (!c0585q2.magenta(i20 & 1, z2)) {
            }
            s sVar52222 = sVar2;
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        sVar2 = sVar;
        if ((i4 & 384) != 0) {
        }
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        str4 = str2;
        i14 = i5 & 16;
        if (i14 != 0) {
        }
        dVar3 = dVar;
        i16 = i5 & 32;
        if (i16 == 0) {
        }
        dVar4 = dVar2;
        i18 = i5 & 64;
        if (i18 != 0) {
        }
        function02 = function0;
        i20 = i10;
        if ((599187 & i10) == 599186) {
        }
        if (!c0585q2.magenta(i20 & 1, z2)) {
        }
        s sVar522222 = sVar2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(String str, String str2, String str3, EnumC2443j enumC2443j, p pVar, Function0 function0, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z2;
        EnumC2443j enumC2443j2;
        p pVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2035293204);
        int i11 = i4 | 24576;
        if ((i5 & 32) != 0) {
            i11 = 221184 | i4;
        } else if ((196608 & i4) == 0) {
            if (c0585q.golf(null)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i11 |= i10;
        }
        if ((599187 & i11) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            p pVar3 = p.alpha;
            enumC2443j2 = enumC2443j;
            alpha(str, pVar3, str2, str3, P.e.echo(-814159127, new Bb.d(null, str, 5), c0585q), P.e.echo(-1222182742, new C3413d(enumC2443j2, 1), c0585q), function0, c0585q, 1797558, 0);
            pVar2 = pVar3;
        } else {
            enumC2443j2 = enumC2443j;
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C3411b(str, str2, str3, enumC2443j2, pVar2, function0, i4, i5, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void charlie(String str, String str2, p pVar, String str3, Function0 function0, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        String str4;
        int i10;
        boolean z2;
        p pVar2;
        Q uniform;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(595264648);
        int i11 = i4 | 384;
        int i12 = i5 & 8;
        if (i12 != 0) {
            i11 = i4 | 3456;
        } else if ((i4 & 3072) == 0) {
            str4 = str3;
            if (c0585q.golf(str4)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i10;
            if ((i11 & 9363) == 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i11 & 1, z2)) {
                p pVar3 = p.alpha;
                P.d dVar = null;
                if (i12 != 0) {
                    str4 = null;
                }
                if (str4 != null) {
                    c0585q.purple(-389997475);
                    dVar = P.e.echo(536236370, new i(str4, 23), c0585q);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(-389748267);
                    c0585q.quebec(false);
                }
                alpha(str, pVar3, str2, null, bravo, dVar, function0, c0585q, 1597878, 8);
                pVar2 = pVar3;
            } else {
                c0585q.ochre();
                pVar2 = pVar;
            }
            String str5 = str4;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new W4.a(str, str2, pVar2, str5, function0, i4, i5);
                return;
            }
            return;
        }
        str4 = str3;
        if ((i11 & 9363) == 9362) {
        }
        if (!c0585q.magenta(i11 & 1, z2)) {
        }
        String str52 = str4;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(String str, String str2, String str3, EnumC3414e enumC3414e, p pVar, Function0 function0, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        Function0 function02;
        int i10;
        boolean z2;
        Function0 function03;
        p pVar2;
        Q uniform;
        Function0 function04;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-805239171);
        int i11 = i4 | 24576;
        int i12 = i5 & 32;
        if (i12 != 0) {
            i11 = 221184 | i4;
        } else if ((196608 & i4) == 0) {
            function02 = function0;
            if (c0585q.india(function02)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i11 |= i10;
            if ((74899 & i11) == 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i11 & 1, z2)) {
                p pVar3 = p.alpha;
                if (i12 != 0) {
                    Object jade = c0585q.jade();
                    if (jade == C0580l.alpha) {
                        jade = new C2844c(17);
                        c0585q.f(jade);
                    }
                    function04 = (Function0) jade;
                } else {
                    function04 = function02;
                }
                alpha(AbstractC3086y3.alpha(R.string.order_number_s, new Object[]{str}, c0585q), pVar3, str2, str3, P.e.echo(1777761184, new C3412c(enumC3414e, 1), c0585q), P.e.echo(1432845439, new C3412c(enumC3414e, 2), c0585q), function04, c0585q, 224688 | ((i11 << 3) & 3670016), 0);
                pVar2 = pVar3;
                function03 = function04;
            } else {
                c0585q.ochre();
                function03 = function02;
                pVar2 = pVar;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C3411b(str, str2, str3, enumC3414e, pVar2, function03, i4, i5, 0);
                return;
            }
            return;
        }
        function02 = function0;
        if ((74899 & i11) == 74898) {
        }
        if (!c0585q.magenta(i11 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
