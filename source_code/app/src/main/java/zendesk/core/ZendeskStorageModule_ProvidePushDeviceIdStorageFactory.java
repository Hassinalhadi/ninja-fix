package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements b {
    private final a additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(a aVar) {
        this.additionalSdkStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidePushDeviceIdStorageFactory create(a aVar) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(aVar);
    }

    public static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        PushDeviceIdStorage providePushDeviceIdStorage = ZendeskStorageModule.providePushDeviceIdStorage(baseStorage);
        AbstractC2763s0.delta(providePushDeviceIdStorage);
        return providePushDeviceIdStorage;
    }

    @Override // Kd.a
    public PushDeviceIdStorage get() {
        return providePushDeviceIdStorage((BaseStorage) this.additionalSdkStorageProvider.get());
    }
}
