package w;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import t0.au;
import vf.ad;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3226d extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Ec.d red;
    public final /* synthetic */ C3227e silver;
    public final /* synthetic */ q teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3226d(Ec.d dVar, C3227e c3227e, q qVar, Nd.c cVar) {
        super(2, cVar);
        this.red = dVar;
        this.silver = c3227e;
        this.teal = qVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3226d c3226d = new C3226d(this.red, this.silver, this.teal, cVar);
        c3226d.purple = obj;
        return c3226d;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C3226d) create((au) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C3225c c3225c = new C3225c((au) this.purple, this.red, this.silver, this.teal, null);
            this.alpha = 1;
            if (ad.mike(c3225c, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
