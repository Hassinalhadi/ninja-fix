package C1;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ac extends Pd.i implements Function1 {
    public Throwable alpha;
    public int purple;
    public final /* synthetic */ ap red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ap apVar, Nd.c cVar) {
        super(1, cVar);
        this.red = apVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new ac(this.red, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ac) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        B b2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        ap apVar = this.red;
        try {
        } catch (Throwable th2) {
            A hotel = apVar.hotel();
            this.alpha = th2;
            this.purple = 2;
            Integer alpha = hotel.alpha();
            if (alpha != aVar) {
                th = th2;
                obj = alpha;
            }
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    th = this.alpha;
                    ResultKt.alpha(obj);
                    b2 = new at(((Number) obj).intValue(), th);
                    return new Pair(b2, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            this.purple = 1;
            obj = ap.golf(apVar, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        b2 = (B) obj;
        return new Pair(b2, Boolean.TRUE);
    }
}
