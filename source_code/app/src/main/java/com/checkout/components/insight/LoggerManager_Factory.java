package com.checkout.components.insight;

import android.content.Context;
import com.checkout.components.insight.usecase.SendLogsUseCase;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import vf.ab;

/* loaded from: classes3.dex */
public final class LoggerManager_Factory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final dagger.internal.d f5115a;

    /* renamed from: b, reason: collision with root package name */
    private final dagger.internal.d f5116b;

    /* renamed from: c, reason: collision with root package name */
    private final dagger.internal.d f5117c;

    /* renamed from: d, reason: collision with root package name */
    private final dagger.internal.d f5118d;
    private final dagger.internal.d e;

    /* renamed from: f, reason: collision with root package name */
    private final dagger.internal.d f5119f;

    /* renamed from: g, reason: collision with root package name */
    private final dagger.internal.d f5120g;

    /* renamed from: h, reason: collision with root package name */
    private final dagger.internal.d f5121h;

    /* renamed from: i, reason: collision with root package name */
    private final dagger.internal.d f5122i;

    public LoggerManager_Factory(dagger.internal.d dVar, dagger.internal.d dVar2, dagger.internal.d dVar3, dagger.internal.d dVar4, dagger.internal.d dVar5, dagger.internal.d dVar6, dagger.internal.d dVar7, dagger.internal.d dVar8, dagger.internal.d dVar9) {
        this.f5115a = dVar;
        this.f5116b = dVar2;
        this.f5117c = dVar3;
        this.f5118d = dVar4;
        this.e = dVar5;
        this.f5119f = dVar6;
        this.f5120g = dVar7;
        this.f5121h = dVar8;
        this.f5122i = dVar9;
    }

    public static LoggerManager_Factory create(dagger.internal.d dVar, dagger.internal.d dVar2, dagger.internal.d dVar3, dagger.internal.d dVar4, dagger.internal.d dVar5, dagger.internal.d dVar6, dagger.internal.d dVar7, dagger.internal.d dVar8, dagger.internal.d dVar9) {
        return new LoggerManager_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9);
    }

    public static LoggerManager newInstance(String str, String str2, PaymentSessionDetails paymentSessionDetails, Context context, SendLogsUseCase sendLogsUseCase, boolean z2, boolean z10, TimestampFormatter timestampFormatter, ab abVar) {
        return new LoggerManager(str, str2, paymentSessionDetails, context, sendLogsUseCase, z2, z10, timestampFormatter, abVar);
    }

    @Override // Kd.a
    public final LoggerManager get() {
        return new LoggerManager((String) this.f5115a.get(), (String) this.f5116b.get(), (PaymentSessionDetails) this.f5117c.get(), (Context) this.f5118d.get(), (SendLogsUseCase) this.e.get(), ((Boolean) this.f5119f.get()).booleanValue(), ((Boolean) this.f5120g.get()).booleanValue(), (TimestampFormatter) this.f5121h.get(), (ab) this.f5122i.get());
    }
}
