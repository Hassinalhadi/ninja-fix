package i3;

import com.app.network.network.models.tickets.TicketStatus;

/* renamed from: i3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1891d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TicketStatus.values().length];
        try {
            iArr[TicketStatus.CANCELED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TicketStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TicketStatus.RE_OPENED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TicketStatus.ASSIGNED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TicketStatus.RESOLVED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TicketStatus.CLOSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
