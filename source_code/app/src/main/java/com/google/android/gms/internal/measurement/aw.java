package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import h6.BinderC1814d;

/* loaded from: classes2.dex */
public final class aw extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f6678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6679c;
    public final /* synthetic */ int teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ String yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw(J j5, String str, String str2, Object obj, boolean z2, int i4) {
        super(j5, true);
        this.teal = i4;
        this.white = str;
        this.yellow = str2;
        this.f6679c = obj;
        this.f6677a = z2;
        this.f6678b = j5;
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void alpha() {
        switch (this.teal) {
            case 0:
                am amVar = this.f6678b.hotel;
                V5.x.hotel(amVar);
                amVar.setUserProperty(this.white, this.yellow, new BinderC1814d((String) this.f6679c), this.f6677a, this.alpha);
                return;
            case 1:
                am amVar2 = this.f6678b.hotel;
                V5.x.hotel(amVar2);
                amVar2.getUserProperties(this.white, this.yellow, this.f6677a, (aj) this.f6679c);
                return;
            default:
                long j5 = this.alpha;
                am amVar3 = this.f6678b.hotel;
                V5.x.hotel(amVar3);
                amVar3.logEvent(this.white, this.yellow, (Bundle) this.f6679c, this.f6677a, true, j5);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.F
    public void bravo() {
        switch (this.teal) {
            case 1:
                ((aj) this.f6679c).november(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(J j5, String str, String str2, boolean z2, aj ajVar) {
        super(j5, true);
        this.teal = 1;
        this.white = str;
        this.yellow = str2;
        this.f6677a = z2;
        this.f6679c = ajVar;
        this.f6678b = j5;
    }
}
