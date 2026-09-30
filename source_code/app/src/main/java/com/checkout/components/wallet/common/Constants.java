package com.checkout.components.wallet.common;

import kotlin.Metadata;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/wallet/common/Constants;", "", "", "GOOGLE_API_VERSION", "I", "GOOGLE_API_VERSION_MINOR", "Lkotlin/text/Regex;", "a", "Lkotlin/text/Regex;", "getTOTAL_PRICE_REGEX$wallet_standardRelease", "()Lkotlin/text/Regex;", "TOTAL_PRICE_REGEX", "", "DECIMAL_FORMAT_PATTERN", "Ljava/lang/String;", "TWO_DECIMAL_DIVISOR", "THREE_DECIMAL_DIVISOR", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {
    public static final String DECIMAL_FORMAT_PATTERN = "0.00";
    public static final int GOOGLE_API_VERSION = 2;
    public static final int GOOGLE_API_VERSION_MINOR = 0;
    public static final int THREE_DECIMAL_DIVISOR = 1000;
    public static final int TWO_DECIMAL_DIVISOR = 100;
    public static final Constants INSTANCE = new Constants();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Regex TOTAL_PRICE_REGEX = new Regex("^[0-9]*(\\.[0-9][0-9]?)?$");
    public static final int $stable = 8;

    private Constants() {
    }

    public final Regex getTOTAL_PRICE_REGEX$wallet_standardRelease() {
        return TOTAL_PRICE_REGEX;
    }
}
