package F7;

import Aa.m;
import J2.l;
import V5.x;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.aw;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class c implements b {
    public static volatile c charlie;
    public final m alpha;
    public final ConcurrentHashMap bravo;

    public c(m mVar) {
        x.hotel(mVar);
        this.alpha = mVar;
        this.bravo = new ConcurrentHashMap();
    }

    public final void alpha(String str, String str2, Bundle bundle) {
        if (G7.a.charlie(str) && G7.a.bravo(bundle, str2) && G7.a.alpha(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            J j5 = (J) this.alpha.purple;
            j5.getClass();
            j5.bravo(new aw(j5, str, str2, bundle, true, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [J2.l, java.lang.Object] */
    public final u8.b bravo(String str, l lVar) {
        m mVar;
        if (G7.a.charlie(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.bravo;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                m mVar2 = this.alpha;
                if (equals) {
                    ?? obj = new Object();
                    obj.purple = lVar;
                    mVar2.delta(new G7.b(0, obj));
                    obj.alpha = new HashSet();
                    mVar = obj;
                } else if ("clx".equals(str)) {
                    mVar = new m(mVar2, lVar);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    concurrentHashMap.put(str, mVar);
                    return new u8.b(2);
                }
            }
        }
        return null;
    }
}
