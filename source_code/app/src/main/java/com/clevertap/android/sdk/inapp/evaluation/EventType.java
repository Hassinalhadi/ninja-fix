package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/EventType;", "", Constants.KEY_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "PROFILE", "RAISED", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventType {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final EventType PROFILE = new EventType("PROFILE", 0, Constants.PROFILE);
    public static final EventType RAISED = new EventType("RAISED", 1, Constants.RAISED);

    @NotNull
    private final String key;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/EventType$Companion;", "", "<init>", "()V", "fromBoolean", "Lcom/clevertap/android/sdk/inapp/evaluation/EventType;", "isProfile", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EventType fromBoolean(boolean isProfile) {
            if (isProfile) {
                return EventType.PROFILE;
            }
            return EventType.RAISED;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{PROFILE, RAISED};
    }

    static {
        EventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private EventType(String str, int i4, String str2) {
        this.key = str2;
    }

    @NotNull
    public static Qd.a getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
