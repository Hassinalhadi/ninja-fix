package Gb;

import Cb.ad;
import androidx.lifecycle.az;
import com.app.network.network.models.EnvelopNotification;
import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class r extends Pd.i implements Xd.l {
    public final /* synthetic */ EnvelopsViewModelV2 alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(EnvelopsViewModelV2 envelopsViewModelV2, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = envelopsViewModelV2;
        this.purple = str;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new r(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        EnvelopsViewModelV2 envelopsViewModelV2 = this.alpha;
        Single<EnvelopNotification> mike = envelopsViewModelV2.alpha.mike(this.purple);
        az azVar = this.red;
        mike.subscribe(new Fb.k(19, new Fb.j(azVar, 4)), new Fb.k(20, new ad(5, azVar, envelopsViewModelV2)));
        return Unit.INSTANCE;
    }
}
