package y;

import bz.C0778c;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class aj extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0778c purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(C0778c c0778c, long j5, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0778c;
        this.red = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aj(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aj) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Z.b bVar = new Z.b(this.red);
            bz.I i5 = al.delta;
            this.alpha = 1;
            if (C0778c.charlie(this.purple, bVar, i5, null, this, 12) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
