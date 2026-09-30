package sb;

import Ac.h;
import Ac.i;
import Ac.n;
import Ec.ab;
import F.AbstractC0122j1;
import F.C0103e2;
import F.K1;
import F.O;
import Gb.j;
import Lb.V;
import Lb.b0;
import P.e;
import a5.C0405a;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import g4.C1752a;
import h5.C1809a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s6.E7;

/* renamed from: sb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2845d {
    public static final P.d alpha = new P.d(new C1752a(23), 113594984, false);
    public static final P.d bravo = new P.d(new C1752a(24), 891287002, false);
    public static final P.d charlie = new P.d(new C1752a(25), -845090351, false);

    static {
        new P.d(new Vc.d(10), 1948858231, false);
        new P.d(new Vc.d(11), -818183664, false);
    }

    public static final void alpha(Function0 onDismissRequest, P.d content, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Function0 function0;
        Intrinsics.echo(onDismissRequest, "onDismissRequest");
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1736825575);
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            function0 = onDismissRequest;
            bravo(function0, null, null, false, e.echo(1391493989, new V(content, 3), c0585q), c0585q, 24966, 10);
        } else {
            function0 = onDismissRequest;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2842a(function0, content, i4, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(Function0 onDismissRequest, C0103e2 c0103e2, String str, boolean z2, P.d content, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        boolean z10;
        int i10;
        boolean z11;
        C0585q c0585q;
        C0103e2 c0103e22;
        boolean z12;
        Q uniform;
        C0103e2 c0103e23;
        boolean z13;
        int i11;
        Intrinsics.echo(onDismissRequest, "onDismissRequest");
        Intrinsics.echo(content, "content");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-554623347);
        int i12 = i4 | 16;
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(str)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i12 |= i11;
        }
        int i13 = i5 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i4 & 3072) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i12 |= i10;
            if ((i12 & 9363) == 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!c0585q2.magenta(i12 & 1, z11)) {
                c0585q2.orange();
                if ((i4 & 1) != 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                    c0103e23 = c0103e2;
                } else {
                    C0103e2 foxtrot = AbstractC0122j1.foxtrot(false, c0585q2, 0, 3);
                    if (i13 != 0) {
                        c0103e23 = foxtrot;
                        z13 = true;
                        c0585q2.romeo();
                        E0 e02 = F.Q.alpha;
                        c0585q = c0585q2;
                        AbstractC0122j1.alpha(onDismissRequest, null, c0103e23, 0.0f, null, ((O) c0585q2.kilo(e02)).papa, ((O) c0585q2.kilo(e02)).quebec, 0.0f, 0L, null, null, null, e.echo(-1613098518, new ab(str, z13, content), c0585q2), c0585q, 6, 3994);
                        z12 = z13;
                        c0103e22 = c0103e23;
                    } else {
                        c0103e23 = foxtrot;
                    }
                }
                z13 = z10;
                c0585q2.romeo();
                E0 e022 = F.Q.alpha;
                c0585q = c0585q2;
                AbstractC0122j1.alpha(onDismissRequest, null, c0103e23, 0.0f, null, ((O) c0585q2.kilo(e022)).papa, ((O) c0585q2.kilo(e022)).quebec, 0.0f, 0L, null, null, null, e.echo(-1613098518, new ab(str, z13, content), c0585q2), c0585q, 6, 3994);
                z12 = z13;
                c0103e22 = c0103e23;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                c0103e22 = c0103e2;
                z12 = z10;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0405a(onDismissRequest, c0103e22, str, z12, content, i4, i5);
                return;
            }
            return;
        }
        z10 = z2;
        if ((i12 & 9363) == 9362) {
        }
        if (!c0585q2.magenta(i12 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void charlie(Function0 onDismissRequest, String title, String str, String str2, String str3, Function0 onConfirm, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        P.d dVar2;
        int i11;
        boolean z2;
        C0585q c0585q;
        P.d dVar3;
        Q uniform;
        P.d dVar4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Intrinsics.echo(onDismissRequest, "onDismissRequest");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(onConfirm, "onConfirm");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1876169265);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(onDismissRequest)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(title)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(str)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.golf(str2)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i14;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.golf(str3)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i4) == 0) {
            if (c0585q2.india(onConfirm)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        int i18 = i5 & 64;
        if (i18 != 0) {
            i10 |= 1572864;
        } else if ((1572864 & i4) == 0) {
            dVar2 = dVar;
            if (c0585q2.india(dVar2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i10 |= i11;
            if ((599187 & i10) == 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q2.magenta(i10 & 1, z2)) {
                P.d dVar5 = null;
                if (i18 != 0) {
                    dVar2 = null;
                }
                if (str != null) {
                    c0585q2.purple(1746336928);
                    dVar4 = e.echo(-653428059, new i(str, 16), c0585q2);
                    c0585q2.quebec(false);
                } else {
                    c0585q2.purple(1746515022);
                    c0585q2.quebec(false);
                    dVar4 = null;
                }
                if (str3 != null) {
                    c0585q2.purple(1746803323);
                    dVar5 = e.echo(-1133450331, new Pc.a(onDismissRequest, str3), c0585q2);
                    c0585q2.quebec(false);
                } else {
                    c0585q2.purple(1746955470);
                    c0585q2.quebec(false);
                }
                c0585q = c0585q2;
                P.d dVar6 = dVar2;
                K1.alpha(onDismissRequest, e.echo(219651207, new n(onConfirm, onDismissRequest, str2, 16), c0585q2), null, dVar5, dVar6, e.echo(1818351363, new i(title, 17), c0585q2), dVar4, null, 0L, 0L, 0L, 0L, 0.0f, null, c0585q, (i10 & 14) | 196656 | ((i10 >> 6) & 57344), 16260);
                dVar3 = dVar6;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                dVar3 = dVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new N2.a(onDismissRequest, title, str, str2, str3, onConfirm, dVar3, i4, i5, 1);
                return;
            }
            return;
        }
        dVar2 = dVar;
        if ((599187 & i10) == 599186) {
        }
        if (!c0585q2.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void delta(String title, String str, Function0 onConfirm, Function0 onDismiss, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        Intrinsics.echo(title, "title");
        Intrinsics.echo(onConfirm, "onConfirm");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1539834560);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(title)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        int i11 = i5 | 221184;
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            charlie(onDismiss, title, str, Q0.c.oscar(c0585q, 1982715840, R.string.confirm, c0585q, false), Q0.c.oscar(c0585q, 1982718111, R.string.cancel, c0585q, false), onConfirm, alpha, c0585q, 1769862 | ((i11 << 3) & 112), 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j(title, str, onConfirm, onDismiss, i4, 11);
        }
    }

    public static final void echo(Function0 onDismissRequest, String str, P.d content, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(onDismissRequest, "onDismissRequest");
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1666860161);
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            E7.alpha(onDismissRequest, null, e.echo(-1652756522, new C2843b(str, content, dVar, 0), c0585q), c0585q, 390, 2);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(onDismissRequest, str, content, dVar, i4, 12);
        }
    }

    public static final void foxtrot(int i4, InterfaceC0581m interfaceC0581m, String str, String str2, Function0 onDismiss) {
        boolean z2;
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1773500414);
        int i5 = i4 | 3072;
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            String oscar = Q0.c.oscar(c0585q, 768127293, R.string.ok, c0585q, false);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new C1809a(28);
                c0585q.f(jade);
            }
            charlie(onDismiss, str, str2, oscar, null, (Function0) jade, bravo, c0585q, 1794486, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b0(str, str2, onDismiss, i4, 4);
        }
    }

    public static final void golf(Function0 onDismissRequest, P.d content, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Function0 function0;
        Intrinsics.echo(onDismissRequest, "onDismissRequest");
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1949898882);
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            function0 = onDismissRequest;
            bravo(function0, null, "Order #".concat("12345"), false, e.echo(2129732786, new V(content, 4), c0585q), c0585q, 24582, 10);
        } else {
            function0 = onDismissRequest;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2842a(function0, content, i4, 2);
        }
    }

    public static final void hotel(Function0 onDismissRequest, P.d content, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Function0 function0;
        Intrinsics.echo(onDismissRequest, "onDismissRequest");
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1723927074);
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            function0 = onDismissRequest;
            bravo(function0, null, "Select Option", false, e.echo(859765102, new V(content, 2), c0585q), c0585q, 28038, 2);
        } else {
            function0 = onDismissRequest;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2842a(function0, content, i4, 0);
        }
    }

    public static final void india(int i4, InterfaceC0581m interfaceC0581m, String str, String str2, Function0 onDismiss) {
        boolean z2;
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(648498857);
        int i5 = i4 | 3072;
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            String oscar = Q0.c.oscar(c0585q, 437152388, R.string.ok, c0585q, false);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new C1809a(27);
                c0585q.f(jade);
            }
            charlie(onDismiss, str, str2, oscar, null, (Function0) jade, charlie, c0585q, 1794486, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b0(str, str2, onDismiss, i4, 3);
        }
    }
}
