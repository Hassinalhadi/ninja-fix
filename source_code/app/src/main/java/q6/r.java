package q6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class r extends n implements Set {
    public static final /* synthetic */ int red = 0;
    public transient q purple;

    public static int india(int i4) {
        int max = Math.max(i4, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static r kilo(int i4, Object... objArr) {
        if (i4 != 0) {
            if (i4 != 1) {
                int india = india(i4);
                Object[] objArr2 = new Object[india];
                int i5 = india - 1;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < i4; i12++) {
                    Object obj = objArr[i12];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i13 = rotateLeft & i5;
                            Object obj2 = objArr2[i13];
                            if (obj2 == null) {
                                objArr[i11] = obj;
                                objArr2[i13] = obj;
                                i10 += hashCode;
                                i11++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                rotateLeft++;
                            }
                        }
                    } else {
                        throw new NullPointerException(ao.ad.zulu(i12, "at index "));
                    }
                }
                Arrays.fill(objArr, i11, i4, (Object) null);
                if (i11 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new v(obj3);
                }
                if (india(i11) >= india / 2) {
                    if (i11 < 4) {
                        objArr = Arrays.copyOf(objArr, i11);
                    }
                    return new u(i10, i5, i11, objArr, objArr2);
                }
                return kilo(i11, objArr);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new v(obj4);
        }
        return u.f13161c;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && (this instanceof u)) {
            r rVar = (r) obj;
            rVar.getClass();
            if ((rVar instanceof u) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}
