package com.incognia.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import h9.am;
import h9.as;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lhI implements Gg {
    public static final String IB = (String) wGk.Rk.getValue();

    /* renamed from: J, reason: collision with root package name */
    public final ConnectivityManager f10834J;
    public qm4 PqK;

    /* renamed from: R, reason: collision with root package name */
    public boolean f10835R;

    /* renamed from: V, reason: collision with root package name */
    public final Xqt f10836V;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f10837W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10838b;

    /* renamed from: f9, reason: collision with root package name */
    public final S0A f10839f9;
    public final E sVU = new E();
    public final LinkedHashSet gmP = new LinkedHashSet();
    public final AtomicBoolean olU = new AtomicBoolean(false);
    public D5f DOu = aNe.f10097b;

    public lhI(Context context, pl2 pl2Var, S0A s0a) {
        this.f10838b = context;
        this.f10837W = pl2Var;
        this.f10839f9 = s0a;
        this.f10834J = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10836V = new Xqt(pl2Var, new GQ(this));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.DOu = tOI.f11377b;
    }

    public final Boolean PqK() {
        int collectionSizeOrDefault;
        try {
            boolean z2 = false;
            if (CnH.b(CnH.f8484b, 23, 0, 2)) {
                NetworkCapabilities networkCapabilities = this.f10834J.getNetworkCapabilities(this.f10834J.getActiveNetwork());
                if (networkCapabilities != null) {
                    return Boolean.valueOf(networkCapabilities.hasTransport(4));
                }
                return null;
            }
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = list.get(i4);
                i4++;
                if (((NetworkInterface) obj).isUp()) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            int size2 = arrayList.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList.get(i5);
                i5++;
                arrayList2.add(((NetworkInterface) obj2).getName());
            }
            if (arrayList2.contains("tun0") || arrayList2.contains("ppp0")) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final G4 W() {
        try {
            if (!CnH.b(CnH.f8484b, 21, 0, 2)) {
                return null;
            }
            ConnectivityManager connectivityManager = this.f10834J;
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
            if (linkProperties == null) {
                return null;
            }
            return this.sVU.b(linkProperties);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10837W;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.DOu = b66.f10146b;
        njO.b(this, new as(this, 0));
    }

    public final gh gmP() {
        NetworkInfo activeNetworkInfo = this.f10834J.getActiveNetworkInfo();
        String str = null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return null;
        }
        String valueOf = String.valueOf(activeNetworkInfo.getType());
        if (activeNetworkInfo.getType() == 0) {
            str = String.valueOf(activeNetworkInfo.getSubtype());
        }
        return new gh(valueOf, str);
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.DOu;
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new am(11, this, cj0));
    }

    public static final void b(lhI lhi, Function0 function0) {
        lhi.gmP.clear();
        if (lhi.olU.get()) {
            if (CnH.b(CnH.f8484b, 24, 0, 2)) {
                ConnectivityManager connectivityManager = lhi.f10834J;
                qm4 qm4Var = lhi.PqK;
                if (qm4Var == null) {
                    qm4Var = null;
                }
                connectivityManager.unregisterNetworkCallback(qm4Var);
            } else {
                lhi.f10838b.unregisterReceiver(lhi.f10836V);
            }
            lhi.olU.compareAndSet(true, false);
        }
        lhi.DOu = L4.f9041b;
        function0.invoke();
    }

    public static final void b(lhI lhi) {
        if (lhi.olU.get()) {
            return;
        }
        CnH cnH = CnH.f8484b;
        if (CnH.b(cnH, 24, 0, 2)) {
            qm4 qm4Var = new qm4(lhi);
            lhi.PqK = qm4Var;
            try {
                lhi.f10834J.registerDefaultNetworkCallback(qm4Var);
                lhi.olU.compareAndSet(false, true);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        S0A s0a = lhi.f10839f9;
        if (!((JSONObject) s0a.f9574b.get()).optBoolean(IB, true)) {
            if (lhi.olU.get()) {
                if (CnH.b(cnH, 24, 0, 2)) {
                    ConnectivityManager connectivityManager = lhi.f10834J;
                    qm4 qm4Var2 = lhi.PqK;
                    if (qm4Var2 == null) {
                        qm4Var2 = null;
                    }
                    connectivityManager.unregisterNetworkCallback(qm4Var2);
                } else {
                    lhi.f10838b.unregisterReceiver(lhi.f10836V);
                }
                lhi.olU.compareAndSet(true, false);
                return;
            }
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        wD.b(lhi.f10838b, lhi.f10836V, intentFilter, lhi.f10837W.f11091W);
        lhi.olU.compareAndSet(false, true);
    }
}
