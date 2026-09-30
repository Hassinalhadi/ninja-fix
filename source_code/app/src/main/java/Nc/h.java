package Nc;

import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.AbstractC3428A;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ TicketDetailsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TicketDetailsFragment ticketDetailsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = ticketDetailsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            g gVar = new g(ticketDetailsFragment, null);
            this.alpha = 1;
            if (AbstractC3428A.kilo(romeo.charlie, gVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
