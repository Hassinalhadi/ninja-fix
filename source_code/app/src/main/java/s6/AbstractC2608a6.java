package s6;

import F.AbstractC0141o0;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import kb.C2026b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2210c;
import ob.C2209b;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2608a6;
import t6.AbstractC3086y3;

/* renamed from: s6.a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2608a6 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final String str, final String str2, T.s sVar, String str3, boolean z2, final boolean z10, final Function0 function0, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        String str4;
        int i13;
        int i14;
        boolean z11;
        C0585q c0585q;
        final T.s sVar3;
        androidx.compose.runtime.Q uniform;
        T.s sVar4;
        T.s sVar5;
        float f5;
        float f10;
        C2549i c2549i;
        C2549i c2549i2;
        C2550j c2550j;
        boolean z12;
        C0585q c0585q2;
        C0585q c0585q3;
        ?? r92;
        boolean z13;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        final boolean z14 = z2;
        C0585q c0585q4 = (C0585q) interfaceC0581m;
        c0585q4.silver(-1984724148);
        if ((i4 & 6) == 0) {
            if (c0585q4.golf(str)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i10 = i21 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q4.golf(str2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i10 |= i20;
        }
        int i22 = i5 & 4;
        if (i22 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q4.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) == 0) {
                if (c0585q4.golf(null)) {
                    i19 = 2048;
                } else {
                    i19 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i19;
            }
            i12 = i5 & 16;
            if (i12 == 0) {
                i10 |= 24576;
            } else if ((i4 & 24576) == 0) {
                str4 = str3;
                if (c0585q4.golf(str4)) {
                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i13 = 8192;
                }
                i10 |= i13;
                if ((i4 & 196608) == 0) {
                    if (c0585q4.hotel(z14)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i10 |= i18;
                }
                if ((i4 & 1572864) == 0) {
                    if (c0585q4.hotel(z10)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i10 |= i17;
                }
                if ((i4 & 12582912) == 0) {
                    if (c0585q4.hotel(false)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i10 |= i16;
                }
                if ((i4 & 100663296) == 0) {
                    if (c0585q4.india(function0)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i10 |= i15;
                }
                i14 = i10;
                if ((i14 & 38347923) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0585q4.magenta(i14 & 1, z11)) {
                    T.p pVar = T.p.alpha;
                    if (i22 != 0) {
                        sVar4 = pVar;
                    } else {
                        sVar4 = sVar2;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    }
                    float f11 = C2209b.alpha;
                    if (z10 && function0 != null) {
                        c0585q4.purple(-354409994);
                        Object jade = c0585q4.jade();
                        if (jade == C0580l.alpha) {
                            jade = ao.ad.xray(c0585q4);
                        }
                        sVar5 = androidx.compose.foundation.a.charlie(pVar, (InterfaceC1673j) jade, null, false, null, function0, 28);
                        c0585q4.quebec(false);
                    } else {
                        c0585q4.purple(-354405516);
                        c0585q4.quebec(false);
                        sVar5 = pVar;
                    }
                    float f12 = 80;
                    T.s golf = androidx.compose.foundation.layout.V.golf(sVar4.then(sVar5), f12, 0.0f, 2);
                    long j5 = AbstractC2210c.charlie;
                    float f13 = C2209b.india;
                    T.s bravo = androidx.compose.foundation.a.bravo(golf, j5, AbstractC2094g.bravo(f13));
                    float f14 = C2209b.alpha;
                    T.s charlie = t6.R3.charlie(bravo, f14, AbstractC2210c.delta, AbstractC2094g.bravo(f13));
                    q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
                    int romeo = C0564b.romeo(c0585q4);
                    androidx.compose.runtime.I mike = c0585q4.mike();
                    T.s charlie2 = T.a.charlie(charlie, c0585q4);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j2);
                    } else {
                        c0585q4.i();
                    }
                    C2549i c2549i3 = C2551k.foxtrot;
                    C0564b.blue(c2549i3, c0585q4, delta);
                    C2549i c2549i4 = C2551k.echo;
                    C0564b.blue(c2549i4, c0585q4, mike);
                    C2549i c2549i5 = C2551k.golf;
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo))) {
                        ao.ad.blue(romeo, c0585q4, romeo, c2549i5);
                    }
                    C2549i c2549i6 = C2551k.delta;
                    C0564b.blue(c2549i6, c0585q4, charlie2);
                    C0551q c0551q = C0551q.alpha;
                    T.s charlie3 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                    float f15 = 10;
                    if (z10) {
                        f5 = C2209b.lima;
                    } else {
                        f5 = 22;
                    }
                    T.s sVar6 = sVar4;
                    T.s victor = AbstractC0538d.victor(charlie3, f15, 15, f5, 16);
                    C0537c c0537c = AbstractC0542h.alpha;
                    androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(C2209b.hotel), T.d.f2061d, c0585q4, 54);
                    int romeo2 = C0564b.romeo(c0585q4);
                    androidx.compose.runtime.I mike2 = c0585q4.mike();
                    T.s charlie4 = T.a.charlie(victor, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j2);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i3, c0585q4, alpha2);
                    C0564b.blue(c2549i4, c0585q4, mike2);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo2))) {
                        ao.ad.blue(romeo2, c0585q4, romeo2, c2549i5);
                    }
                    C0564b.blue(c2549i6, c0585q4, charlie4);
                    if (str4 == null) {
                        c0585q4.purple(-1855895296);
                        c0585q4.quebec(false);
                        f10 = f12;
                        c2549i = c2549i3;
                        c2549i2 = c2549i5;
                        c2550j = c2550j2;
                        c0585q3 = c0585q4;
                        r92 = 0;
                    } else {
                        c0585q4.purple(-1851146964);
                        T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar, C2209b.juliet);
                        f10 = f12;
                        long j6 = AbstractC2210c.foxtrot;
                        float f16 = C2209b.kilo;
                        T.s charlie5 = t6.R3.charlie(androidx.compose.foundation.a.bravo(kilo, j6, AbstractC2094g.bravo(f16)), f14, AbstractC2210c.echo, AbstractC2094g.bravo(f16));
                        q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                        int romeo3 = C0564b.romeo(c0585q4);
                        androidx.compose.runtime.I mike3 = c0585q4.mike();
                        T.s charlie6 = T.a.charlie(charlie5, c0585q4);
                        c0585q4.white();
                        if (c0585q4.lime) {
                            c0585q4.lima(c2550j2);
                        } else {
                            c0585q4.i();
                        }
                        C0564b.blue(c2549i3, c0585q4, delta2);
                        C0564b.blue(c2549i4, c0585q4, mike3);
                        if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo3))) {
                            ao.ad.blue(romeo3, c0585q4, romeo3, c2549i5);
                        }
                        C0564b.blue(c2549i6, c0585q4, charlie6);
                        if (str4 != null) {
                            c0585q4.purple(-642638117);
                            X2.g gVar = new X2.g((Context) c0585q4.kilo(AndroidCompositionLocals_androidKt.bravo));
                            gVar.charlie = str4;
                            gVar.bravo();
                            c2549i2 = c2549i5;
                            c2550j = c2550j2;
                            C0585q c0585q5 = c0585q4;
                            c2549i = c2549i3;
                            N2.p.charlie(gVar.alpha(), str2, androidx.compose.foundation.layout.V.kilo(pVar, 30), C2391j.bravo, c0585q5, (i14 & 112) | 1573248);
                            z12 = false;
                            c0585q5.quebec(false);
                            c0585q2 = c0585q5;
                        } else {
                            c2549i = c2549i3;
                            c2549i2 = c2549i5;
                            c2550j = c2550j2;
                            C0585q c0585q6 = c0585q4;
                            z12 = false;
                            c0585q6.purple(-648092319);
                            c0585q6.quebec(false);
                            c0585q2 = c0585q6;
                        }
                        c0585q2.quebec(true);
                        c0585q2.quebec(z12);
                        r92 = z12;
                        c0585q3 = c0585q2;
                    }
                    T.i iVar = T.d.f2063g;
                    C0540f golf2 = AbstractC0542h.golf((float) r92);
                    T.s oscar = androidx.compose.foundation.layout.V.oscar(pVar, f10);
                    C0554u alpha3 = AbstractC0553t.alpha(golf2, iVar, c0585q3, 54);
                    int romeo4 = C0564b.romeo(c0585q3);
                    androidx.compose.runtime.I mike4 = c0585q3.mike();
                    T.s charlie7 = T.a.charlie(oscar, c0585q3);
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(c2549i, c0585q3, alpha3);
                    C0564b.blue(c2549i4, c0585q3, mike4);
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo4))) {
                        ao.ad.blue(romeo4, c0585q3, romeo4, c2549i2);
                    }
                    C0564b.blue(c2549i6, c0585q3, charlie7);
                    long charlie8 = AbstractC2636d7.charlie(32);
                    H0.v vVar = H0.v.f1409c;
                    C0585q c0585q7 = c0585q3;
                    F.G2.bravo(str, null, AbstractC2210c.golf, charlie8, vVar, null, AbstractC2636d7.charlie(0), null, AbstractC2636d7.charlie(35), 0, false, 0, 0, null, null, c0585q7, (i14 & 14) | 12782592, 6, 129874);
                    F.G2.bravo(str2, null, AbstractC2210c.hotel, AbstractC2636d7.charlie(12), vVar, null, AbstractC2636d7.charlie(0), new O0.k(3), AbstractC2636d7.charlie(14), 0, false, 1, 0, null, null, c0585q7, ((i14 >> 3) & 14) | 12782976, 3078, 121170);
                    c0585q = c0585q7;
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                    if (z10) {
                        c0585q.purple(-987981963);
                        float f17 = 5;
                        z14 = z2;
                        bravo(z14, AbstractC0538d.whiskey(c0551q.alpha(pVar, T.d.red), 0.0f, f17, f17, 0.0f, 9), AbstractC2094g.bravo(2), c0585q, (i14 >> 15) & 14);
                        z13 = false;
                    } else {
                        z14 = z2;
                        z13 = false;
                        c0585q.purple(-995227748);
                    }
                    c0585q.quebec(z13);
                    c0585q.quebec(true);
                    sVar3 = sVar6;
                } else {
                    c0585q = c0585q4;
                    c0585q.ochre();
                    sVar3 = sVar2;
                }
                final String str5 = str4;
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Xd.l() { // from class: kb.a
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(i4 | 1);
                            String str6 = str;
                            String str7 = str2;
                            Function0 function02 = function0;
                            AbstractC2608a6.alpha(str6, str7, sVar3, str5, z14, z10, function02, (InterfaceC0581m) obj, cyan, i5);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            str4 = str3;
            if ((i4 & 196608) == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i14 = i10;
            if ((i14 & 38347923) != 38347922) {
            }
            if (c0585q4.magenta(i14 & 1, z11)) {
            }
            final String str52 = str4;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        sVar2 = sVar;
        if ((i4 & 3072) == 0) {
        }
        i12 = i5 & 16;
        if (i12 == 0) {
        }
        str4 = str3;
        if ((i4 & 196608) == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i14 = i10;
        if ((i14 & 38347923) != 38347922) {
        }
        if (c0585q4.magenta(i14 & 1, z11)) {
        }
        final String str522 = str4;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void bravo(boolean z2, T.s sVar, C2093f c2093f, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        T.s charlie;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-256372211);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(c2093f)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            c0585q.orange();
            int i13 = i4 & 1;
            T.p pVar = T.p.alpha;
            if (i13 != 0 && !c0585q.beige()) {
                c0585q.ochre();
            }
            c0585q.romeo();
            T.s kilo = androidx.compose.foundation.layout.V.kilo(sVar, C2209b.mike);
            if (z2) {
                charlie = androidx.compose.foundation.a.bravo(pVar, AbstractC2210c.golf, c2093f);
            } else {
                charlie = t6.R3.charlie(androidx.compose.foundation.a.bravo(pVar, AbstractC2210c.charlie, c2093f), C2209b.alpha, AbstractC2210c.delta, c2093f);
            }
            T.s then = kilo.then(charlie);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(then, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            if (z2) {
                c0585q.purple(-1991313939);
                AbstractC0141o0.bravo(i6.d.alpha(), AbstractC3086y3.bravo(c0585q, R.string.checked), androidx.compose.foundation.layout.V.kilo(pVar, 12), AbstractC2210c.charlie, c0585q, 384, 0);
            } else {
                c0585q.purple(-1994104497);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2026b(z2, sVar, c2093f, i4, 0);
        }
    }
}
