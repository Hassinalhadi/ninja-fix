package com.checkout.components.kmp.rememberme.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewType;", "", "<init>", "(Ljava/lang/String;I)V", "CHALLENGE", "OTP", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthenticationViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthenticationViewType[] $VALUES;
    public static final AuthenticationViewType CHALLENGE = new AuthenticationViewType("CHALLENGE", 0);
    public static final AuthenticationViewType OTP = new AuthenticationViewType("OTP", 1);

    private static final /* synthetic */ AuthenticationViewType[] $values() {
        return new AuthenticationViewType[]{CHALLENGE, OTP};
    }

    static {
        AuthenticationViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private AuthenticationViewType(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthenticationViewType valueOf(String str) {
        return (AuthenticationViewType) Enum.valueOf(AuthenticationViewType.class, str);
    }

    public static AuthenticationViewType[] values() {
        return (AuthenticationViewType[]) $VALUES.clone();
    }
}
