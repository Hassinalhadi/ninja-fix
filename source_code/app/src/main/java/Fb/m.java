package Fb;

import androidx.lifecycle.az;
import com.app.network.network.models.EnvelopNotification;
import delivery.samurai.android.ui.envelop.EnvelopsViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class m extends Pd.i implements Xd.l {
    public final /* synthetic */ EnvelopsViewModel alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(EnvelopsViewModel envelopsViewModel, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = envelopsViewModel;
        this.purple = str;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new m(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        EnvelopsViewModel envelopsViewModel = this.alpha;
        Single<EnvelopNotification> mike = envelopsViewModel.alpha.mike(this.purple);
        az azVar = this.red;
        mike.subscribe(new k(0, new j(azVar, 0)), new k(1, new l(azVar, envelopsViewModel, 0)));
        return Unit.INSTANCE;
    }
}
