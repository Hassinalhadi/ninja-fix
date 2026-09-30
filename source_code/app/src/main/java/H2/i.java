package H2;

import A2.z;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class i {
    public static final String alpha;

    static {
        String golf = z.golf("NetworkStateTracker");
        Intrinsics.delta(golf, "tagWithPrefix(\"NetworkStateTracker\")");
        alpha = golf;
    }

    public static final F2.i alpha(ConnectivityManager connectivityManager) {
        boolean z2;
        boolean z10;
        NetworkCapabilities networkCapabilities;
        Intrinsics.echo(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            z.echo().delta(alpha, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            z10 = networkCapabilities.hasCapability(16);
            boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                z11 = false;
            }
            return new F2.i(z2, z10, isActiveNetworkMetered, z11);
        }
        z10 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z11 = false;
        return new F2.i(z2, z10, isActiveNetworkMetered2, z11);
    }
}
