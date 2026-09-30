package bv;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class e extends aw implements Map {
    public Oe.ah silver;
    public b teal;
    public d white;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Oe.ah ahVar = this.silver;
        if (ahVar == null) {
            Oe.ah ahVar2 = new Oe.ah(this, 2);
            this.silver = ahVar2;
            return ahVar2;
        }
        return ahVar;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.teal;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.teal = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final boolean kilo(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean lima(Collection collection) {
        int i4 = this.red;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i4 != this.red) {
            return true;
        }
        return false;
    }

    public final boolean mike(Collection collection) {
        int i4 = this.red;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (!collection.contains(foxtrot(i5))) {
                hotel(i5);
            }
        }
        if (i4 != this.red) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        bravo(map.size() + this.red);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.white;
        if (dVar == null) {
            d dVar2 = new d(this);
            this.white = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public e(e eVar) {
        super(0);
        golf(eVar);
    }
}
