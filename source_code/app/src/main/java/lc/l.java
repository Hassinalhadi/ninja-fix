package lc;

import com.app.network.network.models.points.PointsVaultResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.points.presentation.PointsViewModel;
import jc.C1958a;
import kc.InterfaceC2031a;
import kotlin.ResultKt;
import kotlin.Unit;
import r3.C2492a;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ PointsViewModel purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PointsViewModel pointsViewModel, Nd.c cVar) {
        super(2, cVar);
        this.purple = pointsViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L29;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        PointsViewModel pointsViewModel = this.purple;
        N n5 = pointsViewModel.bravo;
        try {
        } catch (Exception e) {
            String onHandleError = pointsViewModel.onHandleError(e);
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
                c2492a.charlie = (PointsVaultResponse) obj;
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
        InterfaceC2031a interfaceC2031a = pointsViewModel.alpha;
        this.alpha = 2;
        obj = ((C1958a) interfaceC2031a).alpha.blue(this);
        if (obj == aVar) {
            return aVar;
        }
        C2492a c2492a3 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
        c2492a3.charlie = (PointsVaultResponse) obj;
        this.alpha = 3;
        n5.getClass();
        n5.juliet(null, c2492a3);
    }
}
