package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetMachineIdStorageFactory implements b {
    private final CoreModule module;

    public CoreModule_GetMachineIdStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMachineIdStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetMachineIdStorageFactory(coreModule);
    }

    public static MachineIdStorage getMachineIdStorage(CoreModule coreModule) {
        MachineIdStorage machineIdStorage = coreModule.getMachineIdStorage();
        AbstractC2763s0.delta(machineIdStorage);
        return machineIdStorage;
    }

    @Override // Kd.a
    public MachineIdStorage get() {
        return getMachineIdStorage(this.module);
    }
}
