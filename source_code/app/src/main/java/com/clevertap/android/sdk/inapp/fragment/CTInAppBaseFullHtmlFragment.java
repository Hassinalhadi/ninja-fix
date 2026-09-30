package com.clevertap.android.sdk.inapp.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.P0;
import androidx.fragment.app.an;
import com.clevertap.android.sdk.CTWebInterface;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppWebView;
import com.clevertap.android.sdk.inapp.InAppWebViewClient;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u001c\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u000bH\u0002J\b\u0010%\u001a\u00020\u000bH\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006)"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullHtmlFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "webView", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "getWebView", "()Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "setWebView", "(Lcom/clevertap/android/sdk/inapp/CTInAppWebView;)V", "value", "", "isFullscreen", "()Z", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "getLayoutParamsForCloseButton", "Landroid/widget/RelativeLayout$LayoutParams;", "webViewId", "", "displayHTMLView", "initWebViewLayoutParams", "params", "isCloseButtonEnabled", "isDarkenEnabled", "reDrawInApp", "cleanupWebView", "updateFullscreenInfo", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CTInAppBaseFullHtmlFragment extends CTInAppBaseFullFragment {
    private boolean isFullscreen;

    @Nullable
    private CTInAppWebView webView;

    private final void cleanupWebView() {
        try {
            CTInAppWebView cTInAppWebView = this.webView;
            if (cTInAppWebView != null) {
                cTInAppWebView.cleanup(getInAppNotification().getIsJsEnabled());
            }
            this.webView = null;
        } catch (Exception e) {
            getConfig().getLogger().verbose("cleanupWebView -> there was a crash in cleanup", e);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final View displayHTMLView(LayoutInflater inflater, ViewGroup container) {
        try {
            View inflate = inflater.inflate(R.layout.inapp_html_full, container, false);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.inapp_html_full_relative_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            initWebViewLayoutParams(layoutParams);
            Context requireContext = requireContext();
            Intrinsics.delta(requireContext, "requireContext(...)");
            CTInAppWebView cTInAppWebView = new CTInAppWebView(requireContext, getInAppNotification().getWidth(), getInAppNotification().getHeight(), getInAppNotification().getWidthPercentage(), getInAppNotification().getHeightPercentage());
            cTInAppWebView.setFullscreen(this.isFullscreen);
            this.webView = cTInAppWebView;
            cTInAppWebView.setWebViewClient(new InAppWebViewClient(this));
            if (getInAppNotification().getIsJsEnabled()) {
                cTInAppWebView.setJavaScriptInterface(new CTWebInterface(CleverTapAPI.instanceWithConfig(getActivity(), getConfig()), this));
            }
            if (isDarkenEnabled()) {
                relativeLayout.setBackground(new ColorDrawable(-1157627904));
            } else {
                relativeLayout.setBackground(new ColorDrawable(0));
            }
            relativeLayout.addView(cTInAppWebView, layoutParams);
            if (isCloseButtonEnabled()) {
                Context context = inflater.getContext();
                CloseImageView closeImageView = new CloseImageView(context);
                RelativeLayout.LayoutParams layoutParamsForCloseButton = getLayoutParamsForCloseButton(cTInAppWebView.getId());
                closeImageView.setOnClickListener(new Fb.b(this, 28));
                closeImageView.setContentDescription(context.getString(R.string.ct_inapp_close_btn));
                setCloseImageView(closeImageView);
                relativeLayout.addView(closeImageView, layoutParamsForCloseButton);
            }
            return inflate;
        } catch (Throwable th) {
            getConfig().getLogger().verbose(getConfig().getAccountId(), "Fragment view not created", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayHTMLView$lambda$0(CTInAppBaseFullHtmlFragment this$0, View view) {
        Intrinsics.echo(this$0, "this$0");
        this$0.didDismiss(null);
    }

    private final void initWebViewLayoutParams(RelativeLayout.LayoutParams params) {
        char position = getInAppNotification().getPosition();
        if (position == 't') {
            params.addRule(10);
        } else if (position == 'l') {
            params.addRule(9);
        } else if (position == 'b') {
            params.addRule(12);
        } else if (position == 'r') {
            params.addRule(11);
        } else if (position == 'c') {
            params.addRule(13);
        }
        params.setMargins(0, 0, 0, 0);
    }

    private final boolean isCloseButtonEnabled() {
        return getInAppNotification().getIsShowClose();
    }

    private final boolean isDarkenEnabled() {
        return getInAppNotification().getIsDarkenScreen();
    }

    private final void reDrawInApp() {
        CTInAppWebView cTInAppWebView = this.webView;
        if (cTInAppWebView != null) {
            cTInAppWebView.setFullscreen(this.isFullscreen);
            cTInAppWebView.updateDimension();
            String customInAppUrl = getInAppNotification().getCustomInAppUrl();
            if (customInAppUrl != null && customInAppUrl.length() != 0) {
                cTInAppWebView.setWebViewClient(new WebViewClient());
                cTInAppWebView.loadUrl(customInAppUrl);
                return;
            }
            Point point = cTInAppWebView.dim;
            int i4 = point.y;
            int i5 = point.x;
            float f5 = getResources().getDisplayMetrics().density;
            int i10 = (int) (i4 / f5);
            int i11 = (int) (i5 / f5);
            String html = getInAppNotification().getHtml();
            if (html == null) {
                return;
            }
            String azure = P0.azure(i11, i10, "<style>body{width: ", "px; height: ", "px; margin: 0; padding:0;}</style>");
            Regex regex = new Regex("<head>");
            String replacement = "<head>" + azure;
            Intrinsics.echo(replacement, "replacement");
            String replaceFirst = regex.alpha.matcher(html).replaceFirst(replacement);
            Intrinsics.delta(replaceFirst, "replaceFirst(...)");
            Logger.v("Density appears to be " + f5);
            cTInAppWebView.setInitialScale((int) (f5 * ((float) 100)));
            cTInAppWebView.loadDataWithBaseURL(null, replaceFirst, "text/html", "utf-8", null);
        }
    }

    private final void updateFullscreenInfo() {
        int i4;
        Window window;
        WindowManager.LayoutParams attributes;
        an activity = getActivity();
        boolean z2 = false;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            i4 = attributes.flags & Barcode.FORMAT_UPC_E;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            z2 = true;
        }
        this.isFullscreen = z2;
    }

    @NotNull
    public RelativeLayout.LayoutParams getLayoutParamsForCloseButton(int webViewId) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, webViewId);
        layoutParams.addRule(1, webViewId);
        int i4 = -(getScaledPixels(40) / 2);
        layoutParams.setMargins(i4, 0, 0, i4);
        return layoutParams;
    }

    @Nullable
    public final CTInAppWebView getWebView() {
        return this.webView;
    }

    /* renamed from: isFullscreen, reason: from getter */
    public final boolean getIsFullscreen() {
        return this.isFullscreen;
    }

    @Override // androidx.fragment.app.ai, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.echo(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateFullscreenInfo();
        reDrawInApp();
    }

    @Override // androidx.fragment.app.ai
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(inflater, "inflater");
        updateFullscreenInfo();
        return displayHTMLView(inflater, container);
    }

    @Override // androidx.fragment.app.ai
    public void onDestroyView() {
        cleanupWebView();
        super.onDestroyView();
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.ai
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, savedInstanceState);
        reDrawInApp();
    }

    public final void setWebView(@Nullable CTInAppWebView cTInAppWebView) {
        this.webView = cTInAppWebView;
    }
}
