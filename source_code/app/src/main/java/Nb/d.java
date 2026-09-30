package Nb;

import Xd.l;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC3027m3;
import xf.q;
import xf.r;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ConnectivityManager red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConnectivityManager connectivityManager, Nd.c cVar) {
        super(2, cVar);
        this.red = connectivityManager;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        d dVar = new d(this.red, cVar);
        dVar.purple = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        r rVar = (r) this.purple;
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
            ConnectivityManager connectivityManager = this.red;
            q qVar = (q) rVar;
            qVar.mike(Boolean.valueOf(e.alpha(connectivityManager)));
            c cVar = new c(connectivityManager, rVar);
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    connectivityManager.registerDefaultNetworkCallback(cVar);
                } else {
                    connectivityManager.registerNetworkCallback(build, cVar);
                }
                Ac.g gVar = new Ac.g(15, connectivityManager, cVar);
                this.purple = null;
                this.alpha = 1;
                if (AbstractC3027m3.alpha(rVar, gVar, this) == aVar) {
                    return aVar;
                }
            } catch (Exception e) {
                qVar.c(e);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
