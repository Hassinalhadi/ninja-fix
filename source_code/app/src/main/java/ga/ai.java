package ga;

import androidx.lifecycle.az;
import com.app.network.network.models.FintechAccount;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import io.reactivex.Single;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ai extends Pd.i implements Xd.l {
    public final /* synthetic */ MyAccountViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(MyAccountViewModel myAccountViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = myAccountViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ai(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        MyAccountViewModel myAccountViewModel = this.alpha;
        Single<List<FintechAccount>> lima = myAccountViewModel.alpha.lima();
        az azVar = this.purple;
        lima.subscribe(new X9.f(19, new Fb.j(azVar, 25)), new X9.f(20, new ag(azVar, myAccountViewModel, 1)));
        return Unit.INSTANCE;
    }
}
