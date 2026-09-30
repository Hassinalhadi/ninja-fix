package D2;

import A2.z;
import G6.q;
import S5.k;
import T5.aj;
import V5.x;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import ao.ad;
import av.ah;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.C1293b;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.internal.measurement.C1314f0;
import com.google.android.gms.internal.measurement.af;
import com.google.android.gms.internal.measurement.ao;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.C1440e;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.K0;
import com.google.android.gms.measurement.internal.O;
import com.google.android.gms.measurement.internal.U;
import com.google.android.gms.measurement.internal.W;
import com.google.android.gms.measurement.internal.Y0;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.a1;
import com.google.android.gms.measurement.internal.ab;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ae;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.au;
import com.google.android.gms.measurement.internal.ax;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzqb;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s6.E;
import s6.V4;
import xf.r;

/* loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;
    public Object silver;

    public /* synthetic */ d() {
        this.alpha = 15;
    }

    private final void alpha() {
        AtomicReference atomicReference;
        H0 h02;
        G g2;
        ax axVar;
        AtomicReference atomicReference2 = (AtomicReference) this.red;
        synchronized (atomicReference2) {
            try {
                try {
                    h02 = (H0) this.silver;
                    g2 = (G) h02.alpha;
                    axVar = g2.f7506a;
                    G.delta(axVar);
                } catch (RemoteException e) {
                    ar arVar = ((G) ((H0) this.silver).alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.white.bravo(e, "Failed to get app instance id");
                    atomicReference = (AtomicReference) this.red;
                }
                if (!axVar.d0().kilo(U.ANALYTICS_STORAGE)) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.f7634d.alpha("Analytics storage consent denied; will not get app instance id");
                    C1459n0 c1459n0 = ((G) h02.alpha).f7513i;
                    G.echo(c1459n0);
                    c1459n0.yellow.set(null);
                    ax axVar2 = g2.f7506a;
                    G.delta(axVar2);
                    axVar2.f7638a.oscar(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                } else {
                    ae aeVar = h02.silver;
                    if (aeVar == null) {
                        ar arVar3 = g2.f7507b;
                        G.foxtrot(arVar3);
                        arVar3.white.alpha("Failed to get app instance id");
                        atomicReference2.notify();
                    } else {
                        atomicReference2.set(aeVar.amber((zzr) this.purple));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            C1459n0 c1459n02 = ((G) h02.alpha).f7513i;
                            G.echo(c1459n02);
                            c1459n02.yellow.set(str);
                            ax axVar3 = g2.f7506a;
                            G.delta(axVar3);
                            axVar3.f7638a.oscar(str);
                        }
                        h02.m0();
                        atomicReference = (AtomicReference) this.red;
                        atomicReference.notify();
                    }
                }
            } catch (Throwable th) {
                ((AtomicReference) this.red).notify();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0571  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i4;
        q echo;
        int i5;
        G g2;
        Cursor cursor;
        Cursor cursor2;
        String string;
        byte[] blob;
        String string2;
        String string3;
        int i10;
        int i11;
        a1 z02;
        C1314f0 c1314f0;
        zzbf zzbfVar;
        d1 d1Var;
        boolean kilo;
        ax axVar;
        ar arVar;
        com.google.android.material.appbar.j jVar;
        OverScroller overScroller;
        Integer num = null;
        Object obj = null;
        r7 = null;
        String str = null;
        af afVar = null;
        Cursor cursor3 = null;
        Bundle bundle = null;
        switch (this.alpha) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.silver;
                Context context = (Context) this.purple;
                Intent intent = (Intent) this.red;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    z.echo().alpha(ConstraintProxyUpdateReceiver.alpha, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    K2.g.alpha(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    K2.g.alpha(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    K2.g.alpha(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    K2.g.alpha(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                CloudMessage cloudMessage = (CloudMessage) this.red;
                Intent intent2 = cloudMessage.alpha;
                String stringExtra = intent2.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    echo = V4.echo(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent3 = cloudMessage.alpha;
                    String stringExtra2 = intent3.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent3.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent4 = cloudMessage.alpha;
                    if (intent4.hasExtra("google.product_id")) {
                        num = Integer.valueOf(intent4.getIntExtra("google.product_id", 0));
                    }
                    if (num != null) {
                        bundle2.putInt("google.product_id", num.intValue());
                    }
                    bundle2.putBoolean("supports_message_handled", true);
                    k charlie = k.charlie((Context) this.purple);
                    synchronized (charlie) {
                        i4 = charlie.alpha;
                        charlie.alpha = 1 + i4;
                    }
                    echo = charlie.echo(new S5.j(i4, 2, bundle2, 0));
                }
                echo.charlie(S5.f.purple, new F8.d((CountDownLatch) this.silver));
                return;
            case 2:
                B0.a aVar = (B0.a) this.silver;
                int i12 = aVar.bravo;
                aj ajVar = (aj) this.red;
                if (i12 > 0) {
                    Bundle bundle3 = (Bundle) aVar.delta;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle((String) this.purple);
                    }
                    ajVar.charlie(bundle);
                }
                if (aVar.bravo >= 2) {
                    ajVar.foxtrot();
                }
                if (aVar.bravo >= 3) {
                    ajVar.echo();
                }
                if (aVar.bravo >= 4) {
                    ajVar.golf();
                }
                if (aVar.bravo >= 5) {
                    ajVar.delta();
                    return;
                }
                return;
            case 3:
                V7.c cVar = (V7.c) this.silver;
                O7.a aVar2 = (O7.a) this.red;
                cVar.bravo(aVar2, (G6.h) this.purple);
                ((AtomicInteger) cVar.india.purple).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.bravo, cVar.alpha()) * (60000.0d / cVar.alpha));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + aVar2.bravo;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 4:
                Z0 z03 = ((O) this.red).golf;
                z03.echo();
                String str3 = ((zzr) this.purple).alpha;
                x.hotel(str3);
                C1440e white = z03.white();
                ab abVar = ac.f7568I;
                if (white.j0(null, abVar)) {
                    ad.crimson(z03);
                    C1450j c1450j = z03.red;
                    Z0.cyan(c1450j);
                    zzag zzagVar = (zzag) this.silver;
                    long j5 = zzagVar.alpha;
                    G g5 = (G) c1450j.alpha;
                    if (!g5.yellow.j0(null, abVar)) {
                        i5 = 4;
                    } else {
                        c1450j.W();
                        c1450j.X();
                        try {
                            cursor = c1450j.S0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j5)}, null, null, null, "1");
                            try {
                                try {
                                } catch (SQLiteException e) {
                                    e = e;
                                    i5 = 4;
                                    g2 = g5;
                                    cursor2 = cursor;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            i5 = 4;
                            g2 = g5;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (!cursor.moveToFirst()) {
                            i5 = 4;
                            if (cursor != null) {
                                cursor.close();
                            }
                        } else {
                            try {
                                string = cursor.getString(1);
                                x.hotel(string);
                                blob = cursor.getBlob(2);
                                try {
                                    string2 = cursor.getString(3);
                                    try {
                                        string3 = cursor.getString(4);
                                        try {
                                            i10 = cursor.getInt(5);
                                            i11 = cursor.getInt(6);
                                            i5 = 4;
                                            try {
                                                cursor.getLong(7);
                                                cursor2 = cursor;
                                                g2 = g5;
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                cursor2 = cursor;
                                                g2 = g5;
                                                cursor = cursor2;
                                                try {
                                                    ar arVar2 = g2.f7507b;
                                                    G.foxtrot(arVar2);
                                                    arVar2.white.charlie(Long.valueOf(j5), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                    if (cursor != null) {
                                                    }
                                                    z02 = null;
                                                    if (z02 != null) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor3 = cursor;
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            i5 = 4;
                                        }
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        i5 = 4;
                                        cursor2 = cursor;
                                        g2 = g5;
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    i5 = 4;
                                    cursor2 = cursor;
                                    g2 = g5;
                                }
                            } catch (SQLiteException e13) {
                                e = e13;
                                i5 = 4;
                                cursor2 = cursor;
                                g2 = g5;
                            }
                            try {
                                z02 = c1450j.z0(string, j5, blob, string2, string3, i10, i11, cursor.getLong(8), cursor.getLong(9));
                                cursor2.close();
                            } catch (SQLiteException e14) {
                                e = e14;
                                cursor = cursor2;
                                ar arVar22 = g2.f7507b;
                                G.foxtrot(arVar22);
                                arVar22.white.charlie(Long.valueOf(j5), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                if (cursor != null) {
                                }
                                z02 = null;
                                if (z02 != null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor3 = cursor2;
                                if (cursor3 != null) {
                                }
                                throw th;
                            }
                            if (z02 != null) {
                                z03.crimson().f7632b.charlie(str3, Long.valueOf(j5), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                return;
                            }
                            HashMap hashMap = z03.f7560x;
                            String str4 = z02.charlie;
                            int i13 = zzagVar.purple;
                            if (i13 == 1) {
                                if (hashMap.containsKey(str4)) {
                                    hashMap.remove(str4);
                                }
                                C1450j c1450j2 = z03.red;
                                Z0.cyan(c1450j2);
                                Long valueOf = Long.valueOf(j5);
                                c1450j2.k0(valueOf);
                                z03.crimson().f7636g.charlie(str3, valueOf, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                long j6 = zzagVar.red;
                                if (j6 > 0) {
                                    C1450j c1450j3 = z03.red;
                                    Z0.cyan(c1450j3);
                                    G g10 = (G) c1450j3.alpha;
                                    C1440e c1440e = g10.yellow;
                                    ar arVar3 = g10.f7507b;
                                    if (c1440e.j0(null, abVar)) {
                                        c1450j3.W();
                                        c1450j3.X();
                                        Long valueOf2 = Long.valueOf(j6);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("upload_type", (Integer) 1);
                                        g10.f7511g.getClass();
                                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                        try {
                                            if (c1450j3.S0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j6), str3, String.valueOf(i5)}) != 1) {
                                                G.foxtrot(arVar3);
                                                arVar3.f7632b.charlie(str3, valueOf2, "Google Signal pending batch not updated. appId, rowId");
                                            }
                                        } catch (SQLiteException e15) {
                                            G.foxtrot(arVar3);
                                            arVar3.white.delta("Failed to update google Signal pending batch. appid, rowId", str3, Long.valueOf(j6), e15);
                                            throw e15;
                                        }
                                    }
                                    z03.crimson().f7636g.charlie(str3, Long.valueOf(j6), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                    z03.olive(str3);
                                    return;
                                }
                                return;
                            }
                            if (i13 == 3) {
                                Y0 y02 = (Y0) hashMap.get(str4);
                                if (y02 == null) {
                                    y02 = new Y0(z03);
                                    hashMap.put(str4, y02);
                                } else {
                                    y02.bravo++;
                                    y02.charlie = y02.alpha();
                                }
                                long j7 = y02.charlie;
                                z03.pink().getClass();
                                z03.crimson().f7636g.delta("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str3, str4, Long.valueOf((j7 - System.currentTimeMillis()) / 1000));
                            }
                            C1450j c1450j4 = z03.red;
                            Z0.cyan(c1450j4);
                            Long valueOf3 = Long.valueOf(zzagVar.alpha);
                            c1450j4.n0(valueOf3);
                            z03.crimson().f7636g.charlie(str3, valueOf3, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                            return;
                        }
                    }
                    z02 = null;
                    if (z02 != null) {
                    }
                } else {
                    return;
                }
            case 5:
                O o5 = (O) this.silver;
                o5.golf.echo();
                zzai zzaiVar = (zzai) this.red;
                Object o10 = zzaiVar.red.o();
                zzr zzrVar = (zzr) this.purple;
                Z0 z04 = o5.golf;
                if (o10 == null) {
                    z04.gray(zzaiVar, zzrVar);
                    return;
                } else {
                    z04.lime(zzaiVar, zzrVar);
                    return;
                }
            case 6:
                O o11 = (O) this.silver;
                o11.getClass();
                zzbh zzbhVar = (zzbh) this.red;
                boolean equals = "_cmp".equals(zzbhVar.alpha);
                Z0 z05 = o11.golf;
                if (equals && (zzbfVar = zzbhVar.purple) != null) {
                    Bundle bundle4 = zzbfVar.alpha;
                    if (bundle4.size() != 0) {
                        String string4 = bundle4.getString("_cis");
                        if ("referrer broadcast".equals(string4) || "referrer API".equals(string4)) {
                            z05.crimson().e.bravo(zzbhVar.toString(), "Event has been filtered ");
                            zzbhVar = new zzbh("_cmpx", zzbfVar, zzbhVar.red, zzbhVar.silver);
                        }
                    }
                }
                String str5 = zzbhVar.alpha;
                boolean booleanValue = ((Boolean) ac.f7597g0.alpha(null)).booleanValue();
                zzr zzrVar2 = (zzr) this.purple;
                if (!booleanValue) {
                    A a6 = z05.alpha;
                    Z0.cyan(a6);
                    String str6 = zzrVar2.alpha;
                    if (!TextUtils.isEmpty(str6) && (c1314f0 = (C1314f0) a6.f7496a.get(str6)) != null && c1314f0.november() != 0) {
                        z05.crimson().f7636g.bravo(str6, "EES config found for");
                    } else {
                        o11.lavender(zzbhVar, zzrVar2);
                        return;
                    }
                }
                A a8 = z05.alpha;
                au auVar = z05.yellow;
                Z0.cyan(a8);
                String str7 = zzrVar2.alpha;
                if (!TextUtils.isEmpty(str7)) {
                    afVar = (af) a8.f7498c.charlie(str7);
                }
                if (afVar != null) {
                    try {
                        C1298c c1298c = afVar.charlie;
                        Z0.cyan(auVar);
                        HashMap H02 = au.H0(zzbhVar.purple.o(), true);
                        String delta = W.delta(str5, W.charlie, W.alpha);
                        if (delta == null) {
                            delta = str5;
                        }
                        if (afVar.bravo(new C1293b(delta, zzbhVar.silver, H02))) {
                            if (!((C1293b) c1298c.red).equals((C1293b) c1298c.purple)) {
                                z05.crimson().f7636g.bravo(str5, "EES edited event");
                                Z0.cyan(auVar);
                                o11.lavender(au.z0((C1293b) c1298c.red), zzrVar2);
                            } else {
                                o11.lavender(zzbhVar, zzrVar2);
                            }
                            if (!((ArrayList) c1298c.silver).isEmpty()) {
                                Iterator it = ((ArrayList) c1298c.silver).iterator();
                                while (it.hasNext()) {
                                    C1293b c1293b = (C1293b) it.next();
                                    z05.crimson().f7636g.bravo(c1293b.alpha, "EES logging created event");
                                    Z0.cyan(auVar);
                                    o11.lavender(au.z0(c1293b), zzrVar2);
                                }
                                return;
                            }
                            return;
                        }
                    } catch (zzd unused2) {
                        z05.crimson().white.charlie(zzrVar2.purple, str5, "EES error. appId, eventName");
                    }
                    z05.crimson().f7636g.bravo(str5, "EES was not applied to event");
                    o11.lavender(zzbhVar, zzrVar2);
                    return;
                }
                z05.crimson().f7636g.bravo(zzrVar2.alpha, "EES not loaded for");
                o11.lavender(zzbhVar, zzrVar2);
                return;
            case 7:
                O o12 = (O) this.silver;
                o12.golf.echo();
                o12.golf.mike((zzbh) this.red, (String) this.purple);
                return;
            case 8:
                O o13 = (O) this.silver;
                o13.golf.echo();
                zzqb zzqbVar = (zzqb) this.red;
                Object o14 = zzqbVar.o();
                zzr zzrVar3 = (zzr) this.purple;
                Z0 z06 = o13.golf;
                if (o14 == null) {
                    z06.indigo(zzqbVar.purple, zzrVar3);
                    return;
                } else {
                    z06.maroon(zzqbVar, zzrVar3);
                    return;
                }
            case 9:
                zzr zzrVar4 = (zzr) this.purple;
                zzag zzagVar2 = (zzag) this.silver;
                H0 h02 = (H0) this.red;
                ae aeVar = h02.silver;
                G g11 = (G) h02.alpha;
                if (aeVar == null) {
                    ar arVar4 = g11.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.white.alpha("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    aeVar.gold(zzrVar4, zzagVar2);
                    h02.m0();
                    return;
                } catch (RemoteException e16) {
                    ar arVar5 = g11.f7507b;
                    G.foxtrot(arVar5);
                    arVar5.white.charlie(Long.valueOf(zzagVar2.alpha), e16, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 10:
                alpha();
                return;
            case 11:
                ao aoVar = (ao) this.purple;
                H0 h03 = (H0) this.silver;
                G g12 = (G) h03.alpha;
                try {
                    try {
                        ax axVar2 = g12.f7506a;
                        G.delta(axVar2);
                        kilo = axVar2.d0().kilo(U.ANALYTICS_STORAGE);
                        axVar = g12.f7506a;
                        arVar = g12.f7507b;
                    } catch (Throwable th5) {
                        d1 d1Var2 = g12.e;
                        G.delta(d1Var2);
                        d1Var2.y0(null, aoVar);
                        throw th5;
                    }
                } catch (RemoteException e17) {
                    ar arVar6 = g12.f7507b;
                    G.foxtrot(arVar6);
                    arVar6.white.bravo(e17, "Failed to get app instance id");
                }
                if (!kilo) {
                    G.foxtrot(arVar);
                    arVar.f7634d.alpha("Analytics storage consent denied; will not get app instance id");
                    C1459n0 c1459n0 = g12.f7513i;
                    G.echo(c1459n0);
                    c1459n0.yellow.set(null);
                    G.delta(axVar);
                    axVar.f7638a.oscar(null);
                } else {
                    ae aeVar2 = h03.silver;
                    if (aeVar2 == null) {
                        G.foxtrot(arVar);
                        arVar.white.alpha("Failed to get app instance id");
                    } else {
                        str = aeVar2.amber((zzr) this.red);
                        if (str != null) {
                            C1459n0 c1459n02 = g12.f7513i;
                            G.echo(c1459n02);
                            c1459n02.yellow.set(str);
                            G.delta(axVar);
                            axVar.f7638a.oscar(str);
                        }
                        h03.m0();
                        d1Var = g12.e;
                        G.delta(d1Var);
                        d1Var.y0(str, aoVar);
                        return;
                    }
                }
                d1Var = g12.e;
                G.delta(d1Var);
                d1Var.y0(str, aoVar);
                return;
            case 12:
                ((ar) this.purple).f7636g.alpha("AppMeasurementJobService processed last upload request.");
                ((K0) ((Service) ((ah) this.red).purple)).charlie((JobParameters) this.silver);
                return;
            case 13:
                View view = (View) this.purple;
                if (view != null && (overScroller = (jVar = (com.google.android.material.appbar.j) this.silver).purple) != null) {
                    boolean computeScrollOffset = overScroller.computeScrollOffset();
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.red;
                    if (computeScrollOffset) {
                        jVar.golf(coordinatorLayout, view, jVar.purple.getCurrY());
                        view.postOnAnimation(this);
                        return;
                    }
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    ((AppBarLayout.BaseBehavior) jVar).mike(coordinatorLayout, appBarLayout);
                    if (appBarLayout.e) {
                        appBarLayout.foxtrot(appBarLayout.golf(AppBarLayout.BaseBehavior.juliet(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                o3.c.foxtrot((r) this.purple, (o3.g) this.silver);
                ((Handler) this.red).postDelayed(this, 5000L);
                return;
            default:
                try {
                    obj = ((p1.e) this.red).call();
                } catch (Exception unused3) {
                }
                ((Handler) this.silver).post(new E(19, (bj.d) this.purple, obj));
                return;
        }
    }

    public /* synthetic */ d(Context context, CloudMessage cloudMessage, CountDownLatch countDownLatch) {
        this.alpha = 1;
        this.purple = context;
        this.red = cloudMessage;
        this.silver = countDownLatch;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
        this.silver = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i4, boolean z2) {
        this.alpha = i4;
        this.red = obj2;
        this.purple = obj3;
        this.silver = obj;
    }
}
