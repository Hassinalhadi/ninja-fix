package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class N implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ zzr purple;
    public final /* synthetic */ Bundle red;
    public final /* synthetic */ O silver;

    public /* synthetic */ N(O o5, zzr zzrVar, Bundle bundle, int i4) {
        this.alpha = i4;
        this.purple = zzrVar;
        this.red = bundle;
        this.silver = o5;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.alpha) {
            case 0:
                O o5 = this.silver;
                o5.golf.echo();
                zzr zzrVar = this.purple;
                return o5.golf.delta(this.red, zzrVar);
            default:
                O o10 = this.silver;
                o10.golf.echo();
                zzr zzrVar2 = this.purple;
                return o10.golf.delta(this.red, zzrVar2);
        }
    }
}
