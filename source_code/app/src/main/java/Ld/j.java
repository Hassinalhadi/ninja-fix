package Ld;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends kotlin.collections.i implements Serializable {
    public static final j purple;
    public final g alpha;

    static {
        g gVar = g.f1831g;
        purple = new j(g.f1831g);
    }

    public j(g backing) {
        Intrinsics.echo(backing, "backing");
        this.alpha = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.alpha.alpha(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        this.alpha.charlie();
        return super.addAll(elements);
    }

    @Override // kotlin.collections.i
    public final int alpha() {
        return this.alpha.f1833b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.alpha.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.alpha;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.alpha;
        gVar.charlie();
        int hotel = gVar.hotel(obj);
        if (hotel < 0) {
            return false;
        }
        gVar.lima(hotel);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        this.alpha.charlie();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        this.alpha.charlie();
        return super.retainAll(elements);
    }

    public j() {
        this(new g());
    }
}
