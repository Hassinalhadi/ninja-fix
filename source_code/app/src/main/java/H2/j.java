package H2;

import A2.z;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends d {
    public final ConnectivityManager golf;

    public j(Context context, L2.c cVar) {
        super(context, cVar);
        Object systemService = this.bravo.getSystemService("connectivity");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.golf = (ConnectivityManager) systemService;
    }

    @Override // H2.f
    public final Object alpha() {
        return i.alpha(this.golf);
    }

    @Override // H2.d
    public final IntentFilter echo() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // H2.d
    public final void foxtrot(Intent intent) {
        if (Intrinsics.areEqual(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            z.echo().alpha(i.alpha, "Network broadcast received");
            bravo(i.alpha(this.golf));
        }
    }
}
