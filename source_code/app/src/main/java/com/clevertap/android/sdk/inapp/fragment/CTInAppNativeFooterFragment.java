package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import j1.C1929c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeFooterFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppNativeFooterFragment extends CTInAppBasePartialNativeFragment {
    public static final boolean onCreateView$lambda$0(CTInAppNativeFooterFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.echo(this$0, "this$0");
        this$0.getGd().onTouchEvent(motionEvent);
        return true;
    }

    public static final Unit onCreateView$lambda$1(C1929c insets, ViewGroup.MarginLayoutParams mlp) {
        Intrinsics.echo(insets, "insets");
        Intrinsics.echo(mlp, "mlp");
        mlp.leftMargin = insets.alpha;
        mlp.rightMargin = insets.charlie;
        mlp.bottomMargin = insets.delta;
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.ai
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(inflater, "inflater");
        ArrayList arrayList = new ArrayList();
        View inflate = inflater.inflate(R.layout.inapp_footer, container, false);
        setInAppView(inflate);
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) inflate.findViewById(R.id.footer_frame_layout)).findViewById(R.id.footer_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(getInAppNotification().getBackgroundColor()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.footer_linear_layout_1);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(R.id.footer_linear_layout_2);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(R.id.footer_linear_layout_3);
        Button button = (Button) linearLayout3.findViewById(R.id.footer_button_1);
        Intrinsics.checkNotNull(button);
        arrayList.add(button);
        Button button2 = (Button) linearLayout3.findViewById(R.id.footer_button_2);
        Intrinsics.checkNotNull(button2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.footer_icon);
        if (!getInAppNotification().getMediaList$clevertap_core_release().isEmpty()) {
            CTInAppNotificationMedia cTInAppNotificationMedia = getInAppNotification().getMediaList$clevertap_core_release().get(0);
            if (!StringsKt.gray(cTInAppNotificationMedia.getContentDescription())) {
                imageView.setContentDescription(cTInAppNotificationMedia.getContentDescription());
            }
            Bitmap cachedInAppImageV1 = resourceProvider().cachedInAppImageV1(cTInAppNotificationMedia.getMediaUrl());
            if (cachedInAppImageV1 != null) {
                imageView.setImageBitmap(cachedInAppImageV1);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) linearLayout2.findViewById(R.id.footer_title);
        textView.setText(getInAppNotification().getTitle());
        textView.setTextColor(Color.parseColor(getInAppNotification().getTitleColor()));
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.footer_message);
        textView2.setText(getInAppNotification().getMessage());
        textView2.setTextColor(Color.parseColor(getInAppNotification().getMessageColor()));
        List<CTInAppNotificationButton> buttons = getInAppNotification().getButtons();
        if (!buttons.isEmpty()) {
            int size = buttons.size();
            for (int i4 = 0; i4 < size && i4 < 2; i4++) {
                setupInAppButton((Button) arrayList.get(i4), buttons.get(i4), i4);
            }
        }
        if (getInAppNotification().getButtonCount() == 1) {
            hideSecondaryButton(button, button2);
        }
        inflate.setOnTouchListener(new b(0, this));
        Intrinsics.checkNotNull(inflate);
        CTXtensions.applyInsetsWithMarginAdjustment(inflate, new com.checkout.components.kmp.rememberme.di.b(17));
        return inflate;
    }
}
