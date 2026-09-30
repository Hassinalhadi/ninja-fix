package io.getunleash.android.tasks;

import Nd.c;
import Nd.h;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import com.clevertap.android.sdk.Constants;
import io.getunleash.android.data.DataStrategy;
import io.getunleash.android.util.UnleashLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.ab;
import vf.ad;

@e(c = "io.getunleash.android.tasks.LifecycleAwareTaskManager$startWithStrategy$1", f = "LifecycleAwareTaskManager.kt", l = {75}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class LifecycleAwareTaskManager$startWithStrategy$1 extends i implements l {
    final /* synthetic */ Function1<c<? super Unit>, Object> $action;
    final /* synthetic */ String $id;
    final /* synthetic */ DataStrategy $strategy;
    int label;
    final /* synthetic */ LifecycleAwareTaskManager this$0;

    @e(c = "io.getunleash.android.tasks.LifecycleAwareTaskManager$startWithStrategy$1$1", f = "LifecycleAwareTaskManager.kt", l = {79, 82, 83}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
    /* renamed from: io.getunleash.android.tasks.LifecycleAwareTaskManager$startWithStrategy$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements l {
        final /* synthetic */ Function1<c<? super Unit>, Object> $action;
        final /* synthetic */ String $id;
        final /* synthetic */ DataStrategy $strategy;
        int label;
        final /* synthetic */ LifecycleAwareTaskManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(LifecycleAwareTaskManager lifecycleAwareTaskManager, DataStrategy dataStrategy, String str, Function1<? super c<? super Unit>, ? extends Object> function1, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = lifecycleAwareTaskManager;
            this.$strategy = dataStrategy;
            this.$id = str;
            this.$action = function1;
        }

        @Override // Pd.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$strategy, this.$id, this.$action, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x009e, code lost:
        
            if (vf.ad.november(r5, r11) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        
            if (vf.ad.november(r5, r11) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        
            if (r12.invoke(r11) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x009e -> B:12:0x0024). Please report as a decompilation issue!!! */
        @Override // Pd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            h hVar;
            boolean z2;
            boolean z10;
            boolean z11;
            a aVar = a.alpha;
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        long interval = this.$strategy.getInterval();
                        this.label = 3;
                    }
                } else {
                    ResultKt.alpha(obj);
                    UnleashLogger unleashLogger = UnleashLogger.INSTANCE;
                    StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
                    sb2.append(this.$id);
                    sb2.append("] Executing action within ");
                    hVar = this.this$0.ioContext;
                    sb2.append(hVar);
                    UnleashLogger.d$default(unleashLogger, "TaskManager", sb2.toString(), null, 4, null);
                    Function1<c<? super Unit>, Object> function1 = this.$action;
                    this.label = 2;
                }
            }
            ResultKt.alpha(obj);
            z2 = this.this$0.isDestroying;
            if (!z2) {
                z10 = this.this$0.isForeground;
                if (z10 || !this.$strategy.getPauseOnBackground()) {
                    z11 = this.this$0.networkAvailable;
                    if (z11) {
                        if (this.$strategy.getDelay() > 0) {
                            long delay = this.$strategy.getDelay();
                            this.label = 1;
                        }
                        UnleashLogger unleashLogger2 = UnleashLogger.INSTANCE;
                        StringBuilder sb22 = new StringBuilder(Constants.AES_PREFIX);
                        sb22.append(this.$id);
                        sb22.append("] Executing action within ");
                        hVar = this.this$0.ioContext;
                        sb22.append(hVar);
                        UnleashLogger.d$default(unleashLogger2, "TaskManager", sb22.toString(), null, 4, null);
                        Function1<c<? super Unit>, Object> function12 = this.$action;
                        this.label = 2;
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleAwareTaskManager$startWithStrategy$1(LifecycleAwareTaskManager lifecycleAwareTaskManager, DataStrategy dataStrategy, String str, Function1<? super c<? super Unit>, ? extends Object> function1, c<? super LifecycleAwareTaskManager$startWithStrategy$1> cVar) {
        super(2, cVar);
        this.this$0 = lifecycleAwareTaskManager;
        this.$strategy = dataStrategy;
        this.$id = str;
        this.$action = function1;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new LifecycleAwareTaskManager$startWithStrategy$1(this.this$0, this.$strategy, this.$id, this.$action, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
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
            hVar = this.this$0.ioContext;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$strategy, this.$id, this.$action, null);
            this.label = 1;
            if (ad.blue(hVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((LifecycleAwareTaskManager$startWithStrategy$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
