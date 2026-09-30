package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import g.AbstractC1719b;

/* loaded from: classes3.dex */
public final class ad {
    public final Object alpha;
    public final ae bravo;
    public int delta;
    public ad echo;
    public boolean foxtrot;
    public int charlie = -1;
    public final androidx.compose.runtime.ax golf = C0564b.zulu(null);

    public ad(Object obj, ae aeVar) {
        this.alpha = obj;
        this.bravo = aeVar;
    }

    public final ad alpha() {
        if (this.foxtrot) {
            AbstractC1719b.charlie("Pin should not be called on an already disposed item ");
        }
        if (this.delta == 0) {
            this.bravo.alpha.add(this);
            ad adVar = (ad) ((t0) this.golf).getValue();
            if (adVar != null) {
                adVar.alpha();
            } else {
                adVar = null;
            }
            this.echo = adVar;
        }
        this.delta++;
        return this;
    }

    public final void bravo() {
        if (!this.foxtrot) {
            if (this.delta <= 0) {
                AbstractC1719b.charlie("Release should only be called once");
            }
            int i4 = this.delta - 1;
            this.delta = i4;
            if (i4 == 0) {
                this.bravo.alpha.remove(this);
                ad adVar = this.echo;
                if (adVar != null) {
                    adVar.bravo();
                }
                this.echo = null;
            }
        }
    }
}
