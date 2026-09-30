package r6;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j extends AbstractC2498f {
    public final transient l red;
    public final transient k silver;

    public j(l lVar, k kVar) {
        this.red = lVar;
        this.silver = kVar;
    }

    @Override // r6.AbstractC2493a
    public final int alpha(Object[] objArr) {
        return this.silver.alpha(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.red.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.silver.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.red.white;
    }
}
