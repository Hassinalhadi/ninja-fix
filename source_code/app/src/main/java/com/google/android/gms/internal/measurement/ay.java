package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ay extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6681b;
    public final /* synthetic */ int teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ String yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay(J j5, String str, String str2, Object obj, int i4) {
        super(j5, true);
        this.teal = i4;
        this.white = str;
        this.yellow = str2;
        this.f6681b = obj;
        this.f6680a = j5;
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void alpha() {
        switch (this.teal) {
            case 0:
                am amVar = this.f6680a.hotel;
                V5.x.hotel(amVar);
                amVar.clearConditionalUserProperty(this.white, this.yellow, (Bundle) this.f6681b);
                return;
            case 1:
                am amVar2 = this.f6680a.hotel;
                V5.x.hotel(amVar2);
                amVar2.getConditionalUserProperties(this.white, this.yellow, (aj) this.f6681b);
                return;
            default:
                am amVar3 = this.f6680a.hotel;
                V5.x.hotel(amVar3);
                amVar3.setCurrentScreenByScionActivityInfo((zzdj) this.f6681b, this.white, this.yellow, this.alpha);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.F
    public void bravo() {
        switch (this.teal) {
            case 1:
                ((aj) this.f6681b).november(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(J j5, zzdj zzdjVar, String str, String str2) {
        super(j5, true);
        this.teal = 2;
        this.f6681b = zzdjVar;
        this.white = str;
        this.yellow = str2;
        this.f6680a = j5;
    }
}
