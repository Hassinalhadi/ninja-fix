package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Collections;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;

/* loaded from: classes.dex */
class Tls12SocketFactory extends SSLSocketFactory {
    private static final String[] TLS_V12_ONLY = {TlsVersion.TLS_1_2.javaName()};
    final SSLSocketFactory delegate;

    public Tls12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    public static OkHttpClient.Builder enableTls12(OkHttpClient.Builder builder) {
        Logger.d("Tls12SocketFactory", "Skipping TLS 1.2 patch", new Object[0]);
        builder.connectionSpecs(Collections.singletonList(new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3).build()));
        return builder;
    }

    private static Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(TLS_V12_ONLY);
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i4, boolean z2) throws IOException {
        return patch(this.delegate.createSocket(socket, str, i4, z2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4) throws IOException {
        return patch(this.delegate.createSocket(str, i4));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) throws IOException {
        return patch(this.delegate.createSocket(str, i4, inetAddress, i5));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4) throws IOException {
        return patch(this.delegate.createSocket(inetAddress, i4));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) throws IOException {
        return patch(this.delegate.createSocket(inetAddress, i4, inetAddress2, i5));
    }
}
