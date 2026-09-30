package com.checkout.components.insight.di;

import android.content.Context;
import com.checkout.components.insight.LoggerManager;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import dagger.internal.InstanceFactory;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class b implements LoggerComponent {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.b f5246a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.b f5247b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.b f5248c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.b f5249d;
    public final d e;

    /* renamed from: f, reason: collision with root package name */
    public final d f5250f;

    /* renamed from: g, reason: collision with root package name */
    public final d f5251g;

    /* renamed from: h, reason: collision with root package name */
    public final d f5252h;

    public b(LoggerModule loggerModule, NetworkModule networkModule, String str, String str2, PaymentSessionDetails paymentSessionDetails, Context context, Environment environment, Boolean bool) {
        InstanceFactory alpha = InstanceFactory.alpha(str);
        this.f5246a = alpha;
        InstanceFactory alpha2 = InstanceFactory.alpha(str2);
        this.f5247b = alpha2;
        InstanceFactory alpha3 = InstanceFactory.alpha(paymentSessionDetails);
        this.f5248c = alpha3;
        InstanceFactory alpha4 = InstanceFactory.alpha(context);
        this.f5249d = alpha4;
        d bravo = dagger.internal.a.bravo(new NetworkModule_ProvideMoshiFactory(networkModule));
        this.e = bravo;
        d bravo2 = dagger.internal.a.bravo(new NetworkModule_ProvideOkHttpClient$insight_standardReleaseFactory(networkModule, dagger.internal.a.bravo(new NetworkModule_ProvideLoggingInterceptor$insight_standardReleaseFactory(networkModule))));
        this.f5250f = bravo2;
        d bravo3 = dagger.internal.a.bravo(new NetworkModule_ProvideSendLogsUseCaseFactory(networkModule, dagger.internal.a.bravo(new NetworkModule_ProvideInsightRepository$insight_standardReleaseFactory(networkModule, dagger.internal.a.bravo(new NetworkModule_ProvideInsightApi$insight_standardReleaseFactory(networkModule, bravo, bravo2, dagger.internal.a.bravo(new NetworkModule_ProvideEnvironmentConfigFactory(networkModule, InstanceFactory.alpha(environment)))))))));
        this.f5251g = bravo3;
        this.f5252h = dagger.internal.a.bravo(new LoggerModule_ProvideLoggerManagerFactory(loggerModule, alpha, alpha2, alpha3, alpha4, bravo3, InstanceFactory.alpha(bool)));
    }

    @Override // com.checkout.components.insight.di.LoggerComponent
    public final LoggerManager getLogger() {
        return (LoggerManager) this.f5252h.get();
    }
}
