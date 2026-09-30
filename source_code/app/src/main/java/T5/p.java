package T5;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes2.dex */
public final class p extends aj {
    public final bv.f white;
    public final e yellow;

    public p(h hVar, e eVar, GoogleApiAvailability googleApiAvailability) {
        super(hVar, googleApiAvailability);
        this.white = new bv.f(0);
        this.yellow = eVar;
        hVar.delta("ConnectionlessLifecycleHelper", this);
    }

    @Override // T5.aj
    public final void echo() {
        if (!this.white.isEmpty()) {
            this.yellow.alpha(this);
        }
    }

    @Override // T5.aj
    public final void foxtrot() {
        this.purple = true;
        if (!this.white.isEmpty()) {
            this.yellow.alpha(this);
        }
    }

    @Override // T5.aj
    public final void golf() {
        this.purple = false;
        e eVar = this.yellow;
        eVar.getClass();
        synchronized (e.romeo) {
            try {
                if (eVar.kilo == this) {
                    eVar.kilo = null;
                    eVar.lima.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T5.aj
    public final void hotel(ConnectionResult connectionResult, int i4) {
        this.yellow.golf(connectionResult, i4);
    }

    @Override // T5.aj
    public final void india() {
        com.google.android.gms.internal.measurement.ai aiVar = this.yellow.november;
        aiVar.sendMessage(aiVar.obtainMessage(3));
    }
}
