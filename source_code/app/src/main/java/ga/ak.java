package ga;

import androidx.lifecycle.az;
import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.app.network.network.models.ProfileAttributesRequest;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ak extends Pd.i implements Xd.l {
    public final /* synthetic */ MyAccountViewModel alpha;
    public final /* synthetic */ ProfileAttributesRequest purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(MyAccountViewModel myAccountViewModel, ProfileAttributesRequest profileAttributesRequest, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = myAccountViewModel;
        this.purple = profileAttributesRequest;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ak(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ak) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        MyAccountViewModel myAccountViewModel = this.alpha;
        Single<CaptainProfileAttributeOtpResponse> zulu = myAccountViewModel.alpha.zulu(this.purple);
        az azVar = this.red;
        zulu.subscribe(new X9.f(23, new Fb.j(azVar, 27)), new X9.f(24, new ag(azVar, myAccountViewModel, 3)));
        return Unit.INSTANCE;
    }
}
