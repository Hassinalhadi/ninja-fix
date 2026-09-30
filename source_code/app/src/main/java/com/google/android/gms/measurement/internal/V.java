package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class V {
    public static final V charlie = new V(100);
    public final EnumMap alpha;
    public final int bravo;

    public V(int i4) {
        EnumMap enumMap = new EnumMap(U.class);
        this.alpha = enumMap;
        U u4 = U.AD_STORAGE;
        S s3 = S.UNINITIALIZED;
        enumMap.put((EnumMap) u4, (U) s3);
        enumMap.put((EnumMap) U.ANALYTICS_STORAGE, (U) s3);
        this.bravo = i4;
    }

    public static char alpha(S s3) {
        if (s3 != null) {
            int ordinal = s3.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK;
                    }
                    return NumberOnlyZipVisualTransformation.HYPHEN;
                }
                return '0';
            }
            return '+';
        }
        return NumberOnlyZipVisualTransformation.HYPHEN;
    }

    public static S bravo(String str) {
        S s3 = S.UNINITIALIZED;
        if (str == null) {
            return s3;
        }
        if (str.equals("granted")) {
            return S.GRANTED;
        }
        if (str.equals("denied")) {
            return S.DENIED;
        }
        return s3;
    }

    public static S charlie(char c3) {
        if (c3 != '+') {
            if (c3 != '0') {
                if (c3 != '1') {
                    return S.UNINITIALIZED;
                }
                return S.GRANTED;
            }
            return S.DENIED;
        }
        return S.POLICY;
    }

    public static V delta(int i4, Bundle bundle) {
        if (bundle == null) {
            return new V(i4);
        }
        EnumMap enumMap = new EnumMap(U.class);
        for (U u4 : T.STORAGE.alpha) {
            enumMap.put((EnumMap) u4, (U) bravo(bundle.getString(u4.alpha)));
        }
        return new V(enumMap, i4);
    }

    public static V echo(int i4, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(U.class);
        T t5 = T.STORAGE;
        int i5 = 0;
        while (true) {
            U[] uArr = t5.alpha;
            if (i5 < uArr.length) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                U u4 = uArr[i5];
                int i10 = i5 + 2;
                if (i10 < str2.length()) {
                    enumMap.put((EnumMap) u4, (U) charlie(str2.charAt(i10)));
                } else {
                    enumMap.put((EnumMap) u4, (U) S.UNINITIALIZED);
                }
                i5++;
            } else {
                return new V(enumMap, i4);
            }
        }
    }

    public static String hotel(int i4) {
        return i4 != -30 ? i4 != -20 ? i4 != -10 ? i4 != 0 ? i4 != 30 ? i4 != 90 ? i4 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean lima(int i4, int i5) {
        int i10 = -30;
        if (i4 == -20) {
            if (i5 == -30) {
                return true;
            }
            i4 = -20;
        }
        if (i4 != -30) {
            i10 = i4;
        } else if (i5 == -20) {
            return true;
        }
        return i10 == i5 || i4 < i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v4 = (V) obj;
        for (U u4 : T.STORAGE.alpha) {
            if (this.alpha.get(u4) != v4.alpha.get(u4)) {
                return false;
            }
        }
        if (this.bravo != v4.bravo) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V foxtrot(V v4) {
        EnumMap enumMap = new EnumMap(U.class);
        for (U u4 : T.STORAGE.alpha) {
            S s3 = (S) this.alpha.get(u4);
            S s9 = (S) v4.alpha.get(u4);
            if (s3 != null) {
                if (s9 != null) {
                    S s10 = S.UNINITIALIZED;
                    if (s3 != s10) {
                        if (s9 != s10) {
                            S s11 = S.POLICY;
                            if (s3 != s11) {
                                if (s9 != s11) {
                                    S s12 = S.DENIED;
                                    s3 = (s3 == s12 || s9 == s12) ? s12 : S.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (s3 == null) {
                    enumMap.put((EnumMap) u4, (U) s3);
                }
            }
            s3 = s9;
            if (s3 == null) {
            }
        }
        return new V(enumMap, 100);
    }

    public final V golf(V v4) {
        EnumMap enumMap = new EnumMap(U.class);
        for (U u4 : T.STORAGE.alpha) {
            S s3 = (S) this.alpha.get(u4);
            if (s3 == S.UNINITIALIZED) {
                s3 = (S) v4.alpha.get(u4);
            }
            if (s3 != null) {
                enumMap.put((EnumMap) u4, (U) s3);
            }
        }
        return new V(enumMap, this.bravo);
    }

    public final int hashCode() {
        Iterator it = this.alpha.values().iterator();
        int i4 = this.bravo * 17;
        while (it.hasNext()) {
            i4 = (i4 * 31) + ((S) it.next()).hashCode();
        }
        return i4;
    }

    public final String india() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (U u4 : T.STORAGE.alpha) {
            S s3 = (S) this.alpha.get(u4);
            char c3 = NumberOnlyZipVisualTransformation.HYPHEN;
            if (s3 != null && (ordinal = s3.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c3 = '0';
                    }
                }
                c3 = ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK;
            }
            sb2.append(c3);
        }
        return sb2.toString();
    }

    public final String juliet() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (U u4 : T.STORAGE.alpha) {
            sb2.append(alpha((S) this.alpha.get(u4)));
        }
        return sb2.toString();
    }

    public final boolean kilo(U u4) {
        if (((S) this.alpha.get(u4)) == S.DENIED) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(hotel(this.bravo));
        for (U u4 : T.STORAGE.alpha) {
            sb2.append(Constants.SEPARATOR_COMMA);
            sb2.append(u4.alpha);
            sb2.append("=");
            S s3 = (S) this.alpha.get(u4);
            if (s3 == null) {
                s3 = S.UNINITIALIZED;
            }
            sb2.append(s3);
        }
        return sb2.toString();
    }

    public V(EnumMap enumMap, int i4) {
        EnumMap enumMap2 = new EnumMap(U.class);
        this.alpha = enumMap2;
        enumMap2.putAll(enumMap);
        this.bravo = i4;
    }
}
