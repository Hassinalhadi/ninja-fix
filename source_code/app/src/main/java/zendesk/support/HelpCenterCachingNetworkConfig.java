package zendesk.support;

import okhttp3.OkHttpClient;
import zendesk.core.CustomNetworkConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpCenterCachingNetworkConfig extends CustomNetworkConfig {
    private HelpCenterCachingInterceptor interceptor;

    public HelpCenterCachingNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        this.interceptor = helpCenterCachingInterceptor;
    }

    @Override // zendesk.core.CustomNetworkConfig
    public void configureOkHttpClient(OkHttpClient.Builder builder) {
        builder.addNetworkInterceptor(this.interceptor);
    }
}
