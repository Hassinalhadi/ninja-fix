package H2;

import A2.z;
import Gc.v;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public abstract class d extends f {
    public final v foxtrot;

    public d(Context context, L2.c cVar) {
        super(context, cVar);
        this.foxtrot = new v(1, this);
    }

    @Override // H2.f
    public final void charlie() {
        z.echo().alpha(e.alpha, getClass().getSimpleName().concat(": registering receiver"));
        this.bravo.registerReceiver(this.foxtrot, echo());
    }

    @Override // H2.f
    public final void delta() {
        z.echo().alpha(e.alpha, getClass().getSimpleName().concat(": unregistering receiver"));
        this.bravo.unregisterReceiver(this.foxtrot);
    }

    public abstract IntentFilter echo();

    public abstract void foxtrot(Intent intent);
}
