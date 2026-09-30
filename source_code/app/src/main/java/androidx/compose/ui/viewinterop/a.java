package androidx.compose.ui.viewinterop;

import F.C0134m1;
import Q0.c;
import Q0.d;
import Q0.n;
import R.g;
import R.i;
import R1.e;
import T.r;
import T.s;
import T0.b;
import T0.m;
import T0.o;
import T0.t;
import Y.aa;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0584p;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.al;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC2196f;
import okhttp3.internal.http2.Http2;
import p2.AbstractC2268a;
import s0.C2549i;
import s0.C2551k;
import s0.F;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;
import t0.C2915g0;

/* loaded from: classes3.dex */
public abstract class a {
    public static final b alpha = b.teal;

    public static final void alpha(Function1 function1, s sVar, Function1 function12, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        s sVar2;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1783766393);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i14 = i5 & 4;
        if (i14 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c0585q.india(function12)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            b bVar = alpha;
            if (i14 != 0) {
                function15 = bVar;
            } else {
                function15 = function12;
            }
            sVar2 = sVar;
            bravo(function1, sVar2, bVar, function15, c0585q, (i10 & 14) | 3072 | (i10 & 112) | ((i10 << 6) & 57344));
            function13 = function1;
            function14 = function15;
        } else {
            sVar2 = sVar;
            function13 = function1;
            c0585q.ochre();
            function14 = function12;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new m(function13, sVar2, function14, i4, i5);
        }
    }

    public static final void bravo(Function1 function1, s sVar, Function1 function12, Function1 function13, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Function1 function14;
        boolean z10;
        InterfaceC2196f interfaceC2196f;
        d dVar;
        al alVar;
        I i10;
        n nVar;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-180024211);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function1)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        int i15 = i5 | 384;
        if ((i4 & 3072) == 0) {
            if (c0585q.india(function12)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i15 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(function13)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i15 |= i11;
        }
        if ((i15 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i15 & 1, z2)) {
            long j5 = c0585q.magenta;
            int i16 = (int) ((j5 >>> 32) ^ j5);
            s then = sVar.then(FocusGroupPropertiesElement.alpha);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new F() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                @Override // s0.F
                public final r create() {
                    return new aa(0, null, 7);
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // s0.F
                public final void inspectableProperties(C2915g0 c2915g0) {
                    c2915g0.alpha = "focusTarget";
                }

                @Override // s0.F
                public final /* bridge */ /* synthetic */ void update(r rVar) {
                }
            };
            s charlie = T.a.charlie(then.then(focusTargetNode$FocusTargetElement).then(FocusTargetPropertiesElement.alpha).then(focusTargetNode$FocusTargetElement), c0585q);
            d dVar2 = (d) c0585q.kilo(AbstractC2901T.hotel);
            n nVar2 = (n) c0585q.kilo(AbstractC2901T.november);
            I mike = c0585q.mike();
            al alVar2 = (al) c0585q.kilo(e.alpha);
            InterfaceC2196f interfaceC2196f2 = (InterfaceC2196f) c0585q.kilo(AbstractC2268a.alpha);
            c0585q.purple(1314800527);
            int i17 = i15 & 14;
            long j6 = c0585q.magenta;
            int i18 = (int) (j6 ^ (j6 >>> 32));
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            C0584p beige = C0564b.beige(c0585q);
            g gVar = (g) c0585q.kilo(i.alpha);
            View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
            boolean india = c0585q.india(context);
            if ((((i17 & 14) ^ 6) > 4 && c0585q.golf(function1)) || (i17 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean india2 = india | z10 | c0585q.india(beige) | c0585q.india(gVar) | c0585q.echo(i18) | c0585q.india(view);
            Object jade = c0585q.jade();
            if (!india2 && jade != C0580l.alpha) {
                interfaceC2196f = interfaceC2196f2;
                nVar = nVar2;
                dVar = dVar2;
                alVar = alVar2;
                i10 = mike;
            } else {
                interfaceC2196f = interfaceC2196f2;
                dVar = dVar2;
                alVar = alVar2;
                i10 = mike;
                nVar = nVar2;
                o oVar = new o(context, function1, beige, gVar, i18, view);
                c0585q.f(oVar);
                jade = oVar;
            }
            Function0 function0 = (Function0) jade;
            c0585q.olive(125, 1, null, null);
            c0585q.romeo = true;
            if (c0585q.lime) {
                c0585q.lima(function0);
            } else {
                c0585q.i();
            }
            InterfaceC2552l.maroon.getClass();
            C0564b.blue(C2551k.echo, c0585q, i10);
            C0564b.blue(T0.n.silver, c0585q, charlie);
            C0564b.blue(T0.n.teal, c0585q, dVar);
            C0564b.blue(T0.n.white, c0585q, alVar);
            C0564b.blue(T0.n.yellow, c0585q, interfaceC2196f);
            C0564b.blue(T0.n.f2084c, c0585q, nVar);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q, i16, c2549i);
            }
            C0564b.blue(T0.n.purple, c0585q, function13);
            function14 = function12;
            C0564b.blue(T0.n.red, c0585q, function14);
            c0585q.quebec(true);
            c0585q.quebec(false);
        } else {
            function14 = function12;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0134m1(function1, sVar, function14, function13, i4, 1);
        }
    }

    public static final t charlie(s0.al alVar) {
        t tVar = alVar.f13288g;
        if (tVar != null) {
            return tVar;
        }
        throw c.xray("Required value was null.");
    }
}
