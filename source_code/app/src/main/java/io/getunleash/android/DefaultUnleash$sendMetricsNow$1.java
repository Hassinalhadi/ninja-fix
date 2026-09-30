package io.getunleash.android;

import Cf.d;
import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.metrics.MetricsHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;
import vf.ao;

@e(c = "io.getunleash.android.DefaultUnleash$sendMetricsNow$1", f = "DefaultUnleash.kt", l = {309}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class DefaultUnleash$sendMetricsNow$1 extends i implements l {
    int label;
    final /* synthetic */ DefaultUnleash this$0;

    @e(c = "io.getunleash.android.DefaultUnleash$sendMetricsNow$1$1", f = "DefaultUnleash.kt", l = {310}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
    /* renamed from: io.getunleash.android.DefaultUnleash$sendMetricsNow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements l {
        int label;
        final /* synthetic */ DefaultUnleash this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultUnleash defaultUnleash, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = defaultUnleash;
        }

        @Override // Pd.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // Pd.a
        public final Object invokeSuspend(Object obj) {
            MetricsHandler metricsHandler;
            Od.a aVar = Od.a.alpha;
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                metricsHandler = this.this$0.metrics;
                this.label = 1;
                if (io.getunleash.android.metrics.a.alpha(metricsHandler, null, this, 1, null) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // Xd.l
        public final Object invoke(ab abVar, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$sendMetricsNow$1(DefaultUnleash defaultUnleash, c<? super DefaultUnleash$sendMetricsNow$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultUnleash;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultUnleash$sendMetricsNow$1(this.this$0, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            Cf.e eVar = ao.alpha;
            d dVar = d.purple;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (ad.blue(dVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((DefaultUnleash$sendMetricsNow$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
