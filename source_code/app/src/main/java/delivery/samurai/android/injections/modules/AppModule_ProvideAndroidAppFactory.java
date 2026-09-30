package delivery.samurai.android.injections.modules;

import Q9.a;
import android.content.Context;
import dagger.internal.b;
import dagger.internal.d;
import delivery.samurai.android.AndroidApp;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class AppModule_ProvideAndroidAppFactory implements b {
    private final a alpha;
    private final d bravo;

    public static AndroidApp bravo(a aVar, Context context) {
        AndroidApp provideAndroidApp = aVar.provideAndroidApp(context);
        AbstractC2763s0.delta(provideAndroidApp);
        return provideAndroidApp;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public AndroidApp get() {
        return bravo(this.alpha, (Context) this.bravo.get());
    }
}
