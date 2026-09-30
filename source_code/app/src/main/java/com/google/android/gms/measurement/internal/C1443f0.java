package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1443f0 extends AbstractC1452k {
    public final /* synthetic */ int echo;
    public final /* synthetic */ C1459n0 foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1443f0(C1459n0 c1459n0, Q q4, int i4) {
        super(q4);
        this.echo = i4;
        this.foxtrot = c1459n0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x012b, code lost:
    
        if (r0.e1() >= 234200) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    @Override // com.google.android.gms.measurement.internal.AbstractC1452k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo() {
        Object[] objArr;
        Pair pair;
        NetworkInfo activeNetworkInfo;
        boolean z2;
        zzap gray;
        Bundle bundle;
        String str;
        URL url;
        switch (this.echo) {
            case 0:
                C1459n0 c1459n0 = ((G) this.foxtrot.alpha).f7513i;
                G.echo(c1459n0);
                new Thread(new RunnableC1439d0(c1459n0, 1)).start();
                return;
            case 1:
                this.foxtrot.k0();
                return;
            case 2:
                this.foxtrot.f0();
                return;
            default:
                C1459n0 c1459n02 = this.foxtrot;
                G g2 = (G) c1459n02.alpha;
                E e = g2.f7508c;
                G.foxtrot(e);
                e.W();
                C1466r0 c1466r0 = g2.f7515k;
                G.foxtrot(c1466r0);
                G.foxtrot(c1466r0);
                String c02 = g2.india().c0();
                Boolean h02 = g2.yellow.h0("google_analytics_adid_collection_enabled");
                boolean z10 = false;
                if (h02 != null && !h02.booleanValue()) {
                    objArr = false;
                } else {
                    objArr = true;
                }
                ar arVar = g2.f7507b;
                if (objArr != false) {
                    ax axVar = g2.f7506a;
                    G.delta(axVar);
                    axVar.W();
                    if (axVar.d0().kilo(U.AD_STORAGE)) {
                        G g5 = (G) axVar.alpha;
                        g5.f7511g.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str2 = axVar.f7639b;
                        if (str2 != null && elapsedRealtime < axVar.f7641d) {
                            pair = new Pair(str2, Boolean.valueOf(axVar.f7640c));
                        } else {
                            axVar.f7641d = g5.yellow.e0(c02, ac.bravo) + elapsedRealtime;
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(g5.alpha);
                                axVar.f7639b = "";
                                String id2 = advertisingIdInfo.getId();
                                if (id2 != null) {
                                    axVar.f7639b = id2;
                                }
                                axVar.f7640c = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e4) {
                                ar arVar2 = g5.f7507b;
                                G.foxtrot(arVar2);
                                arVar2.f7635f.bravo(e4, "Unable to get advertising id");
                                axVar.f7639b = "";
                            }
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                            pair = new Pair(axVar.f7639b, Boolean.valueOf(axVar.f7640c));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        G.foxtrot(c1466r0);
                        c1466r0.Y();
                        G g10 = (G) c1466r0.alpha;
                        ConnectivityManager connectivityManager = (ConnectivityManager) g10.alpha.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb2 = new StringBuilder();
                                H0 mike = g2.mike();
                                mike.W();
                                mike.X();
                                if (mike.j0()) {
                                    d1 d1Var = ((G) mike.alpha).e;
                                    G.delta(d1Var);
                                    break;
                                }
                                C1459n0 c1459n03 = g2.f7513i;
                                G.echo(c1459n03);
                                c1459n03.W();
                                H0 mike2 = ((G) c1459n03.alpha).mike();
                                mike2.W();
                                mike2.X();
                                ae aeVar = mike2.silver;
                                G g11 = (G) mike2.alpha;
                                if (aeVar == null) {
                                    mike2.a0();
                                    ar arVar3 = g11.f7507b;
                                    G.foxtrot(arVar3);
                                    arVar3.f7635f.alpha("Failed to get consents; not connected to service yet.");
                                    z2 = true;
                                } else {
                                    z2 = true;
                                    try {
                                        gray = aeVar.gray(mike2.k0(false));
                                        mike2.m0();
                                    } catch (RemoteException e5) {
                                        ar arVar4 = g11.f7507b;
                                        G.foxtrot(arVar4);
                                        arVar4.white.bravo(e5, "Failed to get consents; remote exception");
                                    }
                                    if (gray == null) {
                                        bundle = gray.alpha;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle != null) {
                                        int i4 = g2.f7528x;
                                        g2.f7528x = i4 + 1;
                                        if (i4 < 10) {
                                            z10 = z2;
                                        }
                                        G.foxtrot(arVar);
                                        StringBuilder sb3 = new StringBuilder("Failed to retrieve DMA consent from the service, ");
                                        if (i4 < 10) {
                                            str = "Retrying.";
                                        } else {
                                            str = "Skipping.";
                                        }
                                        arVar.f7635f.bravo(Integer.valueOf(g2.f7528x), androidx.appcompat.widget.P0.gold(sb3, str, " retryCount"));
                                    } else {
                                        V delta = V.delta(100, bundle);
                                        sb2.append("&gcs=");
                                        sb2.append(delta.india());
                                        C1454l alpha = C1454l.alpha(100, bundle);
                                        sb2.append("&dma=");
                                        sb2.append(!Objects.equals(alpha.charlie, Boolean.FALSE) ? 1 : 0);
                                        String str3 = alpha.delta;
                                        if (!TextUtils.isEmpty(str3)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str3);
                                        }
                                        int i5 = !Objects.equals(C1454l.delta(bundle), Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i5);
                                        G.foxtrot(arVar);
                                        arVar.f7636g.bravo(sb2, "Consent query parameters to Bow");
                                        d1 d1Var2 = g2.e;
                                        G.delta(d1Var2);
                                        ((G) g2.india().alpha).yellow.d0();
                                        String str4 = (String) pair.first;
                                        long alpha2 = axVar.f7651o.alpha() - 1;
                                        String sb4 = sb2.toString();
                                        G g12 = (G) d1Var2.alpha;
                                        try {
                                            V5.x.echo(str4);
                                            V5.x.echo(c02);
                                            String str5 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v119002." + d1Var2.e1()) + "&rdid=" + str4 + "&bundleid=" + c02 + "&retry=" + alpha2;
                                            if (c02.equals(g12.yellow.a0("debug.deferred.deeplink"))) {
                                                str5 = str5.concat("&ddl_test=1");
                                            }
                                            if (!sb4.isEmpty()) {
                                                if (sb4.charAt(0) != '&') {
                                                    str5 = str5.concat("&");
                                                }
                                                str5 = str5.concat(sb4);
                                            }
                                            url = new URL(str5);
                                        } catch (IllegalArgumentException e10) {
                                            e = e10;
                                            ar arVar5 = g12.f7507b;
                                            G.foxtrot(arVar5);
                                            arVar5.white.bravo(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (z10) {
                                            }
                                        } catch (MalformedURLException e11) {
                                            e = e11;
                                            ar arVar52 = g12.f7507b;
                                            G.foxtrot(arVar52);
                                            arVar52.white.bravo(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (z10) {
                                            }
                                        }
                                        if (url != null) {
                                            G.foxtrot(c1466r0);
                                            F f5 = new F(g2);
                                            c1466r0.Y();
                                            E e12 = g10.f7508c;
                                            G.foxtrot(e12);
                                            e12.f0(new at(c1466r0, c02, url, (byte[]) null, (HashMap) null, f5));
                                        }
                                    }
                                }
                                gray = null;
                                if (gray == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                G.foxtrot(arVar);
                                arVar.f7632b.alpha("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        G.foxtrot(arVar);
                        arVar.f7632b.alpha("Network is not available for Deferred Deep Link request. Skipping");
                    } else {
                        G.foxtrot(arVar);
                        arVar.f7636g.alpha("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    G.foxtrot(arVar);
                    arVar.f7636g.alpha("ADID collection is disabled from Manifest. Skipping");
                }
                if (z10) {
                    c1459n02.f7684m.charlie(Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    return;
                }
                return;
        }
    }
}
