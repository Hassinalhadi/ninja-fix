package C1;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aj extends Pd.i implements Function1 {
    public Object alpha;
    public int purple;
    public final /* synthetic */ ap red;
    public final /* synthetic */ Nd.h silver;
    public final /* synthetic */ Pd.i teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aj(ap apVar, Nd.h hVar, Xd.l lVar, Nd.c cVar) {
        super(1, cVar);
        this.red = apVar;
        this.silver = hVar;
        this.teal = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new aj(this.red, this.silver, this.teal, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((aj) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0080b c0080b;
        int i4;
        Od.a aVar = Od.a.alpha;
        int i5 = this.purple;
        ap apVar = this.red;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        Object obj2 = this.alpha;
                        ResultKt.alpha(obj);
                        return obj2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0080b = (C0080b) this.alpha;
                ResultKt.alpha(obj);
                Object obj3 = c0080b.bravo;
                if (obj3 != null) {
                    i4 = obj3.hashCode();
                } else {
                    i4 = 0;
                }
                if (i4 == c0080b.charlie) {
                    if (!Intrinsics.areEqual(c0080b.bravo, obj)) {
                        this.alpha = obj;
                        this.purple = 3;
                        if (apVar.kilo(obj, true, this) == aVar) {
                            return aVar;
                        }
                    }
                    return obj;
                }
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            this.purple = 1;
            obj = ap.golf(apVar, true, this);
        }
        c0080b = (C0080b) obj;
        ai aiVar = new ai(this.teal, c0080b, null);
        this.alpha = c0080b;
        this.purple = 2;
        obj = vf.ad.blue(this.silver, aiVar, this);
    }
}
