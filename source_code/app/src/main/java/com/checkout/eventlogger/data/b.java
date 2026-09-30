package com.checkout.eventlogger.data;

import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.eventlogger.domain.model.MonitoringLevel;
import com.checkout.eventlogger.network.b.b;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.eventlogger.data.CheckoutEventLoggingService$sendCloudEvents$1", f = "CheckoutEventLoggingService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f6556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, List list, Nd.c cVar) {
        super(2, cVar);
        this.f6556a = aVar;
        this.f6557b = list;
    }

    @Override // Pd.a
    @NotNull
    public final Nd.c<Unit> create(@Nullable Object obj, @NotNull Nd.c<?> completion) {
        Intrinsics.echo(completion, "completion");
        return new b(this.f6556a, this.f6557b, completion);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create(obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        String payload = ((com.google.gson.l) this.f6556a.f6551b.getValue()).india(this.f6557b);
        com.checkout.eventlogger.network.b.a aVar2 = this.f6556a.f6552c;
        Intrinsics.delta(payload, "payload");
        com.checkout.eventlogger.network.b.b<Unit> a6 = aVar2.a(payload);
        if (!(a6 instanceof b.c)) {
            if (a6 instanceof b.C0005b) {
                String message = "Failed to send logging data: " + ((b.C0005b) a6).f6603a;
                MonitoringLevel monitoringLevel = MonitoringLevel.DEBUG;
                Intrinsics.echo(message, "message");
                Intrinsics.echo(monitoringLevel, "monitoringLevel");
            } else if (a6 instanceof b.a) {
                Throwable th = ((b.a) a6).f6602a;
            }
        }
        return Unit.INSTANCE;
    }
}
