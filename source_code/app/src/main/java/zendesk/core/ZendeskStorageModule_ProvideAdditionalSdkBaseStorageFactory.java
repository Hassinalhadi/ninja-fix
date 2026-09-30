package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory implements b {
    private final a contextProvider;
    private final a serializerProvider;

    public ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(a aVar, a aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory create(a aVar, a aVar2) {
        return new ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideAdditionalSdkBaseStorage(Context context, Object obj) {
        BaseStorage provideAdditionalSdkBaseStorage = ZendeskStorageModule.provideAdditionalSdkBaseStorage(context, (Serializer) obj);
        AbstractC2763s0.delta(provideAdditionalSdkBaseStorage);
        return provideAdditionalSdkBaseStorage;
    }

    @Override // Kd.a
    public BaseStorage get() {
        return provideAdditionalSdkBaseStorage((Context) this.contextProvider.get(), this.serializerProvider.get());
    }
}
