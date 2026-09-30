package db;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import i.C1874w;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ C1874w red;
    public final /* synthetic */ ax silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z2, C1874w c1874w, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = z2;
        this.red = c1874w;
        this.silver = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            if (!this.purple) {
                return Unit.INSTANCE;
            }
            C1.t tVar = new C1.t(5, new C1.t(3, C0564b.bronze(new Ec.f(this.red, 4))));
            Ba.e eVar = new Ba.e(9, this.silver);
            this.alpha = 1;
            if (tVar.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
