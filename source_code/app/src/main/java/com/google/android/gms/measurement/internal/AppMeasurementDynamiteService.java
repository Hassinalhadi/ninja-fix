package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.maps.android.BuildConfig;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.al {
    public G golf;
    public final bv.e hotel;

    public static void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.aq aqVar) {
        try {
            aqVar.alpha();
        } catch (RemoteException e) {
            G g2 = appMeasurementDynamiteService.golf;
            V5.x.hotel(g2);
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bv.e, bv.aw] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.golf = null;
        this.hotel = new bv.aw(0);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void beginAdUnitExposure(String str, long j5) throws RemoteException {
        charlie();
        C1464q c1464q = this.golf.f7514j;
        G.charlie(c1464q);
        c1464q.X(j5, str);
    }

    public final void charlie() {
        if (this.golf != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.c0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void clearMeasurementEnabled(long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.X();
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.g0(new s6.E(11, c1459n0, null, false));
    }

    public final void delta(String str, com.google.android.gms.internal.measurement.ao aoVar) {
        charlie();
        d1 d1Var = this.golf.e;
        G.delta(d1Var);
        d1Var.y0(str, aoVar);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void endAdUnitExposure(String str, long j5) throws RemoteException {
        charlie();
        C1464q c1464q = this.golf.f7514j;
        G.charlie(c1464q);
        c1464q.Y(j5, str);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void generateEventId(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        d1 d1Var = this.golf.e;
        G.delta(d1Var);
        long h1 = d1Var.h1();
        charlie();
        d1 d1Var2 = this.golf.e;
        G.delta(d1Var2);
        d1Var2.x0(aoVar, h1);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getAppInstanceId(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        E e = this.golf.f7508c;
        G.foxtrot(e);
        e.g0(new s6.E(9, this, aoVar, false));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        delta((String) c1459n0.yellow.get(), aoVar);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        E e = this.golf.f7508c;
        G.foxtrot(e);
        e.g0(new ao.d(this, aoVar, str, str2, 7));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        String str;
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        C1480y0 c1480y0 = ((G) c1459n0.alpha).f7512h;
        G.echo(c1480y0);
        C1474v0 c1474v0 = c1480y0.red;
        if (c1474v0 != null) {
            str = c1474v0.bravo;
        } else {
            str = null;
        }
        delta(str, aoVar);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        String str;
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        C1480y0 c1480y0 = ((G) c1459n0.alpha).f7512h;
        G.echo(c1480y0);
        C1474v0 c1474v0 = c1480y0.red;
        if (c1474v0 != null) {
            str = c1474v0.alpha;
        } else {
            str = null;
        }
        delta(str, aoVar);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getGmpAppId(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        G g2 = (G) c1459n0.alpha;
        String str = null;
        if (!g2.yellow.j0(null, ac.f7601i0) && g2.november() != null) {
            str = g2.november();
        } else {
            try {
                str = W.golf(g2.alpha, g2.f7516l);
            } catch (IllegalStateException e) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.white.bravo(e, "getGoogleAppId failed with exception");
            }
        }
        delta(str, aoVar);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        V5.x.echo(str);
        ((G) c1459n0.alpha).getClass();
        charlie();
        d1 d1Var = this.golf.e;
        G.delta(d1Var);
        d1Var.w0(aoVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getSessionId(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.g0(new be.g(12, c1459n0, aoVar, false));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getTestFlag(com.google.android.gms.internal.measurement.ao aoVar, int i4) throws RemoteException {
        charlie();
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        d1 d1Var = this.golf.e;
                        G.delta(d1Var);
                        C1459n0 c1459n0 = this.golf.f7513i;
                        G.echo(c1459n0);
                        AtomicReference atomicReference = new AtomicReference();
                        E e = ((G) c1459n0.alpha).f7508c;
                        G.foxtrot(e);
                        d1Var.s0(aoVar, ((Boolean) e.b0(atomicReference, 15000L, "boolean test flag value", new RunnableC1451j0(c1459n0, atomicReference, 0))).booleanValue());
                        return;
                    }
                    d1 d1Var2 = this.golf.e;
                    G.delta(d1Var2);
                    C1459n0 c1459n02 = this.golf.f7513i;
                    G.echo(c1459n02);
                    AtomicReference atomicReference2 = new AtomicReference();
                    E e4 = ((G) c1459n02.alpha).f7508c;
                    G.foxtrot(e4);
                    d1Var2.w0(aoVar, ((Integer) e4.b0(atomicReference2, 15000L, "int test flag value", new RunnableC1451j0(c1459n02, atomicReference2, 1))).intValue());
                    return;
                }
                d1 d1Var3 = this.golf.e;
                G.delta(d1Var3);
                C1459n0 c1459n03 = this.golf.f7513i;
                G.echo(c1459n03);
                AtomicReference atomicReference3 = new AtomicReference();
                E e5 = ((G) c1459n03.alpha).f7508c;
                G.foxtrot(e5);
                double doubleValue = ((Double) e5.b0(atomicReference3, 15000L, "double test flag value", new RunnableC1453k0(c1459n03, atomicReference3, 1))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    aoVar.november(bundle);
                    return;
                } catch (RemoteException e10) {
                    ar arVar = ((G) d1Var3.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.f7632b.bravo(e10, "Error returning double value to wrapper");
                    return;
                }
            }
            d1 d1Var4 = this.golf.e;
            G.delta(d1Var4);
            C1459n0 c1459n04 = this.golf.f7513i;
            G.echo(c1459n04);
            AtomicReference atomicReference4 = new AtomicReference();
            E e11 = ((G) c1459n04.alpha).f7508c;
            G.foxtrot(e11);
            d1Var4.x0(aoVar, ((Long) e11.b0(atomicReference4, 15000L, "long test flag value", new RunnableC1433a0(c1459n04, atomicReference4, 2))).longValue());
            return;
        }
        d1 d1Var5 = this.golf.e;
        G.delta(d1Var5);
        C1459n0 c1459n05 = this.golf.f7513i;
        G.echo(c1459n05);
        AtomicReference atomicReference5 = new AtomicReference();
        E e12 = ((G) c1459n05.alpha).f7508c;
        G.foxtrot(e12);
        d1Var5.y0((String) e12.b0(atomicReference5, 15000L, "String test flag value", new RunnableC1453k0(c1459n05, atomicReference5, 0)), aoVar);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void getUserProperties(String str, String str2, boolean z2, com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        E e = this.golf.f7508c;
        G.foxtrot(e);
        e.g0(new RunnableC1449i0(this, aoVar, str, str2, z2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void initForTests(Map map) throws RemoteException {
        charlie();
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void initialize(InterfaceC1812b interfaceC1812b, zzdh zzdhVar, long j5) throws RemoteException {
        G g2 = this.golf;
        if (g2 == null) {
            Context context = (Context) BinderC1814d.magenta(interfaceC1812b);
            V5.x.hotel(context);
            this.golf = G.lima(context, zzdhVar, Long.valueOf(j5));
        } else {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.alpha("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.ao aoVar) throws RemoteException {
        charlie();
        E e = this.golf.f7508c;
        G.foxtrot(e);
        e.g0(new be.g(15, this, aoVar, false));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.g0(str, str2, bundle, z2, z10, j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.ao aoVar, long j5) throws RemoteException {
        Bundle bundle2;
        charlie();
        V5.x.echo(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        zzbh zzbhVar = new zzbh(str2, new zzbf(bundle), "app", j5);
        E e = this.golf.f7508c;
        G.foxtrot(e);
        e.g0(new ao.d(this, aoVar, zzbhVar, str, 3));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void logHealthData(int i4, String str, InterfaceC1812b interfaceC1812b, InterfaceC1812b interfaceC1812b2, InterfaceC1812b interfaceC1812b3) throws RemoteException {
        Object magenta;
        Object magenta2;
        charlie();
        Object obj = null;
        if (interfaceC1812b == null) {
            magenta = null;
        } else {
            magenta = BinderC1814d.magenta(interfaceC1812b);
        }
        if (interfaceC1812b2 == null) {
            magenta2 = null;
        } else {
            magenta2 = BinderC1814d.magenta(interfaceC1812b2);
        }
        if (interfaceC1812b3 != null) {
            obj = BinderC1814d.magenta(interfaceC1812b3);
        }
        Object obj2 = obj;
        ar arVar = this.golf.f7507b;
        G.foxtrot(arVar);
        arVar.i0(i4, true, false, str, magenta, magenta2, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityCreated(InterfaceC1812b interfaceC1812b, Bundle bundle, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        onActivityCreatedByScionActivityInfo(zzdj.o(activity), bundle, j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityCreatedByScionActivityInfo(zzdj zzdjVar, Bundle bundle, long j5) {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        C1457m0 c1457m0 = c1459n0.red;
        if (c1457m0 != null) {
            C1459n0 c1459n02 = this.golf.f7513i;
            G.echo(c1459n02);
            c1459n02.d0();
            c1457m0.juliet(zzdjVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityDestroyed(InterfaceC1812b interfaceC1812b, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        onActivityDestroyedByScionActivityInfo(zzdj.o(activity), j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityDestroyedByScionActivityInfo(zzdj zzdjVar, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        C1457m0 c1457m0 = c1459n0.red;
        if (c1457m0 != null) {
            C1459n0 c1459n02 = this.golf.f7513i;
            G.echo(c1459n02);
            c1459n02.d0();
            c1457m0.kilo(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityPaused(InterfaceC1812b interfaceC1812b, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        onActivityPausedByScionActivityInfo(zzdj.o(activity), j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityPausedByScionActivityInfo(zzdj zzdjVar, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        C1457m0 c1457m0 = c1459n0.red;
        if (c1457m0 != null) {
            C1459n0 c1459n02 = this.golf.f7513i;
            G.echo(c1459n02);
            c1459n02.d0();
            c1457m0.lima(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityResumed(InterfaceC1812b interfaceC1812b, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        onActivityResumedByScionActivityInfo(zzdj.o(activity), j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityResumedByScionActivityInfo(zzdj zzdjVar, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        C1457m0 c1457m0 = c1459n0.red;
        if (c1457m0 != null) {
            C1459n0 c1459n02 = this.golf.f7513i;
            G.echo(c1459n02);
            c1459n02.d0();
            c1457m0.mike(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivitySaveInstanceState(InterfaceC1812b interfaceC1812b, com.google.android.gms.internal.measurement.ao aoVar, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdj.o(activity), aoVar, j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdjVar, com.google.android.gms.internal.measurement.ao aoVar, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        C1457m0 c1457m0 = c1459n0.red;
        Bundle bundle = new Bundle();
        if (c1457m0 != null) {
            C1459n0 c1459n02 = this.golf.f7513i;
            G.echo(c1459n02);
            c1459n02.d0();
            c1457m0.november(zzdjVar, bundle);
        }
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = this.golf.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityStarted(InterfaceC1812b interfaceC1812b, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        onActivityStartedByScionActivityInfo(zzdj.o(activity), j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityStartedByScionActivityInfo(zzdj zzdjVar, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        if (c1459n0.red != null) {
            C1459n0 c1459n02 = this.golf.f7513i;
            G.echo(c1459n02);
            c1459n02.d0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityStopped(InterfaceC1812b interfaceC1812b, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        onActivityStoppedByScionActivityInfo(zzdj.o(activity), j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void onActivityStoppedByScionActivityInfo(zzdj zzdjVar, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        if (c1459n0.red != null) {
            C1459n0 c1459n02 = this.golf.f7513i;
            G.echo(c1459n02);
            c1459n02.d0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.ao aoVar, long j5) throws RemoteException {
        charlie();
        aoVar.november(null);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.as asVar) throws RemoteException {
        Object obj;
        charlie();
        bv.e eVar = this.hotel;
        synchronized (eVar) {
            try {
                obj = (X) eVar.get(Integer.valueOf(asVar.alpha()));
                if (obj == null) {
                    obj = new b1(this, asVar);
                    eVar.put(Integer.valueOf(asVar.alpha()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.X();
        if (!c1459n0.teal.add(obj)) {
            ar arVar = ((G) c1459n0.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.alpha("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void resetAnalyticsData(long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.yellow.set(null);
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.g0(new RunnableC1445g0(c1459n0, j5, 1));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.aq aqVar) {
        EnumC1470t0 enumC1470t0;
        charlie();
        C1440e c1440e = this.golf.yellow;
        ab abVar = ac.f7570K;
        if (c1440e.j0(null, abVar)) {
            C1459n0 c1459n0 = this.golf.f7513i;
            G.echo(c1459n0);
            G g2 = (G) c1459n0.alpha;
            if (g2.yellow.j0(null, abVar)) {
                c1459n0.X();
                E e = g2.f7508c;
                G.foxtrot(e);
                if (!e.i0()) {
                    E e4 = g2.f7508c;
                    G.foxtrot(e4);
                    if (Thread.currentThread() == e4.silver) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.white.alpha("Cannot retrieve and upload batches from analytics network thread");
                        return;
                    }
                    if (!r6.u.mike()) {
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.f7636g.alpha("[sgtm] Started client-side batch upload work.");
                        boolean z2 = false;
                        int i4 = 0;
                        int i5 = 0;
                        loop0: while (!z2) {
                            ar arVar3 = g2.f7507b;
                            G.foxtrot(arVar3);
                            arVar3.f7636g.alpha("[sgtm] Getting upload batches from service (FE)");
                            AtomicReference atomicReference = new AtomicReference();
                            E e5 = g2.f7508c;
                            G.foxtrot(e5);
                            e5.b0(atomicReference, 10000L, "[sgtm] Getting upload batches", new RunnableC1433a0(c1459n0, atomicReference, 1));
                            zzpe zzpeVar = (zzpe) atomicReference.get();
                            if (zzpeVar == null) {
                                break;
                            }
                            List list = zzpeVar.alpha;
                            if (list.isEmpty()) {
                                break;
                            }
                            ar arVar4 = g2.f7507b;
                            G.foxtrot(arVar4);
                            arVar4.f7636g.bravo(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
                            i4 += list.size();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    zzpa zzpaVar = (zzpa) it.next();
                                    try {
                                        URL url = new URI(zzpaVar.red).toURL();
                                        AtomicReference atomicReference2 = new AtomicReference();
                                        aj india = ((G) c1459n0.alpha).india();
                                        india.X();
                                        V5.x.hotel(india.yellow);
                                        String str = india.yellow;
                                        G g5 = (G) c1459n0.alpha;
                                        ar arVar5 = g5.f7507b;
                                        G.foxtrot(arVar5);
                                        a4.j jVar = arVar5.f7636g;
                                        Long valueOf = Long.valueOf(zzpaVar.alpha);
                                        jVar.delta("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzpaVar.red, Integer.valueOf(zzpaVar.purple.length));
                                        if (!TextUtils.isEmpty(zzpaVar.yellow)) {
                                            ar arVar6 = g5.f7507b;
                                            G.foxtrot(arVar6);
                                            arVar6.f7636g.charlie(valueOf, zzpaVar.yellow, "[sgtm] Uploading data from app. row_id");
                                        }
                                        HashMap hashMap = new HashMap();
                                        Bundle bundle = zzpaVar.silver;
                                        for (String str2 : bundle.keySet()) {
                                            String string = bundle.getString(str2);
                                            if (!TextUtils.isEmpty(string)) {
                                                hashMap.put(str2, string);
                                            }
                                        }
                                        C1466r0 c1466r0 = g5.f7515k;
                                        G.foxtrot(c1466r0);
                                        byte[] bArr = zzpaVar.purple;
                                        com.bumptech.glide.load.engine.h hVar = new com.bumptech.glide.load.engine.h(c1459n0, atomicReference2, zzpaVar, 4);
                                        c1466r0.Y();
                                        V5.x.hotel(url);
                                        V5.x.hotel(bArr);
                                        E e10 = ((G) c1466r0.alpha).f7508c;
                                        G.foxtrot(e10);
                                        e10.f0(new at(c1466r0, str, url, bArr, hashMap, hVar));
                                        try {
                                            d1 d1Var = g5.e;
                                            G.delta(d1Var);
                                            G g10 = (G) d1Var.alpha;
                                            g10.f7511g.getClass();
                                            long currentTimeMillis = System.currentTimeMillis() + 60000;
                                            synchronized (atomicReference2) {
                                                for (long j5 = 60000; atomicReference2.get() == null && j5 > 0; j5 = currentTimeMillis - System.currentTimeMillis()) {
                                                    try {
                                                        atomicReference2.wait(j5);
                                                        g10.f7511g.getClass();
                                                    } catch (Throwable th) {
                                                        throw th;
                                                        break loop0;
                                                    }
                                                }
                                            }
                                        } catch (InterruptedException unused) {
                                            ar arVar7 = ((G) c1459n0.alpha).f7507b;
                                            G.foxtrot(arVar7);
                                            arVar7.f7632b.alpha("[sgtm] Interrupted waiting for uploading batch");
                                        }
                                        if (atomicReference2.get() == null) {
                                            enumC1470t0 = EnumC1470t0.UNKNOWN;
                                        } else {
                                            enumC1470t0 = (EnumC1470t0) atomicReference2.get();
                                        }
                                    } catch (MalformedURLException | URISyntaxException e11) {
                                        ar arVar8 = ((G) c1459n0.alpha).f7507b;
                                        G.foxtrot(arVar8);
                                        arVar8.white.delta("[sgtm] Bad upload url for row_id", zzpaVar.red, Long.valueOf(zzpaVar.alpha), e11);
                                        enumC1470t0 = EnumC1470t0.FAILURE;
                                    }
                                    if (enumC1470t0 == EnumC1470t0.SUCCESS) {
                                        i5++;
                                    } else if (enumC1470t0 == EnumC1470t0.BACKOFF) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        ar arVar9 = g2.f7507b;
                        G.foxtrot(arVar9);
                        arVar9.f7636g.charlie(Integer.valueOf(i4), Integer.valueOf(i5), "[sgtm] Completed client-side batch upload work. total, success");
                        $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this, aqVar);
                        return;
                    }
                    ar arVar10 = g2.f7507b;
                    G.foxtrot(arVar10);
                    arVar10.white.alpha("Cannot retrieve and upload batches from main thread");
                    return;
                }
                ar arVar11 = g2.f7507b;
                G.foxtrot(arVar11);
                arVar11.white.alpha("Cannot retrieve and upload batches from analytics worker thread");
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setConditionalUserProperty(Bundle bundle, long j5) throws RemoteException {
        charlie();
        if (bundle == null) {
            ar arVar = this.golf.f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Conditional user property must not be null");
        } else {
            C1459n0 c1459n0 = this.golf.f7513i;
            G.echo(c1459n0);
            c1459n0.l0(bundle, j5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setConsent(Bundle bundle, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.h0(new RunnableC1437c0(c1459n0, bundle, j5));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setConsentThirdParty(Bundle bundle, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.m0(bundle, -20, j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setCurrentScreen(InterfaceC1812b interfaceC1812b, String str, String str2, long j5) throws RemoteException {
        charlie();
        Activity activity = (Activity) BinderC1814d.magenta(interfaceC1812b);
        V5.x.hotel(activity);
        setCurrentScreenByScionActivityInfo(zzdj.o(activity), str, str2, j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.am
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(zzdj zzdjVar, String str, String str2, long j5) throws RemoteException {
        String str3;
        charlie();
        C1480y0 c1480y0 = this.golf.f7512h;
        G.echo(c1480y0);
        G g2 = (G) c1480y0.alpha;
        if (!g2.yellow.k0()) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7634d.alpha("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C1474v0 c1474v0 = c1480y0.red;
        if (c1474v0 == null) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7634d.alpha("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = c1480y0.white;
        Integer valueOf = Integer.valueOf(zzdjVar.alpha);
        if (concurrentHashMap.get(valueOf) == null) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.f7634d.alpha("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = c1480y0.e0(zzdjVar.purple);
        }
        String str4 = c1474v0.bravo;
        String str5 = c1474v0.alpha;
        boolean equals = Objects.equals(str4, str2);
        boolean equals2 = Objects.equals(str5, str);
        if (equals && equals2) {
            ar arVar4 = g2.f7507b;
            G.foxtrot(arVar4);
            arVar4.f7634d.alpha("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                g2.yellow.getClass();
            }
            ar arVar5 = g2.f7507b;
            G.foxtrot(arVar5);
            arVar5.f7634d.bravo(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                g2.yellow.getClass();
            }
            ar arVar6 = g2.f7507b;
            G.foxtrot(arVar6);
            arVar6.f7634d.bravo(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        ar arVar7 = g2.f7507b;
        G.foxtrot(arVar7);
        a4.j jVar = arVar7.f7636g;
        if (str == null) {
            str3 = BuildConfig.TRAVIS;
        } else {
            str3 = str;
        }
        jVar.charlie(str3, str2, "Setting current screen to name, class");
        d1 d1Var = g2.e;
        G.delta(d1Var);
        C1474v0 c1474v02 = new C1474v0(str, d1Var.h1(), str2);
        concurrentHashMap.put(valueOf, c1474v02);
        c1480y0.a0(zzdjVar.purple, c1474v02, true);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setDataCollectionEnabled(boolean z2) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.X();
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.g0(new R3.p(c1459n0, z2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.g0(new RunnableC1435b0(c1459n0, bundle2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setEventInterceptor(com.google.android.gms.internal.measurement.as asVar) throws RemoteException {
        boolean z2;
        charlie();
        w.o oVar = new w.o(29, (Object) this, (Object) asVar, false);
        E e = this.golf.f7508c;
        G.foxtrot(e);
        if (e.i0()) {
            C1459n0 c1459n0 = this.golf.f7513i;
            G.echo(c1459n0);
            c1459n0.W();
            c1459n0.X();
            w.o oVar2 = c1459n0.silver;
            if (oVar != oVar2) {
                if (oVar2 == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                V5.x.juliet("EventInterceptor already set.", z2);
            }
            c1459n0.silver = oVar;
            return;
        }
        E e4 = this.golf.f7508c;
        G.foxtrot(e4);
        e4.g0(new com.google.common.util.concurrent.d(10, this, oVar, false));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.au auVar) throws RemoteException {
        charlie();
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setMeasurementEnabled(boolean z2, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        Boolean valueOf = Boolean.valueOf(z2);
        c1459n0.X();
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.g0(new s6.E(11, c1459n0, valueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setMinimumSessionDuration(long j5) throws RemoteException {
        charlie();
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setSessionTimeoutDuration(long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        E e = ((G) c1459n0.alpha).f7508c;
        G.foxtrot(e);
        e.g0(new RunnableC1445g0(c1459n0, j5, 0));
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        Uri data = intent.getData();
        G g2 = (G) c1459n0.alpha;
        if (data == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.e.alpha("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals("1")) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.e.bravo(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
                g2.yellow.red = queryParameter2;
                return;
            }
            return;
        }
        ar arVar3 = g2.f7507b;
        G.foxtrot(arVar3);
        arVar3.e.alpha("[sgtm] Preview Mode was not enabled.");
        g2.yellow.red = null;
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setUserId(String str, long j5) throws RemoteException {
        charlie();
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        G g2 = (G) c1459n0.alpha;
        if (str != null && TextUtils.isEmpty(str)) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.alpha("User ID must be non-empty or null");
        } else {
            E e = g2.f7508c;
            G.foxtrot(e);
            e.g0(new com.google.common.util.concurrent.d(9, c1459n0, str));
            c1459n0.q0(null, Column.ID, str, true, j5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void setUserProperty(String str, String str2, InterfaceC1812b interfaceC1812b, boolean z2, long j5) throws RemoteException {
        charlie();
        Object magenta = BinderC1814d.magenta(interfaceC1812b);
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.q0(str, str2, magenta, z2, j5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.as asVar) throws RemoteException {
        Object obj;
        charlie();
        bv.e eVar = this.hotel;
        synchronized (eVar) {
            obj = (X) eVar.remove(Integer.valueOf(asVar.alpha()));
        }
        if (obj == null) {
            obj = new b1(this, asVar);
        }
        C1459n0 c1459n0 = this.golf.f7513i;
        G.echo(c1459n0);
        c1459n0.X();
        if (!c1459n0.teal.remove(obj)) {
            ar arVar = ((G) c1459n0.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.alpha("OnEventListener had not been registered");
        }
    }
}
