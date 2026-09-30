package io.getunleash.android;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import io.getunleash.android.data.ImpressionEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.as;

@e(c = "io.getunleash.android.DefaultUnleash$emit$1", f = "DefaultUnleash.kt", l = {286}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class DefaultUnleash$emit$1 extends i implements l {
    final /* synthetic */ ImpressionEvent $impressionEvent;
    int label;
    final /* synthetic */ DefaultUnleash this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$emit$1(DefaultUnleash defaultUnleash, ImpressionEvent impressionEvent, c<? super DefaultUnleash$emit$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultUnleash;
        this.$impressionEvent = impressionEvent;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultUnleash$emit$1(this.this$0, this.$impressionEvent, cVar);
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
            asVar = this.this$0.impressionEventsFlow;
            ImpressionEvent impressionEvent = this.$impressionEvent;
            this.label = 1;
            if (asVar.emit(impressionEvent, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((DefaultUnleash$emit$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
