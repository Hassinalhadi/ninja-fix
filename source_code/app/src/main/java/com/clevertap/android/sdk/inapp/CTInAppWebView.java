package com.clevertap.android.sdk.inapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.clevertap.android.sdk.CTWebInterface;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0014J\u0006\u0010\u0019\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0003J\b\u0010\u001c\u001a\u00020\u0005H\u0003J\b\u0010\u001d\u001a\u00020\u0005H\u0003J\b\u0010\u001e\u001a\u00020\u0005H\u0003J\b\u0010\u001f\u001a\u00020\u0005H\u0003J\b\u0010 \u001a\u00020\u0005H\u0003J\b\u0010!\u001a\u00020\u0005H\u0003J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0007J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "widthDp", "", "heightDp", "widthPercentage", "heightPercentage", Constants.INAPP_ASPECT_RATIO, "", "<init>", "(Landroid/content/Context;IIIID)V", "(Landroid/content/Context;IIII)V", "dim", "Landroid/graphics/Point;", "isFullscreen", "", "()Z", "setFullscreen", "(Z)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "updateDimension", "dpToPx", "dp", "calculatePercentageWidth", "calculatePercentageHeight", "calculateWidthWithWindowMetrics", "calculateHeightWithWindowMetrics", "calculateWidthWithDisplayMetrics", "calculateHeightWithDisplayMetrics", "setJavaScriptInterface", "webInterface", "Lcom/clevertap/android/sdk/CTWebInterface;", "cleanup", Constants.INAPP_JS_ENABLED, "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class CTInAppWebView extends WebView {
    private static final double DEFAULT_ASPECT_RATIO = -1.0d;

    @NotNull
    private static final String JAVASCRIPT_INTERFACE_NAME = "CleverTap";
    private final double aspectRatio;

    @NotNull
    private final Context context;

    @NotNull
    public final Point dim;
    private final int heightDp;
    private final int heightPercentage;
    private boolean isFullscreen;
    private final int widthDp;
    private final int widthPercentage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ResourceType"})
    public CTInAppWebView(@NotNull Context context, int i4, int i5, int i10, int i11, double d4) {
        super(context);
        Intrinsics.echo(context, "context");
        this.context = context;
        this.widthDp = i4;
        this.heightDp = i5;
        this.widthPercentage = i10;
        this.heightPercentage = i11;
        this.aspectRatio = d4;
        this.dim = new Point();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setOverScrollMode(2);
        setBackgroundColor(0);
        getSettings().setTextZoom(100);
        setId(188293);
    }

    private final int calculateHeightWithDisplayMetrics() {
        return (int) ((getResources().getDisplayMetrics().heightPixels * this.heightPercentage) / 100.0f);
    }

    private final int calculateHeightWithWindowMetrics() {
        WindowManager windowManager;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i4;
        int i5;
        int i10;
        Rect bounds2;
        Object systemService = this.context.getSystemService("window");
        if (systemService instanceof WindowManager) {
            windowManager = (WindowManager) systemService;
        } else {
            windowManager = null;
        }
        if (windowManager != null) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.delta(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            if (this.isFullscreen) {
                bounds2 = currentWindowMetrics.getBounds();
                i10 = bounds2.height();
            } else {
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                displayCutout = WindowInsets.Type.displayCutout();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars | displayCutout);
                Intrinsics.delta(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
                bounds = currentWindowMetrics.getBounds();
                int height = bounds.height();
                i4 = insetsIgnoringVisibility.top;
                i5 = insetsIgnoringVisibility.bottom;
                i10 = (height - i4) - i5;
            }
            return (int) ((i10 * this.heightPercentage) / 100.0f);
        }
        return calculateHeightWithDisplayMetrics();
    }

    private final int calculatePercentageHeight() {
        if (Build.VERSION.SDK_INT >= 30) {
            return calculateHeightWithWindowMetrics();
        }
        return calculateHeightWithDisplayMetrics();
    }

    private final int calculatePercentageWidth() {
        if (Build.VERSION.SDK_INT >= 30) {
            return calculateWidthWithWindowMetrics();
        }
        return calculateWidthWithDisplayMetrics();
    }

    private final int calculateWidthWithDisplayMetrics() {
        return (int) ((getResources().getDisplayMetrics().widthPixels * this.widthPercentage) / 100.0f);
    }

    private final int calculateWidthWithWindowMetrics() {
        WindowManager windowManager;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i4;
        int i5;
        int i10;
        Rect bounds2;
        Object systemService = this.context.getSystemService("window");
        if (systemService instanceof WindowManager) {
            windowManager = (WindowManager) systemService;
        } else {
            windowManager = null;
        }
        if (windowManager != null) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.delta(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            if (this.isFullscreen) {
                bounds2 = currentWindowMetrics.getBounds();
                i10 = bounds2.width();
            } else {
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                displayCutout = WindowInsets.Type.displayCutout();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars | displayCutout);
                Intrinsics.delta(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
                bounds = currentWindowMetrics.getBounds();
                int width = bounds.width();
                i4 = insetsIgnoringVisibility.left;
                i5 = insetsIgnoringVisibility.right;
                i10 = (width - i4) - i5;
            }
            return (int) ((i10 * this.widthPercentage) / 100.0f);
        }
        return calculateWidthWithDisplayMetrics();
    }

    private final int dpToPx(int dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    public final void cleanup(boolean isJsEnabled) {
        removeAllViews();
        destroyDrawingCache();
        loadUrl("about:blank");
        if (isJsEnabled) {
            removeJavascriptInterface("CleverTap");
        }
        clearHistory();
        destroy();
    }

    /* renamed from: isFullscreen, reason: from getter */
    public final boolean getIsFullscreen() {
        return this.isFullscreen;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        updateDimension();
        Point point = this.dim;
        setMeasuredDimension(point.x, point.y);
    }

    public final void setFullscreen(boolean z2) {
        this.isFullscreen = z2;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void setJavaScriptInterface(@NotNull CTWebInterface webInterface) {
        Intrinsics.echo(webInterface, "webInterface");
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        addJavascriptInterface(webInterface, "CleverTap");
    }

    public final void updateDimension() {
        int calculatePercentageWidth;
        int calculatePercentageHeight;
        int i4 = this.widthDp;
        if (i4 > 0) {
            calculatePercentageWidth = dpToPx(i4);
        } else {
            calculatePercentageWidth = calculatePercentageWidth();
        }
        int i5 = this.heightDp;
        if (i5 > 0) {
            calculatePercentageHeight = dpToPx(i5);
        } else {
            double d4 = this.aspectRatio;
            if (d4 != -1.0d && d4 > 0.0d) {
                calculatePercentageHeight = (int) (calculatePercentageWidth / d4);
            } else {
                calculatePercentageHeight = calculatePercentageHeight();
            }
        }
        Point point = this.dim;
        point.x = calculatePercentageWidth;
        point.y = calculatePercentageHeight;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ResourceType"})
    public CTInAppWebView(@NotNull Context context, int i4, int i5, int i10, int i11) {
        this(context, i4, i5, i10, i11, -1.0d);
        Intrinsics.echo(context, "context");
    }
}
