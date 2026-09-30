package io.getunleash.android;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.data.ImpressionEvent;
import io.getunleash.android.events.UnleashImpressionEventListener;
import io.getunleash.android.events.UnleashListener;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.InterfaceC3440j;
import yf.as;

@e(c = "io.getunleash.android.DefaultUnleash$addUnleashEventListener$job$3", f = "DefaultUnleash.kt", l = {387}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class DefaultUnleash$addUnleashEventListener$job$3 extends i implements l {
    final /* synthetic */ UnleashListener $listener;
    int label;
    final /* synthetic */ DefaultUnleash this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$addUnleashEventListener$job$3(DefaultUnleash defaultUnleash, UnleashListener unleashListener, c<? super DefaultUnleash$addUnleashEventListener$job$3> cVar) {
        super(2, cVar);
        this.this$0 = defaultUnleash;
        this.$listener = unleashListener;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultUnleash$addUnleashEventListener$job$3(this.this$0, this.$listener, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        as asVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            asVar = this.this$0.impressionEventsFlow;
            final UnleashListener unleashListener = this.$listener;
            InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: io.getunleash.android.DefaultUnleash$addUnleashEventListener$job$3.1
                @Override // yf.InterfaceC3440j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((ImpressionEvent) obj2, (c<? super Unit>) cVar);
                }

                public final Object emit(ImpressionEvent impressionEvent, c<? super Unit> cVar) {
                    ((UnleashImpressionEventListener) UnleashListener.this).onImpression(impressionEvent);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (asVar.collect(interfaceC3440j, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((DefaultUnleash$addUnleashEventListener$job$3) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
