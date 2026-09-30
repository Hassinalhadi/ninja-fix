package W;

import O7.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import s0.AbstractC2555o;
import s0.i0;
import s0.j0;
import t0.C2946x;
import t6.AbstractC3033o;

/* loaded from: classes3.dex */
public final class f extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef alpha;
    public final /* synthetic */ g purple;
    public final /* synthetic */ j red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Ref.ObjectRef objectRef, g gVar, j jVar) {
        super(1);
        this.alpha = objectRef;
        this.purple = gVar;
        this.red = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j0 j0Var = (j0) obj;
        g gVar = (g) j0Var;
        g gVar2 = this.purple;
        gVar2.getClass();
        if (((a) ((C2946x) AbstractC2555o.hotel(gVar2)).m367getDragAndDropManager()).bravo.contains(gVar) && h.alpha(gVar, AbstractC3033o.bravo(this.red))) {
            this.alpha.alpha = j0Var;
            return i0.red;
        }
        return i0.alpha;
    }
}
