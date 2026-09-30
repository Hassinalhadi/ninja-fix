package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/app/network/network/models/UserIdentityStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INITIATED", "APPROVED", "REJECTED", "FAILED", "EXPIRED", "UNKNOWN", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserIdentityStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserIdentityStatus[] $VALUES;
    public static final UserIdentityStatus INITIATED = new UserIdentityStatus("INITIATED", 0);
    public static final UserIdentityStatus APPROVED = new UserIdentityStatus("APPROVED", 1);
    public static final UserIdentityStatus REJECTED = new UserIdentityStatus("REJECTED", 2);
    public static final UserIdentityStatus FAILED = new UserIdentityStatus("FAILED", 3);
    public static final UserIdentityStatus EXPIRED = new UserIdentityStatus("EXPIRED", 4);
    public static final UserIdentityStatus UNKNOWN = new UserIdentityStatus("UNKNOWN", 5);

    private static final /* synthetic */ UserIdentityStatus[] $values() {
        return new UserIdentityStatus[]{INITIATED, APPROVED, REJECTED, FAILED, EXPIRED, UNKNOWN};
    }

    static {
        UserIdentityStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private UserIdentityStatus(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UserIdentityStatus valueOf(String str) {
        return (UserIdentityStatus) Enum.valueOf(UserIdentityStatus.class, str);
    }

    public static UserIdentityStatus[] values() {
        return (UserIdentityStatus[]) $VALUES.clone();
    }
}
