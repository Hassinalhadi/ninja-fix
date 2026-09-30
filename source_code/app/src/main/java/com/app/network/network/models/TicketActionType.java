package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/app/network/network/models/TicketActionType;", "", "<init>", "(Ljava/lang/String;I)V", "NOTIFY", "COMMENT", "CALL", "DEEP_LINK", "Companion", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TicketActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TicketActionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final TicketActionType NOTIFY = new TicketActionType("NOTIFY", 0);
    public static final TicketActionType COMMENT = new TicketActionType("COMMENT", 1);
    public static final TicketActionType CALL = new TicketActionType("CALL", 2);
    public static final TicketActionType DEEP_LINK = new TicketActionType("DEEP_LINK", 3);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/app/network/network/models/TicketActionType$Companion;", "", "<init>", "()V", "fromString", "Lcom/app/network/network/models/TicketActionType;", "value", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TicketActionType fromString(@Nullable String value) {
            for (TicketActionType ticketActionType : TicketActionType.values()) {
                if (Intrinsics.areEqual(ticketActionType.name(), value)) {
                    return ticketActionType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ TicketActionType[] $values() {
        return new TicketActionType[]{NOTIFY, COMMENT, CALL, DEEP_LINK};
    }

    static {
        TicketActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private TicketActionType(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TicketActionType valueOf(String str) {
        return (TicketActionType) Enum.valueOf(TicketActionType.class, str);
    }

    public static TicketActionType[] values() {
        return (TicketActionType[]) $VALUES.clone();
    }
}
