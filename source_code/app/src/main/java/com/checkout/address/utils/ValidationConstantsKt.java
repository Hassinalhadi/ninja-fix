package com.checkout.address.utils;

import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0014\u0010\n\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "MAX_ADDRESS_LINE_LENGTH", "I", "MAX_NAME_LENGTH", "MAX_EMAIL_LENGTH", "MAX_PHONE_LENGTH", "MAX_CITY_STATE_ZIP_LENGTH", "MIN_NUMBER_ONLY_ZIP_FORMAT_ONE_LENGTH", "MIN_NUMBER_ONLY_ZIP_FORMAT_TWO_LENGTH", "MAX_NUMBER_ONLY_ZIP_LENGTH", "MIN_PHONE_LENGTH", "Lkotlin/text/Regex;", "a", "Lkotlin/text/Regex;", "getPHONE_REGEX", "()Lkotlin/text/Regex;", "PHONE_REGEX", "address_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidationConstantsKt {
    public static final int MAX_ADDRESS_LINE_LENGTH = 200;
    public static final int MAX_CITY_STATE_ZIP_LENGTH = 50;
    public static final int MAX_EMAIL_LENGTH = 255;
    public static final int MAX_NAME_LENGTH = 300;
    public static final int MAX_NUMBER_ONLY_ZIP_LENGTH = 9;
    public static final int MAX_PHONE_LENGTH = 25;
    public static final int MIN_NUMBER_ONLY_ZIP_FORMAT_ONE_LENGTH = 5;
    public static final int MIN_NUMBER_ONLY_ZIP_FORMAT_TWO_LENGTH = 9;
    public static final int MIN_PHONE_LENGTH = 6;

    /* renamed from: a, reason: collision with root package name */
    private static final Regex f3838a = new Regex("^[0-9]{6,25}$");

    @NotNull
    public static final Regex getPHONE_REGEX() {
        return f3838a;
    }
}
