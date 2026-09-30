package io.getunleash.android.events;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import io.getunleash.android.polling.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/getunleash/android/events/HeartbeatEvent;", "", "status", "Lio/getunleash/android/polling/Status;", Constants.KEY_MESSAGE, "", "<init>", "(Lio/getunleash/android/polling/Status;Ljava/lang/String;)V", "getStatus", "()Lio/getunleash/android/polling/Status;", "getMessage", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HeartbeatEvent {

    @Nullable
    private final String message;

    @NotNull
    private final Status status;

    public HeartbeatEvent(@NotNull Status status, @Nullable String str) {
        Intrinsics.echo(status, "status");
        this.status = status;
        this.message = str;
    }

    public static /* synthetic */ HeartbeatEvent copy$default(HeartbeatEvent heartbeatEvent, Status status, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            status = heartbeatEvent.status;
        }
        if ((i4 & 2) != 0) {
            str = heartbeatEvent.message;
        }
        return heartbeatEvent.copy(status, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final HeartbeatEvent copy(@NotNull Status status, @Nullable String message) {
        Intrinsics.echo(status, "status");
        return new HeartbeatEvent(status, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartbeatEvent)) {
            return false;
        }
        HeartbeatEvent heartbeatEvent = (HeartbeatEvent) other;
        return this.status == heartbeatEvent.status && Intrinsics.areEqual(this.message, heartbeatEvent.message);
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeartbeatEvent(status=");
        sb2.append(this.status);
        sb2.append(", message=");
        return P0.fuchsia(sb2, this.message, ')');
    }

    public /* synthetic */ HeartbeatEvent(Status status, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i4 & 2) != 0 ? null : str);
    }
}
