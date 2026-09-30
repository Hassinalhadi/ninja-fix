package V5;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public abstract class r {
    public Boolean alpha;
    public boolean bravo;
    public final /* synthetic */ e charlie;
    public final int delta;
    public final Bundle echo;
    public final /* synthetic */ e foxtrot;

    public r(e eVar, int i4, Bundle bundle) {
        this.foxtrot = eVar;
        Boolean bool = Boolean.TRUE;
        this.charlie = eVar;
        this.alpha = bool;
        this.bravo = false;
        this.delta = i4;
        this.echo = bundle;
    }

    public abstract void alpha(ConnectionResult connectionResult);

    public abstract boolean bravo();

    public final void charlie() {
        synchronized (this) {
            this.alpha = null;
        }
    }

    public final void delta() {
        charlie();
        synchronized (this.charlie.lima) {
            this.charlie.lima.remove(this);
        }
    }
}
