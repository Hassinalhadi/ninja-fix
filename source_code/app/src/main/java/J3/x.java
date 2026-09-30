package J3;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class x {
    public static final ab echo = new ab(10);
    public static final ac foxtrot = new ac(2);
    public final ArrayList alpha;
    public final ab bravo;
    public final HashSet charlie;
    public final J2.t delta;

    public x(J2.t tVar) {
        ab abVar = echo;
        this.alpha = new ArrayList();
        this.charlie = new HashSet();
        this.delta = tVar;
        this.bravo = abVar;
    }

    public final synchronized void alpha(Class cls, Class cls2, s sVar) {
        w wVar = new w(cls, cls2, sVar);
        ArrayList arrayList = this.alpha;
        arrayList.add(arrayList.size(), wVar);
    }

    public final synchronized r bravo(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.alpha.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (this.charlie.contains(wVar)) {
                    z2 = true;
                } else if (wVar.alpha.isAssignableFrom(cls) && wVar.bravo.isAssignableFrom(cls2)) {
                    this.charlie.add(wVar);
                    arrayList.add(wVar.charlie.sierra(this));
                    this.charlie.remove(wVar);
                }
            }
            if (arrayList.size() > 1) {
                ab abVar = this.bravo;
                J2.t tVar = this.delta;
                abVar.getClass();
                return new b(2, arrayList, tVar);
            }
            if (arrayList.size() == 1) {
                return (r) arrayList.get(0);
            }
            if (z2) {
                return foxtrot;
            }
            throw new Registry$NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.charlie.clear();
            throw th;
        }
    }

    public final synchronized ArrayList charlie(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.alpha.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (!this.charlie.contains(wVar) && wVar.alpha.isAssignableFrom(cls)) {
                    this.charlie.add(wVar);
                    arrayList.add(wVar.charlie.sierra(this));
                    this.charlie.remove(wVar);
                }
            }
        } catch (Throwable th) {
            this.charlie.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList delta(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (!arrayList.contains(wVar.bravo) && wVar.alpha.isAssignableFrom(cls)) {
                arrayList.add(wVar.bravo);
            }
        }
        return arrayList;
    }
}
