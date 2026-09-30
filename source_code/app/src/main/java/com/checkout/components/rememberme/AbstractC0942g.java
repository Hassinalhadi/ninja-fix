package com.checkout.components.rememberme;

import F.AbstractC0122j1;
import F.C0103e2;
import android.content.Context;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;

/* renamed from: com.checkout.components.rememberme.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0942g {
    public static final Unit a(String str, Function0 function0, C0103e2 c0103e2, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(str, function0, c0103e2, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String url, Function0 onDismiss, C0103e2 c0103e2, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        C0103e2 c0103e22;
        int i11;
        C0585q c0585q;
        C0103e2 c0103e23;
        androidx.compose.runtime.Q uniform;
        C0103e2 c0103e24;
        Intrinsics.echo(url, "url");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(931905460);
        if ((i4 & 6) == 0) {
            i10 = (c0585q2.golf(url) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= c0585q2.india(onDismiss) ? 32 : 16;
        }
        int i12 = i5 & 4;
        if (i12 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            c0103e22 = c0103e2;
            i10 |= c0585q2.golf(c0103e22) ? Barcode.FORMAT_QR_CODE : 128;
            i11 = i10;
            if (!c0585q2.magenta(i11 & 1, (i11 & 147) == 146)) {
                C0103e2 c0103e25 = i12 != 0 ? null : c0103e22;
                Context context = (Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo);
                Object jade = c0585q2.jade();
                as asVar = C0580l.alpha;
                if (jade == asVar) {
                    jade = new BottomSheetWebViewState();
                    c0585q2.f(jade);
                }
                BottomSheetWebViewState bottomSheetWebViewState = (BottomSheetWebViewState) jade;
                if (c0103e25 == null) {
                    c0585q2.purple(-2087004417);
                    C0103e2 foxtrot = AbstractC0122j1.foxtrot(false, c0585q2, 6, 2);
                    c0585q2.quebec(false);
                    c0103e24 = foxtrot;
                } else {
                    c0585q2.purple(-2087004851);
                    c0585q2.quebec(false);
                    c0103e24 = c0103e25;
                }
                boolean golf = c0585q2.golf(bottomSheetWebViewState) | ((i11 & 14) == 4);
                Object jade2 = c0585q2.jade();
                if (golf || jade2 == asVar) {
                    jade2 = new C0933d(bottomSheetWebViewState, url, null);
                    c0585q2.f(jade2);
                }
                C0564b.foxtrot((Xd.l) jade2, c0585q2, url);
                boolean golf2 = c0585q2.golf(c0103e24) | c0585q2.golf(bottomSheetWebViewState);
                Object jade3 = c0585q2.jade();
                if (golf2 || jade3 == asVar) {
                    jade3 = new C0939f(c0103e24, bottomSheetWebViewState, null);
                    c0585q2.f(jade3);
                }
                C0564b.foxtrot((Xd.l) jade3, c0585q2, c0103e24);
                float f5 = 24;
                c0585q = c0585q2;
                AbstractC0122j1.alpha(onDismiss, androidx.compose.ui.platform.a.alpha(T.p.alpha, "webview_bottom_sheet"), c0103e24, 0.0f, AbstractC2094g.delta(f5, f5), ((F.O) c0585q2.kilo(F.Q.alpha)).papa, 0L, 0.0f, 0L, null, null, null, P.e.echo(1500604177, new Ac.d(url, onDismiss, bottomSheetWebViewState, context, 4), c0585q2), c0585q, ((i11 >> 3) & 14) | 48, 4040);
                c0103e23 = c0103e25;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                c0103e23 = c0103e22;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Lb.F(url, onDismiss, c0103e23, i4, i5, 2);
                return;
            }
            return;
        }
        c0103e22 = c0103e2;
        i11 = i10;
        if (!c0585q2.magenta(i11 & 1, (i11 & 147) == 146)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit a(String str, Function0 function0, BottomSheetWebViewState bottomSheetWebViewState, Context context, InterfaceC0555v ModalBottomSheet, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 17) != 16)) {
            AbstractC0927b.a(str, function0, bottomSheetWebViewState, context, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
