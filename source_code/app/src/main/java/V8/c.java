package V8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public final HashMap alpha;

    public c(Set set) {
        this.alpha = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = this.alpha;
            bVar.getClass();
            hashMap.put(a.class, bVar.alpha);
        }
    }

    public c(eg.a _koin) {
        Intrinsics.echo(_koin, "_koin");
        this.alpha = new HashMap();
    }

    public c(int i4) {
        switch (i4) {
            case 2:
                this.alpha = new HashMap();
                new HashMap();
                return;
            default:
                this.alpha = new HashMap();
                return;
        }
    }
}
