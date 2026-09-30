package com.checkout.components.card.utils.constants;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"EXPIRY_DATE_MAXIMUM_LENGTH_FOUR", "", "EXPIRY_DATE_MAXIMUM_LENGTH_THREE", "EXPIRY_DATE_PREFIX_ZERO", "", "EXPIRY_DATE_PREFIX_ZERO_VALUE", "EXPIRY_DATE_ZERO_POSITION_CHECK", "", "EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK", "EXPIRY_DATE_SEPARATOR", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpiryDateConstantsKt {
    public static final int EXPIRY_DATE_MAXIMUM_LENGTH_FOUR = 4;
    public static final int EXPIRY_DATE_MAXIMUM_LENGTH_THREE = 3;

    @NotNull
    public static final String EXPIRY_DATE_PREFIX_ZERO = "0";
    public static final int EXPIRY_DATE_PREFIX_ZERO_VALUE = 0;

    @NotNull
    public static final String EXPIRY_DATE_SEPARATOR = " / ";
    public static final char EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK = '2';
    public static final char EXPIRY_DATE_ZERO_POSITION_CHECK = '1';
}
