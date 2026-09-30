package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.EnumC1330i1;
import com.google.android.gms.internal.measurement.EnumC1335j1;

/* loaded from: classes2.dex */
public abstract class R0 {
    public static final com.google.common.collect.h alpha;

    static {
        com.google.common.collect.b bVar = com.google.common.collect.d.purple;
        Object[] objArr = new Object[24];
        objArr[0] = Constants.CLTAP_APP_VERSION;
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        s6.Y.alpha(24, objArr);
        alpha = com.google.common.collect.d.india(24, objArr);
    }

    public static int alpha(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static String bravo(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean charlie(EnumC1330i1 enumC1330i1, com.google.common.collect.m mVar, com.google.common.collect.m mVar2, com.google.common.collect.o oVar, char[] cArr, int i4, int i5, int i10, String str, String str2, String str3, boolean z2, boolean z10) {
        Q0 q02;
        char c3;
        int delta = delta(enumC1330i1);
        if (delta > 0 && (i5 != 1 || i4 != 1)) {
            cArr[delta] = ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK;
        }
        if (echo(enumC1330i1, mVar2) == EnumC1335j1.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c3 = '3';
        } else {
            if (enumC1330i1 == EnumC1330i1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i10 == 1 && oVar.silver.equals(str)) {
                if (delta > 0 && cArr[delta] != '2') {
                    cArr[delta] = ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK;
                }
                return true;
            }
            if (mVar.containsKey(enumC1330i1) && (q02 = (Q0) mVar.get(enumC1330i1)) != null) {
                int ordinal = q02.ordinal();
                EnumC1335j1 enumC1335j1 = EnumC1335j1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    EnumC1335j1 enumC1335j12 = EnumC1335j1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (echo(enumC1330i1, mVar2) == enumC1335j12) {
                                    return golf(enumC1330i1, cArr, str2, z2);
                                }
                                return hotel(enumC1330i1, cArr, str3, z10);
                            }
                        } else {
                            if (echo(enumC1330i1, mVar2) == enumC1335j1) {
                                return hotel(enumC1330i1, cArr, str3, z10);
                            }
                            return golf(enumC1330i1, cArr, str2, z2);
                        }
                    } else if (echo(enumC1330i1, mVar2) != enumC1335j12) {
                        return hotel(enumC1330i1, cArr, str3, z10);
                    }
                } else if (echo(enumC1330i1, mVar2) != enumC1335j1) {
                    return golf(enumC1330i1, cArr, str2, z2);
                }
                c3 = '8';
            }
            c3 = '0';
        }
        if (delta > 0 && cArr[delta] != '2') {
            cArr[delta] = c3;
            return false;
        }
        return false;
    }

    public static final int delta(EnumC1330i1 enumC1330i1) {
        if (enumC1330i1 == EnumC1330i1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC1330i1 == EnumC1330i1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC1330i1 == EnumC1330i1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        if (enumC1330i1 == EnumC1330i1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE) {
            return 4;
        }
        return -1;
    }

    public static final EnumC1335j1 echo(EnumC1330i1 enumC1330i1, com.google.common.collect.m mVar) {
        Object obj = EnumC1335j1.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = mVar.get(enumC1330i1);
        if (obj2 != null) {
            obj = obj2;
        }
        return (EnumC1335j1) obj;
    }

    public static final String foxtrot(EnumC1330i1 enumC1330i1, String str, String str2) {
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str4 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        if (!isEmpty && str.length() >= enumC1330i1.alpha()) {
            str3 = String.valueOf(str.charAt(enumC1330i1.alpha() - 1));
        } else {
            str3 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= enumC1330i1.alpha()) {
            str4 = String.valueOf(str2.charAt(enumC1330i1.alpha() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean golf(EnumC1330i1 enumC1330i1, char[] cArr, String str, boolean z2) {
        char c3;
        int delta = delta(enumC1330i1);
        boolean z10 = false;
        if (!z2) {
            c3 = '4';
        } else if (str.length() < enumC1330i1.alpha()) {
            c3 = '0';
        } else {
            char charAt = str.charAt(enumC1330i1.alpha() - 1);
            char c4 = ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK;
            if (charAt == '1') {
                z10 = true;
            }
            if (delta > 0 && cArr[delta] != '2') {
                if (charAt != '1') {
                    c4 = '6';
                }
                cArr[delta] = c4;
            }
            return z10;
        }
        if (delta > 0 && cArr[delta] != '2') {
            cArr[delta] = c3;
        }
        return false;
    }

    public static final boolean hotel(EnumC1330i1 enumC1330i1, char[] cArr, String str, boolean z2) {
        char c3;
        int delta = delta(enumC1330i1);
        boolean z10 = false;
        if (!z2) {
            c3 = '5';
        } else if (str.length() < enumC1330i1.alpha()) {
            c3 = '0';
        } else {
            char charAt = str.charAt(enumC1330i1.alpha() - 1);
            char c4 = ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK;
            if (charAt == '1') {
                z10 = true;
            }
            if (delta > 0 && cArr[delta] != '2') {
                if (charAt != '1') {
                    c4 = '7';
                }
                cArr[delta] = c4;
            }
            return z10;
        }
        if (delta > 0 && cArr[delta] != '2') {
            cArr[delta] = c3;
        }
        return false;
    }
}
