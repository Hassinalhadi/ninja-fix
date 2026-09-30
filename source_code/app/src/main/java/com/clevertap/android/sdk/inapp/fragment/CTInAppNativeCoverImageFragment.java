package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.an;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import j1.C1929c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeCoverImageFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppNativeCoverImageFragment extends CTInAppBaseFullFragment {
    public static /* synthetic */ Unit kilo(C1929c c1929c, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return onCreateView$lambda$0(c1929c, marginLayoutParams);
    }

    public static final Unit onCreateView$lambda$0(C1929c insets, ViewGroup.MarginLayoutParams mlp) {
        Intrinsics.echo(insets, "insets");
        Intrinsics.echo(mlp, "mlp");
        mlp.leftMargin = insets.alpha;
        mlp.rightMargin = insets.charlie;
        mlp.topMargin = insets.bravo;
        mlp.bottomMargin = insets.delta;
        return Unit.INSTANCE;
    }

    public static final void onCreateView$lambda$1(CTInAppNativeCoverImageFragment this$0, View view) {
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
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.inapp_cover_image, container, false);
        Intrinsics.checkNotNull(inflate);
        CTXtensions.applyInsetsWithMarginAdjustment(inflate, new com.checkout.components.kmp.rememberme.di.b(16));
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.inapp_cover_image_frame_layout);
        frameLayout.setBackgroundColor(Color.parseColor(getInAppNotification().getBackgroundColor()));
        ImageView imageView = (ImageView) ((RelativeLayout) frameLayout.findViewById(R.id.cover_image_relative_layout)).findViewById(R.id.cover_image);
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
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(CloseImageView.VIEW_ID);
        closeImageView.setOnClickListener(new a(0, this));
        if (!getInAppNotification().getIsHideCloseButton()) {
            closeImageView.setVisibility(8);
            return inflate;
        }
        closeImageView.setVisibility(0);
        return inflate;
    }
}
