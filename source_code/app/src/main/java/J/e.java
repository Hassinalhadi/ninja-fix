package J;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements RandomAccess {
    public Object[] alpha;
    public b purple;
    public int red = 0;

    public e(Object[] objArr) {
        this.alpha = objArr;
    }

    public final void alpha(int i4, Object obj) {
        int i5 = this.red + 1;
        if (this.alpha.length < i5) {
            oscar(i5);
        }
        Object[] objArr = this.alpha;
        int i10 = this.red;
        if (i4 != i10) {
            System.arraycopy(objArr, i4, objArr, i4 + 1, i10 - i4);
        }
        objArr[i4] = obj;
        this.red++;
    }

    public final void bravo(Object obj) {
        int i4 = this.red + 1;
        if (this.alpha.length < i4) {
            oscar(i4);
        }
        Object[] objArr = this.alpha;
        int i5 = this.red;
        objArr[i5] = obj;
        this.red = i5 + 1;
    }

    public final void charlie(int i4, e eVar) {
        int i5 = eVar.red;
        if (i5 == 0) {
            return;
        }
        int i10 = this.red + i5;
        if (this.alpha.length < i10) {
            oscar(i10);
        }
        Object[] objArr = this.alpha;
        int i11 = this.red;
        if (i4 != i11) {
            System.arraycopy(objArr, i4, objArr, i4 + i5, i11 - i4);
        }
        System.arraycopy(eVar.alpha, 0, objArr, i4, i5);
        this.red += i5;
    }

    public final void delta(int i4, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i5 = this.red + size;
        if (this.alpha.length < i5) {
            oscar(i5);
        }
        Object[] objArr = this.alpha;
        int i10 = this.red;
        if (i4 != i10) {
            System.arraycopy(objArr, i4, objArr, i4 + size, i10 - i4);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr[i4 + i11] = list.get(i11);
        }
        this.red += size;
    }

    public final boolean echo(int i4, Collection collection) {
        int i5 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i10 = this.red + size;
        if (this.alpha.length < i10) {
            oscar(i10);
        }
        Object[] objArr = this.alpha;
        int i11 = this.red;
        if (i4 != i11) {
            System.arraycopy(objArr, i4, objArr, i4 + size, i11 - i4);
        }
        for (Object obj : collection) {
            int i12 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            objArr[i5 + i4] = obj;
            i5 = i12;
        }
        this.red += size;
        return true;
    }

    public final List hotel() {
        b bVar = this.purple;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.purple = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final void india() {
        Object[] objArr = this.alpha;
        int i4 = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.red = 0;
    }

    public final boolean juliet(Object obj) {
        int i4 = this.red - 1;
        if (i4 >= 0) {
            for (int i5 = 0; !Intrinsics.areEqual(this.alpha[i5], obj); i5++) {
                if (i5 != i4) {
                }
            }
            return true;
        }
        return false;
    }

    public final int kilo(Object obj) {
        Object[] objArr = this.alpha;
        int i4 = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            if (Intrinsics.areEqual(obj, objArr[i5])) {
                return i5;
            }
        }
        return -1;
    }

    public final boolean lima(Object obj) {
        int kilo = kilo(obj);
        if (kilo >= 0) {
            mike(kilo);
            return true;
        }
        return false;
    }

    public final Object mike(int i4) {
        Object[] objArr = this.alpha;
        Object obj = objArr[i4];
        int i5 = this.red;
        if (i4 != i5 - 1) {
            int i10 = i4 + 1;
            System.arraycopy(objArr, i10, objArr, i4, i5 - i10);
        }
        int i11 = this.red - 1;
        this.red = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void november(int i4, int i5) {
        if (i5 > i4) {
            int i10 = this.red;
            if (i5 < i10) {
                Object[] objArr = this.alpha;
                System.arraycopy(objArr, i5, objArr, i4, i10 - i5);
            }
            int i11 = this.red;
            int i12 = i11 - (i5 - i4);
            int i13 = i11 - 1;
            if (i12 <= i13) {
                int i14 = i12;
                while (true) {
                    this.alpha[i14] = null;
                    if (i14 == i13) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.red = i12;
        }
    }

    public final void oscar(int i4) {
        Object[] objArr = this.alpha;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i4, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.alpha = objArr2;
    }
}
