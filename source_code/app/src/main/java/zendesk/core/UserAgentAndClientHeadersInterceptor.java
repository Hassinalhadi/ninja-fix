package zendesk.core;

import android.os.Build;
import androidx.appcompat.widget.P0;
import av.q;
import java.io.IOException;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
class UserAgentAndClientHeadersInterceptor implements Interceptor {
    private final String userAgent;
    private final String version;
    private final String zendeskClient;

    public UserAgentAndClientHeadersInterceptor(String str, String str2) {
        Locale locale = Locale.US;
        StringBuilder green = P0.green("Zendesk-SDK/", str, " Android/", " Variant/", Build.VERSION.SDK_INT);
        green.append(str2);
        this.userAgent = green.toString();
        this.zendeskClient = q.echo("mobile/android/sdk/", str2.toLowerCase());
        this.version = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.removeHeader("User-Agent");
        newBuilder.addHeader("User-Agent", this.userAgent);
        newBuilder.removeHeader(Constants.X_ZENDESK_CLIENT_HEADER_NAME);
        newBuilder.addHeader(Constants.X_ZENDESK_CLIENT_HEADER_NAME, this.zendeskClient);
        newBuilder.removeHeader(Constants.X_ZENDESK_CLIENT_VERSION_HEADER_NAME);
        newBuilder.addHeader(Constants.X_ZENDESK_CLIENT_VERSION_HEADER_NAME, this.version);
        return chain.proceed(newBuilder.build());
    }
}
