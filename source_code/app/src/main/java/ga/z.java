package ga;

import androidx.lifecycle.T;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ac purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ac acVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = acVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new z(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            ac acVar = this.purple;
            androidx.lifecycle.al viewLifecycleOwner = acVar.getViewLifecycleOwner();
            Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.ab abVar = androidx.lifecycle.ab.alpha;
            y yVar = new y(acVar, null);
            this.alpha = 1;
            Object india = T.india(viewLifecycleOwner.getLifecycle(), yVar, this);
            if (india != obj2) {
                india = Unit.INSTANCE;
            }
            if (india == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
