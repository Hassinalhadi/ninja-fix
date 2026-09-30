package com.checkout.components.rememberme;

import android.webkit.WebSettings;
import com.checkout.components.rememberme.webview.BottomSheetWebViewImpl;

/* renamed from: com.checkout.components.rememberme.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0930c {
    public static final void a(BottomSheetWebViewImpl bottomSheetWebViewImpl) {
        bottomSheetWebViewImpl.setBackgroundColor(0);
        WebSettings settings = bottomSheetWebViewImpl.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkLoads(false);
        settings.setBlockNetworkImage(false);
        settings.setCacheMode(-1);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
    }
}
