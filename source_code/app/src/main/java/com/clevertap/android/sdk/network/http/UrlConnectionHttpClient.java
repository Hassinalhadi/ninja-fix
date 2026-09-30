package com.clevertap.android.sdk.network.http;

import android.net.TrafficStats;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.http.UrlConnectionHttpClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2716m6;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/clevertap/android/sdk/network/http/UrlConnectionHttpClient;", "Lcom/clevertap/android/sdk/network/http/CtHttpClient;", "isSslPinningEnabled", "", "logger", "Lcom/clevertap/android/sdk/Logger;", "logTag", "", "<init>", "(ZLcom/clevertap/android/sdk/Logger;Ljava/lang/String;)V", "()Z", "setSslPinningEnabled", "(Z)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "socketFactory$delegate", "Lkotlin/Lazy;", "sslContext", "Ljavax/net/ssl/SSLContext;", "getSslContext", "()Ljavax/net/ssl/SSLContext;", "sslContext$delegate", "execute", "Lcom/clevertap/android/sdk/network/http/Response;", "request", "Lcom/clevertap/android/sdk/network/http/Request;", "openHttpsURLConnection", "Ljavax/net/ssl/HttpsURLConnection;", "createSslContext", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UrlConnectionHttpClient implements CtHttpClient {
    public static final int CONNECT_TIMEOUT = 10000;
    public static final int NETWORK_TAG_HTTP_REQUESTS = 17;
    public static final int READ_TIMEOUT = 10000;
    private boolean isSslPinningEnabled;

    @NotNull
    private final String logTag;

    @NotNull
    private final Logger logger;

    /* renamed from: socketFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy socketFactory;

    /* renamed from: sslContext$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sslContext;

    public UrlConnectionHttpClient(boolean z2, @NotNull Logger logger, @NotNull String logTag) {
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logTag, "logTag");
        this.isSslPinningEnabled = z2;
        this.logger = logger;
        this.logTag = logTag;
        final int i4 = 0;
        this.socketFactory = LazyKt.lazy(new Function0(this) { // from class: w5.a
            public final /* synthetic */ UrlConnectionHttpClient purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SSLSocketFactory socketFactory_delegate$lambda$0;
                SSLContext sslContext_delegate$lambda$1;
                switch (i4) {
                    case 0:
                        socketFactory_delegate$lambda$0 = UrlConnectionHttpClient.socketFactory_delegate$lambda$0(this.purple);
                        return socketFactory_delegate$lambda$0;
                    default:
                        sslContext_delegate$lambda$1 = UrlConnectionHttpClient.sslContext_delegate$lambda$1(this.purple);
                        return sslContext_delegate$lambda$1;
                }
            }
        });
        final int i5 = 1;
        this.sslContext = LazyKt.lazy(new Function0(this) { // from class: w5.a
            public final /* synthetic */ UrlConnectionHttpClient purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SSLSocketFactory socketFactory_delegate$lambda$0;
                SSLContext sslContext_delegate$lambda$1;
                switch (i5) {
                    case 0:
                        socketFactory_delegate$lambda$0 = UrlConnectionHttpClient.socketFactory_delegate$lambda$0(this.purple);
                        return socketFactory_delegate$lambda$0;
                    default:
                        sslContext_delegate$lambda$1 = UrlConnectionHttpClient.sslContext_delegate$lambda$1(this.purple);
                        return sslContext_delegate$lambda$1;
                }
            }
        });
    }

    public static /* synthetic */ Unit alpha(Ref.ObjectRef objectRef) {
        return execute$lambda$2(objectRef);
    }

    private final SSLContext createSslContext() {
        InputStream inputStream;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            ClassLoader classLoader = keyStore.getClass().getClassLoader();
            if (classLoader != null) {
                inputStream = classLoader.getResourceAsStream("com/clevertap/android/sdk/certificates/AmazonRootCA1.cer");
            } else {
                inputStream = null;
            }
            Certificate generateCertificate = certificateFactory.generateCertificate(new BufferedInputStream(inputStream));
            Intrinsics.charlie(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            keyStore.setCertificateEntry("AmazonRootCA1", (X509Certificate) generateCertificate);
            trustManagerFactory.init(keyStore);
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            Logger.d("SSL Context built");
            return sSLContext;
        } catch (Exception e) {
            Logger.i("Error building SSL Context", e);
            return null;
        }
    }

    public static final Unit execute$lambda$2(Ref.ObjectRef connection) {
        Intrinsics.echo(connection, "$connection");
        ((HttpsURLConnection) connection.alpha).disconnect();
        return Unit.INSTANCE;
    }

    private final SSLSocketFactory getSocketFactory() {
        return (SSLSocketFactory) this.socketFactory.getValue();
    }

    private final SSLContext getSslContext() {
        return (SSLContext) this.sslContext.getValue();
    }

    private final HttpsURLConnection openHttpsURLConnection(Request request) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(request.getUrl().toString()).openConnection());
        Intrinsics.charlie(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpsURLConnection.setInstanceFollowRedirects(false);
        if (this.isSslPinningEnabled && getSslContext() != null) {
            httpsURLConnection.setSSLSocketFactory(getSocketFactory());
        }
        if (request.getBody() != null) {
            httpsURLConnection.setDoOutput(true);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                byte[] bytes = request.getBody().getBytes(a.alpha);
                Intrinsics.delta(bytes, "getBytes(...)");
                outputStream.write(bytes);
                AbstractC2716m6.alpha(outputStream, null);
                return httpsURLConnection;
            } finally {
            }
        } else {
            return httpsURLConnection;
        }
    }

    public static final SSLSocketFactory socketFactory_delegate$lambda$0(UrlConnectionHttpClient this$0) {
        Intrinsics.echo(this$0, "this$0");
        try {
            Logger.d("Pinning SSL session to DigiCertGlobalRoot CA certificate");
            SSLContext sslContext = this$0.getSslContext();
            if (sslContext == null) {
                return null;
            }
            return sslContext.getSocketFactory();
        } catch (Exception e) {
            Logger.d("Issue in pinning SSL,", e);
            return null;
        }
    }

    public static final SSLContext sslContext_delegate$lambda$1(UrlConnectionHttpClient this$0) {
        Intrinsics.echo(this$0, "this$0");
        return this$0.createSslContext();
    }

    @Override // com.clevertap.android.sdk.network.http.CtHttpClient
    @NotNull
    public Response execute(@NotNull Request request) {
        Response response;
        Intrinsics.echo(request, "request");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            try {
                TrafficStats.setThreadStatsTag(17);
                objectRef.alpha = openHttpsURLConnection(request);
                this.logger.debug(this.logTag, "Sending request to: " + request.getUrl());
                int responseCode = ((HttpsURLConnection) objectRef.alpha).getResponseCode();
                Map<String, List<String>> headerFields = ((HttpsURLConnection) objectRef.alpha).getHeaderFields();
                n nVar = new n(26, objectRef);
                if (responseCode == 200) {
                    Intrinsics.checkNotNull(headerFields);
                    response = new Response(request, responseCode, headerFields, ((HttpsURLConnection) objectRef.alpha).getInputStream(), nVar);
                } else {
                    Intrinsics.checkNotNull(headerFields);
                    response = new Response(request, responseCode, headerFields, ((HttpsURLConnection) objectRef.alpha).getErrorStream(), nVar);
                }
                TrafficStats.clearThreadStatsTag();
                return response;
            } catch (Exception e) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) objectRef.alpha;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                    throw e;
                }
                throw e;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* renamed from: isSslPinningEnabled, reason: from getter */
    public final boolean getIsSslPinningEnabled() {
        return this.isSslPinningEnabled;
    }

    public final void setSslPinningEnabled(boolean z2) {
        this.isSslPinningEnabled = z2;
    }
}
