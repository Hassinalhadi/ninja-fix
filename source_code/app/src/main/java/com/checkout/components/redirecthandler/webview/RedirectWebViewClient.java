package com.checkout.components.redirecthandler.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001c\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J-\u0010%\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0017¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/checkout/components/redirecthandler/webview/RedirectWebViewClient;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function1;", "", "", "onResult", "Lkotlin/Function0;", "", "onFatalError", "Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;", "eventLogger", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;)V", "Landroid/webkit/WebView;", "view", Constants.KEY_URL, "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceError;", RedirectCustomTabEventLogger.RESULT_ERROR, "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectWebViewClient extends WebViewClient {

    @Deprecated
    public static final int ERROR_CODE_UNKNOWN = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f5696a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f5697b;

    /* renamed from: c, reason: collision with root package name */
    private final RedirectWebViewEventLogger f5698c;

    public RedirectWebViewClient(@NotNull Function1<? super String, Boolean> onResult, @NotNull Function0<Unit> onFatalError, @NotNull RedirectWebViewEventLogger eventLogger) {
        Intrinsics.echo(onResult, "onResult");
        Intrinsics.echo(onFatalError, "onFatalError");
        Intrinsics.echo(eventLogger, "eventLogger");
        this.f5696a = onResult;
        this.f5697b = onFatalError;
        this.f5698c = eventLogger;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Nullable WebView view, @Nullable String url) {
        super.onPageFinished(view, url);
        this.f5698c.onPageLoadFinished();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        this.f5698c.onPageLoadStarted();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
        String str;
        int i4;
        CharSequence description;
        super.onReceivedError(view, request, error);
        if (request != null && request.isForMainFrame()) {
            RedirectWebViewEventLogger redirectWebViewEventLogger = this.f5698c;
            Uri url = request.getUrl();
            String str2 = null;
            if (url != null) {
                str = url.toString();
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            if (error != null) {
                i4 = error.getErrorCode();
            } else {
                i4 = -1;
            }
            if (error != null && (description = error.getDescription()) != null) {
                str2 = description.toString();
            }
            if (str2 != null) {
                str3 = str2;
            }
            redirectWebViewEventLogger.onPageLoadError(str, i4, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceResponse errorResponse) {
        String str;
        int i4;
        super.onReceivedHttpError(view, request, errorResponse);
        if (request != null && request.isForMainFrame()) {
            RedirectWebViewEventLogger redirectWebViewEventLogger = this.f5698c;
            Uri url = request.getUrl();
            String str2 = null;
            if (url != null) {
                str = url.toString();
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            if (errorResponse != null) {
                i4 = errorResponse.getStatusCode();
            } else {
                i4 = -1;
            }
            if (errorResponse != null) {
                str2 = errorResponse.getReasonPhrase();
            }
            if (str2 != null) {
                str3 = str2;
            }
            redirectWebViewEventLogger.onHttpError(str, i4, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(@Nullable WebView view, @Nullable SslErrorHandler handler, @Nullable SslError error) {
        String str;
        int i4;
        RedirectWebViewEventLogger redirectWebViewEventLogger = this.f5698c;
        if (error != null) {
            str = error.getUrl();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (error != null) {
            i4 = error.getPrimaryError();
        } else {
            i4 = -1;
        }
        redirectWebViewEventLogger.onSslError(str, i4);
        if (handler != null) {
            handler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
        boolean z2;
        RedirectWebViewEventLogger redirectWebViewEventLogger = this.f5698c;
        if (detail != null) {
            z2 = detail.didCrash();
        } else {
            z2 = false;
        }
        redirectWebViewEventLogger.onRendererGone(z2);
        this.f5697b.invoke();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
        Uri url;
        if (request != null && (url = request.getUrl()) != null) {
            Function1 function1 = this.f5696a;
            String uri = url.toString();
            Intrinsics.delta(uri, "toString(...)");
            return ((Boolean) function1.invoke(uri)).booleanValue();
        }
        return super.shouldOverrideUrlLoading(view, request);
    }
}
