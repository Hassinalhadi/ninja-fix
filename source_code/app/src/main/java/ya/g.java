package ya;

import Xd.l;
import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.AbstractC3428A;
import yf.L;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ StartWorkFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StartWorkFragment startWorkFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = startWorkFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            StartWorkFragment startWorkFragment = this.purple;
            L signUpRequest = startWorkFragment.romeo().getSignUpRequest();
            f fVar = new f(startWorkFragment, null);
            this.alpha = 1;
            if (AbstractC3428A.kilo(signUpRequest, fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
