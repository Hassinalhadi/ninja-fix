package p6;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import av.ao;
import bv.aw;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzeg;
import com.google.android.gms.internal.identity.zzei;
import com.google.android.gms.internal.identity.zzem;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q extends V5.f {
    public final aw amber;
    public final aw azure;
    public final aw zulu;

    public q(Context context, Looper looper, ao aoVar, T5.r rVar, T5.r rVar2) {
        super(context, looper, 23, aoVar, rVar, rVar2);
        this.zulu = new aw(0);
        this.amber = new aw(0);
        this.azure = new aw(0);
    }

    public final void beige(zzem zzemVar, G6.h hVar) {
        if (black(com.google.android.gms.location.n.golf)) {
            ab abVar = (ab) tango();
            l lVar = new l(null, hVar);
            Parcel ivory = abVar.ivory();
            e.bravo(ivory, zzemVar);
            ivory.writeStrongBinder(lVar);
            abVar.lavender(ivory, 98);
            return;
        }
        ab abVar2 = (ab) tango();
        j jVar = new j(1, hVar);
        Parcel ivory2 = abVar2.ivory();
        e.bravo(ivory2, zzemVar);
        ivory2.writeStrongBinder(jVar);
        abVar2.lavender(ivory2, 74);
    }

    public final boolean black(Feature feature) {
        Feature feature2;
        Feature[] india = india();
        if (india != null) {
            int i4 = 0;
            while (true) {
                if (i4 < india.length) {
                    feature2 = india[i4];
                    if (feature.alpha.equals(feature2.alpha)) {
                        break;
                    }
                    i4++;
                } else {
                    feature2 = null;
                    break;
                }
            }
            if (feature2 != null && feature2.o() >= feature.o()) {
                return true;
            }
        }
        return false;
    }

    public final void blue(LastLocationRequest lastLocationRequest, G6.h hVar) {
        if (black(com.google.android.gms.location.n.foxtrot)) {
            ab abVar = (ab) tango();
            zzee zzeeVar = new zzee(4, null, new j(2, hVar), null, null);
            Parcel ivory = abVar.ivory();
            e.bravo(ivory, lastLocationRequest);
            e.bravo(ivory, zzeeVar);
            abVar.lavender(ivory, 90);
            return;
        }
        if (black(com.google.android.gms.location.n.charlie)) {
            ab abVar2 = (ab) tango();
            j jVar = new j(2, hVar);
            Parcel ivory2 = abVar2.ivory();
            e.bravo(ivory2, lastLocationRequest);
            ivory2.writeStrongBinder(jVar);
            abVar2.lavender(ivory2, 82);
            return;
        }
        ab abVar3 = (ab) tango();
        Parcel jade = abVar3.jade(abVar3.ivory(), 7);
        Location location = (Location) e.alpha(jade, Location.CREATOR);
        jade.recycle();
        hVar.bravo(location);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:4:0x0018, B:8:0x0026, B:10:0x003d, B:13:0x004e, B:14:0x008f, B:19:0x0061, B:20:0x002e), top: B:3:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:4:0x0018, B:8:0x0026, B:10:0x003d, B:13:0x004e, B:14:0x008f, B:19:0x0061, B:20:0x002e), top: B:3:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bronze(n nVar, LocationRequest locationRequest, G6.h hVar) {
        o oVar;
        o oVar2;
        K1.f zza = nVar.zza();
        T5.i iVar = (T5.i) zza.bravo;
        Objects.requireNonNull(iVar);
        boolean black = black(com.google.android.gms.location.n.foxtrot);
        synchronized (this.amber) {
            try {
                o oVar3 = (o) this.amber.get(iVar);
                if (oVar3 != null && !black) {
                    oVar3.hotel.alpha(zza);
                    oVar = oVar3;
                    oVar3 = null;
                    if (!black) {
                        ab abVar = (ab) tango();
                        String alpha = iVar.alpha();
                        if (oVar3 == null) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar3;
                        }
                        abVar.maroon(new zzee(2, oVar2, oVar, null, alpha), locationRequest, new l(null, hVar));
                    } else {
                        o oVar4 = oVar;
                        ((ab) tango()).magenta(new zzei(1, new zzeg(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, oVar4, null, new i(hVar, oVar4), iVar.alpha()));
                    }
                }
                o oVar5 = new o(nVar);
                this.amber.put(iVar, oVar5);
                oVar = oVar5;
                if (!black) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void coral(T5.i iVar, boolean z2, G6.h hVar) {
        synchronized (this.amber) {
            try {
                o oVar = (o) this.amber.remove(iVar);
                if (oVar == null) {
                    hVar.bravo(Boolean.FALSE);
                    return;
                }
                oVar.hotel.zza().alpha();
                if (z2) {
                    if (black(com.google.android.gms.location.n.foxtrot)) {
                        ab abVar = (ab) tango();
                        int identityHashCode = System.identityHashCode(oVar);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                        sb2.append("ILocationCallback@");
                        sb2.append(identityHashCode);
                        zzee zzeeVar = new zzee(2, null, oVar, null, sb2.toString());
                        l lVar = new l(Boolean.TRUE, hVar);
                        Parcel ivory = abVar.ivory();
                        e.bravo(ivory, zzeeVar);
                        ivory.writeStrongBinder(lVar);
                        abVar.lavender(ivory, 89);
                    } else {
                        ((ab) tango()).magenta(new zzei(2, null, null, oVar, null, new i(Boolean.TRUE, hVar), null));
                    }
                } else {
                    hVar.bravo(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V5.e, com.google.android.gms.common.api.c
    public final int hotel() {
        return 11717000;
    }

    @Override // V5.e
    public final /* synthetic */ IInterface oscar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof ab) {
            return (ab) queryLocalInterface;
        }
        return new ab(iBinder);
    }

    @Override // V5.e
    public final Feature[] quebec() {
        return com.google.android.gms.location.n.hotel;
    }

    @Override // V5.e
    public final String uniform() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // V5.e
    public final String victor() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // V5.e
    public final void xray() {
        System.currentTimeMillis();
        synchronized (this.zulu) {
            this.zulu.clear();
        }
        synchronized (this.amber) {
            this.amber.clear();
        }
        synchronized (this.azure) {
            this.azure.clear();
        }
    }

    @Override // V5.e
    public final boolean yankee() {
        return true;
    }
}
