package L;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends a {
    public final g silver;
    public int teal;
    public k white;
    public int yellow;

    public i(g gVar, int i4) {
        super(i4, gVar.f1699a, 0);
        this.silver = gVar;
        this.teal = gVar.india();
        this.yellow = -1;
        bravo();
    }

    @Override // L.a, java.util.ListIterator
    public final void add(Object obj) {
        alpha();
        int i4 = this.purple;
        g gVar = this.silver;
        gVar.add(i4, obj);
        this.purple++;
        this.red = gVar.alpha();
        this.teal = gVar.india();
        this.yellow = -1;
        bravo();
    }

    public final void alpha() {
        if (this.teal == this.silver.india()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void bravo() {
        g gVar = this.silver;
        Object[] objArr = gVar.white;
        if (objArr == null) {
            this.white = null;
            return;
        }
        int i4 = (gVar.f1699a - 1) & (-32);
        int i5 = this.purple;
        if (i5 > i4) {
            i5 = i4;
        }
        int i10 = (gVar.silver / 5) + 1;
        k kVar = this.white;
        if (kVar == null) {
            this.white = new k(objArr, i5, i4, i10);
            return;
        }
        Intrinsics.checkNotNull(kVar);
        kVar.purple = i5;
        kVar.red = i4;
        kVar.silver = i10;
        if (kVar.teal.length < i10) {
            kVar.teal = new Object[i10];
        }
        ?? r62 = 0;
        kVar.teal[0] = objArr;
        if (i5 == i4) {
            r62 = 1;
        }
        kVar.white = r62;
        kVar.bravo(i5 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        alpha();
        if (hasNext()) {
            int i4 = this.purple;
            this.yellow = i4;
            k kVar = this.white;
            g gVar = this.silver;
            if (kVar == null) {
                Object[] objArr = gVar.yellow;
                this.purple = i4 + 1;
                return objArr[i4];
            }
            if (kVar.hasNext()) {
                this.purple++;
                return kVar.next();
            }
            Object[] objArr2 = gVar.yellow;
            int i5 = this.purple;
            this.purple = i5 + 1;
            return objArr2[i5 - kVar.red];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        alpha();
        if (hasPrevious()) {
            int i4 = this.purple;
            this.yellow = i4 - 1;
            k kVar = this.white;
            g gVar = this.silver;
            if (kVar == null) {
                Object[] objArr = gVar.yellow;
                int i5 = i4 - 1;
                this.purple = i5;
                return objArr[i5];
            }
            int i10 = kVar.red;
            if (i4 > i10) {
                Object[] objArr2 = gVar.yellow;
                int i11 = i4 - 1;
                this.purple = i11;
                return objArr2[i11 - i10];
            }
            this.purple = i4 - 1;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // L.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        alpha();
        int i4 = this.yellow;
        if (i4 != -1) {
            g gVar = this.silver;
            gVar.bravo(i4);
            int i5 = this.yellow;
            if (i5 < this.purple) {
                this.purple = i5;
            }
            this.red = gVar.alpha();
            this.teal = gVar.india();
            this.yellow = -1;
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
            g gVar = this.silver;
            gVar.set(i4, obj);
            this.teal = gVar.india();
            bravo();
            return;
        }
        throw new IllegalStateException();
    }
}
