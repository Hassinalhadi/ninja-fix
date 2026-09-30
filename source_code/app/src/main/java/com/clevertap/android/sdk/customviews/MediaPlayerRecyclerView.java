package com.clevertap.android.sdk.customviews;

import Cb.d;
import Yb.C0312j0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.common.util.UnstableApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import com.clevertap.android.sdk.video.InboxVideoPlayerHandle;
import com.clevertap.android.sdk.video.VideoLibChecker;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import com.clevertap.android.sdk.video.inbox.ExoplayerHandle;
import com.clevertap.android.sdk.video.inbox.Media3Handle;
import i1.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0011J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0011J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0011J\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/clevertap/android/sdk/inbox/CTInboxBaseMessageViewHolder;", "findBestVisibleMediaHolder", "()Lcom/clevertap/android/sdk/inbox/CTInboxBaseMessageViewHolder;", "", "initialize", "()V", "bufferingStarted", "playerReady", "Landroid/graphics/drawable/Drawable;", "artworkAsset", "()Landroid/graphics/drawable/Drawable;", "recyclerViewListeners", "removeVideoView", "onPausePlayer", "onRestartPlayer", "playVideo", "stop", "Lcom/clevertap/android/sdk/video/InboxVideoPlayerHandle;", "handle", "Lcom/clevertap/android/sdk/video/InboxVideoPlayerHandle;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Landroidx/recyclerview/widget/Q;", "onScrollListener", "Landroidx/recyclerview/widget/Q;", "Landroidx/recyclerview/widget/N;", "onChildAttachStateChangeListener", "Landroidx/recyclerview/widget/N;", "playingHolder", "Lcom/clevertap/android/sdk/inbox/CTInboxBaseMessageViewHolder;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
/* loaded from: classes3.dex */
public final class MediaPlayerRecyclerView extends RecyclerView {

    @NotNull
    private final InboxVideoPlayerHandle handle;

    @NotNull
    private final N onChildAttachStateChangeListener;

    @NotNull
    private final Q onScrollListener;

    @Nullable
    private CTInboxBaseMessageViewHolder playingHolder;

    @NotNull
    private final Rect rect;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoLibraryIntegrated.values().length];
            try {
                iArr[VideoLibraryIntegrated.MEDIA3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        InboxVideoPlayerHandle exoplayerHandle;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        if (WhenMappings.$EnumSwitchMapping$0[VideoLibChecker.mediaLibType.ordinal()] == 1) {
            exoplayerHandle = new Media3Handle();
        } else {
            exoplayerHandle = new ExoplayerHandle();
        }
        this.handle = exoplayerHandle;
        this.rect = new Rect();
        this.onScrollListener = new Q() { // from class: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$onScrollListener$1
            @Override // androidx.recyclerview.widget.Q
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.echo(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {
                    MediaPlayerRecyclerView.this.playVideo();
                }
            }
        };
        this.onChildAttachStateChangeListener = new N() { // from class: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$onChildAttachStateChangeListener$1
            @Override // androidx.recyclerview.widget.N
            public void onChildViewAttachedToWindow(View view) {
                Intrinsics.echo(view, "view");
            }

            @Override // androidx.recyclerview.widget.N
            public void onChildViewDetachedFromWindow(View view) {
                CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder;
                Intrinsics.echo(view, "view");
                cTInboxBaseMessageViewHolder = MediaPlayerRecyclerView.this.playingHolder;
                if (cTInboxBaseMessageViewHolder != null) {
                    MediaPlayerRecyclerView mediaPlayerRecyclerView = MediaPlayerRecyclerView.this;
                    if (Intrinsics.areEqual(cTInboxBaseMessageViewHolder.itemView, view)) {
                        mediaPlayerRecyclerView.stop();
                    }
                }
            }
        };
        initialize();
    }

    public final Drawable artworkAsset() {
        Resources resources = getResources();
        int i4 = R.drawable.ct_audio;
        ThreadLocal threadLocal = k.alpha;
        Drawable drawable = resources.getDrawable(i4, null);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    public final void bufferingStarted() {
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = this.playingHolder;
        if (cTInboxBaseMessageViewHolder != null) {
            cTInboxBaseMessageViewHolder.playerBuffering();
        }
    }

    private final CTInboxBaseMessageViewHolder findBestVisibleMediaHolder() {
        int i4;
        int i5;
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder;
        int i10;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager != null) {
            i4 = linearLayoutManager.K();
        } else {
            i4 = 0;
        }
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager2 != null) {
            i5 = linearLayoutManager2.L();
        } else {
            i5 = 0;
        }
        if (i4 > i5) {
            return null;
        }
        int i11 = i4;
        int i12 = 0;
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder2 = null;
        while (true) {
            View childAt = getChildAt(i11 - i4);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if (tag instanceof CTInboxBaseMessageViewHolder) {
                    cTInboxBaseMessageViewHolder = (CTInboxBaseMessageViewHolder) tag;
                } else {
                    cTInboxBaseMessageViewHolder = null;
                }
                if (cTInboxBaseMessageViewHolder != null && cTInboxBaseMessageViewHolder.needsMediaPlayer()) {
                    if (cTInboxBaseMessageViewHolder.itemView.getGlobalVisibleRect(this.rect)) {
                        i10 = this.rect.height();
                    } else {
                        i10 = 0;
                    }
                    if (i10 > i12) {
                        cTInboxBaseMessageViewHolder2 = cTInboxBaseMessageViewHolder;
                        i12 = i10;
                    }
                }
            }
            if (i11 != i5) {
                i11++;
            } else {
                return cTInboxBaseMessageViewHolder2;
            }
        }
    }

    private final void initialize() {
        InboxVideoPlayerHandle inboxVideoPlayerHandle = this.handle;
        Context context = getContext();
        Intrinsics.delta(context, "getContext(...)");
        inboxVideoPlayerHandle.initExoplayer(context, new MediaPlayerRecyclerView$initialize$1(this), new MediaPlayerRecyclerView$initialize$2(this));
        InboxVideoPlayerHandle inboxVideoPlayerHandle2 = this.handle;
        Context context2 = getContext();
        Intrinsics.delta(context2, "getContext(...)");
        inboxVideoPlayerHandle2.initPlayerView(context2, new MediaPlayerRecyclerView$initialize$3(this));
        recyclerViewListeners();
    }

    public static final Float playVideo$lambda$1(MediaPlayerRecyclerView this$0) {
        Intrinsics.echo(this$0, "this$0");
        this$0.handle.handleMute();
        return Float.valueOf(this$0.handle.playerVolume());
    }

    public static final Void playVideo$lambda$2(MediaPlayerRecyclerView this$0, String uri, boolean z2, boolean z10) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(uri, "uri");
        InboxVideoPlayerHandle inboxVideoPlayerHandle = this$0.handle;
        Context context = this$0.getContext();
        Intrinsics.delta(context, "getContext(...)");
        inboxVideoPlayerHandle.startPlaying(context, uri, z2, z10);
        return null;
    }

    public final void playerReady() {
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = this.playingHolder;
        if (cTInboxBaseMessageViewHolder != null) {
            cTInboxBaseMessageViewHolder.playerReady();
        }
    }

    public static /* synthetic */ Float quebec(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        return playVideo$lambda$1(mediaPlayerRecyclerView);
    }

    private final void recyclerViewListeners() {
        removeOnScrollListener(this.onScrollListener);
        removeOnChildAttachStateChangeListener(this.onChildAttachStateChangeListener);
        addOnScrollListener(this.onScrollListener);
        addOnChildAttachStateChangeListener(this.onChildAttachStateChangeListener);
    }

    private final void removeVideoView() {
        this.handle.pause();
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = this.playingHolder;
        if (cTInboxBaseMessageViewHolder != null) {
            cTInboxBaseMessageViewHolder.playerRemoved();
        }
    }

    public static /* synthetic */ Void romeo(MediaPlayerRecyclerView mediaPlayerRecyclerView, String str, boolean z2, boolean z10) {
        return playVideo$lambda$2(mediaPlayerRecyclerView, str, z2, z10);
    }

    public final void onPausePlayer() {
        this.handle.setPlayWhenReady(false);
    }

    public final void onRestartPlayer() {
        initialize();
        playVideo();
    }

    public final void playVideo() {
        int i4;
        CTInboxBaseMessageViewHolder findBestVisibleMediaHolder = findBestVisibleMediaHolder();
        if (findBestVisibleMediaHolder == null) {
            removeVideoView();
            return;
        }
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = this.playingHolder;
        if (cTInboxBaseMessageViewHolder != null && Intrinsics.areEqual(cTInboxBaseMessageViewHolder.itemView, findBestVisibleMediaHolder.itemView)) {
            if (cTInboxBaseMessageViewHolder.itemView.getGlobalVisibleRect(this.rect)) {
                i4 = this.rect.height();
            } else {
                i4 = 0;
            }
            if (i4 >= 400 && cTInboxBaseMessageViewHolder.shouldAutoPlay()) {
                this.handle.setPlayWhenReady(true);
                return;
            } else {
                this.handle.setPlayWhenReady(false);
                return;
            }
        }
        removeVideoView();
        initialize();
        if (findBestVisibleMediaHolder.addMediaPlayer(this.handle.playerVolume(), new C0312j0(18, this), new d(14, this), this.handle.videoSurface())) {
            this.playingHolder = findBestVisibleMediaHolder;
        }
    }

    public final void stop() {
        this.handle.pause();
        this.playingHolder = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context, @NotNull AttributeSet attrs, int i4) {
        super(context, attrs, i4);
        InboxVideoPlayerHandle exoplayerHandle;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        if (WhenMappings.$EnumSwitchMapping$0[VideoLibChecker.mediaLibType.ordinal()] == 1) {
            exoplayerHandle = new Media3Handle();
        } else {
            exoplayerHandle = new ExoplayerHandle();
        }
        this.handle = exoplayerHandle;
        this.rect = new Rect();
        this.onScrollListener = new Q() { // from class: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$onScrollListener$1
            @Override // androidx.recyclerview.widget.Q
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.echo(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {
                    MediaPlayerRecyclerView.this.playVideo();
                }
            }
        };
        this.onChildAttachStateChangeListener = new N() { // from class: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$onChildAttachStateChangeListener$1
            @Override // androidx.recyclerview.widget.N
            public void onChildViewAttachedToWindow(View view) {
                Intrinsics.echo(view, "view");
            }

            @Override // androidx.recyclerview.widget.N
            public void onChildViewDetachedFromWindow(View view) {
                CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder;
                Intrinsics.echo(view, "view");
                cTInboxBaseMessageViewHolder = MediaPlayerRecyclerView.this.playingHolder;
                if (cTInboxBaseMessageViewHolder != null) {
                    MediaPlayerRecyclerView mediaPlayerRecyclerView = MediaPlayerRecyclerView.this;
                    if (Intrinsics.areEqual(cTInboxBaseMessageViewHolder.itemView, view)) {
                        mediaPlayerRecyclerView.stop();
                    }
                }
            }
        };
        initialize();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context) {
        super(context, null);
        InboxVideoPlayerHandle exoplayerHandle;
        Intrinsics.echo(context, "context");
        if (WhenMappings.$EnumSwitchMapping$0[VideoLibChecker.mediaLibType.ordinal()] == 1) {
            exoplayerHandle = new Media3Handle();
        } else {
            exoplayerHandle = new ExoplayerHandle();
        }
        this.handle = exoplayerHandle;
        this.rect = new Rect();
        this.onScrollListener = new Q() { // from class: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$onScrollListener$1
            @Override // androidx.recyclerview.widget.Q
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.echo(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {
                    MediaPlayerRecyclerView.this.playVideo();
                }
            }
        };
        this.onChildAttachStateChangeListener = new N() { // from class: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$onChildAttachStateChangeListener$1
            @Override // androidx.recyclerview.widget.N
            public void onChildViewAttachedToWindow(View view) {
                Intrinsics.echo(view, "view");
            }

            @Override // androidx.recyclerview.widget.N
            public void onChildViewDetachedFromWindow(View view) {
                CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder;
                Intrinsics.echo(view, "view");
                cTInboxBaseMessageViewHolder = MediaPlayerRecyclerView.this.playingHolder;
                if (cTInboxBaseMessageViewHolder != null) {
                    MediaPlayerRecyclerView mediaPlayerRecyclerView = MediaPlayerRecyclerView.this;
                    if (Intrinsics.areEqual(cTInboxBaseMessageViewHolder.itemView, view)) {
                        mediaPlayerRecyclerView.stop();
                    }
                }
            }
        };
        initialize();
    }
}
