package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideSettingsBaseStorageFactory implements b {
    private final a contextProvider;
    private final a serializerProvider;

    public ZendeskStorageModule_ProvideSettingsBaseStorageFactory(a aVar, a aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideSettingsBaseStorageFactory create(a aVar, a aVar2) {
        return new ZendeskStorageModule_ProvideSettingsBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideSettingsBaseStorage(Context context, Object obj) {
        BaseStorage provideSettingsBaseStorage = ZendeskStorageModule.provideSettingsBaseStorage(context, (Serializer) obj);
        AbstractC2763s0.delta(provideSettingsBaseStorage);
        return provideSettingsBaseStorage;
    }

    @Override // Kd.a
    public BaseStorage get() {
        return provideSettingsBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
