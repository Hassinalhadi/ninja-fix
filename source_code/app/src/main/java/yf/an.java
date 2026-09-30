package yf;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class an extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ E purple;
    public final /* synthetic */ InterfaceC3439i red;
    public final /* synthetic */ N silver;
    public final /* synthetic */ Object teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(E e, InterfaceC3439i interfaceC3439i, N n5, Object obj, Nd.c cVar) {
        super(2, cVar);
        this.purple = e;
        this.red = interfaceC3439i;
        this.silver = n5;
        this.teal = obj;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new an(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((an) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r6.collect(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r6.collect(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (yf.AbstractC3428A.oscar(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (yf.AbstractC3428A.kilo(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        N n5 = this.silver;
        InterfaceC3439i interfaceC3439i = this.red;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3 && i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    this.alpha = 3;
                }
            }
            ResultKt.alpha(obj);
            return Unit.INSTANCE;
        }
        ResultKt.alpha(obj);
        F f5 = D.alpha;
        E e = this.purple;
        if (e == f5) {
            this.alpha = 1;
        } else if (e == D.bravo) {
            zf.ad golf = n5.golf();
            ?? iVar = new Pd.i(2, null);
            this.alpha = 2;
        } else {
            InterfaceC3439i lima = AbstractC3428A.lima(e.alpha(n5.golf()));
            am amVar = new am(interfaceC3439i, n5, this.teal, null);
            this.alpha = 4;
        }
        return aVar;
    }
}
