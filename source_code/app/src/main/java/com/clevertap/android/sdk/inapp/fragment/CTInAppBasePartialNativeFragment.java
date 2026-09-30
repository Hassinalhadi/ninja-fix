package com.clevertap.android.sdk.inapp.fragment;

import android.content.Context;
import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import com.clevertap.android.sdk.leanplum.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b \u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002&'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ \u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialFragment;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnLongClickListener;", "<init>", "()V", "gd", "Landroid/view/GestureDetector;", "getGd", "()Landroid/view/GestureDetector;", "setGd", "(Landroid/view/GestureDetector;)V", "inAppView", "Landroid/view/View;", "getInAppView", "()Landroid/view/View;", "setInAppView", "(Landroid/view/View;)V", "onAttach", "", "context", "Landroid/content/Context;", "onLongClick", "", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, "onTouch", Constants.CHARGED_EVENT_PARAM, "Landroid/view/MotionEvent;", "hideSecondaryButton", "mainButton", "Landroid/widget/Button;", "secondaryButton", "setupInAppButton", "inAppButton", "inAppNotificationButton", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "buttonIndex", "", "Companion", "GestureListener", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CTInAppBasePartialNativeFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    protected GestureDetector gd;

    @Nullable
    private View inAppView;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment;)V", "onDown", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "remove", "ltr", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent e) {
            Intrinsics.echo(e, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent e12, @NotNull MotionEvent e22, float velocityX, float velocityY) {
            Intrinsics.echo(e22, "e2");
            if (e12 == null) {
                return false;
            }
            if (e12.getX() - e22.getX() > 120.0f && Math.abs(velocityX) > 200.0d) {
                return remove(false);
            }
            if (e22.getX() - e12.getX() <= 120.0f || Math.abs(velocityX) <= 200.0d) {
                return false;
            }
            return remove(true);
        }

        public final boolean remove(boolean ltr) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (ltr) {
                translateAnimation = new TranslateAnimation(0.0f, CTInAppBasePartialNativeFragment.this.getScaledPixels(50), 0.0f, 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, -CTInAppBasePartialNativeFragment.this.getScaledPixels(50), 0.0f, 0.0f);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            final CTInAppBasePartialNativeFragment cTInAppBasePartialNativeFragment = CTInAppBasePartialNativeFragment.this;
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialNativeFragment$GestureListener$remove$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    CTInAppBasePartialNativeFragment.this.didDismiss(null);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            View inAppView = CTInAppBasePartialNativeFragment.this.getInAppView();
            if (inAppView != null) {
                inAppView.startAnimation(animationSet);
            }
            return true;
        }
    }

    @NotNull
    public final GestureDetector getGd() {
        GestureDetector gestureDetector = this.gd;
        if (gestureDetector != null) {
            return gestureDetector;
        }
        Intrinsics.lima("gd");
        throw null;
    }

    @Nullable
    public final View getInAppView() {
        return this.inAppView;
    }

    public final void hideSecondaryButton(@NotNull Button mainButton, @NotNull Button secondaryButton) {
        Intrinsics.echo(mainButton, "mainButton");
        Intrinsics.echo(secondaryButton, "secondaryButton");
        secondaryButton.setVisibility(8);
        mainButton.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
        secondaryButton.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.ai
    public void onAttach(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        super.onAttach(context);
        setGd(new GestureDetector(context, new GestureListener()));
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(@Nullable View v4) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View v4, @NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        if (!getGd().onTouchEvent(event) && event.getAction() != 2) {
            return false;
        }
        return true;
    }

    public final void setGd(@NotNull GestureDetector gestureDetector) {
        Intrinsics.echo(gestureDetector, "<set-?>");
        this.gd = gestureDetector;
    }

    public final void setInAppView(@Nullable View view) {
        this.inAppView = view;
    }

    public final void setupInAppButton(@NotNull Button inAppButton, @Nullable CTInAppNotificationButton inAppNotificationButton, int buttonIndex) {
        Intrinsics.echo(inAppButton, "inAppButton");
        if (inAppNotificationButton != null) {
            inAppButton.setTag(Integer.valueOf(buttonIndex));
            inAppButton.setVisibility(0);
            inAppButton.setText(inAppNotificationButton.getText());
            inAppButton.setTextColor(Color.parseColor(inAppNotificationButton.getTextColor()));
            inAppButton.setBackgroundColor(Color.parseColor(inAppNotificationButton.getBackgroundColor()));
            inAppButton.setOnClickListener(new CTInAppBaseFragment.CTInAppNativeButtonClickListener());
            return;
        }
        inAppButton.setVisibility(8);
    }
}
