package J8;

import android.content.Context;
import i8.InterfaceC1904b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements M8.b {
    public final /* synthetic */ int alpha;
    public final Kd.a bravo;

    public /* synthetic */ m(Kd.a aVar, int i4) {
        this.alpha = i4;
        this.bravo = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        Kd.a aVar = this.bravo;
        switch (this.alpha) {
            case 0:
                return new l((InterfaceC1904b) ((M8.c) aVar).alpha);
            case 1:
                B7.g firebaseApp = (B7.g) ((M8.c) aVar).alpha;
                Intrinsics.echo(firebaseApp, "firebaseApp");
                ao aoVar = ao.alpha;
                return ao.alpha(firebaseApp);
            case 2:
                Context appContext = (Context) ((M8.c) aVar).alpha;
                Intrinsics.echo(appContext, "appContext");
                return G1.e.alpha(new D8.c(q.purple), new r(appContext, 0));
            case 3:
                Context appContext2 = (Context) ((M8.c) aVar).alpha;
                Intrinsics.echo(appContext2, "appContext");
                return G1.e.alpha(new D8.c(q.red), new r(appContext2, 1));
            case 4:
                return new D((Context) ((M8.c) aVar).alpha);
            case 5:
                return new N8.a((Context) ((M8.c) aVar).alpha);
            default:
                return new N8.n((C1.h) aVar.get());
        }
    }
}
