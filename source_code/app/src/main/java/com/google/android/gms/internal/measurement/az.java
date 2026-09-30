package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class az extends F {
    public final /* synthetic */ int teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ J yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az(J j5, String str, int i4) {
        super(j5, true);
        this.teal = i4;
        this.white = str;
        this.yellow = j5;
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void alpha() {
        switch (this.teal) {
            case 0:
                am amVar = this.yellow.hotel;
                V5.x.hotel(amVar);
                amVar.setUserId(this.white, this.alpha);
                return;
            case 1:
                am amVar2 = this.yellow.hotel;
                V5.x.hotel(amVar2);
                amVar2.beginAdUnitExposure(this.white, this.purple);
                return;
            default:
                am amVar3 = this.yellow.hotel;
                V5.x.hotel(amVar3);
                amVar3.endAdUnitExposure(this.white, this.purple);
                return;
        }
    }
}
