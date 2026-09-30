package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class D extends F {
    public final /* synthetic */ int teal;
    public final /* synthetic */ aj white;
    public final /* synthetic */ J yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(J j5, aj ajVar, int i4) {
        super(j5, true);
        this.teal = i4;
        this.white = ajVar;
        this.yellow = j5;
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void alpha() {
        switch (this.teal) {
            case 0:
                am amVar = this.yellow.hotel;
                V5.x.hotel(amVar);
                amVar.getGmpAppId(this.white);
                return;
            case 1:
                am amVar2 = this.yellow.hotel;
                V5.x.hotel(amVar2);
                amVar2.getCachedAppInstanceId(this.white);
                return;
            case 2:
                am amVar3 = this.yellow.hotel;
                V5.x.hotel(amVar3);
                amVar3.generateEventId(this.white);
                return;
            case 3:
                am amVar4 = this.yellow.hotel;
                V5.x.hotel(amVar4);
                amVar4.getCurrentScreenName(this.white);
                return;
            default:
                am amVar5 = this.yellow.hotel;
                V5.x.hotel(amVar5);
                amVar5.getCurrentScreenClass(this.white);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void bravo() {
        switch (this.teal) {
            case 0:
                this.white.november(null);
                return;
            case 1:
                this.white.november(null);
                return;
            case 2:
                this.white.november(null);
                return;
            case 3:
                this.white.november(null);
                return;
            default:
                this.white.november(null);
                return;
        }
    }
}
