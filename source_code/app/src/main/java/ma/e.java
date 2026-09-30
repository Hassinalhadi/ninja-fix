package ma;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.AppAgreementSignatureOwnerTypeEnum;
import com.app.network.network.models.AppAgreementTypeEnum;
import com.app.network.network.models.agreement.AppAgreement;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import gc.C1766d;
import io.reactivex.Single;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class e extends i implements l {
    public final /* synthetic */ AppAgreementTypeEnum alpha;
    public final /* synthetic */ AgreementViewModel purple;
    public final /* synthetic */ AppAgreementSignatureOwnerTypeEnum red;
    public final /* synthetic */ Long silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppAgreementTypeEnum appAgreementTypeEnum, AgreementViewModel agreementViewModel, AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum, Long l10, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = appAgreementTypeEnum;
        this.purple = agreementViewModel;
        this.red = appAgreementSignatureOwnerTypeEnum;
        this.silver = l10;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.alpha, this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum;
        Long l10;
        Single<List<AppAgreement>> black;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AppAgreementTypeEnum appAgreementTypeEnum = AppAgreementTypeEnum.ONE_SHOT;
        AgreementViewModel agreementViewModel = this.purple;
        AppAgreementTypeEnum appAgreementTypeEnum2 = this.alpha;
        if (appAgreementTypeEnum2 == appAgreementTypeEnum) {
            black = agreementViewModel.alpha.black(appAgreementTypeEnum2, null, null);
        } else if (appAgreementTypeEnum2 == AppAgreementTypeEnum.ON_SHIFT_JOIN && (appAgreementSignatureOwnerTypeEnum = this.red) != null && (l10 = this.silver) != null) {
            black = agreementViewModel.alpha.black(appAgreementTypeEnum2, appAgreementSignatureOwnerTypeEnum, l10);
        } else {
            throw new IllegalArgumentException("Invalid parameters for getUnsignedAgreements");
        }
        az azVar = this.teal;
        black.subscribe(new C1766d(5, new C2109a(azVar, 2)), new C1766d(6, new b(azVar, agreementViewModel, 2)));
        return Unit.INSTANCE;
    }
}
