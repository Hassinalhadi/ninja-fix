package eg;

import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.measurement.internal.C1467s;
import hg.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.DefinitionOverrideException;

/* loaded from: classes2.dex */
public final class b {
    public final a alpha = new a();
    public final boolean bravo = true;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        r0 = r5.bravo.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        if (r0.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
    
        r5 = (hg.d) r0.next();
        r8.put(java.lang.Integer.valueOf(r5.alpha.hashCode()), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015b, code lost:
    
        r0 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(List list) {
        Object obj;
        b bVar = this;
        a aVar = bVar.alpha;
        aVar.getClass();
        LinkedHashSet<jg.a> linkedHashSet = new LinkedHashSet();
        l lVar = new l(q.victor(list));
        while (!lVar.isEmpty()) {
            jg.a aVar2 = (jg.a) lVar.removeLast();
            if (linkedHashSet.add(aVar2)) {
                Iterator it = aVar2.echo.iterator();
                while (it.hasNext()) {
                    jg.a aVar3 = (jg.a) it.next();
                    if (!linkedHashSet.contains(aVar3)) {
                        lVar.addLast(aVar3);
                    }
                }
            }
        }
        C1298c c1298c = aVar.delta;
        c1298c.getClass();
        for (jg.a aVar4 : linkedHashSet) {
            Iterator it2 = aVar4.charlie.entrySet().iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1298c.silver;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                String mapping = (String) entry.getKey();
                hg.b factory = (hg.b) entry.getValue();
                Intrinsics.echo(mapping, "mapping");
                Intrinsics.echo(factory, "factory");
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) c1298c.red;
                hg.b bVar2 = (hg.b) concurrentHashMap2.get(mapping);
                fg.a aVar5 = factory.alpha;
                a aVar6 = (a) c1298c.purple;
                if (bVar2 != null) {
                    if (bVar.bravo) {
                        C1467s c1467s = aVar6.alpha;
                        String msg = "(+) override index '" + mapping + "' -> '" + aVar5 + '\'';
                        c1467s.getClass();
                        Intrinsics.echo(msg, "msg");
                        c1467s.delta(ig.a.red, msg);
                        Iterator it3 = concurrentHashMap.values().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (Intrinsics.areEqual(((d) obj).alpha, aVar5)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (((d) obj) != null) {
                            concurrentHashMap.remove(Integer.valueOf(aVar5.hashCode()));
                        }
                    } else {
                        throw new DefinitionOverrideException("Already existing definition for " + aVar5 + " at " + mapping);
                    }
                }
                aVar6.alpha.charlie("(+) index '" + mapping + "' -> '" + aVar5 + '\'');
                concurrentHashMap2.put(mapping, factory);
                bVar = this;
            }
        }
        mg.a aVar7 = aVar.charlie;
        aVar7.getClass();
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            aVar7.bravo.addAll(((jg.a) it4.next()).delta);
        }
    }
}
