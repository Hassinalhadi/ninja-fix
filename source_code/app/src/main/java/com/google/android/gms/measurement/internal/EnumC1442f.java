package com.google.android.gms.measurement.internal;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;

/* renamed from: com.google.android.gms.measurement.internal.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1442f {
    UNSET('0'),
    REMOTE_DEFAULT(ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK),
    REMOTE_DELEGATION(ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    /* JADX INFO: Fake field, exist only in values array */
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    public final char alpha;

    EnumC1442f(char c3) {
        this.alpha = c3;
    }
}
