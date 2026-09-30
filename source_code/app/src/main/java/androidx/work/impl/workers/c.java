package androidx.work.impl.workers;

import F2.n;
import J2.p;
import Xd.l;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class c extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ n purple;
    public final /* synthetic */ p red;
    public final /* synthetic */ AtomicInteger silver;
    public final /* synthetic */ com.google.common.util.concurrent.e teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, p pVar, AtomicInteger atomicInteger, com.google.common.util.concurrent.e eVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = nVar;
        this.red = pVar;
        this.silver = atomicInteger;
        this.teal = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            this.alpha = 1;
            obj = j.alpha(this.purple, this.red, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.silver.set(((Number) obj).intValue());
        this.teal.cancel(true);
        return Unit.INSTANCE;
    }
}
