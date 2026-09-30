package com.clevertap.android.sdk.inbox;

import Xd.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.an;
import androidx.recyclerview.widget.f0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R;
import i1.k;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class CTInboxBaseMessageViewHolder extends f0 {
    LinearLayout bodyRelativeLayout;
    RelativeLayout clickLayout;
    Context context;
    LinearLayout ctaLinearLayout;
    private CTInboxMessageContent firstContentItem;
    FrameLayout frameLayout;
    ImageView mediaImage;
    RelativeLayout mediaLayout;
    private CTInboxMessage message;
    private ImageView muteIcon;
    private WeakReference<CTInboxListViewFragment> parentWeakReference;
    FrameLayout progressBarFrameLayout;
    protected final ImageView readDot;
    RelativeLayout relativeLayout;
    private boolean requiresMediaPlayer;
    ImageView squareImage;

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ CTInboxMessage val$inboxMessage;
        final /* synthetic */ int val$position;

        /* renamed from: com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder$1$1 */
        /* loaded from: classes3.dex */
        public class RunnableC00061 implements Runnable {
            final /* synthetic */ CTInboxListViewFragment val$parent;

            public RunnableC00061(CTInboxListViewFragment cTInboxListViewFragment) {
                r2 = cTInboxListViewFragment;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CTInboxBaseMessageViewHolder.this.readDot.getVisibility() == 0) {
                    r2.didShow(null, r2);
                }
                CTInboxBaseMessageViewHolder.this.readDot.setVisibility(8);
                r3.setRead(true);
            }
        }

        public AnonymousClass1(int i4, CTInboxMessage cTInboxMessage) {
            r2 = i4;
            r3 = cTInboxMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            an activity;
            CTInboxListViewFragment parent = CTInboxBaseMessageViewHolder.this.getParent();
            if (parent != null && (activity = parent.getActivity()) != null) {
                activity.runOnUiThread(new Runnable() { // from class: com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder.1.1
                    final /* synthetic */ CTInboxListViewFragment val$parent;

                    public RunnableC00061(CTInboxListViewFragment parent2) {
                        r2 = parent2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (CTInboxBaseMessageViewHolder.this.readDot.getVisibility() == 0) {
                            r2.didShow(null, r2);
                        }
                        CTInboxBaseMessageViewHolder.this.readDot.setVisibility(8);
                        r3.setRead(true);
                    }
                });
            }
        }
    }

    public CTInboxBaseMessageViewHolder(View view) {
        super(view);
        this.readDot = (ImageView) view.findViewById(R.id.read_circle);
    }

    private FrameLayout getLayoutForMediaPlayer() {
        return this.frameLayout;
    }

    public /* synthetic */ void lambda$addMediaPlayer$0(Function0 function0, View view) {
        setMuteIconState(this.muteIcon, this.context, ((Float) function0.invoke()).floatValue());
    }

    public /* synthetic */ void lambda$playerRemoved$1() {
        this.progressBarFrameLayout.setVisibility(8);
    }

    public /* synthetic */ void lambda$playerRemoved$2() {
        this.muteIcon.setVisibility(8);
    }

    private void setMuteIconState(ImageView imageView, Context context, float f5) {
        boolean z2;
        int i4;
        int i5;
        if (f5 <= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i4 = R.drawable.ct_volume_off;
        } else {
            i4 = R.drawable.ct_volume_on;
        }
        if (z2) {
            i5 = R.string.ct_inbox_mute_button_content_description;
        } else {
            i5 = R.string.ct_inbox_unmute_button_content_description;
        }
        imageView.setContentDescription(context.getString(i5));
        Resources resources = context.getResources();
        ThreadLocal threadLocal = k.alpha;
        imageView.setImageDrawable(resources.getDrawable(i4, null));
    }

    public boolean addMediaPlayer(float f5, Function0<Float> function0, m mVar, View view) {
        FrameLayout layoutForMediaPlayer;
        int i4;
        int round;
        if (!this.requiresMediaPlayer || (layoutForMediaPlayer = getLayoutForMediaPlayer()) == null) {
            return false;
        }
        layoutForMediaPlayer.removeAllViews();
        layoutForMediaPlayer.setVisibility(8);
        Resources resources = this.context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (CTInboxActivity.orientation == 2) {
            if (this.message.getOrientation().equalsIgnoreCase("l")) {
                i4 = Math.round(this.mediaImage.getMeasuredHeight() * 1.76f);
                round = this.mediaImage.getMeasuredHeight();
            } else {
                i4 = this.squareImage.getMeasuredHeight();
                round = i4;
            }
        } else {
            i4 = resources.getDisplayMetrics().widthPixels;
            if (this.message.getOrientation().equalsIgnoreCase("l")) {
                round = Math.round(i4 * 0.5625f);
            }
            round = i4;
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(i4, round));
        layoutForMediaPlayer.addView(view);
        layoutForMediaPlayer.setBackgroundColor(Color.parseColor(this.message.getBgColor()));
        FrameLayout frameLayout = this.progressBarFrameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.firstContentItem.mediaIsVideo()) {
            ImageView imageView = new ImageView(this.context);
            this.muteIcon = imageView;
            imageView.setVisibility(8);
            setMuteIconState(this.muteIcon, this.context, f5);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, displayMetrics), (int) TypedValue.applyDimension(1, 30.0f, displayMetrics));
            layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, displayMetrics), (int) TypedValue.applyDimension(1, 2.0f, displayMetrics), 0);
            layoutParams.gravity = 8388613;
            this.muteIcon.setLayoutParams(layoutParams);
            this.muteIcon.setOnClickListener(new Kb.k(7, this, function0));
            layoutForMediaPlayer.addView(this.muteIcon);
        }
        mVar.invoke(this.firstContentItem.getMedia(), Boolean.valueOf(this.firstContentItem.mediaIsAudio()), Boolean.valueOf(this.firstContentItem.mediaIsVideo()));
        return true;
    }

    public String calculateDisplayTimestamp(long j5) {
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j5;
        if (currentTimeMillis < 60) {
            return "Just Now";
        }
        if (currentTimeMillis > 60 && currentTimeMillis < 3540) {
            return Q0.c.mike(currentTimeMillis / 60, " mins ago", new StringBuilder());
        }
        if (currentTimeMillis > 3540 && currentTimeMillis < 81420) {
            long j6 = currentTimeMillis / 3600;
            if (j6 > 1) {
                return j6 + " hours ago";
            }
            return j6 + " hour ago";
        }
        if (currentTimeMillis > 86400 && currentTimeMillis < 172800) {
            return "Yesterday";
        }
        return new SimpleDateFormat("dd MMM").format(new Date(j5 * 1000));
    }

    public void configureWithMessage(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i4) {
        this.context = cTInboxListViewFragment.getContext();
        this.parentWeakReference = new WeakReference<>(cTInboxListViewFragment);
        this.message = cTInboxMessage;
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.getInboxMessageContents().get(0);
        this.firstContentItem = cTInboxMessageContent;
        this.requiresMediaPlayer = cTInboxMessageContent.mediaIsStreamable();
    }

    public int getImageBackgroundColor() {
        return 0;
    }

    public CTInboxListViewFragment getParent() {
        return this.parentWeakReference.get();
    }

    public void hideOneButton(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    public void hideTwoButtons(Button button, Button button2, Button button3) {
        button2.setVisibility(8);
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 6.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    public void markItemAsRead(CTInboxMessage cTInboxMessage, int i4) {
        new Handler().postDelayed(new Runnable() { // from class: com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder.1
            final /* synthetic */ CTInboxMessage val$inboxMessage;
            final /* synthetic */ int val$position;

            /* renamed from: com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder$1$1 */
            /* loaded from: classes3.dex */
            public class RunnableC00061 implements Runnable {
                final /* synthetic */ CTInboxListViewFragment val$parent;

                public RunnableC00061(CTInboxListViewFragment parent2) {
                    r2 = parent2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (CTInboxBaseMessageViewHolder.this.readDot.getVisibility() == 0) {
                        r2.didShow(null, r2);
                    }
                    CTInboxBaseMessageViewHolder.this.readDot.setVisibility(8);
                    r3.setRead(true);
                }
            }

            public AnonymousClass1(int i42, CTInboxMessage cTInboxMessage2) {
                r2 = i42;
                r3 = cTInboxMessage2;
            }

            @Override // java.lang.Runnable
            public void run() {
                an activity;
                CTInboxListViewFragment parent2 = CTInboxBaseMessageViewHolder.this.getParent();
                if (parent2 != null && (activity = parent2.getActivity()) != null) {
                    activity.runOnUiThread(new Runnable() { // from class: com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder.1.1
                        final /* synthetic */ CTInboxListViewFragment val$parent;

                        public RunnableC00061(CTInboxListViewFragment parent22) {
                            r2 = parent22;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (CTInboxBaseMessageViewHolder.this.readDot.getVisibility() == 0) {
                                r2.didShow(null, r2);
                            }
                            CTInboxBaseMessageViewHolder.this.readDot.setVisibility(8);
                            r3.setRead(true);
                        }
                    });
                }
            }
        }, Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    public boolean needsMediaPlayer() {
        return this.requiresMediaPlayer;
    }

    public void playerBuffering() {
        FrameLayout frameLayout = this.progressBarFrameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public void playerReady() {
        getLayoutForMediaPlayer().setVisibility(0);
        ImageView imageView = this.muteIcon;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.progressBarFrameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void playerRemoved() {
        FrameLayout frameLayout = this.progressBarFrameLayout;
        if (frameLayout != null) {
            final int i4 = 0;
            frameLayout.post(new Runnable(this) { // from class: com.clevertap.android.sdk.inbox.a
                public final /* synthetic */ CTInboxBaseMessageViewHolder purple;

                {
                    this.purple = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            this.purple.lambda$playerRemoved$1();
                            return;
                        default:
                            this.purple.lambda$playerRemoved$2();
                            return;
                    }
                }
            });
        }
        ImageView imageView = this.muteIcon;
        if (imageView != null) {
            final int i5 = 1;
            imageView.post(new Runnable(this) { // from class: com.clevertap.android.sdk.inbox.a
                public final /* synthetic */ CTInboxBaseMessageViewHolder purple;

                {
                    this.purple = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            this.purple.lambda$playerRemoved$1();
                            return;
                        default:
                            this.purple.lambda$playerRemoved$2();
                            return;
                    }
                }
            });
        }
        FrameLayout layoutForMediaPlayer = getLayoutForMediaPlayer();
        if (layoutForMediaPlayer != null) {
            layoutForMediaPlayer.removeAllViews();
        }
    }

    public void setDots(ImageView[] imageViewArr, int i4, Context context, LinearLayout linearLayout) {
        for (int i5 = 0; i5 < i4; i5++) {
            ImageView imageView = new ImageView(context);
            imageViewArr[i5] = imageView;
            imageView.setVisibility(0);
            ImageView imageView2 = imageViewArr[i5];
            Resources resources = context.getResources();
            int i10 = R.drawable.ct_unselected_dot;
            ThreadLocal threadLocal = k.alpha;
            imageView2.setImageDrawable(resources.getDrawable(i10, null));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (linearLayout.getChildCount() < i4) {
                linearLayout.addView(imageViewArr[i5], layoutParams);
            }
        }
    }

    public boolean shouldAutoPlay() {
        return this.firstContentItem.mediaIsVideo();
    }
}
