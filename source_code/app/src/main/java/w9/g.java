package w9;

import delivery.samurai.android.AndroidApp;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import t6.V2;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class g implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.echo(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        String language = Locale.getDefault().getLanguage();
        Intrinsics.delta(language, "getLanguage(...)");
        Request.Builder header = newBuilder.header(Constants.ACCEPT_LANGUAGE, language);
        AndroidApp androidApp = AndroidApp.yellow;
        String romeo = L9.d.romeo(V2.delta());
        if (romeo != null) {
            header.header("installation-uid", romeo);
        }
        return chain.proceed(header.build());
    }
}
