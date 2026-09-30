package delivery.samurai.android.injections.modules;

import Q9.c;
import android.content.Context;
import com.app.feature.location.api.AllowMockProvider;
import dagger.internal.b;
import dagger.internal.d;
import o3.g;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLocationHealthCheckerFactory implements b {
    private final d alpha;
    private final d bravo;

    public static g bravo(Context context, AllowMockProvider allowMockProvider) {
        g provideLocationHealthChecker = c.alpha.provideLocationHealthChecker(context, allowMockProvider);
        AbstractC2763s0.delta(provideLocationHealthChecker);
        return provideLocationHealthChecker;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public g get() {
        return bravo((Context) this.alpha.get(), (AllowMockProvider) this.bravo.get());
    }
}
