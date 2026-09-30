package t6;

import F.AbstractC0141o0;
import a0.C0366t;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import f0.AbstractC1680b;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t0.AbstractC2901T;

/* loaded from: classes2.dex */
public abstract class T2 {
    public static final void alpha(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String str, String str2, Function0 function0, boolean z2) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        T.s sVar2;
        String str3;
        Function0 function02;
        String str4;
        boolean z11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1305669927);
        if (c0585q.india(function0)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i5 | i4;
        if (c0585q.golf(sVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i14 | i10;
        if (c0585q.hotel(z2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i16 = i15 | i11;
        if (c0585q.golf(str)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i17 = i16 | i12;
        if (c0585q.golf(str2)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i18 = i17 | i13;
        if ((i18 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i18 & 1, z10)) {
            int i19 = i18 >> 3;
            int i20 = ((i18 >> 12) & 14) | (i19 & 112) | (i19 & 896);
            int i21 = i18 << 9;
            R2.alpha(i20 | (i21 & 7168) | (i21 & 57344), sVar, c0585q, str2, str, function0, z2);
            sVar2 = sVar;
            str4 = str2;
            str3 = str;
            function02 = function0;
            z11 = z2;
        } else {
            sVar2 = sVar;
            str3 = str;
            function02 = function0;
            str4 = str2;
            z11 = z2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Jc.i(str3, function02, sVar2, z11, str4, i4);
        }
    }

    public static final void bravo(AbstractC1680b mainIcon, String str, Function0 function0, T.s sVar, boolean z2, String str2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Function0 function02;
        boolean z10;
        boolean z11;
        C2549i c2549i;
        C2549i c2549i2;
        C2549i c2549i3;
        C0551q c0551q;
        C2550j c2550j;
        T.p pVar;
        boolean z12;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.echo(mainIcon, "mainIcon");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1072324088);
        if ((i4 & 6) == 0) {
            if (c0585q.india(mainIcon)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            function02 = function0;
            if (c0585q.india(function02)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        } else {
            function02 = function0;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.hotel(z2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.golf(str2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        int i16 = i5;
        if ((i16 & 74899) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i16 & 1, z10)) {
            androidx.compose.runtime.as asVar = C0580l.alpha;
            T.p pVar2 = T.p.alpha;
            float f5 = ob.p.alpha;
            C2093f bravo = AbstractC2094g.bravo(f5);
            Q0.d dVar = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
            float lavender = dVar.lavender(ob.p.bravo);
            float lavender2 = dVar.lavender(ob.p.charlie);
            float lavender3 = dVar.lavender(ob.p.delta);
            float lavender4 = dVar.lavender(f5);
            AbstractC1680b charlie = AbstractC3076w3.charlie(R.drawable.ic_upload_arrow, c0585q, 0);
            Object jade = c0585q.jade();
            if (jade == asVar) {
                jade = ao.ad.xray(c0585q);
            }
            T.s charlie2 = androidx.compose.foundation.a.charlie(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), bravo), (InterfaceC1673j) jade, null, true, null, function02, 24);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new X9.i(20);
                c0585q.f(jade2);
            }
            T.s bravo2 = A0.o.bravo(charlie2, false, (Function1) jade2);
            boolean delta = c0585q.delta(lavender) | c0585q.delta(lavender4) | c0585q.delta(lavender2) | c0585q.delta(lavender3);
            Object jade3 = c0585q.jade();
            if (delta || jade3 == asVar) {
                jade3 = new Za.g(lavender, lavender4, lavender2, lavender3, 0);
                c0585q.f(jade3);
            }
            T.s alpha = androidx.compose.ui.draw.a.alpha(bravo2, (Function1) jade3);
            T.k kVar = T.d.alpha;
            q0.ap delta2 = AbstractC0547m.delta(kVar, false);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(alpha, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C2549i c2549i4 = C2551k.foxtrot;
            C0564b.blue(c2549i4, c0585q, delta2);
            C2549i c2549i5 = C2551k.echo;
            C0564b.blue(c2549i5, c0585q, mike);
            C2549i c2549i6 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i6);
            }
            C2549i c2549i7 = C2551k.delta;
            C0564b.blue(c2549i7, c0585q, charlie3);
            C0551q c0551q2 = C0551q.alpha;
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), ob.p.foxtrot, ob.p.golf);
            T.k kVar2 = T.d.teal;
            T.s alpha2 = c0551q2.alpha(tango, kVar2);
            T.i iVar = T.d.f2063g;
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.india(ob.p.hotel, T.d.f2061d), iVar, c0585q, 54);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(alpha2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i4, c0585q, alpha3);
            C0564b.blue(c2549i5, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i6);
            }
            C0564b.blue(c2549i7, c0585q, charlie4);
            if (str2 != null && new File(str2).exists()) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f10 = ob.p.india;
            T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar2, f10);
            q0.ap delta3 = AbstractC0547m.delta(kVar, false);
            int romeo3 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie5 = T.a.charlie(kilo, c0585q);
            c0585q.white();
            boolean z13 = z11;
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i4, c0585q, delta3);
            C0564b.blue(c2549i5, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ao.ad.blue(romeo3, c0585q, romeo3, c2549i6);
            }
            C0564b.blue(c2549i7, c0585q, charlie5);
            T.s bravo3 = c0551q2.bravo();
            C2093f c2093f = AbstractC2094g.alpha;
            T.s alpha4 = AbstractC3087z.alpha(bravo3, c2093f);
            long j6 = ob.p.juliet;
            a0.an anVar = a0.ao.alpha;
            T.s bravo4 = androidx.compose.foundation.a.bravo(alpha4, j6, anVar);
            Object jade4 = c0585q.jade();
            if (jade4 == asVar) {
                jade4 = new X9.i(21);
                c0585q.f(jade4);
            }
            T.s alpha5 = androidx.compose.ui.draw.a.alpha(bravo4, (Function1) jade4);
            q0.ap delta4 = AbstractC0547m.delta(kVar2, false);
            int romeo4 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike4 = c0585q.mike();
            T.s charlie6 = T.a.charlie(alpha5, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i4, c0585q, delta4);
            C0564b.blue(c2549i5, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                ao.ad.blue(romeo4, c0585q, romeo4, c2549i6);
            }
            C0564b.blue(c2549i7, c0585q, charlie6);
            if (z13 && str2 != null) {
                c0585q.purple(785365769);
                W3.alpha(N2.p.juliet(new File(str2), c0585q, 0), null, AbstractC3087z.alpha(c0551q2.bravo(), c2093f), null, C2391j.alpha, 0.0f, null, c0585q, 24624, 104);
                c0585q.quebec(false);
                c2549i = c2549i7;
                c2549i3 = c2549i4;
                c2549i2 = c2549i6;
                c2550j = c2550j2;
                pVar = pVar2;
                z12 = false;
                c0551q = c0551q2;
            } else {
                c0585q.purple(785824941);
                c2549i = c2549i7;
                c2549i2 = c2549i6;
                c2549i3 = c2549i4;
                c0551q = c0551q2;
                c2550j = c2550j2;
                pVar = pVar2;
                z12 = false;
                AbstractC0141o0.alpha(mainIcon, null, androidx.compose.foundation.layout.V.kilo(pVar2, ob.p.kilo * f10), C0366t.kilo, c0585q, (i16 & 14) | 3504, 0);
                c0585q.quebec(false);
            }
            c0585q.quebec(true);
            T.s alpha6 = c0551q.alpha(pVar, T.d.f2059b);
            float f11 = ob.p.lima;
            T.s alpha7 = AbstractC3087z.alpha(androidx.compose.foundation.layout.V.kilo(alpha6, f11), c2093f);
            if (z2) {
                c0585q.purple(1781764634);
                j5 = ((F.O) c0585q.kilo(F.Q.alpha)).charlie;
                c0585q.quebec(z12);
            } else {
                c0585q.purple(1781767233);
                c0585q.quebec(z12);
                j5 = Db.c.charlie;
            }
            T.s bravo5 = androidx.compose.foundation.a.bravo(alpha7, j5, anVar);
            q0.ap delta5 = AbstractC0547m.delta(kVar2, z12);
            int romeo5 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike5 = c0585q.mike();
            T.s charlie7 = T.a.charlie(bravo5, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i3, c0585q, delta5);
            C0564b.blue(c2549i5, c0585q, mike5);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo5))) {
                ao.ad.blue(romeo5, c0585q, romeo5, c2549i2);
            }
            C0564b.blue(c2549i, c0585q, charlie7);
            if (z2) {
                c0585q.purple(-1161526345);
                AbstractC0141o0.bravo(i6.d.alpha(), null, androidx.compose.foundation.layout.V.kilo(pVar, f11 * 0.6f), ((F.O) c0585q.kilo(F.Q.alpha)).delta, c0585q, 432, 0);
                c0585q.quebec(z12);
            } else {
                c0585q.purple(-1161136799);
                AbstractC0141o0.alpha(charlie, null, androidx.compose.foundation.layout.V.kilo(pVar, f11), C0366t.kilo, c0585q, 3504, 0);
                c0585q.quebec(z12);
            }
            c0585q.quebec(true);
            c0585q.quebec(true);
            F.G2.bravo(str, null, Db.c.blue, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((F.S2) c0585q.kilo(F.T2.alpha)).kilo, 0L, AbstractC2636d7.delta(ob.p.mike, 4294967296L), ob.p.november, null, 0L, 0, 0L, null, null, 16777209), c0585q, (i16 >> 3) & 14, 0, 65530);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Za.h(mainIcon, str, function0, sVar, z2, str2, i4);
        }
    }

    public static final void charlie(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String str, Function0 function0, boolean z2) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(229423807);
        if (c0585q.india(function0)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i5 | i4;
        if (c0585q.golf(sVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.hotel(z2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.golf(str)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i16 & 1, z10)) {
            int i17 = i16 << 6;
            bravo(AbstractC3076w3.charlie(R.drawable.ic_upload_invoice, c0585q, 0), "Upload Invoice", function0, sVar, z2, str, c0585q, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 458752));
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Za.f(function0, sVar, z2, str, i4, 0);
        }
    }

    public static final void delta(Toolbar toolbar) {
        Object obj;
        Intrinsics.echo(toolbar, "<this>");
        Lf.h hVar = new Lf.h(8, toolbar);
        while (true) {
            if (hVar.hasNext()) {
                obj = hVar.next();
                if (((View) obj) instanceof AppCompatTextView) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            appCompatTextView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            layoutParams.width = -1;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            int[] iArr = new int[2];
            toolbar.getLocationOnScreen(iArr);
            marginLayoutParams.setMarginEnd(iArr[0]);
            View childAt = toolbar.getChildAt(1);
            if (childAt != null) {
                childAt.getWidth();
                toolbar.getContext().getResources().getDimensionPixelOffset(R.dimen.spacing_6);
                appCompatTextView.setLayoutParams(layoutParams);
                appCompatTextView.setTextAlignment(4);
                return;
            }
            throw new IndexOutOfBoundsException("Index: 1, Size: " + toolbar.getChildCount());
        }
    }
}
