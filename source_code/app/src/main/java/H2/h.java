package H2;

import A2.z;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends f {
    public final ConnectivityManager foxtrot;
    public final F2.d golf;

    public h(Context context, L2.c cVar) {
        super(context, cVar);
        Object systemService = this.bravo.getSystemService("connectivity");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.foxtrot = (ConnectivityManager) systemService;
        this.golf = new F2.d(1, this);
    }

    @Override // H2.f
    public final Object alpha() {
        return i.alpha(this.foxtrot);
    }

    @Override // H2.f
    public final void charlie() {
        try {
            z.echo().alpha(i.alpha, "Registering network callback");
            ConnectivityManager connectivityManager = this.foxtrot;
            F2.d networkCallback = this.golf;
            Intrinsics.echo(connectivityManager, "<this>");
            Intrinsics.echo(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e) {
            z.echo().delta(i.alpha, "Received exception while registering network callback", e);
        } catch (SecurityException e4) {
            z.echo().delta(i.alpha, "Received exception while registering network callback", e4);
        }
    }

    @Override // H2.f
    public final void delta() {
        try {
            z.echo().alpha(i.alpha, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.foxtrot;
            F2.d networkCallback = this.golf;
            Intrinsics.echo(connectivityManager, "<this>");
            Intrinsics.echo(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e) {
            z.echo().delta(i.alpha, "Received exception while unregistering network callback", e);
        } catch (SecurityException e4) {
            z.echo().delta(i.alpha, "Received exception while unregistering network callback", e4);
        }
    }
}
