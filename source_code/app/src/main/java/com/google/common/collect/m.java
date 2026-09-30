package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s6.V;
import s6.W;
import t6.AbstractC3013k;

/* loaded from: classes2.dex */
public final class m implements Map, Serializable {
    public static final m yellow = new m(0, null, new Object[0]);
    public transient j alpha;
    public transient k purple;
    public transient l red;
    public final transient Object silver;
    public final transient Object[] teal;
    public final transient int white;

    public m(int i4, Object obj, Object[] objArr) {
        this.silver = obj;
        this.teal = objArr;
        this.white = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m alpha(int i4, Object[] objArr, B0.a aVar) {
        int i5;
        boolean z2;
        char c3;
        Object obj;
        char c4;
        short[] sArr;
        int i10;
        boolean z10;
        ?? r17;
        boolean z11;
        boolean z12;
        int i11 = i4;
        Object[] objArr2 = objArr;
        if (i11 == 0) {
            return yellow;
        }
        int i12 = 1;
        Object obj2 = null;
        boolean z13 = false;
        if (i11 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new m(1, null, objArr2);
        }
        AbstractC3013k.charlie(i11, objArr2.length >> 1);
        int kilo = f.kilo(i11);
        char c10 = 2;
        if (i11 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i5 = 1;
            z12 = false;
        } else {
            int i13 = kilo - 1;
            if (kilo <= 128) {
                byte[] bArr = new byte[kilo];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i14 * 2;
                    int i17 = i15 * 2;
                    Object obj3 = objArr2[i16];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i16 ^ i12];
                    Objects.requireNonNull(obj4);
                    int alpha = W.alpha(obj3.hashCode());
                    while (true) {
                        int i18 = alpha & i13;
                        i10 = i12;
                        z10 = z13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i17;
                            if (i15 < i14) {
                                objArr2[i17] = obj3;
                                objArr2[i17 ^ 1] = obj4;
                            }
                            i15++;
                        } else {
                            if (obj3.equals(objArr2[i19])) {
                                int i20 = i19 ^ 1;
                                Object obj5 = objArr2[i20];
                                Objects.requireNonNull(obj5);
                                obj2 = new e(obj3, obj4, obj5);
                                objArr2[i20] = obj4;
                                break;
                            }
                            alpha = i18 + 1;
                            i12 = i10;
                            z13 = z10;
                        }
                    }
                    i14++;
                    i12 = i10;
                    z13 = z10;
                }
                i5 = i12;
                z2 = z13;
                if (i15 == i11) {
                    obj2 = bArr;
                    z12 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z2 ? 1 : 0] = bArr;
                    sArr[i5] = Integer.valueOf(i15);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z12 = z2;
                }
            } else {
                i5 = 1;
                z2 = false;
                if (kilo <= 32768) {
                    sArr = new short[kilo];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i22 * 2;
                        int i24 = i21 * 2;
                        Object obj6 = objArr2[i23];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i23 ^ 1];
                        Objects.requireNonNull(obj7);
                        int alpha2 = W.alpha(obj6.hashCode());
                        while (true) {
                            int i25 = alpha2 & i13;
                            int i26 = sArr[i25] & 65535;
                            if (i26 == 65535) {
                                sArr[i25] = (short) i24;
                                if (i21 < i22) {
                                    objArr2[i24] = obj6;
                                    objArr2[i24 ^ 1] = obj7;
                                }
                                i21++;
                            } else {
                                if (obj6.equals(objArr2[i26])) {
                                    int i27 = i26 ^ 1;
                                    Object obj8 = objArr2[i27];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new e(obj6, obj7, obj8);
                                    objArr2[i27] = obj7;
                                    break;
                                }
                                alpha2 = i25 + 1;
                            }
                        }
                    }
                    if (i21 != i11) {
                        obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                        z12 = z2;
                    }
                    obj2 = sArr;
                    z12 = z2;
                } else {
                    int[] iArr = new int[kilo];
                    Arrays.fill(iArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i11) {
                        int i30 = i28 * 2;
                        int i31 = i29 * 2;
                        Object obj9 = objArr2[i30];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i30 ^ 1];
                        Objects.requireNonNull(obj10);
                        int alpha3 = W.alpha(obj9.hashCode());
                        while (true) {
                            int i32 = alpha3 & i13;
                            int i33 = iArr[i32];
                            if (i33 == -1) {
                                iArr[i32] = i31;
                                if (i29 < i28) {
                                    objArr2[i31] = obj9;
                                    objArr2[i31 ^ 1] = obj10;
                                }
                                i29++;
                                c4 = c10;
                            } else {
                                c4 = c10;
                                if (obj9.equals(objArr2[i33])) {
                                    int i34 = i33 ^ 1;
                                    Object obj11 = objArr2[i34];
                                    Objects.requireNonNull(obj11);
                                    obj2 = new e(obj9, obj10, obj11);
                                    objArr2[i34] = obj10;
                                    break;
                                }
                                alpha3 = i32 + 1;
                                c10 = c4;
                            }
                        }
                        i28++;
                        c10 = c4;
                    }
                    c3 = c10;
                    if (i29 == i11) {
                        obj = iArr;
                        r17 = z2;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i29);
                        objArr3[c3] = obj2;
                        obj = objArr3;
                        r17 = z2;
                    }
                    z11 = obj instanceof Object[];
                    Object obj12 = obj;
                    if (z11) {
                        Object[] objArr4 = (Object[]) obj;
                        e eVar = (e) objArr4[c3];
                        if (aVar != null) {
                            aVar.delta = eVar;
                            Object obj13 = objArr4[r17];
                            int intValue = ((Integer) objArr4[i5]).intValue();
                            objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                            obj12 = obj13;
                            i11 = intValue;
                        } else {
                            throw eVar.alpha();
                        }
                    }
                    return new m(i11, obj12, objArr2);
                }
            }
        }
        c3 = 2;
        obj = obj2;
        r17 = z12;
        z11 = obj instanceof Object[];
        Object obj122 = obj;
        if (z11) {
        }
        return new m(i11, obj122, objArr2);
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
        l lVar = this.red;
        if (lVar == null) {
            lVar = new l(1, this.teal, this.white);
            this.red = lVar;
        }
        return lVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.alpha;
        if (jVar == null) {
            j jVar2 = new j(this, this.teal, this.white);
            this.alpha = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((f) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
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
            Object[] objArr = this.teal;
            if (this.white == 1) {
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
                        int alpha = W.alpha(obj.hashCode());
                        while (true) {
                            int i4 = alpha & length;
                            int i5 = bArr[i4] & 255;
                            if (i5 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i5])) {
                                obj2 = objArr[i5 ^ 1];
                                break;
                            }
                            alpha = i4 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int alpha2 = W.alpha(obj.hashCode());
                        while (true) {
                            int i10 = alpha2 & length2;
                            int i11 = sArr[i10] & 65535;
                            if (i11 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            alpha2 = i10 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int alpha3 = W.alpha(obj.hashCode());
                        while (true) {
                            int i12 = alpha3 & length3;
                            int i13 = iArr[i12];
                            if (i13 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i13])) {
                                obj2 = objArr[i13 ^ 1];
                                break;
                            }
                            alpha3 = i12 + 1;
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
        j jVar = this.alpha;
        if (jVar == null) {
            jVar = new j(this, this.teal, this.white);
            this.alpha = jVar;
        }
        int i5 = 0;
        for (Object obj : jVar) {
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i5 = ~(~(i5 + i4));
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
        k kVar = this.purple;
        if (kVar == null) {
            k kVar2 = new k(this, new l(0, this.teal, this.white));
            this.purple = kVar2;
            return kVar2;
        }
        return kVar;
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
        V.bravo(i4, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
        sb2.append('{');
        p it = ((j) entrySet()).iterator();
        boolean z2 = true;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                Map.Entry entry = (Map.Entry) bVar.next();
                if (!z2) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z2 = false;
            } else {
                sb2.append('}');
                return sb2.toString();
            }
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.red;
        if (lVar == null) {
            l lVar2 = new l(1, this.teal, this.white);
            this.red = lVar2;
            return lVar2;
        }
        return lVar;
    }
}
