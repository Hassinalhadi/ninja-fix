package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;
import zendesk.core.MediaFileResolver;

/* loaded from: classes.dex */
public final class MessagingActivityModule_UriTaskResolverFactory implements b {
    private final a executorServiceProvider;
    private final a mediaFileResolverProvider;

    public MessagingActivityModule_UriTaskResolverFactory(a aVar, a aVar2) {
        this.mediaFileResolverProvider = aVar;
        this.executorServiceProvider = aVar2;
    }

    public static MessagingActivityModule_UriTaskResolverFactory create(a aVar, a aVar2) {
        return new MessagingActivityModule_UriTaskResolverFactory(aVar, aVar2);
    }

    public static UriResolver uriTaskResolver(MediaFileResolver mediaFileResolver, ExecutorService executorService) {
        UriResolver uriTaskResolver = MessagingActivityModule.uriTaskResolver(mediaFileResolver, executorService);
        AbstractC2763s0.delta(uriTaskResolver);
        return uriTaskResolver;
    }

    @Override // Kd.a
    public UriResolver get() {
        return uriTaskResolver((MediaFileResolver) this.mediaFileResolverProvider.get(), (ExecutorService) this.executorServiceProvider.get());
    }
}
