package com.checkout.components.kmp.rememberme.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/Constants;", "", "<init>", "()V", "EMBOLDEN_PLACEHOLDER", "", "OTP_CODE_EMPTY", "", "OTP_CODE_LENGTH", "OTP_COUNT_DOWN_SECONDS", "DEFAULT_OTP_CODES", "", "getDEFAULT_OTP_CODES", "()Ljava/util/List;", "EMAIL_REGEX", "OTP_TEXT_FIELD_HEIGHT", "OTP_TEXT_FIELD_MIN_WIDTH", "OTP_TEXT_FIELD_MAX_WIDTH", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {
    public static final int $stable;

    @NotNull
    private static final List<Integer> DEFAULT_OTP_CODES;

    @NotNull
    public static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

    @NotNull
    public static final String EMBOLDEN_PLACEHOLDER = "%s";

    @NotNull
    public static final Constants INSTANCE = new Constants();
    public static final int OTP_CODE_EMPTY = -1;
    public static final int OTP_CODE_LENGTH = 6;
    public static final int OTP_COUNT_DOWN_SECONDS = 60;
    public static final int OTP_TEXT_FIELD_HEIGHT = 48;
    public static final int OTP_TEXT_FIELD_MAX_WIDTH = 48;
    public static final int OTP_TEXT_FIELD_MIN_WIDTH = 12;

    static {
        ArrayList arrayList = new ArrayList(6);
        for (int i4 = 0; i4 < 6; i4++) {
            arrayList.add(-1);
        }
        DEFAULT_OTP_CODES = arrayList;
        $stable = 8;
    }

    private Constants() {
    }

    @NotNull
    public final List<Integer> getDEFAULT_OTP_CODES() {
        return DEFAULT_OTP_CODES;
    }
}
