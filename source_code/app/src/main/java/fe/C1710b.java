package fe;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fe.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1710b implements Iterator, Yd.a {
    public final int alpha;
    public final int purple;
    public boolean red;
    public int silver;

    public C1710b(char c3, char c4, int i4) {
        this.alpha = i4;
        this.purple = c4;
        boolean z2 = false;
        if (i4 <= 0 ? Intrinsics.golf(c3, c4) >= 0 : Intrinsics.golf(c3, c4) <= 0) {
            z2 = true;
        }
        this.red = z2;
        this.silver = z2 ? c3 : c4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.red;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.silver;
        if (i4 == this.purple) {
            if (this.red) {
                this.red = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.silver = this.alpha + i4;
        }
        return Character.valueOf((char) i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
