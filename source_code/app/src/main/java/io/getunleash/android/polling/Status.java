package io.getunleash.android.polling;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, d2 = {"Lio/getunleash/android/polling/Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "NOT_MODIFIED", "FAILED", "THROTTLED", "isSuccess", "", "isNotModified", "isFailed", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Status {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status SUCCESS = new Status("SUCCESS", 0);
    public static final Status NOT_MODIFIED = new Status("NOT_MODIFIED", 1);
    public static final Status FAILED = new Status("FAILED", 2);
    public static final Status THROTTLED = new Status("THROTTLED", 3);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{SUCCESS, NOT_MODIFIED, FAILED, THROTTLED};
    }

    static {
        Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private Status(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }

    public final boolean isFailed() {
        if (this != FAILED && this != THROTTLED) {
            return false;
        }
        return true;
    }

    public final boolean isNotModified() {
        if (this == NOT_MODIFIED) {
            return true;
        }
        return false;
    }

    public final boolean isSuccess() {
        if (this == SUCCESS) {
            return true;
        }
        return false;
    }
}
