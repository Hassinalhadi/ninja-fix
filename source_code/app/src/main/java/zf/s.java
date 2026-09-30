package zf;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class s extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ InterfaceC3439i[] purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ AtomicInteger silver;
    public final /* synthetic */ xf.e teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC3439i[] interfaceC3439iArr, int i4, AtomicInteger atomicInteger, xf.e eVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = interfaceC3439iArr;
        this.red = i4;
        this.silver = atomicInteger;
        this.teal = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new s(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        AtomicInteger atomicInteger = this.silver;
        xf.e eVar = this.teal;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC3439i[] interfaceC3439iArr = this.purple;
                int i5 = this.red;
                InterfaceC3439i interfaceC3439i = interfaceC3439iArr[i5];
                r rVar = new r(eVar, i5);
                this.alpha = 1;
                if (interfaceC3439i.collect(rVar, this) == aVar) {
                    return aVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.hotel(null);
            }
            return Unit.INSTANCE;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.hotel(null);
            }
        }
    }
}
