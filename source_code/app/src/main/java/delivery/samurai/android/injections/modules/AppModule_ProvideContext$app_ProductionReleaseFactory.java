package delivery.samurai.android.injections.modules;

import Q9.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class AppModule_ProvideContext$app_ProductionReleaseFactory implements b {
    private final a alpha;

    public static Context bravo(a aVar) {
        Context provideContext$app_ProductionRelease = aVar.provideContext$app_ProductionRelease();
        AbstractC2763s0.delta(provideContext$app_ProductionRelease);
        return provideContext$app_ProductionRelease;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return bravo(this.alpha);
    }
}
