package ma;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.agreement.SignAppAgreementRequest;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import gc.C1766d;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;
import vf.ab;

/* loaded from: classes2.dex */
public final class f extends i implements l {
    public final /* synthetic */ AgreementViewModel alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ SignAppAgreementRequest red;
    public final /* synthetic */ az silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AgreementViewModel agreementViewModel, long j5, SignAppAgreementRequest signAppAgreementRequest, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = agreementViewModel;
        this.purple = j5;
        this.red = signAppAgreementRequest;
        this.silver = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AgreementViewModel agreementViewModel = this.alpha;
        Single<ResponseBody> jade = agreementViewModel.alpha.jade(this.purple, this.red);
        az azVar = this.silver;
        jade.subscribe(new C1766d(7, new C2109a(azVar, 3)), new C1766d(8, new b(azVar, agreementViewModel, 3)));
        return Unit.INSTANCE;
    }
}
