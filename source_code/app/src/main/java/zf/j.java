package zf;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ n purple;
    public final /* synthetic */ InterfaceC3440j red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, InterfaceC3440j interfaceC3440j, Object obj, Nd.c cVar) {
        super(2, cVar);
        this.purple = nVar;
        this.red = interfaceC3440j;
        this.silver = obj;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new j(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Xd.m, Pd.i] */
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
            ?? r4 = this.purple.teal;
            this.alpha = 1;
            if (r4.invoke(this.red, this.silver, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
