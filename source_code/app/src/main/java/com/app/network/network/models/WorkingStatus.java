package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/app/network/network/models/WorkingStatus;", "", "<init>", "(Ljava/lang/String;I)V", "FREE", "BUSY", "SUSPENDED", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkingStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WorkingStatus[] $VALUES;
    public static final WorkingStatus FREE = new WorkingStatus("FREE", 0);
    public static final WorkingStatus BUSY = new WorkingStatus("BUSY", 1);
    public static final WorkingStatus SUSPENDED = new WorkingStatus("SUSPENDED", 2);

    private static final /* synthetic */ WorkingStatus[] $values() {
        return new WorkingStatus[]{FREE, BUSY, SUSPENDED};
    }

    static {
        WorkingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private WorkingStatus(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static WorkingStatus valueOf(String str) {
        return (WorkingStatus) Enum.valueOf(WorkingStatus.class, str);
    }

    public static WorkingStatus[] values() {
        return (WorkingStatus[]) $VALUES.clone();
    }
}
