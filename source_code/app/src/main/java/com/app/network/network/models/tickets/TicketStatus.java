package com.app.network.network.models.tickets;

import P8.c;
import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/app/network/network/models/tickets/TicketStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "RE_OPENED", "ASSIGNED", "RESOLVED", "CLOSED", "CANCELED", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TicketStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TicketStatus[] $VALUES;

    @c("PENDING")
    public static final TicketStatus PENDING = new TicketStatus("PENDING", 0);

    @c("RE_OPENED")
    public static final TicketStatus RE_OPENED = new TicketStatus("RE_OPENED", 1);

    @c("ASSIGNED")
    public static final TicketStatus ASSIGNED = new TicketStatus("ASSIGNED", 2);

    @c("RESOLVED")
    public static final TicketStatus RESOLVED = new TicketStatus("RESOLVED", 3);

    @c("CLOSED")
    public static final TicketStatus CLOSED = new TicketStatus("CLOSED", 4);

    @c("CANCELED")
    public static final TicketStatus CANCELED = new TicketStatus("CANCELED", 5);

    private static final /* synthetic */ TicketStatus[] $values() {
        return new TicketStatus[]{PENDING, RE_OPENED, ASSIGNED, RESOLVED, CLOSED, CANCELED};
    }

    static {
        TicketStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private TicketStatus(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TicketStatus valueOf(String str) {
        return (TicketStatus) Enum.valueOf(TicketStatus.class, str);
    }

    public static TicketStatus[] values() {
        return (TicketStatus[]) $VALUES.clone();
    }
}
