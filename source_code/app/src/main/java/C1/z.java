package C1;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.C3213q;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

/* loaded from: classes3.dex */
public final class z extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ap purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ap apVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = apVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new z(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ap apVar = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            this.alpha = 1;
            Object tango = ((C3213q) apVar.india.bravo).tango(this);
            if (tango != aVar) {
                tango = Unit.INSTANCE;
            }
        }
        InterfaceC3439i hotel = AbstractC3428A.hotel(apVar.hotel().charlie, -1);
        Ba.e eVar = new Ba.e(1, apVar);
        this.alpha = 2;
    }
}
