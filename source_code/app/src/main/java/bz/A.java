package bz;

import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ F teal;
    public final /* synthetic */ a0 white;
    public final /* synthetic */ float yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Object obj, Object obj2, F f5, a0 a0Var, float f10, Nd.c cVar) {
        super(2, cVar);
        this.red = obj;
        this.silver = obj2;
        this.teal = f5;
        this.white = a0Var;
        this.yellow = f10;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        A a6 = new A(this.red, this.silver, this.teal, this.white, this.yellow, cVar);
        a6.purple = obj;
        return a6;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        F f5 = this.teal;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vf.ab abVar = (vf.ab) this.purple;
            Object obj2 = this.red;
            Object obj3 = this.silver;
            if (!Intrinsics.areEqual(obj2, obj3)) {
                F.X(f5);
            } else {
                f5.f3443g = null;
                if (Intrinsics.areEqual(((t0) f5.red).getValue(), obj2)) {
                    return Unit.INSTANCE;
                }
            }
            boolean areEqual = Intrinsics.areEqual(obj2, obj3);
            float f10 = this.yellow;
            if (!areEqual) {
                a0 a0Var = this.white;
                a0Var.quebec(obj2);
                a0Var.oscar(0L);
                ((t0) f5.purple).setValue(obj2);
                a0Var.kilo(f10);
            }
            f5.h0(f10);
            if (f5.f3442f.echo()) {
                vf.ad.zulu(abVar, null, null, new az(f5, null), 3);
            } else {
                f5.e = Long.MIN_VALUE;
            }
            this.alpha = 1;
            if (F.a0(f5, this) == aVar) {
                return aVar;
            }
        }
        f5.g0();
        return Unit.INSTANCE;
    }
}
