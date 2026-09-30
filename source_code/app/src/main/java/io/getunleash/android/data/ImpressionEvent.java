package io.getunleash.android.data;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lio/getunleash/android/data/ImpressionEvent;", "", "featureName", "", "enabled", "", "context", "Lio/getunleash/android/data/UnleashContext;", "variant", "eventId", "<init>", "(Ljava/lang/String;ZLio/getunleash/android/data/UnleashContext;Ljava/lang/String;Ljava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "getEnabled", "()Z", "getContext", "()Lio/getunleash/android/data/UnleashContext;", "getVariant", "getEventId", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ImpressionEvent {

    @NotNull
    private final UnleashContext context;
    private final boolean enabled;

    @NotNull
    private final String eventId;

    @NotNull
    private final String featureName;

    @Nullable
    private final String variant;

    public ImpressionEvent(@NotNull String featureName, boolean z2, @NotNull UnleashContext context, @Nullable String str, @NotNull String eventId) {
        Intrinsics.echo(featureName, "featureName");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(eventId, "eventId");
        this.featureName = featureName;
        this.enabled = z2;
        this.context = context;
        this.variant = str;
        this.eventId = eventId;
    }

    public static /* synthetic */ ImpressionEvent copy$default(ImpressionEvent impressionEvent, String str, boolean z2, UnleashContext unleashContext, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = impressionEvent.featureName;
        }
        if ((i4 & 2) != 0) {
            z2 = impressionEvent.enabled;
        }
        if ((i4 & 4) != 0) {
            unleashContext = impressionEvent.context;
        }
        if ((i4 & 8) != 0) {
            str2 = impressionEvent.variant;
        }
        if ((i4 & 16) != 0) {
            str3 = impressionEvent.eventId;
        }
        String str4 = str3;
        UnleashContext unleashContext2 = unleashContext;
        return impressionEvent.copy(str, z2, unleashContext2, str2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final UnleashContext getContext() {
        return this.context;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final ImpressionEvent copy(@NotNull String featureName, boolean enabled, @NotNull UnleashContext context, @Nullable String variant, @NotNull String eventId) {
        Intrinsics.echo(featureName, "featureName");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(eventId, "eventId");
        return new ImpressionEvent(featureName, enabled, context, variant, eventId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpressionEvent)) {
            return false;
        }
        ImpressionEvent impressionEvent = (ImpressionEvent) other;
        return Intrinsics.areEqual(this.featureName, impressionEvent.featureName) && this.enabled == impressionEvent.enabled && Intrinsics.areEqual(this.context, impressionEvent.context) && Intrinsics.areEqual(this.variant, impressionEvent.variant) && Intrinsics.areEqual(this.eventId, impressionEvent.eventId);
    }

    @NotNull
    public final UnleashContext getContext() {
        return this.context;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }

    @Nullable
    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = this.featureName.hashCode() * 31;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode3 = (this.context.hashCode() + ((hashCode2 + i4) * 31)) * 31;
        String str = this.variant;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.eventId.hashCode() + ((hashCode3 + hashCode) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImpressionEvent(featureName=");
        sb2.append(this.featureName);
        sb2.append(", enabled=");
        sb2.append(this.enabled);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", variant=");
        sb2.append(this.variant);
        sb2.append(", eventId=");
        return P0.fuchsia(sb2, this.eventId, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ImpressionEvent(String str, boolean z2, UnleashContext unleashContext, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2, unleashContext, r4, str3);
        String str4 = (i4 & 8) != 0 ? null : str2;
        if ((i4 & 16) != 0) {
            str3 = UUID.randomUUID().toString();
            Intrinsics.delta(str3, "toString(...)");
        }
    }
}
