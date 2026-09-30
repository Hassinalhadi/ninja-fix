package T5;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import av.ao;
import bv.aw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import id.C1915c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class r implements com.google.android.gms.common.api.h, com.google.android.gms.common.api.i {
    public final com.google.android.gms.common.api.c hotel;
    public final b india;
    public final J2.l juliet;
    public final int mike;
    public final ad november;
    public boolean oscar;
    public final /* synthetic */ e sierra;
    public final LinkedList golf = new LinkedList();
    public final HashSet kilo = new HashSet();
    public final HashMap lima = new HashMap();
    public final ArrayList papa = new ArrayList();
    public ConnectionResult quebec = null;
    public int romeo = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public r(e eVar, com.google.android.gms.common.api.g gVar) {
        this.sierra = eVar;
        Looper looper = eVar.november.getLooper();
        C1915c alpha = gVar.alpha();
        ao aoVar = new ao((bv.f) alpha.purple, (String) alpha.red, (String) alpha.silver);
        D6.b bVar = gVar.charlie.alpha;
        V5.x.hotel(bVar);
        com.google.android.gms.common.api.c alpha2 = bVar.alpha(gVar.alpha, looper, aoVar, gVar.delta, this, this);
        String str = gVar.bravo;
        if (str != null && (alpha2 instanceof V5.e)) {
            ((V5.e) alpha2).sierra = str;
        }
        if (str != null && (alpha2 instanceof k)) {
            ao.ad.cyan(alpha2);
            throw null;
        }
        this.hotel = alpha2;
        this.india = gVar.echo;
        this.juliet = new J2.l(16);
        this.mike = gVar.foxtrot;
        if (alpha2.lima()) {
            Context context = eVar.echo;
            com.google.android.gms.internal.measurement.ai aiVar = eVar.november;
            C1915c alpha3 = gVar.alpha();
            this.november = new ad(context, aiVar, new ao((bv.f) alpha3.purple, (String) alpha3.red, (String) alpha3.silver));
            return;
        }
        this.november = null;
    }

    public final void alpha(ConnectionResult connectionResult) {
        String str;
        HashSet hashSet = this.kilo;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ag agVar = (ag) it.next();
            if (V5.x.lima(connectionResult, ConnectionResult.teal)) {
                this.hotel.delta();
                str = "com.google.android.gms";
            } else {
                str = null;
            }
            agVar.alpha(this.india, connectionResult, str);
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.common.api.h
    public final void bravo(int i4) {
        Looper myLooper = Looper.myLooper();
        e eVar = this.sierra;
        if (myLooper == eVar.november.getLooper()) {
            india(i4);
        } else {
            eVar.november.post(new K1.i(this, i4, 1));
        }
    }

    @Override // com.google.android.gms.common.api.h
    public final void charlie() {
        Looper myLooper = Looper.myLooper();
        e eVar = this.sierra;
        if (myLooper == eVar.november.getLooper()) {
            hotel();
        } else {
            eVar.november.post(new F6.b(5, this));
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void delta(ConnectionResult connectionResult) {
        oscar(connectionResult, null);
    }

    public final void echo(Status status) {
        V5.x.delta(this.sierra.november);
        foxtrot(status, null, false);
    }

    public final void foxtrot(Status status, RuntimeException runtimeException, boolean z2) {
        boolean z10;
        V5.x.delta(this.sierra.november);
        boolean z11 = true;
        if (status != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (runtimeException != null) {
            z11 = false;
        }
        if (z10 != z11) {
            Iterator it = this.golf.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (!z2 || wVar.alpha == 2) {
                    if (status != null) {
                        wVar.charlie(status);
                    } else {
                        wVar.delta(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void golf() {
        LinkedList linkedList = this.golf;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            w wVar = (w) arrayList.get(i4);
            if (this.hotel.golf()) {
                if (kilo(wVar)) {
                    linkedList.remove(wVar);
                }
            } else {
                return;
            }
        }
    }

    public final void hotel() {
        com.google.android.gms.common.api.c cVar = this.hotel;
        e eVar = this.sierra;
        V5.x.delta(eVar.november);
        this.quebec = null;
        alpha(ConnectionResult.teal);
        if (this.oscar) {
            com.google.android.gms.internal.measurement.ai aiVar = eVar.november;
            b bVar = this.india;
            aiVar.removeMessages(11, bVar);
            eVar.november.removeMessages(9, bVar);
            this.oscar = false;
        }
        Iterator it = this.lima.values().iterator();
        while (it.hasNext()) {
            o oVar = ((ab) it.next()).alpha;
            try {
                ((l) oVar.echo).alpha.accept(cVar, new G6.h());
            } catch (DeadObjectException unused) {
                bravo(3);
                cVar.bravo("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        golf();
        juliet();
    }

    public final void india(int i4) {
        e eVar = this.sierra;
        V5.x.delta(eVar.november);
        this.quebec = null;
        this.oscar = true;
        String juliet = this.hotel.juliet();
        J2.l lVar = this.juliet;
        lVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (juliet != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(juliet);
        }
        lVar.tango(new Status(20, sb2.toString(), null, null), true);
        com.google.android.gms.internal.measurement.ai aiVar = eVar.november;
        b bVar = this.india;
        aiVar.sendMessageDelayed(Message.obtain(aiVar, 9, bVar), 5000L);
        com.google.android.gms.internal.measurement.ai aiVar2 = eVar.november;
        aiVar2.sendMessageDelayed(Message.obtain(aiVar2, 11, bVar), 120000L);
        ((SparseIntArray) eVar.golf.purple).clear();
        Iterator it = this.lima.values().iterator();
        while (it.hasNext()) {
            ((ab) it.next()).getClass();
        }
    }

    public final void juliet() {
        e eVar = this.sierra;
        com.google.android.gms.internal.measurement.ai aiVar = eVar.november;
        b bVar = this.india;
        aiVar.removeMessages(12, bVar);
        com.google.android.gms.internal.measurement.ai aiVar2 = eVar.november;
        aiVar2.sendMessageDelayed(aiVar2.obtainMessage(12, bVar), eVar.alpha);
    }

    public final boolean kilo(w wVar) {
        boolean z2;
        Feature feature;
        if (wVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            com.google.android.gms.common.api.c cVar = this.hotel;
            wVar.foxtrot(this.juliet, cVar.lima());
            try {
                wVar.echo(this);
                return true;
            } catch (DeadObjectException unused) {
                bravo(1);
                cVar.bravo("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            Feature[] bravo = wVar.bravo(this);
            if (bravo != null && bravo.length != 0) {
                Feature[] india = this.hotel.india();
                if (india == null) {
                    india = new Feature[0];
                }
                aw awVar = new aw(india.length);
                for (Feature feature2 : india) {
                    awVar.put(feature2.alpha, Long.valueOf(feature2.o()));
                }
                int length = bravo.length;
                for (int i4 = 0; i4 < length; i4++) {
                    feature = bravo[i4];
                    Long l10 = (Long) awVar.get(feature.alpha);
                    if (l10 == null || l10.longValue() < feature.o()) {
                        break;
                    }
                }
            }
            feature = null;
            if (feature == null) {
                com.google.android.gms.common.api.c cVar2 = this.hotel;
                wVar.foxtrot(this.juliet, cVar2.lima());
                try {
                    wVar.echo(this);
                    return true;
                } catch (DeadObjectException unused2) {
                    bravo(1);
                    cVar2.bravo("DeadObjectException thrown while running ApiCallRunner.");
                }
            } else {
                Log.w("GoogleApiManager", this.hotel.getClass().getName() + " could not execute call because it requires feature (" + feature.alpha + ", " + feature.o() + ").");
                if (this.sierra.oscar && wVar.alpha(this)) {
                    s sVar = new s(this.india, feature);
                    int indexOf = this.papa.indexOf(sVar);
                    if (indexOf >= 0) {
                        s sVar2 = (s) this.papa.get(indexOf);
                        this.sierra.november.removeMessages(15, sVar2);
                        com.google.android.gms.internal.measurement.ai aiVar = this.sierra.november;
                        aiVar.sendMessageDelayed(Message.obtain(aiVar, 15, sVar2), 5000L);
                    } else {
                        this.papa.add(sVar);
                        com.google.android.gms.internal.measurement.ai aiVar2 = this.sierra.november;
                        aiVar2.sendMessageDelayed(Message.obtain(aiVar2, 15, sVar), 5000L);
                        com.google.android.gms.internal.measurement.ai aiVar3 = this.sierra.november;
                        aiVar3.sendMessageDelayed(Message.obtain(aiVar3, 16, sVar), 120000L);
                        ConnectionResult connectionResult = new ConnectionResult(2, null);
                        if (!lima(connectionResult)) {
                            e eVar = this.sierra;
                            eVar.foxtrot.zah(eVar.echo, connectionResult, this.mike);
                        }
                    }
                    return false;
                }
                wVar.delta(new UnsupportedApiCallException(feature));
                return true;
            }
        }
        return true;
    }

    public final boolean lima(ConnectionResult connectionResult) {
        synchronized (e.romeo) {
            try {
                e eVar = this.sierra;
                if (eVar.kilo != null && eVar.lima.contains(this.india)) {
                    this.sierra.kilo.juliet(connectionResult, this.mike);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void mike() {
        e eVar = this.sierra;
        V5.x.delta(eVar.november);
        com.google.android.gms.common.api.c cVar = this.hotel;
        if (!cVar.golf() && !cVar.charlie()) {
            try {
                w.o oVar = eVar.golf;
                Context context = eVar.echo;
                oVar.getClass();
                V5.x.hotel(context);
                int hotel = cVar.hotel();
                SparseIntArray sparseIntArray = (SparseIntArray) oVar.purple;
                int i4 = sparseIntArray.get(hotel, -1);
                if (i4 == -1) {
                    i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i5 < sparseIntArray.size()) {
                            int keyAt = sparseIntArray.keyAt(i5);
                            if (keyAt > hotel && sparseIntArray.get(keyAt) == 0) {
                                break;
                            } else {
                                i5++;
                            }
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 == -1) {
                        i4 = ((GoogleApiAvailability) oVar.red).isGooglePlayServicesAvailable(context, hotel);
                    }
                    sparseIntArray.put(hotel, i4);
                }
                if (i4 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(i4, null);
                    Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + connectionResult.toString());
                    oscar(connectionResult, null);
                    return;
                }
                O7.u uVar = new O7.u(eVar, cVar, this.india);
                if (cVar.lima()) {
                    ad adVar = this.november;
                    V5.x.hotel(adVar);
                    E6.a aVar = adVar.mike;
                    if (aVar != null) {
                        aVar.echo();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(adVar));
                    ao aoVar = adVar.lima;
                    aoVar.white = valueOf;
                    com.google.android.gms.internal.measurement.ai aiVar = adVar.india;
                    adVar.mike = (E6.a) adVar.juliet.alpha(adVar.hotel, aiVar.getLooper(), aoVar, (D6.a) aoVar.teal, adVar, adVar);
                    adVar.november = uVar;
                    Set set = adVar.kilo;
                    if (set != null && !set.isEmpty()) {
                        E6.a aVar2 = adVar.mike;
                        aVar2.getClass();
                        aVar2.mike(new V5.l(aVar2));
                    } else {
                        aiVar.post(new F6.b(7, adVar));
                    }
                }
                try {
                    cVar.mike(uVar);
                } catch (SecurityException e) {
                    oscar(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e4) {
                oscar(new ConnectionResult(10), e4);
            }
        }
    }

    public final void november(w wVar) {
        V5.x.delta(this.sierra.november);
        boolean golf = this.hotel.golf();
        LinkedList linkedList = this.golf;
        if (golf) {
            if (kilo(wVar)) {
                juliet();
                return;
            } else {
                linkedList.add(wVar);
                return;
            }
        }
        linkedList.add(wVar);
        ConnectionResult connectionResult = this.quebec;
        if (connectionResult != null && connectionResult.purple != 0 && connectionResult.red != null) {
            oscar(connectionResult, null);
        } else {
            mike();
        }
    }

    public final void oscar(ConnectionResult connectionResult, RuntimeException runtimeException) {
        E6.a aVar;
        V5.x.delta(this.sierra.november);
        ad adVar = this.november;
        if (adVar != null && (aVar = adVar.mike) != null) {
            aVar.echo();
        }
        V5.x.delta(this.sierra.november);
        this.quebec = null;
        ((SparseIntArray) this.sierra.golf.purple).clear();
        alpha(connectionResult);
        if ((this.hotel instanceof X5.c) && connectionResult.purple != 24) {
            e eVar = this.sierra;
            eVar.bravo = true;
            com.google.android.gms.internal.measurement.ai aiVar = eVar.november;
            aiVar.sendMessageDelayed(aiVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.purple == 4) {
            echo(e.quebec);
            return;
        }
        if (this.golf.isEmpty()) {
            this.quebec = connectionResult;
            return;
        }
        if (runtimeException != null) {
            V5.x.delta(this.sierra.november);
            foxtrot(null, runtimeException, false);
            return;
        }
        if (this.sierra.oscar) {
            foxtrot(e.charlie(this.india, connectionResult), null, true);
            if (!this.golf.isEmpty() && !lima(connectionResult)) {
                e eVar2 = this.sierra;
                if (!eVar2.foxtrot.zah(eVar2.echo, connectionResult, this.mike)) {
                    if (connectionResult.purple == 18) {
                        this.oscar = true;
                    }
                    if (this.oscar) {
                        e eVar3 = this.sierra;
                        b bVar = this.india;
                        com.google.android.gms.internal.measurement.ai aiVar2 = eVar3.november;
                        aiVar2.sendMessageDelayed(Message.obtain(aiVar2, 9, bVar), 5000L);
                        return;
                    }
                    echo(e.charlie(this.india, connectionResult));
                    return;
                }
                return;
            }
            return;
        }
        echo(e.charlie(this.india, connectionResult));
    }

    public final void papa(ConnectionResult connectionResult) {
        V5.x.delta(this.sierra.november);
        com.google.android.gms.common.api.c cVar = this.hotel;
        cVar.bravo("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        oscar(connectionResult, null);
    }

    public final void quebec() {
        V5.x.delta(this.sierra.november);
        Status status = e.papa;
        echo(status);
        this.juliet.tango(status, false);
        for (i iVar : (i[]) this.lima.keySet().toArray(new i[0])) {
            november(new ae(iVar, new G6.h()));
        }
        alpha(new ConnectionResult(4));
        com.google.android.gms.common.api.c cVar = this.hotel;
        if (cVar.golf()) {
            cVar.foxtrot(new O7.l(6, this));
        }
    }
}
