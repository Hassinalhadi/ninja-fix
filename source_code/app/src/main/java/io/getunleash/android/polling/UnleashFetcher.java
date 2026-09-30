package io.getunleash.android.polling;

import Cf.d;
import Cf.e;
import Nd.c;
import Nd.h;
import Od.a;
import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.getunleash.android.DefaultUnleashKt;
import io.getunleash.android.UnleashConfig;
import io.getunleash.android.data.Parser;
import io.getunleash.android.data.Toggle;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.UnleashState;
import io.getunleash.android.errors.NotAuthorizedException;
import io.getunleash.android.errors.ServerException;
import io.getunleash.android.events.HeartbeatEvent;
import io.getunleash.android.http.Throttler;
import io.getunleash.android.util.UnleashLogger;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2716m6;
import s6.J6;
import vf.C3207k;
import vf.InterfaceC3206j;
import vf.ad;
import vf.ao;
import xf.EnumC3340a;
import yf.AbstractC3428A;
import yf.L;
import yf.as;
import yf.au;
import yf.aw;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 A2\u00020\u0001:\u0001AB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b!\u0010\u000eJ\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0018¢\u0006\u0004\b&\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0019048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020%048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lio/getunleash/android/polling/UnleashFetcher;", "Ljava/io/Closeable;", "Lio/getunleash/android/UnleashConfig;", "unleashConfig", "Lokhttp3/OkHttpClient;", "httpClient", "Lyf/L;", "Lio/getunleash/android/data/UnleashContext;", "unleashContext", "<init>", "(Lio/getunleash/android/UnleashConfig;Lokhttp3/OkHttpClient;Lyf/L;)V", "ctx", "Lio/getunleash/android/polling/ToggleResponse;", "refreshTogglesWithContext", "(Lio/getunleash/android/data/UnleashContext;LNd/c;)Ljava/lang/Object;", "Lio/getunleash/android/polling/FetchResponse;", "fetchToggles", "Lokhttp3/Call;", "Lokhttp3/Response;", "await", "(Lokhttp3/Call;LNd/c;)Ljava/lang/Object;", "Lokhttp3/HttpUrl;", "buildContextUrl", "(Lio/getunleash/android/data/UnleashContext;)Lokhttp3/HttpUrl;", "Lyf/aw;", "Lio/getunleash/android/data/UnleashState;", "getFeaturesReceivedFlow", "()Lyf/aw;", "", "startWatchingContext", "()V", "refreshToggles", "(LNd/c;)Ljava/lang/Object;", "refreshTogglesIfContextChanged", "doFetchToggles$unleashandroidsdk_release", "doFetchToggles", Constants.KEY_HIDE_CLOSE, "Lio/getunleash/android/events/HeartbeatEvent;", "getHeartbeatFlow", "Lokhttp3/OkHttpClient;", "Lyf/L;", "contextForLastFetch", "Lio/getunleash/android/data/UnleashContext;", "proxyUrl", "Lokhttp3/HttpUrl;", "", "", "applicationHeaders", "Ljava/util/Map;", "appName", "Ljava/lang/String;", "etag", "Lyf/as;", "featuresReceivedFlow", "Lyf/as;", "fetcherHeartbeatFlow", "LNd/h;", "coroutineContextForContextChange", "LNd/h;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentCall", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/getunleash/android/http/Throttler;", "throttler", "Lio/getunleash/android/http/Throttler;", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class UnleashFetcher implements Closeable, AutoCloseable {

    @NotNull
    private static final String TAG = "UnleashFetcher";

    @NotNull
    private final String appName;

    @NotNull
    private final Map<String, String> applicationHeaders;

    @Nullable
    private volatile UnleashContext contextForLastFetch;

    @NotNull
    private final h coroutineContextForContextChange;

    @NotNull
    private final AtomicReference<Call> currentCall;

    @Nullable
    private String etag;

    @NotNull
    private final as featuresReceivedFlow;

    @NotNull
    private final as fetcherHeartbeatFlow;

    @NotNull
    private final OkHttpClient httpClient;

    @Nullable
    private final HttpUrl proxyUrl;

    @NotNull
    private final Throttler throttler;

    @NotNull
    private final L unleashContext;

    public UnleashFetcher(@NotNull UnleashConfig unleashConfig, @NotNull OkHttpClient httpClient, @NotNull L unleashContext) {
        HttpUrl httpUrl;
        Intrinsics.echo(unleashConfig, "unleashConfig");
        Intrinsics.echo(httpClient, "httpClient");
        Intrinsics.echo(unleashContext, "unleashContext");
        this.httpClient = httpClient;
        this.unleashContext = unleashContext;
        String proxyUrl = unleashConfig.getProxyUrl();
        if (proxyUrl != null) {
            httpUrl = HttpUrl.INSTANCE.get(proxyUrl);
        } else {
            httpUrl = null;
        }
        this.proxyUrl = httpUrl;
        this.applicationHeaders = unleashConfig.getApplicationHeaders(unleashConfig.getPollingStrategy());
        this.appName = unleashConfig.getAppName();
        EnumC3340a enumC3340a = EnumC3340a.purple;
        this.featuresReceivedFlow = AbstractC3428A.bravo(1, 0, enumC3340a, 2);
        this.fetcherHeartbeatFlow = AbstractC3428A.bravo(0, 5, enumC3340a, 1);
        e eVar = ao.alpha;
        this.coroutineContextForContextChange = d.purple;
        this.currentCall = new AtomicReference<>(null);
        this.throttler = new Throttler(TimeUnit.MILLISECONDS.toSeconds(unleashConfig.getPollingStrategy().getInterval()), 300L, String.valueOf(httpUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object await(final Call call, c<? super Response> cVar) {
        final C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        FirebasePerfOkHttpClient.enqueue(call, new Callback() { // from class: io.getunleash.android.polling.UnleashFetcher$await$2$1
            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException e) {
                Intrinsics.echo(call2, "call");
                Intrinsics.echo(e, "e");
                if (InterfaceC3206j.this.isCancelled()) {
                    return;
                }
                InterfaceC3206j interfaceC3206j = InterfaceC3206j.this;
                Result.Companion companion = Result.INSTANCE;
                interfaceC3206j.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(e)));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) {
                Intrinsics.echo(call2, "call");
                Intrinsics.echo(response, "response");
                InterfaceC3206j.this.resumeWith(Result.m206constructorimpl(response));
            }
        });
        c3207k.victor(new Function1<Throwable, Unit>() { // from class: io.getunleash.android.polling.UnleashFetcher$await$2$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                try {
                    Call.this.cancel();
                } catch (Throwable unused) {
                }
            }
        });
        Object sierra = c3207k.sierra();
        a aVar = a.alpha;
        return sierra;
    }

    private final HttpUrl buildContextUrl(UnleashContext ctx) {
        HttpUrl httpUrl = this.proxyUrl;
        Intrinsics.checkNotNull(httpUrl);
        HttpUrl.Builder addQueryParameter = httpUrl.newBuilder().addQueryParameter("appName", this.appName);
        if (ctx.getUserId() != null) {
            addQueryParameter.addQueryParameter("userId", ctx.getUserId());
        }
        if (ctx.getRemoteAddress() != null) {
            addQueryParameter.addQueryParameter("remoteAddress", ctx.getRemoteAddress());
        }
        if (ctx.getSessionId() != null) {
            addQueryParameter.addQueryParameter("sessionId", ctx.getSessionId());
        }
        Iterator<T> it = ctx.getProperties().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            addQueryParameter = addQueryParameter.addQueryParameter(P0.fuchsia(new StringBuilder("properties["), (String) entry.getKey(), ']'), (String) entry.getValue());
        }
        return addQueryParameter.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0189 A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #3 {all -> 0x01c8, blocks: (B:14:0x0153, B:16:0x0189, B:19:0x01c4, B:31:0x01cd, B:32:0x01d0, B:36:0x01d1, B:38:0x01d9, B:39:0x01e5, B:41:0x01ed, B:42:0x01fd, B:18:0x0196, B:35:0x01ba, B:28:0x01cb), top: B:13:0x0153, outer: #5, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1 A[Catch: all -> 0x01c8, TryCatch #3 {all -> 0x01c8, blocks: (B:14:0x0153, B:16:0x0189, B:19:0x01c4, B:31:0x01cd, B:32:0x01d0, B:36:0x01d1, B:38:0x01d9, B:39:0x01e5, B:41:0x01ed, B:42:0x01fd, B:18:0x0196, B:35:0x01ba, B:28:0x01cb), top: B:13:0x0153, outer: #5, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchToggles(UnleashContext unleashContext, c<? super FetchResponse> cVar) {
        UnleashFetcher$fetchToggles$1 unleashFetcher$fetchToggles$1;
        int i4;
        HttpUrl buildContextUrl;
        boolean z2;
        Request request;
        Response response;
        FetchResponse fetchResponse;
        try {
            try {
                if (cVar instanceof UnleashFetcher$fetchToggles$1) {
                    unleashFetcher$fetchToggles$1 = (UnleashFetcher$fetchToggles$1) cVar;
                    int i5 = unleashFetcher$fetchToggles$1.label;
                    if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        unleashFetcher$fetchToggles$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                        Object obj = unleashFetcher$fetchToggles$1.result;
                        Object obj2 = a.alpha;
                        i4 = unleashFetcher$fetchToggles$1.label;
                        HttpUrl httpUrl = null;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                buildContextUrl = (HttpUrl) unleashFetcher$fetchToggles$1.L$1;
                                ResultKt.alpha(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj);
                            if (this.proxyUrl == null) {
                                return new FetchResponse(Status.FAILED, null, new IllegalStateException("Proxy URL is not set"), 2, null);
                            }
                            buildContextUrl = buildContextUrl(unleashContext);
                            Request.Builder headers = new Request.Builder().url(buildContextUrl).headers(Headers.INSTANCE.of(this.applicationHeaders));
                            String str = this.etag;
                            if (str != null) {
                                Intrinsics.checkNotNull(str);
                                headers.header("If-None-Match", str);
                            }
                            Call newCall = this.httpClient.newCall(headers.build());
                            Call call = this.currentCall.get();
                            AtomicReference<Call> atomicReference = this.currentCall;
                            while (true) {
                                if (atomicReference.compareAndSet(call, newCall)) {
                                    z2 = true;
                                    break;
                                }
                                if (atomicReference.get() != call) {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (!z2) {
                                Status status = Status.FAILED;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Failed to set new call while ");
                                if (call != null && (request = call.request()) != null) {
                                    httpUrl = request.url();
                                }
                                sb2.append(httpUrl);
                                sb2.append(" is in flight");
                                return new FetchResponse(status, null, new IllegalStateException(sb2.toString()), 2, null);
                            }
                            if (call != null && !call.getCanceled() && !call.isExecuted()) {
                                UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Cancelling previous " + call.request().method() + ' ' + call.request().url(), null, 4, null);
                                call.cancel();
                            }
                            UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Fetching toggles from " + buildContextUrl, null, 4, null);
                            unleashFetcher$fetchToggles$1.L$0 = null;
                            unleashFetcher$fetchToggles$1.L$1 = buildContextUrl;
                            unleashFetcher$fetchToggles$1.L$2 = null;
                            unleashFetcher$fetchToggles$1.L$3 = null;
                            unleashFetcher$fetchToggles$1.L$4 = null;
                            unleashFetcher$fetchToggles$1.label = 1;
                            obj = await(newCall, unleashFetcher$fetchToggles$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                        }
                        response = (Response) obj;
                        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Received status code " + response.code() + " from " + buildContextUrl, null, 4, null);
                        this.throttler.handle(response.code());
                        if (!response.getIsSuccessful()) {
                            this.etag = Response.header$default(response, "ETag", null, 2, null);
                            ResponseBody body = response.body();
                            try {
                                try {
                                    ProxyResponse fromJson = Parser.INSTANCE.getProxyResponseAdapter().fromJson(body.string());
                                    Intrinsics.checkNotNull(fromJson);
                                    fetchResponse = new FetchResponse(Status.SUCCESS, fromJson, null, 4, null);
                                } catch (Exception e) {
                                    fetchResponse = new FetchResponse(Status.FAILED, null, e, 2, null);
                                }
                                AbstractC2716m6.alpha(body, null);
                            } finally {
                            }
                        } else if (response.code() == 304) {
                            fetchResponse = new FetchResponse(Status.NOT_MODIFIED, null, null, 6, null);
                        } else if (response.code() == 401) {
                            fetchResponse = new FetchResponse(Status.FAILED, null, new NotAuthorizedException(), 2, null);
                        } else {
                            fetchResponse = new FetchResponse(Status.FAILED, null, new ServerException(response.code()), 2, null);
                        }
                        AbstractC2716m6.alpha(response, null);
                        return fetchResponse;
                    }
                }
                UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Received status code " + response.code() + " from " + buildContextUrl, null, 4, null);
                this.throttler.handle(response.code());
                if (!response.getIsSuccessful()) {
                }
                AbstractC2716m6.alpha(response, null);
                return fetchResponse;
            } finally {
            }
            if (i4 == 0) {
            }
            response = (Response) obj;
        } catch (IOException e4) {
            return new FetchResponse(Status.FAILED, null, e4, 2, null);
        }
        unleashFetcher$fetchToggles$1 = new UnleashFetcher$fetchToggles$1(this, cVar);
        Object obj3 = unleashFetcher$fetchToggles$1.result;
        Object obj22 = a.alpha;
        i4 = unleashFetcher$fetchToggles$1.label;
        HttpUrl httpUrl2 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r14.emit(r15, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r15 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshTogglesWithContext(UnleashContext unleashContext, c<? super ToggleResponse> cVar) {
        UnleashFetcher$refreshTogglesWithContext$1 unleashFetcher$refreshTogglesWithContext$1;
        int i4;
        ToggleResponse toggleResponse;
        String str;
        if (cVar instanceof UnleashFetcher$refreshTogglesWithContext$1) {
            unleashFetcher$refreshTogglesWithContext$1 = (UnleashFetcher$refreshTogglesWithContext$1) cVar;
            int i5 = unleashFetcher$refreshTogglesWithContext$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                unleashFetcher$refreshTogglesWithContext$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = unleashFetcher$refreshTogglesWithContext$1.result;
                a aVar = a.alpha;
                i4 = unleashFetcher$refreshTogglesWithContext$1.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                ResultKt.alpha(obj);
                                return new ToggleResponse(Status.THROTTLED, null, null, 6, null);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ToggleResponse toggleResponse2 = (ToggleResponse) unleashFetcher$refreshTogglesWithContext$1.L$1;
                        ResultKt.alpha(obj);
                        return toggleResponse2;
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    Throttler throttler = this.throttler;
                    UnleashFetcher$refreshTogglesWithContext$response$1 unleashFetcher$refreshTogglesWithContext$response$1 = new UnleashFetcher$refreshTogglesWithContext$response$1(this, unleashContext, null);
                    unleashFetcher$refreshTogglesWithContext$1.L$0 = null;
                    unleashFetcher$refreshTogglesWithContext$1.label = 1;
                    obj = throttler.runIfAllowed(unleashFetcher$refreshTogglesWithContext$response$1, unleashFetcher$refreshTogglesWithContext$1);
                }
                toggleResponse = (ToggleResponse) obj;
                if (toggleResponse == null) {
                    as asVar = this.fetcherHeartbeatFlow;
                    Status status = toggleResponse.getStatus();
                    Exception error = toggleResponse.getError();
                    if (error != null) {
                        str = error.getMessage();
                    } else {
                        str = null;
                    }
                    HeartbeatEvent heartbeatEvent = new HeartbeatEvent(status, str);
                    unleashFetcher$refreshTogglesWithContext$1.L$0 = null;
                    unleashFetcher$refreshTogglesWithContext$1.L$1 = toggleResponse;
                    unleashFetcher$refreshTogglesWithContext$1.label = 2;
                    if (asVar.emit(heartbeatEvent, unleashFetcher$refreshTogglesWithContext$1) != aVar) {
                        return toggleResponse;
                    }
                } else {
                    UnleashLogger.i$default(UnleashLogger.INSTANCE, TAG, "Skipping refresh toggles due to throttling", null, 4, null);
                    as asVar2 = this.fetcherHeartbeatFlow;
                    HeartbeatEvent heartbeatEvent2 = new HeartbeatEvent(Status.THROTTLED, null, 2, null);
                    unleashFetcher$refreshTogglesWithContext$1.L$0 = null;
                    unleashFetcher$refreshTogglesWithContext$1.L$1 = null;
                    unleashFetcher$refreshTogglesWithContext$1.label = 3;
                }
                return aVar;
            }
        }
        unleashFetcher$refreshTogglesWithContext$1 = new UnleashFetcher$refreshTogglesWithContext$1(this, cVar);
        Object obj2 = unleashFetcher$refreshTogglesWithContext$1.result;
        a aVar2 = a.alpha;
        i4 = unleashFetcher$refreshTogglesWithContext$1.label;
        if (i4 == 0) {
        }
        toggleResponse = (ToggleResponse) obj2;
        if (toggleResponse == null) {
        }
        return aVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.httpClient.dispatcher().executorService().shutdownNow();
        this.httpClient.connectionPool().evictAll();
        Cache cache = this.httpClient.cache();
        if (cache != null) {
            _UtilCommonKt.closeQuietly(cache);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x005b, code lost:
    
        if (r2 == r4) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r17v0, types: [io.getunleash.android.polling.UnleashFetcher] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doFetchToggles$unleashandroidsdk_release(@NotNull UnleashContext unleashContext, @NotNull c<? super ToggleResponse> cVar) {
        UnleashFetcher$doFetchToggles$1 unleashFetcher$doFetchToggles$1;
        int i4;
        FetchResponse fetchResponse;
        FetchResponse fetchResponse2;
        LinkedHashMap linkedHashMap;
        UnleashContext unleashContext2 = unleashContext;
        if (cVar instanceof UnleashFetcher$doFetchToggles$1) {
            unleashFetcher$doFetchToggles$1 = (UnleashFetcher$doFetchToggles$1) cVar;
            int i5 = unleashFetcher$doFetchToggles$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                unleashFetcher$doFetchToggles$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = unleashFetcher$doFetchToggles$1.result;
                a aVar = a.alpha;
                i4 = unleashFetcher$doFetchToggles$1.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ?? r12 = (Map) unleashFetcher$doFetchToggles$1.L$2;
                            fetchResponse2 = (FetchResponse) unleashFetcher$doFetchToggles$1.L$1;
                            ResultKt.alpha(obj);
                            linkedHashMap = r12;
                            return new ToggleResponse(fetchResponse2.getStatus(), linkedHashMap, null, 4, null);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    unleashContext2 = (UnleashContext) unleashFetcher$doFetchToggles$1.L$0;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    this.contextForLastFetch = unleashContext2;
                    unleashFetcher$doFetchToggles$1.L$0 = unleashContext2;
                    unleashFetcher$doFetchToggles$1.label = 1;
                    obj = fetchToggles(unleashContext2, unleashFetcher$doFetchToggles$1);
                }
                fetchResponse = (FetchResponse) obj;
                String str = null;
                if (!fetchResponse.isSuccess()) {
                    ProxyResponse config = fetchResponse.getConfig();
                    Intrinsics.checkNotNull(config);
                    List<Toggle> toggles = config.getToggles();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj2 : toggles) {
                        String name = ((Toggle) obj2).getName();
                        Object obj3 = linkedHashMap2.get(name);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap2.put(name, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(y.quebec(linkedHashMap2.size()));
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        linkedHashMap3.put(entry.getKey(), (Toggle) CollectionsKt.gold((List) entry.getValue()));
                    }
                    UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Fetched new state with " + linkedHashMap3.size() + " toggles, emitting featuresReceivedFlow", null, 4, null);
                    as asVar = this.featuresReceivedFlow;
                    UnleashState unleashState = new UnleashState(unleashContext2, linkedHashMap3);
                    unleashFetcher$doFetchToggles$1.L$0 = null;
                    unleashFetcher$doFetchToggles$1.L$1 = fetchResponse;
                    unleashFetcher$doFetchToggles$1.L$2 = linkedHashMap3;
                    unleashFetcher$doFetchToggles$1.label = 2;
                    if (asVar.emit(unleashState, unleashFetcher$doFetchToggles$1) != aVar) {
                        fetchResponse2 = fetchResponse;
                        linkedHashMap = linkedHashMap3;
                        return new ToggleResponse(fetchResponse2.getStatus(), linkedHashMap, null, 4, null);
                    }
                    return aVar;
                }
                if (fetchResponse.isFailed()) {
                    if (fetchResponse.getError() instanceof NotAuthorizedException) {
                        UnleashLogger.e$default(UnleashLogger.INSTANCE, TAG, "Not authorized to fetch toggles. Double check your SDK key", null, 4, null);
                    } else {
                        UnleashLogger unleashLogger = UnleashLogger.INSTANCE;
                        StringBuilder sb2 = new StringBuilder("Failed to fetch toggles ");
                        Exception error = fetchResponse.getError();
                        if (error != null) {
                            str = error.getMessage();
                        }
                        sb2.append(str);
                        unleashLogger.i(TAG, sb2.toString(), fetchResponse.getError());
                    }
                }
                return new ToggleResponse(fetchResponse.getStatus(), null, fetchResponse.getError(), 2, null);
            }
        }
        unleashFetcher$doFetchToggles$1 = new UnleashFetcher$doFetchToggles$1(this, cVar);
        Object obj4 = unleashFetcher$doFetchToggles$1.result;
        a aVar2 = a.alpha;
        i4 = unleashFetcher$doFetchToggles$1.label;
        if (i4 == 0) {
        }
        fetchResponse = (FetchResponse) obj4;
        String str2 = null;
        if (!fetchResponse.isSuccess()) {
        }
    }

    @NotNull
    public final aw getFeaturesReceivedFlow() {
        return new au(this.featuresReceivedFlow);
    }

    @NotNull
    public final aw getHeartbeatFlow() {
        return new au(this.fetcherHeartbeatFlow);
    }

    @Nullable
    public final Object refreshToggles(@NotNull c<? super ToggleResponse> cVar) {
        return refreshTogglesWithContext((UnleashContext) this.unleashContext.getValue(), cVar);
    }

    @Nullable
    public final Object refreshTogglesIfContextChanged(@NotNull UnleashContext unleashContext, @NotNull c<? super ToggleResponse> cVar) {
        if (Intrinsics.areEqual(unleashContext, this.contextForLastFetch)) {
            UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Context unchanged, skipping refresh toggles", null, 4, null);
            return new ToggleResponse(Status.NOT_MODIFIED, null, null, 6, null);
        }
        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Unleash context changed: " + unleashContext, null, 4, null);
        return refreshTogglesWithContext(unleashContext, cVar);
    }

    public final void startWatchingContext() {
        ad.zulu(DefaultUnleashKt.getUnleashScope(), null, null, new UnleashFetcher$startWatchingContext$1(this, null), 3);
    }
}
