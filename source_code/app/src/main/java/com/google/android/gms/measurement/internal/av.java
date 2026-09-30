package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class av extends BroadcastReceiver {
    public final Z0 alpha;
    public boolean bravo;
    public boolean charlie;

    public av(Z0 z02) {
        V5.x.hotel(z02);
        this.alpha = z02;
    }

    public final void alpha() {
        Z0 z02 = this.alpha;
        z02.foxtrot();
        z02.u().W();
        z02.u().W();
        if (!this.bravo) {
            return;
        }
        z02.crimson().f7636g.alpha("Unregistering connectivity change receiver");
        this.bravo = false;
        this.charlie = false;
        try {
            z02.e.alpha.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            z02.crimson().white.bravo(e, "Failed to unregister the network broadcast receiver");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Z0 z02 = this.alpha;
        z02.foxtrot();
        String action = intent.getAction();
        z02.crimson().f7636g.bravo(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            au auVar = z02.purple;
            Z0.cyan(auVar);
            boolean v0 = auVar.v0();
            if (this.charlie != v0) {
                this.charlie = v0;
                z02.u().g0(new F6.b(this, v0));
                return;
            }
            return;
        }
        z02.crimson().f7632b.bravo(action, "NetworkBroadcastReceiver received unknown action");
    }
}
