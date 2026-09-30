package gd;

import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import vf.H;
import vf.I;
import vf.ab;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ f purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        f fVar = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                Nd.f fVar2 = fVar.white.get(H.alpha);
                Intrinsics.checkNotNull(fVar2);
                this.alpha = 1;
                if (((I) fVar2).gray(this) == aVar) {
                    return aVar;
                }
            }
            while (it.hasNext()) {
                OkHttpClient okHttpClient = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                okHttpClient.connectionPool().evictAll();
                okHttpClient.dispatcher().executorService().shutdown();
            }
            return Unit.INSTANCE;
        } finally {
            it = fVar.f12696a.entrySet().iterator();
            while (it.hasNext()) {
                OkHttpClient okHttpClient2 = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                okHttpClient2.connectionPool().evictAll();
                okHttpClient2.dispatcher().executorService().shutdown();
            }
        }
    }
}
