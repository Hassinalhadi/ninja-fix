package s6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: s6.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2825z extends AbstractMap implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13696c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient C2807x f13697a;
    public transient Object alpha;

    /* renamed from: b, reason: collision with root package name */
    public transient C2762s f13698b;
    public transient int[] purple;
    public transient Object[] red;
    public transient Object[] silver;
    public transient int teal = Math.min(Math.max(12, 1), 1073741823);
    public transient int white;
    public transient C2807x yellow;

    public final int[] alpha() {
        int[] iArr = this.purple;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] bravo() {
        Object[] objArr = this.red;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] charlie() {
        Object[] objArr = this.silver;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (foxtrot()) {
            return;
        }
        this.teal += 32;
        Map delta = delta();
        if (delta != null) {
            this.teal = Math.min(Math.max(size(), 3), 1073741823);
            delta.clear();
            this.alpha = null;
            this.white = 0;
            return;
        }
        Arrays.fill(bravo(), 0, this.white, (Object) null);
        Arrays.fill(charlie(), 0, this.white, (Object) null);
        Object obj = this.alpha;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(alpha(), 0, this.white, 0);
        this.white = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map delta = delta();
        if (delta != null) {
            return delta.containsKey(obj);
        }
        if (hotel(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map delta = delta();
        if (delta == null) {
            for (int i4 = 0; i4 < this.white; i4++) {
                if (t6.ad.bravo(obj, charlie()[i4])) {
                    return true;
                }
            }
            return false;
        }
        return delta.containsValue(obj);
    }

    public final Map delta() {
        Object obj = this.alpha;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void echo(int i4, int i5) {
        Object obj = this.alpha;
        Objects.requireNonNull(obj);
        int[] alpha = alpha();
        Object[] bravo = bravo();
        Object[] charlie = charlie();
        int size = size();
        int i10 = size - 1;
        if (i4 < i10) {
            int i11 = i4 + 1;
            Object obj2 = bravo[i10];
            bravo[i4] = obj2;
            charlie[i4] = charlie[i10];
            bravo[i10] = null;
            charlie[i10] = null;
            alpha[i4] = alpha[i10];
            alpha[i10] = 0;
            int alpha2 = t6.ah.alpha(obj2) & i5;
            int bravo2 = t6.ag.bravo(alpha2, obj);
            if (bravo2 == size) {
                t6.ag.delta(alpha2, i11, obj);
                return;
            }
            while (true) {
                int i12 = bravo2 - 1;
                int i13 = alpha[i12];
                int i14 = i13 & i5;
                if (i14 != size) {
                    bravo2 = i14;
                } else {
                    alpha[i12] = (i13 & (~i5)) | (i5 & i11);
                    return;
                }
            }
        } else {
            bravo[i4] = null;
            charlie[i4] = null;
            alpha[i4] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2807x c2807x = this.f13697a;
        if (c2807x == null) {
            C2807x c2807x2 = new C2807x(this, 0);
            this.f13697a = c2807x2;
            return c2807x2;
        }
        return c2807x;
    }

    public final boolean foxtrot() {
        if (this.alpha == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map delta = delta();
        if (delta != null) {
            return delta.get(obj);
        }
        int hotel = hotel(obj);
        if (hotel == -1) {
            return null;
        }
        return charlie()[hotel];
    }

    public final int golf() {
        return (1 << (this.teal & 31)) - 1;
    }

    public final int hotel(Object obj) {
        if (foxtrot()) {
            return -1;
        }
        int alpha = t6.ah.alpha(obj);
        int golf = golf();
        Object obj2 = this.alpha;
        Objects.requireNonNull(obj2);
        int bravo = t6.ag.bravo(alpha & golf, obj2);
        if (bravo != 0) {
            int i4 = ~golf;
            int i5 = alpha & i4;
            do {
                int i10 = bravo - 1;
                int i11 = alpha()[i10];
                if ((i11 & i4) == i5 && t6.ad.bravo(obj, bravo()[i10])) {
                    return i10;
                }
                bravo = i11 & golf;
            } while (bravo != 0);
        }
        return -1;
    }

    public final int india(int i4, int i5, int i10, int i11) {
        int i12 = i5 - 1;
        Object charlie = t6.ag.charlie(i5);
        if (i11 != 0) {
            t6.ag.delta(i10 & i12, i11 + 1, charlie);
        }
        Object obj = this.alpha;
        Objects.requireNonNull(obj);
        int[] alpha = alpha();
        for (int i13 = 0; i13 <= i4; i13++) {
            int bravo = t6.ag.bravo(i13, obj);
            while (bravo != 0) {
                int i14 = bravo - 1;
                int i15 = alpha[i14];
                int i16 = ((~i4) & i15) | i13;
                int i17 = i16 & i12;
                int bravo2 = t6.ag.bravo(i17, charlie);
                t6.ag.delta(i17, bravo, charlie);
                alpha[i14] = ((~i12) & i16) | (bravo2 & i12);
                bravo = i15 & i4;
            }
        }
        this.alpha = charlie;
        this.teal = ((32 - Integer.numberOfLeadingZeros(i12)) & 31) | (this.teal & (-32));
        return i12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object juliet(Object obj) {
        if (!foxtrot()) {
            int golf = golf();
            Object obj2 = this.alpha;
            Objects.requireNonNull(obj2);
            int alpha = t6.ag.alpha(obj, null, golf, obj2, alpha(), bravo(), null);
            if (alpha != -1) {
                Object obj3 = charlie()[alpha];
                echo(alpha, golf);
                this.white--;
                this.teal += 32;
                return obj3;
            }
        }
        return f13696c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C2807x c2807x = this.yellow;
        if (c2807x == null) {
            C2807x c2807x2 = new C2807x(this, 1);
            this.yellow = c2807x2;
            return c2807x2;
        }
        return c2807x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i4;
        int i5;
        int i10;
        int i11 = 32;
        if (foxtrot()) {
            t6.ae.delta("Arrays already allocated", foxtrot());
            int i12 = this.teal;
            int max = Math.max(i12 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.alpha = t6.ag.charlie(max2);
            this.teal = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.teal & (-32));
            this.purple = new int[i12];
            this.red = new Object[i12];
            this.silver = new Object[i12];
        }
        Map delta = delta();
        if (delta != null) {
            return delta.put(obj, obj2);
        }
        int[] alpha = alpha();
        Object[] bravo = bravo();
        Object[] charlie = charlie();
        int i13 = this.white;
        int i14 = i13 + 1;
        int alpha2 = t6.ah.alpha(obj);
        int golf = golf();
        int i15 = alpha2 & golf;
        Object obj3 = this.alpha;
        Objects.requireNonNull(obj3);
        int bravo2 = t6.ag.bravo(i15, obj3);
        if (bravo2 == 0) {
            if (i14 > golf) {
                if (golf < 32) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                golf = india(golf, (golf + 1) * i10, alpha2, i13);
            } else {
                Object obj4 = this.alpha;
                Objects.requireNonNull(obj4);
                t6.ag.delta(i15, i14, obj4);
            }
            i4 = 1;
        } else {
            int i16 = ~golf;
            int i17 = alpha2 & i16;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                int i20 = bravo2 - 1;
                int i21 = alpha[i20];
                i4 = 1;
                int i22 = i21 & i16;
                int i23 = i11;
                if (i22 == i17 && t6.ad.bravo(obj, bravo[i20])) {
                    Object obj5 = charlie[i20];
                    charlie[i20] = obj2;
                    return obj5;
                }
                int i24 = i21 & golf;
                int i25 = i19 + 1;
                if (i24 == 0) {
                    if (i25 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(golf() + 1, 1.0f);
                        if (isEmpty()) {
                            i18 = -1;
                        }
                        while (i18 >= 0) {
                            linkedHashMap.put(bravo()[i18], charlie()[i18]);
                            int i26 = i18 + 1;
                            if (i26 >= this.white) {
                                i18 = -1;
                            } else {
                                i18 = i26;
                            }
                        }
                        this.alpha = linkedHashMap;
                        this.purple = null;
                        this.red = null;
                        this.silver = null;
                        this.teal += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i14 > golf) {
                        if (golf < i23) {
                            i5 = 4;
                        } else {
                            i5 = 2;
                        }
                        golf = india(golf, (golf + 1) * i5, alpha2, i13);
                    } else {
                        alpha[i20] = i22 | (i14 & golf);
                    }
                } else {
                    i19 = i25;
                    bravo2 = i24;
                    i11 = i23;
                }
            }
        }
        int length = alpha().length;
        if (i14 > length) {
            int i27 = i4;
            int min = Math.min(1073741823, (Math.max(i27, length >>> 1) + length) | i27);
            if (min != length) {
                this.purple = Arrays.copyOf(alpha(), min);
                this.red = Arrays.copyOf(bravo(), min);
                this.silver = Arrays.copyOf(charlie(), min);
            }
        }
        alpha()[i13] = (~golf) & alpha2;
        bravo()[i13] = obj;
        charlie()[i13] = obj2;
        this.white = i14;
        this.teal += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map delta = delta();
        if (delta != null) {
            return delta.remove(obj);
        }
        Object juliet = juliet(obj);
        if (juliet == f13696c) {
            return null;
        }
        return juliet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map delta = delta();
        if (delta != null) {
            return delta.size();
        }
        return this.white;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2762s c2762s = this.f13698b;
        if (c2762s == null) {
            C2762s c2762s2 = new C2762s(1, this);
            this.f13698b = c2762s2;
            return c2762s2;
        }
        return c2762s;
    }
}
