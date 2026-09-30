package ga;

import androidx.lifecycle.az;
import com.app.network.network.models.CaptainQrResponse;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ah extends Pd.i implements Xd.l {
    public final /* synthetic */ MyAccountViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(MyAccountViewModel myAccountViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = myAccountViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ah(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ah) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        MyAccountViewModel myAccountViewModel = this.alpha;
        Single<CaptainQrResponse> victor = myAccountViewModel.alpha.victor();
        az azVar = this.purple;
        victor.subscribe(new X9.f(17, new Fb.j(azVar, 24)), new X9.f(18, new ag(azVar, myAccountViewModel, 0)));
        return Unit.INSTANCE;
    }
}
