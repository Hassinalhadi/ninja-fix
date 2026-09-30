package C1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import s6.AbstractC2689j6;

/* loaded from: classes3.dex */
public abstract class g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(List list, ar arVar, Pd.c cVar) {
        C0082d c0082d;
        int i4;
        List list2;
        Ref.ObjectRef objectRef;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0082d) {
            C0082d c0082d2 = (C0082d) cVar;
            int i5 = c0082d2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0082d2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                c0082d = c0082d2;
                Object obj = c0082d.red;
                Object obj2 = Od.a.alpha;
                i4 = c0082d.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            it = c0082d.purple;
                            objectRef = (Ref.ObjectRef) c0082d.alpha;
                            try {
                                ResultKt.alpha(obj);
                            } catch (Throwable th2) {
                                Object obj3 = objectRef.alpha;
                                if (obj3 == null) {
                                    objectRef.alpha = th2;
                                } else {
                                    Intrinsics.checkNotNull(obj3);
                                    AbstractC2689j6.charlie((Throwable) obj3, th2);
                                }
                            }
                            while (it.hasNext()) {
                                Function1 function1 = (Function1) it.next();
                                c0082d.alpha = objectRef;
                                c0082d.purple = it;
                                c0082d.silver = 2;
                                if (function1.invoke(c0082d) == obj2) {
                                    return obj2;
                                }
                            }
                            th = (Throwable) objectRef.alpha;
                            if (th == null) {
                                return Unit.INSTANCE;
                            }
                            throw th;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) c0082d.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    ArrayList arrayList = new ArrayList();
                    f fVar = new f(list, arrayList, null);
                    c0082d.alpha = arrayList;
                    c0082d.silver = 1;
                    if (((k) arVar).alpha(fVar, c0082d) != obj2) {
                        list2 = arrayList;
                    } else {
                        return obj2;
                    }
                }
                objectRef = new Ref.ObjectRef();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) objectRef.alpha;
                if (th == null) {
                }
            }
        }
        c0082d = new Pd.c(cVar);
        Object obj4 = c0082d.red;
        Object obj22 = Od.a.alpha;
        i4 = c0082d.silver;
        if (i4 == 0) {
        }
        objectRef = new Ref.ObjectRef();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) objectRef.alpha;
        if (th == null) {
        }
    }
}
