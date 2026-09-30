package Gb;

import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2957b;
import vf.ab;

/* loaded from: classes2.dex */
public final class s extends Pd.i implements Xd.l {
    public final /* synthetic */ EnvelopsViewModelV2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(EnvelopsViewModelV2 envelopsViewModelV2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = envelopsViewModelV2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new s(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Single<DataResponse<EnvelopNotification>> fuchsia;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        EnvelopsViewModelV2 envelopsViewModelV2 = this.alpha;
        String str = envelopsViewModelV2.echo;
        InterfaceC2957b interfaceC2957b = envelopsViewModelV2.alpha;
        if (str == null) {
            fuchsia = interfaceC2957b.sierra(envelopsViewModelV2.delta);
        } else {
            Intrinsics.checkNotNull(str);
            fuchsia = interfaceC2957b.fuchsia(envelopsViewModelV2.delta, str);
        }
        fuchsia.subscribe(new Fb.k(21, new p(envelopsViewModelV2, 2)), new Fb.k(22, new p(envelopsViewModelV2, 3)));
        return Unit.INSTANCE;
    }
}
