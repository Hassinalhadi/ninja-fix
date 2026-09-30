package Nb;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import xf.q;
import xf.r;

/* loaded from: classes2.dex */
public final class c extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ConnectivityManager alpha;
    public final /* synthetic */ r bravo;

    public c(ConnectivityManager connectivityManager, r rVar) {
        this.alpha = connectivityManager;
        this.bravo = rVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.echo(network, "network");
        ((q) this.bravo).mike(Boolean.valueOf(e.alpha(this.alpha)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.echo(network, "network");
        Intrinsics.echo(networkCapabilities, "networkCapabilities");
        ((q) this.bravo).mike(Boolean.valueOf(e.alpha(this.alpha)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        Intrinsics.echo(network, "network");
        Intrinsics.echo(linkProperties, "linkProperties");
        ((q) this.bravo).mike(Boolean.valueOf(e.alpha(this.alpha)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.echo(network, "network");
        ((q) this.bravo).mike(Boolean.valueOf(e.alpha(this.alpha)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        ((q) this.bravo).mike(Boolean.FALSE);
    }
}
