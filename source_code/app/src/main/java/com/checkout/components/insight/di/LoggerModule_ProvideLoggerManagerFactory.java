package com.checkout.components.insight.di;

import android.content.Context;
import com.checkout.components.insight.LoggerManager;
import com.checkout.components.insight.usecase.SendLogsUseCase;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class LoggerModule_ProvideLoggerManagerFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final LoggerModule f5226a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5227b;

    /* renamed from: c, reason: collision with root package name */
    private final d f5228c;

    /* renamed from: d, reason: collision with root package name */
    private final d f5229d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f5230f;

    /* renamed from: g, reason: collision with root package name */
    private final d f5231g;

    public LoggerModule_ProvideLoggerManagerFactory(LoggerModule loggerModule, d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        this.f5226a = loggerModule;
        this.f5227b = dVar;
        this.f5228c = dVar2;
        this.f5229d = dVar3;
        this.e = dVar4;
        this.f5230f = dVar5;
        this.f5231g = dVar6;
    }

    public static LoggerModule_ProvideLoggerManagerFactory create(LoggerModule loggerModule, d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        return new LoggerModule_ProvideLoggerManagerFactory(loggerModule, dVar, dVar2, dVar3, dVar4, dVar5, dVar6);
    }

    public static LoggerManager provideLoggerManager(LoggerModule loggerModule, String str, String str2, PaymentSessionDetails paymentSessionDetails, Context context, SendLogsUseCase sendLogsUseCase, boolean z2) {
        LoggerManager provideLoggerManager = loggerModule.provideLoggerManager(str, str2, paymentSessionDetails, context, sendLogsUseCase, z2);
        AbstractC2763s0.delta(provideLoggerManager);
        return provideLoggerManager;
    }

    @Override // Kd.a
    public final LoggerManager get() {
        LoggerManager provideLoggerManager = this.f5226a.provideLoggerManager((String) this.f5227b.get(), (String) this.f5228c.get(), (PaymentSessionDetails) this.f5229d.get(), (Context) this.e.get(), (SendLogsUseCase) this.f5230f.get(), ((Boolean) this.f5231g.get()).booleanValue());
        AbstractC2763s0.delta(provideLoggerManager);
        return provideLoggerManager;
    }
}
