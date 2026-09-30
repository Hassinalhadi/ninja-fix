package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes.dex */
class ZendeskUnauthorizedInterceptor implements Interceptor {
    private static final String LOG_TAG = "ZendeskUnauthorizedInterceptor";
    private final IdentityManager identityManager;
    private final SessionStorage sessionStorage;

    public ZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, IdentityManager identityManager) {
        this.sessionStorage = sessionStorage;
        this.identityManager = identityManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        if (!proceed.getIsSuccessful() && 401 == proceed.code()) {
            if (UrlHelper.isGuideRequest(chain.request().url().getUrl()) && (this.identityManager.getIdentity() instanceof AnonymousIdentity)) {
                Logger.d(LOG_TAG, "Unauthorized guide request", new Object[0]);
                return proceed;
            }
            onHttpUnauthorized();
        }
        return proceed;
    }

    public void onHttpUnauthorized() {
        this.sessionStorage.clear();
    }
}
