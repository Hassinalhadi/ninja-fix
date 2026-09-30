package M;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d implements Iterator, Yd.a {
    public final n[] alpha;
    public int purple;
    public boolean red = true;

    public d(m mVar, n[] nVarArr) {
        this.alpha = nVarArr;
        nVarArr[0].alpha(Integer.bitCount(mVar.alpha) * 2, mVar.delta, 0);
        this.purple = 0;
        alpha();
    }

    public final void alpha() {
        int i4 = this.purple;
        n[] nVarArr = this.alpha;
        n nVar = nVarArr[i4];
        if (nVar.red < nVar.purple) {
            return;
        }
        while (-1 < i4) {
            int bravo = bravo(i4);
            if (bravo == -1) {
                n nVar2 = nVarArr[i4];
                int i5 = nVar2.red;
                Object[] objArr = nVar2.alpha;
                if (i5 < objArr.length) {
                    int length = objArr.length;
                    nVar2.red = i5 + 1;
                    bravo = bravo(i4);
                }
            }
            if (bravo != -1) {
                this.purple = bravo;
                return;
            }
            if (i4 > 0) {
                n nVar3 = nVarArr[i4 - 1];
                int i10 = nVar3.red;
                int length2 = nVar3.alpha.length;
                nVar3.red = i10 + 1;
            }
            nVarArr[i4].alpha(0, m.echo.delta, 0);
            i4--;
        }
        this.red = false;
    }

    public final int bravo(int i4) {
        n[] nVarArr = this.alpha;
        n nVar = nVarArr[i4];
        int i5 = nVar.red;
        if (i5 < nVar.purple) {
            return i4;
        }
        Object[] objArr = nVar.alpha;
        if (i5 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i5];
            Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            m mVar = (m) obj;
            if (i4 == 6) {
                n nVar2 = nVarArr[i4 + 1];
                Object[] objArr2 = mVar.delta;
                nVar2.alpha(objArr2.length, objArr2, 0);
            } else {
                nVarArr[i4 + 1].alpha(Integer.bitCount(mVar.alpha) * 2, mVar.delta, 0);
            }
            return bravo(i4 + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.red;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.red) {
            Object next = this.alpha[this.purple].next();
            alpha();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
