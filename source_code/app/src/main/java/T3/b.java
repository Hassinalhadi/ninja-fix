package T3;

import g0.C1730j;
import g0.C1731k;
import g0.aa;
import g0.l;
import g0.m;
import g0.n;
import g0.p;
import g0.s;
import g0.t;
import g0.u;
import g0.x;
import g0.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b {
    public final ArrayList alpha;

    public b(int i4, boolean z2) {
        switch (i4) {
            case 1:
                this.alpha = new ArrayList();
                return;
            case 2:
                this.alpha = new ArrayList(32);
                return;
            default:
                this.alpha = new ArrayList();
                return;
        }
    }

    public void alpha(Object obj) {
        this.alpha.add(obj);
    }

    public void bravo(Object obj) {
        if (obj != null) {
            boolean z2 = obj instanceof Object[];
            ArrayList arrayList = this.alpha;
            if (z2) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else if (obj instanceof Iterator) {
                Iterator it2 = (Iterator) obj;
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public void charlie() {
        this.alpha.add(C1730j.charlie);
    }

    public void delta(float f5, float f10, float f11, float f12, float f13, float f14) {
        this.alpha.add(new C1731k(f5, f10, f11, f12, f13, f14));
    }

    public void echo(float f5, float f10, float f11, float f12, float f13, float f14) {
        this.alpha.add(new s(f5, f10, f11, f12, f13, f14));
    }

    public void foxtrot(float f5) {
        this.alpha.add(new l(f5));
    }

    public void golf(float f5) {
        this.alpha.add(new t(f5));
    }

    public void hotel(float f5, float f10) {
        this.alpha.add(new m(f5, f10));
    }

    public void india(float f5, float f10) {
        this.alpha.add(new u(f5, f10));
    }

    public void juliet(float f5, float f10) {
        this.alpha.add(new n(f5, f10));
    }

    public void kilo(float f5, float f10, float f11, float f12) {
        this.alpha.add(new p(f5, f10, f11, f12));
    }

    public void lima(float f5, float f10, float f11, float f12) {
        this.alpha.add(new x(f5, f10, f11, f12));
    }

    public void mike(float f5) {
        this.alpha.add(new aa(f5));
    }

    public void november(float f5) {
        this.alpha.add(new z(f5));
    }

    public b(int i4) {
        this.alpha = new ArrayList(i4);
    }
}
