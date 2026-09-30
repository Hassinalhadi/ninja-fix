package kd;

import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;

/* loaded from: classes2.dex */
public final class z extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ e red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e eVar, Nd.c cVar) {
        super(2, cVar);
        this.red = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        z zVar = new z(this.red, cVar);
        zVar.purple = obj;
        return zVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((AbstractC2304b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r1.bravo(r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (s6.AbstractC2626c6.delta(r1, r6, r5) == r0) goto L20;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) this.purple;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            AbstractC2304b abstractC2304b = (AbstractC2304b) this.purple;
            if (this.red != e.f12929a && !abstractC2304b.bravo().beige().bravo(aa.bravo)) {
                dVar = (d) abstractC2304b.bravo().beige().charlie(aa.alpha);
                this.purple = dVar;
                this.alpha = 1;
            } else {
                return Unit.INSTANCE;
            }
        }
        this.purple = null;
        this.alpha = 2;
    }
}
