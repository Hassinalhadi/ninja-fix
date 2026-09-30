package Ld;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends kotlin.collections.i {
    public final /* synthetic */ int alpha;
    public final g purple;

    public /* synthetic */ h(g gVar, int i4) {
        this.alpha = i4;
        this.purple = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                Intrinsics.echo(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                Intrinsics.echo(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.collections.i
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                return this.purple.f1833b;
            default:
                return this.purple.f1833b;
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
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                Intrinsics.echo(element, "element");
                return this.purple.foxtrot(element);
            default:
                return this.purple.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                return this.purple.echo(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.alpha) {
            case 0:
                return this.purple.isEmpty();
            default:
                return this.purple.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                g gVar = this.purple;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.purple;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                Intrinsics.echo(element, "element");
                g gVar = this.purple;
                gVar.getClass();
                gVar.charlie();
                int hotel = gVar.hotel(element.getKey());
                if (hotel < 0) {
                    return false;
                }
                Object[] objArr = gVar.purple;
                Intrinsics.checkNotNull(objArr);
                if (!Intrinsics.areEqual(objArr[hotel], element.getValue())) {
                    return false;
                }
                gVar.lima(hotel);
                return true;
            default:
                g gVar2 = this.purple;
                gVar2.charlie();
                int hotel2 = gVar2.hotel(obj);
                if (hotel2 < 0) {
                    return false;
                }
                gVar2.lima(hotel2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                this.purple.charlie();
                return super.removeAll(elements);
            default:
                Intrinsics.echo(elements, "elements");
                this.purple.charlie();
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                this.purple.charlie();
                return super.retainAll(elements);
            default:
                Intrinsics.echo(elements, "elements");
                this.purple.charlie();
                return super.retainAll(elements);
        }
    }
}
