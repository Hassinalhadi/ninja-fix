package Pc;

import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.tickets.TicketResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.Q6;
import s6.R6;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TicketResponse purple;
    public final /* synthetic */ Function0 red;

    public /* synthetic */ b(TicketResponse ticketResponse, Function0 function0, int i4, int i5) {
        this.alpha = i5;
        this.purple = ticketResponse;
        this.red = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                Q6.alpha(this.purple, this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                R6.alpha(this.purple, this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }
}
