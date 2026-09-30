package com.incognia.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.clevertap.android.sdk.Constants;
import g9.a;
import h9.C1824b;
import h9.ah;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d94 implements Gg {

    /* renamed from: P, reason: collision with root package name */
    public static final String f10284P = (String) wGk.Rk.getValue();

    /* renamed from: J, reason: collision with root package name */
    public final KDK f10286J;
    public final S0A PqK;

    /* renamed from: R, reason: collision with root package name */
    public final Rm f10287R;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f10289W;

    /* renamed from: Y, reason: collision with root package name */
    public final G2 f10290Y;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10291b;

    /* renamed from: f9, reason: collision with root package name */
    public final L8H f10292f9;
    public final Oqz gmP;

    /* renamed from: n9, reason: collision with root package name */
    public boolean f10293n9;
    public final WifiManager olU;
    public final tNn sVU;

    /* renamed from: V, reason: collision with root package name */
    public D5f f10288V = aNe.f10097b;
    public final VyX DOu = new VyX();
    public final cuf IB = new cuf();
    public final LinkedHashSet Qs = new LinkedHashSet();

    /* renamed from: E, reason: collision with root package name */
    public final LinkedHashSet f10285E = new LinkedHashSet();

    public d94(Context context, pl2 pl2Var, L8H l8h, tNn tnn, Oqz oqz, KDK kdk, S0A s0a, W6 w62) {
        this.f10291b = context;
        this.f10289W = pl2Var;
        this.f10292f9 = l8h;
        this.sVU = tnn;
        this.gmP = oqz;
        this.f10286J = kdk;
        this.PqK = s0a;
        this.olU = (WifiManager) context.getApplicationContext().getSystemService(Constants.CLTAP_CONNECTED_TO_WIFI);
        this.f10287R = new Rm(w62);
        this.f10290Y = new G2(pl2Var, new Svj(this));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f10288V = tOI.f11377b;
    }

    public final boolean PqK() {
        if (this.f10286J.b("android.permission.ACCESS_WIFI_STATE") && this.olU.isScanAlwaysAvailable()) {
            return true;
        }
        return false;
    }

    public final void V() {
        boolean z2;
        boolean optBoolean = ((JSONObject) this.PqK.f9574b.get()).optBoolean(f10284P, true);
        if (gmP() && this.gmP.W() && this.sVU.gmP() && optBoolean && !this.f10293n9) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            wD.b(this.f10291b, this.f10290Y, intentFilter, this.f10289W.f11091W);
            this.f10293n9 = true;
            return;
        }
        if (!optBoolean && (z2 = this.f10293n9) && z2) {
            this.f10291b.unregisterReceiver(this.f10290Y);
            this.f10293n9 = false;
        }
    }

    public final void W(pYm pym) {
        njO.b(this, new ah(this, pym, 1));
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10289W;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f10288V = b66.f10146b;
        njO.b(this, new a(14, this));
    }

    public final boolean gmP() {
        if ((this.f10286J.b("android.permission.ACCESS_WIFI_STATE") && this.olU.isWifiEnabled()) || PqK()) {
            return true;
        }
        return false;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f10288V;
    }

    public static final void W(d94 d94Var, pYm pym) {
        if (d94Var.Qs.isEmpty()) {
            d94Var.V();
        }
        d94Var.Qs.add(pym);
    }

    public static final void b(d94 d94Var, pYm pym) {
        d94Var.f10285E.add(pym);
        if (d94Var.Qs.isEmpty()) {
            d94Var.V();
        }
    }

    public final void f9(pYm pym) {
        njO.b(this, new ah(this, pym, 2));
    }

    public static final void b(d94 d94Var) {
        if (!d94Var.gmP() || d94Var.Qs.isEmpty()) {
            return;
        }
        d94Var.V();
    }

    public static final void f9(d94 d94Var, pYm pym) {
        d94Var.Qs.remove(pym);
        if (d94Var.Qs.isEmpty() && d94Var.f10293n9) {
            d94Var.f10291b.unregisterReceiver(d94Var.f10290Y);
            d94Var.f10293n9 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual("00:00:00:00:00:00", r2) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual("<unknown ssid>", r3) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList W() {
        g9B g9b;
        if (gmP() && this.gmP.W() && this.sVU.gmP()) {
            WifiInfo connectionInfo = this.olU.getConnectionInfo();
            if (connectionInfo != null) {
                String bssid = connectionInfo.getBSSID();
                String ssid = connectionInfo.getSSID();
                if (bssid != null) {
                }
                if (ssid != null) {
                    if (ssid.length() != 0) {
                    }
                }
            }
            this.DOu.getClass();
            g9b = VyX.b(connectionInfo);
            if (!gmP() && this.gmP.W() && this.sVU.gmP()) {
                return this.f10287R.b(this.olU.getScanResults(), g9b);
            }
            return null;
        }
        g9b = null;
        if (!gmP()) {
        }
        return null;
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(27, this, cj0));
    }

    public static final void b(d94 d94Var, Function0 function0) {
        d94Var.Qs.clear();
        d94Var.f10285E.clear();
        if (d94Var.f10293n9) {
            d94Var.f10291b.unregisterReceiver(d94Var.f10290Y);
            d94Var.f10293n9 = false;
        }
        d94Var.f10288V = L4.f9041b;
        function0.invoke();
    }

    public final boolean b(pYm pym) {
        if (this.f10286J.b("android.permission.CHANGE_WIFI_STATE") && this.gmP.W() && this.sVU.gmP() && gmP()) {
            S0A s0a = this.PqK;
            if (((JSONObject) s0a.f9574b.get()).optBoolean(f10284P, true)) {
                try {
                    boolean b2 = njO.b(this, new ah(this, pym, 0));
                    if (!b2) {
                        return b2;
                    }
                    this.olU.startScan();
                    return b2;
                } catch (Throwable th) {
                    this.f10292f9.b(th, false);
                }
            }
        }
        return false;
    }
}
