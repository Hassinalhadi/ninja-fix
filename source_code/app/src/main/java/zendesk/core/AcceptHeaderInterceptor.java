package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes.dex */
class AcceptHeaderInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().addHeader("Accept", "application/json").build());
    }
}
