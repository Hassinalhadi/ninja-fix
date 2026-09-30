package tf;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3124f extends L.a {
    public final C3122d silver;
    public int teal;
    public C3126h white;
    public int yellow;

    public C3124f(C3122d c3122d, int i4) {
        super(i4, c3122d.white, 1);
        this.silver = c3122d;
        this.teal = c3122d.india();
        this.yellow = -1;
        charlie();
    }

    @Override // L.a, java.util.ListIterator
    public final void add(Object obj) {
        alpha();
        this.silver.add(this.purple, obj);
        this.purple++;
        bravo();
    }

    public final void alpha() {
        if (this.teal == this.silver.india()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void bravo() {
        C3122d c3122d = this.silver;
        this.red = c3122d.alpha();
        this.teal = c3122d.india();
        this.yellow = -1;
        charlie();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void charlie() {
        C3122d c3122d = this.silver;
        Object[] objArr = c3122d.silver;
        if (objArr == null) {
            this.white = null;
            return;
        }
        int i4 = (c3122d.white - 1) & (-32);
        int i5 = this.purple;
        if (i5 > i4) {
            i5 = i4;
        }
        int i10 = (c3122d.alpha / 5) + 1;
        C3126h c3126h = this.white;
        if (c3126h == null) {
            this.white = new C3126h(objArr, i5, i4, i10);
            return;
        }
        Intrinsics.checkNotNull(c3126h);
        c3126h.purple = i5;
        c3126h.red = i4;
        c3126h.silver = i10;
        if (c3126h.teal.length < i10) {
            c3126h.teal = new Object[i10];
        }
        ?? r62 = 0;
        c3126h.teal[0] = objArr;
        if (i5 == i4) {
            r62 = 1;
        }
        c3126h.white = r62;
        c3126h.bravo(i5 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        alpha();
        if (hasNext()) {
            int i4 = this.purple;
            this.yellow = i4;
            C3126h c3126h = this.white;
            C3122d c3122d = this.silver;
            if (c3126h == null) {
                Object[] objArr = c3122d.teal;
                this.purple = i4 + 1;
                return objArr[i4];
            }
            if (c3126h.hasNext()) {
                this.purple++;
                return c3126h.next();
            }
            Object[] objArr2 = c3122d.teal;
            int i5 = this.purple;
            this.purple = i5 + 1;
            return objArr2[i5 - c3126h.red];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        alpha();
        if (hasPrevious()) {
            int i4 = this.purple;
            this.yellow = i4 - 1;
            C3126h c3126h = this.white;
            C3122d c3122d = this.silver;
            if (c3126h == null) {
                Object[] objArr = c3122d.teal;
                int i5 = i4 - 1;
                this.purple = i5;
                return objArr[i5];
            }
            int i10 = c3126h.red;
            if (i4 > i10) {
                Object[] objArr2 = c3122d.teal;
                int i11 = i4 - 1;
                this.purple = i11;
                return objArr2[i11 - i10];
            }
            this.purple = i4 - 1;
            return c3126h.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // L.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        alpha();
        int i4 = this.yellow;
        if (i4 != -1) {
            this.silver.bravo(i4);
            int i5 = this.yellow;
            if (i5 < this.purple) {
                this.purple = i5;
            }
            bravo();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // L.a, java.util.ListIterator
    public final void set(Object obj) {
        alpha();
        int i4 = this.yellow;
        if (i4 != -1) {
            C3122d c3122d = this.silver;
            c3122d.set(i4, obj);
            this.teal = c3122d.india();
            charlie();
            return;
        }
        throw new IllegalStateException();
    }
}
