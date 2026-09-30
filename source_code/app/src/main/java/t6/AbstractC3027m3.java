package t6;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.J6;
import vf.C3207k;

/* renamed from: t6.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3027m3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(xf.r rVar, Function0 function0, Pd.c cVar) {
        xf.p pVar;
        int i4;
        try {
            if (cVar instanceof xf.p) {
                xf.p pVar2 = (xf.p) cVar;
                int i5 = pVar2.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    pVar2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    pVar = pVar2;
                    Object obj = pVar.purple;
                    Od.a aVar = Od.a.alpha;
                    i4 = pVar.red;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            function0 = pVar.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (pVar.getContext().get(vf.H.alpha) == rVar) {
                            pVar.alpha = function0;
                            pVar.red = 1;
                            C3207k c3207k = new C3207k(1, J6.delta(pVar));
                            c3207k.tango();
                            ((xf.q) rVar).d(new X9.v(c3207k, 2));
                            if (c3207k.sierra() == aVar) {
                                return aVar;
                            }
                        } else {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                    }
                    function0.invoke();
                    return Unit.INSTANCE;
                }
            }
            if (i4 == 0) {
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        pVar = new Pd.c(cVar);
        Object obj2 = pVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = pVar.red;
    }

    public static void bravo(ai.e eVar) {
        if (eVar instanceof ai.e) {
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
