package com.checkout.components.redirecthandler;

import B2.q;
import Cb.ad;
import Xd.l;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.redirecthandler.RedirectWebViewExecutor;
import com.checkout.components.redirecthandler.model.RedirectRequest;
import com.checkout.components.redirecthandler.model.RedirectResult;
import com.checkout.components.redirecthandler.webview.RedirectWebChromeClient;
import com.checkout.components.redirecthandler.webview.RedirectWebView;
import com.checkout.components.redirecthandler.webview.RedirectWebViewClient;
import com.checkout.components.redirecthandler.webview.RedirectWebViewEventLogger;
import com.clevertap.android.sdk.Constants;
import j1.C1929c;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s1.J;
import s1.K;
import s1.L;
import s1.M;
import s1.N;
import s1.O;
import s1.a0;
import s1.aj;
import s1.al;
import s1.au;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010#\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00062\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001dj\u0002`\u001eH\u0001¢\u0006\u0004\b!\u0010\"R*\u0010-\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectWebViewExecutor;", "Lcom/checkout/components/redirecthandler/Executor;", "Lcom/checkout/components/redirecthandler/model/RedirectRequest;", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/usecase/UseCase;", "", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "processResultUseCase", "Lkotlin/Function1;", "", "onRedirectDismissed", "Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;", "eventLogger", "<init>", "(Landroid/content/Context;Lcom/checkout/components/interfaces/usecase/UseCase;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;)V", "request", "execute", "(Lcom/checkout/components/redirecthandler/model/RedirectRequest;)V", "Landroid/webkit/WebView;", "provideWebView$redirect_handler_standardRelease", "(Lcom/checkout/components/redirecthandler/model/RedirectRequest;)Landroid/webkit/WebView;", "provideWebView", "Landroid/view/View;", "view", "applyWindowInsets$redirect_handler_standardRelease", "(Landroid/view/View;)V", "applyWindowInsets", Constants.KEY_URL, "Lkotlin/Function2;", "Lcom/checkout/components/redirecthandler/model/RedirectResultHandler;", "resultHandler", "", "handleResult$redirect_handler_standardRelease", "(Ljava/lang/String;LXd/l;)Z", "handleResult", "Lcom/checkout/components/redirecthandler/webview/RedirectWebView;", "e", "Lcom/checkout/components/redirecthandler/webview/RedirectWebView;", "getWebView$redirect_handler_standardRelease", "()Lcom/checkout/components/redirecthandler/webview/RedirectWebView;", "setWebView$redirect_handler_standardRelease", "(Lcom/checkout/components/redirecthandler/webview/RedirectWebView;)V", "getWebView$redirect_handler_standardRelease$annotations", "()V", "webView", "Factory", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectWebViewExecutor implements Executor<RedirectRequest> {

    /* renamed from: a */
    private final Context f5655a;

    /* renamed from: b */
    private final UseCase f5656b;

    /* renamed from: c */
    private final Function1 f5657c;

    /* renamed from: d */
    private final RedirectWebViewEventLogger f5658d;

    /* renamed from: e, reason: from kotlin metadata */
    private RedirectWebView webView;

    /* renamed from: f */
    private final ViewGroup f5659f;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectWebViewExecutor$Factory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/usecase/UseCase;", "", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "processResultUseCase", "Lkotlin/Function1;", "", "onRedirectDismissed", "Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;", "eventLogger", "Lcom/checkout/components/redirecthandler/RedirectWebViewExecutor;", "create", "(Landroid/content/Context;Lcom/checkout/components/interfaces/usecase/UseCase;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;)Lcom/checkout/components/redirecthandler/RedirectWebViewExecutor;", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Factory {
        @NotNull
        public final RedirectWebViewExecutor create(@NotNull Context context, @NotNull UseCase<String, RedirectResult> processResultUseCase, @NotNull Function1<? super String, Unit> onRedirectDismissed, @NotNull RedirectWebViewEventLogger eventLogger) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(processResultUseCase, "processResultUseCase");
            Intrinsics.echo(onRedirectDismissed, "onRedirectDismissed");
            Intrinsics.echo(eventLogger, "eventLogger");
            return new RedirectWebViewExecutor(context, processResultUseCase, onRedirectDismissed, eventLogger);
        }
    }

    public RedirectWebViewExecutor(@NotNull Context context, @NotNull UseCase<String, RedirectResult> processResultUseCase, @NotNull Function1<? super String, Unit> onRedirectDismissed, @NotNull RedirectWebViewEventLogger eventLogger) {
        Activity activity;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(processResultUseCase, "processResultUseCase");
        Intrinsics.echo(onRedirectDismissed, "onRedirectDismissed");
        Intrinsics.echo(eventLogger, "eventLogger");
        this.f5655a = context;
        this.f5656b = processResultUseCase;
        this.f5657c = onRedirectDismissed;
        this.f5658d = eventLogger;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f5659f = activity != null ? (ViewGroup) activity.findViewById(android.R.id.content) : null;
    }

    public static final boolean a(WebView webView, RedirectWebViewExecutor redirectWebViewExecutor, View view, int i4, KeyEvent keyEvent) {
        if (i4 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            redirectWebViewExecutor.f5657c.invoke(redirectWebViewExecutor.f5658d.buildAuthFailedStack("dismissed", RedirectWebViewEventLogger.DISMISS_REASON_USER_BACK_PRESS));
            redirectWebViewExecutor.a();
        }
        return true;
    }

    public static /* synthetic */ boolean bravo(RedirectWebViewExecutor redirectWebViewExecutor, RedirectRequest redirectRequest, String str) {
        return a(redirectWebViewExecutor, redirectRequest, str);
    }

    public static /* synthetic */ Unit delta(RedirectWebViewExecutor redirectWebViewExecutor) {
        return a(redirectWebViewExecutor);
    }

    public static /* synthetic */ void getWebView$redirect_handler_standardRelease$annotations() {
    }

    public final void applyWindowInsets$redirect_handler_standardRelease(@NotNull View view) {
        Intrinsics.echo(view, "view");
        view.setFitsSystemWindows(true);
        S7.a aVar = new S7.a(6);
        WeakHashMap weakHashMap = au.alpha;
        al.lima(view, aVar);
        aj.charlie(view);
    }

    @Nullable
    /* renamed from: getWebView$redirect_handler_standardRelease, reason: from getter */
    public final RedirectWebView getWebView() {
        return this.webView;
    }

    public final boolean handleResult$redirect_handler_standardRelease(@NotNull String r4, @NotNull l resultHandler) {
        String str;
        Intrinsics.echo(r4, "url");
        Intrinsics.echo(resultHandler, "resultHandler");
        RedirectResult redirectResult = (RedirectResult) this.f5656b.execute(r4);
        if (redirectResult != null) {
            if (redirectResult instanceof RedirectResult.Failure) {
                str = this.f5658d.buildAuthFailedStack("failure", null);
            } else {
                str = "";
            }
            resultHandler.invoke(redirectResult, str);
            a();
            return true;
        }
        return false;
    }

    @NotNull
    public final WebView provideWebView$redirect_handler_standardRelease(@NotNull RedirectRequest request) {
        Intrinsics.echo(request, "request");
        RedirectWebView redirectWebView = new RedirectWebView(this.f5655a);
        redirectWebView.setBackgroundColor(-1);
        redirectWebView.setFocusableInTouchMode(true);
        redirectWebView.requestFocus();
        redirectWebView.setWebViewClient(new RedirectWebViewClient(new ad(22, this, request), new q(27, this), this.f5658d));
        redirectWebView.setWebChromeClient(new RedirectWebChromeClient(this.f5658d));
        redirectWebView.loadUrl(request.getRedirectUrl());
        this.webView = redirectWebView;
        return redirectWebView;
    }

    public final void setWebView$redirect_handler_standardRelease(@Nullable RedirectWebView redirectWebView) {
        this.webView = redirectWebView;
    }

    @Override // com.checkout.components.redirecthandler.Executor
    public final void execute(@NotNull RedirectRequest request) {
        Intrinsics.echo(request, "request");
        this.f5658d.onRedirectStarted(request.getRedirectUrl());
        final WebView provideWebView$redirect_handler_standardRelease = provideWebView$redirect_handler_standardRelease(request);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(provideWebView$redirect_handler_standardRelease.getContext());
        frameLayout.addView(provideWebView$redirect_handler_standardRelease, layoutParams);
        ViewGroup viewGroup = this.f5659f;
        if (viewGroup != null) {
            viewGroup.addView(frameLayout, layoutParams);
        }
        applyWindowInsets$redirect_handler_standardRelease(frameLayout);
        provideWebView$redirect_handler_standardRelease.setOnKeyListener(new View.OnKeyListener() { // from class: Y4.b
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                boolean a6;
                a6 = RedirectWebViewExecutor.a(provideWebView$redirect_handler_standardRelease, this, view, i4, keyEvent);
                return a6;
            }
        });
    }

    public static final boolean a(RedirectWebViewExecutor redirectWebViewExecutor, RedirectRequest redirectRequest, String url) {
        Intrinsics.echo(url, "url");
        return redirectWebViewExecutor.handleResult$redirect_handler_standardRelease(url, redirectRequest.getResultHandler());
    }

    public static final Unit a(RedirectWebViewExecutor redirectWebViewExecutor) {
        redirectWebViewExecutor.f5657c.invoke(redirectWebViewExecutor.f5658d.buildAuthFailedStack("dismissed", RedirectWebViewEventLogger.DISMISS_REASON_RENDERER_GONE));
        redirectWebViewExecutor.a();
        return Unit.INSTANCE;
    }

    private final void a() {
        RedirectWebView redirectWebView = this.webView;
        if (redirectWebView != null) {
            ViewParent parent = redirectWebView.getParent();
            FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
            if (frameLayout != null) {
                WeakHashMap weakHashMap = au.alpha;
                al.lima(frameLayout, null);
            }
            if (frameLayout != null) {
                frameLayout.removeView(redirectWebView);
            }
            ViewParent parent2 = frameLayout != null ? frameLayout.getParent() : null;
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
            redirectWebView.destroy();
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.webView = null;
        }
    }

    public static final a0 a(View v4, a0 insets) {
        O j5;
        Intrinsics.echo(v4, "v");
        Intrinsics.echo(insets, "insets");
        C1929c golf = insets.alpha.golf(527);
        Intrinsics.delta(golf, "getInsets(...)");
        v4.setPadding(golf.alpha, golf.bravo, golf.charlie, golf.delta);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            j5 = new N(insets);
        } else if (i4 >= 31) {
            j5 = new M(insets);
        } else if (i4 >= 30) {
            j5 = new L(insets);
        } else if (i4 >= 29) {
            j5 = new K(insets);
        } else {
            j5 = new J(insets);
        }
        C1929c c1929c = C1929c.echo;
        j5.charlie(519, c1929c);
        j5.charlie(8, c1929c);
        return j5.bravo();
    }
}
