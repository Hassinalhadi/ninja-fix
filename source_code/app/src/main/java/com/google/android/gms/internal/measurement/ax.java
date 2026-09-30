package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import h6.BinderC1814d;

/* loaded from: classes2.dex */
public final class ax extends F {
    public final /* synthetic */ int teal;
    public final /* synthetic */ J white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax(J j5, Object obj, int i4) {
        super(j5, true);
        this.teal = i4;
        this.yellow = obj;
        this.white = j5;
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void alpha() {
        switch (this.teal) {
            case 0:
                am amVar = this.white.hotel;
                V5.x.hotel(amVar);
                amVar.setConditionalUserProperty((Bundle) this.yellow, this.alpha);
                return;
            case 1:
                am amVar2 = this.white.hotel;
                V5.x.hotel(amVar2);
                amVar2.retrieveAndUploadBatches(new B((com.google.common.util.concurrent.d) this.yellow));
                return;
            case 2:
                am amVar3 = this.white.hotel;
                V5.x.hotel(amVar3);
                amVar3.logHealthData(5, "Error with data collection. Data lost.", new BinderC1814d((Exception) this.yellow), new BinderC1814d(null), new BinderC1814d(null));
                return;
            default:
                am amVar4 = this.white.hotel;
                V5.x.hotel(amVar4);
                amVar4.registerOnMeasurementEventListener((G) this.yellow);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(J j5, Exception exc) {
        super(j5, false);
        this.teal = 2;
        this.yellow = exc;
        this.white = j5;
    }
}
