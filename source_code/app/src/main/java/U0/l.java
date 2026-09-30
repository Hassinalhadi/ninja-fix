package U0;

import B2.ap;
import F.C0092c;
import F.C0124k;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0584p;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;

/* loaded from: classes3.dex */
public abstract class l {
    public static final androidx.compose.runtime.aa alpha = new androidx.compose.runtime.aa(d.red);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(ac acVar, Function0 function0, ad adVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        Function0 function02;
        int i11;
        ad adVar2;
        int i12;
        boolean z2;
        Function0 function03;
        Q uniform;
        Function0 function04;
        String str;
        boolean z10;
        boolean z11;
        Object gVar;
        int i13;
        boolean z12;
        z zVar;
        String str2;
        boolean z13;
        boolean z14;
        Q0.n nVar;
        boolean z15;
        int i14;
        int i15;
        int i16;
        ac acVar2 = acVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1772091631);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(acVar2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        int i17 = i5 & 2;
        if (i17 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            function02 = function0;
            if (c0585q.india(function02)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) != 0) {
                adVar2 = adVar;
                if (c0585q.golf(adVar2)) {
                    i15 = Barcode.FORMAT_QR_CODE;
                } else {
                    i15 = 128;
                }
                i10 |= i15;
            } else {
                adVar2 = adVar;
            }
            if ((i4 & 3072) == 0) {
                if (c0585q.india(dVar)) {
                    i14 = 2048;
                } else {
                    i14 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i14;
            }
            i12 = i10;
            if ((i12 & 1171) == 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i12 & 1, z2)) {
                if (i17 != 0) {
                    function04 = null;
                } else {
                    function04 = function02;
                }
                View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
                Q0.d dVar2 = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
                String str3 = (String) c0585q.kilo(alpha);
                Q0.n nVar2 = (Q0.n) c0585q.kilo(AbstractC2901T.november);
                C0584p beige = C0564b.beige(c0585q);
                ax black = C0564b.black(dVar, c0585q);
                Object[] objArr = new Object[0];
                Object jade = c0585q.jade();
                as asVar = C0580l.alpha;
                if (jade == asVar) {
                    jade = d.silver;
                    c0585q.f(jade);
                }
                UUID uuid = (UUID) R.l.echo(objArr, (Function0) jade, c0585q, 48);
                Object jade2 = c0585q.jade();
                if (jade2 == asVar) {
                    str = str3;
                    z zVar2 = new z(function04, adVar2, str, view, dVar2, acVar2, uuid);
                    acVar2 = acVar2;
                    zVar2.juliet(beige, new P.d(new C0092c(5, zVar2, black), -297523940, true));
                    c0585q.f(zVar2);
                    jade2 = zVar2;
                } else {
                    str = str3;
                }
                z zVar3 = (z) jade2;
                boolean india = c0585q.india(zVar3);
                int i18 = i12 & 112;
                if (i18 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z16 = india | z10;
                int i19 = i12 & 896;
                if (i19 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean golf = z16 | z11 | c0585q.golf(str) | c0585q.echo(nVar2.ordinal());
                Object jade3 = c0585q.jade();
                if (!golf && jade3 != asVar) {
                    str2 = str;
                    i13 = i12;
                    gVar = jade3;
                    z12 = true;
                    zVar = zVar3;
                } else {
                    String str4 = str;
                    i13 = i12;
                    z12 = true;
                    zVar = zVar3;
                    gVar = new g(zVar, function04, adVar, str4, nVar2);
                    str2 = str4;
                    c0585q.f(gVar);
                }
                C0564b.delta(zVar, (Function1) gVar, c0585q);
                boolean india2 = c0585q.india(zVar);
                if (i18 == 32) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                boolean z17 = z13 | india2;
                if (i19 == 256) {
                    z14 = z12;
                } else {
                    z14 = false;
                }
                boolean golf2 = z17 | z14 | c0585q.golf(str2) | c0585q.echo(nVar2.ordinal());
                Object jade4 = c0585q.jade();
                if (!golf2 && jade4 != asVar) {
                    nVar = nVar2;
                } else {
                    De.b bVar = new De.b(zVar, function04, adVar, str2, nVar2, 1);
                    nVar = nVar2;
                    c0585q.f(bVar);
                    jade4 = bVar;
                }
                C0564b.juliet((Function0) jade4, c0585q);
                boolean india3 = c0585q.india(zVar);
                if ((i13 & 14) == 4) {
                    z15 = z12;
                } else {
                    z15 = false;
                }
                boolean z18 = z15 | india3;
                Object jade5 = c0585q.jade();
                if (z18 || jade5 == asVar) {
                    jade5 = new ap(13, zVar, acVar2);
                    c0585q.f(jade5);
                }
                C0564b.delta(acVar2, (Function1) jade5, c0585q);
                boolean india4 = c0585q.india(zVar);
                Object jade6 = c0585q.jade();
                if (india4 || jade6 == asVar) {
                    jade6 = new i(zVar, null);
                    c0585q.f(jade6);
                }
                C0564b.foxtrot((Xd.l) jade6, c0585q, zVar);
                T.p pVar = T.p.alpha;
                boolean india5 = c0585q.india(zVar);
                Object jade7 = c0585q.jade();
                if (india5 || jade7 == asVar) {
                    jade7 = new j(zVar, 0);
                    c0585q.f(jade7);
                }
                T.s delta = androidx.compose.ui.layout.a.delta(pVar, (Function1) jade7);
                boolean india6 = c0585q.india(zVar) | c0585q.echo(nVar.ordinal());
                Object jade8 = c0585q.jade();
                if (india6 || jade8 == asVar) {
                    jade8 = new T0.e(1, zVar, nVar);
                    c0585q.f(jade8);
                }
                q0.ap apVar = (q0.ap) jade8;
                long j5 = c0585q.magenta;
                int i20 = (int) (j5 ^ (j5 >>> 32));
                I mike = c0585q.mike();
                T.s charlie = T.a.charlie(delta, c0585q);
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
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                    ao.ad.blue(i20, c0585q, i20, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie);
                c0585q.quebec(z12);
                function03 = function04;
            } else {
                c0585q.ochre();
                function03 = function02;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0124k(acVar2, function03, adVar, dVar, i4, i5);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i4 & 384) != 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        i12 = i10;
        if ((i12 & 1171) == 1170) {
        }
        if (!c0585q.magenta(i12 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final boolean bravo(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
