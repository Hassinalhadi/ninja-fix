package Nc;

import B9.E;
import android.text.Editable;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ TicketDetailsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TicketDetailsFragment ticketDetailsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = ticketDetailsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        e eVar = new e(this.purple, cVar);
        eVar.alpha = obj;
        return eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((C2492a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C2492a c2492a = (C2492a) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (c2492a != null) {
            num = new Integer(c2492a.alpha);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 2) {
            TicketDetailsFragment ticketDetailsFragment = this.purple;
            if (num != null && num.intValue() == 1) {
                ticketDetailsFragment.sierra();
                Editable text = ticketDetailsFragment.quebec().f111l.getText();
                if (text != null) {
                    text.clear();
                }
                E quebec = ticketDetailsFragment.quebec();
                quebec.f111l.post(new b(ticketDetailsFragment, 0));
                ticketDetailsFragment.romeo().foxtrot.postValue(new ArrayList());
                ticketDetailsFragment.romeo().alpha(ticketDetailsFragment.f12512h, false);
                ticketDetailsFragment.f12516l = true;
            } else if (num != null && num.intValue() == 0) {
                String str = c2492a.bravo;
                if (str == null) {
                    str = ticketDetailsFragment.getString(R.string.error_something_went_wrong);
                    Intrinsics.delta(str, "getString(...)");
                }
                ticketDetailsFragment.sierra();
                ticketDetailsFragment.romeo().alpha(ticketDetailsFragment.f12512h, false);
                L9.d.pink(ticketDetailsFragment.kilo(), str);
            }
        }
        return Unit.INSTANCE;
    }
}
