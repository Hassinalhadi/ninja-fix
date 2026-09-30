package vf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;
import s6.B0;

/* loaded from: classes2.dex */
public abstract class f0 {
    public static final Object alpha(d0 d0Var, Xd.l lVar) {
        ad.victor(d0Var, true, new ar(0, ad.quebec(d0Var.silver.getContext()).charlie(d0Var.teal, d0Var, d0Var.red)));
        return B0.bravo(d0Var, false, d0Var, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(long j5, Xd.l lVar, Pd.c cVar) {
        e0 e0Var;
        int i4;
        Ref.ObjectRef objectRef;
        if (cVar instanceof e0) {
            e0 e0Var2 = (e0) cVar;
            int i5 = e0Var2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                e0Var2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                e0Var = e0Var2;
                Object obj = e0Var.red;
                Od.a aVar = Od.a.alpha;
                i4 = e0Var.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        objectRef = e0Var.purple;
                        Xd.l lVar2 = e0Var.alpha;
                        try {
                            ResultKt.alpha(obj);
                            return obj;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (j5 > 0) {
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        try {
                            e0Var.alpha = lVar;
                            e0Var.purple = objectRef2;
                            e0Var.silver = 1;
                            d0 d0Var = new d0(j5, e0Var);
                            objectRef2.alpha = d0Var;
                            Object alpha = alpha(d0Var, lVar);
                            if (alpha == aVar) {
                                return aVar;
                            }
                            return alpha;
                        } catch (TimeoutCancellationException e4) {
                            e = e4;
                            objectRef = objectRef2;
                        }
                    } else {
                        return null;
                    }
                }
                if (e.coroutine != objectRef.alpha) {
                    return null;
                }
                throw e;
            }
        }
        e0Var = new Pd.c(cVar);
        Object obj2 = e0Var.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = e0Var.silver;
        if (i4 == 0) {
        }
        if (e.coroutine != objectRef.alpha) {
        }
    }
}
