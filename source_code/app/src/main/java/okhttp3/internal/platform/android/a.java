package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static boolean alpha(SocketAdapter socketAdapter, SSLSocketFactory sslSocketFactory) {
        Intrinsics.echo(sslSocketFactory, "sslSocketFactory");
        return false;
    }

    public static X509TrustManager bravo(SocketAdapter socketAdapter, SSLSocketFactory sslSocketFactory) {
        Intrinsics.echo(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}
