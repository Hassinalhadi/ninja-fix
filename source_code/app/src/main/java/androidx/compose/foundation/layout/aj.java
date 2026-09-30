package androidx.compose.foundation.layout;

import F.C0088b;
import androidx.appcompat.widget.P0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import q0.AbstractC2367C;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class aj {
    public static final void alpha(T.s sVar, C0537c c0537c, C0537c c0537c2, T.j jVar, int i4, int i5, final P.d dVar, InterfaceC0581m interfaceC0581m, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z2;
        final int i14;
        final int i15;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1303174015);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            i12 = i10;
        }
        int i18 = i12 | 224688;
        if ((i10 & 1572864) == 0) {
            if (c0585q.india(dVar)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i18 |= i16;
        }
        if ((599187 & i18) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i18 & 1, z2)) {
            if (i17 != 0) {
                sVar = T.p.alpha;
            }
            c0537c = AbstractC0542h.alpha;
            c0537c2 = AbstractC0542h.charlie;
            jVar = T.d.f2060c;
            bravo(sVar, ar.india, dVar, c0585q, (i18 & 14) | 1572864 | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | ((i18 << 3) & 29360128));
            i14 = Integer.MAX_VALUE;
            i15 = Integer.MAX_VALUE;
        } else {
            c0585q.ochre();
            i14 = i4;
            i15 = i5;
        }
        final T.s sVar2 = sVar;
        final C0537c c0537c3 = c0537c;
        final C0537c c0537c4 = c0537c2;
        final T.j jVar2 = jVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: androidx.compose.foundation.layout.ah
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i10 | 1);
                    P.d dVar2 = dVar;
                    aj.alpha(T.s.this, c0537c3, c0537c4, jVar2, i14, i15, dVar2, (InterfaceC0581m) obj, cyan, i11);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, androidx.compose.foundation.layout.z] */
    public static final void bravo(T.s sVar, ar arVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        boolean z17;
        boolean z18;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        T.j jVar = T.d.f2060c;
        C0537c c0537c = AbstractC0542h.charlie;
        C0537c c0537c2 = AbstractC0542h.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1956591841);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i5 = i18 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(c0537c2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i5 |= i17;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(c0537c)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i5 |= i16;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(jVar)) {
                i15 = 2048;
            } else {
                i15 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i15;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.echo(LottieConstants.IterateForever)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i5 |= i14;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.echo(LottieConstants.IterateForever)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i5 |= i13;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.golf(arVar)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q.india(dVar)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i5 |= i11;
        }
        int i19 = i5;
        if ((i19 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i19 & 1, z2)) {
            int i20 = i19 & 3670016;
            if (i20 == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (z10 || jade == asVar) {
                arVar.getClass();
                ak akVar = ak.alpha;
                jade = new Object();
                c0585q.f(jade);
            }
            ao aoVar = (ao) jade;
            int i21 = i19 >> 3;
            if ((((i21 & 14) ^ 6) > 4 && c0585q.golf(c0537c2)) || (i21 & 6) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((((i21 & 112) ^ 48) > 32 && c0585q.golf(c0537c)) || (i21 & 48) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z19 = z11 | z12;
            if ((((i21 & 896) ^ 384) > 256 && c0585q.golf(jVar)) || (i21 & 384) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z20 = z13 | z19;
            if ((((i21 & 7168) ^ 3072) > 2048 && c0585q.echo(LottieConstants.IterateForever)) || (i21 & 3072) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z21 = z20 | z14;
            if ((((57344 & i21) ^ 24576) > 16384 && c0585q.echo(LottieConstants.IterateForever)) || (i21 & 24576) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean golf = z21 | z15 | c0585q.golf(aoVar);
            Object jade2 = c0585q.jade();
            if (!golf && jade2 != asVar) {
                i10 = i20;
            } else {
                float f5 = 0;
                i10 = i20;
                aq aqVar = new aq(c0537c2, c0537c, f5, new Object(), f5, aoVar);
                c0585q.f(aqVar);
                jade2 = aqVar;
            }
            aq aqVar2 = (aq) jade2;
            if (i10 == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i19 & 29360128) == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z22 = z16 | z17;
            if ((i19 & 458752) == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z23 = z22 | z18;
            Object jade3 = c0585q.jade();
            Object obj = jade3;
            if (z23 || jade3 == asVar) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new P.d(new ai(0, dVar), -1192950673, true));
                arVar.getClass();
                int[] iArr = al.$EnumSwitchMapping$0;
                ak akVar2 = ak.alpha;
                int i22 = iArr[1];
                c0585q.f(arrayList);
                obj = arrayList;
            }
            P.d dVar2 = new P.d(new C0088b(8, (List) obj), 1271844412, true);
            boolean golf2 = c0585q.golf(aqVar2);
            Object jade4 = c0585q.jade();
            if (golf2 || jade4 == asVar) {
                jade4 = new q0.au(aqVar2);
                c0585q.f(jade4);
            }
            q0.ap apVar = (q0.ap) jade4;
            long j5 = c0585q.magenta;
            int i23 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, apVar);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i23))) {
                ao.ad.blue(i23, c0585q, i23, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            P0.indigo(0, dVar2, c0585q, true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(sVar, arVar, dVar, i4);
        }
    }

    public static final void charlie(q0.ao aoVar, aq aqVar, long j5, Function1 function1) {
        if (AbstractC0538d.mike(AbstractC0538d.lima(aoVar)) == 0.0f) {
            AbstractC0538d.lima(aoVar);
            AbstractC2367C victor = aoVar.victor(j5);
            function1.invoke(victor);
            aqVar.getClass();
            victor.navy();
            victor.maroon();
            return;
        }
        aqVar.getClass();
        aoVar.jade(aoVar.lima(LottieConstants.IterateForever));
    }
}
