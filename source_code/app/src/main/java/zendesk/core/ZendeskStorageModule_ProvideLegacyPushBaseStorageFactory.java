package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory implements b {
    private final a contextProvider;
    private final a serializerProvider;

    public ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(a aVar, a aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory create(a aVar, a aVar2) {
        return new ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(aVar, aVar2);
    }

    public static SharedPreferencesStorage provideLegacyPushBaseStorage(Context context, Object obj) {
        SharedPreferencesStorage provideLegacyPushBaseStorage = ZendeskStorageModule.provideLegacyPushBaseStorage(context, (Serializer) obj);
        AbstractC2763s0.delta(provideLegacyPushBaseStorage);
        return provideLegacyPushBaseStorage;
    }

    @Override // Kd.a
    public SharedPreferencesStorage get() {
        return provideLegacyPushBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
