package io.getunleash.android.metrics;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/getunleash/android/metrics/MetricsPayload;", "", "appName", "", "instanceId", "bucket", "Lio/getunleash/android/metrics/Bucket;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getunleash/android/metrics/Bucket;)V", "getAppName", "()Ljava/lang/String;", "getInstanceId", "getBucket", "()Lio/getunleash/android/metrics/Bucket;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MetricsPayload {

    @NotNull
    private final String appName;

    @NotNull
    private final Bucket bucket;

    @NotNull
    private final String instanceId;

    public MetricsPayload(@NotNull String appName, @NotNull String instanceId, @NotNull Bucket bucket) {
        Intrinsics.echo(appName, "appName");
        Intrinsics.echo(instanceId, "instanceId");
        Intrinsics.echo(bucket, "bucket");
        this.appName = appName;
        this.instanceId = instanceId;
        this.bucket = bucket;
    }

    public static /* synthetic */ MetricsPayload copy$default(MetricsPayload metricsPayload, String str, String str2, Bucket bucket, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = metricsPayload.appName;
        }
        if ((i4 & 2) != 0) {
            str2 = metricsPayload.instanceId;
        }
        if ((i4 & 4) != 0) {
            bucket = metricsPayload.bucket;
        }
        return metricsPayload.copy(str, str2, bucket);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Bucket getBucket() {
        return this.bucket;
    }

    @NotNull
    public final MetricsPayload copy(@NotNull String appName, @NotNull String instanceId, @NotNull Bucket bucket) {
        Intrinsics.echo(appName, "appName");
        Intrinsics.echo(instanceId, "instanceId");
        Intrinsics.echo(bucket, "bucket");
        return new MetricsPayload(appName, instanceId, bucket);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsPayload)) {
            return false;
        }
        MetricsPayload metricsPayload = (MetricsPayload) other;
        return Intrinsics.areEqual(this.appName, metricsPayload.appName) && Intrinsics.areEqual(this.instanceId, metricsPayload.instanceId) && Intrinsics.areEqual(this.bucket, metricsPayload.bucket);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final Bucket getBucket() {
        return this.bucket;
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    public int hashCode() {
        return this.bucket.hashCode() + AbstractC2327c.sierra(this.appName.hashCode() * 31, 31, this.instanceId);
    }

    @NotNull
    public String toString() {
        return "MetricsPayload(appName=" + this.appName + ", instanceId=" + this.instanceId + ", bucket=" + this.bucket + ')';
    }
}
