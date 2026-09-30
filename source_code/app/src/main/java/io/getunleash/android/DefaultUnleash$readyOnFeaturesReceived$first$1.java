package io.getunleash.android;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.data.UnleashState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;

@e(c = "io.getunleash.android.DefaultUnleash$readyOnFeaturesReceived$first$1", f = "DefaultUnleash.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/getunleash/android/data/UnleashState;"}, k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultUnleash$readyOnFeaturesReceived$first$1 extends i implements l {
    /* synthetic */ Object L$0;
    int label;

    public DefaultUnleash$readyOnFeaturesReceived$first$1(c<? super DefaultUnleash$readyOnFeaturesReceived$first$1> cVar) {
        super(2, cVar);
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        DefaultUnleash$readyOnFeaturesReceived$first$1 defaultUnleash$readyOnFeaturesReceived$first$1 = new DefaultUnleash$readyOnFeaturesReceived$first$1(cVar);
        defaultUnleash$readyOnFeaturesReceived$first$1.L$0 = obj;
        return defaultUnleash$readyOnFeaturesReceived$first$1;
    }

    @Override // Xd.l
    public final Object invoke(UnleashState unleashState, c<? super Boolean> cVar) {
        return ((DefaultUnleash$readyOnFeaturesReceived$first$1) create(unleashState, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        UnleashState unleashState = (UnleashState) this.L$0;
        Od.a aVar = Od.a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            return Boolean.valueOf(!unleashState.getToggles().isEmpty());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
