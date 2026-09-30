package com.clevertap.android.sdk.inapp.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.CTWebInterface;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppWebView;
import com.clevertap.android.sdk.inapp.InAppWebViewClient;
import com.clevertap.android.sdk.leanplum.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002'(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010!\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0013H\u0002J\u001c\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0003J\b\u0010&\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialFragment;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnLongClickListener;", "<init>", "()V", "gd", "Landroid/view/GestureDetector;", "webView", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "getLayout", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "getView", "inflater", "Landroid/view/LayoutInflater;", "container", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onLongClick", "", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, "onTouch", Constants.CHARGED_EVENT_PARAM, "Landroid/view/MotionEvent;", "cleanupWebView", "displayHTMLView", "reDrawInApp", "GestureListener", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CTInAppBasePartialHtmlFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {

    @NotNull
    private static final String CTA_SWIPE_DISMISS = "swipe-dismiss";
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private GestureDetector gd;

    @Nullable
    private CTInAppWebView webView;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment;)V", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "remove", "ltr", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent e12, @NotNull MotionEvent e22, float velocityX, float velocityY) {
            Intrinsics.echo(e22, "e2");
            if (e12 != null) {
                if (e12.getX() - e22.getX() > 120.0f && Math.abs(velocityX) > 200.0d) {
                    return remove(false);
                }
                if (e22.getX() - e12.getX() > 120.0f && Math.abs(velocityX) > 200.0d) {
                    return remove(true);
                }
            }
            return false;
        }

        public final boolean remove(boolean ltr) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (ltr) {
                translateAnimation = new TranslateAnimation(0.0f, CTInAppBasePartialHtmlFragment.this.getScaledPixels(50), 0.0f, 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, -CTInAppBasePartialHtmlFragment.this.getScaledPixels(50), 0.0f, 0.0f);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            final CTInAppBasePartialHtmlFragment cTInAppBasePartialHtmlFragment = CTInAppBasePartialHtmlFragment.this;
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment$GestureListener$remove$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    CTInAppBasePartialHtmlFragment.this.triggerAction(CTInAppAction.INSTANCE.createCloseAction(), "swipe-dismiss", null);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            CTInAppWebView cTInAppWebView = CTInAppBasePartialHtmlFragment.this.webView;
            if (cTInAppWebView != null) {
                cTInAppWebView.startAnimation(animationSet);
            }
            return true;
        }
    }

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
            View view = getView(inflater, container);
            ViewGroup layout = getLayout(view);
            Context context = inflater.getContext();
            Intrinsics.delta(context, "getContext(...)");
            CTInAppWebView cTInAppWebView = new CTInAppWebView(context, getInAppNotification().getWidth(), getInAppNotification().getHeight(), getInAppNotification().getWidthPercentage(), getInAppNotification().getHeightPercentage(), getInAppNotification().getAspectRatio());
            this.webView = cTInAppWebView;
            cTInAppWebView.setWebViewClient(new InAppWebViewClient(this));
            cTInAppWebView.setOnTouchListener(this);
            cTInAppWebView.setOnLongClickListener(this);
            if (getInAppNotification().getIsJsEnabled()) {
                cTInAppWebView.setJavaScriptInterface(new CTWebInterface(CleverTapAPI.instanceWithConfig(getActivity(), getConfig()), this));
            }
            if (layout != null) {
                layout.addView(cTInAppWebView);
            }
            return view;
        } catch (Throwable th) {
            getConfig().getLogger().verbose(getConfig().getAccountId(), "Fragment view not created", th);
            return null;
        }
    }

    private final void reDrawInApp() {
        CTInAppWebView cTInAppWebView = this.webView;
        if (cTInAppWebView != null) {
            cTInAppWebView.updateDimension();
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

    @Nullable
    public abstract ViewGroup getLayout(@Nullable View view);

    @NotNull
    public abstract View getView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container);

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.ai
    public void onAttach(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        super.onAttach(context);
        this.gd = new GestureDetector(context, new GestureListener());
    }

    @Override // androidx.fragment.app.ai, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.echo(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        reDrawInApp();
    }

    @Override // androidx.fragment.app.ai
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(inflater, "inflater");
        return displayHTMLView(inflater, container);
    }

    @Override // androidx.fragment.app.ai
    public void onDestroyView() {
        cleanupWebView();
        super.onDestroyView();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(@Nullable View v4) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View v4, @NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        GestureDetector gestureDetector = this.gd;
        if (gestureDetector != null) {
            if (!gestureDetector.onTouchEvent(event) && event.getAction() != 2) {
                return false;
            }
            return true;
        }
        Intrinsics.lima("gd");
        throw null;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.ai
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, savedInstanceState);
        reDrawInApp();
    }
}
