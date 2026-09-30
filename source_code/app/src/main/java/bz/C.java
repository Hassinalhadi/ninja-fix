package bz;

import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ F purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ a0 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Nd.c cVar, F f5, a0 a0Var, Object obj) {
        super(1, cVar);
        this.purple = f5;
        this.red = obj;
        this.silver = a0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        Object obj = this.red;
        return new C(cVar, this.purple, this.silver, obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        float f5;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        a0 a0Var = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            F f10 = this.purple;
            f10.c0();
            f10.e = Long.MIN_VALUE;
            f10.h0(0.0f);
            Object value = ((t0) f10.red).getValue();
            Object obj2 = this.red;
            boolean areEqual = Intrinsics.areEqual(obj2, value);
            androidx.compose.runtime.ax axVar = f10.purple;
            if (areEqual) {
                f5 = -4.0f;
            } else if (Intrinsics.areEqual(obj2, ((t0) axVar).getValue())) {
                f5 = -5.0f;
            } else {
                f5 = -3.0f;
            }
            a0Var.quebec(obj2);
            a0Var.oscar(0L);
            ((t0) axVar).setValue(obj2);
            f10.h0(0.0f);
            f10.Q(obj2);
            a0Var.kilo(f5);
            if (f5 == -3.0f) {
                this.alpha = 1;
                if (F.a0(f10, this) == aVar) {
                    return aVar;
                }
            }
        }
        a0Var.juliet();
        return Unit.INSTANCE;
    }
}
