package com.checkout.components.rememberme.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import com.checkout.components.rememberme.AbstractC0930c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/rememberme/webview/BottomSheetWebViewFactory;", "", "Landroid/content/Context;", "context", "", "isExpanded", "Lcom/checkout/components/rememberme/webview/BottomSheetWebViewImpl;", "createWebView", "(Landroid/content/Context;Z)Lcom/checkout/components/rememberme/webview/BottomSheetWebViewImpl;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetWebViewFactory {
    public static final int $stable = 0;

    @NotNull
    public static final BottomSheetWebViewFactory INSTANCE = new BottomSheetWebViewFactory();

    private BottomSheetWebViewFactory() {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @NotNull
    public final BottomSheetWebViewImpl createWebView(@NotNull Context context, boolean isExpanded) {
        Intrinsics.echo(context, "context");
        BottomSheetWebViewImpl bottomSheetWebViewImpl = new BottomSheetWebViewImpl(context, isExpanded);
        AbstractC0930c.a(bottomSheetWebViewImpl);
        return bottomSheetWebViewImpl;
    }
}
