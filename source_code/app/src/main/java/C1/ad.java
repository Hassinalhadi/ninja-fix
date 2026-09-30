package C1;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ad extends Pd.i implements Xd.l {
    public Throwable alpha;
    public int purple;
    public /* synthetic */ boolean red;
    public final /* synthetic */ ap silver;
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ap apVar, int i4, Nd.c cVar) {
        super(2, cVar);
        this.silver = apVar;
        this.teal = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ad adVar = new ad(this.silver, this.teal, cVar);
        adVar.red = ((Boolean) obj).booleanValue();
        return adVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ad) create(bool, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i4;
        boolean z2;
        B b2;
        boolean z10;
        Od.a aVar = Od.a.alpha;
        boolean z11 = this.purple;
        ap apVar = this.silver;
        try {
        } catch (Throwable th2) {
            if (z11 != 0) {
                A hotel = apVar.hotel();
                this.alpha = th2;
                this.red = z11;
                this.purple = 2;
                Integer alpha = hotel.alpha();
                if (alpha != aVar) {
                    z2 = z11;
                    th = th2;
                    obj = alpha;
                }
            } else {
                boolean z12 = z11;
                th = th2;
                i4 = this.teal;
                z2 = z12;
            }
        }
        if (z11 != 0) {
            if (z11 != 1) {
                if (z11 == 2) {
                    z2 = this.red;
                    th = this.alpha;
                    ResultKt.alpha(obj);
                    i4 = ((Number) obj).intValue();
                    at atVar = new at(i4, th);
                    z10 = z2;
                    b2 = atVar;
                    return new Pair(b2, Boolean.valueOf(z10));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = this.red;
            ResultKt.alpha(obj);
            z11 = z13;
        } else {
            ResultKt.alpha(obj);
            boolean z14 = this.red;
            this.red = z14;
            this.purple = 1;
            obj = ap.golf(apVar, z14, this);
            z11 = z14;
            if (obj == aVar) {
                return aVar;
            }
        }
        b2 = (B) obj;
        z10 = z11;
        return new Pair(b2, Boolean.valueOf(z10));
    }
}
