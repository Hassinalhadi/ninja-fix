package Sc;

import Cb.ad;
import Jb.I;
import androidx.lifecycle.az;
import com.app.network.network.models.TransferCard;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.transfer.TransferCardViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public final /* synthetic */ TransferCardViewModel alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransferCardViewModel transferCardViewModel, int i4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = transferCardViewModel;
        this.purple = i4;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        TransferCardViewModel transferCardViewModel = this.alpha;
        Single<DataResponse<TransferCard>> indigo = transferCardViewModel.alpha.indigo(new Integer(this.purple));
        az azVar = this.red;
        indigo.subscribe(new I(17, new Fb.j(azVar, 13)), new I(18, new ad(18, azVar, transferCardViewModel)));
        return Unit.INSTANCE;
    }
}
