package gd;

import H0.p;
import Lb.W;
import Tf.m;
import Yb.C0312j0;
import Yb.C0331t0;
import Yb.F;
import androidx.recyclerview.widget.RecyclerView;
import bz.af;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import d.C1534h0;
import d5.C1589a;
import hd.an;
import io.ktor.utils.io.ak;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import md.C2112a;
import nd.C2176a;
import od.AbstractC2228e;
import od.C2227d;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpMethod;
import qd.C2464b;
import s6.AbstractC2832z6;
import s6.J6;
import sd.o;
import sd.q;
import sd.s;
import sd.t;
import sd.u;
import sd.v;
import vf.C3195B;
import vf.C3207k;
import vf.C3221z;
import vf.H;
import vf.I;
import vf.J;
import vf.ac;
import vf.ad;
import vf.r;

/* loaded from: classes2.dex */
public final class f extends fd.f {

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f12695b = LazyKt.lazy(new C1589a(29));

    /* renamed from: a, reason: collision with root package name */
    public final Map f12696a;
    public final b silver;
    public final Set teal = ArraysKt.g(new fd.g[]{an.alpha, C2176a.alpha, C2112a.alpha});
    public final Nd.h white;
    public final Nd.h yellow;

    public f(b bVar) {
        this.silver = bVar;
        Map synchronizedMap = Collections.synchronizedMap(new zd.l(new C0331t0(1, this, f.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 14), new com.clevertap.android.sdk.inapp.images.preload.a(23)));
        Intrinsics.delta(synchronizedMap, "synchronizedMap(...)");
        this.f12696a = synchronizedMap;
        Nd.f fVar = super.charlie().get(H.alpha);
        Intrinsics.checkNotNull(fVar);
        Nd.h charlie = AbstractC2832z6.charlie(new J((I) fVar), new p(C3221z.alpha, 1));
        this.white = charlie;
        this.yellow = super.charlie().plus(charlie);
        ad.yankee(C3195B.alpha, super.charlie(), ac.red, new c(this, null));
    }

    @Override // fd.f, fd.d
    public final Set bronze() {
        return this.teal;
    }

    @Override // fd.f, vf.ab
    public final Nd.h charlie() {
        return this.yellow;
    }

    @Override // fd.f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        Nd.f fVar = this.white.get(H.alpha);
        Intrinsics.charlie(fVar, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((J) ((r) fVar)).yellow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0063, code lost:
    
        if (r15 == r0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [sd.n, G3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object echo(C2227d c2227d, Pd.c cVar) {
        d dVar;
        int i4;
        boolean contains;
        h hVar;
        o oVar;
        sd.e bravo;
        String str;
        Long alpha;
        String str2;
        String str3;
        RequestBody requestBody;
        OkHttpClient okHttpClient;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i5 = dVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                dVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                d dVar2 = dVar;
                Object obj = dVar2.purple;
                Object obj2 = Od.a.alpha;
                i4 = dVar2.silver;
                boolean z2 = true;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    ResultKt.alpha(obj);
                                    return obj;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.alpha(obj);
                            return obj;
                        }
                        ResultKt.alpha(obj);
                        return obj;
                    }
                    c2227d = dVar2.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    dVar2.alpha = c2227d;
                    dVar2.silver = 1;
                    Set set = fd.k.alpha;
                    Nd.f fVar = dVar2.getContext().get(fd.j.purple);
                    Intrinsics.checkNotNull(fVar);
                    obj = ((fd.j) fVar).alpha;
                }
                C2227d c2227d2 = c2227d;
                Nd.h callContext = (Nd.h) obj;
                Request.Builder builder = new Request.Builder();
                builder.url(c2227d2.alpha.teal);
                Set set2 = t.alpha;
                s sVar = c2227d2.bravo;
                Intrinsics.echo(sVar, "<this>");
                contains = t.alpha.contains(sVar);
                vd.e eVar = c2227d2.delta;
                if (contains || !(eVar instanceof C2464b)) {
                    z2 = false;
                }
                hVar = new h(z2, builder);
                Set set3 = fd.k.alpha;
                oVar = c2227d2.charlie;
                ?? aVar = new G3.a(10);
                aVar.G(oVar);
                aVar.G(eVar.charlie());
                aVar.X().hotel(new af(8, hVar));
                List list = q.alpha;
                if (oVar.get("User-Agent") == null && eVar.charlie().get("User-Agent") == null) {
                    int i10 = zd.o.alpha;
                    hVar.invoke("User-Agent", "ktor-client");
                }
                bravo = eVar.bravo();
                if ((bravo != null || (str = bravo.toString()) == null) && (str = eVar.charlie().get(CtApi.HEADER_CONTENT_TYPE)) == null) {
                    str = oVar.get(CtApi.HEADER_CONTENT_TYPE);
                }
                alpha = eVar.alpha();
                if ((alpha != null || (str2 = alpha.toString()) == null) && (str2 = eVar.charlie().get("Content-Length")) == null) {
                    str2 = oVar.get("Content-Length");
                }
                if (str != null) {
                    hVar.invoke(CtApi.HEADER_CONTENT_TYPE, str);
                }
                if (str2 != null) {
                    hVar.invoke("Content-Length", str2);
                }
                str3 = sVar.alpha;
                if (!HttpMethod.permitsRequestBody(str3)) {
                    Intrinsics.echo(callContext, "callContext");
                    if (eVar instanceof vd.c) {
                        byte[] echo = ((vd.c) eVar).echo();
                        requestBody = RequestBody.INSTANCE.create(echo, MediaType.INSTANCE.parse(String.valueOf(eVar.bravo())), 0, echo.length);
                    } else if (eVar instanceof vd.d) {
                        requestBody = new l(eVar.alpha(), new C0312j0(26, eVar));
                    } else if (eVar instanceof vd.a) {
                        requestBody = new l(null, new F(15, callContext, eVar));
                    } else if (eVar instanceof C2464b) {
                        requestBody = RequestBody.INSTANCE.create(new byte[0], (MediaType) null, 0, 0);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    requestBody = null;
                }
                builder.method(str3, requestBody);
                Request build = builder.build();
                okHttpClient = (OkHttpClient) this.f12696a.get(c2227d2.alpha());
                if (okHttpClient == null) {
                    int i11 = AbstractC2228e.alpha;
                    dVar2.alpha = null;
                    dVar2.silver = 4;
                    Object foxtrot = foxtrot(okHttpClient, build, callContext, c2227d2, dVar2);
                    if (foxtrot == obj2) {
                        return obj2;
                    }
                    return foxtrot;
                }
                throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
            }
        }
        dVar = new d(this, cVar);
        d dVar22 = dVar;
        Object obj3 = dVar22.purple;
        Object obj22 = Od.a.alpha;
        i4 = dVar22.silver;
        boolean z22 = true;
        if (i4 == 0) {
        }
        C2227d c2227d22 = c2227d;
        Nd.h callContext2 = (Nd.h) obj3;
        Request.Builder builder2 = new Request.Builder();
        builder2.url(c2227d22.alpha.teal);
        Set set22 = t.alpha;
        s sVar2 = c2227d22.bravo;
        Intrinsics.echo(sVar2, "<this>");
        contains = t.alpha.contains(sVar2);
        vd.e eVar2 = c2227d22.delta;
        if (contains) {
        }
        z22 = false;
        hVar = new h(z22, builder2);
        Set set32 = fd.k.alpha;
        oVar = c2227d22.charlie;
        ?? aVar2 = new G3.a(10);
        aVar2.G(oVar);
        aVar2.G(eVar2.charlie());
        aVar2.X().hotel(new af(8, hVar));
        List list2 = q.alpha;
        if (oVar.get("User-Agent") == null) {
            int i102 = zd.o.alpha;
            hVar.invoke("User-Agent", "ktor-client");
        }
        bravo = eVar2.bravo();
        if (bravo != null) {
        }
        str = oVar.get(CtApi.HEADER_CONTENT_TYPE);
        alpha = eVar2.alpha();
        if (alpha != null) {
        }
        str2 = oVar.get("Content-Length");
        if (str != null) {
        }
        if (str2 != null) {
        }
        str3 = sVar2.alpha;
        if (!HttpMethod.permitsRequestBody(str3)) {
        }
        builder2.method(str3, requestBody);
        Request build2 = builder2.build();
        okHttpClient = (OkHttpClient) this.f12696a.get(c2227d22.alpha());
        if (okHttpClient == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(OkHttpClient okHttpClient, Request request, Nd.h hVar, C2227d c2227d, Pd.c cVar) {
        e eVar;
        int i4;
        Bd.e eVar2;
        ResponseBody body;
        Object obj;
        int i5;
        m source;
        Nd.h hVar2 = hVar;
        C2227d c2227d2 = c2227d;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.white;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                eVar.white = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = eVar.silver;
                Od.a aVar = Od.a.alpha;
                i4 = eVar.white;
                H h4 = H.alpha;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Bd.e eVar3 = eVar.red;
                        c2227d2 = eVar.purple;
                        Nd.h hVar3 = eVar.alpha;
                        ResultKt.alpha(obj2);
                        eVar2 = eVar3;
                        hVar2 = hVar3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    Bd.e alpha = Bd.a.alpha(null);
                    eVar.alpha = hVar2;
                    eVar.purple = c2227d2;
                    eVar.red = alpha;
                    eVar.white = 1;
                    C3207k c3207k = new C3207k(1, J6.delta(eVar));
                    c3207k.tango();
                    Call newCall = okHttpClient.newCall(request);
                    Nd.f fVar = hVar2.get(h4);
                    Intrinsics.checkNotNull(fVar);
                    ((I) fVar).papa(true, true, new W(3, newCall));
                    FirebasePerfOkHttpClient.enqueue(newCall, new a(c2227d2, c3207k));
                    Object sierra = c3207k.sierra();
                    if (sierra == aVar) {
                        return aVar;
                    }
                    eVar2 = alpha;
                    obj2 = sierra;
                }
                Response response = (Response) obj2;
                body = response.body();
                Nd.f fVar2 = hVar2.get(h4);
                Intrinsics.checkNotNull(fVar2);
                ((I) fVar2).crimson(new C1534h0(6, body));
                if (body == null && (source = body.getSource()) != null) {
                    obj = (io.ktor.utils.io.m) ak.uniform(C3195B.alpha, hVar2, new i(source, hVar2, c2227d2, null), 2).purple;
                } else {
                    io.ktor.utils.io.t.alpha.getClass();
                    obj = io.ktor.utils.io.s.bravo;
                }
                Object obj3 = obj;
                v vVar = new v(response.code(), response.message());
                Protocol protocol = response.protocol();
                Intrinsics.echo(protocol, "<this>");
                i5 = j.$EnumSwitchMapping$0[protocol.ordinal()];
                u uVar = u.delta;
                switch (i5) {
                    case 1:
                        uVar = u.foxtrot;
                        break;
                    case 2:
                        uVar = u.echo;
                        break;
                    case 3:
                        uVar = u.golf;
                        break;
                    case 4:
                    case 5:
                        break;
                    case 6:
                        uVar = u.hotel;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                u uVar2 = uVar;
                Headers headers = response.headers();
                Intrinsics.echo(headers, "<this>");
                return new od.g(vVar, eVar2, new k(headers), uVar2, obj3, hVar2);
            }
        }
        eVar = new e(this, cVar);
        Object obj22 = eVar.silver;
        Od.a aVar2 = Od.a.alpha;
        i4 = eVar.white;
        H h42 = H.alpha;
        if (i4 == 0) {
        }
        Response response2 = (Response) obj22;
        body = response2.body();
        Nd.f fVar22 = hVar2.get(h42);
        Intrinsics.checkNotNull(fVar22);
        ((I) fVar22).crimson(new C1534h0(6, body));
        if (body == null) {
        }
        io.ktor.utils.io.t.alpha.getClass();
        obj = io.ktor.utils.io.s.bravo;
        Object obj32 = obj;
        v vVar2 = new v(response2.code(), response2.message());
        Protocol protocol2 = response2.protocol();
        Intrinsics.echo(protocol2, "<this>");
        i5 = j.$EnumSwitchMapping$0[protocol2.ordinal()];
        u uVar3 = u.delta;
        switch (i5) {
        }
        u uVar22 = uVar3;
        Headers headers2 = response2.headers();
        Intrinsics.echo(headers2, "<this>");
        return new od.g(vVar2, eVar2, new k(headers2), uVar22, obj32, hVar2);
    }
}
