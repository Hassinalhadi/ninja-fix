package com.clevertap.android.sdk.video.inbox;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020(H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0007H\u0016J\u0010\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020(H\u0016J\u0010\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020;H\u0016J\u0012\u0010<\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J \u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020FH\u0016J\u0010\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020FH\u0016J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u0007H\u0016J\u0010\u0010M\u001a\u00020\u00052\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00020(H\u0016J\u0010\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020WH\u0016J\u0018\u0010X\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020(H\u0016J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\\H\u0016¨\u0006]"}, d2 = {"Lcom/clevertap/android/sdk/video/inbox/Media3PlayerListener;", "Landroidx/media3/common/Player$Listener;", "<init>", "()V", "onSurfaceSizeChanged", "", "width", "", "height", "onRenderedFirstFrame", "onCues", "cues", "", "Landroidx/media3/common/text/Cue;", "cueGroup", "Landroidx/media3/common/text/CueGroup;", "onMetadata", "metadata", "Landroidx/media3/common/Metadata;", "onEvents", "player", "Landroidx/media3/common/Player;", "events", "Landroidx/media3/common/Player$Events;", "onTimelineChanged", "timeline", "Landroidx/media3/common/Timeline;", "reason", "onMediaItemTransition", "mediaItem", "Landroidx/media3/common/MediaItem;", "onTracksChanged", "tracks", "Landroidx/media3/common/Tracks;", "onMediaMetadataChanged", "mediaMetadata", "Landroidx/media3/common/MediaMetadata;", "onPlaylistMetadataChanged", "onIsLoadingChanged", "isLoading", "", "onAvailableCommandsChanged", "availableCommands", "Landroidx/media3/common/Player$Commands;", "onTrackSelectionParametersChanged", "parameters", "Landroidx/media3/common/TrackSelectionParameters;", "onPlayWhenReadyChanged", "playWhenReady", "onPlaybackSuppressionReasonChanged", "playbackSuppressionReason", "onIsPlayingChanged", "isPlaying", "onRepeatModeChanged", "repeatMode", "onShuffleModeEnabledChanged", "shuffleModeEnabled", "onPlayerError", RedirectCustomTabEventLogger.RESULT_ERROR, "Landroidx/media3/common/PlaybackException;", "onPlayerErrorChanged", "onPositionDiscontinuity", "oldPosition", "Landroidx/media3/common/Player$PositionInfo;", "newPosition", "onPlaybackParametersChanged", "playbackParameters", "Landroidx/media3/common/PlaybackParameters;", "onSeekBackIncrementChanged", "seekBackIncrementMs", "", "onSeekForwardIncrementChanged", "seekForwardIncrementMs", "onMaxSeekToPreviousPositionChanged", "maxSeekToPreviousPositionMs", "onAudioSessionIdChanged", "audioSessionId", "onAudioAttributesChanged", "audioAttributes", "Landroidx/media3/common/AudioAttributes;", "onVolumeChanged", "volume", "", "onSkipSilenceEnabledChanged", "skipSilenceEnabled", "onDeviceInfoChanged", "deviceInfo", "Landroidx/media3/common/DeviceInfo;", "onDeviceVolumeChanged", "muted", "onVideoSizeChanged", "videoSize", "Landroidx/media3/common/VideoSize;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
/* loaded from: classes3.dex */
public class Media3PlayerListener implements Player.Listener {
    public void onAudioAttributesChanged(@NotNull AudioAttributes audioAttributes) {
        Intrinsics.echo(audioAttributes, "audioAttributes");
    }

    public void onAudioSessionIdChanged(int audioSessionId) {
    }

    public void onAvailableCommandsChanged(@NotNull Player.Commands availableCommands) {
        Intrinsics.echo(availableCommands, "availableCommands");
    }

    public void onCues(@NotNull CueGroup cueGroup) {
        Intrinsics.echo(cueGroup, "cueGroup");
    }

    public void onDeviceInfoChanged(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.echo(deviceInfo, "deviceInfo");
    }

    public void onDeviceVolumeChanged(int volume, boolean muted) {
    }

    public void onEvents(@NotNull Player player, @NotNull Player.Events events) {
        Intrinsics.echo(player, "player");
        Intrinsics.echo(events, "events");
    }

    public void onIsLoadingChanged(boolean isLoading) {
    }

    public void onIsPlayingChanged(boolean isPlaying) {
    }

    public void onMaxSeekToPreviousPositionChanged(long maxSeekToPreviousPositionMs) {
    }

    public void onMediaItemTransition(@Nullable MediaItem mediaItem, int reason) {
    }

    public void onMediaMetadataChanged(@NotNull MediaMetadata mediaMetadata) {
        Intrinsics.echo(mediaMetadata, "mediaMetadata");
    }

    public void onMetadata(@NotNull androidx.media3.common.Metadata metadata) {
        Intrinsics.echo(metadata, "metadata");
    }

    public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
    }

    public void onPlaybackParametersChanged(@NotNull PlaybackParameters playbackParameters) {
        Intrinsics.echo(playbackParameters, "playbackParameters");
    }

    public void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason) {
    }

    public void onPlayerError(@NotNull PlaybackException error) {
        Intrinsics.echo(error, "error");
    }

    public void onPlayerErrorChanged(@Nullable PlaybackException error) {
    }

    public void onPlaylistMetadataChanged(@NotNull MediaMetadata mediaMetadata) {
        Intrinsics.echo(mediaMetadata, "mediaMetadata");
    }

    public void onPositionDiscontinuity(@NotNull Player.PositionInfo oldPosition, @NotNull Player.PositionInfo newPosition, int reason) {
        Intrinsics.echo(oldPosition, "oldPosition");
        Intrinsics.echo(newPosition, "newPosition");
    }

    public void onRenderedFirstFrame() {
    }

    public void onRepeatModeChanged(int repeatMode) {
    }

    public void onSeekBackIncrementChanged(long seekBackIncrementMs) {
    }

    public void onSeekForwardIncrementChanged(long seekForwardIncrementMs) {
    }

    public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {
    }

    public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
    }

    public void onSurfaceSizeChanged(int width, int height) {
    }

    public void onTimelineChanged(@NotNull Timeline timeline, int reason) {
        Intrinsics.echo(timeline, "timeline");
    }

    public void onTrackSelectionParametersChanged(@NotNull TrackSelectionParameters parameters) {
        Intrinsics.echo(parameters, "parameters");
    }

    public void onTracksChanged(@NotNull Tracks tracks) {
        Intrinsics.echo(tracks, "tracks");
    }

    public void onVideoSizeChanged(@NotNull VideoSize videoSize) {
        Intrinsics.echo(videoSize, "videoSize");
    }

    public void onVolumeChanged(float volume) {
    }

    @c
    public void onCues(@NotNull List<Cue> cues) {
        Intrinsics.echo(cues, "cues");
    }
}
