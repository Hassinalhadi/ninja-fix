package M;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class e extends kotlin.collections.h implements K.c {
    public c alpha;
    public O.b purple = new Object();
    public m red;
    public Object silver;
    public int teal;
    public int white;

    /* JADX WARN: Type inference failed for: r0v0, types: [O.b, java.lang.Object] */
    public e(c cVar) {
        this.alpha = cVar;
        this.red = cVar.alpha;
        cVar.getClass();
        this.white = cVar.purple;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O.b, java.lang.Object] */
    @Override // K.c
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public c build() {
        m mVar = this.red;
        c cVar = this.alpha;
        if (mVar != cVar.alpha) {
            this.purple = new Object();
            cVar = new c(this.red, size());
        }
        this.alpha = cVar;
        return cVar;
    }

    public final void bravo(int i4) {
        this.white = i4;
        this.teal++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.red = m.echo;
        bravo(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i4;
        m mVar = this.red;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return mVar.delta(i4, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i4;
        m mVar = this.red;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return mVar.golf(i4, 0, obj);
    }

    @Override // kotlin.collections.h
    public final Set getEntries() {
        return new g(0, this);
    }

    @Override // kotlin.collections.h
    public final Set getKeys() {
        return new g(1, this);
    }

    @Override // kotlin.collections.h
    public final int getSize() {
        return this.white;
    }

    @Override // kotlin.collections.h
    public final Collection getValues() {
        return new Ld.i(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i4;
        this.silver = null;
        m mVar = this.red;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        this.red = mVar.lima(i4, obj, obj2, 0, this);
        return this.silver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [O.a, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVar;
        e eVar;
        c cVar2 = null;
        if (map instanceof c) {
            cVar = (c) map;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            if (map instanceof e) {
                eVar = (e) map;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                cVar2 = eVar.build();
            }
        } else {
            cVar2 = cVar;
        }
        if (cVar2 != null) {
            ?? obj = new Object();
            obj.alpha = 0;
            int size = size();
            m mVar = this.red;
            m mVar2 = cVar2.alpha;
            Intrinsics.charlie(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.red = mVar.mike(mVar2, 0, obj, this);
            int i4 = (cVar2.purple + size) - obj.alpha;
            if (size != i4) {
                bravo(i4);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.silver = null;
        m november = this.red.november(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (november == null) {
            november = m.echo;
        }
        this.red = november;
        return this.silver;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        m oscar = this.red.oscar(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (oscar == null) {
            oscar = m.echo;
        }
        this.red = oscar;
        return size != size();
    }
}
