package zendesk.support;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class StorageModule_ProvideRequestMigratorFactory implements b {
    private final a contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideRequestMigratorFactory(StorageModule storageModule, a aVar) {
        this.module = storageModule;
        this.contextProvider = aVar;
    }

    public static StorageModule_ProvideRequestMigratorFactory create(StorageModule storageModule, a aVar) {
        return new StorageModule_ProvideRequestMigratorFactory(storageModule, aVar);
    }

    public static RequestMigrator provideRequestMigrator(StorageModule storageModule, Context context) {
        RequestMigrator provideRequestMigrator = storageModule.provideRequestMigrator(context);
        AbstractC2763s0.delta(provideRequestMigrator);
        return provideRequestMigrator;
    }

    @Override // Kd.a
    public RequestMigrator get() {
        return provideRequestMigrator(this.module, (Context) this.contextProvider.get());
    }
}
