package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class w0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Xd.l red;
    public final /* synthetic */ ax silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Xd.l lVar, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.red = lVar;
        this.silver = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        w0 w0Var = new w0(this.red, this.silver, cVar);
        w0Var.purple = obj;
        return w0Var;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            M m4 = new M(this.silver, ((vf.ab) this.purple).charlie());
            this.alpha = 1;
            if (this.red.invoke(m4, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
