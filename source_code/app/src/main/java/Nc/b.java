package Nc;

import B9.E;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TicketDetailsFragment purple;

    public /* synthetic */ b(TicketDetailsFragment ticketDetailsFragment, int i4) {
        this.alpha = i4;
        this.purple = ticketDetailsFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.quebec().f111l.requestFocus();
                return;
            case 1:
                TicketDetailsFragment ticketDetailsFragment = this.purple;
                E quebec = ticketDetailsFragment.quebec();
                quebec.f112m.post(new b(ticketDetailsFragment, 2));
                return;
            case 2:
                TicketDetailsFragment ticketDetailsFragment2 = this.purple;
                E quebec2 = ticketDetailsFragment2.quebec();
                quebec2.f112m.post(new b(ticketDetailsFragment2, 3));
                return;
            case 3:
                TicketDetailsFragment ticketDetailsFragment3 = this.purple;
                ticketDetailsFragment3.quebec().f112m.foxtrot(130);
                ticketDetailsFragment3.f12516l = false;
                return;
            case 4:
                TicketDetailsFragment ticketDetailsFragment4 = this.purple;
                E quebec3 = ticketDetailsFragment4.quebec();
                quebec3.f115p.post(new b(ticketDetailsFragment4, 5));
                return;
            case 5:
                TicketDetailsFragment ticketDetailsFragment5 = this.purple;
                E quebec4 = ticketDetailsFragment5.quebec();
                quebec4.f115p.post(new b(ticketDetailsFragment5, 1));
                return;
            default:
                this.purple.quebec().f112m.foxtrot(130);
                return;
        }
    }
}
