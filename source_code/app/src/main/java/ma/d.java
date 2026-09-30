package ma;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.SignedAppAgreement;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import gc.C1766d;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class d extends i implements l {
    public final /* synthetic */ AgreementViewModel alpha;
    public final /* synthetic */ Integer purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AgreementViewModel agreementViewModel, Integer num, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = agreementViewModel;
        this.purple = num;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AgreementViewModel agreementViewModel = this.alpha;
        Single<DataResponse<SignedAppAgreement>> oscar = agreementViewModel.alpha.oscar(this.purple);
        az azVar = this.red;
        oscar.subscribe(new C1766d(3, new C2109a(azVar, 1)), new C1766d(4, new b(azVar, agreementViewModel, 1)));
        return Unit.INSTANCE;
    }
}
