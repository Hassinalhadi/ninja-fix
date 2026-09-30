package Wf;

import Lb.am;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class u {
    public static final s alpha = new Object();
    public static final E0 bravo = new N(new Vc.i(9));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Wf.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.E0, androidx.compose.runtime.N] */
    static {
        int i4 = t.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public static final v alpha(q qVar, r environment) {
        int i4;
        Intrinsics.echo(qVar, "<this>");
        Intrinsics.echo(environment, "environment");
        List z2 = CollectionsKt.z(qVar.bravo);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z2) {
            Set set = ((v) obj).alpha;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual((o) it.next(), environment.alpha)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Set set2 = ((v) next).alpha;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it3 = set2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual((o) it3.next(), environment.bravo)) {
                        arrayList2.add(next);
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                Set set3 = ((v) next2).alpha;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it5 = set3.iterator();
                    while (it5.hasNext()) {
                        if (((o) it5.next()) instanceof p) {
                            break;
                        }
                    }
                }
                arrayList2.add(next2);
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
                for (Object obj2 : z2) {
                    Set<o> set4 = ((v) obj2).alpha;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        for (o oVar : set4) {
                            if (!(oVar instanceof n) && !(oVar instanceof p)) {
                            }
                        }
                    }
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (v) CollectionsKt.gold(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            aj ajVar = environment.charlie;
            if (!hasNext) {
                break;
            }
            Object next3 = it6.next();
            Set set5 = ((v) next3).alpha;
            if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                Iterator it7 = set5.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual((o) it7.next(), ajVar)) {
                        arrayList3.add(next3);
                        break;
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                Set set6 = ((v) obj3).alpha;
                if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                    Iterator it8 = set6.iterator();
                    while (it8.hasNext()) {
                        if (((o) it8.next()).getClass() == aj.class) {
                            break;
                        }
                    }
                }
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.size() == 1) {
            return (v) CollectionsKt.gold(arrayList3);
        }
        List emptyList = CollectionsKt.emptyList();
        Qd.b bVar = d.f2238c;
        ArrayList arrayList4 = new ArrayList();
        Iterator it9 = bVar.iterator();
        while (true) {
            boolean hasNext2 = it9.hasNext();
            i4 = environment.delta.alpha;
            if (!hasNext2) {
                break;
            }
            Object next4 = it9.next();
            if (((d) next4).alpha >= i4) {
                arrayList4.add(next4);
            }
        }
        Iterator it10 = CollectionsKt.p(arrayList4, new Sb.k(4)).iterator();
        ?? r22 = emptyList;
        while (true) {
            if (!it10.hasNext()) {
                break;
            }
            d dVar = (d) it10.next();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList3) {
                Set set7 = ((v) obj4).alpha;
                if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                    Iterator it11 = set7.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            break;
                        }
                        if (((o) it11.next()) == dVar) {
                            arrayList5.add(obj4);
                            break;
                        }
                    }
                }
            }
            if (!arrayList5.isEmpty()) {
                r22 = arrayList5;
                break;
            }
            r22 = arrayList5;
        }
        if (r22.isEmpty()) {
            ArrayList teal = CollectionsKt.teal(d.f2238c, d.red);
            ArrayList arrayList6 = new ArrayList();
            Iterator it12 = teal.iterator();
            while (it12.hasNext()) {
                Object next5 = it12.next();
                if (((d) next5).alpha < i4) {
                    arrayList6.add(next5);
                }
            }
            Iterator it13 = CollectionsKt.p(arrayList6, new Sb.k(5)).iterator();
            r22 = r22;
            while (true) {
                if (!it13.hasNext()) {
                    break;
                }
                d dVar2 = (d) it13.next();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayList3) {
                    Set set8 = ((v) obj5).alpha;
                    if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                        Iterator it14 = set8.iterator();
                        while (true) {
                            if (!it14.hasNext()) {
                                break;
                            }
                            if (((o) it14.next()) == dVar2) {
                                arrayList7.add(obj5);
                                break;
                            }
                        }
                    }
                }
                if (!arrayList7.isEmpty()) {
                    r22 = arrayList7;
                    break;
                }
                r22 = arrayList7;
            }
            if (r22.isEmpty()) {
                r22 = new ArrayList();
                for (Object obj6 : arrayList3) {
                    Set set9 = ((v) obj6).alpha;
                    if (!(set9 instanceof Collection) || !set9.isEmpty()) {
                        Iterator it15 = set9.iterator();
                        while (it15.hasNext()) {
                            if (((o) it15.next()) instanceof d) {
                                break;
                            }
                        }
                    }
                    r22.add(obj6);
                }
                if (r22.isEmpty()) {
                    r22 = new ArrayList();
                    for (Object obj7 : arrayList3) {
                        Set set10 = ((v) obj7).alpha;
                        if (!(set10 instanceof Collection) || !set10.isEmpty()) {
                            Iterator it16 = set10.iterator();
                            while (true) {
                                if (!it16.hasNext()) {
                                    break;
                                }
                                if (((o) it16.next()) == d.red) {
                                    r22.add(obj7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        List list = r22;
        if (list.size() == 1) {
            return (v) CollectionsKt.gold(list);
        }
        boolean isEmpty = list.isEmpty();
        String str = qVar.alpha;
        if (isEmpty) {
            throw new IllegalStateException(("Resource with ID='" + str + "' not found").toString());
        }
        throw new IllegalStateException(Q0.c.papa("Resource with ID='", str, "' has more than one file: ", CollectionsKt.maroon(list, null, null, null, new am(27), 31)));
    }
}
