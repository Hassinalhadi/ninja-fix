package com.checkout.components.kmp.rememberme.utils;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "", com.clevertap.android.sdk.Constants.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "BLANK_CLIENT_TOKEN", "OTP_INCORRECT_CODE", "OTP_MAX_RETRIES_REACHED", "OTP_EXPIRED", "UNKNOWN", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorCode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;

    @NotNull
    private final String message;
    public static final ErrorCode BLANK_CLIENT_TOKEN = new ErrorCode("BLANK_CLIENT_TOKEN", 0, "Client token is null or blank");
    public static final ErrorCode OTP_INCORRECT_CODE = new ErrorCode("OTP_INCORRECT_CODE", 1, "Incorrect verification code. Try again.");
    public static final ErrorCode OTP_MAX_RETRIES_REACHED = new ErrorCode("OTP_MAX_RETRIES_REACHED", 2, "Max retries reached.");
    public static final ErrorCode OTP_EXPIRED = new ErrorCode("OTP_EXPIRED", 3, "The code has expired. Request a new one.");
    public static final ErrorCode UNKNOWN = new ErrorCode("UNKNOWN", 4, "An unknown error occurred. Please try again later.");

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{BLANK_CLIENT_TOKEN, OTP_INCORRECT_CODE, OTP_MAX_RETRIES_REACHED, OTP_EXPIRED, UNKNOWN};
    }

    static {
        ErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private ErrorCode(String str, int i4, String str2) {
        this.message = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
