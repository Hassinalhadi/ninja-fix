package io.getunleash.android;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import io.getunleash.android.backup.LocalStorageConfig;
import io.getunleash.android.data.DataStrategy;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 42\u00020\u0001:\u000245Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030#2\u0006\u0010$\u001a\u00020\tJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ji\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u0013¨\u00066"}, d2 = {"Lio/getunleash/android/UnleashConfig;", "", "proxyUrl", "", "clientKey", "appName", "localStorageConfig", "Lio/getunleash/android/backup/LocalStorageConfig;", "pollingStrategy", "Lio/getunleash/android/data/DataStrategy;", "metricsStrategy", "delayedInitialization", "", "forceImpressionData", "httpClient", "Lokhttp3/OkHttpClient;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getunleash/android/backup/LocalStorageConfig;Lio/getunleash/android/data/DataStrategy;Lio/getunleash/android/data/DataStrategy;ZZLokhttp3/OkHttpClient;)V", "getProxyUrl", "()Ljava/lang/String;", "getClientKey", "getAppName", "getLocalStorageConfig", "()Lio/getunleash/android/backup/LocalStorageConfig;", "getPollingStrategy", "()Lio/getunleash/android/data/DataStrategy;", "getMetricsStrategy", "getDelayedInitialization", "()Z", "getForceImpressionData", "getHttpClient", "()Lokhttp3/OkHttpClient;", "instanceId", "getInstanceId", "getApplicationHeaders", "", "strategy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "Companion", "Builder", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UnleashConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String instanceId;

    @NotNull
    private final String appName;

    @Nullable
    private final String clientKey;
    private final boolean delayedInitialization;
    private final boolean forceImpressionData;

    @Nullable
    private final OkHttpClient httpClient;

    @NotNull
    private final LocalStorageConfig localStorageConfig;

    @NotNull
    private final DataStrategy metricsStrategy;

    @NotNull
    private final DataStrategy pollingStrategy;

    @Nullable
    private final String proxyUrl;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/getunleash/android/UnleashConfig$Companion;", "", "<init>", "()V", "instanceId", "", "getInstanceId", "()Ljava/lang/String;", "newBuilder", "Lio/getunleash/android/UnleashConfig$Builder;", "appName", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getInstanceId() {
            return UnleashConfig.instanceId;
        }

        @NotNull
        public final Builder newBuilder(@NotNull String appName) {
            Intrinsics.echo(appName, "appName");
            return new Builder(appName, null, null, 6, null);
        }

        private Companion() {
        }
    }

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.delta(uuid, "toString(...)");
        instanceId = uuid;
    }

    public UnleashConfig(@Nullable String str, @Nullable String str2, @NotNull String appName, @NotNull LocalStorageConfig localStorageConfig, @NotNull DataStrategy pollingStrategy, @NotNull DataStrategy metricsStrategy, boolean z2, boolean z10, @Nullable OkHttpClient okHttpClient) {
        Intrinsics.echo(appName, "appName");
        Intrinsics.echo(localStorageConfig, "localStorageConfig");
        Intrinsics.echo(pollingStrategy, "pollingStrategy");
        Intrinsics.echo(metricsStrategy, "metricsStrategy");
        this.proxyUrl = str;
        this.clientKey = str2;
        this.appName = appName;
        this.localStorageConfig = localStorageConfig;
        this.pollingStrategy = pollingStrategy;
        this.metricsStrategy = metricsStrategy;
        this.delayedInitialization = z2;
        this.forceImpressionData = z10;
        this.httpClient = okHttpClient;
    }

    public static /* synthetic */ UnleashConfig copy$default(UnleashConfig unleashConfig, String str, String str2, String str3, LocalStorageConfig localStorageConfig, DataStrategy dataStrategy, DataStrategy dataStrategy2, boolean z2, boolean z10, OkHttpClient okHttpClient, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = unleashConfig.proxyUrl;
        }
        if ((i4 & 2) != 0) {
            str2 = unleashConfig.clientKey;
        }
        if ((i4 & 4) != 0) {
            str3 = unleashConfig.appName;
        }
        if ((i4 & 8) != 0) {
            localStorageConfig = unleashConfig.localStorageConfig;
        }
        if ((i4 & 16) != 0) {
            dataStrategy = unleashConfig.pollingStrategy;
        }
        if ((i4 & 32) != 0) {
            dataStrategy2 = unleashConfig.metricsStrategy;
        }
        if ((i4 & 64) != 0) {
            z2 = unleashConfig.delayedInitialization;
        }
        if ((i4 & 128) != 0) {
            z10 = unleashConfig.forceImpressionData;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            okHttpClient = unleashConfig.httpClient;
        }
        boolean z11 = z10;
        OkHttpClient okHttpClient2 = okHttpClient;
        DataStrategy dataStrategy3 = dataStrategy2;
        boolean z12 = z2;
        DataStrategy dataStrategy4 = dataStrategy;
        String str4 = str3;
        return unleashConfig.copy(str, str2, str4, localStorageConfig, dataStrategy4, dataStrategy3, z12, z11, okHttpClient2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final LocalStorageConfig getLocalStorageConfig() {
        return this.localStorageConfig;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final DataStrategy getPollingStrategy() {
        return this.pollingStrategy;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final DataStrategy getMetricsStrategy() {
        return this.metricsStrategy;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDelayedInitialization() {
        return this.delayedInitialization;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getForceImpressionData() {
        return this.forceImpressionData;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    @NotNull
    public final UnleashConfig copy(@Nullable String proxyUrl, @Nullable String clientKey, @NotNull String appName, @NotNull LocalStorageConfig localStorageConfig, @NotNull DataStrategy pollingStrategy, @NotNull DataStrategy metricsStrategy, boolean delayedInitialization, boolean forceImpressionData, @Nullable OkHttpClient httpClient) {
        Intrinsics.echo(appName, "appName");
        Intrinsics.echo(localStorageConfig, "localStorageConfig");
        Intrinsics.echo(pollingStrategy, "pollingStrategy");
        Intrinsics.echo(metricsStrategy, "metricsStrategy");
        return new UnleashConfig(proxyUrl, clientKey, appName, localStorageConfig, pollingStrategy, metricsStrategy, delayedInitialization, forceImpressionData, httpClient);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnleashConfig)) {
            return false;
        }
        UnleashConfig unleashConfig = (UnleashConfig) other;
        return Intrinsics.areEqual(this.proxyUrl, unleashConfig.proxyUrl) && Intrinsics.areEqual(this.clientKey, unleashConfig.clientKey) && Intrinsics.areEqual(this.appName, unleashConfig.appName) && Intrinsics.areEqual(this.localStorageConfig, unleashConfig.localStorageConfig) && Intrinsics.areEqual(this.pollingStrategy, unleashConfig.pollingStrategy) && Intrinsics.areEqual(this.metricsStrategy, unleashConfig.metricsStrategy) && this.delayedInitialization == unleashConfig.delayedInitialization && this.forceImpressionData == unleashConfig.forceImpressionData && Intrinsics.areEqual(this.httpClient, unleashConfig.httpClient);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final Map<String, String> getApplicationHeaders(@NotNull DataStrategy strategy) {
        Intrinsics.echo(strategy, "strategy");
        String str = this.clientKey;
        if (str == null) {
            str = "";
        }
        Map<String, String> httpCustomHeaders = strategy.getHttpCustomHeaders();
        Pair pair = new Pair("Authorization", str);
        Pair pair2 = new Pair(CtApi.HEADER_CONTENT_TYPE, "application/json");
        String str2 = this.appName;
        return y.uniform(httpCustomHeaders, y.sierra(pair, pair2, new Pair("UNLEASH-APPNAME", str2), new Pair("User-Agent", str2), new Pair("UNLEASH-INSTANCEID", getInstanceId()), new Pair("UNLEASH-CONNECTION-ID", getInstanceId()), new Pair("UNLEASH-SDK", "unleash-android-sdk:3.2.3")));
    }

    @Nullable
    public final String getClientKey() {
        return this.clientKey;
    }

    public final boolean getDelayedInitialization() {
        return this.delayedInitialization;
    }

    public final boolean getForceImpressionData() {
        return this.forceImpressionData;
    }

    @Nullable
    public final OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    @NotNull
    public final String getInstanceId() {
        return instanceId;
    }

    @NotNull
    public final LocalStorageConfig getLocalStorageConfig() {
        return this.localStorageConfig;
    }

    @NotNull
    public final DataStrategy getMetricsStrategy() {
        return this.metricsStrategy;
    }

    @NotNull
    public final DataStrategy getPollingStrategy() {
        return this.pollingStrategy;
    }

    @Nullable
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4;
        String str = this.proxyUrl;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.clientKey;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode3 = (this.metricsStrategy.hashCode() + ((this.pollingStrategy.hashCode() + ((this.localStorageConfig.hashCode() + AbstractC2327c.sierra((i10 + hashCode2) * 31, 31, this.appName)) * 31)) * 31)) * 31;
        int i11 = 1237;
        if (this.delayedInitialization) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = (hashCode3 + i4) * 31;
        if (this.forceImpressionData) {
            i11 = 1231;
        }
        int i13 = (i12 + i11) * 31;
        OkHttpClient okHttpClient = this.httpClient;
        if (okHttpClient != null) {
            i5 = okHttpClient.hashCode();
        }
        return i13 + i5;
    }

    @NotNull
    public String toString() {
        return "UnleashConfig(proxyUrl=" + this.proxyUrl + ", clientKey=" + this.clientKey + ", appName=" + this.appName + ", localStorageConfig=" + this.localStorageConfig + ", pollingStrategy=" + this.pollingStrategy + ", metricsStrategy=" + this.metricsStrategy + ", delayedInitialization=" + this.delayedInitialization + ", forceImpressionData=" + this.forceImpressionData + ", httpClient=" + this.httpClient + ')';
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u001d\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J+\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lio/getunleash/android/UnleashConfig$Builder;", "", "appName", "", "proxyUrl", "clientKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "delayedInitialization", "", "forceImpressionData", "pollingStrategy", "Lio/getunleash/android/data/DataStrategy$Builder;", "getPollingStrategy", "()Lio/getunleash/android/data/DataStrategy$Builder;", "metricsStrategy", "getMetricsStrategy", "localStorageConfig", "Lio/getunleash/android/backup/LocalStorageConfig$Builder;", "getLocalStorageConfig", "()Lio/getunleash/android/backup/LocalStorageConfig$Builder;", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "setHttpClient", "(Lokhttp3/OkHttpClient;)V", "build", "Lio/getunleash/android/UnleashConfig;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Builder {

        @NotNull
        private String appName;

        @Nullable
        private String clientKey;
        private boolean delayedInitialization;
        private boolean forceImpressionData;

        @Nullable
        private OkHttpClient httpClient;

        @NotNull
        private final LocalStorageConfig.Builder localStorageConfig;

        @NotNull
        private final DataStrategy.Builder metricsStrategy;

        @NotNull
        private final DataStrategy.Builder pollingStrategy;

        @Nullable
        private String proxyUrl;

        public Builder(@NotNull String appName, @Nullable String str, @Nullable String str2) {
            Intrinsics.echo(appName, "appName");
            this.appName = appName;
            this.proxyUrl = str;
            this.clientKey = str2;
            this.delayedInitialization = true;
            this.pollingStrategy = new DataStrategy(false, 0L, 0L, false, 0L, 0L, 0L, 0L, null, 511, null).newBuilder(this);
            this.metricsStrategy = new DataStrategy(false, 0L, 0L, false, 0L, 0L, 0L, 0L, null, 511, null).newBuilder(this);
            this.localStorageConfig = new LocalStorageConfig(false, null, 3, null).newBuilder(this);
        }

        /* renamed from: component1, reason: from getter */
        private final String getAppName() {
            return this.appName;
        }

        /* renamed from: component2, reason: from getter */
        private final String getProxyUrl() {
            return this.proxyUrl;
        }

        /* renamed from: component3, reason: from getter */
        private final String getClientKey() {
            return this.clientKey;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, String str2, String str3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = builder.appName;
            }
            if ((i4 & 2) != 0) {
                str2 = builder.proxyUrl;
            }
            if ((i4 & 4) != 0) {
                str3 = builder.clientKey;
            }
            return builder.copy(str, str2, str3);
        }

        @NotNull
        public final UnleashConfig build() {
            if ((this.proxyUrl != null && this.clientKey != null) || (!this.pollingStrategy.getEnabled() && !this.metricsStrategy.getEnabled())) {
                return new UnleashConfig(this.proxyUrl, this.clientKey, this.appName, this.localStorageConfig.build(), this.pollingStrategy.build(), this.metricsStrategy.build(), this.delayedInitialization, this.forceImpressionData, this.httpClient);
            }
            throw new IllegalStateException("You must either set proxyUrl and clientKey or disable both polling and metrics.");
        }

        @NotNull
        public final Builder clientKey(@NotNull String clientKey) {
            Intrinsics.echo(clientKey, "clientKey");
            this.clientKey = clientKey;
            return this;
        }

        @NotNull
        public final Builder copy(@NotNull String appName, @Nullable String proxyUrl, @Nullable String clientKey) {
            Intrinsics.echo(appName, "appName");
            return new Builder(appName, proxyUrl, clientKey);
        }

        @NotNull
        public final Builder delayedInitialization(boolean delayedInitialization) {
            this.delayedInitialization = delayedInitialization;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.appName, builder.appName) && Intrinsics.areEqual(this.proxyUrl, builder.proxyUrl) && Intrinsics.areEqual(this.clientKey, builder.clientKey);
        }

        @NotNull
        public final Builder forceImpressionData(boolean forceImpressionData) {
            this.forceImpressionData = forceImpressionData;
            return this;
        }

        @Nullable
        public final OkHttpClient getHttpClient() {
            return this.httpClient;
        }

        @NotNull
        public final LocalStorageConfig.Builder getLocalStorageConfig() {
            return this.localStorageConfig;
        }

        @NotNull
        public final DataStrategy.Builder getMetricsStrategy() {
            return this.metricsStrategy;
        }

        @NotNull
        public final DataStrategy.Builder getPollingStrategy() {
            return this.pollingStrategy;
        }

        public int hashCode() {
            int hashCode = this.appName.hashCode() * 31;
            String str = this.proxyUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clientKey;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final Builder httpClient(@NotNull OkHttpClient httpClient) {
            Intrinsics.echo(httpClient, "httpClient");
            this.httpClient = httpClient;
            return this;
        }

        @NotNull
        public final Builder proxyUrl(@NotNull String proxyUrl) {
            Intrinsics.echo(proxyUrl, "proxyUrl");
            this.proxyUrl = proxyUrl;
            return this;
        }

        public final void setHttpClient(@Nullable OkHttpClient okHttpClient) {
            this.httpClient = okHttpClient;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Builder(appName=");
            sb2.append(this.appName);
            sb2.append(", proxyUrl=");
            sb2.append(this.proxyUrl);
            sb2.append(", clientKey=");
            return P0.fuchsia(sb2, this.clientKey, ')');
        }

        public /* synthetic */ Builder(String str, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3);
        }
    }

    public /* synthetic */ UnleashConfig(String str, String str2, String str3, LocalStorageConfig localStorageConfig, DataStrategy dataStrategy, DataStrategy dataStrategy2, boolean z2, boolean z10, OkHttpClient okHttpClient, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? new LocalStorageConfig(false, null, 3, null) : localStorageConfig, (i4 & 16) != 0 ? new DataStrategy(false, 0L, 0L, true, 0L, 0L, 0L, 0L, null, HttpConstants.HTTP_UNAVAILABLE, null) : dataStrategy, (i4 & 32) != 0 ? new DataStrategy(false, 0L, 0L, true, 0L, 0L, 0L, 0L, null, HttpConstants.HTTP_UNAVAILABLE, null) : dataStrategy2, (i4 & 64) != 0 ? true : z2, (i4 & 128) != 0 ? false : z10, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : okHttpClient);
    }
}
