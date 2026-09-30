package aq;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class f implements Iterable {
    public c alpha;
    public c purple;
    public final WeakHashMap red = new WeakHashMap();
    public int silver = 0;

    public c alpha(Object obj) {
        c cVar = this.alpha;
        while (cVar != null && !cVar.alpha.equals(obj)) {
            cVar = cVar.red;
        }
        return cVar;
    }

    public Object bravo(Object obj, Object obj2) {
        c alpha = alpha(obj);
        if (alpha != null) {
            return alpha.purple;
        }
        c cVar = new c(obj, obj2);
        this.silver++;
        c cVar2 = this.purple;
        if (cVar2 == null) {
            this.alpha = cVar;
            this.purple = cVar;
            return null;
        }
        cVar2.red = cVar;
        cVar.silver = cVar2;
        this.purple = cVar;
        return null;
    }

    public Object delta(Object obj) {
        c alpha = alpha(obj);
        if (alpha == null) {
            return null;
        }
        this.silver--;
        WeakHashMap weakHashMap = this.red;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).alpha(alpha);
            }
        }
        c cVar = alpha.silver;
        if (cVar != null) {
            cVar.red = alpha.red;
        } else {
            this.alpha = alpha.red;
        }
        c cVar2 = alpha.red;
        if (cVar2 != null) {
            cVar2.silver = cVar;
        } else {
            this.purple = cVar;
        }
        alpha.red = null;
        alpha.silver = null;
        return alpha.purple;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((aq.b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.silver != fVar.silver) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i4 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i4;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.alpha, this.purple, 0);
        this.red.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb2.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append(Constants.AES_SUFFIX);
                return sb2.toString();
            }
        }
    }
}
