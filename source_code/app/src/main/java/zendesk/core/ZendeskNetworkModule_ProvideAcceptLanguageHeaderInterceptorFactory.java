package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory implements b {
    private final a contextProvider;

    public ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory create(a aVar) {
        return new ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(aVar);
    }

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor = ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor(context);
        AbstractC2763s0.delta(provideAcceptLanguageHeaderInterceptor);
        return provideAcceptLanguageHeaderInterceptor;
    }

    @Override // Kd.a
    public AcceptLanguageHeaderInterceptor get() {
        return provideAcceptLanguageHeaderInterceptor((Context) this.contextProvider.get());
    }
}
