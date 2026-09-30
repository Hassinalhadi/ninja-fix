package M;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends kotlin.collections.i {
    public final /* synthetic */ int alpha;
    public final e purple;

    public /* synthetic */ g(int i4, e eVar) {
        this.alpha = i4;
        this.purple = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.collections.i
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                return this.purple.size();
            default:
                return this.purple.size();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.alpha) {
            case 0:
                this.purple.clear();
                return;
            default:
                this.purple.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 != null) {
                    entry = entry2;
                } else {
                    entry = null;
                }
                if (entry == null) {
                    return false;
                }
                Object key = entry2.getKey();
                e eVar = this.purple;
                Object obj2 = eVar.get(key);
                if (obj2 != null) {
                    return Intrinsics.areEqual(obj2, entry2.getValue());
                }
                if (entry2.getValue() != null || !eVar.containsKey(entry2.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.purple.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new h(this.purple);
            default:
                n[] nVarArr = new n[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    nVarArr[i4] = new o(1);
                }
                return new f(this.purple, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 != null) {
                    entry = entry2;
                } else {
                    entry = null;
                }
                if (entry == null) {
                    return false;
                }
                return this.purple.remove(entry2.getKey(), entry2.getValue());
            default:
                e eVar = this.purple;
                if (eVar.containsKey(obj)) {
                    eVar.remove(obj);
                    return true;
                }
                return false;
        }
    }
}
