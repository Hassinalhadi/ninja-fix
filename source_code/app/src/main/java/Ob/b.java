package Ob;

import Jb.I;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.app.network.network.models.ProfileAttributesRequest;
import delivery.samurai.android.ui.missingAttributes.AttributeMissingViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class b extends Pd.i implements l {
    public final /* synthetic */ AttributeMissingViewModel alpha;
    public final /* synthetic */ ProfileAttributesRequest purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AttributeMissingViewModel attributeMissingViewModel, ProfileAttributesRequest profileAttributesRequest, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = attributeMissingViewModel;
        this.purple = profileAttributesRequest;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AttributeMissingViewModel attributeMissingViewModel = this.alpha;
        Single<CaptainProfileAttributeOtpResponse> zulu = attributeMissingViewModel.alpha.zulu(this.purple);
        az azVar = this.red;
        zulu.subscribe(new I(13, new Fb.j(azVar, 11)), new I(14, new a(azVar, attributeMissingViewModel, 0)));
        return Unit.INSTANCE;
    }
}
