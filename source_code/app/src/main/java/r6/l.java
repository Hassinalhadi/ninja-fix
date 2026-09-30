package r6;

import ao.ad;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t6.AbstractC2998h;
import t6.AbstractC3008j;

/* loaded from: classes2.dex */
public final class l implements Map, Serializable {
    public static final l yellow = new l(0, null, new Object[0]);
    public transient i alpha;
    public transient j purple;
    public transient k red;
    public final transient Object silver;
    public final transient Object[] teal;
    public final transient int white;

    public l(int i4, Object obj, Object[] objArr) {
        this.silver = obj;
        this.teal = objArr;
        this.white = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bd  */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l alpha(int i4, Object[] objArr, B0.a aVar) {
        int i5;
        int i10;
        boolean z2;
        char c3;
        Object obj;
        char c4;
        short[] sArr;
        int i11;
        boolean z10;
        ?? r17;
        boolean z11;
        boolean z12;
        int i12 = i4;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return yellow;
        }
        int i13 = 1;
        Object obj2 = null;
        boolean z13 = false;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new l(1, null, objArr2);
        }
        AbstractC2998h.golf(i12, objArr2.length >> 1);
        char c10 = 2;
        int max = Math.max(i12, 2);
        if (max < 751619276) {
            i5 = Integer.highestOneBit(max - 1);
            do {
                i5 += i5;
            } while (i5 * 0.7d < max);
        } else {
            i5 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i12 = 1;
            i10 = 1;
            z12 = false;
        } else {
            int i14 = i5 - 1;
            if (i5 <= 128) {
                byte[] bArr = new byte[i5];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj3 = objArr2[i18];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i18 ^ i13];
                    Objects.requireNonNull(obj4);
                    int bravo = AbstractC3008j.bravo(obj3.hashCode());
                    while (true) {
                        int i19 = bravo & i14;
                        i11 = i13;
                        z10 = z13;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArr2[i17] = obj3;
                                objArr2[i17 ^ 1] = obj4;
                            }
                            i16++;
                        } else {
                            if (obj3.equals(objArr2[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj5 = objArr2[i21];
                                Objects.requireNonNull(obj5);
                                obj2 = new C2497e(obj3, obj4, obj5);
                                objArr2[i21] = obj4;
                                break;
                            }
                            bravo = i19 + 1;
                            i13 = i11;
                            z13 = z10;
                        }
                    }
                    i15++;
                    i13 = i11;
                    z13 = z10;
                }
                i10 = i13;
                z2 = z13;
                if (i16 == i12) {
                    c3 = 2;
                    obj = bArr;
                    r17 = z2;
                    z11 = obj instanceof Object[];
                    Object obj6 = obj;
                    if (z11) {
                        Object[] objArr3 = (Object[]) obj;
                        C2497e c2497e = (C2497e) objArr3[c3];
                        if (aVar != null) {
                            aVar.delta = c2497e;
                            Object obj7 = objArr3[r17];
                            int intValue = ((Integer) objArr3[i10]).intValue();
                            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                            obj6 = obj7;
                            i12 = intValue;
                        } else {
                            throw c2497e.alpha();
                        }
                    }
                    return new l(i12, obj6, objArr2);
                }
                sArr = new Object[3];
                sArr[z2 ? 1 : 0] = bArr;
                sArr[i10] = Integer.valueOf(i16);
                sArr[2] = obj2;
                obj2 = sArr;
                z12 = z2;
            } else {
                i10 = 1;
                z2 = false;
                if (i5 <= 32768) {
                    sArr = new short[i5];
                    Arrays.fill(sArr, (short) -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i22 + i22;
                        int i25 = i23 + i23;
                        Object obj8 = objArr2[i25];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i25 ^ 1];
                        Objects.requireNonNull(obj9);
                        int bravo2 = AbstractC3008j.bravo(obj8.hashCode());
                        while (true) {
                            int i26 = bravo2 & i14;
                            char c11 = (char) sArr[i26];
                            if (c11 == 65535) {
                                sArr[i26] = (short) i24;
                                if (i22 < i23) {
                                    objArr2[i24] = obj8;
                                    objArr2[i24 ^ 1] = obj9;
                                }
                                i22++;
                            } else {
                                if (obj8.equals(objArr2[c11])) {
                                    int i27 = c11 ^ 1;
                                    Object obj10 = objArr2[i27];
                                    Objects.requireNonNull(obj10);
                                    C2497e c2497e2 = new C2497e(obj8, obj9, obj10);
                                    objArr2[i27] = obj9;
                                    obj2 = c2497e2;
                                    break;
                                }
                                bravo2 = i26 + 1;
                            }
                        }
                    }
                    if (i22 != i12) {
                        obj2 = new Object[]{sArr, Integer.valueOf(i22), obj2};
                        z12 = z2;
                    }
                    obj2 = sArr;
                    z12 = z2;
                } else {
                    int[] iArr = new int[i5];
                    Arrays.fill(iArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i12) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj11 = objArr2[i31];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArr2[i31 ^ 1];
                        Objects.requireNonNull(obj12);
                        int bravo3 = AbstractC3008j.bravo(obj11.hashCode());
                        while (true) {
                            int i32 = bravo3 & i14;
                            int i33 = iArr[i32];
                            if (i33 == -1) {
                                iArr[i32] = i30;
                                if (i29 < i28) {
                                    objArr2[i30] = obj11;
                                    objArr2[i30 ^ 1] = obj12;
                                }
                                i29++;
                                c4 = c10;
                            } else {
                                c4 = c10;
                                if (obj11.equals(objArr2[i33])) {
                                    int i34 = i33 ^ 1;
                                    Object obj13 = objArr2[i34];
                                    Objects.requireNonNull(obj13);
                                    C2497e c2497e3 = new C2497e(obj11, obj12, obj13);
                                    objArr2[i34] = obj12;
                                    obj2 = c2497e3;
                                    break;
                                }
                                bravo3 = i32 + 1;
                                c10 = c4;
                            }
                        }
                        i28++;
                        c10 = c4;
                    }
                    c3 = c10;
                    if (i29 == i12) {
                        obj = iArr;
                        r17 = z2;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i29);
                        objArr4[c3] = obj2;
                        obj = objArr4;
                        r17 = z2;
                    }
                    z11 = obj instanceof Object[];
                    Object obj62 = obj;
                    if (z11) {
                    }
                    return new l(i12, obj62, objArr2);
                }
            }
        }
        c3 = 2;
        obj = obj2;
        r17 = z12;
        z11 = obj instanceof Object[];
        Object obj622 = obj;
        if (z11) {
        }
        return new l(i12, obj622, objArr2);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        k kVar = this.red;
        if (kVar == null) {
            kVar = new k(1, this.teal, this.white);
            this.red = kVar;
        }
        return kVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i iVar = this.alpha;
        if (iVar == null) {
            i iVar2 = new i(this, this.teal, this.white);
            this.alpha = iVar2;
            return iVar2;
        }
        return iVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i4 = this.white;
            Object[] objArr = this.teal;
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.silver;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int bravo = AbstractC3008j.bravo(obj.hashCode());
                        while (true) {
                            int i5 = bravo & length;
                            int i10 = bArr[i5] & 255;
                            if (i10 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i10])) {
                                obj2 = objArr[i10 ^ 1];
                                break;
                            }
                            bravo = i5 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int bravo2 = AbstractC3008j.bravo(obj.hashCode());
                        while (true) {
                            int i11 = bravo2 & length2;
                            char c3 = (char) sArr[i11];
                            if (c3 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c3])) {
                                obj2 = objArr[c3 ^ 1];
                                break;
                            }
                            bravo2 = i11 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int bravo3 = AbstractC3008j.bravo(obj.hashCode());
                        while (true) {
                            int i12 = bravo3 & length3;
                            int i13 = iArr[i12];
                            if (i13 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i13])) {
                                obj2 = objArr[i13 ^ 1];
                                break;
                            }
                            bravo3 = i12 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i4;
        i iVar = this.alpha;
        if (iVar == null) {
            iVar = new i(this, this.teal, this.white);
            this.alpha = iVar;
        }
        int i5 = 0;
        for (Object obj : iVar) {
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i5 += i4;
        }
        return i5;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        j jVar = this.purple;
        if (jVar == null) {
            j jVar2 = new j(this, new k(0, this.teal, this.white));
            this.purple = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.white;
    }

    public final String toString() {
        int i4 = this.white;
        if (i4 >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
            sb2.append('{');
            Iterator it = ((i) entrySet()).iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!z2) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z2 = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException(ad.zulu(i4, "size cannot be negative but was: "));
    }

    @Override // java.util.Map
    public final Collection values() {
        k kVar = this.red;
        if (kVar == null) {
            k kVar2 = new k(1, this.teal, this.white);
            this.red = kVar2;
            return kVar2;
        }
        return kVar;
    }
}
