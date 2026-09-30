package ga;

import androidx.lifecycle.az;
import com.app.network.network.models.OtpVerificationRequest;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class am extends Pd.i implements Xd.l {
    public final /* synthetic */ MyAccountViewModel alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ az silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(MyAccountViewModel myAccountViewModel, long j5, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = myAccountViewModel;
        this.purple = j5;
        this.red = str;
        this.silver = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new am(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((am) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        MyAccountViewModel myAccountViewModel = this.alpha;
        OtpVerificationRequest otpVerificationRequest = new OtpVerificationRequest(this.red);
        Single<ResponseBody> golf = myAccountViewModel.alpha.golf(this.purple, otpVerificationRequest);
        az azVar = this.silver;
        golf.subscribe(new X9.f(25, new Fb.j(azVar, 28)), new X9.f(26, new Fb.j(azVar, myAccountViewModel)));
        return Unit.INSTANCE;
    }
}
