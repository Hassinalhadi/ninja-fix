package k3;

import Xd.l;
import com.app.feature.location.api.StompStateHolder;
import kotlin.ResultKt;
import kotlin.Unit;
import p3.EnumC2270b;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class h extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ StompStateHolder red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StompStateHolder stompStateHolder, Nd.c cVar) {
        super(2, cVar);
        this.red = stompStateHolder;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        h hVar = new h(this.red, cVar);
        hVar.purple = obj;
        return hVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            EnumC2270b gpsQuality = this.red.getGpsQuality();
            this.purple = null;
            this.alpha = 1;
            if (interfaceC3440j.emit(gpsQuality, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
