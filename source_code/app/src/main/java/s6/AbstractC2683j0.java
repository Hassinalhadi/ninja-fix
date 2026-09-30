package s6;

import androidx.recyclerview.widget.RecyclerView;
import g0.C1726f;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: s6.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2683j0 {
    public static C1726f alpha;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(m0.af afVar, m0.l lVar, Pd.a aVar) {
        d.ar arVar;
        int i4;
        int size;
        int i5;
        if (aVar instanceof d.ar) {
            d.ar arVar2 = (d.ar) aVar;
            int i10 = arVar2.silver;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                arVar2.silver = i10 - RecyclerView.UNDEFINED_DURATION;
                arVar = arVar2;
                Object obj = arVar.red;
                Object obj2 = Od.a.alpha;
                i4 = arVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        m0.l lVar2 = arVar.purple;
                        m0.af afVar2 = arVar.alpha;
                        ResultKt.alpha(obj);
                        lVar = lVar2;
                        afVar = afVar2;
                        List list = ((m0.k) obj).alpha;
                        size = list.size();
                        i5 = 0;
                        while (i5 < size) {
                            if (((m0.r) list.get(i5)).delta) {
                                arVar.alpha = afVar;
                                arVar.purple = lVar;
                                arVar.silver = 1;
                                obj = afVar.charlie(lVar, arVar);
                                afVar = afVar;
                                if (obj == obj2) {
                                    return obj2;
                                }
                                List list2 = ((m0.k) obj).alpha;
                                size = list2.size();
                                i5 = 0;
                                while (i5 < size) {
                                }
                            } else {
                                i5++;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                List list3 = afVar.white.teal.alpha;
                int size2 = list3.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((m0.r) list3.get(i11)).delta) {
                        arVar.alpha = afVar;
                        arVar.purple = lVar;
                        arVar.silver = 1;
                        obj = afVar.charlie(lVar, arVar);
                        afVar = afVar;
                        if (obj == obj2) {
                        }
                        List list22 = ((m0.k) obj).alpha;
                        size = list22.size();
                        i5 = 0;
                        while (i5 < size) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        arVar = new Pd.c(aVar);
        Object obj3 = arVar.red;
        Object obj22 = Od.a.alpha;
        i4 = arVar.silver;
        if (i4 == 0) {
        }
    }

    public static final Object bravo(m0.u uVar, Xd.l lVar, Nd.c cVar) {
        Object b2 = ((m0.ah) uVar).b(new d.as(cVar.getContext(), lVar, null), cVar);
        if (b2 == Od.a.alpha) {
            return b2;
        }
        return Unit.INSTANCE;
    }
}
