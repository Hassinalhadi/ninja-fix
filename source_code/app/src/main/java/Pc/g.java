package Pc;

import com.app.network.network.models.tickets.TicketStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TicketStatus.values().length];
        try {
            iArr[TicketStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TicketStatus.ASSIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TicketStatus.RE_OPENED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TicketStatus.RESOLVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TicketStatus.CLOSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TicketStatus.CANCELED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
