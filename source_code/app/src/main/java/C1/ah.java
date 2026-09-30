package C1;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ah extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ap purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ap apVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = apVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ah(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ah) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r4.india(r5) == r0) goto L22;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ap apVar = this.purple;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        ResultKt.alpha(obj);
                        return (B) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
            } else {
                ResultKt.alpha(obj);
                if (apVar.hotel.echo() instanceof aq) {
                    return apVar.hotel.echo();
                }
                this.alpha = 1;
            }
            this.alpha = 2;
            obj = ap.foxtrot(apVar, false, this);
        } catch (Throwable th) {
            return new at(-1, th);
        }
    }
}
