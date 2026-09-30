package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideMachineIdStorageFactory implements b {
    private final a contextProvider;

    public ZendeskStorageModule_ProvideMachineIdStorageFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideMachineIdStorageFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideMachineIdStorageFactory(aVar);
    }

    public static MachineIdStorage provideMachineIdStorage(Context context) {
        MachineIdStorage provideMachineIdStorage = ZendeskStorageModule.provideMachineIdStorage(context);
        AbstractC2763s0.delta(provideMachineIdStorage);
        return provideMachineIdStorage;
    }

    @Override // Kd.a
    public MachineIdStorage get() {
        return provideMachineIdStorage((Context) this.contextProvider.get());
    }
}
