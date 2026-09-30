package zendesk.core;

import dagger.internal.b;
import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor provideHttpLoggingInterceptor = ZendeskApplicationModule.provideHttpLoggingInterceptor();
        AbstractC2763s0.delta(provideHttpLoggingInterceptor);
        return provideHttpLoggingInterceptor;
    }

    @Override // Kd.a
    public HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor();
    }
}
