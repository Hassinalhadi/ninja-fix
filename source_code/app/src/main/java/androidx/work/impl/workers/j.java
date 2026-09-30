package androidx.work.impl.workers;

import A2.z;
import C1.t;
import F2.n;
import J2.p;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import yf.AbstractC3428A;
import yf.s;

/* loaded from: classes3.dex */
public abstract class j {
    public static final String alpha;

    static {
        String golf = z.golf("ConstraintTrkngWrkr");
        Intrinsics.delta(golf, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        alpha = golf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(n nVar, p pVar, Pd.c cVar) {
        h hVar;
        int i4;
        if (cVar instanceof h) {
            h hVar2 = (h) cVar;
            int i5 = hVar2.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                hVar2.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                hVar = hVar2;
                Object obj = hVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = hVar.purple;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    t tVar = new t(2, new s(nVar.bravo(pVar), new i(pVar, null), 3));
                    hVar.purple = 1;
                    obj = AbstractC3428A.november(tVar, hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return new Integer(((F2.b) obj).alpha);
            }
        }
        hVar = new Pd.c(cVar);
        Object obj2 = hVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = hVar.purple;
        if (i4 == 0) {
        }
        return new Integer(((F2.b) obj2).alpha);
    }
}
