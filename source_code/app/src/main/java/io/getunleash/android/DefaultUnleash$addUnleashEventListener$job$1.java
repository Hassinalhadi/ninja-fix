package io.getunleash.android;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.events.UnleashListener;
import io.getunleash.android.events.UnleashReadyListener;
import io.getunleash.android.util.UnleashLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

@e(c = "io.getunleash.android.DefaultUnleash$addUnleashEventListener$job$1", f = "DefaultUnleash.kt", l = {369}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class DefaultUnleash$addUnleashEventListener$job$1 extends i implements l {
    final /* synthetic */ UnleashListener $listener;
    int label;
    final /* synthetic */ DefaultUnleash this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$addUnleashEventListener$job$1(DefaultUnleash defaultUnleash, UnleashListener unleashListener, c<? super DefaultUnleash$addUnleashEventListener$job$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultUnleash;
        this.$listener = unleashListener;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultUnleash$addUnleashEventListener$job$1(this.this$0, this.$listener, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object readyOnFeaturesReceived;
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
            DefaultUnleash defaultUnleash = this.this$0;
            this.label = 1;
            readyOnFeaturesReceived = defaultUnleash.readyOnFeaturesReceived(this);
            if (readyOnFeaturesReceived == aVar) {
                return aVar;
            }
        }
        UnleashLogger.d$default(UnleashLogger.INSTANCE, "Unleash", "Notifying UnleashReadyListener", null, 4, null);
        ((UnleashReadyListener) this.$listener).onReady();
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((DefaultUnleash$addUnleashEventListener$job$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
