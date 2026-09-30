package N;

import M.m;
import java.util.Iterator;
import kotlin.collections.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends j implements K.e {
    public static final b silver;
    public final Object alpha;
    public final Object purple;
    public final M.c red;

    static {
        O.b bVar = O.b.alpha;
        silver = new b(bVar, bVar, M.c.red);
    }

    public b(Object obj, Object obj2, M.c cVar) {
        this.alpha = obj;
        this.purple = obj2;
        this.red = cVar;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        M.c cVar = this.red;
        cVar.getClass();
        return cVar.purple;
    }

    public final b bravo(Object obj) {
        M.c cVar = this.red;
        if (cVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, cVar.bravo(obj, new a()));
        }
        Object obj2 = this.purple;
        Object obj3 = cVar.get(obj2);
        Intrinsics.checkNotNull(obj3);
        return new b(this.alpha, obj, cVar.bravo(obj2, new a(((a) obj3).alpha, obj)).bravo(obj, new a(obj2)));
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.red.containsKey(obj);
    }

    public final b delta(Object obj) {
        int i4;
        Object obj2;
        M.c cVar = this.red;
        a aVar = (a) cVar.get(obj);
        if (aVar == null) {
            return this;
        }
        boolean z2 = false;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        m mVar = cVar.alpha;
        m victor = mVar.victor(i4, 0, obj);
        if (mVar != victor) {
            if (victor == null) {
                cVar = M.c.red;
            } else {
                cVar = new M.c(victor, cVar.purple - 1);
            }
        }
        O.b bVar = O.b.alpha;
        Object obj3 = aVar.alpha;
        if (obj3 != bVar) {
            z2 = true;
        }
        Object obj4 = aVar.bravo;
        if (z2) {
            Object obj5 = cVar.get(obj3);
            Intrinsics.checkNotNull(obj5);
            cVar = cVar.bravo(obj3, new a(((a) obj5).alpha, obj4));
        }
        if (obj4 != bVar) {
            Object obj6 = cVar.get(obj4);
            Intrinsics.checkNotNull(obj6);
            cVar = cVar.bravo(obj4, new a(obj3, ((a) obj6).bravo));
        }
        if (obj3 != bVar) {
            obj2 = this.alpha;
        } else {
            obj2 = obj4;
        }
        if (obj4 != bVar) {
            obj3 = this.purple;
        }
        return new b(obj2, obj3, cVar);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.red, this.alpha);
    }
}
