package V5;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class e {
    public static final Feature[] xray = new Feature[0];
    public ai bravo;
    public final Context charlie;
    public final ag delta;
    public final com.google.android.gms.common.d echo;
    public final y foxtrot;
    public t india;
    public d juliet;
    public IInterface kilo;
    public aa mike;
    public final b oscar;
    public final c papa;
    public final int quebec;
    public final String romeo;
    public volatile String sierra;
    public volatile String alpha = null;
    public final Object golf = new Object();
    public final Object hotel = new Object();
    public final ArrayList lima = new ArrayList();
    public int november = 1;
    public ConnectionResult tango = null;
    public boolean uniform = false;
    public volatile zzk victor = null;
    public final AtomicInteger whiskey = new AtomicInteger(0);

    public e(Context context, Looper looper, ag agVar, com.google.android.gms.common.d dVar, int i4, b bVar, c cVar, String str) {
        x.india(context, "Context must not be null");
        this.charlie = context;
        x.india(looper, "Looper must not be null");
        x.india(agVar, "Supervisor must not be null");
        this.delta = agVar;
        x.india(dVar, "API availability must not be null");
        this.echo = dVar;
        this.foxtrot = new y(this, looper);
        this.quebec = i4;
        this.oscar = bVar;
        this.papa = cVar;
        this.romeo = str;
    }

    public static /* bridge */ /* synthetic */ boolean amber(e eVar, int i4, int i5, IInterface iInterface) {
        synchronized (eVar.golf) {
            try {
                if (eVar.november != i4) {
                    return false;
                }
                eVar.azure(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zulu(e eVar) {
        int i4;
        int i5;
        synchronized (eVar.golf) {
            i4 = eVar.november;
        }
        if (i4 == 3) {
            eVar.uniform = true;
            i5 = 5;
        } else {
            i5 = 4;
        }
        y yVar = eVar.foxtrot;
        yVar.sendMessage(yVar.obtainMessage(i5, eVar.whiskey.get(), 16));
    }

    public final void azure(int i4, IInterface iInterface) {
        boolean z2;
        boolean z10;
        ai aiVar;
        boolean z11 = false;
        if (i4 != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (iInterface == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z2 == z10) {
            z11 = true;
        }
        x.bravo(z11);
        synchronized (this.golf) {
            try {
                this.november = i4;
                this.kilo = iInterface;
                Bundle bundle = null;
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        if (i4 == 4) {
                            x.hotel(iInterface);
                            System.currentTimeMillis();
                        }
                    } else {
                        aa aaVar = this.mike;
                        if (aaVar != null && (aiVar = this.bravo) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + aiVar.bravo + " on com.google.android.gms");
                            ag agVar = this.delta;
                            String str = this.bravo.bravo;
                            x.hotel(str);
                            this.bravo.getClass();
                            if (this.romeo == null) {
                                this.charlie.getClass();
                            }
                            agVar.delta(str, aaVar, this.bravo.alpha);
                            this.whiskey.incrementAndGet();
                        }
                        aa aaVar2 = new aa(this, this.whiskey.get());
                        this.mike = aaVar2;
                        String victor = victor();
                        boolean whiskey = whiskey();
                        this.bravo = new ai(victor, whiskey);
                        if (whiskey && hotel() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.bravo.bravo)));
                        }
                        ag agVar2 = this.delta;
                        String str2 = this.bravo.bravo;
                        x.hotel(str2);
                        this.bravo.getClass();
                        String str3 = this.romeo;
                        if (str3 == null) {
                            str3 = this.charlie.getClass().getName();
                        }
                        ConnectionResult charlie = agVar2.charlie(new ad(str2, this.bravo.alpha), aaVar2, str3, null);
                        if (!charlie.o()) {
                            Log.w("GmsClient", "unable to connect to service: " + this.bravo.bravo + " on com.google.android.gms");
                            int i5 = charlie.purple;
                            if (i5 == -1) {
                                i5 = 16;
                            }
                            if (charlie.red != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", charlie.red);
                            }
                            int i10 = this.whiskey.get();
                            ac acVar = new ac(this, i5, bundle);
                            y yVar = this.foxtrot;
                            yVar.sendMessage(yVar.obtainMessage(7, i10, -1, acVar));
                        }
                    }
                } else {
                    aa aaVar3 = this.mike;
                    if (aaVar3 != null) {
                        ag agVar3 = this.delta;
                        String str4 = this.bravo.bravo;
                        x.hotel(str4);
                        this.bravo.getClass();
                        if (this.romeo == null) {
                            this.charlie.getClass();
                        }
                        agVar3.delta(str4, aaVar3, this.bravo.alpha);
                        this.mike = null;
                    }
                }
            } finally {
            }
        }
    }

    public final void bravo(String str) {
        this.alpha = str;
        echo();
    }

    public final boolean charlie() {
        boolean z2;
        synchronized (this.golf) {
            int i4 = this.november;
            z2 = true;
            if (i4 != 2 && i4 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    public final void delta() {
        if (golf() && this.bravo != null) {
        } else {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void echo() {
        this.whiskey.incrementAndGet();
        synchronized (this.lima) {
            try {
                int size = this.lima.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((r) this.lima.get(i4)).charlie();
                }
                this.lima.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.hotel) {
            this.india = null;
        }
        azure(1, null);
    }

    public final void foxtrot(O7.l lVar) {
        ((T5.r) lVar.purple).sierra.november.post(new F6.b(6, lVar));
    }

    public final boolean golf() {
        boolean z2;
        synchronized (this.golf) {
            if (this.november == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public abstract int hotel();

    public final Feature[] india() {
        zzk zzkVar = this.victor;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.purple;
    }

    public final String juliet() {
        return this.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kilo(h hVar, Set set) {
        String str;
        Bundle romeo = romeo();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.sierra;
        } else {
            str = this.sierra;
        }
        String str2 = str;
        int i4 = this.quebec;
        int i5 = com.google.android.gms.common.d.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.f6642h;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f6643i;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i4, i5, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str2);
        getServiceRequest.silver = this.charlie.getPackageName();
        getServiceRequest.yellow = romeo;
        if (set != null) {
            getServiceRequest.white = (Scope[]) set.toArray(new Scope[0]);
        }
        if (lima()) {
            Account papa = papa();
            if (papa == null) {
                papa = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f6644a = papa;
            if (hVar != 0) {
                getServiceRequest.teal = ((AbstractC1394y) hVar).hotel;
            }
        } else if (this instanceof w6.g) {
            getServiceRequest.f6644a = null;
        }
        getServiceRequest.f6645b = xray;
        getServiceRequest.f6646c = quebec();
        if (yankee()) {
            getServiceRequest.f6648f = true;
        }
        try {
            synchronized (this.hotel) {
                try {
                    t tVar = this.india;
                    if (tVar != null) {
                        tVar.bravo(new z(this, this.whiskey.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i10 = this.whiskey.get();
            y yVar = this.foxtrot;
            yVar.sendMessage(yVar.obtainMessage(6, i10, 3));
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i11 = this.whiskey.get();
            ab abVar = new ab(this, 8, null, null);
            y yVar2 = this.foxtrot;
            yVar2.sendMessage(yVar2.obtainMessage(1, i11, -1, abVar));
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i112 = this.whiskey.get();
            ab abVar2 = new ab(this, 8, null, null);
            y yVar22 = this.foxtrot;
            yVar22.sendMessage(yVar22.obtainMessage(1, i112, -1, abVar2));
        }
    }

    public boolean lima() {
        return false;
    }

    public final void mike(d dVar) {
        this.juliet = dVar;
        azure(2, null);
    }

    public final void november() {
        int isGooglePlayServicesAvailable = this.echo.isGooglePlayServicesAvailable(this.charlie, hotel());
        if (isGooglePlayServicesAvailable != 0) {
            azure(1, null);
            this.juliet = new l(this);
            int i4 = this.whiskey.get();
            y yVar = this.foxtrot;
            yVar.sendMessage(yVar.obtainMessage(3, i4, isGooglePlayServicesAvailable, null));
            return;
        }
        mike(new l(this));
    }

    public abstract IInterface oscar(IBinder iBinder);

    public Account papa() {
        return null;
    }

    public Feature[] quebec() {
        return xray;
    }

    public Bundle romeo() {
        return new Bundle();
    }

    public Set sierra() {
        return Collections.EMPTY_SET;
    }

    public final IInterface tango() {
        IInterface iInterface;
        synchronized (this.golf) {
            try {
                if (this.november != 5) {
                    if (golf()) {
                        iInterface = this.kilo;
                        x.india(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String uniform();

    public abstract String victor();

    public boolean whiskey() {
        if (hotel() >= 211700000) {
            return true;
        }
        return false;
    }

    public void xray() {
        System.currentTimeMillis();
    }

    public boolean yankee() {
        return this instanceof Z5.g;
    }
}
