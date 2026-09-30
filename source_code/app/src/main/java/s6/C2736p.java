package s6;

import java.util.List;
import java.util.ListIterator;

/* renamed from: s6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2736p extends C2700l implements ListIterator {
    public final /* synthetic */ C2745q teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2736p(C2745q c2745q) {
        super(c2745q);
        this.teal = c2745q;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C2745q c2745q = this.teal;
        boolean isEmpty = c2745q.isEmpty();
        alpha();
        ((ListIterator) this.purple).add(obj);
        c2745q.white.teal++;
        if (isEmpty) {
            c2745q.alpha();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        alpha();
        return ((ListIterator) this.purple).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        alpha();
        return ((ListIterator) this.purple).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        alpha();
        return ((ListIterator) this.purple).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        alpha();
        return ((ListIterator) this.purple).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        alpha();
        ((ListIterator) this.purple).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2736p(C2745q c2745q, int i4) {
        super(c2745q, ((List) c2745q.purple).listIterator(i4));
        this.teal = c2745q;
    }
}
