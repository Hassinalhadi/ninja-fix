package t0;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class L0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ yf.L purple;
    public final /* synthetic */ C2919i0 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(yf.L l10, C2919i0 c2919i0, Nd.c cVar) {
        super(2, cVar);
        this.purple = l10;
        this.red = c2919i0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new L0(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((L0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            Ba.e eVar = new Ba.e(11, this.red);
            this.alpha = 1;
            if (this.purple.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
