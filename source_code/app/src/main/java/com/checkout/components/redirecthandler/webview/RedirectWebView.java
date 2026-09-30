package com.checkout.components.redirecthandler.webview;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/redirecthandler/webview/RedirectWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "destroy", "()V", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectWebView(@NotNull Context context) {
        super(context);
        Intrinsics.echo(context, "context");
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMixedContentMode(2);
        settings.setCacheMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        if (Build.VERSION.SDK_INT >= 26) {
            setRendererPriorityPolicy(2, false);
        }
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        stopLoading();
        clearHistory();
        onPause();
        removeAllViews();
        super.destroy();
    }
}
