package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/app/network/network/models/WithdrawStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INIT", "PENDING", "ACCEPTED", "TRANSFERRED", "REJECTED", "FAILED", "PROCESSING_TRANSFER", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WithdrawStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WithdrawStatus[] $VALUES;
    public static final WithdrawStatus INIT = new WithdrawStatus("INIT", 0);
    public static final WithdrawStatus PENDING = new WithdrawStatus("PENDING", 1);
    public static final WithdrawStatus ACCEPTED = new WithdrawStatus("ACCEPTED", 2);
    public static final WithdrawStatus TRANSFERRED = new WithdrawStatus("TRANSFERRED", 3);
    public static final WithdrawStatus REJECTED = new WithdrawStatus("REJECTED", 4);
    public static final WithdrawStatus FAILED = new WithdrawStatus("FAILED", 5);
    public static final WithdrawStatus PROCESSING_TRANSFER = new WithdrawStatus("PROCESSING_TRANSFER", 6);

    private static final /* synthetic */ WithdrawStatus[] $values() {
        return new WithdrawStatus[]{INIT, PENDING, ACCEPTED, TRANSFERRED, REJECTED, FAILED, PROCESSING_TRANSFER};
    }

    static {
        WithdrawStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private WithdrawStatus(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static WithdrawStatus valueOf(String str) {
        return (WithdrawStatus) Enum.valueOf(WithdrawStatus.class, str);
    }

    public static WithdrawStatus[] values() {
        return (WithdrawStatus[]) $VALUES.clone();
    }
}
