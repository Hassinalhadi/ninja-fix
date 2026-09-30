package io.getunleash.android;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.events.HeartbeatEvent;
import io.getunleash.android.events.UnleashFetcherHeartbeatListener;
import io.getunleash.android.events.UnleashListener;
import io.getunleash.android.polling.UnleashFetcher;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.InterfaceC3440j;
import yf.aw;

@e(c = "io.getunleash.android.DefaultUnleash$addUnleashEventListener$job$4", f = "DefaultUnleash.kt", l = {396}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class DefaultUnleash$addUnleashEventListener$job$4 extends i implements l {
    final /* synthetic */ UnleashListener $listener;
    int label;
    final /* synthetic */ DefaultUnleash this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$addUnleashEventListener$job$4(DefaultUnleash defaultUnleash, UnleashListener unleashListener, c<? super DefaultUnleash$addUnleashEventListener$job$4> cVar) {
        super(2, cVar);
        this.this$0 = defaultUnleash;
        this.$listener = unleashListener;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultUnleash$addUnleashEventListener$job$4(this.this$0, this.$listener, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        UnleashFetcher unleashFetcher;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            unleashFetcher = this.this$0.fetcher;
            aw heartbeatFlow = unleashFetcher.getHeartbeatFlow();
            final UnleashListener unleashListener = this.$listener;
            InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: io.getunleash.android.DefaultUnleash$addUnleashEventListener$job$4.1
                @Override // yf.InterfaceC3440j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((HeartbeatEvent) obj2, (c<? super Unit>) cVar);
                }

                public final Object emit(HeartbeatEvent heartbeatEvent, c<? super Unit> cVar) {
                    if (heartbeatEvent.getStatus().isFailed()) {
                        ((UnleashFetcherHeartbeatListener) UnleashListener.this).onError(heartbeatEvent);
                    } else if (heartbeatEvent.getStatus().isNotModified()) {
                        ((UnleashFetcherHeartbeatListener) UnleashListener.this).togglesChecked();
                    } else if (heartbeatEvent.getStatus().isSuccess()) {
                        ((UnleashFetcherHeartbeatListener) UnleashListener.this).togglesUpdated();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (heartbeatFlow.collect(interfaceC3440j, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((DefaultUnleash$addUnleashEventListener$job$4) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
