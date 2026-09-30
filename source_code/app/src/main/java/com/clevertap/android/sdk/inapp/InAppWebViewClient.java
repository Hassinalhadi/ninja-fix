package com.clevertap.android.sdk.inapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppWebViewClient;", "Landroid/webkit/WebViewClient;", "fragment", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;)V", "fragmentWr", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", Constants.KEY_URL, "", "request", "Landroid/webkit/WebResourceRequest;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppWebViewClient extends WebViewClient {

    @NotNull
    private final WeakReference<CTInAppBaseFragment> fragmentWr;

    public InAppWebViewClient(@NotNull CTInAppBaseFragment fragment) {
        Intrinsics.echo(fragment, "fragment");
        this.fragmentWr = new WeakReference<>(fragment);
    }

    @Override // android.webkit.WebViewClient
    @c
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        Intrinsics.echo(view, "view");
        Intrinsics.echo(url, "url");
        CTInAppBaseFragment cTInAppBaseFragment = this.fragmentWr.get();
        if (cTInAppBaseFragment != null) {
            cTInAppBaseFragment.openActionUrl(url);
            return true;
        }
        Logger.v("InAppWebViewClient : Android view is gone, not opening url");
        return true;
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"UseRequiresApi"})
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) {
        String uri;
        Intrinsics.echo(view, "view");
        Intrinsics.echo(request, "request");
        Uri url = request.getUrl();
        if (url != null && (uri = url.toString()) != null) {
            CTInAppBaseFragment cTInAppBaseFragment = this.fragmentWr.get();
            if (cTInAppBaseFragment != null) {
                cTInAppBaseFragment.openActionUrl(uri);
                return true;
            }
            Logger.v("InAppWebViewClient : Android view is gone, not opening url");
            return true;
        }
        Logger.v("InAppWebViewClient : Url to open is null; not processing");
        return true;
    }
}
