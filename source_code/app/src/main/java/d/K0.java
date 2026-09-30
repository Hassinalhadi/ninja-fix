package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class K0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ vf.I red;
    public final /* synthetic */ Pd.i silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K0(vf.I i4, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = i4;
        this.silver = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        K0 k02 = new K0(this.red, this.silver, cVar);
        k02.purple = obj;
        return k02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((K0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r4.silver.invoke(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.red.gray(r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v5, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar;
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
            abVar = (vf.ab) this.purple;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            abVar = (vf.ab) this.purple;
            this.purple = abVar;
            this.alpha = 1;
        }
        this.purple = null;
        this.alpha = 2;
    }
}
