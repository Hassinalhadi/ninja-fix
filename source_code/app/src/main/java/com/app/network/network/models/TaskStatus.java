package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/TaskStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "STARTED", "COMPLETED", "AT_DESTINATION", "CANCELLED", "canSeeTaskDetails", "", "showTimer", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TaskStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskStatus[] $VALUES;
    public static final TaskStatus PENDING = new TaskStatus("PENDING", 0) { // from class: com.app.network.network.models.TaskStatus.PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean canSeeTaskDetails() {
            return false;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean showTimer() {
            return false;
        }
    };
    public static final TaskStatus STARTED = new TaskStatus("STARTED", 1) { // from class: com.app.network.network.models.TaskStatus.STARTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean canSeeTaskDetails() {
            return true;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean showTimer() {
            return true;
        }
    };
    public static final TaskStatus COMPLETED = new TaskStatus("COMPLETED", 2) { // from class: com.app.network.network.models.TaskStatus.COMPLETED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean canSeeTaskDetails() {
            return true;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean showTimer() {
            return false;
        }
    };
    public static final TaskStatus AT_DESTINATION = new TaskStatus("AT_DESTINATION", 3) { // from class: com.app.network.network.models.TaskStatus.AT_DESTINATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean canSeeTaskDetails() {
            return true;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean showTimer() {
            return true;
        }
    };
    public static final TaskStatus CANCELLED = new TaskStatus("CANCELLED", 4) { // from class: com.app.network.network.models.TaskStatus.CANCELLED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean canSeeTaskDetails() {
            return false;
        }

        @Override // com.app.network.network.models.TaskStatus
        public boolean showTimer() {
            return false;
        }
    };

    private static final /* synthetic */ TaskStatus[] $values() {
        return new TaskStatus[]{PENDING, STARTED, COMPLETED, AT_DESTINATION, CANCELLED};
    }

    static {
        TaskStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    public /* synthetic */ TaskStatus(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i4);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TaskStatus valueOf(String str) {
        return (TaskStatus) Enum.valueOf(TaskStatus.class, str);
    }

    public static TaskStatus[] values() {
        return (TaskStatus[]) $VALUES.clone();
    }

    public abstract boolean canSeeTaskDetails();

    public abstract boolean showTimer();

    private TaskStatus(String str, int i4) {
    }
}
