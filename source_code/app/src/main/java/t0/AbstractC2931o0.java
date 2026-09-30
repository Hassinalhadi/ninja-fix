package t0;

import androidx.compose.runtime.C0564b;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import pe.AbstractC2327c;
import s0.AbstractC2555o;
import w.C3226d;

/* renamed from: t0.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2931o0 {
    public static final androidx.compose.runtime.E0 alpha = new androidx.compose.runtime.N(C2925l0.purple);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(w.q qVar, C3226d c3226d, Pd.c cVar) {
        C2927m0 c2927m0;
        int i4;
        if (cVar instanceof C2927m0) {
            C2927m0 c2927m02 = (C2927m0) cVar;
            int i5 = c2927m02.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2927m02.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                c2927m0 = c2927m02;
                Object obj = c2927m0.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c2927m0.purple;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2327c.amber(obj);
                }
                ResultKt.alpha(obj);
                if (qVar.getNode().isAttached()) {
                    s0.W hotel = AbstractC2555o.hotel(qVar);
                    P.i iVar = (P.i) AbstractC2555o.golf(qVar).f13301t;
                    iVar.getClass();
                    if (C0564b.azure(iVar, alpha) == null) {
                        c2927m0.purple = 1;
                        bravo(hotel, c3226d, c2927m0);
                        return;
                    }
                    throw new ClassCastException();
                }
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
        }
        c2927m0 = new Pd.c(cVar);
        Object obj2 = c2927m0.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2927m0.purple;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(s0.W w4, C3226d c3226d, Pd.c cVar) {
        C2929n0 c2929n0;
        int i4;
        if (cVar instanceof C2929n0) {
            C2929n0 c2929n02 = (C2929n0) cVar;
            int i5 = c2929n02.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2929n02.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                c2929n0 = c2929n02;
                Object obj = c2929n0.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c2929n0.purple;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw AbstractC2327c.amber(obj);
                    }
                    throw AbstractC2327c.amber(obj);
                }
                ResultKt.alpha(obj);
                c2929n0.purple = 1;
                ((C2946x) w4).coral(c3226d, c2929n0);
                return;
            }
        }
        c2929n0 = new Pd.c(cVar);
        Object obj2 = c2929n0.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2929n0.purple;
        if (i4 == 0) {
        }
    }
}
