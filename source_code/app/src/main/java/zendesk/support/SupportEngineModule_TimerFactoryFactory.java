package zendesk.support;

import Kd.a;
import android.os.Handler;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.components.Timer;

/* loaded from: classes.dex */
public final class SupportEngineModule_TimerFactoryFactory implements b {
    private final a handlerProvider;
    private final SupportEngineModule module;

    public SupportEngineModule_TimerFactoryFactory(SupportEngineModule supportEngineModule, a aVar) {
        this.module = supportEngineModule;
        this.handlerProvider = aVar;
    }

    public static SupportEngineModule_TimerFactoryFactory create(SupportEngineModule supportEngineModule, a aVar) {
        return new SupportEngineModule_TimerFactoryFactory(supportEngineModule, aVar);
    }

    public static Timer.Factory timerFactory(SupportEngineModule supportEngineModule, Handler handler) {
        Timer.Factory timerFactory = supportEngineModule.timerFactory(handler);
        AbstractC2763s0.delta(timerFactory);
        return timerFactory;
    }

    @Override // Kd.a
    public Timer.Factory get() {
        return timerFactory(this.module, (Handler) this.handlerProvider.get());
    }
}
