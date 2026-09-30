package androidx.compose.material3.internal;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class e extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ Pd.i purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ vf.ab silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Xd.l lVar, Object obj, vf.ab abVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = (Pd.i) lVar;
        this.red = obj;
        this.silver = abVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Xd.l, Pd.i] */
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
            this.alpha = 1;
            if (this.purple.invoke(this.red, this) == aVar) {
                return aVar;
            }
        }
        vf.ad.kilo(this.silver, new AnchoredDragFinishedSignal());
        return Unit.INSTANCE;
    }
}
