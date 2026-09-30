package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideSdkBaseStorageFactory implements b {
    private final a contextProvider;
    private final a serializerProvider;

    public ZendeskStorageModule_ProvideSdkBaseStorageFactory(a aVar, a aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideSdkBaseStorageFactory create(a aVar, a aVar2) {
        return new ZendeskStorageModule_ProvideSdkBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideSdkBaseStorage(Context context, Object obj) {
        BaseStorage provideSdkBaseStorage = ZendeskStorageModule.provideSdkBaseStorage(context, (Serializer) obj);
        AbstractC2763s0.delta(provideSdkBaseStorage);
        return provideSdkBaseStorage;
    }

    @Override // Kd.a
    public BaseStorage get() {
        return provideSdkBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
