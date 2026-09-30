package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import zendesk.core.MediaFileResolver;

/* loaded from: classes.dex */
public final class UriResolver_Factory implements b {
    private final a executorServiceProvider;
    private final a mediaFileResolverProvider;

    public UriResolver_Factory(a aVar, a aVar2) {
        this.mediaFileResolverProvider = aVar;
        this.executorServiceProvider = aVar2;
    }

    public static UriResolver_Factory create(a aVar, a aVar2) {
        return new UriResolver_Factory(aVar, aVar2);
    }

    public static UriResolver newInstance(MediaFileResolver mediaFileResolver, ExecutorService executorService) {
        return new UriResolver(mediaFileResolver, executorService);
    }

    @Override // Kd.a
    public UriResolver get() {
        return newInstance((MediaFileResolver) this.mediaFileResolverProvider.get(), (ExecutorService) this.executorServiceProvider.get());
    }
}
