package Nc;

import com.app.network.network.models.tickets.TicketResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import r3.C2492a;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ TicketDetailsViewModel red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z2, TicketDetailsViewModel ticketDetailsViewModel, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = z2;
        this.red = ticketDetailsViewModel;
        this.silver = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new j(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L31;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        TicketDetailsViewModel ticketDetailsViewModel = this.red;
        try {
        } catch (Exception e) {
            N n5 = ticketDetailsViewModel.bravo;
            String onHandleError = ticketDetailsViewModel.onHandleError(e);
            C2492a november = com.google.android.material.datepicker.j.november(0, onHandleError, Constants.KEY_MSG, onHandleError);
            this.alpha = 4;
            n5.getClass();
            n5.juliet(null, november);
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.alpha(obj);
                N n10 = ticketDetailsViewModel.bravo;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (TicketResponse) obj;
                this.alpha = 3;
                n10.getClass();
                n10.juliet(null, c2492a);
            } else {
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            if (this.purple) {
                N n11 = ticketDetailsViewModel.bravo;
                C2492a c2492a2 = new C2492a(2, "loading");
                this.alpha = 1;
                n11.getClass();
                n11.juliet(null, c2492a2);
            }
        }
        Mc.a aVar2 = ticketDetailsViewModel.alpha;
        int i5 = this.silver;
        this.alpha = 2;
        obj = ((Lc.a) aVar2).alpha.charlie(i5, this);
        if (obj == aVar) {
            return aVar;
        }
        N n102 = ticketDetailsViewModel.bravo;
        C2492a c2492a3 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
        c2492a3.charlie = (TicketResponse) obj;
        this.alpha = 3;
        n102.getClass();
        n102.juliet(null, c2492a3);
    }
}
