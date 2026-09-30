package F2;

import A2.z;
import B2.ap;
import Ce.ab;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC3027m3;
import vf.ad;
import xf.q;
import xf.r;

/* loaded from: classes3.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ A2.d red;
    public final /* synthetic */ h silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(A2.d dVar, h hVar, Nd.c cVar) {
        super(2, cVar);
        this.red = dVar;
        this.silver = hVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.red, this.silver, cVar);
        gVar.purple = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.q, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ab abVar;
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
            r rVar = (r) this.purple;
            NetworkRequest networkRequest = this.red.bravo.alpha;
            if (networkRequest == null) {
                q qVar = (q) rVar;
                qVar.getClass();
                qVar.c(null);
                return Unit.INSTANCE;
            }
            ap apVar = new ap(9, ad.zulu(rVar, null, null, new f(this.silver, rVar, null), 3), rVar);
            if (Build.VERSION.SDK_INT >= 30) {
                k kVar = k.alpha;
                ConnectivityManager connectivityManager = this.silver.alpha;
                kVar.getClass();
                synchronized (k.bravo) {
                    LinkedHashMap linkedHashMap = k.charlie;
                    boolean isEmpty = linkedHashMap.isEmpty();
                    linkedHashMap.put(apVar, networkRequest);
                    if (isEmpty) {
                        z.echo().alpha(p.alpha, "NetworkRequestConstraintController register shared callback");
                        connectivityManager.registerDefaultNetworkCallback(kVar);
                    }
                }
                abVar = new ab(apVar, connectivityManager, kVar, 5);
            } else {
                int i5 = d.charlie;
                ConnectivityManager connectivityManager2 = this.silver.alpha;
                d dVar = new d(apVar);
                ?? obj2 = new Object();
                try {
                    z.echo().alpha(p.alpha, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequest, dVar);
                    obj2.alpha = true;
                } catch (RuntimeException e) {
                    if (kotlin.text.r.golf(e.getClass().getName(), "TooManyRequestsException", false)) {
                        z.echo().bravo(p.alpha, "NetworkRequestConstraintController couldn't register callback", e);
                        apVar.invoke(new b(7));
                    } else {
                        throw e;
                    }
                }
                abVar = new ab(obj2, connectivityManager2, dVar, 4);
            }
            e eVar = new e(abVar, 0);
            this.alpha = 1;
            if (AbstractC3027m3.alpha(rVar, eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
