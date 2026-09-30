package nc;

import Pd.i;
import Xd.l;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import delivery.samurai.android.ui.redeem.presentation.RedeemViewModel;
import jc.C1958a;
import kc.InterfaceC2031a;
import kotlin.ResultKt;
import kotlin.Unit;
import r3.C2492a;
import vf.ab;
import yf.N;

/* renamed from: nc.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2173f extends i implements l {
    public int alpha;
    public final /* synthetic */ RedeemViewModel purple;
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2173f(RedeemViewModel redeemViewModel, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = redeemViewModel;
        this.red = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2173f(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2173f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L29;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        RedeemViewModel redeemViewModel = this.purple;
        try {
        } catch (Exception e) {
            N n5 = redeemViewModel.bravo;
            String onHandleError = redeemViewModel.onHandleError(e);
            C2492a november = j.november(0, onHandleError, Constants.KEY_MSG, onHandleError);
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
                N n10 = redeemViewModel.bravo;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (DataResponse) obj;
                this.alpha = 3;
                n10.getClass();
                n10.juliet(null, c2492a);
            } else {
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            N n11 = redeemViewModel.bravo;
            C2492a c2492a2 = new C2492a(2, "loading");
            this.alpha = 1;
            n11.getClass();
            n11.juliet(null, c2492a2);
        }
        InterfaceC2031a interfaceC2031a = redeemViewModel.alpha;
        int i5 = this.red;
        this.alpha = 2;
        obj = ((C1958a) interfaceC2031a).alpha.azure(i5, 20, this);
        if (obj == aVar) {
            return aVar;
        }
        N n102 = redeemViewModel.bravo;
        C2492a c2492a3 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
        c2492a3.charlie = (DataResponse) obj;
        this.alpha = 3;
        n102.getClass();
        n102.juliet(null, c2492a3);
    }
}
