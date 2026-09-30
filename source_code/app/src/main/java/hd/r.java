package hd;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import od.InterfaceC2225b;
import qd.AbstractC2463a;

/* loaded from: classes2.dex */
public final class r extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha;
    public int purple;
    public /* synthetic */ Object red;
    public /* synthetic */ Throwable silver;
    public final /* synthetic */ List teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(List list, Nd.c cVar, int i4) {
        super(3, cVar);
        this.alpha = i4;
        this.teal = list;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC2225b interfaceC2225b = (InterfaceC2225b) obj;
        Throwable th = (Throwable) obj2;
        Nd.c cVar = (Nd.c) obj3;
        switch (this.alpha) {
            case 0:
                r rVar = new r(this.teal, cVar, 0);
                rVar.red = interfaceC2225b;
                rVar.silver = th;
                return rVar.invokeSuspend(Unit.INSTANCE);
            default:
                r rVar2 = new r(this.teal, cVar, 1);
                rVar2.red = interfaceC2225b;
                rVar2.silver = th;
                return rVar2.invokeSuspend(Unit.INSTANCE);
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
                        Throwable th = (Throwable) this.red;
                        ResultKt.alpha(obj);
                        return th;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                InterfaceC2225b interfaceC2225b = (InterfaceC2225b) this.red;
                Throwable alpha = AbstractC2463a.alpha(this.silver);
                this.red = alpha;
                this.purple = 1;
                if (v.alpha(this.teal, alpha, interfaceC2225b, this) != aVar) {
                    return alpha;
                }
                return aVar;
            default:
                Od.a aVar2 = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 == 1) {
                        Throwable th2 = (Throwable) this.red;
                        ResultKt.alpha(obj);
                        return th2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                InterfaceC2225b interfaceC2225b2 = (InterfaceC2225b) this.red;
                Throwable alpha2 = AbstractC2463a.alpha(this.silver);
                this.red = alpha2;
                this.purple = 1;
                if (v.alpha(this.teal, alpha2, interfaceC2225b2, this) != aVar2) {
                    return alpha2;
                }
                return aVar2;
        }
    }
}
