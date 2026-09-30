package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/app/network/network/models/TaskRank;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "PICKUP", "DROP", "END", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskRank {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskRank[] $VALUES;
    public static final TaskRank STARTED = new TaskRank("STARTED", 0);
    public static final TaskRank PICKUP = new TaskRank("PICKUP", 1);
    public static final TaskRank DROP = new TaskRank("DROP", 2);
    public static final TaskRank END = new TaskRank("END", 3);

    private static final /* synthetic */ TaskRank[] $values() {
        return new TaskRank[]{STARTED, PICKUP, DROP, END};
    }

    static {
        TaskRank[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private TaskRank(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TaskRank valueOf(String str) {
        return (TaskRank) Enum.valueOf(TaskRank.class, str);
    }

    public static TaskRank[] values() {
        return (TaskRank[]) $VALUES.clone();
    }
}
