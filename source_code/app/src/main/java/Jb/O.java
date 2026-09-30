package Jb;

import com.app.network.network.models.OtpVerificationRequest;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class O extends Pd.i implements Xd.l {
    public final /* synthetic */ HomeViewModelV2 alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ androidx.lifecycle.az silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(HomeViewModelV2 homeViewModelV2, long j5, String str, androidx.lifecycle.az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModelV2;
        this.purple = j5;
        this.red = str;
        this.silver = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new O(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        HomeViewModelV2 homeViewModelV2 = this.alpha;
        OtpVerificationRequest otpVerificationRequest = new OtpVerificationRequest(this.red);
        Single<ResponseBody> golf = homeViewModelV2.bravo.golf(this.purple, otpVerificationRequest);
        androidx.lifecycle.az azVar = this.silver;
        golf.subscribe(new I(7, new Fb.j(azVar, 10)), new I(8, new G(azVar, homeViewModelV2, 4)));
        return Unit.INSTANCE;
    }
}
