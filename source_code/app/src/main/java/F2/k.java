package F2;

import A2.z;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends ConnectivityManager.NetworkCallback {
    public static final k alpha = new ConnectivityManager.NetworkCallback();
    public static final Object bravo = new Object();
    public static final LinkedHashMap charlie = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> z2;
        boolean canBeSatisfiedBy;
        c bVar;
        Intrinsics.echo(network, "network");
        Intrinsics.echo(networkCapabilities, "networkCapabilities");
        z.echo().alpha(p.alpha, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (bravo) {
            z2 = CollectionsKt.z(charlie.entrySet());
        }
        for (Map.Entry entry : z2) {
            Function1 function1 = (Function1) entry.getKey();
            canBeSatisfiedBy = ((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities);
            if (canBeSatisfiedBy) {
                bVar = a.alpha;
            } else {
                bVar = new b(7);
            }
            function1.invoke(bVar);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List z2;
        Intrinsics.echo(network, "network");
        z.echo().alpha(p.alpha, "NetworkRequestConstraintController onLost callback");
        synchronized (bravo) {
            z2 = CollectionsKt.z(charlie.keySet());
        }
        Iterator it = z2.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(new b(7));
        }
    }
}
