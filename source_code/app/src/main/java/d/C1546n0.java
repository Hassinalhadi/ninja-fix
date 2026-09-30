package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1546n0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C1548o0 red;
    public final /* synthetic */ Pd.i silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1546n0(C1548o0 c1548o0, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = c1548o0;
        this.silver = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1546n0 c1546n0 = new C1546n0(this.red, this.silver, cVar);
        c1546n0.purple = obj;
        return c1546n0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1546n0) create((O) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Xd.l, Pd.i] */
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
            O o5 = (O) this.purple;
            C1548o0 c1548o0 = this.red;
            c1548o0.kilo = o5;
            C1542l0 c1542l0 = c1548o0.lima;
            this.alpha = 1;
            if (this.silver.invoke(c1542l0, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
