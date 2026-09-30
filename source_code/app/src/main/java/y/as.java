package y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class as extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ C3344D purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(C3344D c3344d, Nd.c cVar) {
        super(1, cVar);
        this.purple = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new as(this.purple, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((as) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (y.C3344D.bravo(r2, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r2.tango(r5) == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C3344D c3344d = this.purple;
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
        }
        this.alpha = 2;
    }
}
