package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
class ZendeskAuthHeaderInterceptor implements Interceptor {
    private IdentityManager identityManager;

    public ZendeskAuthHeaderInterceptor(IdentityManager identityManager) {
        this.identityManager = identityManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        Identity identity = this.identityManager.getIdentity();
        String storedAccessTokenAsBearerToken = this.identityManager.getStoredAccessTokenAsBearerToken();
        if (UrlHelper.isGuideRequest(chain.request().url().getUrl()) && !UrlHelper.isVoteRequest(chain.request().url().getUrl()) && (identity instanceof AnonymousIdentity)) {
            return chain.proceed(newBuilder.build());
        }
        if (storedAccessTokenAsBearerToken != null) {
            newBuilder.addHeader("Authorization", storedAccessTokenAsBearerToken);
        }
        return chain.proceed(newBuilder.build());
    }
}
