package com.google.common.collect;

import ao.ad;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import s6.W;

/* loaded from: classes2.dex */
public abstract class f extends a implements Set {
    public static final /* synthetic */ int red = 0;
    public transient d purple;

    public static int kilo(int i4) {
        int max = Math.max(i4, 2);
        boolean z2 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z2 = false;
        }
        if (z2) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static f lima(int i4, Object... objArr) {
        if (i4 != 0) {
            if (i4 != 1) {
                int kilo = kilo(i4);
                Object[] objArr2 = new Object[kilo];
                int i5 = kilo - 1;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < i4; i12++) {
                    Object obj = objArr[i12];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int alpha = W.alpha(hashCode);
                        while (true) {
                            int i13 = alpha & i5;
                            Object obj2 = objArr2[i13];
                            if (obj2 == null) {
                                objArr[i11] = obj;
                                objArr2[i13] = obj;
                                i10 += hashCode;
                                i11++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            alpha++;
                        }
                    } else {
                        throw new NullPointerException(ad.zulu(i12, "at index "));
                    }
                }
                Arrays.fill(objArr, i11, i4, (Object) null);
                if (i11 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new o(obj3);
                }
                if (kilo(i11) < kilo / 2) {
                    return lima(i11, objArr);
                }
                int length = objArr.length;
                if (i11 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i11);
                }
                return new n(i10, i5, i11, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o(obj4);
        }
        return n.f8275c;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f) && (this instanceof n)) {
            f fVar = (f) obj;
            fVar.getClass();
            if ((fVar instanceof n) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i4;
        int i5 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i5 = ~(~(i5 + i4));
        }
        return i5;
    }

    public d india() {
        d dVar = this.purple;
        if (dVar == null) {
            d mike = mike();
            this.purple = mike;
            return mike;
        }
        return dVar;
    }

    public d mike() {
        Object[] array = toArray(a.alpha);
        b bVar = d.purple;
        return d.india(array.length, array);
    }
}
