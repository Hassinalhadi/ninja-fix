package T5;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import bd.ExecutorC0753f;
import bv.C0762a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.common.zzac;
import e6.AbstractC1630b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import s6.AbstractC2618b7;
import s6.AbstractC2627c7;

/* loaded from: classes2.dex */
public final class e implements Handler.Callback {
    public static final Status papa = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status quebec = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object romeo = new Object();
    public static e sierra;
    public TelemetryData charlie;
    public X5.b delta;
    public final Context echo;
    public final GoogleApiAvailability foxtrot;
    public final w.o golf;
    public final com.google.android.gms.internal.measurement.ai november;
    public volatile boolean oscar;
    public long alpha = 10000;
    public boolean bravo = false;
    public final AtomicInteger hotel = new AtomicInteger(1);
    public final AtomicInteger india = new AtomicInteger(0);
    public final ConcurrentHashMap juliet = new ConcurrentHashMap(5, 0.75f, 1);
    public p kilo = null;
    public final bv.f lima = new bv.f(0);
    public final bv.f mike = new bv.f(0);

    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Handler, com.google.android.gms.internal.measurement.ai] */
    public e(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.oscar = true;
        this.echo = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.november = handler;
        this.foxtrot = googleApiAvailability;
        this.golf = new w.o(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1630b.foxtrot == null) {
            AbstractC1630b.foxtrot = Boolean.valueOf(AbstractC1630b.delta() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC1630b.foxtrot.booleanValue()) {
            this.oscar = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status charlie(b bVar, ConnectionResult connectionResult) {
        return new Status(17, av.q.foxtrot("API: ", bVar.bravo.bravo, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.red, connectionResult);
    }

    public static e foxtrot(Context context) {
        e eVar;
        synchronized (romeo) {
            try {
                if (sierra == null) {
                    sierra = new e(context.getApplicationContext(), V5.ag.bravo().getLooper(), GoogleApiAvailability.getInstance());
                }
                eVar = sierra;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final void alpha(p pVar) {
        synchronized (romeo) {
            try {
                if (this.kilo != pVar) {
                    this.kilo = pVar;
                    this.lima.clear();
                }
                this.lima.addAll(pVar.white);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean bravo() {
        if (!this.bravo) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) V5.l.echo().alpha;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.purple) {
                int i4 = ((SparseIntArray) this.golf.purple).get(203400000, -1);
                if (i4 != -1 && i4 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final r delta(com.google.android.gms.common.api.g gVar) {
        ConcurrentHashMap concurrentHashMap = this.juliet;
        b bVar = gVar.echo;
        r rVar = (r) concurrentHashMap.get(bVar);
        if (rVar == null) {
            rVar = new r(this, gVar);
            concurrentHashMap.put(bVar, rVar);
        }
        if (rVar.hotel.lima()) {
            this.mike.add(bVar);
        }
        rVar.mike();
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void echo(G6.h hVar, int i4, com.google.android.gms.common.api.g gVar) {
        y yVar;
        e eVar;
        long j5;
        if (i4 != 0) {
            b bVar = gVar.echo;
            if (bravo()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) V5.l.echo().alpha;
                boolean z2 = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.purple) {
                        r rVar = (r) this.juliet.get(bVar);
                        if (rVar != null) {
                            Object obj = rVar.hotel;
                            if (obj instanceof V5.e) {
                                V5.e eVar2 = (V5.e) obj;
                                if (eVar2.victor != null && !eVar2.charlie()) {
                                    ConnectionTelemetryConfiguration alpha = y.alpha(rVar, eVar2, i4);
                                    if (alpha != null) {
                                        rVar.romeo++;
                                        z2 = alpha.red;
                                    }
                                }
                            }
                        }
                        z2 = rootTelemetryConfiguration.red;
                    }
                }
                long j6 = 0;
                if (z2) {
                    j5 = System.currentTimeMillis();
                } else {
                    j5 = 0;
                }
                if (z2) {
                    j6 = SystemClock.elapsedRealtime();
                }
                long j7 = j6;
                eVar = this;
                yVar = new y(eVar, i4, bVar, j5, j7);
                if (yVar == null) {
                    G6.q qVar = hVar.alpha;
                    com.google.android.gms.internal.measurement.ai aiVar = eVar.november;
                    aiVar.getClass();
                    qVar.charlie(new ExecutorC0753f(aiVar, 2), yVar);
                    return;
                }
                return;
            }
            yVar = null;
            eVar = this;
            if (yVar == null) {
            }
        }
    }

    public final void golf(ConnectionResult connectionResult, int i4) {
        if (!this.foxtrot.zah(this.echo, connectionResult, i4)) {
            com.google.android.gms.internal.measurement.ai aiVar = this.november;
            aiVar.sendMessage(aiVar.obtainMessage(5, i4, 0, connectionResult));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x031e  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.common.api.g, X5.b] */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.google.android.gms.common.api.g, X5.b] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.google.android.gms.common.api.g, X5.b] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        r rVar;
        boolean z2;
        boolean isIsolated;
        Status status;
        Feature[] bravo;
        int i4 = message.what;
        com.google.android.gms.internal.measurement.ai aiVar = this.november;
        ConcurrentHashMap concurrentHashMap = this.juliet;
        V5.m mVar = V5.m.purple;
        long j5 = 300000;
        switch (i4) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j5 = 10000;
                }
                this.alpha = j5;
                aiVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    aiVar.sendMessageDelayed(aiVar.obtainMessage(12, (b) it.next()), this.alpha);
                }
                return true;
            case 2:
                ag agVar = (ag) message.obj;
                Iterator it2 = ((bv.b) agVar.alpha.keySet()).iterator();
                while (true) {
                    C0762a c0762a = (C0762a) it2;
                    if (c0762a.hasNext()) {
                        b bVar = (b) c0762a.next();
                        r rVar2 = (r) concurrentHashMap.get(bVar);
                        if (rVar2 == null) {
                            agVar.alpha(bVar, new ConnectionResult(13), null);
                            return true;
                        }
                        com.google.android.gms.common.api.c cVar = rVar2.hotel;
                        if (cVar.golf()) {
                            ConnectionResult connectionResult = ConnectionResult.teal;
                            cVar.delta();
                            agVar.alpha(bVar, connectionResult, "com.google.android.gms");
                        } else {
                            e eVar = rVar2.sierra;
                            V5.x.delta(eVar.november);
                            ConnectionResult connectionResult2 = rVar2.quebec;
                            if (connectionResult2 != null) {
                                agVar.alpha(bVar, connectionResult2, null);
                            } else {
                                V5.x.delta(eVar.november);
                                rVar2.kilo.add(agVar);
                                rVar2.mike();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (r rVar3 : concurrentHashMap.values()) {
                    V5.x.delta(rVar3.sierra.november);
                    rVar3.quebec = null;
                    rVar3.mike();
                }
                return true;
            case 4:
            case 8:
            case 13:
                aa aaVar = (aa) message.obj;
                r rVar4 = (r) concurrentHashMap.get(aaVar.charlie.echo);
                if (rVar4 == null) {
                    rVar4 = delta(aaVar.charlie);
                }
                boolean lima = rVar4.hotel.lima();
                w wVar = aaVar.alpha;
                if (lima && this.india.get() != aaVar.bravo) {
                    wVar.charlie(papa);
                    rVar4.quebec();
                    return true;
                }
                rVar4.november(wVar);
                return true;
            case 5:
                int i5 = message.arg1;
                ConnectionResult connectionResult3 = (ConnectionResult) message.obj;
                Iterator it3 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        rVar = (r) it3.next();
                        if (rVar.mike == i5) {
                        }
                    } else {
                        rVar = null;
                    }
                }
                if (rVar != null) {
                    int i10 = connectionResult3.purple;
                    if (i10 == 13) {
                        StringBuilder victor = Q0.c.victor("Error resolution was canceled by the user, original error message: ", this.foxtrot.getErrorString(i10), ": ");
                        victor.append(connectionResult3.silver);
                        rVar.echo(new Status(17, victor.toString(), null, null));
                        return true;
                    }
                    rVar.echo(charlie(rVar.india, connectionResult3));
                    return true;
                }
                Log.wtf("GoogleApiManager", av.q.delta(i5, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                return true;
            case 6:
                Context context = this.echo;
                if (context.getApplicationContext() instanceof Application) {
                    d.bravo((Application) context.getApplicationContext());
                    d dVar = d.teal;
                    dVar.alpha(new q(this));
                    AtomicBoolean atomicBoolean = dVar.purple;
                    boolean z10 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = dVar.alpha;
                    if (!z10) {
                        Boolean bool = AbstractC1630b.india;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object charlie = AbstractC2627c7.charlie(Process.class, "isIsolated", new com.google.android.play.core.integrity.c[0]);
                                    Object[] objArr = new Object[0];
                                    if (charlie != null) {
                                        bool = (Boolean) charlie;
                                    } else {
                                        throw new zzac(AbstractC2618b7.charlie(objArr));
                                    }
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            AbstractC1630b.india = bool;
                        }
                        if (!bool.booleanValue()) {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        } else {
                            z2 = true;
                            if (!z2) {
                                this.alpha = 300000L;
                            }
                        }
                    }
                    z2 = atomicBoolean2.get();
                    if (!z2) {
                    }
                }
                return true;
            case 7:
                delta((com.google.android.gms.common.api.g) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    r rVar5 = (r) concurrentHashMap.get(message.obj);
                    V5.x.delta(rVar5.sierra.november);
                    if (rVar5.oscar) {
                        rVar5.mike();
                        return true;
                    }
                }
                return true;
            case 10:
                bv.f fVar = this.mike;
                fVar.getClass();
                C0762a c0762a2 = new C0762a(fVar);
                while (c0762a2.hasNext()) {
                    r rVar6 = (r) concurrentHashMap.remove((b) c0762a2.next());
                    if (rVar6 != null) {
                        rVar6.quebec();
                    }
                }
                fVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    r rVar7 = (r) concurrentHashMap.get(message.obj);
                    e eVar2 = rVar7.sierra;
                    V5.x.delta(eVar2.november);
                    boolean z11 = rVar7.oscar;
                    if (z11) {
                        if (z11) {
                            e eVar3 = rVar7.sierra;
                            com.google.android.gms.internal.measurement.ai aiVar2 = eVar3.november;
                            b bVar2 = rVar7.india;
                            aiVar2.removeMessages(11, bVar2);
                            eVar3.november.removeMessages(9, bVar2);
                            rVar7.oscar = false;
                        }
                        if (eVar2.foxtrot.isGooglePlayServicesAvailable(eVar2.echo) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null);
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.", null, null);
                        }
                        rVar7.echo(status);
                        rVar7.hotel.bravo("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    r rVar8 = (r) concurrentHashMap.get(message.obj);
                    V5.x.delta(rVar8.sierra.november);
                    com.google.android.gms.common.api.c cVar2 = rVar8.hotel;
                    if (cVar2.golf() && rVar8.lima.isEmpty()) {
                        J2.l lVar = rVar8.juliet;
                        if (((Map) lVar.alpha).isEmpty() && ((Map) lVar.purple).isEmpty()) {
                            cVar2.bravo("Timing out service connection.");
                            return true;
                        }
                        rVar8.juliet();
                    }
                    return true;
                }
                return true;
            case 14:
                throw A0.z.hotel(message.obj);
            case 15:
                s sVar = (s) message.obj;
                if (concurrentHashMap.containsKey(sVar.alpha)) {
                    r rVar9 = (r) concurrentHashMap.get(sVar.alpha);
                    if (rVar9.papa.contains(sVar) && !rVar9.oscar) {
                        if (!rVar9.hotel.golf()) {
                            rVar9.mike();
                            return true;
                        }
                        rVar9.golf();
                        return true;
                    }
                }
                return true;
            case 16:
                s sVar2 = (s) message.obj;
                if (concurrentHashMap.containsKey(sVar2.alpha)) {
                    r rVar10 = (r) concurrentHashMap.get(sVar2.alpha);
                    if (rVar10.papa.remove(sVar2)) {
                        e eVar4 = rVar10.sierra;
                        eVar4.november.removeMessages(15, sVar2);
                        eVar4.november.removeMessages(16, sVar2);
                        LinkedList linkedList = rVar10.golf;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it4 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it4.hasNext();
                            Feature feature = sVar2.bravo;
                            if (hasNext) {
                                w wVar2 = (w) it4.next();
                                if (wVar2 != null && (bravo = wVar2.bravo(rVar10)) != null) {
                                    int length = bravo.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= length) {
                                            break;
                                        }
                                        if (V5.x.lima(bravo[i11], feature)) {
                                            if (i11 >= 0) {
                                                arrayList.add(wVar2);
                                            }
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    w wVar3 = (w) arrayList.get(i12);
                                    linkedList.remove(wVar3);
                                    wVar3.delta(new UnsupportedApiCallException(feature));
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.charlie;
                if (telemetryData != null) {
                    if (telemetryData.alpha > 0 || bravo()) {
                        if (this.delta == null) {
                            this.delta = new com.google.android.gms.common.api.g(this.echo, null, X5.b.india, mVar, com.google.android.gms.common.api.f.bravo);
                        }
                        this.delta.echo(telemetryData);
                    }
                    this.charlie = null;
                    return true;
                }
                return true;
            case 18:
                z zVar = (z) message.obj;
                long j6 = zVar.charlie;
                MethodInvocation methodInvocation = zVar.alpha;
                int i13 = zVar.bravo;
                if (j6 == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i13, Arrays.asList(methodInvocation));
                    if (this.delta == null) {
                        this.delta = new com.google.android.gms.common.api.g(this.echo, null, X5.b.india, mVar, com.google.android.gms.common.api.f.bravo);
                    }
                    this.delta.echo(telemetryData2);
                    return true;
                }
                TelemetryData telemetryData3 = this.charlie;
                if (telemetryData3 != null) {
                    List list = telemetryData3.purple;
                    if (telemetryData3.alpha == i13 && (list == null || list.size() < zVar.delta)) {
                        TelemetryData telemetryData4 = this.charlie;
                        if (telemetryData4.purple == null) {
                            telemetryData4.purple = new ArrayList();
                        }
                        telemetryData4.purple.add(methodInvocation);
                    } else {
                        aiVar.removeMessages(17);
                        TelemetryData telemetryData5 = this.charlie;
                        if (telemetryData5 != null) {
                            if (telemetryData5.alpha > 0 || bravo()) {
                                if (this.delta == null) {
                                    this.delta = new com.google.android.gms.common.api.g(this.echo, null, X5.b.india, mVar, com.google.android.gms.common.api.f.bravo);
                                }
                                this.delta.echo(telemetryData5);
                            }
                            this.charlie = null;
                        }
                    }
                }
                if (this.charlie == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(methodInvocation);
                    this.charlie = new TelemetryData(i13, arrayList2);
                    aiVar.sendMessageDelayed(aiVar.obtainMessage(17), zVar.charlie);
                    return true;
                }
                return true;
            case 19:
                this.bravo = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i4);
                return false;
        }
    }
}
