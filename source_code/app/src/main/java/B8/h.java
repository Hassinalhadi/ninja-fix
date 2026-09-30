package B8;

import android.os.SystemClock;
import av.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class h {
    public final long alpha;
    public long bravo;
    public final Object charlie;

    public h(long j5) {
        this.charlie = new LinkedHashMap(100, 0.75f, true);
        this.alpha = j5;
    }

    public synchronized Object alpha(Object obj) {
        Object obj2;
        Y3.i iVar = (Y3.i) ((LinkedHashMap) this.charlie).get(obj);
        if (iVar != null) {
            obj2 = iVar.alpha;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int bravo() {
        if (!((r) this.charlie).charlie()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.bravo == -1) {
            this.bravo = uptimeMillis;
        }
        long j5 = uptimeMillis - this.bravo;
        if (j5 <= 120000) {
            return 1000;
        }
        if (j5 <= 300000) {
            return 2000;
        }
        return 4000;
    }

    public int charlie() {
        boolean charlie = ((r) this.charlie).charlie();
        long j5 = this.alpha;
        if (!charlie) {
            if (j5 <= 0) {
                return 10000;
            }
            return Math.min((int) j5, 10000);
        }
        if (j5 <= 0) {
            return 1800000;
        }
        return Math.min((int) j5, 1800000);
    }

    public int delta(Object obj) {
        return 1;
    }

    public void echo(Object obj, Object obj2) {
    }

    public synchronized Object foxtrot(Object obj, Object obj2) {
        Y3.i iVar;
        int delta = delta(obj2);
        long j5 = delta;
        Object obj3 = null;
        if (j5 >= this.alpha) {
            echo(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.bravo += j5;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.charlie;
        if (obj2 == null) {
            iVar = null;
        } else {
            iVar = new Y3.i(delta, obj2);
        }
        Y3.i iVar2 = (Y3.i) linkedHashMap.put(obj, iVar);
        if (iVar2 != null) {
            this.bravo -= iVar2.bravo;
            if (!iVar2.alpha.equals(obj2)) {
                echo(obj, iVar2.alpha);
            }
        }
        golf(this.alpha);
        if (iVar2 != null) {
            obj3 = iVar2.alpha;
        }
        return obj3;
    }

    public synchronized void golf(long j5) {
        while (this.bravo > j5) {
            Iterator it = ((LinkedHashMap) this.charlie).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Y3.i iVar = (Y3.i) entry.getValue();
            this.bravo -= iVar.bravo;
            Object key = entry.getKey();
            it.remove();
            echo(key, iVar.alpha);
        }
    }

    public h(long j5, long j6, TimeUnit timeUnit) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = timeUnit;
    }

    public h(r rVar, long j5) {
        this.charlie = rVar;
        this.bravo = -1L;
        this.alpha = j5;
    }
}
