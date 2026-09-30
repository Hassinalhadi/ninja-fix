package V5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import m6.AbstractBinderC2100a;
import o6.AbstractC2197a;

/* loaded from: classes2.dex */
public final class z extends AbstractBinderC2100a {
    public e hotel;
    public final int india;

    public z(e eVar, int i4) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.hotel = eVar;
        this.india = i4;
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean jade(int i4, Parcel parcel, Parcel parcel2) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                zzk zzkVar = (zzk) AbstractC2197a.alpha(parcel, zzk.CREATOR);
                AbstractC2197a.bravo(parcel);
                e eVar = this.hotel;
                x.india(eVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                x.hotel(zzkVar);
                eVar.victor = zzkVar;
                if (eVar.yankee()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.silver;
                    l echo = l.echo();
                    if (connectionTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = null;
                    } else {
                        rootTelemetryConfiguration = connectionTelemetryConfiguration.alpha;
                    }
                    synchronized (echo) {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = l.charlie;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) echo.alpha;
                            if (rootTelemetryConfiguration2 != null) {
                                if (rootTelemetryConfiguration2.alpha < rootTelemetryConfiguration.alpha) {
                                }
                            }
                        }
                        echo.alpha = rootTelemetryConfiguration;
                    }
                }
                Bundle bundle = zzkVar.alpha;
                x.india(this.hotel, "onPostInitComplete can be called only once per call to getRemoteService");
                e eVar2 = this.hotel;
                eVar2.getClass();
                ab abVar = new ab(eVar2, readInt, readStrongBinder, bundle);
                y yVar = eVar2.foxtrot;
                yVar.sendMessage(yVar.obtainMessage(1, this.india, -1, abVar));
                this.hotel = null;
            } else {
                parcel.readInt();
                AbstractC2197a.bravo(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) AbstractC2197a.alpha(parcel, Bundle.CREATOR);
            AbstractC2197a.bravo(parcel);
            x.india(this.hotel, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.hotel;
            eVar3.getClass();
            ab abVar2 = new ab(eVar3, readInt2, readStrongBinder2, bundle2);
            y yVar2 = eVar3.foxtrot;
            yVar2.sendMessage(yVar2.obtainMessage(1, this.india, -1, abVar2));
            this.hotel = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
