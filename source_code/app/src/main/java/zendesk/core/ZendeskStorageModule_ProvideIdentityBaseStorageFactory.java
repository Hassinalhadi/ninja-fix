package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideIdentityBaseStorageFactory implements b {
    private final a contextProvider;
    private final a serializerProvider;

    public ZendeskStorageModule_ProvideIdentityBaseStorageFactory(a aVar, a aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideIdentityBaseStorageFactory create(a aVar, a aVar2) {
        return new ZendeskStorageModule_ProvideIdentityBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideIdentityBaseStorage(Context context, Object obj) {
        BaseStorage provideIdentityBaseStorage = ZendeskStorageModule.provideIdentityBaseStorage(context, (Serializer) obj);
        AbstractC2763s0.delta(provideIdentityBaseStorage);
        return provideIdentityBaseStorage;
    }

    @Override // Kd.a
    public BaseStorage get() {
        return provideIdentityBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
