package com.clevertap.android.sdk.video.inbox;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.ui.PlayerView;
import com.clevertap.android.sdk.video.InboxVideoPlayerHandle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J \u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\rH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J(\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/clevertap/android/sdk/video/inbox/Media3Handle;", "Lcom/clevertap/android/sdk/video/InboxVideoPlayerHandle;", "<init>", "()V", "videoSurfaceView", "Landroidx/media3/ui/PlayerView;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "initExoplayer", "", "context", "Landroid/content/Context;", "buffering", "Lkotlin/Function0;", "playerReady", "videoSurface", "Landroid/view/View;", "setPlayWhenReady", "play", "", "pause", "initPlayerView", "artworkAsset", "Landroid/graphics/drawable/Drawable;", "playerVolume", "", "handleMute", "startPlaying", "ctx", "uriString", "", "isMediaAudio", "isMediaVideo", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
/* loaded from: classes3.dex */
public final class Media3Handle implements InboxVideoPlayerHandle {

    @Nullable
    private ExoPlayer player;

    @Nullable
    private PlayerView videoSurfaceView;

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    public void handleMute() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            float playerVolume = playerVolume();
            if (playerVolume > 0.0f) {
                exoPlayer.setVolume(0.0f);
            } else if (playerVolume == 0.0f) {
                exoPlayer.setVolume(1.0f);
            }
        }
    }

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    public void initExoplayer(@NotNull Context context, @NotNull final Function0<Unit> buffering, @NotNull final Function0<Unit> playerReady) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(buffering, "buffering");
        Intrinsics.echo(playerReady, "playerReady");
        if (this.player != null) {
            return;
        }
        final ExoPlayer build = new ExoPlayer.Builder(context).setTrackSelector(new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory())).build();
        build.setVolume(0.0f);
        build.addListener(new Media3PlayerListener() { // from class: com.clevertap.android.sdk.video.inbox.Media3Handle$initExoplayer$1$1
            public void onPlaybackStateChanged(int playbackState) {
                ExoPlayer exoPlayer;
                PlayerView playerView;
                if (playbackState != 2) {
                    if (playbackState != 3) {
                        if (playbackState == 4) {
                            exoPlayer = this.player;
                            if (exoPlayer != null) {
                                build.seekTo(0L);
                                build.setPlayWhenReady(false);
                                playerView = this.videoSurfaceView;
                                if (playerView != null) {
                                    playerView.showController();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    playerReady.invoke();
                    return;
                }
                buffering.invoke();
            }
        });
        this.player = build;
    }

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    public void initPlayerView(@NotNull Context context, @NotNull Function0<? extends Drawable> artworkAsset) {
        int i4;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(artworkAsset, "artworkAsset");
        if (this.videoSurfaceView != null) {
            return;
        }
        PlayerView playerView = new PlayerView(context);
        playerView.setBackgroundColor(0);
        if (context.getResources().getConfiguration().orientation == 2) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        playerView.setResizeMode(i4);
        playerView.setUseArtwork(true);
        playerView.setDefaultArtwork(artworkAsset.invoke());
        playerView.setUseController(true);
        playerView.setControllerAutoShow(false);
        playerView.setPlayer(this.player);
        this.videoSurfaceView = playerView;
    }

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    public void pause() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.player = null;
        this.videoSurfaceView = null;
    }

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    public float playerVolume() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 0.0f;
    }

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    public void setPlayWhenReady(boolean play) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(play);
        }
    }

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    public void startPlaying(@NotNull Context ctx, @NotNull String uriString, boolean isMediaAudio, boolean isMediaVideo) {
        Intrinsics.echo(ctx, "ctx");
        Intrinsics.echo(uriString, "uriString");
        PlayerView playerView = this.videoSurfaceView;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setShowBuffering(0);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            TransferListener build = new DefaultBandwidthMeter.Builder(ctx).build();
            Intrinsics.delta(build, "build(...)");
            String userAgent = Util.getUserAgent(ctx, ctx.getPackageName());
            Intrinsics.delta(userAgent, "getUserAgent(...)");
            MediaItem fromUri = MediaItem.fromUri(uriString);
            Intrinsics.delta(fromUri, "fromUri(...)");
            DataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(build);
            Intrinsics.delta(transferListener, "setTransferListener(...)");
            MediaSource createMediaSource = new HlsMediaSource.Factory(new DefaultDataSource.Factory(ctx, transferListener)).createMediaSource(fromUri);
            Intrinsics.delta(createMediaSource, "createMediaSource(...)");
            exoPlayer.setMediaSource(createMediaSource);
            exoPlayer.prepare();
            if (isMediaAudio) {
                PlayerView playerView2 = this.videoSurfaceView;
                if (playerView2 != null) {
                    playerView2.showController();
                }
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.setVolume(1.0f);
                return;
            }
            if (isMediaVideo) {
                exoPlayer.setPlayWhenReady(true);
                exoPlayer.setVolume(playerVolume());
            }
        }
    }

    @Override // com.clevertap.android.sdk.video.InboxVideoPlayerHandle
    @NotNull
    public View videoSurface() {
        View view = this.videoSurfaceView;
        Intrinsics.checkNotNull(view);
        return view;
    }
}
