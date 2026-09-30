package com.checkout.components.rememberme;

import F.AbstractC0141o0;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.checkout.components.rememberme.AbstractC0927b;
import com.checkout.components.rememberme.webview.BottomSheetWebViewClient;
import com.checkout.components.rememberme.webview.BottomSheetWebViewFactory;
import com.checkout.components.rememberme.webview.BottomSheetWebViewImpl;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: com.checkout.components.rememberme.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0927b {
    public static final Unit a(String str, BottomSheetWebViewState bottomSheetWebViewState, Context context, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(str, bottomSheetWebViewState, context, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(String str, BottomSheetWebViewState bottomSheetWebViewState, Context context, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        b(str, bottomSheetWebViewState, context, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(String str, Function0 function0, BottomSheetWebViewState bottomSheetWebViewState, Context context, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(str, function0, bottomSheetWebViewState, context, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void b(String url, final BottomSheetWebViewState webViewState, Context context, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(url, "url");
        Intrinsics.echo(webViewState, "webViewState");
        Intrinsics.echo(context, "context");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1802419911);
        if ((i4 & 6) == 0) {
            i5 = i4 | (c0585q.golf(url) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.golf(webViewState) ? 32 : 16;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                final int i10 = 0;
                Function0 function0 = new Function0() { // from class: a5.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                return AbstractC0927b.a(webViewState);
                            default:
                                return AbstractC0927b.b(webViewState);
                        }
                    }
                };
                final int i11 = 1;
                BottomSheetWebViewClient bottomSheetWebViewClient = new BottomSheetWebViewClient(function0, new Function0() { // from class: a5.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return AbstractC0927b.a(webViewState);
                            default:
                                return AbstractC0927b.b(webViewState);
                        }
                    }
                }, null, 4, null);
                c0585q.f(bottomSheetWebViewClient);
                jade = bottomSheetWebViewClient;
            }
            BottomSheetWebViewClient bottomSheetWebViewClient2 = (BottomSheetWebViewClient) jade;
            FillElement fillElement = androidx.compose.foundation.layout.V.charlie;
            int i12 = i5 & 112;
            int i13 = i5 & 14;
            boolean india = (i12 == 32) | c0585q.india(bottomSheetWebViewClient2) | (i13 == 4);
            Object jade2 = c0585q.jade();
            if (india || jade2 == asVar) {
                jade2 = new a5.w(webViewState, bottomSheetWebViewClient2, url);
                c0585q.f(jade2);
            }
            Function1 function1 = (Function1) jade2;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new a5.c(3);
                c0585q.f(jade3);
            }
            Function1 function12 = (Function1) jade3;
            boolean india2 = (i13 == 4) | c0585q.india(bottomSheetWebViewClient2) | (i12 == 32);
            Object jade4 = c0585q.jade();
            if (india2 || jade4 == asVar) {
                jade4 = new a5.w(bottomSheetWebViewClient2, url, webViewState);
                c0585q.f(jade4);
            }
            androidx.compose.ui.viewinterop.a.bravo(function1, fillElement, function12, (Function1) jade4, c0585q, 3120);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a5.x(url, webViewState, context, i4, 0);
        }
    }

    public static final void a(String url, Function0 onDismiss, BottomSheetWebViewState webViewState, Context context, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(url, "url");
        Intrinsics.echo(onDismiss, "onDismiss");
        Intrinsics.echo(webViewState, "webViewState");
        Intrinsics.echo(context, "context");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-978162259);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.golf(url) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.india(onDismiss) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.golf(webViewState) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q.india(context) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 1171) != 1170)) {
            T.p pVar = T.p.alpha;
            T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 16, 0.0f, 2);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(uniform, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                AbstractC0990w.a(i10, c0585q, i10, a6);
            }
            C2549i c2549i = C2551k.delta;
            C0564b.blue(c2549i, c0585q, charlie);
            T.s whiskey = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 0.0f, 0.0f, 0.0f, 8, 7);
            ap delta = AbstractC0547m.delta(T.d.white, false);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(whiskey, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a8 = AbstractC0987v.a(c2551k, c0585q, delta, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                AbstractC0990w.a(i11, c0585q, i11, a8);
            }
            C0564b.blue(c2549i, c0585q, charlie2);
            float f5 = 24;
            T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar, f5);
            boolean z2 = (i5 & 112) == 32;
            Object jade = c0585q.jade();
            if (z2 || jade == C0580l.alpha) {
                jade = new Bb.a(onDismiss, 24);
                c0585q.f(jade);
            }
            int i12 = i5;
            T.s alpha2 = androidx.compose.ui.platform.a.alpha(androidx.compose.foundation.a.echo(15, kilo, null, (Function0) jade, false), "webview_close_button");
            ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            long j7 = c0585q.magenta;
            int i13 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(alpha2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a10 = AbstractC0987v.a(c2551k, c0585q, delta2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                AbstractC0990w.a(i13, c0585q, i13, a10);
            }
            C0564b.blue(c2549i, c0585q, charlie3);
            AbstractC0141o0.bravo(AbstractC2056a.alpha(), "Close webview", androidx.compose.foundation.layout.V.kilo(pVar, f5), 0L, c0585q, 432, 8);
            c0585q.quebec(true);
            c0585q.quebec(true);
            int i14 = i12 >> 3;
            a(url, webViewState, context, c0585q, (i12 & 14) | (i14 & 112) | (i14 & 896));
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Gb.j(url, onDismiss, webViewState, context, i4, 5);
        }
    }

    public static final Unit b(BottomSheetWebViewState bottomSheetWebViewState) {
        bottomSheetWebViewState.onPageStarted();
        return Unit.INSTANCE;
    }

    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void a(String url, BottomSheetWebViewState webViewState, Context context, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(url, "url");
        Intrinsics.echo(webViewState, "webViewState");
        Intrinsics.echo(context, "context");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(799703294);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.golf(url) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.golf(webViewState) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(context) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 147) != 146)) {
            T.s foxtrot = androidx.compose.foundation.layout.V.foxtrot(AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f).then(androidx.compose.foundation.layout.V.charlie), 0.0f, 0.0f, 0.0f, 16, 7), HttpConstants.HTTP_BAD_REQUEST, 600);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(foxtrot, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, delta, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                AbstractC0990w.a(i10, c0585q, i10, a6);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            b(url, webViewState, context, c0585q, i5 & 1022);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a5.x(url, webViewState, context, i4, 1);
        }
    }

    public static final Unit a(BottomSheetWebViewState bottomSheetWebViewState) {
        bottomSheetWebViewState.onPageFinished();
        return Unit.INSTANCE;
    }

    public static final BottomSheetWebViewImpl a(BottomSheetWebViewState bottomSheetWebViewState, BottomSheetWebViewClient bottomSheetWebViewClient, String str, Context factoryContext) {
        Intrinsics.echo(factoryContext, "factoryContext");
        BottomSheetWebViewImpl createWebView = BottomSheetWebViewFactory.INSTANCE.createWebView(factoryContext, bottomSheetWebViewState.isExpanded());
        createWebView.setWebViewClient(bottomSheetWebViewClient);
        createWebView.onResume();
        createWebView.loadUrl(str);
        return createWebView;
    }

    public static final Unit a(BottomSheetWebViewClient bottomSheetWebViewClient, String str, BottomSheetWebViewState bottomSheetWebViewState, BottomSheetWebViewImpl webView) {
        Intrinsics.echo(webView, "webView");
        webView.setWebViewClient(bottomSheetWebViewClient);
        if (!Intrinsics.areEqual(webView.getUrl(), str)) {
            webView.loadUrl(str);
        }
        if (webView.getF6407a() != bottomSheetWebViewState.isExpanded()) {
            webView.updateExpansionState(bottomSheetWebViewState.isExpanded());
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(BottomSheetWebViewImpl webView) {
        Intrinsics.echo(webView, "webView");
        webView.onPause();
        return Unit.INSTANCE;
    }
}
