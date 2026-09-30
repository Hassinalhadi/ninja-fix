package io.getunleash.android.data;

import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import io.getunleash.android.UnleashConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00010Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jo\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, d2 = {"Lio/getunleash/android/data/DataStrategy;", "", "enabled", "", "interval", "", "delay", "pauseOnBackground", "httpConnectionTimeout", "httpReadTimeout", "httpWriteTimeout", "httpCacheSize", "httpCustomHeaders", "", "", "<init>", "(ZJJZJJJJLjava/util/Map;)V", "getEnabled", "()Z", "getInterval", "()J", "getDelay", "getPauseOnBackground", "getHttpConnectionTimeout", "getHttpReadTimeout", "getHttpWriteTimeout", "getHttpCacheSize", "getHttpCustomHeaders", "()Ljava/util/Map;", "newBuilder", "Lio/getunleash/android/data/DataStrategy$Builder;", "parent", "Lio/getunleash/android/UnleashConfig$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "Builder", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DataStrategy {
    private final long delay;
    private final boolean enabled;
    private final long httpCacheSize;
    private final long httpConnectionTimeout;

    @NotNull
    private final Map<String, String> httpCustomHeaders;
    private final long httpReadTimeout;
    private final long httpWriteTimeout;
    private final long interval;
    private final boolean pauseOnBackground;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010*\u001a\u00020+J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007J\u001a\u0010\r\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lio/getunleash/android/data/DataStrategy$Builder;", "", "parent", "Lio/getunleash/android/UnleashConfig$Builder;", "enabled", "", "interval", "", "delay", "pauseOnBackground", "httpConnectionTimeout", "httpReadTimeout", "httpCacheSize", "httpCustomHeaders", "", "", "<init>", "(Lio/getunleash/android/UnleashConfig$Builder;ZJJZJJJLjava/util/Map;)V", "getParent", "()Lio/getunleash/android/UnleashConfig$Builder;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getInterval", "()J", "setInterval", "(J)V", "getDelay", "setDelay", "getPauseOnBackground", "setPauseOnBackground", "getHttpConnectionTimeout", "setHttpConnectionTimeout", "getHttpReadTimeout", "setHttpReadTimeout", "getHttpCacheSize", "setHttpCacheSize", "getHttpCustomHeaders", "()Ljava/util/Map;", "setHttpCustomHeaders", "(Ljava/util/Map;)V", "build", "Lio/getunleash/android/data/DataStrategy;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private long delay;
        private boolean enabled;
        private long httpCacheSize;
        private long httpConnectionTimeout;

        @NotNull
        private Map<String, String> httpCustomHeaders;
        private long httpReadTimeout;
        private long interval;

        @NotNull
        private final UnleashConfig.Builder parent;
        private boolean pauseOnBackground;

        public Builder(@NotNull UnleashConfig.Builder parent, boolean z2, long j5, long j6, boolean z10, long j7, long j10, long j11, @NotNull Map<String, String> httpCustomHeaders) {
            Intrinsics.echo(parent, "parent");
            Intrinsics.echo(httpCustomHeaders, "httpCustomHeaders");
            this.parent = parent;
            this.enabled = z2;
            this.interval = j5;
            this.delay = j6;
            this.pauseOnBackground = z10;
            this.httpConnectionTimeout = j7;
            this.httpReadTimeout = j10;
            this.httpCacheSize = j11;
            this.httpCustomHeaders = httpCustomHeaders;
        }

        @NotNull
        public final DataStrategy build() {
            return new DataStrategy(this.enabled, this.interval, this.delay, this.pauseOnBackground, this.httpConnectionTimeout, this.httpReadTimeout, 0L, this.httpCacheSize, this.httpCustomHeaders, 64, null);
        }

        @NotNull
        public final UnleashConfig.Builder delay(long delay) {
            this.delay = delay;
            return this.parent;
        }

        @NotNull
        public final UnleashConfig.Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this.parent;
        }

        public final long getDelay() {
            return this.delay;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getHttpCacheSize() {
            return this.httpCacheSize;
        }

        public final long getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        @NotNull
        public final Map<String, String> getHttpCustomHeaders() {
            return this.httpCustomHeaders;
        }

        public final long getHttpReadTimeout() {
            return this.httpReadTimeout;
        }

        public final long getInterval() {
            return this.interval;
        }

        @NotNull
        public final UnleashConfig.Builder getParent() {
            return this.parent;
        }

        public final boolean getPauseOnBackground() {
            return this.pauseOnBackground;
        }

        @NotNull
        public final UnleashConfig.Builder httpCacheSize(long httpCacheSize) {
            this.httpCacheSize = httpCacheSize;
            return this.parent;
        }

        @NotNull
        public final UnleashConfig.Builder httpConnectionTimeout(long httpConnectionTimeout) {
            this.httpConnectionTimeout = httpConnectionTimeout;
            return this.parent;
        }

        @NotNull
        public final UnleashConfig.Builder httpCustomHeaders(@NotNull Map<String, String> httpCustomHeaders) {
            Intrinsics.echo(httpCustomHeaders, "httpCustomHeaders");
            this.httpCustomHeaders = httpCustomHeaders;
            return this.parent;
        }

        @NotNull
        public final UnleashConfig.Builder httpReadTimeout(long httpReadTimeout) {
            this.httpReadTimeout = httpReadTimeout;
            return this.parent;
        }

        @NotNull
        public final UnleashConfig.Builder interval(long interval) {
            this.interval = interval;
            return this.parent;
        }

        @NotNull
        public final UnleashConfig.Builder pauseOnBackground(boolean pauseOnBackground) {
            this.pauseOnBackground = pauseOnBackground;
            return this.parent;
        }

        public final void setDelay(long j5) {
            this.delay = j5;
        }

        public final void setEnabled(boolean z2) {
            this.enabled = z2;
        }

        public final void setHttpCacheSize(long j5) {
            this.httpCacheSize = j5;
        }

        public final void setHttpConnectionTimeout(long j5) {
            this.httpConnectionTimeout = j5;
        }

        public final void setHttpCustomHeaders(@NotNull Map<String, String> map) {
            Intrinsics.echo(map, "<set-?>");
            this.httpCustomHeaders = map;
        }

        public final void setHttpReadTimeout(long j5) {
            this.httpReadTimeout = j5;
        }

        public final void setInterval(long j5) {
            this.interval = j5;
        }

        public final void setPauseOnBackground(boolean z2) {
            this.pauseOnBackground = z2;
        }
    }

    public DataStrategy() {
        this(false, 0L, 0L, false, 0L, 0L, 0L, 0L, null, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDelay() {
        return this.delay;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPauseOnBackground() {
        return this.pauseOnBackground;
    }

    /* renamed from: component5, reason: from getter */
    public final long getHttpConnectionTimeout() {
        return this.httpConnectionTimeout;
    }

    /* renamed from: component6, reason: from getter */
    public final long getHttpReadTimeout() {
        return this.httpReadTimeout;
    }

    /* renamed from: component7, reason: from getter */
    public final long getHttpWriteTimeout() {
        return this.httpWriteTimeout;
    }

    /* renamed from: component8, reason: from getter */
    public final long getHttpCacheSize() {
        return this.httpCacheSize;
    }

    @NotNull
    public final Map<String, String> component9() {
        return this.httpCustomHeaders;
    }

    @NotNull
    public final DataStrategy copy(boolean enabled, long interval, long delay, boolean pauseOnBackground, long httpConnectionTimeout, long httpReadTimeout, long httpWriteTimeout, long httpCacheSize, @NotNull Map<String, String> httpCustomHeaders) {
        Intrinsics.echo(httpCustomHeaders, "httpCustomHeaders");
        return new DataStrategy(enabled, interval, delay, pauseOnBackground, httpConnectionTimeout, httpReadTimeout, httpWriteTimeout, httpCacheSize, httpCustomHeaders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataStrategy)) {
            return false;
        }
        DataStrategy dataStrategy = (DataStrategy) other;
        return this.enabled == dataStrategy.enabled && this.interval == dataStrategy.interval && this.delay == dataStrategy.delay && this.pauseOnBackground == dataStrategy.pauseOnBackground && this.httpConnectionTimeout == dataStrategy.httpConnectionTimeout && this.httpReadTimeout == dataStrategy.httpReadTimeout && this.httpWriteTimeout == dataStrategy.httpWriteTimeout && this.httpCacheSize == dataStrategy.httpCacheSize && Intrinsics.areEqual(this.httpCustomHeaders, dataStrategy.httpCustomHeaders);
    }

    public final long getDelay() {
        return this.delay;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getHttpCacheSize() {
        return this.httpCacheSize;
    }

    public final long getHttpConnectionTimeout() {
        return this.httpConnectionTimeout;
    }

    @NotNull
    public final Map<String, String> getHttpCustomHeaders() {
        return this.httpCustomHeaders;
    }

    public final long getHttpReadTimeout() {
        return this.httpReadTimeout;
    }

    public final long getHttpWriteTimeout() {
        return this.httpWriteTimeout;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final boolean getPauseOnBackground() {
        return this.pauseOnBackground;
    }

    public int hashCode() {
        int i4;
        int i5 = 1237;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        long j5 = this.interval;
        int i10 = ((i4 * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.delay;
        int i11 = (i10 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        if (this.pauseOnBackground) {
            i5 = 1231;
        }
        int i12 = (i11 + i5) * 31;
        long j7 = this.httpConnectionTimeout;
        int i13 = (i12 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.httpReadTimeout;
        int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.httpWriteTimeout;
        int i15 = (i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.httpCacheSize;
        return this.httpCustomHeaders.hashCode() + ((i15 + ((int) (j12 ^ (j12 >>> 32)))) * 31);
    }

    @NotNull
    public final Builder newBuilder(@NotNull UnleashConfig.Builder parent) {
        Intrinsics.echo(parent, "parent");
        return new Builder(parent, this.enabled, this.interval, this.delay, this.pauseOnBackground, this.httpConnectionTimeout, this.httpReadTimeout, this.httpCacheSize, this.httpCustomHeaders);
    }

    @NotNull
    public String toString() {
        return "DataStrategy(enabled=" + this.enabled + ", interval=" + this.interval + ", delay=" + this.delay + ", pauseOnBackground=" + this.pauseOnBackground + ", httpConnectionTimeout=" + this.httpConnectionTimeout + ", httpReadTimeout=" + this.httpReadTimeout + ", httpWriteTimeout=" + this.httpWriteTimeout + ", httpCacheSize=" + this.httpCacheSize + ", httpCustomHeaders=" + this.httpCustomHeaders + ')';
    }

    public DataStrategy(boolean z2, long j5, long j6, boolean z10, long j7, long j10, long j11, long j12, @NotNull Map<String, String> httpCustomHeaders) {
        Intrinsics.echo(httpCustomHeaders, "httpCustomHeaders");
        this.enabled = z2;
        this.interval = j5;
        this.delay = j6;
        this.pauseOnBackground = z10;
        this.httpConnectionTimeout = j7;
        this.httpReadTimeout = j10;
        this.httpWriteTimeout = j11;
        this.httpCacheSize = j12;
        this.httpCustomHeaders = httpCustomHeaders;
    }

    public /* synthetic */ DataStrategy(boolean z2, long j5, long j6, boolean z10, long j7, long j10, long j11, long j12, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z2, (i4 & 2) != 0 ? 60000L : j5, (i4 & 4) != 0 ? 0L : j6, (i4 & 8) == 0 ? z10 : true, (i4 & 16) != 0 ? Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS : j7, (i4 & 32) != 0 ? 5000L : j10, (i4 & 64) == 0 ? j11 : 5000L, (i4 & 128) != 0 ? 10485760L : j12, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? t.alpha : map);
    }
}
