package zendesk.core;

import Kd.a;
import com.google.gson.l;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideSerializerFactory implements b {
    private final a gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(a aVar) {
        this.gsonProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideSerializerFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideSerializerFactory(aVar);
    }

    public static Serializer provideSerializer(l lVar) {
        Serializer provideSerializer = ZendeskStorageModule.provideSerializer(lVar);
        AbstractC2763s0.delta(provideSerializer);
        return provideSerializer;
    }

    @Override // Kd.a
    public Serializer get() {
        return provideSerializer((l) this.gsonProvider.get());
    }
}
