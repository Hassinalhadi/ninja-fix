package zendesk.core;

import Kd.a;
import dagger.internal.b;
import java.io.File;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements b {
    private final a fileProvider;
    private final a serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(a aVar, a aVar2) {
        this.fileProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvidesDiskLruStorageFactory create(a aVar, a aVar2) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(aVar, aVar2);
    }

    public static BaseStorage providesDiskLruStorage(File file, Object obj) {
        BaseStorage providesDiskLruStorage = ZendeskStorageModule.providesDiskLruStorage(file, (Serializer) obj);
        AbstractC2763s0.delta(providesDiskLruStorage);
        return providesDiskLruStorage;
    }

    @Override // Kd.a
    public BaseStorage get() {
        return providesDiskLruStorage((File) this.fileProvider.get(), this.serializerProvider.get());
    }
}
