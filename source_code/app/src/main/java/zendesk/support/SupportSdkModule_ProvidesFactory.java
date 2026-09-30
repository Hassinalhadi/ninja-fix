package zendesk.support;

import com.google.gson.l;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportSdkModule_ProvidesFactory implements b {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_ProvidesFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesFactory(supportSdkModule);
    }

    public static l provides(SupportSdkModule supportSdkModule) {
        l provides = supportSdkModule.provides();
        AbstractC2763s0.delta(provides);
        return provides;
    }

    @Override // Kd.a
    public l get() {
        return provides(this.module);
    }
}
