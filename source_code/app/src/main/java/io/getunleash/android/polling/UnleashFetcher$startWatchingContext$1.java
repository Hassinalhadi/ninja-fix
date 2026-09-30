package io.getunleash.android.polling;

import Nd.c;
import Nd.h;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.data.UnleashContext;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;
import yf.InterfaceC3440j;
import yf.L;

@e(c = "io.getunleash.android.polling.UnleashFetcher$startWatchingContext$1", f = "UnleashFetcher.kt", l = {82}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class UnleashFetcher$startWatchingContext$1 extends i implements l {
    int label;
    final /* synthetic */ UnleashFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnleashFetcher$startWatchingContext$1(UnleashFetcher unleashFetcher, c<? super UnleashFetcher$startWatchingContext$1> cVar) {
        super(2, cVar);
        this.this$0 = unleashFetcher;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new UnleashFetcher$startWatchingContext$1(this.this$0, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        L l10;
        a aVar = a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            l10 = this.this$0.unleashContext;
            final UnleashFetcher unleashFetcher = this.this$0;
            InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: io.getunleash.android.polling.UnleashFetcher$startWatchingContext$1.1

                @e(c = "io.getunleash.android.polling.UnleashFetcher$startWatchingContext$1$1$1", f = "UnleashFetcher.kt", l = {84}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
                /* renamed from: io.getunleash.android.polling.UnleashFetcher$startWatchingContext$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C00121 extends i implements l {
                    final /* synthetic */ UnleashContext $it;
                    int label;
                    final /* synthetic */ UnleashFetcher this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00121(UnleashFetcher unleashFetcher, UnleashContext unleashContext, c<? super C00121> cVar) {
                        super(2, cVar);
                        this.this$0 = unleashFetcher;
                        this.$it = unleashContext;
                    }

                    @Override // Pd.a
                    public final c<Unit> create(Object obj, c<?> cVar) {
                        return new C00121(this.this$0, this.$it, cVar);
                    }

                    @Override // Pd.a
                    public final Object invokeSuspend(Object obj) {
                        a aVar = a.alpha;
                        int i4 = this.label;
                        if (i4 != 0) {
                            if (i4 == 1) {
                                ResultKt.alpha(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj);
                            UnleashFetcher unleashFetcher = this.this$0;
                            UnleashContext unleashContext = this.$it;
                            this.label = 1;
                            if (unleashFetcher.refreshTogglesIfContextChanged(unleashContext, this) == aVar) {
                                return aVar;
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // Xd.l
                    public final Object invoke(ab abVar, c<? super Unit> cVar) {
                        return ((C00121) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // yf.InterfaceC3440j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((UnleashContext) obj2, (c<? super Unit>) cVar);
                }

                public final Object emit(UnleashContext unleashContext, c<? super Unit> cVar) {
                    h hVar;
                    hVar = UnleashFetcher.this.coroutineContextForContextChange;
                    Object blue = ad.blue(hVar, new C00121(UnleashFetcher.this, unleashContext, null), cVar);
                    return blue == a.alpha ? blue : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (l10.collect(interfaceC3440j, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((UnleashFetcher$startWatchingContext$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
