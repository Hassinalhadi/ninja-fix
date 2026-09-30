package ga;

import androidx.lifecycle.az;
import com.app.network.network.models.NaqlBlockedReason;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class aj extends Pd.i implements Xd.l {
    public final /* synthetic */ MyAccountViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(MyAccountViewModel myAccountViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = myAccountViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aj(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aj) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        MyAccountViewModel myAccountViewModel = this.alpha;
        Single<NaqlBlockedReason> beige = myAccountViewModel.alpha.beige();
        az azVar = this.purple;
        beige.subscribe(new X9.f(21, new Fb.j(azVar, 26)), new X9.f(22, new ag(azVar, myAccountViewModel, 2)));
        return Unit.INSTANCE;
    }
}
