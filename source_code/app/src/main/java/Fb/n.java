package Fb;

import androidx.lifecycle.az;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.envelop.EnvelopsViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.l {
    public final /* synthetic */ EnvelopsViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(EnvelopsViewModel envelopsViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = envelopsViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        EnvelopsViewModel envelopsViewModel = this.alpha;
        Single<DataResponse<EnvelopNotification>> sierra = envelopsViewModel.alpha.sierra(0);
        az azVar = this.purple;
        sierra.subscribe(new k(2, new j(azVar, 1)), new k(3, new l(azVar, envelopsViewModel, 1)));
        return Unit.INSTANCE;
    }
}
