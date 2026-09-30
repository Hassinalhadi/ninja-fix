package Q3;

import E3.l;
import T3.e;
import androidx.camera.core.impl.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {
    public final ArrayList alpha;

    public c(int i4) {
        switch (i4) {
            case 1:
                this.alpha = new ArrayList();
                return;
            case 2:
                this.alpha = new ArrayList();
                return;
            default:
                this.alpha = new ArrayList();
                return;
        }
    }

    public static String foxtrot(c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.alpha.iterator();
        while (it.hasNext()) {
            arrayList.add(((D) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " | ");
            }
        }
        return sb2.toString();
    }

    public boolean alpha(Class cls) {
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((D) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public synchronized l bravo(Class cls) {
        int size = this.alpha.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.alpha.get(i4);
            if (eVar.alpha.isAssignableFrom(cls)) {
                return eVar.bravo;
            }
        }
        return null;
    }

    public synchronized a charlie(Class cls, Class cls2) {
        boolean z2;
        if (cls2.isAssignableFrom(cls)) {
            return d.purple;
        }
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.alpha.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.bravo)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return bVar.charlie;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public D delta(Class cls) {
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            D d4 = (D) it.next();
            if (d4.getClass() == cls) {
                return d4;
            }
        }
        return null;
    }

    public synchronized ArrayList echo(Class cls, Class cls2) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.alpha.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.bravo)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !arrayList.contains(bVar.bravo)) {
                arrayList.add(bVar.bravo);
            }
        }
        return arrayList;
    }

    public c(List list) {
        this.alpha = new ArrayList(list);
    }
}
