package Z5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import m6.AbstractC2104e;

/* loaded from: classes2.dex */
public final class g extends V5.f {
    @Override // V5.e, com.google.android.gms.common.api.c
    public final int hotel() {
        return 17895000;
    }

    @Override // V5.e
    public final IInterface oscar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new AbstractC1394y(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 1);
    }

    @Override // V5.e
    public final Feature[] quebec() {
        return AbstractC2104e.delta;
    }

    @Override // V5.e
    public final String uniform() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // V5.e
    public final String victor() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // V5.e
    public final boolean whiskey() {
        return true;
    }
}
