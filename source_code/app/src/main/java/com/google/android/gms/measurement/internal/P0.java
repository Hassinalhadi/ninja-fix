package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class P0 {
    public final HashMap alpha;

    public P0(Map map) {
        HashMap hashMap = new HashMap();
        this.alpha = hashMap;
        hashMap.putAll(map);
    }

    public final Bundle alpha() {
        String str;
        String str2;
        ab abVar = ac.f7590c0;
        boolean booleanValue = ((Boolean) abVar.alpha(null)).booleanValue();
        HashMap hashMap = this.alpha;
        if (!booleanValue ? !(!"1".equals(hashMap.get("GoogleConsent")) || !"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode")))) {
            if (((Boolean) abVar.alpha(null)).booleanValue()) {
                if (hashMap.get(Constants.CLTAP_APP_VERSION) == null) {
                    return echo();
                }
                if (delta() >= 0) {
                    Bundle bundle = new Bundle();
                    String str3 = "granted";
                    if (true == Objects.equals(hashMap.get("AuthorizePurpose1"), "1")) {
                        str = "granted";
                    } else {
                        str = "denied";
                    }
                    bundle.putString("ad_storage", str);
                    if (Objects.equals(hashMap.get("AuthorizePurpose3"), "1") && Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) {
                        str2 = "granted";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString("ad_personalization", str2);
                    if (delta() >= 4) {
                        if (!Objects.equals(hashMap.get("AuthorizePurpose1"), "1") || !Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                            str3 = "denied";
                        }
                        bundle.putString("ad_user_data", str3);
                    }
                    return bundle;
                }
            } else {
                return echo();
            }
        }
        return Bundle.EMPTY;
    }

    public final String bravo() {
        int i4;
        HashMap hashMap = this.alpha;
        StringBuilder sb2 = new StringBuilder("1");
        int i5 = -1;
        try {
            String str = (String) hashMap.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i5 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i5 >= 0 && i5 <= 4095) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5 & 63));
        } else {
            sb2.append("00");
        }
        int delta = delta();
        if (delta >= 0 && delta <= 63) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(delta));
        } else {
            sb2.append(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO);
        }
        if (true != "1".equals(hashMap.get("gdprApplies"))) {
            i4 = 0;
        } else {
            i4 = 2;
        }
        int i10 = i4 | 4;
        if ("1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            i10 = i4 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10));
        return sb2.toString();
    }

    public final String charlie() {
        StringBuilder sb2 = new StringBuilder();
        com.google.common.collect.h hVar = R0.alpha;
        int i4 = hVar.silver;
        for (int i5 = 0; i5 < i4; i5++) {
            String str = (String) hVar.get(i5);
            HashMap hashMap = this.alpha;
            if (hashMap.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) hashMap.get(str));
            }
        }
        return sb2.toString();
    }

    public final int delta() {
        try {
            String str = (String) this.alpha.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle echo() {
        int delta;
        String str;
        String str2;
        HashMap hashMap = this.alpha;
        if ("1".equals(hashMap.get("GoogleConsent")) && (delta = delta()) >= 0) {
            String str3 = (String) hashMap.get("PurposeConsents");
            if (!TextUtils.isEmpty(str3)) {
                Bundle bundle = new Bundle();
                String str4 = "denied";
                if (str3.length() > 0) {
                    if (str3.charAt(0) != '1') {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString("ad_storage", str2);
                }
                if (str3.length() > 3) {
                    if (str3.charAt(2) != '1' || str3.charAt(3) != '1') {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString("ad_personalization", str);
                }
                if (str3.length() > 6 && delta >= 4) {
                    if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                        str4 = "granted";
                    }
                    bundle.putString("ad_user_data", str4);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P0)) {
            return false;
        }
        return charlie().equalsIgnoreCase(((P0) obj).charlie());
    }

    public final int hashCode() {
        return charlie().hashCode();
    }

    public final String toString() {
        return charlie();
    }
}
