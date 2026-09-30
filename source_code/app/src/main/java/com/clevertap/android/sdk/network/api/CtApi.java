package com.clevertap.android.sdk.network.api;

import android.net.Uri;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.http.CtHttpClient;
import com.clevertap.android.sdk.network.http.Request;
import com.clevertap.android.sdk.network.http.Response;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JB{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u000202J\u000e\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005J\u000e\u00104\u001a\u00020/2\u0006\u00100\u001a\u000205J\u000e\u00106\u001a\u00020/2\u0006\u00107\u001a\u000202J\u000e\u00108\u001a\u00020/2\u0006\u00100\u001a\u000209J\u000e\u0010:\u001a\u00020/2\u0006\u00100\u001a\u00020;J\u0010\u0010<\u001a\u0004\u0018\u00010\u00052\u0006\u00107\u001a\u000202J\u000e\u0010=\u001a\u00020\u00052\u0006\u00107\u001a\u000202J\u000e\u0010>\u001a\u0002022\u0006\u00107\u001a\u000202JB\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010C\u001a\u0002022\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$H\u0002J \u0010E\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u000202H\u0002J\f\u0010G\u001a\u00020H*\u00020HH\u0002J\f\u0010I\u001a\u00020H*\u00020HH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006K"}, d2 = {"Lcom/clevertap/android/sdk/network/api/CtApi;", "", "httpClient", "Lcom/clevertap/android/sdk/network/http/CtHttpClient;", "defaultDomain", "", "cachedDomain", "cachedSpikyDomain", "region", "proxyDomain", "spikyProxyDomain", "customHandshakeDomain", "accountId", "accountToken", "sdkVersion", "logger", "Lcom/clevertap/android/sdk/Logger;", "logTag", "<init>", "(Lcom/clevertap/android/sdk/network/http/CtHttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/clevertap/android/sdk/Logger;Ljava/lang/String;)V", "getDefaultDomain", "()Ljava/lang/String;", "getCachedDomain", "setCachedDomain", "(Ljava/lang/String;)V", "getCachedSpikyDomain", "setCachedSpikyDomain", "getRegion", "setRegion", "getProxyDomain", "setProxyDomain", "getSpikyProxyDomain", "setSpikyProxyDomain", "getCustomHandshakeDomain", "setCustomHandshakeDomain", "defaultHeaders", "", "defaultQueryParams", "encryptionHeader", "Lkotlin/Pair;", "spikyRegionSuffix", "value", "", "currentRequestTimestampSeconds", "getCurrentRequestTimestampSeconds", "()I", "sendQueue", "Lcom/clevertap/android/sdk/network/http/Response;", "body", "isEncrypted", "", "sendImpressions", "sendContentFetch", "Lcom/clevertap/android/sdk/network/api/ContentFetchRequestBody;", "performHandshakeForDomain", "isViewedEvent", "defineVars", "Lcom/clevertap/android/sdk/network/api/SendQueueRequestBody;", "defineTemplates", "Lcom/clevertap/android/sdk/network/api/DefineTemplatesRequestBody;", "getActualDomain", "getHandshakeDomain", "needsHandshake", "createRequest", "Lcom/clevertap/android/sdk/network/http/Request;", "baseUrl", "relativeUrl", "includeTs", "headers", "getUriForPath", "Landroid/net/Uri;", "appendDefaultQueryParams", "Landroid/net/Uri$Builder;", "appendTsQueryParam", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CtApi {

    @NotNull
    public static final String DEFAULT_CONTENT_TYPE = "application/json; charset=utf-8";

    @NotNull
    public static final String DEFAULT_QUERY_PARAM_OS = "Android";

    @NotNull
    public static final String HEADER_ACCOUNT_ID = "X-CleverTap-Account-ID";

    @NotNull
    public static final String HEADER_ACCOUNT_TOKEN = "X-CleverTap-Token";

    @NotNull
    public static final String HEADER_CONTENT_TYPE = "Content-Type";

    @NotNull
    public static final String HEADER_CUSTOM_HANDSHAKE = "X-CleverTap-Handshake-Domain";

    @NotNull
    public static final String HEADER_DOMAIN_NAME = "X-WZRK-RD";

    @NotNull
    public static final String HEADER_ENCRYPTION_ENABLED = "X-CleverTap-Encryption-Enabled";

    @NotNull
    public static final String HEADER_MUTE = "X-WZRK-MUTE";

    @NotNull
    public static final String QUERY_PARAM_OS_KEY = "os";

    @NotNull
    public static final String QUERY_PARAM_T_KEY = "t";

    @NotNull
    public static final String QUERY_PARAM_Z_KEY = "z";

    @NotNull
    public static final String SPIKY_HEADER_DOMAIN_NAME = "X-WZRK-SPIKY-RD";

    @Nullable
    private String cachedDomain;

    @Nullable
    private String cachedSpikyDomain;
    private int currentRequestTimestampSeconds;

    @Nullable
    private String customHandshakeDomain;

    @NotNull
    private final String defaultDomain;

    @NotNull
    private final Map<String, String> defaultHeaders;

    @NotNull
    private final Map<String, String> defaultQueryParams;

    @NotNull
    private final Pair<String, String> encryptionHeader;

    @NotNull
    private final CtHttpClient httpClient;

    @NotNull
    private final String logTag;

    @NotNull
    private final Logger logger;

    @Nullable
    private String proxyDomain;

    @Nullable
    private String region;

    @Nullable
    private String spikyProxyDomain;

    @NotNull
    private final String spikyRegionSuffix;

    public CtApi(@NotNull CtHttpClient httpClient, @NotNull String defaultDomain, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String accountId, @NotNull String accountToken, @NotNull String sdkVersion, @NotNull Logger logger, @NotNull String logTag) {
        Intrinsics.echo(httpClient, "httpClient");
        Intrinsics.echo(defaultDomain, "defaultDomain");
        Intrinsics.echo(accountId, "accountId");
        Intrinsics.echo(accountToken, "accountToken");
        Intrinsics.echo(sdkVersion, "sdkVersion");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logTag, "logTag");
        this.httpClient = httpClient;
        this.defaultDomain = defaultDomain;
        this.cachedDomain = str;
        this.cachedSpikyDomain = str2;
        this.region = str3;
        this.proxyDomain = str4;
        this.spikyProxyDomain = str5;
        this.customHandshakeDomain = str6;
        this.logger = logger;
        this.logTag = logTag;
        this.defaultHeaders = y.sierra(new Pair(HEADER_CONTENT_TYPE, DEFAULT_CONTENT_TYPE), new Pair(HEADER_ACCOUNT_ID, accountId), new Pair(HEADER_ACCOUNT_TOKEN, accountToken));
        this.defaultQueryParams = y.sierra(new Pair(QUERY_PARAM_OS_KEY, DEFAULT_QUERY_PARAM_OS), new Pair("t", sdkVersion), new Pair(QUERY_PARAM_Z_KEY, accountId));
        this.encryptionHeader = new Pair<>(HEADER_ENCRYPTION_ENABLED, "true");
        this.spikyRegionSuffix = "-spiky";
    }

    private final Uri.Builder appendDefaultQueryParams(Uri.Builder builder) {
        for (Map.Entry<String, String> entry : this.defaultQueryParams.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builder;
    }

    private final Uri.Builder appendTsQueryParam(Uri.Builder builder) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.currentRequestTimestampSeconds = currentTimeMillis;
        Uri.Builder appendQueryParameter = builder.appendQueryParameter(CTProductConfigConstants.KEY_LAST_FETCHED_TIMESTAMP, String.valueOf(currentTimeMillis));
        Intrinsics.delta(appendQueryParameter, "appendQueryParameter(...)");
        return appendQueryParameter;
    }

    private final Request createRequest(String baseUrl, String relativeUrl, String body, boolean includeTs, Map<String, String> headers) {
        return new Request(getUriForPath(baseUrl, relativeUrl, includeTs), headers, body);
    }

    public static /* synthetic */ Request createRequest$default(CtApi ctApi, String str, String str2, String str3, boolean z2, Map map, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z2 = true;
        }
        boolean z10 = z2;
        if ((i4 & 16) != 0) {
            map = ctApi.defaultHeaders;
        }
        return ctApi.createRequest(str, str2, str3, z10, map);
    }

    private final Uri getUriForPath(String baseUrl, String relativeUrl, boolean includeTs) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority(baseUrl).appendPath(relativeUrl);
        Intrinsics.delta(appendPath, "appendPath(...)");
        Uri.Builder appendDefaultQueryParams = appendDefaultQueryParams(appendPath);
        if (includeTs) {
            appendTsQueryParam(appendDefaultQueryParams);
        }
        Uri build = appendDefaultQueryParams.build();
        Intrinsics.delta(build, "build(...)");
        return build;
    }

    public static /* synthetic */ Response sendQueue$default(CtApi ctApi, String str, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z2 = false;
        }
        return ctApi.sendQueue(str, z2);
    }

    @NotNull
    public final Response defineTemplates(@NotNull DefineTemplatesRequestBody body) {
        Intrinsics.echo(body, "body");
        CtHttpClient ctHttpClient = this.httpClient;
        String actualDomain = getActualDomain(false);
        if (actualDomain == null) {
            actualDomain = this.defaultDomain;
        }
        return ctHttpClient.execute(createRequest$default(this, actualDomain, "defineTemplates", body.toString(), false, null, 24, null));
    }

    @NotNull
    public final Response defineVars(@NotNull SendQueueRequestBody body) {
        Intrinsics.echo(body, "body");
        CtHttpClient ctHttpClient = this.httpClient;
        String actualDomain = getActualDomain(false);
        if (actualDomain == null) {
            actualDomain = this.defaultDomain;
        }
        return ctHttpClient.execute(createRequest$default(this, actualDomain, "defineVars", body.toString(), false, null, 24, null));
    }

    @Nullable
    public final String getActualDomain(boolean isViewedEvent) {
        String str;
        String str2;
        if (CTXtensions.isNotNullAndBlank(this.region)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.region);
            if (isViewedEvent) {
                str2 = this.spikyRegionSuffix;
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(".");
            sb2.append(this.defaultDomain);
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "toString(...)");
            return sb3;
        }
        if (isViewedEvent) {
            str = this.spikyProxyDomain;
        } else {
            str = this.proxyDomain;
        }
        if (CTXtensions.isNotNullAndBlank(str)) {
            return str;
        }
        if (isViewedEvent) {
            return this.cachedSpikyDomain;
        }
        return this.cachedDomain;
    }

    @Nullable
    public final String getCachedDomain() {
        return this.cachedDomain;
    }

    @Nullable
    public final String getCachedSpikyDomain() {
        return this.cachedSpikyDomain;
    }

    public final int getCurrentRequestTimestampSeconds() {
        return this.currentRequestTimestampSeconds;
    }

    @Nullable
    public final String getCustomHandshakeDomain() {
        return this.customHandshakeDomain;
    }

    @NotNull
    public final String getDefaultDomain() {
        return this.defaultDomain;
    }

    @NotNull
    public final String getHandshakeDomain(boolean isViewedEvent) {
        String str;
        String str2;
        String str3;
        if (CTXtensions.isNotNullAndBlank(this.region)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.region);
            if (isViewedEvent) {
                str3 = this.spikyRegionSuffix;
            } else {
                str3 = "";
            }
            sb2.append(str3);
            sb2.append(".");
            sb2.append(this.defaultDomain);
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "toString(...)");
            return sb3;
        }
        if (isViewedEvent) {
            str = this.spikyProxyDomain;
        } else {
            str = this.proxyDomain;
        }
        if (CTXtensions.isNotNullAndBlank(str)) {
            return str;
        }
        if (CTXtensions.isNotNullAndBlank(this.customHandshakeDomain)) {
            String str4 = this.customHandshakeDomain;
            Intrinsics.checkNotNull(str4);
            return str4;
        }
        if (isViewedEvent) {
            str2 = this.cachedSpikyDomain;
        } else {
            str2 = this.cachedDomain;
        }
        if (CTXtensions.isNotNullAndBlank(str2)) {
            return str2;
        }
        return this.defaultDomain;
    }

    @Nullable
    public final String getProxyDomain() {
        return this.proxyDomain;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getSpikyProxyDomain() {
        return this.spikyProxyDomain;
    }

    public final boolean needsHandshake(boolean isViewedEvent) {
        String str;
        String str2;
        if (CTXtensions.isNotNullAndBlank(this.region)) {
            return false;
        }
        if (isViewedEvent) {
            str = this.spikyProxyDomain;
        } else {
            str = this.proxyDomain;
        }
        if (CTXtensions.isNotNullAndBlank(str)) {
            return false;
        }
        if (isViewedEvent) {
            str2 = this.cachedSpikyDomain;
        } else {
            str2 = this.cachedDomain;
        }
        if (str2 != null && !StringsKt.gray(str2)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final Response performHandshakeForDomain(boolean isViewedEvent) {
        Map<String, String> map;
        String handshakeDomain = getHandshakeDomain(isViewedEvent);
        if (CTXtensions.isNotNullAndBlank(this.customHandshakeDomain) && Intrinsics.areEqual(handshakeDomain, this.customHandshakeDomain)) {
            Map<String, String> map2 = this.defaultHeaders;
            String str = this.customHandshakeDomain;
            Intrinsics.checkNotNull(str);
            map = y.victor(map2, new Pair(HEADER_CUSTOM_HANDSHAKE, str));
        } else {
            map = this.defaultHeaders;
        }
        Request createRequest = createRequest(handshakeDomain, "hello", null, false, map);
        this.logger.verbose(this.logTag, "Performing handshake with " + createRequest.getUrl());
        return this.httpClient.execute(createRequest);
    }

    @NotNull
    public final Response sendContentFetch(@NotNull ContentFetchRequestBody body) {
        Intrinsics.echo(body, "body");
        CtHttpClient ctHttpClient = this.httpClient;
        String actualDomain = getActualDomain(false);
        if (actualDomain == null) {
            actualDomain = this.defaultDomain;
        }
        return ctHttpClient.execute(createRequest$default(this, actualDomain, Constants.KEY_CONTENT, body.toString(), false, null, 24, null));
    }

    @NotNull
    public final Response sendImpressions(@NotNull String body) {
        Intrinsics.echo(body, "body");
        CtHttpClient ctHttpClient = this.httpClient;
        String actualDomain = getActualDomain(true);
        if (actualDomain == null) {
            actualDomain = this.defaultDomain;
        }
        return ctHttpClient.execute(createRequest$default(this, actualDomain, "a1", body, false, this.defaultHeaders, 8, null));
    }

    @NotNull
    public final Response sendQueue(@NotNull String body, boolean isEncrypted) {
        Map<String, String> map;
        Intrinsics.echo(body, "body");
        CtHttpClient ctHttpClient = this.httpClient;
        String actualDomain = getActualDomain(false);
        if (actualDomain == null) {
            actualDomain = this.defaultDomain;
        }
        String str = actualDomain;
        if (isEncrypted) {
            map = y.victor(this.defaultHeaders, this.encryptionHeader);
        } else {
            map = this.defaultHeaders;
        }
        return ctHttpClient.execute(createRequest$default(this, str, "a1", body, false, map, 8, null));
    }

    public final void setCachedDomain(@Nullable String str) {
        this.cachedDomain = str;
    }

    public final void setCachedSpikyDomain(@Nullable String str) {
        this.cachedSpikyDomain = str;
    }

    public final void setCustomHandshakeDomain(@Nullable String str) {
        this.customHandshakeDomain = str;
    }

    public final void setProxyDomain(@Nullable String str) {
        this.proxyDomain = str;
    }

    public final void setRegion(@Nullable String str) {
        this.region = str;
    }

    public final void setSpikyProxyDomain(@Nullable String str) {
        this.spikyProxyDomain = str;
    }
}
