package E8;

import B9.ab;
import I7.p;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import q8.C2430a;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements I7.e {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ p purple;

    public /* synthetic */ k(p pVar, int i4) {
        this.alpha = i4;
        this.purple = pVar;
    }

    @Override // I7.e
    public final Object create(I7.c cVar) {
        C2430a lambda$getComponents$0;
        switch (this.alpha) {
            case 0:
                return RemoteConfigRegistrar.alpha(this.purple, (ab) cVar);
            case 1:
                return FirebaseMessagingRegistrar.alpha(this.purple, (ab) cVar);
            case 2:
                ab abVar = (ab) cVar;
                return new g8.c((Context) abVar.charlie(Context.class), ((B7.g) abVar.charlie(B7.g.class)).delta(), abVar.maroon(g8.d.class), abVar.india(D8.b.class), (Executor) abVar.oscar(this.purple));
            default:
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(this.purple, (ab) cVar);
                return lambda$getComponents$0;
        }
    }
}
