package zendesk.support;

import Kd.a;
import com.google.gson.l;
import dagger.internal.b;
import i9.f;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportSdkModule_SupportUiStorageFactory implements b {
    private final a diskLruCacheProvider;
    private final a gsonProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_SupportUiStorageFactory(SupportSdkModule supportSdkModule, a aVar, a aVar2) {
        this.module = supportSdkModule;
        this.diskLruCacheProvider = aVar;
        this.gsonProvider = aVar2;
    }

    public static SupportSdkModule_SupportUiStorageFactory create(SupportSdkModule supportSdkModule, a aVar, a aVar2) {
        return new SupportSdkModule_SupportUiStorageFactory(supportSdkModule, aVar, aVar2);
    }

    public static SupportUiStorage supportUiStorage(SupportSdkModule supportSdkModule, f fVar, l lVar) {
        SupportUiStorage supportUiStorage = supportSdkModule.supportUiStorage(fVar, lVar);
        AbstractC2763s0.delta(supportUiStorage);
        return supportUiStorage;
    }

    @Override // Kd.a
    public SupportUiStorage get() {
        return supportUiStorage(this.module, (f) this.diskLruCacheProvider.get(), (l) this.gsonProvider.get());
    }
}
