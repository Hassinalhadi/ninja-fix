package com.incognia.internal;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;

/* loaded from: classes2.dex */
public abstract class MJK {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9112b = (String) wGk.je7.getValue();

    public static String b(int i4, String str) {
        int length = str.toCharArray().length;
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            i5 += (r6[i10] - '0') * i4;
            i4--;
            if (i4 < 2) {
                i4 = 9;
            }
        }
        int i11 = i5 % 11;
        if (i11 < 2) {
            return ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        }
        return String.valueOf(11 - i11);
    }
}
