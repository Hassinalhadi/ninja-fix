package io.getunleash.android.metrics;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/getunleash/android/metrics/Bucket;", "", "start", "Ljava/util/Date;", "stop", "toggles", "", "", "Lio/getunleash/android/metrics/EvaluationCount;", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V", "getStart", "()Ljava/util/Date;", "getStop", "getToggles", "()Ljava/util/Map;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Bucket {

    @NotNull
    private final Date start;

    @NotNull
    private final Date stop;

    @NotNull
    private final Map<String, EvaluationCount> toggles;

    public Bucket(@NotNull Date start, @NotNull Date stop, @NotNull Map<String, EvaluationCount> toggles) {
        Intrinsics.echo(start, "start");
        Intrinsics.echo(stop, "stop");
        Intrinsics.echo(toggles, "toggles");
        this.start = start;
        this.stop = stop;
        this.toggles = toggles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Bucket copy$default(Bucket bucket, Date date, Date date2, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            date = bucket.start;
        }
        if ((i4 & 2) != 0) {
            date2 = bucket.stop;
        }
        if ((i4 & 4) != 0) {
            map = bucket.toggles;
        }
        return bucket.copy(date, date2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Date getStart() {
        return this.start;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Date getStop() {
        return this.stop;
    }

    @NotNull
    public final Map<String, EvaluationCount> component3() {
        return this.toggles;
    }

    @NotNull
    public final Bucket copy(@NotNull Date start, @NotNull Date stop, @NotNull Map<String, EvaluationCount> toggles) {
        Intrinsics.echo(start, "start");
        Intrinsics.echo(stop, "stop");
        Intrinsics.echo(toggles, "toggles");
        return new Bucket(start, stop, toggles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bucket)) {
            return false;
        }
        Bucket bucket = (Bucket) other;
        return Intrinsics.areEqual(this.start, bucket.start) && Intrinsics.areEqual(this.stop, bucket.stop) && Intrinsics.areEqual(this.toggles, bucket.toggles);
    }

    @NotNull
    public final Date getStart() {
        return this.start;
    }

    @NotNull
    public final Date getStop() {
        return this.stop;
    }

    @NotNull
    public final Map<String, EvaluationCount> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        return this.toggles.hashCode() + ((this.stop.hashCode() + (this.start.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Bucket(start=" + this.start + ", stop=" + this.stop + ", toggles=" + this.toggles + ')';
    }

    public /* synthetic */ Bucket(Date date, Date date2, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, date2, (i4 & 4) != 0 ? new LinkedHashMap() : map);
    }
}
