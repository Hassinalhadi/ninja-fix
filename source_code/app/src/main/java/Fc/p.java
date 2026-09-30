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

/* loaded from: classes2.dex */
public final class p extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Nd.c cVar, az azVar, AuthViewModel authViewModel) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new p(cVar, this.purple, this.alpha);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        AuthViewModel authViewModel = this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(authViewModel.readNationalitiesFromAssets());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        boolean z2 = m206constructorimpl instanceof kotlin.k;
        az azVar = this.purple;
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
