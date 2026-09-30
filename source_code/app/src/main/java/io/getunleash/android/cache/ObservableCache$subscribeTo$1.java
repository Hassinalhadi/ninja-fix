package io.getunleash.android.cache;

import Cf.d;
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
import vf.ad;
import vf.ao;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

@e(c = "io.getunleash.android.cache.ObservableCache$subscribeTo$1", f = "ObservableCache.kt", l = {45}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class ObservableCache$subscribeTo$1 extends i implements l {
    final /* synthetic */ InterfaceC3439i $featuresReceived;
    int label;
    final /* synthetic */ ObservableCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableCache$subscribeTo$1(InterfaceC3439i interfaceC3439i, ObservableCache observableCache, c<? super ObservableCache$subscribeTo$1> cVar) {
        super(2, cVar);
        this.$featuresReceived = interfaceC3439i;
        this.this$0 = observableCache;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ObservableCache$subscribeTo$1(this.$featuresReceived, this.this$0, cVar);
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
            InterfaceC3439i interfaceC3439i = this.$featuresReceived;
            final ObservableCache observableCache = this.this$0;
            InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: io.getunleash.android.cache.ObservableCache$subscribeTo$1.1

                @e(c = "io.getunleash.android.cache.ObservableCache$subscribeTo$1$1$1", f = "ObservableCache.kt", l = {}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
                /* renamed from: io.getunleash.android.cache.ObservableCache$subscribeTo$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C00111 extends i implements l {
                    final /* synthetic */ UnleashState $state;
                    int label;
                    final /* synthetic */ ObservableCache this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00111(UnleashState unleashState, ObservableCache observableCache, c<? super C00111> cVar) {
                        super(2, cVar);
                        this.$state = unleashState;
                        this.this$0 = observableCache;
                    }

                    @Override // Pd.a
                    public final c<Unit> create(Object obj, c<?> cVar) {
                        return new C00111(this.$state, this.this$0, cVar);
                    }

                    @Override // Pd.a
                    public final Object invokeSuspend(Object obj) {
                        Od.a aVar = Od.a.alpha;
                        if (this.label == 0) {
                            ResultKt.alpha(obj);
                            UnleashLogger.d$default(UnleashLogger.INSTANCE, "ObservableCache", "Storing new state with " + this.$state.getToggles().size() + " toggles for " + this.$state + ".context", null, 4, null);
                            this.this$0.write(this.$state);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    @Override // Xd.l
                    public final Object invoke(ab abVar, c<? super Unit> cVar) {
                        return ((C00111) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // yf.InterfaceC3440j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((UnleashState) obj2, (c<? super Unit>) cVar);
                }

                public final Object emit(UnleashState unleashState, c<? super Unit> cVar) {
                    Cf.e eVar = ao.alpha;
                    Object blue = ad.blue(d.purple, new C00111(unleashState, ObservableCache.this, null), cVar);
                    return blue == Od.a.alpha ? blue : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interfaceC3439i.collect(interfaceC3440j, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((ObservableCache$subscribeTo$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
