package C1;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class af extends Pd.i implements Xd.l {
    public Object alpha;
    public int purple;
    public /* synthetic */ boolean red;
    public final /* synthetic */ ap silver;
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ap apVar, int i4, Nd.c cVar) {
        super(2, cVar);
        this.silver = apVar;
        this.teal = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        af afVar = new af(this.silver, this.teal, cVar);
        afVar.red = ((Boolean) obj).booleanValue();
        return afVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((af) create(bool, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Object obj2;
        int i4;
        int i5;
        Od.a aVar = Od.a.alpha;
        int i10 = this.purple;
        ap apVar = this.silver;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    obj2 = this.alpha;
                    ResultKt.alpha(obj);
                    i4 = ((Number) obj).intValue();
                    if (obj2 != null) {
                        i5 = obj2.hashCode();
                    } else {
                        i5 = 0;
                    }
                    return new C0080b(obj2, i5, i4);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.red;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            z2 = this.red;
            this.red = z2;
            this.purple = 1;
            obj = apVar.juliet(this);
        }
        if (z2) {
            A hotel = apVar.hotel();
            this.alpha = obj;
            this.purple = 2;
            Integer alpha = hotel.alpha();
            if (alpha != aVar) {
                obj2 = obj;
                obj = alpha;
                i4 = ((Number) obj).intValue();
                if (obj2 != null) {
                }
                return new C0080b(obj2, i5, i4);
            }
            return aVar;
        }
        obj2 = obj;
        i4 = this.teal;
        if (obj2 != null) {
        }
        return new C0080b(obj2, i5, i4);
    }
}
