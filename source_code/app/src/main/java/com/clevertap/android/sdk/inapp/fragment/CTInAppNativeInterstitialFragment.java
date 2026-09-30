package com.clevertap.android.sdk.inapp.fragment;

import ae.ac;
import ae.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
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
import androidx.media3.common.util.UnstableApi;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.video.InAppVideoPlayerHandle;
import com.clevertap.android.sdk.video.VideoLibChecker;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import com.clevertap.android.sdk.video.inapps.ExoplayerHandle;
import com.clevertap.android.sdk.video.inapps.Media3Handle;
import i1.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001B\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u001b\u0010\u0019\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0004H\u0014¢\u0006\u0004\b)\u0010\u0003R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "<init>", "()V", "", "handleCloseButton", "setButtons", "setTitleAndMessage", "setMediaForInApp", "initFullScreenIconForStream", "Landroid/widget/FrameLayout;", "fl", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "closeImageView", "resizeContainer", "(Landroid/widget/FrameLayout;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "disableFullScreenButton", "closeFullscreenDialog", "openFullscreenDialog", "playMedia", "prepareMedia", "addViewsForStreamMedia", "Landroid/view/View;", "", "contentDescription", "setContentDescriptionIfNotBlank", "(Landroid/view/View;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onResume", "onPause", "onStop", "cleanup", "", "exoPlayerFullscreen", "Z", "Lae/p;", "fullScreenDialog", "Lae/p;", "Landroid/widget/ImageView;", "fullScreenIcon", "Landroid/widget/ImageView;", "Lcom/clevertap/android/sdk/gif/GifImageView;", "gifImageView", "Lcom/clevertap/android/sdk/gif/GifImageView;", "Lcom/clevertap/android/sdk/video/InAppVideoPlayerHandle;", "handle", "Lcom/clevertap/android/sdk/video/InAppVideoPlayerHandle;", "Landroid/widget/RelativeLayout;", "relativeLayout", "Landroid/widget/RelativeLayout;", "videoFrameLayout", "Landroid/widget/FrameLayout;", "videoFrameInDialog", "Landroid/view/ViewGroup$LayoutParams;", "imageViewLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "com/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialFragment$onBackPressedCallback$1;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
/* loaded from: classes3.dex */
public final class CTInAppNativeInterstitialFragment extends CTInAppBaseFullNativeFragment {
    private boolean exoPlayerFullscreen;

    @Nullable
    private p fullScreenDialog;

    @Nullable
    private ImageView fullScreenIcon;

    @Nullable
    private GifImageView gifImageView;
    private InAppVideoPlayerHandle handle;

    @Nullable
    private ViewGroup.LayoutParams imageViewLayoutParams;

    @NotNull
    private final CTInAppNativeInterstitialFragment$onBackPressedCallback$1 onBackPressedCallback = new ac() { // from class: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment$onBackPressedCallback$1
        {
            super(false);
        }

        @Override // ae.ac
        public void handleOnBackPressed() {
            boolean z2;
            z2 = CTInAppNativeInterstitialFragment.this.exoPlayerFullscreen;
            if (z2) {
                CTInAppNativeInterstitialFragment.this.closeFullscreenDialog();
                setEnabled(false);
            }
        }
    };

    @Nullable
    private RelativeLayout relativeLayout;

    @Nullable
    private FrameLayout videoFrameInDialog;

    @Nullable
    private FrameLayout videoFrameLayout;

    private final void addViewsForStreamMedia() {
        FrameLayout frameLayout = this.videoFrameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            View videoSurface = inAppVideoPlayerHandle.videoSurface();
            FrameLayout frameLayout2 = this.videoFrameLayout;
            if (frameLayout2 != null && frameLayout2.getChildCount() == 0) {
                FrameLayout frameLayout3 = this.videoFrameLayout;
                if (frameLayout3 != null) {
                    frameLayout3.addView(videoSurface);
                }
                FrameLayout frameLayout4 = this.videoFrameLayout;
                if (frameLayout4 != null) {
                    frameLayout4.addView(this.fullScreenIcon);
                    return;
                }
                return;
            }
            Logger.d("Video views and controls are already added, not re-attaching");
            return;
        }
        Intrinsics.lima("handle");
        throw null;
    }

    public final void closeFullscreenDialog() {
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            View videoSurface = inAppVideoPlayerHandle.videoSurface();
            InAppVideoPlayerHandle inAppVideoPlayerHandle2 = this.handle;
            if (inAppVideoPlayerHandle2 != null) {
                inAppVideoPlayerHandle2.switchToFullScreen(false);
                ImageView imageView = this.fullScreenIcon;
                if (imageView != null) {
                    imageView.setLayoutParams(this.imageViewLayoutParams);
                }
                FrameLayout frameLayout = this.videoFrameInDialog;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                FrameLayout frameLayout2 = this.videoFrameLayout;
                if (frameLayout2 != null) {
                    frameLayout2.addView(videoSurface);
                }
                FrameLayout frameLayout3 = this.videoFrameLayout;
                if (frameLayout3 != null) {
                    frameLayout3.addView(this.fullScreenIcon);
                }
                this.exoPlayerFullscreen = false;
                p pVar = this.fullScreenDialog;
                if (pVar != null) {
                    pVar.dismiss();
                }
                ImageView imageView2 = this.fullScreenIcon;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(requireContext().getDrawable(R.drawable.ct_ic_fullscreen_expand));
                    return;
                }
                return;
            }
            Intrinsics.lima("handle");
            throw null;
        }
        Intrinsics.lima("handle");
        throw null;
    }

    private final void disableFullScreenButton() {
        ImageView imageView = this.fullScreenIcon;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private final void handleCloseButton() {
        if (!getInAppNotification().getIsHideCloseButton()) {
            CloseImageView closeImageView = getCloseImageView();
            if (closeImageView != null) {
                closeImageView.setOnClickListener(null);
            }
            CloseImageView closeImageView2 = getCloseImageView();
            if (closeImageView2 != null) {
                closeImageView2.setVisibility(8);
                return;
            }
            return;
        }
        CloseImageView closeImageView3 = getCloseImageView();
        if (closeImageView3 != null) {
            closeImageView3.setVisibility(0);
        }
        CloseImageView closeImageView4 = getCloseImageView();
        if (closeImageView4 != null) {
            closeImageView4.setOnClickListener(new d(this, 1));
        }
    }

    public static final void handleCloseButton$lambda$1(CTInAppNativeInterstitialFragment this$0, View view) {
        Intrinsics.echo(this$0, "this$0");
        this$0.didDismiss(null);
        GifImageView gifImageView = this$0.gifImageView;
        if (gifImageView != null) {
            gifImageView.clear();
        }
        an activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void initFullScreenIconForStream() {
        float applyDimension;
        ImageView imageView = new ImageView(requireContext());
        this.fullScreenIcon = imageView;
        Resources resources = getResources();
        int i4 = R.drawable.ct_ic_fullscreen_expand;
        ThreadLocal threadLocal = k.alpha;
        imageView.setImageDrawable(resources.getDrawable(i4, null));
        imageView.setOnClickListener(new d(this, 0));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (getInAppNotification().getIsTablet() && isTablet()) {
            applyDimension = TypedValue.applyDimension(1, 30.0f, displayMetrics);
        } else {
            applyDimension = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        }
        int i5 = (int) applyDimension;
        int applyDimension2 = (int) TypedValue.applyDimension(1, 4.0f, displayMetrics);
        int applyDimension3 = (int) TypedValue.applyDimension(1, 2.0f, displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
        layoutParams.gravity = 8388613;
        layoutParams.setMargins(0, applyDimension2, applyDimension3, 0);
        imageView.setLayoutParams(layoutParams);
    }

    public static final void initFullScreenIconForStream$lambda$5(CTInAppNativeInterstitialFragment this$0, View view) {
        Intrinsics.echo(this$0, "this$0");
        if (!this$0.exoPlayerFullscreen) {
            this$0.onBackPressedCallback.setEnabled(true);
            this$0.openFullscreenDialog();
        } else {
            this$0.closeFullscreenDialog();
            this$0.onBackPressedCallback.setEnabled(false);
        }
    }

    private final void openFullscreenDialog() {
        ViewGroup.LayoutParams layoutParams;
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            View videoSurface = inAppVideoPlayerHandle.videoSurface();
            ImageView imageView = this.fullScreenIcon;
            if (imageView != null) {
                layoutParams = imageView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            this.imageViewLayoutParams = layoutParams;
            InAppVideoPlayerHandle inAppVideoPlayerHandle2 = this.handle;
            if (inAppVideoPlayerHandle2 != null) {
                inAppVideoPlayerHandle2.switchToFullScreen(true);
                FrameLayout frameLayout = this.videoFrameLayout;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (this.fullScreenDialog == null) {
                    Context requireContext = requireContext();
                    Intrinsics.delta(requireContext, "requireContext(...)");
                    p pVar = new p(requireContext, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
                    this.fullScreenDialog = pVar;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    FrameLayout frameLayout2 = new FrameLayout(requireContext());
                    this.videoFrameInDialog = frameLayout2;
                    pVar.addContentView(frameLayout2, layoutParams2);
                    an activity = getActivity();
                    if (activity != null) {
                        pVar.getOnBackPressedDispatcher().alpha(activity, this.onBackPressedCallback);
                    }
                }
                FrameLayout frameLayout3 = this.videoFrameInDialog;
                if (frameLayout3 != null) {
                    frameLayout3.addView(videoSurface);
                }
                this.exoPlayerFullscreen = true;
                p pVar2 = this.fullScreenDialog;
                if (pVar2 != null) {
                    pVar2.show();
                    return;
                }
                return;
            }
            Intrinsics.lima("handle");
            throw null;
        }
        Intrinsics.lima("handle");
        throw null;
    }

    private final void playMedia() {
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            inAppVideoPlayerHandle.play();
        } else {
            Intrinsics.lima("handle");
            throw null;
        }
    }

    private final void prepareMedia() {
        boolean z2;
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            Context requireContext = requireContext();
            Intrinsics.delta(requireContext, "requireContext(...)");
            if (getInAppNotification().getIsTablet() && isTablet()) {
                z2 = true;
            } else {
                z2 = false;
            }
            inAppVideoPlayerHandle.initPlayerView(requireContext, z2);
            addViewsForStreamMedia();
            InAppVideoPlayerHandle inAppVideoPlayerHandle2 = this.handle;
            if (inAppVideoPlayerHandle2 != null) {
                Context requireContext2 = requireContext();
                Intrinsics.delta(requireContext2, "requireContext(...)");
                inAppVideoPlayerHandle2.initExoplayer(requireContext2, getInAppNotification().getMediaList$clevertap_core_release().get(0).getMediaUrl());
                return;
            }
            Intrinsics.lima("handle");
            throw null;
        }
        Intrinsics.lima("handle");
        throw null;
    }

    private final void resizeContainer(final FrameLayout fl, final CloseImageView closeImageView) {
        ViewTreeObserver viewTreeObserver;
        RelativeLayout relativeLayout;
        ViewTreeObserver viewTreeObserver2;
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation != 1) {
            if (currentOrientation == 2 && (relativeLayout = this.relativeLayout) != null && (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) != null) {
                viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment$resizeContainer$2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        RelativeLayout relativeLayout2;
                        relativeLayout2 = CTInAppNativeInterstitialFragment.this.relativeLayout;
                        if (relativeLayout2 == null) {
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
                        Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        if (CTInAppNativeInterstitialFragment.this.getInAppNotification().getIsTablet() && CTInAppNativeInterstitialFragment.this.isTablet()) {
                            CTInAppNativeInterstitialFragment.this.redrawLandscapeInterstitialTabletInApp(relativeLayout2, layoutParams2, fl, closeImageView);
                        } else if (CTInAppNativeInterstitialFragment.this.isTablet()) {
                            CTInAppNativeInterstitialFragment.this.redrawLandscapeInterstitialMobileInAppOnTablet(relativeLayout2, layoutParams2, fl, closeImageView);
                        } else {
                            CTInAppNativeInterstitialFragment.this.redrawLandscapeInterstitialInApp(relativeLayout2, layoutParams2, closeImageView);
                        }
                        relativeLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.relativeLayout;
        if (relativeLayout2 != null && (viewTreeObserver = relativeLayout2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment$resizeContainer$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    RelativeLayout relativeLayout3;
                    relativeLayout3 = CTInAppNativeInterstitialFragment.this.relativeLayout;
                    if (relativeLayout3 == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
                    Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (CTInAppNativeInterstitialFragment.this.getInAppNotification().getIsTablet() && CTInAppNativeInterstitialFragment.this.isTablet()) {
                        CTInAppNativeInterstitialFragment.this.redrawInterstitialTabletInApp(relativeLayout3, layoutParams2, fl, closeImageView);
                    } else if (CTInAppNativeInterstitialFragment.this.isTablet()) {
                        CTInAppNativeInterstitialFragment.this.redrawInterstitialMobileInAppOnTablet(relativeLayout3, layoutParams2, fl, closeImageView);
                    } else {
                        CTInAppNativeInterstitialFragment.this.redrawInterstitialInApp(relativeLayout3, layoutParams2, closeImageView);
                    }
                    relativeLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    private final void setButtons() {
        LinearLayout linearLayout;
        Button button;
        ArrayList arrayList = new ArrayList();
        RelativeLayout relativeLayout = this.relativeLayout;
        Button button2 = null;
        if (relativeLayout != null) {
            linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.interstitial_linear_layout);
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            button = (Button) linearLayout.findViewById(R.id.interstitial_button1);
        } else {
            button = null;
        }
        if (button != null) {
            arrayList.add(button);
        }
        if (linearLayout != null) {
            button2 = (Button) linearLayout.findViewById(R.id.interstitial_button2);
        }
        if (button2 != null) {
            arrayList.add(button2);
        }
        List<CTInAppNotificationButton> buttons = getInAppNotification().getButtons();
        if (buttons.size() == 1) {
            if (getCurrentOrientation() == 2) {
                if (button != null) {
                    button.setVisibility(8);
                }
            } else if (getCurrentOrientation() == 1 && button != null) {
                button.setVisibility(4);
            }
            if (button2 != null) {
                setupInAppButton(button2, buttons.get(0), 0);
                return;
            }
            return;
        }
        if (!buttons.isEmpty()) {
            int size = buttons.size();
            for (int i4 = 0; i4 < size && i4 < 2; i4++) {
                setupInAppButton((Button) arrayList.get(i4), buttons.get(i4), i4);
            }
        }
    }

    private final void setContentDescriptionIfNotBlank(View view, String str) {
        if (!StringsKt.gray(str)) {
            view.setContentDescription(str);
        }
    }

    private final void setMediaForInApp() {
        if (!getInAppNotification().getMediaList$clevertap_core_release().isEmpty()) {
            CTInAppNotificationMedia cTInAppNotificationMedia = getInAppNotification().getMediaList$clevertap_core_release().get(0);
            GifImageView gifImageView = null;
            ImageView imageView = null;
            if (cTInAppNotificationMedia.isImage()) {
                Bitmap cachedInAppImageV1 = resourceProvider().cachedInAppImageV1(cTInAppNotificationMedia.getMediaUrl());
                if (cachedInAppImageV1 != null) {
                    RelativeLayout relativeLayout = this.relativeLayout;
                    if (relativeLayout != null) {
                        imageView = (ImageView) relativeLayout.findViewById(R.id.backgroundImage);
                    }
                    if (imageView != null) {
                        setContentDescriptionIfNotBlank(imageView, cTInAppNotificationMedia.getContentDescription());
                    }
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    if (imageView != null) {
                        imageView.setImageBitmap(cachedInAppImageV1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (cTInAppNotificationMedia.isGIF()) {
                byte[] cachedInAppGifV1 = resourceProvider().cachedInAppGifV1(cTInAppNotificationMedia.getMediaUrl());
                if (cachedInAppGifV1 != null) {
                    RelativeLayout relativeLayout2 = this.relativeLayout;
                    if (relativeLayout2 != null) {
                        gifImageView = (GifImageView) relativeLayout2.findViewById(R.id.gifImage);
                    }
                    this.gifImageView = gifImageView;
                    if (gifImageView != null) {
                        setContentDescriptionIfNotBlank(gifImageView, cTInAppNotificationMedia.getContentDescription());
                    }
                    GifImageView gifImageView2 = this.gifImageView;
                    if (gifImageView2 != null) {
                        gifImageView2.setVisibility(0);
                    }
                    GifImageView gifImageView3 = this.gifImageView;
                    if (gifImageView3 != null) {
                        gifImageView3.setBytes(cachedInAppGifV1);
                    }
                    GifImageView gifImageView4 = this.gifImageView;
                    if (gifImageView4 != null) {
                        gifImageView4.startAnimation();
                        return;
                    }
                    return;
                }
                return;
            }
            if (cTInAppNotificationMedia.isVideo()) {
                initFullScreenIconForStream();
                prepareMedia();
                playMedia();
                View view = this.videoFrameLayout;
                if (view != null) {
                    setContentDescriptionIfNotBlank(view, cTInAppNotificationMedia.getContentDescription());
                    return;
                }
                return;
            }
            if (cTInAppNotificationMedia.isAudio()) {
                initFullScreenIconForStream();
                prepareMedia();
                playMedia();
                disableFullScreenButton();
                View view2 = this.videoFrameLayout;
                if (view2 != null) {
                    setContentDescriptionIfNotBlank(view2, cTInAppNotificationMedia.getContentDescription());
                }
            }
        }
    }

    private final void setTitleAndMessage() {
        TextView textView;
        RelativeLayout relativeLayout = this.relativeLayout;
        TextView textView2 = null;
        if (relativeLayout != null) {
            textView = (TextView) relativeLayout.findViewById(R.id.interstitial_title);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(getInAppNotification().getTitle());
        }
        if (textView != null) {
            textView.setTextColor(Color.parseColor(getInAppNotification().getTitleColor()));
        }
        RelativeLayout relativeLayout2 = this.relativeLayout;
        if (relativeLayout2 != null) {
            textView2 = (TextView) relativeLayout2.findViewById(R.id.interstitial_message);
        }
        if (textView2 != null) {
            textView2.setText(getInAppNotification().getMessage());
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(getInAppNotification().getMessageColor()));
        }
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment, com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public void cleanup() {
        super.cleanup();
        GifImageView gifImageView = this.gifImageView;
        if (gifImageView != null) {
            gifImageView.clear();
        }
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            inAppVideoPlayerHandle.pause();
        } else {
            Intrinsics.lima("handle");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ai
    public void onCreate(@Nullable Bundle savedInstanceState) {
        InAppVideoPlayerHandle exoplayerHandle;
        super.onCreate(savedInstanceState);
        if (VideoLibChecker.mediaLibType == VideoLibraryIntegrated.MEDIA3) {
            exoplayerHandle = new Media3Handle();
        } else {
            exoplayerHandle = new ExoplayerHandle();
        }
        this.handle = exoplayerHandle;
    }

    @Override // androidx.fragment.app.ai
    @SuppressLint({"ResourceType"})
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate;
        FrameLayout frameLayout;
        Intrinsics.echo(inflater, "inflater");
        if (getInAppNotification().getIsTablet() && isTablet()) {
            inflate = inflater.inflate(R.layout.tab_inapp_interstitial, container, false);
        } else {
            inflate = inflater.inflate(R.layout.inapp_interstitial, container, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.inapp_interstitial_frame_layout);
        setCloseImageView((CloseImageView) frameLayout2.findViewById(CloseImageView.VIEW_ID));
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout2.findViewById(R.id.interstitial_relative_layout);
        this.relativeLayout = relativeLayout;
        if (relativeLayout != null) {
            frameLayout = (FrameLayout) relativeLayout.findViewById(R.id.video_frame);
        } else {
            frameLayout = null;
        }
        this.videoFrameLayout = frameLayout;
        RelativeLayout relativeLayout2 = this.relativeLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundColor(Color.parseColor(getInAppNotification().getBackgroundColor()));
        }
        frameLayout2.setBackground(new ColorDrawable(-1157627904));
        Intrinsics.checkNotNull(frameLayout2);
        CloseImageView closeImageView = getCloseImageView();
        Intrinsics.checkNotNull(closeImageView);
        resizeContainer(frameLayout2, closeImageView);
        setMediaForInApp();
        setTitleAndMessage();
        setButtons();
        handleCloseButton();
        return inflate;
    }

    @Override // androidx.fragment.app.ai
    public void onPause() {
        super.onPause();
        GifImageView gifImageView = this.gifImageView;
        if (gifImageView != null) {
            gifImageView.clear();
        }
        if (this.exoPlayerFullscreen) {
            closeFullscreenDialog();
            setEnabled(false);
        }
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            inAppVideoPlayerHandle.savePosition();
            InAppVideoPlayerHandle inAppVideoPlayerHandle2 = this.handle;
            if (inAppVideoPlayerHandle2 != null) {
                inAppVideoPlayerHandle2.pause();
                return;
            } else {
                Intrinsics.lima("handle");
                throw null;
            }
        }
        Intrinsics.lima("handle");
        throw null;
    }

    @Override // androidx.fragment.app.ai
    public void onResume() {
        super.onResume();
        if (getInAppNotification().hasStreamMedia()) {
            prepareMedia();
            playMedia();
        }
    }

    @Override // androidx.fragment.app.ai
    public void onStart() {
        CTInAppNotificationMedia cTInAppNotificationMedia;
        super.onStart();
        GifImageView gifImageView = this.gifImageView;
        if (gifImageView != null && (cTInAppNotificationMedia = (CTInAppNotificationMedia) CollectionsKt.green(getInAppNotification().getMediaList$clevertap_core_release())) != null) {
            gifImageView.setBytes(resourceProvider().cachedInAppGifV1(cTInAppNotificationMedia.getMediaUrl()));
            gifImageView.startAnimation();
        }
    }

    @Override // androidx.fragment.app.ai
    public void onStop() {
        super.onStop();
        GifImageView gifImageView = this.gifImageView;
        if (gifImageView != null) {
            gifImageView.clear();
        }
        InAppVideoPlayerHandle inAppVideoPlayerHandle = this.handle;
        if (inAppVideoPlayerHandle != null) {
            inAppVideoPlayerHandle.pause();
        } else {
            Intrinsics.lima("handle");
            throw null;
        }
    }
}
