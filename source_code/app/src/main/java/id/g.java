package id;

import Xd.l;
import Xd.m;
import Xd.o;
import hd.C1845a;
import hd.am;
import hd.x;
import kotlin.jvm.internal.Intrinsics;
import od.C2229f;
import pd.C2303a;

/* loaded from: classes2.dex */
public final class g implements InterfaceC1913a {
    public static final g purple = new g(0);
    public static final g red = new g(1);
    public static final g silver = new g(2);
    public static final g teal = new g(3);
    public final /* synthetic */ int alpha;

    public /* synthetic */ g(int i4) {
        this.alpha = i4;
    }

    @Override // id.InterfaceC1913a
    public final void alpha(cd.c client, kotlin.e eVar) {
        Object obj;
        switch (this.alpha) {
            case 0:
                m mVar = (m) eVar;
                Intrinsics.echo(client, "client");
                C1845a c1845a = am.bravo;
                zd.i iVar = (zd.i) client.f3490a.echo(x.alpha);
                Nd.c cVar = null;
                if (iVar != null) {
                    obj = iVar.echo(am.charlie);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    ((am) obj).alpha.add(new fd.c(mVar, client, cVar, 2));
                    return;
                }
                throw new IllegalStateException("Plugin " + c1845a + " is not installed. Consider using `install(" + am.charlie + ")` in client config first.");
            case 1:
                Intrinsics.echo(client, "client");
                client.silver.golf(C2229f.golf, new F2.m((l) eVar, (Nd.c) null, 6));
                return;
            case 2:
                Intrinsics.echo(client, "client");
                client.silver.golf(C2229f.india, new F2.m((o) eVar, (Nd.c) null, 7));
                return;
            default:
                Intrinsics.echo(client, "client");
                client.teal.golf(C2303a.lima, new cd.a((o) eVar, null, 6));
                return;
        }
    }
}
