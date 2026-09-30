package Fc;

import androidx.lifecycle.az;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import t3.InterfaceC2956a;

/* loaded from: classes2.dex */
public final class r extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ AuthViewModel purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ az silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AuthViewModel authViewModel, int i4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = authViewModel;
        this.red = i4;
        this.silver = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new r(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
                Result.Companion companion = Result.INSTANCE;
                InterfaceC2956a access$getAuthService$p = AuthViewModel.access$getAuthService$p(authViewModel);
                this.alpha = 1;
                obj = access$getAuthService$p.november(i5, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        boolean z2 = m206constructorimpl instanceof kotlin.k;
        az azVar = this.silver;
        if (!z2) {
            C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
            c2492a.charlie = (List) m206constructorimpl;
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
