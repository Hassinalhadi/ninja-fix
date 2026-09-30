package com.checkout.components.rememberme.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
import com.clevertap.android.sdk.leanplum.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/rememberme/webview/BottomSheetWebViewImpl;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "", "isExpanded", "<init>", "(Landroid/content/Context;Z)V", "expanded", "", "updateExpansionState", "(Z)V", "getExpansionState", "()Z", "Landroid/view/MotionEvent;", Constants.CHARGED_EVENT_PARAM, "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class BottomSheetWebViewImpl extends WebView {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private boolean f6407a;

    /* renamed from: b, reason: collision with root package name */
    private float f6408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetWebViewImpl(@NotNull Context context, boolean z2) {
        super(context);
        Intrinsics.echo(context, "context");
        this.f6407a = z2;
    }

    /* renamed from: getExpansionState, reason: from getter */
    public final boolean getF6407a() {
        return this.f6407a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        if (!this.f6407a) {
            return false;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    if (Math.abs(event.getY() - this.f6408b) <= 8.0f) {
                        return false;
                    }
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        this.f6408b = event.getY();
        ViewParent parent3 = getParent();
        if (parent3 != null) {
            parent3.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        if (!this.f6407a) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(event);
                    }
                } else {
                    Math.abs(event.getY() - this.f6408b);
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return super.onTouchEvent(event);
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(event);
        }
        this.f6408b = event.getY();
        return super.onTouchEvent(event);
    }

    public final void updateExpansionState(boolean expanded) {
        this.f6407a = expanded;
    }
}
