package zendesk.support.request;

import android.content.Context;
import s6.AbstractC2763s0;
import zendesk.core.MediaFileResolver;

/* loaded from: classes.dex */
public final class RequestModule_ProvideMediaResultUtilityFactory implements dagger.internal.b {
    private final Kd.a contextProvider;
    private final Kd.a mediaFileResolverProvider;
    private final RequestModule module;

    public RequestModule_ProvideMediaResultUtilityFactory(RequestModule requestModule, Kd.a aVar, Kd.a aVar2) {
        this.module = requestModule;
        this.contextProvider = aVar;
        this.mediaFileResolverProvider = aVar2;
    }

    public static RequestModule_ProvideMediaResultUtilityFactory create(RequestModule requestModule, Kd.a aVar, Kd.a aVar2) {
        return new RequestModule_ProvideMediaResultUtilityFactory(requestModule, aVar, aVar2);
    }

    public static MediaResultUtility provideMediaResultUtility(RequestModule requestModule, Context context, MediaFileResolver mediaFileResolver) {
        MediaResultUtility provideMediaResultUtility = requestModule.provideMediaResultUtility(context, mediaFileResolver);
        AbstractC2763s0.delta(provideMediaResultUtility);
        return provideMediaResultUtility;
    }

    @Override // Kd.a
    public MediaResultUtility get() {
        return provideMediaResultUtility(this.module, (Context) this.contextProvider.get(), (MediaFileResolver) this.mediaFileResolverProvider.get());
    }
}
