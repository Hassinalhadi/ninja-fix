package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1454l {
    public static final C1454l foxtrot = new C1454l((Boolean) null, 100, (Boolean) null, (String) null);
    public final int alpha;
    public final String bravo;
    public final Boolean charlie;
    public final String delta;
    public final EnumMap echo;

    public C1454l(Boolean bool, int i4, Boolean bool2, String str) {
        S s3;
        EnumMap enumMap = new EnumMap(U.class);
        this.echo = enumMap;
        U u4 = U.AD_USER_DATA;
        if (bool == null) {
            s3 = S.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            s3 = S.GRANTED;
        } else {
            s3 = S.DENIED;
        }
        enumMap.put((EnumMap) u4, (U) s3);
        this.alpha = i4;
        this.bravo = echo();
        this.charlie = bool2;
        this.delta = str;
    }

    public static C1454l alpha(int i4, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new C1454l((Boolean) null, i4, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(U.class);
        for (U u4 : T.DMA.alpha) {
            enumMap.put((EnumMap) u4, (U) V.bravo(bundle.getString(u4.alpha)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C1454l(enumMap, i4, bool, bundle.getString("cps_display_str"));
    }

    public static C1454l bravo(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(U.class);
            U[] uArr = T.DMA.alpha;
            int length = uArr.length;
            int i4 = 1;
            int i5 = 0;
            while (i5 < length) {
                enumMap.put((EnumMap) uArr[i5], (U) V.charlie(split[i4].charAt(0)));
                i5++;
                i4++;
            }
            return new C1454l(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return foxtrot;
    }

    public static Boolean delta(Bundle bundle) {
        if (bundle != null) {
            int ordinal = V.bravo(bundle.getString("ad_personalization")).ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return null;
    }

    public final S charlie() {
        S s3 = (S) this.echo.get(U.AD_USER_DATA);
        if (s3 == null) {
            return S.UNINITIALIZED;
        }
        return s3;
    }

    public final String echo() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.alpha);
        for (U u4 : T.DMA.alpha) {
            sb2.append(":");
            sb2.append(V.alpha((S) this.echo.get(u4)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1454l) {
            C1454l c1454l = (C1454l) obj;
            if (this.bravo.equalsIgnoreCase(c1454l.bravo) && Objects.equals(this.charlie, c1454l.charlie)) {
                return Objects.equals(this.delta, c1454l.delta);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        Boolean bool = this.charlie;
        if (bool == null) {
            i4 = 3;
        } else if (true != bool.booleanValue()) {
            i4 = 13;
        } else {
            i4 = 7;
        }
        String str = this.delta;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + this.bravo.hashCode() + (i4 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(V.hotel(this.alpha));
        for (U u4 : T.DMA.alpha) {
            sb2.append(Constants.SEPARATOR_COMMA);
            sb2.append(u4.alpha);
            sb2.append("=");
            S s3 = (S) this.echo.get(u4);
            if (s3 == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = s3.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                sb2.append("granted");
                            }
                        } else {
                            sb2.append("denied");
                        }
                    } else {
                        sb2.append("eu_consent_policy");
                    }
                } else {
                    sb2.append("uninitialized");
                }
            }
        }
        Boolean bool = this.charlie;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.delta;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C1454l(EnumMap enumMap, int i4, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(U.class);
        this.echo = enumMap2;
        enumMap2.putAll(enumMap);
        this.alpha = i4;
        this.bravo = echo();
        this.charlie = bool;
        this.delta = str;
    }
}
