package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes.dex */
class ZendeskPushInterceptor implements Interceptor {
    private static final String LOG_TAG = "ZendeskPushInterceptor";
    private final IdentityStorage identityStorage;
    private final PushDeviceIdStorage pushDeviceIdStorage;
    private final PushRegistrationProviderInternal pushProvider;

    public ZendeskPushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage, IdentityStorage identityStorage) {
        this.pushProvider = pushRegistrationProviderInternal;
        this.pushDeviceIdStorage = pushDeviceIdStorage;
        this.identityStorage = identityStorage;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        PushRegistrationRequest pushRegistrationRequest = this.pushDeviceIdStorage.getPushRegistrationRequest();
        if (pushRegistrationRequest != null && this.identityStorage.getStoredAccessToken() != null) {
            Logger.d(LOG_TAG, "Sending stored push registration request", new Object[0]);
            this.pushProvider.sendPushRegistrationRequest(pushRegistrationRequest);
        }
        return chain.proceed(chain.request());
    }
}
