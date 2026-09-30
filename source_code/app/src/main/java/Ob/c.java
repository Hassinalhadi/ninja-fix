package Ob;

import Jb.I;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.OtpVerificationRequest;
import delivery.samurai.android.ui.missingAttributes.AttributeMissingViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;
import vf.ab;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements l {
    public final /* synthetic */ AttributeMissingViewModel alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ az silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AttributeMissingViewModel attributeMissingViewModel, long j5, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = attributeMissingViewModel;
        this.purple = j5;
        this.red = str;
        this.silver = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AttributeMissingViewModel attributeMissingViewModel = this.alpha;
        OtpVerificationRequest otpVerificationRequest = new OtpVerificationRequest(this.red);
        Single<ResponseBody> golf = attributeMissingViewModel.alpha.golf(this.purple, otpVerificationRequest);
        az azVar = this.silver;
        golf.subscribe(new I(15, new Fb.j(azVar, 12)), new I(16, new a(azVar, attributeMissingViewModel, 1)));
        return Unit.INSTANCE;
    }
}
