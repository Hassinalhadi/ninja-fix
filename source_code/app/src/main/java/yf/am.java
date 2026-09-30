package yf;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class am extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ InterfaceC3439i red;
    public final /* synthetic */ N silver;
    public final /* synthetic */ Object teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(InterfaceC3439i interfaceC3439i, N n5, Object obj, Nd.c cVar) {
        super(2, cVar);
        this.red = interfaceC3439i;
        this.silver = n5;
        this.teal = obj;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        am amVar = new am(this.red, this.silver, this.teal, cVar);
        amVar.purple = obj;
        return amVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((am) create((EnumC3430C) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            int ordinal = ((EnumC3430C) this.purple).ordinal();
            N n5 = this.silver;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        Af.t tVar = AbstractC3428A.alpha;
                        Object obj2 = this.teal;
                        if (obj2 != tVar) {
                            n5.india(obj2);
                        } else {
                            n5.getClass();
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                this.alpha = 1;
                if (this.red.collect(n5, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
