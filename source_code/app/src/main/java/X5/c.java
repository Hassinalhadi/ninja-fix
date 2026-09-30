package X5;

import T5.r;
import V5.f;
import V5.m;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import av.ao;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import m6.AbstractC2104e;

/* loaded from: classes2.dex */
public final class c extends f {
    public final m zulu;

    public c(Context context, Looper looper, ao aoVar, m mVar, r rVar, r rVar2) {
        super(context, looper, 270, aoVar, rVar, rVar2);
        this.zulu = mVar;
    }

    @Override // V5.e, com.google.android.gms.common.api.c
    public final int hotel() {
        return 203400000;
    }

    @Override // V5.e
    public final IInterface oscar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new AbstractC1394y(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // V5.e
    public final Feature[] quebec() {
        return AbstractC2104e.bravo;
    }

    @Override // V5.e
    public final Bundle romeo() {
        m mVar = this.zulu;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String str = mVar.alpha;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // V5.e
    public final String uniform() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // V5.e
    public final String victor() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // V5.e
    public final boolean whiskey() {
        return true;
    }
}
