package delivery.samurai.android.injections.modules;

import Q9.f;
import dagger.internal.b;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes2.dex */
public final class RetrofitModule_GetPublicRetrofitClientFactory implements b {
    private final f alpha;

    public static at bravo(f fVar) {
        at publicRetrofitClient = fVar.getPublicRetrofitClient();
        AbstractC2763s0.delta(publicRetrofitClient);
        return publicRetrofitClient;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public at get() {
        return bravo(this.alpha);
    }
}
