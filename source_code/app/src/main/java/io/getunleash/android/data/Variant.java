package io.getunleash.android.data;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lio/getunleash/android/data/Variant;", "", "name", "", "enabled", "", "featureEnabled", "payload", "Lio/getunleash/android/data/Payload;", "<init>", "(Ljava/lang/String;ZZLio/getunleash/android/data/Payload;)V", "getName", "()Ljava/lang/String;", "getEnabled", "()Z", "getFeatureEnabled", "getPayload", "()Lio/getunleash/android/data/Payload;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Variant {
    private final boolean enabled;
    private final boolean featureEnabled;

    @NotNull
    private final String name;

    @Nullable
    private final Payload payload;

    public Variant(@NotNull String name, boolean z2, @Json(name = "feature_enabled") boolean z10, @Nullable Payload payload) {
        Intrinsics.echo(name, "name");
        this.name = name;
        this.enabled = z2;
        this.featureEnabled = z10;
        this.payload = payload;
    }

    public static /* synthetic */ Variant copy$default(Variant variant, String str, boolean z2, boolean z10, Payload payload, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = variant.name;
        }
        if ((i4 & 2) != 0) {
            z2 = variant.enabled;
        }
        if ((i4 & 4) != 0) {
            z10 = variant.featureEnabled;
        }
        if ((i4 & 8) != 0) {
            payload = variant.payload;
        }
        return variant.copy(str, z2, z10, payload);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    @NotNull
    public final Variant copy(@NotNull String name, boolean enabled, @Json(name = "feature_enabled") boolean featureEnabled, @Nullable Payload payload) {
        Intrinsics.echo(name, "name");
        return new Variant(name, enabled, featureEnabled, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Variant)) {
            return false;
        }
        Variant variant = (Variant) other;
        return Intrinsics.areEqual(this.name, variant.name) && this.enabled == variant.enabled && this.featureEnabled == variant.featureEnabled && Intrinsics.areEqual(this.payload, variant.payload);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Payload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = this.name.hashCode() * 31;
        int i5 = 1237;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (hashCode2 + i4) * 31;
        if (this.featureEnabled) {
            i5 = 1231;
        }
        int i11 = (i10 + i5) * 31;
        Payload payload = this.payload;
        if (payload == null) {
            hashCode = 0;
        } else {
            hashCode = payload.hashCode();
        }
        return i11 + hashCode;
    }

    @NotNull
    public String toString() {
        return "Variant(name=" + this.name + ", enabled=" + this.enabled + ", featureEnabled=" + this.featureEnabled + ", payload=" + this.payload + ')';
    }

    public /* synthetic */ Variant(String str, boolean z2, boolean z10, Payload payload, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? false : z10, (i4 & 8) != 0 ? null : payload);
    }
}
