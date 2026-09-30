package L;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.B6;

/* loaded from: classes3.dex */
public final class j extends c {
    public static final j purple = new j(new Object[0]);
    public final Object[] alpha;

    public j(Object[] objArr) {
        this.alpha = objArr;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.alpha.length;
    }

    @Override // L.c
    public final c bravo(int i4, Object obj) {
        Object[] objArr = this.alpha;
        B6.charlie(i4, objArr.length);
        if (i4 == objArr.length) {
            return delta(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ArraysKt.beige(0, i4, 6, objArr, objArr2);
            ArraysKt.yankee(i4 + 1, i4, objArr.length, objArr, objArr2);
            objArr2[i4] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.delta(copyOf, "copyOf(...)");
        ArraysKt.yankee(i4 + 1, i4, objArr.length - 1, objArr, copyOf);
        copyOf[i4] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // L.c
    public final c delta(Object obj) {
        Object[] objArr = this.alpha;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            Intrinsics.delta(copyOf, "copyOf(...)");
            copyOf[objArr.length] = obj;
            return new j(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new f(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        B6.bravo(i4, alpha());
        return this.alpha[i4];
    }

    @Override // L.c
    public final c hotel(Collection collection) {
        Object[] objArr = this.alpha;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            Intrinsics.delta(copyOf, "copyOf(...)");
            int length = objArr.length;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new j(copyOf);
        }
        g india = india();
        india.addAll(collection);
        return india.delta();
    }

    @Override // kotlin.collections.e, java.util.List
    public final int indexOf(Object obj) {
        return ArraysKt.jade(this.alpha, obj);
    }

    @Override // L.c
    public final g india() {
        return new g(this, null, this.alpha, 0);
    }

    @Override // L.c
    public final c kilo(b bVar) {
        Object[] objArr = this.alpha;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z2 = false;
        for (int i4 = 0; i4 < length2; i4++) {
            Object obj = objArr[i4];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.delta(objArr2, "copyOf(...)");
                    z2 = true;
                    length = i4;
                }
            } else if (z2) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return purple;
        }
        return new j(ArraysKt.blue(0, objArr2, length));
    }

    @Override // kotlin.collections.e, java.util.List
    public final int lastIndexOf(Object obj) {
        return ArraysKt.navy(this.alpha, obj);
    }

    @Override // L.c
    public final c lima(int i4) {
        Object[] objArr = this.alpha;
        B6.bravo(i4, objArr.length);
        if (objArr.length == 1) {
            return purple;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Intrinsics.delta(copyOf, "copyOf(...)");
        ArraysKt.yankee(i4, i4 + 1, objArr.length, objArr, copyOf);
        return new j(copyOf);
    }

    @Override // kotlin.collections.e, java.util.List
    public final ListIterator listIterator(int i4) {
        Object[] objArr = this.alpha;
        B6.charlie(i4, objArr.length);
        return new d(i4, objArr, objArr.length);
    }

    @Override // L.c
    public final c mike(int i4, Object obj) {
        Object[] objArr = this.alpha;
        B6.bravo(i4, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.delta(copyOf, "copyOf(...)");
        copyOf[i4] = obj;
        return new j(copyOf);
    }
}
