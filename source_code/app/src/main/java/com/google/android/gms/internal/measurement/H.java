package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes2.dex */
public final class H extends F {
    public final /* synthetic */ int teal;
    public final /* synthetic */ Activity white;
    public final /* synthetic */ I yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i4, Activity activity, int i5) {
        super(i4.alpha, true);
        this.teal = i5;
        switch (i5) {
            case 1:
                this.white = activity;
                this.yellow = i4;
                super(i4.alpha, true);
                return;
            case 2:
                this.white = activity;
                this.yellow = i4;
                super(i4.alpha, true);
                return;
            case 3:
                this.white = activity;
                this.yellow = i4;
                super(i4.alpha, true);
                return;
            case 4:
                this.white = activity;
                this.yellow = i4;
                super(i4.alpha, true);
                return;
            default:
                this.white = activity;
                this.yellow = i4;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void alpha() {
        switch (this.teal) {
            case 0:
                am amVar = this.yellow.alpha.hotel;
                V5.x.hotel(amVar);
                amVar.onActivityStartedByScionActivityInfo(zzdj.o(this.white), this.purple);
                return;
            case 1:
                am amVar2 = this.yellow.alpha.hotel;
                V5.x.hotel(amVar2);
                amVar2.onActivityResumedByScionActivityInfo(zzdj.o(this.white), this.purple);
                return;
            case 2:
                am amVar3 = this.yellow.alpha.hotel;
                V5.x.hotel(amVar3);
                amVar3.onActivityPausedByScionActivityInfo(zzdj.o(this.white), this.purple);
                return;
            case 3:
                am amVar4 = this.yellow.alpha.hotel;
                V5.x.hotel(amVar4);
                amVar4.onActivityStoppedByScionActivityInfo(zzdj.o(this.white), this.purple);
                return;
            default:
                am amVar5 = this.yellow.alpha.hotel;
                V5.x.hotel(amVar5);
                amVar5.onActivityDestroyedByScionActivityInfo(zzdj.o(this.white), this.purple);
                return;
        }
    }
}
