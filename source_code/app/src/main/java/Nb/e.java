package Nb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {
    public static boolean alpha(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            activeNetwork = connectivityManager.getActiveNetwork();
        } catch (Exception unused) {
        }
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.delta(allNetworks, "getAllNetworks(...)");
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities2 != null && networkCapabilities2.hasCapability(12) && networkCapabilities2.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean bravo(Context context) {
        ConnectivityManager connectivityManager;
        Intrinsics.echo(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return false;
        }
        return alpha(connectivityManager);
    }
}
