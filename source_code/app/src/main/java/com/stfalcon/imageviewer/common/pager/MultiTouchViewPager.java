package com.stfalcon.imageviewer.common.pager;

import Ce.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9.C2061a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2778t6;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stfalcon/imageviewer/common/pager/MultiTouchViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageviewer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class MultiTouchViewPager extends ViewPager {
    public static final /* synthetic */ int silver = 0;
    public boolean alpha;
    public boolean purple;
    public C2061a red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTouchViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.foxtrot(context, "context");
        this.alpha = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.foxtrot(ev, "ev");
        if (ev.getPointerCount() > 1 && this.purple) {
            requestDisallowInterceptTouchEvent(false);
            boolean dispatchTouchEvent = super.dispatchTouchEvent(ev);
            requestDisallowInterceptTouchEvent(true);
            return dispatchTouchEvent;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.red = AbstractC2778t6.alpha(this, null, new l(1, this, 7), 3);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2061a c2061a = this.red;
        if (c2061a != null) {
            removeOnPageChangeListener(c2061a);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.foxtrot(ev, "ev");
        if (ev.getPointerCount() > 1) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.foxtrot(ev, "ev");
        try {
            return super.onTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        this.purple = z2;
        super.requestDisallowInterceptTouchEvent(z2);
    }
}
