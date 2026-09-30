package Nc;

import com.app.network.network.models.tickets.TicketCommentResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import r3.C2492a;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ TicketDetailsViewModel purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ List teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TicketDetailsViewModel ticketDetailsViewModel, String str, String str2, List list, Nd.c cVar) {
        super(2, cVar);
        this.purple = ticketDetailsViewModel;
        this.red = str;
        this.silver = str2;
        this.teal = list;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L29;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        TicketDetailsViewModel ticketDetailsViewModel = this.purple;
        N n5 = ticketDetailsViewModel.delta;
        try {
        } catch (Exception e) {
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
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (TicketCommentResponse) obj;
                this.alpha = 3;
                n5.getClass();
                n5.juliet(null, c2492a);
            } else {
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            C2492a c2492a2 = new C2492a(2, "loading");
            this.alpha = 1;
            n5.getClass();
            n5.juliet(null, c2492a2);
        }
        Mc.a aVar2 = ticketDetailsViewModel.alpha;
        String str = this.red;
        String str2 = this.silver;
        List list = this.teal;
        this.alpha = 2;
        obj = ((Lc.a) aVar2).alpha(str, str2, list, this);
        if (obj == aVar) {
            return aVar;
        }
        C2492a c2492a3 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
        c2492a3.charlie = (TicketCommentResponse) obj;
        this.alpha = 3;
        n5.getClass();
        n5.juliet(null, c2492a3);
    }
}
