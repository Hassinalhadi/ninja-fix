package N;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends i implements Collection, Yd.b {
    public b alpha;
    public Object purple;
    public Object red;
    public final M.e silver;

    public c(b bVar) {
        this.alpha = bVar;
        this.purple = bVar.alpha;
        this.red = bVar.purple;
        this.silver = bVar.red.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        M.e eVar = this.silver;
        if (eVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.purple = obj;
            this.red = obj;
            eVar.put(obj, new a());
            return true;
        }
        V v4 = eVar.get(this.red);
        Intrinsics.checkNotNull(v4);
        eVar.put(this.red, new a(((a) v4).alpha, obj));
        eVar.put(obj, new a(this.red));
        this.red = obj;
        return true;
    }

    @Override // kotlin.collections.i
    public final int alpha() {
        return this.silver.size();
    }

    public final b bravo() {
        M.c build = this.silver.build();
        b bVar = this.alpha;
        if (build != bVar.red) {
            bVar = new b(this.purple, this.red, build);
        }
        this.alpha = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.silver.clear();
        O.b bVar = O.b.alpha;
        this.purple = bVar;
        this.red = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.silver.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        M.e eVar = this.silver;
        a aVar = (a) eVar.remove(obj);
        boolean z2 = false;
        if (aVar == null) {
            return false;
        }
        O.b bVar = O.b.alpha;
        Object obj2 = aVar.alpha;
        if (obj2 != bVar) {
            z2 = true;
        }
        Object obj3 = aVar.bravo;
        if (z2) {
            V v4 = eVar.get(obj2);
            Intrinsics.checkNotNull(v4);
            eVar.put(obj2, new a(((a) v4).alpha, obj3));
        } else {
            this.purple = obj3;
        }
        if (obj3 != bVar) {
            V v6 = eVar.get(obj3);
            Intrinsics.checkNotNull(v6);
            eVar.put(obj3, new a(obj2, ((a) v6).bravo));
        } else {
            this.red = obj2;
        }
        return true;
    }
}
