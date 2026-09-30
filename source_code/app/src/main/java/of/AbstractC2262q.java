package of;

import com.google.android.material.internal.s;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: of.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2262q {
    public static final C2260o alpha = new Object();

    public static final void alpha(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List delta(ArrayList arrayList) {
        Intrinsics.echo(arrayList, "<this>");
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return ab.juliet(CollectionsKt.gold(arrayList));
        }
        return CollectionsKt.emptyList();
    }

    public static Object echo(List list, InterfaceC2247b interfaceC2247b, AbstractC2262q abstractC2262q) {
        s sVar = new s(21);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            foxtrot(it.next(), interfaceC2247b, sVar, abstractC2262q);
        }
        return abstractC2262q.india();
    }

    public static void foxtrot(Object obj, InterfaceC2247b interfaceC2247b, s sVar, AbstractC2262q abstractC2262q) {
        if (obj != null) {
            if (!((HashSet) sVar.purple).add(obj) || !abstractC2262q.charlie(obj)) {
                return;
            }
            Iterator it = interfaceC2247b.golf(obj).iterator();
            while (it.hasNext()) {
                foxtrot(it.next(), interfaceC2247b, sVar, abstractC2262q);
            }
            abstractC2262q.bravo(obj);
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Boolean golf(List list, InterfaceC2247b interfaceC2247b, Function1 function1) {
        return (Boolean) echo(list, interfaceC2247b, new C2246a(function1, new boolean[1]));
    }

    public static final boolean hotel(Throwable th) {
        Class<?> cls = th.getClass();
        while (!Intrinsics.areEqual(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static void juliet(Object obj) {
        if (!(obj instanceof C2261p)) {
        } else {
            throw ((C2261p) obj).alpha;
        }
    }

    public void bravo(Object obj) {
    }

    public abstract boolean charlie(Object obj);

    public abstract Object india();
}
