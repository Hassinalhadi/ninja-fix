package kd;

import hd.as;
import id.InterfaceC1913a;
import kotlin.jvm.internal.Intrinsics;
import od.C2229f;
import pd.C2303a;

/* loaded from: classes2.dex */
public final class ai implements InterfaceC1913a {
    public static final ai purple = new ai(0);
    public static final ai red = new ai(1);
    public static final ai silver = new ai(2);
    public static final ai teal = new ai(3);
    public final /* synthetic */ int alpha;

    public /* synthetic */ ai(int i4) {
        this.alpha = i4;
    }

    @Override // id.InterfaceC1913a
    public final void alpha(cd.c client, kotlin.e eVar) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(client, "client");
                client.teal.golf(C2303a.juliet, new as((Xd.m) eVar, null, 3));
                return;
            case 1:
                Intrinsics.echo(client, "client");
                Af.t tVar = new Af.t("AfterState", 1);
                C2303a c2303a = client.yellow;
                c2303a.foxtrot(C2303a.hotel, tVar);
                c2303a.golf(tVar, new as((Xd.m) eVar, null, 4));
                return;
            case 2:
                Intrinsics.echo(client, "client");
                client.yellow.golf(C2303a.hotel, new as((Xd.m) eVar, null, 5));
                return;
            default:
                Intrinsics.echo(client, "client");
                client.white.golf(C2229f.november, new as((Xd.m) eVar, null, 6));
                return;
        }
    }
}
