package E6;

import V5.f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import av.ao;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.measurement.AbstractC1394y;

/* loaded from: classes2.dex */
public final class a extends f implements com.google.android.gms.common.api.c {
    public final ao amber;
    public final Bundle azure;
    public final Integer beige;
    public final boolean zulu;

    public a(Context context, Looper looper, ao aoVar, Bundle bundle, h hVar, i iVar) {
        super(context, looper, 44, aoVar, hVar, iVar);
        this.zulu = true;
        this.amber = aoVar;
        this.azure = bundle;
        this.beige = (Integer) aoVar.white;
    }

    @Override // V5.e, com.google.android.gms.common.api.c
    public final int hotel() {
        return e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // V5.e, com.google.android.gms.common.api.c
    public final boolean lima() {
        return this.zulu;
    }

    @Override // V5.e
    public final IInterface oscar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new AbstractC1394y(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // V5.e
    public final Bundle romeo() {
        ao aoVar = this.amber;
        boolean equals = this.charlie.getPackageName().equals((String) aoVar.red);
        Bundle bundle = this.azure;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) aoVar.red);
        }
        return bundle;
    }

    @Override // V5.e
    public final String uniform() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // V5.e
    public final String victor() {
        return "com.google.android.gms.signin.service.START";
    }
}
