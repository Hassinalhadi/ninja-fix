package b;

import f.C1674k;
import f.C1676m;
import f.C1677n;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0698m extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ AbstractC0701p purple;
    public final /* synthetic */ C1676m red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0698m(AbstractC0701p abstractC0701p, C1676m c1676m, Nd.c cVar) {
        super(2, cVar);
        this.purple = abstractC0701p;
        this.red = c1676m;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0698m(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0698m) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC1673j interfaceC1673j = this.purple.red;
            if (interfaceC1673j != null) {
                C1677n c1677n = new C1677n(this.red);
                this.alpha = 1;
                if (((C1674k) interfaceC1673j).alpha(c1677n, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
