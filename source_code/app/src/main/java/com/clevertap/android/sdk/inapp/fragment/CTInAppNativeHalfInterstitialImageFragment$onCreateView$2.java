package com.clevertap.android.sdk.inapp.fragment;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment$onCreateView$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppNativeHalfInterstitialImageFragment$onCreateView$2 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ CloseImageView $closeImageView;
    final /* synthetic */ RelativeLayout $relativeLayout;
    final /* synthetic */ CTInAppNativeHalfInterstitialImageFragment this$0;

    public CTInAppNativeHalfInterstitialImageFragment$onCreateView$2(RelativeLayout relativeLayout, CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment, CloseImageView closeImageView) {
        this.$relativeLayout = relativeLayout;
        this.this$0 = cTInAppNativeHalfInterstitialImageFragment;
        this.$closeImageView = closeImageView;
    }

    public static final void onGlobalLayout$lambda$0(CloseImageView closeImageView, RelativeLayout relativeLayout) {
        int measuredWidth = closeImageView.getMeasuredWidth() / 2;
        closeImageView.setX(relativeLayout.getRight() - measuredWidth);
        closeImageView.setY(relativeLayout.getTop() - measuredWidth);
    }

    public static final void onGlobalLayout$lambda$1(CloseImageView closeImageView, RelativeLayout relativeLayout) {
        int measuredWidth = closeImageView.getMeasuredWidth() / 2;
        closeImageView.setX(relativeLayout.getRight() - measuredWidth);
        closeImageView.setY(relativeLayout.getTop() - measuredWidth);
    }

    public static final void onGlobalLayout$lambda$2(CloseImageView closeImageView, RelativeLayout relativeLayout) {
        int measuredWidth = closeImageView.getMeasuredWidth() / 2;
        closeImageView.setX(relativeLayout.getRight() - measuredWidth);
        closeImageView.setY(relativeLayout.getTop() - measuredWidth);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewGroup.LayoutParams layoutParams = this.$relativeLayout.getLayoutParams();
        Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (this.this$0.getInAppNotification().getIsTablet() && this.this$0.isTablet()) {
            layoutParams2.width = (int) (this.$relativeLayout.getMeasuredHeight() * 1.3f);
            layoutParams2.gravity = 17;
            this.$relativeLayout.setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout = this.$relativeLayout;
            relativeLayout.post(new c(this.$closeImageView, relativeLayout, 5));
        } else if (this.this$0.isTablet()) {
            layoutParams2.setMargins(this.this$0.getScaledPixels(140), this.this$0.getScaledPixels(100), this.this$0.getScaledPixels(140), this.this$0.getScaledPixels(100));
            int measuredHeight = this.$relativeLayout.getMeasuredHeight() - this.this$0.getScaledPixels(130);
            layoutParams2.height = measuredHeight;
            layoutParams2.width = (int) (measuredHeight * 1.3f);
            layoutParams2.gravity = 17;
            this.$relativeLayout.setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout2 = this.$relativeLayout;
            relativeLayout2.post(new c(this.$closeImageView, relativeLayout2, 3));
        } else {
            layoutParams2.width = (int) (this.$relativeLayout.getMeasuredHeight() * 1.3f);
            layoutParams2.gravity = 1;
            this.$relativeLayout.setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout3 = this.$relativeLayout;
            relativeLayout3.post(new c(this.$closeImageView, relativeLayout3, 4));
        }
        this.$relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
