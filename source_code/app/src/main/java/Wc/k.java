package Wc;

import androidx.lifecycle.T;
import androidx.lifecycle.al;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ l purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            l lVar = this.purple;
            al viewLifecycleOwner = lVar.getViewLifecycleOwner();
            Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.ab abVar = androidx.lifecycle.ab.alpha;
            j jVar = new j(lVar, null);
            this.alpha = 1;
            Object india = T.india(viewLifecycleOwner.getLifecycle(), jVar, this);
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
