package F2;

import A2.z;
import B2.ap;
import J2.t;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import g3.ad;
import g3.ae;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vf.Y;

/* loaded from: classes3.dex */
public final class d extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int charlie = 0;
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ d(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        String str;
        String str2;
        switch (this.alpha) {
            case 2:
                Y3.l.foxtrot().post(new R3.p(this, true, 0));
                return;
            case 3:
                t.golf((t) this.bravo, network, true);
                return;
            case 4:
                Intrinsics.echo(network, "network");
                ca.n nVar = (ca.n) this.bravo;
                if (nVar.sierra && !nVar.quebec.get() && !nVar.romeo.get()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - nVar.xray >= 3000) {
                        ae aeVar = nVar.echo;
                        if (aeVar != null) {
                            str = aeVar.alpha();
                        } else {
                            str = null;
                        }
                        ad adVar = nVar.foxtrot;
                        if (adVar != null) {
                            str2 = adVar.alpha();
                        } else {
                            str2 = null;
                        }
                        if (str != null && !StringsKt.gray(str) && str2 != null && !StringsKt.gray(str2)) {
                            nVar.xray = currentTimeMillis;
                            Y y10 = nVar.black;
                            if (y10 != null) {
                                y10.foxtrot(null);
                            }
                            nVar.black = vf.ad.zulu(nVar.lima, null, null, new ca.i(nVar, str, str2, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        i alpha;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(network, "network");
                Intrinsics.echo(networkCapabilities, "networkCapabilities");
                z.echo().alpha(p.alpha, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((ap) this.bravo).invoke(a.alpha);
                return;
            case 1:
                Intrinsics.echo(network, "network");
                Intrinsics.echo(networkCapabilities, "capabilities");
                z.echo().alpha(H2.i.alpha, "Network capabilities changed: " + networkCapabilities);
                int i4 = Build.VERSION.SDK_INT;
                H2.h hVar = (H2.h) this.bravo;
                if (i4 >= 28) {
                    alpha = new i(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
                } else {
                    alpha = H2.i.alpha(hVar.foxtrot);
                }
                hVar.bravo(alpha);
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(network, "network");
                z.echo().alpha(p.alpha, "NetworkRequestConstraintController onLost callback");
                ((ap) this.bravo).invoke(new b(7));
                return;
            case 1:
                Intrinsics.echo(network, "network");
                z.echo().alpha(H2.i.alpha, "Network connection lost");
                H2.h hVar = (H2.h) this.bravo;
                hVar.bravo(H2.i.alpha(hVar.foxtrot));
                return;
            case 2:
                Y3.l.foxtrot().post(new R3.p(this, false, 0));
                return;
            case 3:
                t.golf((t) this.bravo, network, false);
                return;
            default:
                super.onLost(network);
                return;
        }
    }

    public d(ap apVar) {
        this.alpha = 0;
        this.bravo = apVar;
    }
}
