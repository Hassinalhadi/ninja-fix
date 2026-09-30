package zendesk.core;

import com.google.gson.l;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideGsonFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideGsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static l provideGson() {
        l provideGson = ZendeskApplicationModule.provideGson();
        AbstractC2763s0.delta(provideGson);
        return provideGson;
    }

    @Override // Kd.a
    public l get() {
        return provideGson();
    }
}
