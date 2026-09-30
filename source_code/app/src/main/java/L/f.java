package L;

import androidx.compose.runtime.J;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;
import s6.B6;

/* loaded from: classes3.dex */
public final class f extends c {
    public final Object[] alpha;
    public final Object[] purple;
    public final int red;
    public final int silver;

    public f(Object[] objArr, Object[] objArr2, int i4, int i5) {
        boolean z2;
        this.alpha = objArr;
        this.purple = objArr2;
        this.red = i4;
        this.silver = i5;
        if (alpha() > 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J.alpha("Trie-based persistent vector should have at least 33 elements, got " + alpha());
        }
        int length = objArr2.length;
    }

    public static Object[] november(Object[] objArr, int i4, int i5, Object obj, e eVar) {
        Object[] copyOf;
        int bravo = AbstractC2653f6.bravo(i5, i4);
        if (i4 == 0) {
            if (bravo == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.delta(copyOf, "copyOf(...)");
            }
            ArraysKt.yankee(bravo + 1, bravo, 31, objArr, copyOf);
            eVar.alpha = objArr[31];
            copyOf[bravo] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.delta(copyOf2, "copyOf(...)");
        int i10 = i4 - 5;
        Object obj2 = objArr[bravo];
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[bravo] = november((Object[]) obj2, i10, i5, obj, eVar);
        while (true) {
            bravo++;
            if (bravo >= 32 || copyOf2[bravo] == null) {
                break;
            }
            Object obj3 = objArr[bravo];
            Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[bravo] = november((Object[]) obj3, i10, 0, eVar.alpha, eVar);
        }
        return copyOf2;
    }

    public static Object[] quebec(Object[] objArr, int i4, int i5, e eVar) {
        Object[] quebec;
        int bravo = AbstractC2653f6.bravo(i5, i4);
        if (i4 == 5) {
            eVar.alpha = objArr[bravo];
            quebec = null;
        } else {
            Object obj = objArr[bravo];
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            quebec = quebec((Object[]) obj, i4 - 5, i5, eVar);
        }
        if (quebec == null && bravo == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.delta(copyOf, "copyOf(...)");
        copyOf[bravo] = quebec;
        return copyOf;
    }

    public static Object[] whiskey(int i4, int i5, Object obj, Object[] objArr) {
        int bravo = AbstractC2653f6.bravo(i5, i4);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.delta(copyOf, "copyOf(...)");
        if (i4 == 0) {
            copyOf[bravo] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[bravo];
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[bravo] = whiskey(i4 - 5, i5, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.red;
    }

    @Override // L.c
    public final c bravo(int i4, Object obj) {
        int i5 = this.red;
        B6.charlie(i4, i5);
        if (i4 == i5) {
            return delta(obj);
        }
        int victor = victor();
        Object[] objArr = this.alpha;
        if (i4 >= victor) {
            return oscar(i4 - victor, obj, objArr);
        }
        e eVar = new e(null);
        return oscar(0, eVar.alpha, november(objArr, this.silver, i4, obj, eVar));
    }

    @Override // L.c
    public final c delta(Object obj) {
        int victor = victor();
        int i4 = this.red;
        int i5 = i4 - victor;
        Object[] objArr = this.alpha;
        Object[] objArr2 = this.purple;
        if (i5 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.delta(copyOf, "copyOf(...)");
            copyOf[i5] = obj;
            return new f(objArr, copyOf, i4 + 1, this.silver);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return romeo(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Object[] objArr;
        B6.bravo(i4, alpha());
        if (victor() <= i4) {
            objArr = this.purple;
        } else {
            objArr = this.alpha;
            for (int i5 = this.silver; i5 > 0; i5 -= 5) {
                Object obj = objArr[AbstractC2653f6.bravo(i4, i5)];
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i4 & 31];
    }

    @Override // L.c
    public final g india() {
        return new g(this, this.alpha, this.purple, this.silver);
    }

    @Override // L.c
    public final c kilo(b bVar) {
        g gVar = new g(this, this.alpha, this.purple, this.silver);
        gVar.bronze(bVar);
        return gVar.delta();
    }

    @Override // L.c
    public final c lima(int i4) {
        B6.bravo(i4, this.red);
        int victor = victor();
        Object[] objArr = this.alpha;
        int i5 = this.silver;
        if (i4 >= victor) {
            return uniform(objArr, victor, i5, i4 - victor);
        }
        return uniform(tango(objArr, i5, i4, new e(this.purple[0])), victor, i5, 0);
    }

    @Override // kotlin.collections.e, java.util.List
    public final ListIterator listIterator(int i4) {
        B6.charlie(i4, this.red);
        return new h(i4, this.red, (this.silver / 5) + 1, this.alpha, this.purple);
    }

    @Override // L.c
    public final c mike(int i4, Object obj) {
        int i5 = this.red;
        B6.bravo(i4, i5);
        int victor = victor();
        Object[] objArr = this.alpha;
        Object[] objArr2 = this.purple;
        int i10 = this.silver;
        if (victor <= i4) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.delta(copyOf, "copyOf(...)");
            copyOf[i4 & 31] = obj;
            return new f(objArr, copyOf, i5, i10);
        }
        return new f(whiskey(i10, i4, obj, objArr), objArr2, i5, i10);
    }

    public final f oscar(int i4, Object obj, Object[] objArr) {
        int victor = victor();
        int i5 = this.red;
        int i10 = i5 - victor;
        Object[] objArr2 = this.purple;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.delta(copyOf, "copyOf(...)");
        if (i10 < 32) {
            ArraysKt.yankee(i4 + 1, i4, i10, objArr2, copyOf);
            copyOf[i4] = obj;
            return new f(objArr, copyOf, i5 + 1, this.silver);
        }
        Object obj2 = objArr2[31];
        ArraysKt.yankee(i4 + 1, i4, i10 - 1, objArr2, copyOf);
        copyOf[i4] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return romeo(objArr, copyOf, objArr3);
    }

    public final f romeo(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i4 = this.red;
        int i5 = i4 >> 5;
        int i10 = this.silver;
        if (i5 > (1 << i10)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i11 = i10 + 5;
            return new f(sierra(i11, objArr4, objArr2), objArr3, i4 + 1, i11);
        }
        return new f(sierra(i10, objArr, objArr2), objArr3, i4 + 1, i10);
    }

    public final Object[] sierra(int i4, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int bravo = AbstractC2653f6.bravo(alpha() - 1, i4);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            Intrinsics.delta(objArr3, "copyOf(...)");
        } else {
            objArr3 = new Object[32];
        }
        if (i4 == 5) {
            objArr3[bravo] = objArr2;
            return objArr3;
        }
        objArr3[bravo] = sierra(i4 - 5, (Object[]) objArr3[bravo], objArr2);
        return objArr3;
    }

    public final Object[] tango(Object[] objArr, int i4, int i5, e eVar) {
        Object[] copyOf;
        int bravo = AbstractC2653f6.bravo(i5, i4);
        int i10 = 31;
        if (i4 == 0) {
            if (bravo == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.delta(copyOf, "copyOf(...)");
            }
            ArraysKt.yankee(bravo, bravo + 1, 32, objArr, copyOf);
            copyOf[31] = eVar.alpha;
            eVar.alpha = objArr[bravo];
            return copyOf;
        }
        if (objArr[31] == null) {
            i10 = AbstractC2653f6.bravo(victor() - 1, i4);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.delta(copyOf2, "copyOf(...)");
        int i11 = i4 - 5;
        int i12 = bravo + 1;
        if (i12 <= i10) {
            while (true) {
                Object obj = copyOf2[i10];
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i10] = tango((Object[]) obj, i11, 0, eVar);
                if (i10 == i12) {
                    break;
                }
                i10--;
            }
        }
        Object obj2 = copyOf2[bravo];
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[bravo] = tango((Object[]) obj2, i11, i5, eVar);
        return copyOf2;
    }

    public final c uniform(Object[] objArr, int i4, int i5, int i10) {
        int i11 = this.red - i4;
        if (i11 == 1) {
            if (i5 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    Intrinsics.delta(objArr, "copyOf(...)");
                }
                return new j(objArr);
            }
            e eVar = new e(null);
            Object[] quebec = quebec(objArr, i5, i4 - 1, eVar);
            Intrinsics.checkNotNull(quebec);
            Object obj = eVar.alpha;
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj;
            if (quebec[1] == null) {
                Object obj2 = quebec[0];
                Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return new f((Object[]) obj2, objArr2, i4, i5 - 5);
            }
            return new f(quebec, objArr2, i4, i5);
        }
        Object[] objArr3 = this.purple;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        Intrinsics.delta(copyOf, "copyOf(...)");
        int i12 = i11 - 1;
        if (i10 < i12) {
            ArraysKt.yankee(i10, i10 + 1, i11, objArr3, copyOf);
        }
        copyOf[i12] = null;
        return new f(objArr, copyOf, (i4 + i11) - 1, i5);
    }

    public final int victor() {
        return (this.red - 1) & (-32);
    }
}
