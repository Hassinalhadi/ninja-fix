package io.getunleash.android.backup;

import Cf.d;
import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.UnleashState;
import io.getunleash.android.util.UnleashLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import vf.ad;
import vf.ao;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

@e(c = "io.getunleash.android.backup.LocalBackup$subscribeTo$1", f = "LocalBackup.kt", l = {36}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class LocalBackup$subscribeTo$1 extends i implements l {
    final /* synthetic */ InterfaceC3439i $state;
    int label;
    final /* synthetic */ LocalBackup this$0;

    @e(c = "io.getunleash.android.backup.LocalBackup$subscribeTo$1$1", f = "LocalBackup.kt", l = {37}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
    /* renamed from: io.getunleash.android.backup.LocalBackup$subscribeTo$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements l {
        final /* synthetic */ InterfaceC3439i $state;
        int label;
        final /* synthetic */ LocalBackup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC3439i interfaceC3439i, LocalBackup localBackup, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$state = interfaceC3439i;
            this.this$0 = localBackup;
        }

        @Override // Pd.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$state, this.this$0, cVar);
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
                InterfaceC3439i interfaceC3439i = this.$state;
                final LocalBackup localBackup = this.this$0;
                InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: io.getunleash.android.backup.LocalBackup.subscribeTo.1.1.1
                    @Override // yf.InterfaceC3440j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((UnleashState) obj2, (c<? super Unit>) cVar);
                    }

                    public final Object emit(UnleashState unleashState, c<? super Unit> cVar) {
                        UnleashContext unleashContext;
                        UnleashContext context = unleashState.getContext();
                        unleashContext = LocalBackup.this.lastContext;
                        if (!Intrinsics.areEqual(context, unleashContext)) {
                            LocalBackup.this.lastContext = unleashState.getContext();
                            LocalBackup.this.writeToDisc(unleashState);
                        } else {
                            UnleashLogger.d$default(UnleashLogger.INSTANCE, "LocalBackup", "Context unchanged, not writing to disc", null, 4, null);
                        }
                        return Unit.INSTANCE;
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
            return ((AnonymousClass1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBackup$subscribeTo$1(InterfaceC3439i interfaceC3439i, LocalBackup localBackup, c<? super LocalBackup$subscribeTo$1> cVar) {
        super(2, cVar);
        this.$state = interfaceC3439i;
        this.this$0 = localBackup;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new LocalBackup$subscribeTo$1(this.$state, this.this$0, cVar);
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
            Cf.e eVar = ao.alpha;
            d dVar = d.purple;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, this.this$0, null);
            this.label = 1;
            if (ad.blue(dVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((LocalBackup$subscribeTo$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
