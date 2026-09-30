package com.checkout.eventlogger.network;

import com.checkout.eventlogger.network.b.b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements com.checkout.eventlogger.network.b.a {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f6598a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6599b;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0004a f6597d = new C0004a();

    /* renamed from: c, reason: collision with root package name */
    public static final MediaType f6596c = MediaType.INSTANCE.get("application/cloudevents+json; charset=utf-8");

    /* renamed from: com.checkout.eventlogger.network.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0004a {
    }

    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements Function0<OkHttpClient> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6600a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public OkHttpClient invoke() {
            MediaType mediaType = a.f6596c;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.retryOnConnectionFailure(true);
            return builder.build();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements Function1<Response, com.checkout.eventlogger.network.b.b<Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6601a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public com.checkout.eventlogger.network.b.b<Unit> invoke(Response response) {
            Response it = response;
            Intrinsics.echo(it, "it");
            return new b.c(Unit.INSTANCE);
        }
    }

    public a(@NotNull String url) {
        Intrinsics.echo(url, "url");
        this.f6599b = url;
        this.f6598a = LazyKt.lazy(b.f6600a);
    }

    @Override // com.checkout.eventlogger.network.b.a
    @NotNull
    public com.checkout.eventlogger.network.b.b<Unit> a(@NotNull String jsonPayload) {
        com.checkout.eventlogger.network.b.b<Unit> c0005b;
        String str;
        Intrinsics.echo(jsonPayload, "jsonPayload");
        Request build = new Request.Builder().url(this.f6599b).post(RequestBody.INSTANCE.create(jsonPayload, f6596c)).build();
        c cVar = c.f6601a;
        try {
            Response execute = FirebasePerfOkHttpClient.execute(((OkHttpClient) this.f6598a.getValue()).newCall(build));
            try {
                if (execute.getIsSuccessful()) {
                    c0005b = cVar.invoke(execute);
                } else {
                    ResponseBody body = execute.body();
                    if (body == null || (str = body.string()) == null) {
                        str = "unknown failure";
                    }
                    c0005b = new b.C0005b<>(str);
                }
                execute.close();
                return c0005b;
            } finally {
            }
        } catch (Throwable th) {
            return new b.a(th);
        }
    }
}
