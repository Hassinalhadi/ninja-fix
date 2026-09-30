package com.clevertap.android.sdk.video.inapps;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.ui.PlayerView;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.video.InAppVideoPlayerHandle;
import i1.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/clevertap/android/sdk/video/inapps/Media3Handle;", "Lcom/clevertap/android/sdk/video/InAppVideoPlayerHandle;", "<init>", "()V", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "playerView", "Landroidx/media3/ui/PlayerView;", "playerViewLayoutParamsNormal", "Landroid/view/ViewGroup$LayoutParams;", "playerViewLayoutParamsFullScreen", "Landroid/widget/FrameLayout$LayoutParams;", "mediaPosition", "", "initExoplayer", "", "context", "Landroid/content/Context;", Constants.KEY_URL, "", "initPlayerView", "isTablet", "", "play", "pause", "savePosition", "switchToFullScreen", "isFullScreen", "videoSurface", "Landroid/view/View;", "playerWidth", "", "playerHeight", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
/* loaded from: classes3.dex */
public final class Media3Handle implements InAppVideoPlayerHandle {
    private long mediaPosition;

    @Nullable
    private ExoPlayer player;

    @Nullable
    private PlayerView playerView;

    @NotNull
    private FrameLayout.LayoutParams playerViewLayoutParamsFullScreen = new FrameLayout.LayoutParams(-1, -1);

    @Nullable
    private ViewGroup.LayoutParams playerViewLayoutParamsNormal;

    private final int playerHeight(Context context, boolean isTablet) {
        float f5;
        if (isTablet) {
            f5 = 299.0f;
        } else {
            f5 = 134.0f;
        }
        return (int) TypedValue.applyDimension(1, f5, context.getResources().getDisplayMetrics());
    }

    private final int playerWidth(Context context, boolean isTablet) {
        float f5;
        if (isTablet) {
            f5 = 408.0f;
        } else {
            f5 = 240.0f;
        }
        return (int) TypedValue.applyDimension(1, f5, context.getResources().getDisplayMetrics());
    }

    @Override // com.clevertap.android.sdk.video.InAppVideoPlayerHandle
    public void initExoplayer(@NotNull Context context, @NotNull String url) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(url, "url");
        if (this.player != null) {
            return;
        }
        BandwidthMeter build = new DefaultBandwidthMeter.Builder(context).build();
        Intrinsics.delta(build, "build(...)");
        TrackSelector defaultTrackSelector = new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory());
        String userAgent = Util.getUserAgent(context, context.getPackageName());
        Intrinsics.delta(userAgent, "getUserAgent(...)");
        DataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(build.getTransferListener());
        Intrinsics.delta(transferListener, "setTransferListener(...)");
        DataSource.Factory factory = new DefaultDataSource.Factory(context, transferListener);
        MediaItem fromUri = MediaItem.fromUri(url);
        Intrinsics.delta(fromUri, "fromUri(...)");
        MediaSource createMediaSource = new HlsMediaSource.Factory(factory).createMediaSource(fromUri);
        Intrinsics.delta(createMediaSource, "createMediaSource(...)");
        ExoPlayer build2 = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).build();
        build2.setMediaSource(createMediaSource);
        build2.prepare();
        build2.setRepeatMode(1);
        build2.seekTo(this.mediaPosition);
        this.player = build2;
    }

    @Override // com.clevertap.android.sdk.video.InAppVideoPlayerHandle
    public void initPlayerView(@NotNull Context context, boolean isTablet) {
        Intrinsics.echo(context, "context");
        if (this.playerView != null) {
            return;
        }
        int playerWidth = playerWidth(context, isTablet);
        int playerHeight = playerHeight(context, isTablet);
        PlayerView playerView = new PlayerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(playerWidth, playerHeight);
        this.playerViewLayoutParamsNormal = layoutParams;
        playerView.setLayoutParams(layoutParams);
        playerView.setShowBuffering(1);
        playerView.setUseArtwork(true);
        playerView.setControllerAutoShow(false);
        Resources resources = context.getResources();
        int i4 = R.drawable.ct_audio;
        ThreadLocal threadLocal = k.alpha;
        playerView.setDefaultArtwork(resources.getDrawable(i4, null));
        this.playerView = playerView;
    }

    @Override // com.clevertap.android.sdk.video.InAppVideoPlayerHandle
    public void pause() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
            this.player = null;
        }
    }

    @Override // com.clevertap.android.sdk.video.InAppVideoPlayerHandle
    public void play() {
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setVisibility(0);
            playerView.setPlayer(this.player);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(true);
        }
    }

    @Override // com.clevertap.android.sdk.video.InAppVideoPlayerHandle
    public void savePosition() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            Intrinsics.checkNotNull(exoPlayer);
            this.mediaPosition = exoPlayer.getCurrentPosition();
        }
    }

    @Override // com.clevertap.android.sdk.video.InAppVideoPlayerHandle
    public void switchToFullScreen(boolean isFullScreen) {
        if (isFullScreen) {
            PlayerView playerView = this.playerView;
            Intrinsics.checkNotNull(playerView);
            this.playerViewLayoutParamsNormal = playerView.getLayoutParams();
            PlayerView playerView2 = this.playerView;
            Intrinsics.checkNotNull(playerView2);
            playerView2.setLayoutParams(this.playerViewLayoutParamsFullScreen);
            return;
        }
        PlayerView playerView3 = this.playerView;
        Intrinsics.checkNotNull(playerView3);
        playerView3.setLayoutParams(this.playerViewLayoutParamsNormal);
    }

    @Override // com.clevertap.android.sdk.video.InAppVideoPlayerHandle
    @NotNull
    public View videoSurface() {
        View view = this.playerView;
        Intrinsics.checkNotNull(view);
        return view;
    }
}
