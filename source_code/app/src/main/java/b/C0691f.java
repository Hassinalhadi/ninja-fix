package b;

import f.C1674k;
import f.C1675l;
import f.C1676m;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0691f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1676m purple;
    public final /* synthetic */ InterfaceC1673j red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691f(Nd.c cVar, InterfaceC1673j interfaceC1673j, C1676m c1676m) {
        super(2, cVar);
        this.purple = c1676m;
        this.red = interfaceC1673j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0691f(cVar, this.red, this.purple);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0691f) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C1675l c1675l = new C1675l(this.purple);
            this.alpha = 1;
            if (((C1674k) this.red).alpha(c1675l, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
