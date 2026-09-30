package com.clevertap.android.sdk.inapp.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.an;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "isTabletFromDeviceType", "", "context", "Landroid/content/Context;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppNativeHalfInterstitialFragment extends CTInAppBaseFullNativeFragment {
    public static /* synthetic */ void juliet(CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment, View view) {
        onCreateView$lambda$0(cTInAppNativeHalfInterstitialFragment, view);
    }

    public static final void onCreateView$lambda$0(CTInAppNativeHalfInterstitialFragment this$0, View view) {
        Intrinsics.echo(this$0, "this$0");
        this$0.didDismiss(null);
        an activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final boolean isTabletFromDeviceType(@Nullable Context context) {
        if (DeviceInfo.getDeviceType(context) == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.ai
    @Nullable
    public View onCreateView(@NotNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate;
        Intrinsics.echo(inflater, "inflater");
        ArrayList arrayList = new ArrayList();
        if ((getInAppNotification().getIsTablet() && isTablet()) || (getInAppNotification().getIsLocalInApp() && isTabletFromDeviceType(inflater.getContext()))) {
            inflate = inflater.inflate(R.layout.tab_inapp_half_interstitial, container, false);
            Intrinsics.checkNotNull(inflate);
        } else {
            inflate = inflater.inflate(R.layout.inapp_half_interstitial, container, false);
            Intrinsics.checkNotNull(inflate);
        }
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.inapp_half_interstitial_frame_layout);
        final CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(CloseImageView.VIEW_ID);
        final RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.half_interstitial_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(getInAppNotification().getBackgroundColor()));
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation != 1) {
            if (currentOrientation == 2) {
                relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new CTInAppNativeHalfInterstitialFragment$onCreateView$2(relativeLayout, this, closeImageView));
            }
        } else {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment$onCreateView$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                    Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if ((this.getInAppNotification().getIsTablet() && this.isTablet()) || (this.getInAppNotification().getIsLocalInApp() && this.isTabletFromDeviceType(inflater.getContext()))) {
                        CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment = this;
                        RelativeLayout relativeLayout2 = relativeLayout;
                        Intrinsics.checkNotNull(relativeLayout2);
                        CloseImageView closeImageView2 = closeImageView;
                        Intrinsics.checkNotNull(closeImageView2);
                        cTInAppNativeHalfInterstitialFragment.redrawHalfInterstitialInApp(relativeLayout2, layoutParams2, closeImageView2);
                    } else if (this.isTablet()) {
                        CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment2 = this;
                        RelativeLayout relativeLayout3 = relativeLayout;
                        Intrinsics.checkNotNull(relativeLayout3);
                        CloseImageView closeImageView3 = closeImageView;
                        Intrinsics.checkNotNull(closeImageView3);
                        cTInAppNativeHalfInterstitialFragment2.redrawHalfInterstitialMobileInAppOnTablet(relativeLayout3, layoutParams2, closeImageView3);
                    } else {
                        CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment3 = this;
                        RelativeLayout relativeLayout4 = relativeLayout;
                        Intrinsics.checkNotNull(relativeLayout4);
                        CloseImageView closeImageView4 = closeImageView;
                        Intrinsics.checkNotNull(closeImageView4);
                        cTInAppNativeHalfInterstitialFragment3.redrawHalfInterstitialInApp(relativeLayout4, layoutParams2, closeImageView4);
                    }
                    relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
        CTInAppNotificationMedia inAppMediaForOrientation$clevertap_core_release = getInAppNotification().getInAppMediaForOrientation$clevertap_core_release(getCurrentOrientation());
        if (inAppMediaForOrientation$clevertap_core_release != null) {
            ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.backgroundImage);
            if (!StringsKt.gray(inAppMediaForOrientation$clevertap_core_release.getContentDescription())) {
                imageView.setContentDescription(inAppMediaForOrientation$clevertap_core_release.getContentDescription());
            }
            Bitmap cachedInAppImageV1 = resourceProvider().cachedInAppImageV1(inAppMediaForOrientation$clevertap_core_release.getMediaUrl());
            if (cachedInAppImageV1 != null) {
                imageView.setImageBitmap(cachedInAppImageV1);
            }
        }
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.half_interstitial_linear_layout);
        Button button = (Button) linearLayout.findViewById(R.id.half_interstitial_button1);
        Intrinsics.checkNotNull(button);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(R.id.half_interstitial_button2);
        Intrinsics.checkNotNull(button2);
        arrayList.add(button2);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.half_interstitial_title);
        textView.setText(getInAppNotification().getTitle());
        textView.setTextColor(Color.parseColor(getInAppNotification().getTitleColor()));
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.half_interstitial_message);
        textView2.setText(getInAppNotification().getMessage());
        textView2.setTextColor(Color.parseColor(getInAppNotification().getMessageColor()));
        List<CTInAppNotificationButton> buttons = getInAppNotification().getButtons();
        if (buttons.size() == 1) {
            if (getCurrentOrientation() == 2) {
                button.setVisibility(8);
            } else if (getCurrentOrientation() == 1) {
                button.setVisibility(4);
            }
            setupInAppButton(button2, buttons.get(0), 0);
        } else if (!buttons.isEmpty()) {
            int size = buttons.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 < 2) {
                    setupInAppButton((Button) arrayList.get(i4), buttons.get(i4), i4);
                }
            }
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        closeImageView.setOnClickListener(new a(1, this));
        if (!getInAppNotification().getIsHideCloseButton()) {
            closeImageView.setVisibility(8);
            return inflate;
        }
        closeImageView.setVisibility(0);
        return inflate;
    }
}
