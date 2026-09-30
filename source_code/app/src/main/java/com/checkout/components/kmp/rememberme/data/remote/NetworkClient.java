package com.checkout.components.kmp.rememberme.data.remote;

import Yb.F;
import cd.c;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import fd.d;
import io.ktor.client.plugins.ResponseException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC2228e;
import od.C2226c;
import org.jetbrains.annotations.NotNull;
import pd.AbstractC2304b;
import sd.aa;
import sd.b;
import sd.s;
import t6.AbstractC2991f2;
import vd.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJF\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0006\b\u0000\u0010\u000b\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0080H¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/remote/NetworkClient;", "", "Lfd/d;", "engine", "", "serviceName", "serviceVersion", "Lcom/checkout/components/kmp/rememberme/data/remote/HttpClientFactory;", "httpClientFactory", "<init>", "(Lfd/d;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/data/remote/HttpClientFactory;)V", "Req", "Res", "baseURL", "path", "body", "Lsd/s;", "requestMethod", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "request$rememberme_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lsd/s;LNd/c;)Ljava/lang/Object;", "request", "Ljava/lang/String;", "Lcd/c;", "client$delegate", "Lkotlin/Lazy;", "getClient", "()Lcd/c;", "client", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkClient {
    public static final int $stable = 8;

    /* renamed from: client$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy client;

    @NotNull
    private final String serviceName;

    @NotNull
    private final String serviceVersion;

    public NetworkClient(@NotNull d engine, @NotNull String serviceName, @NotNull String serviceVersion, @NotNull HttpClientFactory httpClientFactory) {
        Intrinsics.echo(engine, "engine");
        Intrinsics.echo(serviceName, "serviceName");
        Intrinsics.echo(serviceVersion, "serviceVersion");
        Intrinsics.echo(httpClientFactory, "httpClientFactory");
        this.serviceName = serviceName;
        this.serviceVersion = serviceVersion;
        this.client = LazyKt.lazy(new F(11, httpClientFactory, engine));
    }

    public final c getClient() {
        return (c) this.client.getValue();
    }

    public final <Req, Res> Object request$rememberme_release(String str, String str2, Req req, s sVar, Nd.c<? super RequestResult<? extends Res>> cVar) {
        try {
            c client = getClient();
            C2226c c2226c = new C2226c();
            Intrinsics.echo(sVar, "<set-?>");
            c2226c.bravo = sVar;
            AbstractC2228e.alpha(c2226c, new NetworkClient$request$response$1$1(this));
            NetworkClient$request$response$1$2 networkClient$request$response$1$2 = new NetworkClient$request$response$1$2(str, str2);
            aa aaVar = c2226c.alpha;
            networkClient$request$response$1$2.invoke((Object) aaVar, (Object) aaVar);
            AbstractC2991f2.delta(c2226c, b.alpha);
            if (req != null) {
                if (req instanceof e) {
                    c2226c.delta = req;
                    c2226c.alpha(null);
                    ((AbstractC2304b) new com.google.android.play.core.integrity.c(c2226c, client).delta(cVar)).getClass();
                    Intrinsics.juliet();
                    throw null;
                }
                c2226c.delta = req;
                Intrinsics.juliet();
                throw null;
            }
            c2226c.delta = vd.b.alpha;
            Intrinsics.juliet();
            throw null;
        } catch (ResponseException e) {
            return new RequestResult.Failed(e.getResponse().golf(), e);
        } catch (Exception e4) {
            return new RequestResult.Failed(null, e4);
        }
    }

    public /* synthetic */ NetworkClient(d dVar, String str, String str2, HttpClientFactory httpClientFactory, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? NetworkEngine_androidKt.getHttpClientEngine() : dVar, str, str2, httpClientFactory);
    }
}
