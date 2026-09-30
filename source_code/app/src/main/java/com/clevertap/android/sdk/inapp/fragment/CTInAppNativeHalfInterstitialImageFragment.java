package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.an;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppNativeHalfInterstitialImageFragment extends CTInAppBaseFullFragment {
    public static /* synthetic */ void juliet(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment, View view) {
        onCreateView$lambda$0(cTInAppNativeHalfInterstitialImageFragment, view);
    }

    public static final void onCreateView$lambda$0(CTInAppNativeHalfInterstitialImageFragment this$0, View view) {
        Intrinsics.echo(this$0, "this$0");
        this$0.didDismiss(null);
        an activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.ai
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate;
        Intrinsics.echo(inflater, "inflater");
        if (getInAppNotification().getIsTablet() && isTablet()) {
            inflate = inflater.inflate(R.layout.tab_inapp_half_interstitial_image, container, false);
        } else {
            inflate = inflater.inflate(R.layout.inapp_half_interstitial_image, container, false);
        }
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.inapp_half_interstitial_image_frame_layout);
        final CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(CloseImageView.VIEW_ID);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        final RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.half_interstitial_image_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(getInAppNotification().getBackgroundColor()));
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.half_interstitial_image);
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation != 1) {
            if (currentOrientation == 2) {
                relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new CTInAppNativeHalfInterstitialImageFragment$onCreateView$2(relativeLayout, this, closeImageView));
            }
        } else {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment$onCreateView$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                    Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (this.getInAppNotification().getIsTablet() && this.isTablet()) {
                        CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment = this;
                        RelativeLayout relativeLayout2 = relativeLayout;
                        Intrinsics.checkNotNull(relativeLayout2);
                        CloseImageView closeImageView2 = closeImageView;
                        Intrinsics.checkNotNull(closeImageView2);
                        cTInAppNativeHalfInterstitialImageFragment.redrawHalfInterstitialInApp(relativeLayout2, layoutParams2, closeImageView2);
                    } else if (this.isTablet()) {
                        CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment2 = this;
                        RelativeLayout relativeLayout3 = relativeLayout;
                        Intrinsics.checkNotNull(relativeLayout3);
                        CloseImageView closeImageView3 = closeImageView;
                        Intrinsics.checkNotNull(closeImageView3);
                        cTInAppNativeHalfInterstitialImageFragment2.redrawHalfInterstitialMobileInAppOnTablet(relativeLayout3, layoutParams2, closeImageView3);
                    } else {
                        CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment3 = this;
                        RelativeLayout relativeLayout4 = relativeLayout;
                        Intrinsics.checkNotNull(relativeLayout4);
                        CloseImageView closeImageView4 = closeImageView;
                        Intrinsics.checkNotNull(closeImageView4);
                        cTInAppNativeHalfInterstitialImageFragment3.redrawHalfInterstitialInApp(relativeLayout4, layoutParams2, closeImageView4);
                    }
                    relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
        CTInAppNotificationMedia inAppMediaForOrientation$clevertap_core_release = getInAppNotification().getInAppMediaForOrientation$clevertap_core_release(getCurrentOrientation());
        if (inAppMediaForOrientation$clevertap_core_release != null) {
            if (!StringsKt.gray(inAppMediaForOrientation$clevertap_core_release.getContentDescription())) {
                imageView.setContentDescription(inAppMediaForOrientation$clevertap_core_release.getContentDescription());
            }
            Bitmap cachedInAppImageV1 = resourceProvider().cachedInAppImageV1(inAppMediaForOrientation$clevertap_core_release.getMediaUrl());
            if (cachedInAppImageV1 != null) {
                imageView.setImageBitmap(cachedInAppImageV1);
                imageView.setTag(0);
                imageView.setOnClickListener(new CTInAppBaseFragment.CTInAppNativeButtonClickListener());
            }
        }
        closeImageView.setOnClickListener(new a(2, this));
        if (!getInAppNotification().getIsHideCloseButton()) {
            closeImageView.setVisibility(8);
            return inflate;
        }
        closeImageView.setVisibility(0);
        return inflate;
    }
}
