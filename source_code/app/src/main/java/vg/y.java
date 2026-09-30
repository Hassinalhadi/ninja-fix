package vg;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class y implements d {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f14000a;
    public final ap alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14001b;
    public final Object purple;
    public final Object[] red;
    public final Call.Factory silver;
    public final m teal;
    public volatile boolean white;
    public Call yellow;

    public y(ap apVar, Object obj, Object[] objArr, Call.Factory factory, m mVar) {
        this.alpha = apVar;
        this.purple = obj;
        this.red = objArr;
        this.silver = factory;
        this.teal = mVar;
    }

    public final Call alpha() {
        HttpUrl resolve;
        ap apVar = this.alpha;
        Object[] objArr = this.red;
        int length = objArr.length;
        A[] aArr = apVar.kilo;
        if (length == aArr.length) {
            an anVar = new an(apVar.delta, apVar.charlie, apVar.echo, apVar.foxtrot, apVar.golf, apVar.hotel, apVar.india, apVar.juliet);
            if (apVar.lima) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i4 = 0; i4 < length; i4++) {
                arrayList.add(objArr[i4]);
                aArr[i4].alpha(anVar, objArr[i4]);
            }
            HttpUrl.Builder builder = anVar.delta;
            if (builder != null) {
                resolve = builder.build();
            } else {
                String str = anVar.charlie;
                HttpUrl httpUrl = anVar.bravo;
                resolve = httpUrl.resolve(str);
                if (resolve == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + anVar.charlie);
                }
            }
            RequestBody requestBody = anVar.kilo;
            if (requestBody == null) {
                FormBody.Builder builder2 = anVar.juliet;
                if (builder2 != null) {
                    requestBody = builder2.build();
                } else {
                    MultipartBody.Builder builder3 = anVar.india;
                    if (builder3 != null) {
                        requestBody = builder3.build();
                    } else if (anVar.hotel) {
                        requestBody = RequestBody.create((MediaType) null, new byte[0]);
                    }
                }
            }
            MediaType mediaType = anVar.golf;
            Headers.Builder builder4 = anVar.foxtrot;
            if (mediaType != null) {
                if (requestBody != null) {
                    requestBody = new am(requestBody, mediaType);
                } else {
                    builder4.add(CtApi.HEADER_CONTENT_TYPE, mediaType.toString());
                }
            }
            Call newCall = this.silver.newCall(anVar.echo.url(resolve).headers(builder4.build()).method(anVar.alpha, requestBody).tag((Class<? super Class>) t.class, (Class) new t(apVar.alpha, this.purple, apVar.bravo, arrayList)).build());
            if (newCall != null) {
                return newCall;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(P0.cyan(Q0.c.sierra(length, "Argument count (", ") doesn't match expected count ("), aArr.length, ")"));
    }

    public final Call bravo() {
        Call call = this.yellow;
        if (call != null) {
            return call;
        }
        Throwable th = this.f14000a;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            Call alpha = alpha();
            this.yellow = alpha;
            return alpha;
        } catch (IOException | Error | RuntimeException e) {
            A.sierra(e);
            this.f14000a = e;
            throw e;
        }
    }

    @Override // vg.d
    public final void cancel() {
        Call call;
        this.white = true;
        synchronized (this) {
            call = this.yellow;
        }
        if (call != null) {
            call.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Tf.m, Tf.l, java.lang.Object] */
    public final aq charlie(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new x(body.get$contentType(), body.get$contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                w wVar = new w(body);
                try {
                    Object bravo = this.teal.bravo(wVar);
                    if (build.getIsSuccessful()) {
                        return new aq(build, bravo, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = wVar.red;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            body.close();
            if (build.getIsSuccessful()) {
                return new aq(build, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            ?? obj = new Object();
            body.get$this_asResponseBody().g(obj);
            ResponseBody create = ResponseBody.create(body.get$contentType(), body.get$contentLength(), (Tf.m) obj);
            Objects.requireNonNull(create, "body == null");
            if (!build.getIsSuccessful()) {
                return new aq(build, null, create);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            body.close();
        }
    }

    public final Object clone() {
        return new y(this.alpha, this.purple, this.red, this.silver, this.teal);
    }

    @Override // vg.d
    public final aq execute() {
        Call bravo;
        synchronized (this) {
            if (!this.f14001b) {
                this.f14001b = true;
                bravo = bravo();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.white) {
            bravo.cancel();
        }
        return charlie(FirebasePerfOkHttpClient.execute(bravo));
    }

    @Override // vg.d
    public final boolean isCanceled() {
        boolean z2 = true;
        if (this.white) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.yellow;
                if (call == null || !call.isCanceled()) {
                    z2 = false;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // vg.d
    public final void o(g gVar) {
        Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (!this.f14001b) {
                    this.f14001b = true;
                    call = this.yellow;
                    th = this.f14000a;
                    if (call == null && th == null) {
                        try {
                            Call alpha = alpha();
                            this.yellow = alpha;
                            call = alpha;
                        } catch (Throwable th2) {
                            th = th2;
                            A.sierra(th);
                            this.f14000a = th;
                        }
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            gVar.onFailure(this, th);
            return;
        }
        if (this.white) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new com.google.android.play.core.integrity.k(this, gVar));
    }

    @Override // vg.d
    public final synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return bravo().request();
    }

    @Override // vg.d
    /* renamed from: clone */
    public final d mo370clone() {
        return new y(this.alpha, this.purple, this.red, this.silver, this.teal);
    }
}
