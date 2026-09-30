package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class DataModule_GetRemoteConfigsFactory implements b {
    private final d alpha;

    public static E8.b bravo(d dVar) {
        E8.b remoteConfigs = dVar.getRemoteConfigs();
        AbstractC2763s0.delta(remoteConfigs);
        return remoteConfigs;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public E8.b get() {
        return bravo(this.alpha);
    }
}
