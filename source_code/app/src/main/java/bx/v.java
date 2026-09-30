package bx;

import a2.C0398w;
import androidx.compose.runtime.C0564b;
import bz.a0;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class v extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ a0 red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, androidx.compose.runtime.ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.red = a0Var;
        this.silver = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        v vVar = new v(this.red, this.silver, cVar);
        vVar.purple = obj;
        return vVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((androidx.compose.runtime.K) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            androidx.compose.runtime.K k6 = (androidx.compose.runtime.K) this.purple;
            a0 a0Var = this.red;
            C1.t bronze = C0564b.bronze(new Xe.s(11, a0Var));
            C0398w c0398w = new C0398w(k6, a0Var, this.silver);
            this.alpha = 1;
            if (bronze.collect(c0398w, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
