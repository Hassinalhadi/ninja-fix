package Nc;

import androidx.lifecycle.T;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import vf.ad;
import yf.AbstractC3428A;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ TicketDetailsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TicketDetailsFragment ticketDetailsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = ticketDetailsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            TicketDetailsFragment ticketDetailsFragment = this.purple;
            TicketDetailsViewModel romeo = ticketDetailsFragment.romeo();
            String ticketId = String.valueOf(ticketDetailsFragment.f12512h);
            String message = ticketDetailsFragment.quebec().f111l.getText().toString();
            List attachments = ticketDetailsFragment.f12514j;
            Intrinsics.echo(ticketId, "ticketId");
            Intrinsics.echo(message, "message");
            Intrinsics.echo(attachments, "attachments");
            ad.zulu(T.hotel(romeo), null, null, new k(romeo, ticketId, message, attachments, null), 3);
            TicketDetailsViewModel romeo2 = ticketDetailsFragment.romeo();
            e eVar = new e(ticketDetailsFragment, null);
            this.alpha = 1;
            if (AbstractC3428A.kilo(romeo2.echo, eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
