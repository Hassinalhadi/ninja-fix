package okhttp3.internal.http;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001eJ\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010%\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010&\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010\u0002\u001a\u00020'H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "call", "Lokhttp3/internal/connection/RealCall;", "interceptors", "", "Lokhttp3/Interceptor;", "index", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getRequest$okhttp", "()Lokhttp3/Request;", "getConnectTimeoutMillis$okhttp", "()I", "getReadTimeoutMillis$okhttp", "getWriteTimeoutMillis$okhttp", "calls", Constants.COPY_TYPE, "copy$okhttp", "connection", "Lokhttp3/Connection;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "Lokhttp3/Call;", "proceed", "Lokhttp3/Response;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    @NotNull
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;

    @Nullable
    private final Exchange exchange;
    private final int index;

    @NotNull
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;

    @NotNull
    private final Request request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(@NotNull RealCall call, @NotNull List<? extends Interceptor> interceptors, int i4, @Nullable Exchange exchange, @NotNull Request request, int i5, int i10, int i11) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(interceptors, "interceptors");
        Intrinsics.echo(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i4;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i5;
        this.readTimeoutMillis = i10;
        this.writeTimeoutMillis = i11;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i4, Exchange exchange, Request request, int i5, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i4 = realInterceptorChain.index;
        }
        if ((i12 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        if ((i12 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        if ((i12 & 8) != 0) {
            i5 = realInterceptorChain.connectTimeoutMillis;
        }
        if ((i12 & 16) != 0) {
            i10 = realInterceptorChain.readTimeoutMillis;
        }
        if ((i12 & 32) != 0) {
            i11 = realInterceptorChain.writeTimeoutMillis;
        }
        int i13 = i10;
        int i14 = i11;
        return realInterceptorChain.copy$okhttp(i4, exchange, request, i5, i13, i14);
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: connectTimeoutMillis, reason: from getter */
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @Nullable
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection$okhttp();
        }
        return null;
    }

    @NotNull
    public final RealInterceptorChain copy$okhttp(int index, @Nullable Exchange exchange, @NotNull Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        Intrinsics.echo(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @NotNull
    /* renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    @Nullable
    /* renamed from: getExchange$okhttp, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    /* renamed from: getReadTimeoutMillis$okhttp, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @NotNull
    /* renamed from: getRequest$okhttp, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* renamed from: getWriteTimeoutMillis$okhttp, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Response proceed(@NotNull Request request) throws IOException {
        Intrinsics.echo(request, "request");
        if (this.index < this.interceptors.size()) {
            this.calls++;
            Exchange exchange = this.exchange;
            if (exchange != null) {
                if (exchange.getFinder().getRoutePlanner().sameHostAndPort(request.url())) {
                    if (this.calls != 1) {
                        throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
                }
            }
            RealInterceptorChain copy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
            Interceptor interceptor = this.interceptors.get(this.index);
            Response intercept = interceptor.intercept(copy$okhttp$default);
            if (intercept != null) {
                if (this.exchange != null && this.index + 1 < this.interceptors.size() && copy$okhttp$default.calls != 1) {
                    throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
                }
                return intercept;
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withConnectTimeout(int timeout, @NotNull TimeUnit unit) {
        Intrinsics.echo(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, _UtilJvmKt.checkDuration("connectTimeout", timeout, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withReadTimeout(int timeout, @NotNull TimeUnit unit) {
        Intrinsics.echo(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, _UtilJvmKt.checkDuration("readTimeout", timeout, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withWriteTimeout(int timeout, @NotNull TimeUnit unit) {
        Intrinsics.echo(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, _UtilJvmKt.checkDuration("writeTimeout", timeout, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
