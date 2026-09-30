package K8;

import O7.i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public static final c alpha = new Object();
    public static final Map bravo = Collections.synchronizedMap(new LinkedHashMap());

    public static a alpha(d dVar) {
        Map dependencies = bravo;
        Intrinsics.delta(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:12:0x0094, B:23:0x00ab, B:24:0x00c3), top: B:11:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0092 -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(Pd.c cVar) {
        b bVar;
        int i4;
        Iterator it;
        Map map;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.f1676t;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar.f1676t = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = bVar.yellow;
                Od.a aVar = Od.a.alpha;
                i4 = bVar.f1676t;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Object key = bVar.white;
                        map = bVar.teal;
                        Object obj2 = bVar.silver;
                        d subscriberName = bVar.red;
                        it = bVar.purple;
                        Map map2 = bVar.alpha;
                        ResultKt.alpha(obj);
                        Object obj3 = obj2;
                        try {
                            Intrinsics.echo(subscriberName, "subscriberName");
                            i iVar = alpha(subscriberName).bravo;
                            if (iVar == null) {
                                ((Ef.c) obj3).foxtrot(null);
                                map.put(key, iVar);
                                map = map2;
                                if (!it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    key = entry.getKey();
                                    subscriberName = (d) entry.getKey();
                                    Ef.c cVar2 = ((a) entry.getValue()).alpha;
                                    bVar.alpha = map;
                                    bVar.purple = it;
                                    bVar.red = subscriberName;
                                    bVar.silver = cVar2;
                                    bVar.teal = map;
                                    bVar.white = key;
                                    bVar.f1676t = 1;
                                    if (cVar2.delta(bVar) == aVar) {
                                        return aVar;
                                    }
                                    map2 = map;
                                    obj3 = cVar2;
                                    Intrinsics.echo(subscriberName, "subscriberName");
                                    i iVar2 = alpha(subscriberName).bravo;
                                    if (iVar2 == null) {
                                        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
                                    }
                                } else {
                                    return map;
                                }
                            }
                        } catch (Throwable th) {
                            ((Ef.c) obj3).foxtrot(null);
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Map dependencies = bravo;
                    Intrinsics.delta(dependencies, "dependencies");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(y.quebec(dependencies.size()));
                    it = dependencies.entrySet().iterator();
                    map = linkedHashMap;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        bVar = new b(this, cVar);
        Object obj4 = bVar.yellow;
        Od.a aVar2 = Od.a.alpha;
        i4 = bVar.f1676t;
        if (i4 == 0) {
        }
    }
}
