package D8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {
    public final String alpha;
    public final c bravo;

    public b(Set set, c cVar) {
        this.alpha = bravo(set);
        this.bravo = cVar;
    }

    public static String bravo(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.alpha);
            sb2.append('/');
            sb2.append(aVar.bravo);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String alpha() {
        Set unmodifiableSet;
        c cVar = this.bravo;
        synchronized (((HashSet) cVar.purple)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.purple);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.alpha;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + bravo(cVar.golf());
    }
}
