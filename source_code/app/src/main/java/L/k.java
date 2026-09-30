package L;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes3.dex */
public final class k extends a {
    public int silver;
    public Object[] teal;
    public boolean white;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i4, int i5, int i10) {
        super(i4, i5, 0);
        ?? r5;
        this.silver = i10;
        Object[] objArr2 = new Object[i10];
        this.teal = objArr2;
        if (i4 == i5) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.white = r5;
        objArr2[0] = objArr;
        bravo(i4 - r5, 1);
    }

    public final Object alpha() {
        int i4 = this.purple & 31;
        Object obj = this.teal[this.silver - 1];
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i4];
    }

    public final void bravo(int i4, int i5) {
        int i10 = (this.silver - i5) * 5;
        while (i5 < this.silver) {
            Object[] objArr = this.teal;
            Object obj = objArr[i5 - 1];
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i5] = ((Object[]) obj)[AbstractC2653f6.bravo(i4, i10)];
            i10 -= 5;
            i5++;
        }
    }

    public final void charlie(int i4) {
        int i5 = 0;
        while (AbstractC2653f6.bravo(this.purple, i5) == i4) {
            i5 += 5;
        }
        if (i5 > 0) {
            bravo(this.purple, ((this.silver - 1) - (i5 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object alpha = alpha();
            int i4 = this.purple + 1;
            this.purple = i4;
            if (i4 == this.red) {
                this.white = true;
                return alpha;
            }
            charlie(0);
            return alpha;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.purple--;
            if (this.white) {
                this.white = false;
                return alpha();
            }
            charlie(31);
            return alpha();
        }
        throw new NoSuchElementException();
    }
}
