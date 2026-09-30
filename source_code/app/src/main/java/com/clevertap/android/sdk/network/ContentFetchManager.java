package com.clevertap.android.sdk.network;

import Nd.c;
import Nd.i;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.api.ContentFetchRequestBody;
import com.clevertap.android.sdk.network.api.CtApiWrapper;
import com.clevertap.android.sdk.network.http.Response;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.clevertap.android.sdk.response.ClevertapResponseHandler;
import com.clevertap.android.sdk.utils.Clock;
import com.clevertap.android.sdk.utils.CtDefaultDispatchers;
import com.clevertap.android.sdk.utils.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import s6.AbstractC2716m6;
import s6.AbstractC2832z6;
import vf.P;
import vf.a0;
import vf.ab;
import vf.ad;
import vf.r;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\n B*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/clevertap/android/sdk/network/ContentFetchManager;", "", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CoreMetaData;", "coreMetaData", "Lcom/clevertap/android/sdk/network/QueueHeaderBuilder;", "queueHeaderBuilder", "Lcom/clevertap/android/sdk/network/api/CtApiWrapper;", "ctApiWrapper", "", "parallelRequests", "Lcom/clevertap/android/sdk/utils/Clock;", "clock", "Lcom/clevertap/android/sdk/utils/DispatcherProvider;", "dispatchers", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/CoreMetaData;Lcom/clevertap/android/sdk/network/QueueHeaderBuilder;Lcom/clevertap/android/sdk/network/api/CtApiWrapper;ILcom/clevertap/android/sdk/utils/Clock;Lcom/clevertap/android/sdk/utils/DispatcherProvider;)V", "Lorg/json/JSONArray;", "contentFetchItems", "", "packageName", "getContentFetchPayload", "(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "getMetaData", "(Ljava/lang/String;)Lorg/json/JSONObject;", Constants.KEY_CONTENT, "", "sendContentFetchRequest", "(Lorg/json/JSONArray;LNd/c;)Ljava/lang/Object;", "Lcom/clevertap/android/sdk/network/http/Response;", "response", "isUserSwitching", "handleContentFetchResponse", "(Lcom/clevertap/android/sdk/network/http/Response;Z)Z", "", "resetScope", "()V", "handleContentFetch", "(Lorg/json/JSONArray;Ljava/lang/String;)V", "cancelAllResponseJobs", "Lcom/clevertap/android/sdk/CoreMetaData;", "Lcom/clevertap/android/sdk/network/QueueHeaderBuilder;", "Lcom/clevertap/android/sdk/network/api/CtApiWrapper;", "I", "Lcom/clevertap/android/sdk/utils/Clock;", "Lcom/clevertap/android/sdk/utils/DispatcherProvider;", "Lcom/clevertap/android/sdk/response/ClevertapResponseHandler;", "clevertapResponseHandler", "Lcom/clevertap/android/sdk/response/ClevertapResponseHandler;", "getClevertapResponseHandler", "()Lcom/clevertap/android/sdk/response/ClevertapResponseHandler;", "setClevertapResponseHandler", "(Lcom/clevertap/android/sdk/response/ClevertapResponseHandler;)V", "Lvf/r;", "parentJob", "Lvf/r;", "getParentJob", "()Lvf/r;", "setParentJob", "(Lvf/r;)V", "Lvf/ab;", "scope", "Lvf/ab;", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "logger", "Lcom/clevertap/android/sdk/Logger;", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentFetchManager {
    private static final int DEFAULT_PARALLEL_REQUESTS = 5;

    @NotNull
    private static final String TAG = "ContentFetch";

    @Nullable
    private ClevertapResponseHandler clevertapResponseHandler;

    @NotNull
    private final Clock clock;

    @NotNull
    private final CoreMetaData coreMetaData;

    @NotNull
    private final CtApiWrapper ctApiWrapper;

    @NotNull
    private final DispatcherProvider dispatchers;
    private final Logger logger;
    private final int parallelRequests;

    @NotNull
    private r parentJob;

    @NotNull
    private final QueueHeaderBuilder queueHeaderBuilder;

    @NotNull
    private ab scope;

    public ContentFetchManager(@NotNull CleverTapInstanceConfig config, @NotNull CoreMetaData coreMetaData, @NotNull QueueHeaderBuilder queueHeaderBuilder, @NotNull CtApiWrapper ctApiWrapper, int i4, @NotNull Clock clock, @NotNull DispatcherProvider dispatchers) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(coreMetaData, "coreMetaData");
        Intrinsics.echo(queueHeaderBuilder, "queueHeaderBuilder");
        Intrinsics.echo(ctApiWrapper, "ctApiWrapper");
        Intrinsics.echo(clock, "clock");
        Intrinsics.echo(dispatchers, "dispatchers");
        this.coreMetaData = coreMetaData;
        this.queueHeaderBuilder = queueHeaderBuilder;
        this.ctApiWrapper = ctApiWrapper;
        this.parallelRequests = i4;
        this.clock = clock;
        this.dispatchers = dispatchers;
        a0 foxtrot = ad.foxtrot();
        this.parentJob = foxtrot;
        this.scope = ad.charlie(AbstractC2832z6.charlie(foxtrot, dispatchers.io().jade(i4)));
        this.logger = config.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONArray getContentFetchPayload(JSONArray contentFetchItems, String packageName) {
        JSONArray jSONArray = new JSONArray();
        int length = contentFetchItems.length();
        for (int i4 = 0; i4 < length; i4++) {
            Object opt = contentFetchItems.opt(i4);
            if (opt != null) {
                try {
                    JSONObject metaData = getMetaData(packageName);
                    metaData.put(Constants.KEY_EVT_DATA, opt);
                    jSONArray.put(metaData);
                    this.logger.verbose(TAG, "Added content fetch item: " + opt);
                } catch (Exception e) {
                    this.logger.verbose(TAG, "Error adding content fetch item: " + opt, e);
                }
            }
        }
        return jSONArray;
    }

    private final JSONObject getMetaData(String packageName) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_TYPE, com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM);
        jSONObject.put(Constants.KEY_EVT_NAME, Constants.CONTENT_FETCH_JSON_RESPONSE_KEY);
        jSONObject.put("s", this.coreMetaData.getCurrentSessionId());
        jSONObject.put("pg", CoreMetaData.getActivityCount());
        jSONObject.put("ep", this.clock.currentTimeSecondsInt());
        jSONObject.put("f", this.coreMetaData.isFirstSession());
        jSONObject.put("lsl", this.coreMetaData.getLastSessionLength());
        jSONObject.put("pai", packageName);
        String screenName = this.coreMetaData.getScreenName();
        if (screenName != null) {
            jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, screenName);
        }
        return jSONObject;
    }

    private final boolean handleContentFetchResponse(Response response, boolean isUserSwitching) {
        ClevertapResponseHandler clevertapResponseHandler;
        if (response.isSuccess()) {
            String readBody = response.readBody();
            JSONObject jsonOrNull = CTXtensions.toJsonOrNull(readBody);
            this.logger.info(TAG, "Content fetch response received successfully with isUserSwitching = " + isUserSwitching);
            if (readBody != null && jsonOrNull != null && (clevertapResponseHandler = this.clevertapResponseHandler) != null) {
                clevertapResponseHandler.handleResponse(false, jsonOrNull, readBody, isUserSwitching);
            }
            return true;
        }
        if (response.getCode() == 429) {
            this.logger.info(TAG, "Content fetch request was rate limited (429). Consider reducing request frequency.");
        } else {
            this.logger.info(TAG, "Content fetch request failed with response code: " + response.getCode());
        }
        return false;
    }

    private final void resetScope() {
        a0 foxtrot = ad.foxtrot();
        this.parentJob = foxtrot;
        this.scope = ad.charlie(AbstractC2832z6.charlie(foxtrot, this.dispatchers.io().jade(this.parallelRequests)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendContentFetchRequest(JSONArray jSONArray, c<? super Boolean> cVar) {
        JSONObject buildHeader = this.queueHeaderBuilder.buildHeader(null);
        if (buildHeader == null) {
            return Boolean.FALSE;
        }
        ContentFetchRequestBody contentFetchRequestBody = new ContentFetchRequestBody(buildHeader, jSONArray);
        this.logger.debug(TAG, "Fetching Content: " + contentFetchRequestBody);
        try {
            Response sendContentFetch = this.ctApiWrapper.getCtApi().sendContentFetch(contentFetchRequestBody);
            try {
                Boolean valueOf = Boolean.valueOf(handleContentFetchResponse(sendContentFetch, !ad.whiskey(cVar.getContext())));
                AbstractC2716m6.alpha(sendContentFetch, null);
                return valueOf;
            } finally {
            }
        } catch (Exception e) {
            this.logger.debug(TAG, "An exception occurred while fetching content.", e);
            return Boolean.FALSE;
        }
    }

    public final void cancelAllResponseJobs() {
        this.logger.info(TAG, "Cancelling pending content fetch jobs");
        ((P) this.parentJob).foxtrot(null);
        ad.amber(i.alpha, new ContentFetchManager$cancelAllResponseJobs$1(this, null));
        ad.kilo(this.scope, null);
        resetScope();
    }

    @Nullable
    public final ClevertapResponseHandler getClevertapResponseHandler() {
        return this.clevertapResponseHandler;
    }

    @NotNull
    public final r getParentJob() {
        return this.parentJob;
    }

    public final void handleContentFetch(@NotNull JSONArray contentFetchItems, @NotNull String packageName) {
        Intrinsics.echo(contentFetchItems, "contentFetchItems");
        Intrinsics.echo(packageName, "packageName");
        ad.zulu(this.scope, null, null, new ContentFetchManager$handleContentFetch$1(this, contentFetchItems, packageName, null), 3);
    }

    public final void setClevertapResponseHandler(@Nullable ClevertapResponseHandler clevertapResponseHandler) {
        this.clevertapResponseHandler = clevertapResponseHandler;
    }

    public final void setParentJob(@NotNull r rVar) {
        Intrinsics.echo(rVar, "<set-?>");
        this.parentJob = rVar;
    }

    public /* synthetic */ ContentFetchManager(CleverTapInstanceConfig cleverTapInstanceConfig, CoreMetaData coreMetaData, QueueHeaderBuilder queueHeaderBuilder, CtApiWrapper ctApiWrapper, int i4, Clock clock, DispatcherProvider dispatcherProvider, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, coreMetaData, queueHeaderBuilder, ctApiWrapper, (i5 & 16) != 0 ? 5 : i4, (i5 & 32) != 0 ? Clock.SYSTEM : clock, (i5 & 64) != 0 ? new CtDefaultDispatchers() : dispatcherProvider);
    }
}
