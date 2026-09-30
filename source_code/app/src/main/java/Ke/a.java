package Ke;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {
    public final int[] alpha;
    public final int bravo;
    public final int charlie;
    public final int delta;
    public final List echo;

    public a(int... numbers) {
        int i4;
        int i5;
        List emptyList;
        Intrinsics.echo(numbers, "numbers");
        this.alpha = numbers;
        Integer indigo = ArraysKt.indigo(0, numbers);
        if (indigo != null) {
            i4 = indigo.intValue();
        } else {
            i4 = -1;
        }
        this.bravo = i4;
        Integer indigo2 = ArraysKt.indigo(1, numbers);
        if (indigo2 != null) {
            i5 = indigo2.intValue();
        } else {
            i5 = -1;
        }
        this.charlie = i5;
        Integer indigo3 = ArraysKt.indigo(2, numbers);
        this.delta = indigo3 != null ? indigo3.intValue() : -1;
        if (numbers.length > 3) {
            if (numbers.length <= 1024) {
                emptyList = CollectionsKt.z(new kotlin.collections.d(new m(numbers), 3, numbers.length));
            } else {
                throw new IllegalArgumentException(Q0.c.quebec(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        this.echo = emptyList;
    }

    public final boolean alpha(int i4, int i5, int i10) {
        int i11 = this.bravo;
        if (i11 > i4) {
            return true;
        }
        if (i11 < i4) {
            return false;
        }
        int i12 = this.charlie;
        if (i12 > i5) {
            return true;
        }
        if (i12 >= i5 && this.delta >= i10) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.bravo == aVar.bravo && this.charlie == aVar.charlie && this.delta == aVar.delta && Intrinsics.areEqual(this.echo, aVar.echo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.bravo;
        int i5 = (i4 * 31) + this.charlie + i4;
        int i10 = (i5 * 31) + this.delta + i5;
        return this.echo.hashCode() + (i10 * 31) + i10;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i4 : this.alpha) {
            if (i4 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i4));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return CollectionsKt.maroon(arrayList, ".", null, null, null, 62);
    }
}
