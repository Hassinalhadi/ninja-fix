package C1;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ao extends Pd.i implements Xd.l {
    public kotlin.jvm.internal.s alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ kotlin.jvm.internal.s silver;
    public final /* synthetic */ ap teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(kotlin.jvm.internal.s sVar, ap apVar, Object obj, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.silver = sVar;
        this.teal = apVar;
        this.white = obj;
        this.yellow = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ao aoVar = new ao(this.silver, this.teal, this.white, this.yellow, cVar);
        aoVar.red = obj;
        return aoVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ao) create((E1.k) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6.bravo(r3, r7) == r0) goto L16;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        E1.k kVar;
        kotlin.jvm.internal.s sVar;
        int i4;
        Od.a aVar = Od.a.alpha;
        int i5 = this.purple;
        kotlin.jvm.internal.s sVar2 = this.silver;
        Object obj2 = this.white;
        ap apVar = this.teal;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    ResultKt.alpha(obj);
                    if (this.yellow) {
                        D8.c cVar = apVar.hotel;
                        if (obj2 != null) {
                            i4 = obj2.hashCode();
                        } else {
                            i4 = 0;
                        }
                        cVar.november(new C0080b(obj2, i4, sVar2.alpha));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = this.alpha;
            kVar = (E1.k) this.red;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            E1.k kVar2 = (E1.k) this.red;
            A hotel = apVar.hotel();
            this.red = kVar2;
            this.alpha = sVar2;
            this.purple = 1;
            Integer num = new Integer(((AtomicInteger) hotel.bravo.purple).incrementAndGet());
            if (num != aVar) {
                kVar = kVar2;
                obj = num;
                sVar = sVar2;
            }
            return aVar;
        }
        sVar.alpha = ((Number) obj).intValue();
        this.red = null;
        this.alpha = null;
        this.purple = 2;
    }
}
