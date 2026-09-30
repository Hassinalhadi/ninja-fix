package io.getunleash.android.cache;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.data.UnleashState;
import io.getunleash.android.util.UnleashLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.as;

@e(c = "io.getunleash.android.cache.ObservableCache$write$1", f = "ObservableCache.kt", l = {38}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class ObservableCache$write$1 extends i implements l {
    final /* synthetic */ UnleashState $state;
    int label;
    final /* synthetic */ ObservableCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableCache$write$1(UnleashState unleashState, ObservableCache observableCache, c<? super ObservableCache$write$1> cVar) {
        super(2, cVar);
        this.$state = unleashState;
        this.this$0 = observableCache;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ObservableCache$write$1(this.$state, this.this$0, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        as asVar;
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
            UnleashLogger.d$default(UnleashLogger.INSTANCE, "ObservableCache", "Emitting new state with " + this.$state.getToggles().size() + " toggles", null, 4, null);
            asVar = this.this$0.newStateEventFlow;
            UnleashState unleashState = this.$state;
            this.label = 1;
            if (asVar.emit(unleashState, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((ObservableCache$write$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
