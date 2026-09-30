package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory implements b {
    private final a contextProvider;
    private final a serializerProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(a aVar, a aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory create(a aVar, a aVar2) {
        return new ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(aVar, aVar2);
    }

    public static SharedPreferencesStorage provideLegacyIdentityBaseStorage(Context context, Object obj) {
        SharedPreferencesStorage provideLegacyIdentityBaseStorage = ZendeskStorageModule.provideLegacyIdentityBaseStorage(context, (Serializer) obj);
        AbstractC2763s0.delta(provideLegacyIdentityBaseStorage);
        return provideLegacyIdentityBaseStorage;
    }

    @Override // Kd.a
    public SharedPreferencesStorage get() {
        return provideLegacyIdentityBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
