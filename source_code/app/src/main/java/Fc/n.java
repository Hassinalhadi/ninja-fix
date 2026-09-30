package Fc;

import androidx.lifecycle.az;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import t3.InterfaceC2956a;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ AuthViewModel purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AuthViewModel authViewModel, int i4, int i5, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = authViewModel;
        this.red = i4;
        this.silver = i5;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        AuthViewModel authViewModel = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                int i5 = this.red;
                int i10 = this.silver;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC2956a access$getAuthService$p = AuthViewModel.access$getAuthService$p(authViewModel);
                this.alpha = 1;
                obj = access$getAuthService$p.delta(i5, i10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl((DataResponse) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        boolean z2 = m206constructorimpl instanceof kotlin.k;
        az azVar = this.teal;
        if (!z2) {
            C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
            c2492a.charlie = (DataResponse) m206constructorimpl;
            azVar.postValue(c2492a);
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null) {
            String msg = authViewModel.onHandleError(m207exceptionOrNullimpl);
            Intrinsics.echo(msg, "msg");
            azVar.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
