package ca;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.WebSocket;
import v3.InterfaceC3171a;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ WebSocket red;
    public final /* synthetic */ n silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WebSocket webSocket, n nVar, Nd.c cVar) {
        super(2, cVar);
        this.red = webSocket;
        this.silver = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.red, this.silver, cVar);
        gVar.purple = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ab abVar = (ab) this.purple;
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
            this.purple = abVar;
            this.alpha = 1;
            if (ad.november(10000L, this) == aVar) {
                return aVar;
            }
        }
        if (!ad.xray(abVar)) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(this.red, this.silver.papa) && !this.silver.quebec.get() && this.silver.romeo.compareAndSet(true, false)) {
            n.golf(this.silver, "FORCE_RETRY", y.romeo(new Pair("reason", "stuck")), new Long(System.currentTimeMillis() - this.silver.victor), null, null, null, null, 120);
            this.red.close(1000, "Connect stall");
            if (Intrinsics.areEqual(this.red, this.silver.papa)) {
                this.silver.papa = null;
            }
            this.silver.uniform++;
            InterfaceC3171a interfaceC3171a = this.silver.charlie;
            if (interfaceC3171a != null) {
                interfaceC3171a.golf();
            }
            if (this.silver.sierra) {
                this.silver.kilo();
            }
        }
        return Unit.INSTANCE;
    }
}
