package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements b {
    private final a gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, a aVar) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = aVar;
    }

    public static ZendeskApplicationModule_ProvideBase64SerializerFactory create(ZendeskApplicationModule zendeskApplicationModule, a aVar) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, aVar);
    }

    public static Serializer provideBase64Serializer(ZendeskApplicationModule zendeskApplicationModule, Object obj) {
        Serializer provideBase64Serializer = zendeskApplicationModule.provideBase64Serializer((Serializer) obj);
        AbstractC2763s0.delta(provideBase64Serializer);
        return provideBase64Serializer;
    }

    @Override // Kd.a
    public Serializer get() {
        return provideBase64Serializer(this.module, this.gsonSerializerProvider.get());
    }
}
