package ma;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.agreement.AppAgreement;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import gc.C1766d;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class c extends i implements l {
    public final /* synthetic */ AgreementViewModel alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AgreementViewModel agreementViewModel, long j5, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = agreementViewModel;
        this.purple = j5;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AgreementViewModel agreementViewModel = this.alpha;
        Single<AppAgreement> quebec = agreementViewModel.alpha.quebec(this.purple);
        az azVar = this.red;
        quebec.subscribe(new C1766d(1, new C2109a(azVar, 0)), new C1766d(2, new b(azVar, agreementViewModel, 0)));
        return Unit.INSTANCE;
    }
}
