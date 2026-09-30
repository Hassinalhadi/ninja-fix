package zendesk.support;

import dagger.internal.b;
import java.util.concurrent.Executor;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportSdkModule_MainThreadExecutorFactory implements b {
    private final SupportSdkModule module;

    public SupportSdkModule_MainThreadExecutorFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_MainThreadExecutorFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_MainThreadExecutorFactory(supportSdkModule);
    }

    public static Executor mainThreadExecutor(SupportSdkModule supportSdkModule) {
        Executor mainThreadExecutor = supportSdkModule.mainThreadExecutor();
        AbstractC2763s0.delta(mainThreadExecutor);
        return mainThreadExecutor;
    }

    @Override // Kd.a
    public Executor get() {
        return mainThreadExecutor(this.module);
    }
}
