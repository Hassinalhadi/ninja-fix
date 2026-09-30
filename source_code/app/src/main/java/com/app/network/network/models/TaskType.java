package com.app.network.network.models;

import Qd.a;
import delivery.samurai.android.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/network/network/models/TaskType;", "", "stringRes", "", "<init>", "(Ljava/lang/String;II)V", "getStringRes", "()I", "START", "PICK_UP", "DELIVERY", "DELIVERED", "RETURNING", "ON_DEMAND_PICK_UP", "RETURN_TO_AREA", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskType[] $VALUES;
    private final int stringRes;
    public static final TaskType START = new TaskType("START", 0, R.string.start_pickup);
    public static final TaskType PICK_UP = new TaskType("PICK_UP", 1, R.string.pick_up);
    public static final TaskType DELIVERY = new TaskType("DELIVERY", 2, R.string.delivery);
    public static final TaskType DELIVERED = new TaskType("DELIVERED", 3, R.string.order_delivered);
    public static final TaskType RETURNING = new TaskType("RETURNING", 4, R.string.returning);
    public static final TaskType ON_DEMAND_PICK_UP = new TaskType("ON_DEMAND_PICK_UP", 5, R.string.pick_up);
    public static final TaskType RETURN_TO_AREA = new TaskType("RETURN_TO_AREA", 6, R.string.return_to_area);

    private static final /* synthetic */ TaskType[] $values() {
        return new TaskType[]{START, PICK_UP, DELIVERY, DELIVERED, RETURNING, ON_DEMAND_PICK_UP, RETURN_TO_AREA};
    }

    static {
        TaskType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private TaskType(String str, int i4, int i5) {
        this.stringRes = i5;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TaskType valueOf(String str) {
        return (TaskType) Enum.valueOf(TaskType.class, str);
    }

    public static TaskType[] values() {
        return (TaskType[]) $VALUES.clone();
    }

    public final int getStringRes() {
        return this.stringRes;
    }
}
