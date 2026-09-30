package d3;

import a2.C0393r;
import androidx.lifecycle.az;
import com.app.network.network.models.Allocation;
import com.app.network.network.response.DataResponse;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2958c;
import vf.ab;

/* renamed from: d3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1588d extends Pd.i implements Xd.l {
    public final /* synthetic */ k alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588d(k kVar, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = kVar;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1588d(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1588d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        k kVar = this.alpha;
        InterfaceC2958c interfaceC2958c = kVar.f12039d;
        if (interfaceC2958c != null) {
            Single<DataResponse<Allocation>> foxtrot = interfaceC2958c.foxtrot();
            az azVar = this.purple;
            foxtrot.subscribe(new X9.f(13, new Fb.j(azVar, 23)), new X9.f(14, new C0393r(25, azVar, kVar)));
            return Unit.INSTANCE;
        }
        Intrinsics.lima("ordersService");
        throw null;
    }
}
