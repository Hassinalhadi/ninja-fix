package d;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public abstract class ab {
    public static final float alpha = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (Z.b.bravo(m0.q.golf(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005e -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(m0.af afVar, long j5, Pd.c cVar) {
        C1559w c1559w;
        int i4;
        m0.af afVar2;
        kotlin.jvm.internal.t tVar;
        Object charlie;
        Object obj;
        Object obj2;
        if (cVar instanceof C1559w) {
            C1559w c1559w2 = (C1559w) cVar;
            int i5 = c1559w2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1559w2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                c1559w = c1559w2;
                Object obj3 = c1559w.red;
                Od.a aVar = Od.a.alpha;
                i4 = c1559w.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        tVar = c1559w.purple;
                        m0.af afVar3 = c1559w.alpha;
                        ResultKt.alpha(obj3);
                        m0.k kVar = (m0.k) obj3;
                        List list = kVar.alpha;
                        int size = list.size();
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                obj = list.get(i11);
                                if (m0.q.delta(((m0.r) obj).alpha, tVar.alpha)) {
                                    break;
                                }
                                i11++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        m0.r rVar = (m0.r) obj;
                        if (rVar == null) {
                            if (m0.q.charlie(rVar)) {
                                List list2 = kVar.alpha;
                                int size2 = list2.size();
                                while (true) {
                                    if (i10 < size2) {
                                        obj2 = list2.get(i10);
                                        if (((m0.r) obj2).delta) {
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                m0.r rVar2 = (m0.r) obj2;
                                if (rVar2 != null) {
                                    tVar.alpha = rVar2.alpha;
                                    afVar2 = afVar3;
                                    c1559w.alpha = afVar2;
                                    c1559w.purple = tVar;
                                    c1559w.silver = 1;
                                    charlie = afVar2.charlie(m0.l.purple, c1559w);
                                    if (charlie != aVar) {
                                        return aVar;
                                    }
                                    m0.af afVar4 = afVar2;
                                    obj3 = charlie;
                                    afVar3 = afVar4;
                                }
                            }
                            m0.k kVar2 = (m0.k) obj3;
                            List list3 = kVar2.alpha;
                            int size3 = list3.size();
                            int i102 = 0;
                            int i112 = 0;
                            while (true) {
                                if (i112 >= size3) {
                                }
                                i112++;
                            }
                            m0.r rVar3 = (m0.r) obj;
                            if (rVar3 == null) {
                                rVar3 = null;
                            }
                        }
                        if (rVar3 == null || rVar3.bravo()) {
                            return null;
                        }
                        return rVar3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj3);
                afVar2 = afVar;
                if (!delta(afVar2.white.teal, j5)) {
                    ?? obj4 = new Object();
                    obj4.alpha = j5;
                    tVar = obj4;
                    c1559w.alpha = afVar2;
                    c1559w.purple = tVar;
                    c1559w.silver = 1;
                    charlie = afVar2.charlie(m0.l.purple, c1559w);
                    if (charlie != aVar) {
                    }
                }
                return null;
            }
        }
        c1559w = new Pd.c(cVar);
        Object obj32 = c1559w.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = c1559w.silver;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d A[Catch: PointerEventTimeoutCancellationException -> 0x00a6, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00a6, blocks: (B:11:0x002a, B:12:0x0099, B:14:0x009d, B:34:0x007f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(m0.af afVar, long j5, Pd.c cVar) {
        C1560x c1560x;
        int i4;
        Object obj;
        m0.r rVar;
        kotlin.jvm.internal.q qVar;
        try {
            if (cVar instanceof C1560x) {
                C1560x c1560x2 = (C1560x) cVar;
                int i5 = c1560x2.teal;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c1560x2.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                    c1560x = c1560x2;
                    Object obj2 = c1560x.silver;
                    Object obj3 = Od.a.alpha;
                    i4 = c1560x.teal;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            qVar = c1560x.red;
                            Ref.ObjectRef objectRef = c1560x.purple;
                            rVar = c1560x.alpha;
                            ResultKt.alpha(obj2);
                            j5 = objectRef;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj2);
                        if (!delta(afVar.white.teal, j5)) {
                            List list = afVar.white.teal.alpha;
                            int size = list.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 < size) {
                                    obj = list.get(i10);
                                    if (m0.q.delta(((m0.r) obj).alpha, j5)) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            rVar = (m0.r) obj;
                            if (rVar != null) {
                                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                                objectRef3.alpha = rVar;
                                long bravo = afVar.golf().bravo();
                                ?? obj4 = new Object();
                                Xd.l c1561y = new C1561y(obj4, objectRef3, objectRef2, null);
                                c1560x.alpha = rVar;
                                c1560x.purple = objectRef2;
                                c1560x.red = obj4;
                                c1560x.teal = 1;
                                if (afVar.india(bravo, c1561y, c1560x) == obj3) {
                                    return obj3;
                                }
                                qVar = obj4;
                                j5 = objectRef2;
                            }
                        }
                        return null;
                    }
                    if (qVar.alpha) {
                        m0.r rVar2 = (m0.r) j5.alpha;
                        if (rVar2 == null) {
                            return rVar;
                        }
                        return rVar2;
                    }
                    return null;
                }
            }
            if (i4 == 0) {
            }
            if (qVar.alpha) {
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            m0.r rVar3 = (m0.r) j5.alpha;
            if (rVar3 != null) {
                return rVar3;
            }
            return rVar;
        }
        c1560x = new Pd.c(cVar);
        Object obj22 = c1560x.silver;
        Object obj32 = Od.a.alpha;
        i4 = c1560x.teal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object charlie(m0.af afVar, long j5, Function1 function1, Pd.c cVar) {
        aa aaVar;
        int i4;
        m0.r rVar;
        if (cVar instanceof aa) {
            aa aaVar2 = (aa) cVar;
            int i5 = aaVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aaVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                aaVar = aaVar2;
                Object obj = aaVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = aaVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Function1 function12 = aaVar.purple;
                        m0.af afVar2 = aaVar.alpha;
                        ResultKt.alpha(obj);
                        function1 = function12;
                        afVar = afVar2;
                        rVar = (m0.r) obj;
                        if (rVar == null) {
                            if (m0.q.charlie(rVar)) {
                                return Boolean.TRUE;
                            }
                            function1.invoke(rVar);
                            j5 = rVar.alpha;
                            aaVar.alpha = afVar;
                            aaVar.purple = function1;
                            aaVar.silver = 1;
                            obj = alpha(afVar, j5, aaVar);
                            if (obj == aVar) {
                                return aVar;
                            }
                            rVar = (m0.r) obj;
                            if (rVar == null) {
                                return Boolean.FALSE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    aaVar.alpha = afVar;
                    aaVar.purple = function1;
                    aaVar.silver = 1;
                    obj = alpha(afVar, j5, aaVar);
                    if (obj == aVar) {
                    }
                    rVar = (m0.r) obj;
                    if (rVar == null) {
                    }
                }
            }
        }
        aaVar = new Pd.c(cVar);
        Object obj2 = aaVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = aaVar.silver;
        if (i4 == 0) {
        }
    }

    public static final boolean delta(m0.k kVar, long j5) {
        Object obj;
        List list = kVar.alpha;
        int size = list.size();
        boolean z2 = false;
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                obj = list.get(i4);
                if (m0.q.delta(((m0.r) obj).alpha, j5)) {
                    break;
                }
                i4++;
            } else {
                obj = null;
                break;
            }
        }
        m0.r rVar = (m0.r) obj;
        if (rVar != null && rVar.delta) {
            z2 = true;
        }
        return true ^ z2;
    }
}
