package delivery.samurai.android.injections.modules;

import Q9.f;
import com.google.gson.l;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class RetrofitModule_ProvideGsonFactory implements b {
    private final f alpha;

    public static l bravo(f fVar) {
        l provideGson = fVar.provideGson();
        AbstractC2763s0.delta(provideGson);
        return provideGson;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public l get() {
        return bravo(this.alpha);
    }
}
