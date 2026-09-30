package Ld;

import com.airbnb.lottie.compose.LottieConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes2.dex */
public final class g implements Map, Serializable, Yd.e {

    /* renamed from: g, reason: collision with root package name */
    public static final g f1831g;

    /* renamed from: a, reason: collision with root package name */
    public int f1832a;
    public Object[] alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f1833b;

    /* renamed from: c, reason: collision with root package name */
    public h f1834c;

    /* renamed from: d, reason: collision with root package name */
    public i f1835d;
    public h e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1836f;
    public Object[] purple;
    public int[] red;
    public int[] silver;
    public int teal;
    public int white;
    public int yellow;

    static {
        g gVar = new g(0);
        gVar.f1836f = true;
        f1831g = gVar;
    }

    public g() {
        this(8);
    }

    public final int alpha(Object obj) {
        charlie();
        while (true) {
            int juliet = juliet(obj);
            int i4 = this.teal * 2;
            int length = this.silver.length / 2;
            if (i4 > length) {
                i4 = length;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = this.silver;
                int i10 = iArr[juliet];
                if (i10 <= 0) {
                    int i11 = this.white;
                    Object[] objArr = this.alpha;
                    if (i11 >= objArr.length) {
                        golf(1);
                    } else {
                        int i12 = i11 + 1;
                        this.white = i12;
                        objArr[i11] = obj;
                        this.red[i11] = juliet;
                        iArr[juliet] = i12;
                        this.f1833b++;
                        this.f1832a++;
                        if (i5 > this.teal) {
                            this.teal = i5;
                        }
                        return i11;
                    }
                } else {
                    if (Intrinsics.areEqual(this.alpha[i10 - 1], obj)) {
                        return -i10;
                    }
                    i5++;
                    if (i5 > i4) {
                        kilo(this.silver.length * 2);
                        break;
                    }
                    int i13 = juliet - 1;
                    if (juliet == 0) {
                        juliet = this.silver.length - 1;
                    } else {
                        juliet = i13;
                    }
                }
            }
        }
    }

    public final g bravo() {
        charlie();
        this.f1836f = true;
        if (this.f1833b > 0) {
            return this;
        }
        g gVar = f1831g;
        Intrinsics.charlie(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    public final void charlie() {
        if (!this.f1836f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        charlie();
        int i4 = this.white - 1;
        if (i4 >= 0) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.red;
                int i10 = iArr[i5];
                if (i10 >= 0) {
                    this.silver[i10] = 0;
                    iArr[i5] = -1;
                }
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        AbstractC2689j6.delta(0, this.alpha, this.white);
        Object[] objArr = this.purple;
        if (objArr != null) {
            AbstractC2689j6.delta(0, objArr, this.white);
        }
        this.f1833b = 0;
        this.white = 0;
        this.f1832a++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (hotel(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (india(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void delta(boolean z2) {
        int i4;
        Object[] objArr = this.purple;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            i4 = this.white;
            if (i5 >= i4) {
                break;
            }
            int[] iArr = this.red;
            int i11 = iArr[i5];
            if (i11 >= 0) {
                Object[] objArr2 = this.alpha;
                objArr2[i10] = objArr2[i5];
                if (objArr != null) {
                    objArr[i10] = objArr[i5];
                }
                if (z2) {
                    iArr[i10] = i11;
                    this.silver[i11] = i10 + 1;
                }
                i10++;
            }
            i5++;
        }
        AbstractC2689j6.delta(i10, this.alpha, i4);
        if (objArr != null) {
            AbstractC2689j6.delta(i10, objArr, this.white);
        }
        this.white = i10;
    }

    public final boolean echo(Collection m4) {
        Intrinsics.echo(m4, "m");
        for (Object obj : m4) {
            if (obj != null) {
                try {
                    if (!foxtrot((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.e;
        if (hVar == null) {
            h hVar2 = new h(this, 0);
            this.e = hVar2;
            return hVar2;
        }
        return hVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f1833b != map.size() || !echo(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean foxtrot(Map.Entry entry) {
        Intrinsics.echo(entry, "entry");
        int hotel = hotel(entry.getKey());
        if (hotel < 0) {
            return false;
        }
        Object[] objArr = this.purple;
        Intrinsics.checkNotNull(objArr);
        return Intrinsics.areEqual(objArr[hotel], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int hotel = hotel(obj);
        if (hotel < 0) {
            return null;
        }
        Object[] objArr = this.purple;
        Intrinsics.checkNotNull(objArr);
        return objArr[hotel];
    }

    public final void golf(int i4) {
        Object[] objArr;
        Object[] objArr2 = this.alpha;
        int length = objArr2.length;
        int i5 = this.white;
        int i10 = length - i5;
        int i11 = i5 - this.f1833b;
        int i12 = 1;
        if (i10 < i4 && i10 + i11 >= i4 && i11 >= objArr2.length / 4) {
            delta(true);
            return;
        }
        int i13 = i5 + i4;
        if (i13 >= 0) {
            if (i13 > objArr2.length) {
                int length2 = objArr2.length;
                int i14 = length2 + (length2 >> 1);
                if (i14 - i13 < 0) {
                    i14 = i13;
                }
                if (i14 - 2147483639 > 0) {
                    if (i13 > 2147483639) {
                        i14 = LottieConstants.IterateForever;
                    } else {
                        i14 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i14);
                Intrinsics.delta(copyOf, "copyOf(...)");
                this.alpha = copyOf;
                Object[] objArr3 = this.purple;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i14);
                    Intrinsics.delta(objArr, "copyOf(...)");
                } else {
                    objArr = null;
                }
                this.purple = objArr;
                int[] copyOf2 = Arrays.copyOf(this.red, i14);
                Intrinsics.delta(copyOf2, "copyOf(...)");
                this.red = copyOf2;
                if (i14 >= 1) {
                    i12 = i14;
                }
                int highestOneBit = Integer.highestOneBit(i12 * 3);
                if (highestOneBit > this.silver.length) {
                    kilo(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i4;
        int i5;
        d dVar = new d(this, 0);
        int i10 = 0;
        while (dVar.hasNext()) {
            int i11 = dVar.alpha;
            g gVar = (g) dVar.silver;
            if (i11 < gVar.white) {
                dVar.alpha = i11 + 1;
                dVar.purple = i11;
                Object obj = gVar.alpha[i11];
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                Object[] objArr = gVar.purple;
                Intrinsics.checkNotNull(objArr);
                Object obj2 = objArr[dVar.purple];
                if (obj2 != null) {
                    i5 = obj2.hashCode();
                } else {
                    i5 = 0;
                }
                dVar.echo();
                i10 += i4 ^ i5;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i10;
    }

    public final int hotel(Object obj) {
        int juliet = juliet(obj);
        int i4 = this.teal;
        while (true) {
            int i5 = this.silver[juliet];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i10 = i5 - 1;
                if (Intrinsics.areEqual(this.alpha[i10], obj)) {
                    return i10;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            int i11 = juliet - 1;
            if (juliet == 0) {
                juliet = this.silver.length - 1;
            } else {
                juliet = i11;
            }
        }
    }

    public final int india(Object obj) {
        int i4 = this.white;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.red[i4] >= 0) {
                Object[] objArr = this.purple;
                Intrinsics.checkNotNull(objArr);
                if (Intrinsics.areEqual(objArr[i4], obj)) {
                    return i4;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f1833b == 0) {
            return true;
        }
        return false;
    }

    public final int juliet(Object obj) {
        int i4;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return (i4 * (-1640531527)) >>> this.yellow;
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f1834c;
        if (hVar == null) {
            h hVar2 = new h(this, 1);
            this.f1834c = hVar2;
            return hVar2;
        }
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.red[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kilo(int i4) {
        this.f1832a++;
        int i5 = 0;
        if (this.white > this.f1833b) {
            delta(false);
        }
        this.silver = new int[i4];
        this.yellow = Integer.numberOfLeadingZeros(i4) + 1;
        while (i5 < this.white) {
            int i10 = i5 + 1;
            int juliet = juliet(this.alpha[i5]);
            int i11 = this.teal;
            while (true) {
                int[] iArr = this.silver;
                if (iArr[juliet] == 0) {
                    break;
                }
                i11--;
                if (i11 >= 0) {
                    int i12 = juliet - 1;
                    if (juliet == 0) {
                        juliet = iArr.length - 1;
                    } else {
                        juliet = i12;
                    }
                } else {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lima(int i4) {
        Object[] objArr = this.alpha;
        Intrinsics.echo(objArr, "<this>");
        objArr[i4] = null;
        Object[] objArr2 = this.purple;
        if (objArr2 != null) {
            objArr2[i4] = null;
        }
        int i5 = this.red[i4];
        int i10 = this.teal * 2;
        int length = this.silver.length / 2;
        if (i10 > length) {
            i10 = length;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = i5;
        while (true) {
            int i14 = i5 - 1;
            if (i5 == 0) {
                i5 = this.silver.length - 1;
            } else {
                i5 = i14;
            }
            i12++;
            if (i12 > this.teal) {
                this.silver[i13] = 0;
                break;
            }
            int[] iArr = this.silver;
            int i15 = iArr[i5];
            if (i15 == 0) {
                iArr[i13] = 0;
                break;
            }
            if (i15 < 0) {
                iArr[i13] = -1;
            } else {
                int i16 = i15 - 1;
                int juliet = juliet(this.alpha[i16]) - i5;
                int[] iArr2 = this.silver;
                if ((juliet & (iArr2.length - 1)) >= i12) {
                    iArr2[i13] = i15;
                    this.red[i16] = i13;
                }
                i11--;
                if (i11 >= 0) {
                    this.silver[i13] = -1;
                    break;
                }
            }
            i13 = i5;
            i12 = 0;
            i11--;
            if (i11 >= 0) {
            }
        }
        this.red[i4] = -1;
        this.f1833b--;
        this.f1832a++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        charlie();
        int alpha = alpha(obj);
        Object[] objArr = this.purple;
        if (objArr == null) {
            int length = this.alpha.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.purple = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        if (alpha < 0) {
            int i4 = (-alpha) - 1;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        objArr[alpha] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.echo(from, "from");
        charlie();
        Set<Map.Entry> entrySet = from.entrySet();
        if (!entrySet.isEmpty()) {
            golf(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int alpha = alpha(entry.getKey());
                Object[] objArr = this.purple;
                if (objArr == null) {
                    int length = this.alpha.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.purple = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.");
                    }
                }
                if (alpha >= 0) {
                    objArr[alpha] = entry.getValue();
                } else {
                    int i4 = (-alpha) - 1;
                    if (!Intrinsics.areEqual(entry.getValue(), objArr[i4])) {
                        objArr[i4] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        charlie();
        int hotel = hotel(obj);
        if (hotel < 0) {
            return null;
        }
        Object[] objArr = this.purple;
        Intrinsics.checkNotNull(objArr);
        Object obj2 = objArr[hotel];
        lima(hotel);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1833b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f1833b * 3) + 2);
        sb2.append("{");
        d dVar = new d(this, 0);
        int i4 = 0;
        while (dVar.hasNext()) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            int i5 = dVar.alpha;
            g gVar = (g) dVar.silver;
            if (i5 < gVar.white) {
                dVar.alpha = i5 + 1;
                dVar.purple = i5;
                Object obj = gVar.alpha[i5];
                if (obj == gVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = gVar.purple;
                Intrinsics.checkNotNull(objArr);
                Object obj2 = objArr[dVar.purple];
                if (obj2 == gVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                dVar.echo();
                i4++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f1835d;
        if (iVar == null) {
            i iVar2 = new i(0, this);
            this.f1835d = iVar2;
            return iVar2;
        }
        return iVar;
    }

    public g(int i4) {
        if (i4 >= 0) {
            Object[] objArr = new Object[i4];
            int[] iArr = new int[i4];
            int highestOneBit = Integer.highestOneBit((i4 < 1 ? 1 : i4) * 3);
            this.alpha = objArr;
            this.purple = null;
            this.red = iArr;
            this.silver = new int[highestOneBit];
            this.teal = 2;
            this.white = 0;
            this.yellow = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
