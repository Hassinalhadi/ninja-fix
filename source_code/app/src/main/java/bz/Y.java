package bz;

import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class Y extends Pd.i implements Xd.l {
    public float alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ a0 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, Nd.c cVar) {
        super(2, cVar);
        this.silver = a0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        Y y10 = new Y(this.silver, cVar);
        y10.red = obj;
        return y10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        float golf;
        vf.ab abVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                golf = this.alpha;
                abVar = (vf.ab) this.red;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vf.ab abVar2 = (vf.ab) this.red;
            golf = P.golf(abVar2.charlie());
            abVar = abVar2;
        }
        while (vf.ad.xray(abVar)) {
            b.b0 b0Var = new b.b0(this.silver, golf);
            this.red = abVar;
            this.alpha = golf;
            this.purple = 1;
            if (C0564b.sierra(getContext()).blue(b0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
