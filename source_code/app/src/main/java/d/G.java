package d;

import Yb.C0312j0;
import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class G extends Pd.h implements Xd.l {
    public Object purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ C0312j0 teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0312j0 c0312j0, Nd.c cVar) {
        super(2, cVar);
        this.teal = c0312j0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        G g2 = new G(this.teal, cVar);
        g2.silver = obj;
        return g2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:5:0x0038). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        Object invoke;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                Object obj2 = this.purple;
                c2359i = (C2359i) this.silver;
                ResultKt.alpha(obj);
                if (obj2 == null) {
                    return Unit.INSTANCE;
                }
                invoke = this.teal.invoke();
                if (invoke != null) {
                    this.silver = c2359i;
                    this.purple = invoke;
                    this.red = 1;
                    c2359i.bravo(this, invoke);
                    Od.a aVar2 = Od.a.alpha;
                    return aVar;
                }
                obj2 = null;
                if (obj2 == null) {
                }
                invoke = this.teal.invoke();
                if (invoke != null) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            c2359i = (C2359i) this.silver;
            invoke = this.teal.invoke();
            if (invoke != null) {
            }
        }
    }
}
