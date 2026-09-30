package d;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class ah extends Pd.i implements Xd.l {
    public Ref.ObjectRef alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ Ref.ObjectRef silver;
    public final /* synthetic */ aj teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(Ref.ObjectRef objectRef, aj ajVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = objectRef;
        this.teal = ajVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ah ahVar = new ah(this.silver, this.teal, cVar);
        ahVar.red = obj;
        return ahVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ah) create((Function1) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object obj2;
        C1554s c1554s;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                Ref.ObjectRef objectRef = this.alpha;
                function1 = (Function1) this.red;
                ResultKt.alpha(obj);
                AbstractC1558v abstractC1558v = (AbstractC1558v) obj;
                objectRef.alpha = abstractC1558v;
                objectRef = this.silver;
                obj2 = objectRef.alpha;
                if ((obj2 instanceof C1557u) && !(obj2 instanceof r)) {
                    abstractC1558v = null;
                    if (obj2 instanceof C1554s) {
                        c1554s = (C1554s) obj2;
                    } else {
                        c1554s = null;
                    }
                    if (c1554s != null) {
                        function1.invoke(c1554s);
                    }
                    xf.e eVar = this.teal.yellow;
                    if (eVar != null) {
                        this.red = function1;
                        this.alpha = objectRef;
                        this.purple = 1;
                        obj = eVar.india(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        AbstractC1558v abstractC1558v2 = (AbstractC1558v) obj;
                    }
                    objectRef.alpha = abstractC1558v2;
                    objectRef = this.silver;
                    obj2 = objectRef.alpha;
                    if (obj2 instanceof C1557u) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        function1 = (Function1) this.red;
        objectRef = this.silver;
        obj2 = objectRef.alpha;
        if (obj2 instanceof C1557u) {
        }
        return Unit.INSTANCE;
    }
}
