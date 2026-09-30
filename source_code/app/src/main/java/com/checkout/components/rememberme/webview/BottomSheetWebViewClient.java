package com.checkout.components.rememberme.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import av.q;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0004\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0004\u0010\u000eJ-\u0010\u0005\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/checkout/components/rememberme/webview/BottomSheetWebViewClient;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function0;", "", "onPageFinished", "onPageStarted", "Lkotlin/Function1;", "", "onError", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/webkit/WebView;", "view", "finishedUrl", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "startedUrl", "Landroid/graphics/Bitmap;", "favicon", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceError;", RedirectCustomTabEventLogger.RESULT_ERROR, "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetWebViewClient extends WebViewClient {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f6404a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f6405b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f6406c;

    public /* synthetic */ BottomSheetWebViewClient(Function0 function0, Function0 function02, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i4 & 4) != 0 ? null : function1);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Nullable WebView view, @Nullable String finishedUrl) {
        super.onPageFinished(view, finishedUrl);
        this.f6404a.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@Nullable WebView view, @Nullable String startedUrl, @Nullable Bitmap favicon) {
        super.onPageStarted(view, startedUrl, favicon);
        this.f6405b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
        CharSequence charSequence;
        if (error != null) {
            charSequence = error.getDescription();
        } else {
            charSequence = null;
        }
        String str = "Error loading page: " + ((Object) charSequence);
        Function1 function1 = this.f6406c;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(@Nullable WebView view, @Nullable SslErrorHandler handler, @Nullable SslError error) {
        String str;
        if (handler != null) {
            handler.cancel();
        }
        if (error != null) {
            str = error.toString();
        } else {
            str = null;
        }
        String echo = q.echo("SSL Error: ", str);
        Function1 function1 = this.f6406c;
        if (function1 != null) {
            function1.invoke(echo);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
        return false;
    }

    public BottomSheetWebViewClient(@NotNull Function0<Unit> onPageFinished, @NotNull Function0<Unit> onPageStarted, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.echo(onPageFinished, "onPageFinished");
        Intrinsics.echo(onPageStarted, "onPageStarted");
        this.f6404a = onPageFinished;
        this.f6405b = onPageStarted;
        this.f6406c = function1;
    }
}
