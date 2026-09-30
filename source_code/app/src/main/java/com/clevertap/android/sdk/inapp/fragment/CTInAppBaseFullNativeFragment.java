package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "setupInAppButton", "", "inAppButton", "Landroid/widget/Button;", "inAppNotificationButton", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "buttonIndex", "", "getDPI", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CTInAppBaseFullNativeFragment extends CTInAppBaseFullFragment {
    private final int getDPI() {
        int i4;
        WindowManager windowManager = (WindowManager) requireContext().getSystemService("window");
        if (windowManager == null) {
            return 160;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            i4 = requireContext().getResources().getConfiguration().densityDpi;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            i4 = displayMetrics.densityDpi;
        }
        if (i4 <= 0) {
            return 160;
        }
        return i4;
    }

    public final void setupInAppButton(@NotNull Button inAppButton, @Nullable CTInAppNotificationButton inAppNotificationButton, int buttonIndex) {
        ShapeDrawable shapeDrawable;
        float f5 = 0.0f;
        Intrinsics.echo(inAppButton, "inAppButton");
        if (inAppNotificationButton != null) {
            inAppButton.setVisibility(0);
            inAppButton.setTag(Integer.valueOf(buttonIndex));
            inAppButton.setText(inAppNotificationButton.getText());
            inAppButton.setTextColor(Color.parseColor(inAppNotificationButton.getTextColor()));
            inAppButton.setOnClickListener(new CTInAppBaseFragment.CTInAppNativeButtonClickListener());
            ShapeDrawable shapeDrawable2 = null;
            if (inAppNotificationButton.getBorderRadius().length() > 0) {
                Float sierra = r.sierra(inAppNotificationButton.getBorderRadius());
                if (sierra != null) {
                    f5 = sierra.floatValue();
                }
                float dpi = (480.0f / getDPI()) * f5 * 2;
                shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpi, dpi, dpi, dpi, dpi, dpi, dpi, dpi}, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                shapeDrawable.getPaint().setColor(Color.parseColor(inAppNotificationButton.getBackgroundColor()));
                shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
                shapeDrawable.getPaint().setAntiAlias(true);
                shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{dpi, dpi, dpi, dpi, dpi, dpi, dpi, dpi}, null, new float[]{dpi, dpi, dpi, dpi, dpi, dpi, dpi, dpi}));
            } else {
                shapeDrawable = null;
            }
            if (inAppNotificationButton.getBorderColor().length() != 0 && shapeDrawable2 != null) {
                shapeDrawable2.getPaint().setColor(Color.parseColor(inAppNotificationButton.getBorderColor()));
                shapeDrawable2.setPadding(1, 1, 1, 1);
                shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
            }
            if (shapeDrawable != null && shapeDrawable2 != null) {
                inAppButton.setBackground(new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable}));
                return;
            }
            return;
        }
        inAppButton.setVisibility(8);
    }
}
