package C1;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class q extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha = 1;
    public int purple;
    public /* synthetic */ Object red;

    public /* synthetic */ q(int i4, Nd.c cVar) {
        super(i4, cVar);
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                return new q((ap) this.red, (Nd.c) obj3).invokeSuspend(Unit.INSTANCE);
            default:
                ((Boolean) obj2).getClass();
                q qVar = new q(3, (Nd.c) obj3);
                qVar.red = (E1.c) obj;
                return qVar.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.alpha) {
            case 0:
                Od.a aVar = Od.a.alpha;
                int i4 = this.purple;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    this.purple = 1;
                    if (ap.charlie((ap) this.red, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            default:
                Od.a aVar2 = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                E1.c cVar = (E1.c) this.red;
                this.purple = 1;
                cVar.getClass();
                Object alpha = E1.c.alpha(cVar, this);
                if (alpha == aVar2) {
                    return aVar2;
                }
                return alpha;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ap apVar, Nd.c cVar) {
        super(3, cVar);
        this.red = apVar;
    }
}
