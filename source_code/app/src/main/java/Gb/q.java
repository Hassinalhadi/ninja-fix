package Gb;

import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class q extends Pd.i implements Xd.l {
    public final /* synthetic */ String alpha;
    public final /* synthetic */ EnvelopsViewModelV2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Nd.c cVar, EnvelopsViewModelV2 envelopsViewModelV2, String str) {
        super(2, cVar);
        this.alpha = str;
        this.purple = envelopsViewModelV2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new q(cVar, this.purple, this.alpha);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Single<DataResponse<EnvelopNotification>> fuchsia;
        int i4 = 0;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        EnvelopsViewModelV2 envelopsViewModelV2 = this.purple;
        String str = this.alpha;
        if (str == null) {
            fuchsia = envelopsViewModelV2.alpha.sierra(0);
        } else {
            fuchsia = envelopsViewModelV2.alpha.fuchsia(0, str);
        }
        fuchsia.subscribe(new Fb.k(17, new p(envelopsViewModelV2, i4)), new Fb.k(18, new p(envelopsViewModelV2, 1)));
        return Unit.INSTANCE;
    }
}
