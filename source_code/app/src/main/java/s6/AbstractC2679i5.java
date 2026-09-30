package s6;

import android.widget.TextView;
import com.app.network.network.models.tickets.TicketStatus;
import delivery.samurai.android.R;
import i3.AbstractC1891d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.i5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2679i5 {
    public static final int alpha(H0.v vVar, int i4) {
        boolean z2;
        boolean z10;
        if (vVar.compareTo(H0.v.silver) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        if (!z10) {
            return 0;
        }
        return 2;
    }

    public static final void bravo(TextView textView, TicketStatus ticketStatus) {
        int i4;
        Intrinsics.echo(textView, "<this>");
        if (ticketStatus == null) {
            textView.setVisibility(8);
            textView.setText("");
            return;
        }
        int[] iArr = AbstractC1891d.$EnumSwitchMapping$0;
        if (iArr[ticketStatus.ordinal()] == 1) {
            textView.setVisibility(8);
            textView.setText("");
            return;
        }
        textView.setVisibility(0);
        switch (iArr[ticketStatus.ordinal()]) {
            case 1:
                return;
            case 2:
                i4 = R.string.ticket_status_pending;
                break;
            case 3:
                i4 = R.string.ticket_status_re_opened;
                break;
            case 4:
                i4 = R.string.ticket_status_assigned;
                break;
            case 5:
                i4 = R.string.ticket_status_resolved;
                break;
            case 6:
                i4 = R.string.ticket_status_closed;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        textView.setText(textView.getContext().getString(i4));
    }
}
