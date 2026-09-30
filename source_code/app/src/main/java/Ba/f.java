package Ba;

import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.L;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ AboutYouFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AboutYouFragment aboutYouFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = aboutYouFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            AboutYouFragment aboutYouFragment = this.purple;
            L signUpRequest = aboutYouFragment.sierra().getSignUpRequest();
            e eVar = new e(0, aboutYouFragment);
            this.alpha = 1;
            if (signUpRequest.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
