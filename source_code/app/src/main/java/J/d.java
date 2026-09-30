package J;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class d implements ListIterator, Yd.a {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public int red;

    public d(int i4, int i5, List list) {
        this.alpha = i5;
        switch (i5) {
            case 1:
                this.purple = list;
                this.red = i4 - 1;
                return;
            default:
                this.purple = list;
                this.red = i4;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.add(this.red, obj);
                this.red++;
                return;
            default:
                int i4 = this.red + 1;
                this.red = i4;
                this.purple.add(i4, obj);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.red < this.purple.size()) {
                    return true;
                }
                return false;
            default:
                if (this.red < this.purple.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.alpha) {
            case 0:
                if (this.red > 0) {
                    return true;
                }
                return false;
            default:
                if (this.red >= 0) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                int i4 = this.red;
                this.red = i4 + 1;
                return this.purple.get(i4);
            default:
                int i5 = this.red + 1;
                this.red = i5;
                return this.purple.get(i5);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.alpha) {
            case 0:
                return this.red;
            default:
                return this.red + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.alpha) {
            case 0:
                int i4 = this.red - 1;
                this.red = i4;
                return this.purple.get(i4);
            default:
                int i5 = this.red;
                this.red = i5 - 1;
                return this.purple.get(i5);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.alpha) {
            case 0:
                return this.red - 1;
            default:
                return this.red;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                int i4 = this.red - 1;
                this.red = i4;
                this.purple.remove(i4);
                return;
            default:
                this.purple.remove(this.red);
                this.red--;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.set(this.red, obj);
                return;
            default:
                this.purple.set(this.red, obj);
                return;
        }
    }
}
