package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class K implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ zzr purple;
    public final /* synthetic */ O red;

    public /* synthetic */ K(O o5, zzr zzrVar, int i4) {
        this.alpha = i4;
        this.purple = zzrVar;
        this.red = o5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                O o5 = this.red;
                o5.golf.echo();
                o5.golf.gold(this.purple);
                return;
            default:
                O o10 = this.red;
                o10.golf.echo();
                Z0 z02 = o10.golf;
                ao.ad.crimson(z02);
                zzr zzrVar = this.purple;
                V5.x.echo(zzrVar.alpha);
                z02.jade(zzrVar);
                z02.ivory(zzrVar);
                return;
        }
    }
}
