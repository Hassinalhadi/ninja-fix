package bv;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class aw {
    public int[] alpha;
    public Object[] purple;
    public int red;

    public aw(int i4) {
        int[] iArr;
        Object[] objArr;
        if (i4 == 0) {
            iArr = bw.a.alpha;
        } else {
            iArr = new int[i4];
        }
        this.alpha = iArr;
        if (i4 == 0) {
            objArr = bw.a.charlie;
        } else {
            objArr = new Object[i4 << 1];
        }
        this.purple = objArr;
    }

    public final int alpha(Object obj) {
        int i4 = this.red * 2;
        Object[] objArr = this.purple;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i4; i10 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public final void bravo(int i4) {
        int i5 = this.red;
        int[] iArr = this.alpha;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.purple, i4 * 2);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            this.purple = copyOf2;
        }
        if (this.red == i5) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int charlie(int i4, Object obj) {
        int i5 = this.red;
        if (i5 == 0) {
            return -1;
        }
        int alpha = bw.a.alpha(i5, i4, this.alpha);
        if (alpha < 0 || Intrinsics.areEqual(obj, this.purple[alpha << 1])) {
            return alpha;
        }
        int i10 = alpha + 1;
        while (i10 < i5 && this.alpha[i10] == i4) {
            if (Intrinsics.areEqual(obj, this.purple[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = alpha - 1; i11 >= 0 && this.alpha[i11] == i4; i11--) {
            if (Intrinsics.areEqual(obj, this.purple[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    public void clear() {
        if (this.red > 0) {
            this.alpha = bw.a.alpha;
            this.purple = bw.a.charlie;
            this.red = 0;
        }
        if (this.red <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (delta(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (alpha(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int delta(Object obj) {
        if (obj == null) {
            return echo();
        }
        return charlie(obj.hashCode(), obj);
    }

    public final int echo() {
        int i4 = this.red;
        if (i4 == 0) {
            return -1;
        }
        int alpha = bw.a.alpha(i4, 0, this.alpha);
        if (alpha < 0 || this.purple[alpha << 1] == null) {
            return alpha;
        }
        int i5 = alpha + 1;
        while (i5 < i4 && this.alpha[i5] == 0) {
            if (this.purple[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i10 = alpha - 1; i10 >= 0 && this.alpha[i10] == 0; i10--) {
            if (this.purple[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof aw) {
                int i4 = this.red;
                if (i4 != ((aw) obj).red) {
                    return false;
                }
                aw awVar = (aw) obj;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object foxtrot = foxtrot(i5);
                    Object juliet = juliet(i5);
                    Object obj2 = awVar.get(foxtrot);
                    if (juliet == null) {
                        if (obj2 != null || !awVar.containsKey(foxtrot)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(juliet, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.red != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.red;
            for (int i11 = 0; i11 < i10; i11++) {
                Object foxtrot2 = foxtrot(i11);
                Object juliet2 = juliet(i11);
                Object obj3 = ((Map) obj).get(foxtrot2);
                if (juliet2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(foxtrot2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(juliet2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object foxtrot(int i4) {
        boolean z2 = false;
        if (i4 >= 0 && i4 < this.red) {
            z2 = true;
        }
        if (z2) {
            return this.purple[i4 << 1];
        }
        bw.a.charlie("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public Object get(Object obj) {
        int delta = delta(obj);
        if (delta >= 0) {
            return this.purple[(delta << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int delta = delta(obj);
        if (delta >= 0) {
            return this.purple[(delta << 1) + 1];
        }
        return obj2;
    }

    public void golf(e eVar) {
        int i4 = eVar.red;
        bravo(this.red + i4);
        if (this.red == 0) {
            if (i4 > 0) {
                ArraysKt.zulu(0, 0, eVar.alpha, this.alpha, i4);
                ArraysKt.yankee(0, 0, i4 << 1, eVar.purple, this.purple);
                this.red = i4;
                return;
            }
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            put(eVar.foxtrot(i5), eVar.juliet(i5));
        }
    }

    public int hashCode() {
        int i4;
        int[] iArr = this.alpha;
        Object[] objArr = this.purple;
        int i5 = this.red;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i5) {
            Object obj = objArr[i10];
            int i13 = iArr[i11];
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i12 += i4 ^ i13;
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public Object hotel(int i4) {
        boolean z2;
        if (i4 >= 0 && i4 < this.red) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Object[] objArr = this.purple;
            int i5 = i4 << 1;
            Object obj = objArr[i5 + 1];
            int i10 = this.red;
            if (i10 <= 1) {
                clear();
                return obj;
            }
            int i11 = i10 - 1;
            int[] iArr = this.alpha;
            int i12 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i12 = i10 + (i10 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i12);
                Intrinsics.delta(copyOf, "copyOf(...)");
                this.alpha = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.purple, i12 << 1);
                Intrinsics.delta(copyOf2, "copyOf(...)");
                this.purple = copyOf2;
                if (i10 == this.red) {
                    if (i4 > 0) {
                        ArraysKt.zulu(0, 0, iArr, this.alpha, i4);
                        ArraysKt.yankee(0, 0, i5, objArr, this.purple);
                    }
                    if (i4 < i11) {
                        int i13 = i4 + 1;
                        ArraysKt.zulu(i4, i13, iArr, this.alpha, i10);
                        ArraysKt.yankee(i5, i13 << 1, i10 << 1, objArr, this.purple);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i4 < i11) {
                    int i14 = i4 + 1;
                    ArraysKt.zulu(i4, i14, iArr, iArr, i10);
                    Object[] objArr2 = this.purple;
                    ArraysKt.yankee(i5, i14 << 1, i10 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.purple;
                int i15 = i11 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            }
            if (i10 == this.red) {
                this.red = i11;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        bw.a.charlie("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public Object india(int i4, Object obj) {
        boolean z2 = false;
        if (i4 >= 0 && i4 < this.red) {
            z2 = true;
        }
        if (z2) {
            int i5 = (i4 << 1) + 1;
            Object[] objArr = this.purple;
            Object obj2 = objArr[i5];
            objArr[i5] = obj;
            return obj2;
        }
        bw.a.charlie("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public final boolean isEmpty() {
        if (this.red <= 0) {
            return true;
        }
        return false;
    }

    public final Object juliet(int i4) {
        boolean z2 = false;
        if (i4 >= 0 && i4 < this.red) {
            z2 = true;
        }
        if (z2) {
            return this.purple[(i4 << 1) + 1];
        }
        bw.a.charlie("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i4;
        int echo;
        int i5 = this.red;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        if (obj != null) {
            echo = charlie(i4, obj);
        } else {
            echo = echo();
        }
        if (echo >= 0) {
            int i10 = (echo << 1) + 1;
            Object[] objArr = this.purple;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~echo;
        int[] iArr = this.alpha;
        if (i5 >= iArr.length) {
            int i12 = 8;
            if (i5 >= 8) {
                i12 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.purple, i12 << 1);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            this.purple = copyOf2;
            if (i5 != this.red) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i5) {
            int[] iArr2 = this.alpha;
            int i13 = i11 + 1;
            ArraysKt.zulu(i13, i11, iArr2, iArr2, i5);
            Object[] objArr2 = this.purple;
            ArraysKt.yankee(i13 << 1, i11 << 1, this.red << 1, objArr2, objArr2);
        }
        int i14 = this.red;
        if (i5 == i14) {
            int[] iArr3 = this.alpha;
            if (i11 < iArr3.length) {
                iArr3[i11] = i4;
                Object[] objArr3 = this.purple;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.red = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int delta = delta(obj);
        if (delta >= 0) {
            return hotel(delta);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int delta = delta(obj);
        if (delta >= 0) {
            return india(delta, obj2);
        }
        return null;
    }

    public final int size() {
        return this.red;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.red * 28);
        sb2.append('{');
        int i4 = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb2.append(", ");
            }
            Object foxtrot = foxtrot(i5);
            if (foxtrot != sb2) {
                sb2.append(foxtrot);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object juliet = juliet(i5);
            if (juliet != sb2) {
                sb2.append(juliet);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int delta = delta(obj);
        if (delta < 0 || !Intrinsics.areEqual(obj2, juliet(delta))) {
            return false;
        }
        hotel(delta);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int delta = delta(obj);
        if (delta < 0 || !Intrinsics.areEqual(obj2, juliet(delta))) {
            return false;
        }
        india(delta, obj3);
        return true;
    }
}
