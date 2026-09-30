package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.BroadcastOptions;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import b3.ServiceConnectionC0716b;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.internal.measurement.AbstractC1305d1;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C1289a0;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.internal.measurement.C1314f0;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1344l0;
import com.google.android.gms.internal.measurement.C1348m0;
import com.google.android.gms.internal.measurement.C1350m2;
import com.google.android.gms.internal.measurement.C1356o0;
import com.google.android.gms.internal.measurement.C1360p0;
import com.google.android.gms.internal.measurement.C1379u0;
import com.google.android.gms.internal.measurement.C1383v0;
import com.google.android.gms.internal.measurement.C1391x0;
import com.google.android.gms.internal.measurement.C1395y0;
import com.google.android.gms.internal.measurement.zzmm;
import com.google.maps.android.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import d6.C1590a;
import e6.C1629a;
import g6.C1754b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public final class Z0 implements Q {

    /* renamed from: D, reason: collision with root package name */
    public static volatile Z0 f7537D;
    public N0 A;
    public long B;

    /* renamed from: a, reason: collision with root package name */
    public au f7538a;
    public final A alpha;

    /* renamed from: b, reason: collision with root package name */
    public J0 f7539b;

    /* renamed from: d, reason: collision with root package name */
    public ay f7541d;
    public final G e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7543g;

    /* renamed from: h, reason: collision with root package name */
    public long f7544h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f7545i;

    /* renamed from: k, reason: collision with root package name */
    public int f7547k;

    /* renamed from: l, reason: collision with root package name */
    public int f7548l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7549m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7550n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7551o;

    /* renamed from: p, reason: collision with root package name */
    public FileLock f7552p;
    public final au purple;

    /* renamed from: q, reason: collision with root package name */
    public FileChannel f7553q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f7554r;
    public C1450j red;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f7555s;
    public av silver;
    public S0 teal;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f7557u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f7558v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f7559w;
    public C1436c white;

    /* renamed from: y, reason: collision with root package name */
    public C1474v0 f7561y;
    public final au yellow;

    /* renamed from: z, reason: collision with root package name */
    public String f7562z;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7542f = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final LinkedList f7546j = new LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f7560x = new HashMap();
    public final androidx.core.widget.f C = new androidx.core.widget.f(27, this);

    /* renamed from: t, reason: collision with root package name */
    public long f7556t = -1;

    /* renamed from: c, reason: collision with root package name */
    public final W0 f7540c = new T0(this);

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.measurement.internal.W0, com.google.android.gms.measurement.internal.T0] */
    public Z0(H0.a aVar) {
        this.e = G.lima(aVar.purple, null, null);
        au auVar = new au(this, 2);
        auVar.Y();
        this.yellow = auVar;
        au auVar2 = new au(this, 0);
        auVar2.Y();
        this.purple = auVar2;
        A a6 = new A(this);
        a6.Y();
        this.alpha = a6;
        this.f7557u = new HashMap();
        this.f7558v = new HashMap();
        this.f7559w = new HashMap();
        u().g0(new F6.b(this, aVar));
    }

    public static final boolean coral(zzr zzrVar) {
        if (TextUtils.isEmpty(zzrVar.purple) && TextUtils.isEmpty(zzrVar.f7704i)) {
            return false;
        }
        return true;
    }

    public static final void cyan(U0 u02) {
        if (u02 != null) {
            if (u02.red) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(u02.getClass())));
            }
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static final Boolean emerald(zzr zzrVar) {
        Boolean bool = zzrVar.f7705j;
        String str = zzrVar.f7719x;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((S) androidx.core.widget.f.beige(str).purple).ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return Boolean.FALSE;
                    }
                } else {
                    return Boolean.TRUE;
                }
            } else {
                return null;
            }
        }
        return bool;
    }

    public static Z0 f(Service service) {
        V5.x.hotel(service);
        V5.x.hotel(service.getApplicationContext());
        if (f7537D == null) {
            synchronized (Z0.class) {
                try {
                    if (f7537D == null) {
                        f7537D = new Z0(new H0.a(service));
                    }
                } finally {
                }
            }
        }
        return f7537D;
    }

    public static final void romeo(C1379u0 c1379u0, int i4, String str) {
        List november = c1379u0.november();
        for (int i5 = 0; i5 < november.size(); i5++) {
            if ("_err".equals(((C1395y0) november.get(i5)).sierra())) {
                return;
            }
        }
        C1391x0 romeo = C1395y0.romeo();
        romeo.india("_err");
        romeo.hotel(i4);
        C1395y0 c1395y0 = (C1395y0) romeo.echo();
        C1391x0 romeo2 = C1395y0.romeo();
        romeo2.india("_ev");
        romeo2.juliet(str);
        C1395y0 c1395y02 = (C1395y0) romeo2.echo();
        c1379u0.kilo(c1395y0);
        c1379u0.kilo(c1395y02);
    }

    public static final void sierra(C1379u0 c1379u0, String str) {
        List november = c1379u0.november();
        for (int i4 = 0; i4 < november.size(); i4++) {
            if (str.equals(((C1395y0) november.get(i4)).sierra())) {
                c1379u0.golf();
                C1383v0.yankee((C1383v0) c1379u0.purple, i4);
                return;
            }
        }
    }

    public static String xray(String str, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    if (!((List) entry.getValue()).isEmpty()) {
                        return (String) ((List) entry.getValue()).get(0);
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final C1454l a(String str, C1454l c1454l, V v4, av.ah ahVar) {
        U u4;
        boolean z2;
        S j02;
        A a6 = this.alpha;
        cyan(a6);
        C1289a0 k02 = a6.k0(str);
        S s3 = S.DENIED;
        U u10 = U.AD_USER_DATA;
        int i4 = 90;
        if (k02 == null) {
            if (c1454l.charlie() == s3) {
                i4 = c1454l.alpha;
                ahVar.teal(u10, i4);
            } else {
                ahVar.white(u10, EnumC1442f.FAILSAFE);
            }
            return new C1454l(Boolean.FALSE, i4, Boolean.TRUE, "-");
        }
        S charlie = c1454l.charlie();
        S s9 = S.GRANTED;
        boolean z10 = false;
        if (charlie != s9 && charlie != s3) {
            S s10 = S.POLICY;
            S s11 = S.UNINITIALIZED;
            if (charlie == s10 && (j02 = a6.j0(str, u10)) != s11) {
                ahVar.white(u10, EnumC1442f.REMOTE_ENFORCED_DEFAULT);
                charlie = j02;
            } else {
                a6.W();
                a6.e0(str);
                C1289a0 k03 = a6.k0(str);
                if (k03 != null) {
                    for (com.google.android.gms.internal.measurement.Y y10 : k03.quebec()) {
                        if (u10 == A.h0(y10.oscar())) {
                            u4 = A.h0(y10.november());
                            break;
                        }
                    }
                }
                u4 = null;
                U u11 = U.AD_STORAGE;
                S s12 = (S) v4.alpha.get(u11);
                if (s12 != null) {
                    s11 = s12;
                }
                if (s11 == s9 || s11 == s3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (u4 == u11 && z2) {
                    ahVar.white(u10, EnumC1442f.REMOTE_DELEGATION);
                    charlie = s11;
                } else {
                    ahVar.white(u10, EnumC1442f.REMOTE_DEFAULT);
                    if (true != a6.n0(str, u10)) {
                        charlie = s3;
                    } else {
                        charlie = s9;
                    }
                }
            }
        } else {
            i4 = c1454l.alpha;
            ahVar.teal(u10, i4);
        }
        a6.W();
        a6.e0(str);
        C1289a0 k04 = a6.k0(str);
        if (k04 == null || !k04.tango() || k04.sierra()) {
            z10 = true;
        }
        cyan(a6);
        a6.W();
        a6.e0(str);
        TreeSet treeSet = new TreeSet();
        C1289a0 k05 = a6.k0(str);
        if (k05 != null) {
            Iterator it = k05.oscar().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.Z) it.next()).november());
            }
        }
        if (charlie != s3 && !treeSet.isEmpty()) {
            Boolean bool = Boolean.TRUE;
            Boolean valueOf = Boolean.valueOf(z10);
            String str2 = "";
            if (z10) {
                str2 = TextUtils.join("", treeSet);
            }
            return new C1454l(bool, i4, valueOf, str2);
        }
        return new C1454l(Boolean.FALSE, i4, Boolean.valueOf(z10), "-");
    }

    public final au alpha() {
        au auVar = this.yellow;
        cyan(auVar);
        return auVar;
    }

    public final void amber() {
        u().W();
        if (!this.f7546j.isEmpty()) {
            if (this.A == null) {
                this.A = new N0(this, this.e, 2);
            }
            if (this.A.charlie != 0) {
                return;
            }
            pink().getClass();
            long max = Math.max(0L, ((Integer) ac.f7614t.alpha(null)).intValue() - (SystemClock.elapsedRealtime() - this.B));
            crimson().f7636g.bravo(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
            if (this.A == null) {
                this.A = new N0(this, this.e, 2);
            }
            this.A.charlie(max);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void azure() {
        boolean z2;
        long max;
        long max2;
        long j5;
        Integer num;
        int intValue;
        ao.ad.crimson(this);
        if (this.f7544h > 0) {
            pink().getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.f7544h);
            if (abs > 0) {
                crimson().f7636g.bravo(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                c().alpha();
                S0 s02 = this.teal;
                cyan(s02);
                s02.a0();
                return;
            }
            this.f7544h = 0L;
        }
        if (this.e.bravo() && black()) {
            pink().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            white();
            long max3 = Math.max(0L, ((Long) ac.indigo.alpha(null)).longValue());
            C1450j c1450j = this.red;
            cyan(c1450j);
            if (c1450j.N0("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
                C1450j c1450j2 = this.red;
                cyan(c1450j2);
                if (c1450j2.N0("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                    z2 = false;
                    if (!z2) {
                        String a02 = white().a0("debug.firebase.analytics.app");
                        if (!TextUtils.isEmpty(a02) && !".none.".equals(a02)) {
                            white();
                            max = Math.max(0L, ((Long) ac.emerald.alpha(null)).longValue());
                        } else {
                            white();
                            max = Math.max(0L, ((Long) ac.cyan.alpha(null)).longValue());
                        }
                    } else {
                        white();
                        max = Math.max(0L, ((Long) ac.crimson.alpha(null)).longValue());
                    }
                    long alpha = this.f7539b.f7534a.alpha();
                    long alpha2 = this.f7539b.f7535b.alpha();
                    C1450j c1450j3 = this.red;
                    cyan(c1450j3);
                    long O02 = c1450j3.O0("select max(bundle_end_timestamp) from queue", null, 0L);
                    C1450j c1450j4 = this.red;
                    cyan(c1450j4);
                    max2 = Math.max(O02, c1450j4.O0("select max(timestamp) from raw_events", null, 0L));
                    au auVar = this.yellow;
                    if (max2 != 0) {
                        long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                        long abs3 = currentTimeMillis - Math.abs(alpha - currentTimeMillis);
                        long abs4 = currentTimeMillis - Math.abs(alpha2 - currentTimeMillis);
                        long j6 = max3 + abs2;
                        long max4 = Math.max(abs3, abs4);
                        if (z2 && max4 > 0) {
                            j6 = Math.min(abs2, max4) + max;
                        }
                        cyan(auVar);
                        if (!auVar.L0(max4, max)) {
                            j5 = max4 + max;
                        } else {
                            j5 = j6;
                        }
                        if (abs4 != 0 && abs4 >= abs2) {
                            int i4 = 0;
                            while (true) {
                                white();
                                if (i4 >= Math.min(20, Math.max(0, ((Integer) ac.jade.alpha(null)).intValue()))) {
                                    break;
                                }
                                white();
                                j5 += Math.max(0L, ((Long) ac.ivory.alpha(null)).longValue()) * (1 << i4);
                                if (j5 > abs4) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        if (j5 == 0) {
                            crimson().f7636g.alpha("Next upload time is 0");
                            c().alpha();
                            S0 s03 = this.teal;
                            cyan(s03);
                            s03.a0();
                            return;
                        }
                        au auVar2 = this.purple;
                        cyan(auVar2);
                        if (auVar2.v0()) {
                            long alpha3 = this.f7539b.yellow.alpha();
                            white();
                            long max5 = Math.max(0L, ((Long) ac.bronze.alpha(null)).longValue());
                            cyan(auVar);
                            if (!auVar.L0(alpha3, max5)) {
                                j5 = Math.max(j5, alpha3 + max5);
                            }
                            c().alpha();
                            pink().getClass();
                            long currentTimeMillis2 = j5 - System.currentTimeMillis();
                            if (currentTimeMillis2 <= 0) {
                                white();
                                currentTimeMillis2 = Math.max(0L, ((Long) ac.fuchsia.alpha(null)).longValue());
                                aw awVar = this.f7539b.f7534a;
                                pink().getClass();
                                awVar.bravo(System.currentTimeMillis());
                            }
                            crimson().f7636g.bravo(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                            S0 s04 = this.teal;
                            cyan(s04);
                            s04.X();
                            G g2 = (G) s04.alpha;
                            g2.getClass();
                            Context context = g2.alpha;
                            boolean S02 = d1.S0(context);
                            ar arVar = g2.f7507b;
                            if (!S02) {
                                G.foxtrot(arVar);
                                arVar.f7635f.alpha("Receiver not registered/enabled");
                            }
                            if (!d1.U0(context)) {
                                G.foxtrot(arVar);
                                arVar.f7635f.alpha("Service not registered/enabled");
                            }
                            s04.a0();
                            G.foxtrot(arVar);
                            arVar.f7636g.bravo(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                            g2.f7511g.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime() + currentTimeMillis2;
                            if (currentTimeMillis2 < Math.max(0L, ((Long) ac.gold.alpha(null)).longValue()) && s04.d0().charlie == 0) {
                                s04.d0().charlie(currentTimeMillis2);
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                                int b02 = s04.b0();
                                PersistableBundle persistableBundle = new PersistableBundle();
                                persistableBundle.putString(Constants.KEY_ACTION, "com.google.android.gms.measurement.UPLOAD");
                                JobInfo build = new JobInfo.Builder(b02, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                                Method method = com.google.android.gms.internal.measurement.ah.alpha;
                                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                                jobScheduler.getClass();
                                Method method2 = com.google.android.gms.internal.measurement.ah.alpha;
                                if (method2 != null && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
                                    Method method3 = com.google.android.gms.internal.measurement.ah.bravo;
                                    try {
                                        if (method3 != null) {
                                            try {
                                                num = (Integer) method3.invoke(UserHandle.class, null);
                                            } catch (IllegalAccessException | InvocationTargetException e) {
                                                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                                                }
                                            }
                                            if (num != null) {
                                                intValue = num.intValue();
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (IllegalAccessException | InvocationTargetException e4) {
                                        Log.e("UploadAlarm", "error calling scheduleAsPackage", e4);
                                        jobScheduler.schedule(build);
                                        return;
                                    }
                                    intValue = 0;
                                } else {
                                    jobScheduler.schedule(build);
                                    return;
                                }
                            } else {
                                AlarmManager alarmManager = s04.silver;
                                if (alarmManager != null) {
                                    alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) ac.coral.alpha(null)).longValue(), currentTimeMillis2), s04.c0());
                                    return;
                                }
                                return;
                            }
                        } else {
                            crimson().f7636g.alpha("No network");
                            av c3 = c();
                            Z0 z02 = c3.alpha;
                            z02.foxtrot();
                            z02.u().W();
                            if (!c3.bravo) {
                                z02.e.alpha.registerReceiver(c3, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                au auVar3 = z02.purple;
                                cyan(auVar3);
                                c3.charlie = auVar3.v0();
                                z02.crimson().f7636g.bravo(Boolean.valueOf(c3.charlie), "Registering connectivity change receiver. Network connected");
                                c3.bravo = true;
                            }
                            S0 s05 = this.teal;
                            cyan(s05);
                            s05.a0();
                            return;
                        }
                    }
                    j5 = 0;
                    if (j5 == 0) {
                    }
                }
            }
            z2 = true;
            if (!z2) {
            }
            long alpha4 = this.f7539b.f7534a.alpha();
            long alpha22 = this.f7539b.f7535b.alpha();
            C1450j c1450j32 = this.red;
            cyan(c1450j32);
            long O022 = c1450j32.O0("select max(bundle_end_timestamp) from queue", null, 0L);
            C1450j c1450j42 = this.red;
            cyan(c1450j42);
            max2 = Math.max(O022, c1450j42.O0("select max(timestamp) from raw_events", null, 0L));
            au auVar4 = this.yellow;
            if (max2 != 0) {
            }
            j5 = 0;
            if (j5 == 0) {
            }
        } else {
            crimson().f7636g.alpha("Nothing to upload or uploading impossible");
            c().alpha();
            S0 s06 = this.teal;
            cyan(s06);
            s06.a0();
        }
    }

    public final C1454l b(String str) {
        ao.ad.crimson(this);
        HashMap hashMap = this.f7558v;
        C1454l c1454l = (C1454l) hashMap.get(str);
        if (c1454l == null) {
            C1450j c1450j = this.red;
            cyan(c1450j);
            V5.x.hotel(str);
            c1450j.W();
            c1450j.X();
            C1454l bravo = C1454l.bravo(c1450j.B0("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
            hashMap.put(str, bravo);
            return bravo;
        }
        return c1454l;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0381 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03df A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0416 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0435 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0450 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x051a A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05ac A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x055a A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0f35 A[Catch: all -> 0x0117, TRY_LEAVE, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0f51 A[Catch: all -> 0x0117, SQLiteException -> 0x0f67, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0f67, blocks: (B:444:0x0f42, B:446:0x0f51), top: B:443:0x0f42, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0232 A[Catch: all -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0271 A[Catch: all -> 0x0117, TRY_ENTER, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e2 A[EDGE_INSN: B:88:0x02e2->B:89:0x02e2 BREAK  A[LOOP:2: B:74:0x0263->B:81:0x02db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0314 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0371 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:3:0x0012, B:5:0x002a, B:7:0x0033, B:8:0x0052, B:11:0x0070, B:14:0x009a, B:16:0x00d7, B:19:0x00f0, B:21:0x00fa, B:24:0x06eb, B:25:0x012f, B:27:0x0141, B:30:0x0151, B:32:0x0157, B:35:0x0161, B:37:0x016e, B:39:0x017c, B:41:0x0182, B:44:0x018d, B:45:0x019b, B:47:0x01ad, B:50:0x01d4, B:52:0x01de, B:54:0x01ee, B:56:0x01fc, B:58:0x020c, B:60:0x0217, B:65:0x021a, B:68:0x0232, B:74:0x0263, B:77:0x0271, B:79:0x027f, B:81:0x02db, B:82:0x02a3, B:84:0x02b3, B:92:0x02ea, B:94:0x0314, B:95:0x033c, B:97:0x0371, B:98:0x0377, B:101:0x0383, B:103:0x03b8, B:104:0x03d5, B:106:0x03df, B:108:0x03ed, B:110:0x0401, B:111:0x03f5, B:119:0x0408, B:122:0x0416, B:123:0x0435, B:125:0x0450, B:126:0x045c, B:129:0x0466, B:133:0x0489, B:134:0x0478, B:142:0x0490, B:144:0x049c, B:146:0x04a8, B:149:0x04f1, B:150:0x04c9, B:153:0x04db, B:155:0x04e1, B:157:0x04eb, B:160:0x050e, B:162:0x051a, B:165:0x052b, B:167:0x053c, B:169:0x0548, B:171:0x05a2, B:173:0x05ac, B:174:0x05b8, B:176:0x05c2, B:178:0x05d2, B:180:0x05dc, B:181:0x05ef, B:183:0x05f5, B:184:0x0610, B:186:0x0616, B:188:0x0634, B:190:0x0643, B:192:0x066e, B:193:0x064b, B:195:0x0659, B:199:0x0676, B:200:0x0695, B:202:0x069b, B:205:0x06ae, B:210:0x06bb, B:211:0x06bf, B:213:0x06c5, B:215:0x06d3, B:220:0x055a, B:222:0x0568, B:225:0x057b, B:227:0x058c, B:229:0x0598, B:239:0x0704, B:241:0x0716, B:243:0x071f, B:245:0x074e, B:246:0x0725, B:248:0x072e, B:250:0x0734, B:252:0x0740, B:254:0x0748, B:261:0x0751, B:262:0x075d, B:265:0x0765, B:268:0x0777, B:269:0x0782, B:271:0x078a, B:272:0x07b9, B:274:0x07d5, B:275:0x07ea, B:277:0x0806, B:278:0x081b, B:279:0x0837, B:281:0x083d, B:283:0x0855, B:284:0x0863, B:286:0x0873, B:288:0x0881, B:291:0x0886, B:293:0x08d0, B:295:0x08d6, B:296:0x0901, B:298:0x0909, B:299:0x0927, B:301:0x092d, B:302:0x0941, B:304:0x0958, B:306:0x0969, B:308:0x097b, B:310:0x0985, B:311:0x0988, B:313:0x09e3, B:314:0x09f6, B:317:0x09fe, B:320:0x0a1d, B:322:0x0a36, B:324:0x0a4b, B:326:0x0a50, B:328:0x0a54, B:330:0x0a58, B:332:0x0a62, B:333:0x0a68, B:335:0x0a6c, B:337:0x0a72, B:338:0x0a7e, B:339:0x0a87, B:342:0x0cf8, B:343:0x0a92, B:406:0x0aaa, B:346:0x0ad2, B:348:0x0af9, B:349:0x0b01, B:351:0x0b07, B:355:0x0b17, B:360:0x0b41, B:361:0x0b64, B:363:0x0b70, B:365:0x0b86, B:366:0x0bc6, B:371:0x0be0, B:373:0x0beb, B:375:0x0bef, B:377:0x0bf3, B:379:0x0bf7, B:380:0x0c03, B:381:0x0c08, B:383:0x0c0e, B:385:0x0c24, B:386:0x0c29, B:387:0x0cf3, B:389:0x0c67, B:391:0x0c6b, B:394:0x0c7f, B:396:0x0ca1, B:397:0x0ca8, B:400:0x0ce7, B:401:0x0c70, B:404:0x0b2b, B:410:0x0ab6, B:412:0x0d00, B:414:0x0d0e, B:415:0x0d22, B:416:0x0d2a, B:418:0x0d30, B:420:0x0d48, B:422:0x0d5a, B:423:0x0e09, B:425:0x0e0f, B:427:0x0e26, B:430:0x0e2d, B:431:0x0e6e, B:433:0x0e76, B:435:0x0eb2, B:437:0x0ee6, B:439:0x0eea, B:440:0x0ef4, B:442:0x0f35, B:444:0x0f42, B:446:0x0f51, B:449:0x0f68, B:452:0x0f7f, B:453:0x0ec5, B:454:0x0e3c, B:456:0x0e4a, B:457:0x0e55, B:458:0x0f94, B:460:0x0fa7, B:461:0x0fc7, B:467:0x0fb2, B:468:0x0d75, B:470:0x0d7b, B:472:0x0d8b, B:473:0x0d92, B:478:0x0da8, B:479:0x0daf, B:481:0x0dfa, B:482:0x0e01, B:483:0x0dfe, B:484:0x0dac, B:486:0x0d8f, B:488:0x08e6, B:490:0x08ec, B:492:0x08f2, B:493:0x0818, B:494:0x07e7, B:495:0x0790, B:497:0x0796, B:501:0x0fd1), top: B:2:0x0012, inners: #0, #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean beige(long j5, String str) {
        boolean z2;
        int i4;
        int i5;
        G g2;
        com.google.android.gms.internal.measurement.C0 c02;
        long j6;
        boolean z10;
        C1450j yellow;
        G g5;
        com.google.android.gms.internal.measurement.D0 d02;
        long alpha;
        long R02;
        ab abVar;
        ContentValues contentValues;
        long j7;
        int i02;
        boolean z11;
        long hotel;
        Long l10;
        String str2;
        int i10;
        boolean o02;
        boolean z12;
        String str3;
        String str4;
        String str5;
        String str6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        C1391x0 c1391x0;
        boolean z15;
        String str7;
        String str8;
        Z0 z02 = this;
        String str9 = "1";
        String str10 = "_ai";
        String str11 = "purchase";
        String str12 = "items";
        z02.yellow().h0();
        try {
            C2.d dVar = new C2.d(z02);
            z02.yellow().L0(str, j5, z02.f7556t, dVar);
            ArrayList arrayList = (ArrayList) dVar.silver;
            if (arrayList != null && !arrayList.isEmpty()) {
                com.google.android.gms.internal.measurement.C0 c03 = (com.google.android.gms.internal.measurement.C0) ((com.google.android.gms.internal.measurement.D0) dVar.purple).foxtrot();
                c03.golf();
                com.google.android.gms.internal.measurement.D0.o((com.google.android.gms.internal.measurement.D0) c03.purple);
                int i17 = -1;
                int i18 = -1;
                int i19 = 0;
                int i20 = 0;
                boolean z16 = false;
                int i21 = 0;
                C1379u0 c1379u0 = null;
                C1379u0 c1379u02 = null;
                while (true) {
                    int size = ((ArrayList) dVar.silver).size();
                    i4 = i20;
                    String str13 = "_et";
                    boolean z17 = z16;
                    i5 = i21;
                    C1379u0 c1379u03 = c1379u0;
                    g2 = z02.e;
                    String str14 = str12;
                    c02 = c03;
                    if (i19 >= size) {
                        break;
                    }
                    C1379u0 c1379u04 = (C1379u0) ((C1383v0) ((ArrayList) dVar.silver).get(i19)).foxtrot();
                    if (z02.d().p0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u04.mike())) {
                        z02.crimson().d0().charlie(ar.e0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()), g2.kilo().delta(c1379u04.mike()), "Dropping blocked raw event. appId");
                        if (!str9.equals(z02.d().d(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), "measurement.upload.blacklist_internal")) && !str9.equals(z02.d().d(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), "measurement.upload.blacklist_public")) && !"_err".equals(c1379u04.mike())) {
                            z02.bravo();
                            d1.q0(z02.C, ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), 11, "_ev", c1379u04.mike(), 0);
                        }
                        i20 = i4;
                        str2 = str9;
                        str5 = str10;
                        str4 = str11;
                        i12 = i19;
                        c1379u0 = c1379u03;
                        str6 = str14;
                        c03 = c02;
                    } else {
                        C1350m2.alpha();
                        str2 = str9;
                        if (z02.white().j0(null, ac.f7583Y)) {
                            String mike = c1379u04.mike();
                            if (!mike.equals(str11)) {
                                if (!mike.equals("_iap")) {
                                    if (mike.equals("ecommerce_purchase")) {
                                    }
                                }
                            }
                            C1391x0 romeo = C1395y0.romeo();
                            i10 = i19;
                            romeo.india("_cbs");
                            if (!z17) {
                                String romeo2 = ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo();
                                if (z02.blue(romeo2, str11) && z02.blue(romeo2, "_iap") && z02.blue(romeo2, "ecommerce_purchase")) {
                                    str8 = "new_buyer";
                                    romeo.juliet(str8);
                                    c1379u04.kilo((C1395y0) romeo.echo());
                                    z17 = true;
                                    if (c1379u04.mike().equals(W.delta(str10, W.charlie, W.alpha))) {
                                        c1379u04.golf();
                                        C1383v0.zulu((C1383v0) c1379u04.purple, str10);
                                        z02.crimson().c0().alpha("Renaming ad_impression to _ai");
                                        if (Log.isLoggable(z02.crimson().h0(), 5)) {
                                            for (int i22 = 0; i22 < ((C1383v0) c1379u04.purple).oscar(); i22++) {
                                                if ("ad_platform".equals(c1379u04.lima(i22).sierra()) && !c1379u04.lima(i22).tango().isEmpty() && "admob".equalsIgnoreCase(c1379u04.lima(i22).tango())) {
                                                    z02.crimson().f7634d.alpha("AdMob ad impression logged from app. Potentially duplicative.");
                                                }
                                            }
                                        }
                                    }
                                    o02 = z02.d().o0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u04.mike());
                                    if (!o02) {
                                        z02.alpha();
                                        String mike2 = c1379u04.mike();
                                        V5.x.echo(mike2);
                                        z12 = o02;
                                        if (mike2.hashCode() != 95027 || !mike2.equals("_ui")) {
                                            str5 = str10;
                                            str4 = str11;
                                            str3 = "_et";
                                            z12 = false;
                                            if (z12) {
                                                ArrayList arrayList2 = new ArrayList(c1379u04.november());
                                                int i23 = -1;
                                                int i24 = -1;
                                                for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                                                    if ("value".equals(((C1395y0) arrayList2.get(i25)).sierra())) {
                                                        i23 = i25;
                                                    } else if ("currency".equals(((C1395y0) arrayList2.get(i25)).sierra())) {
                                                        i24 = i25;
                                                    }
                                                }
                                                if (i23 != -1) {
                                                    if (!((C1395y0) arrayList2.get(i23)).crimson() && !((C1395y0) arrayList2.get(i23)).bronze()) {
                                                        z02.crimson().f7634d.alpha("Value must be specified with a numeric type.");
                                                        c1379u04.golf();
                                                        C1383v0.yankee((C1383v0) c1379u04.purple, i23);
                                                        sierra(c1379u04, "_c");
                                                        romeo(c1379u04, 18, "value");
                                                    } else {
                                                        if (i24 != -1) {
                                                            String tango = ((C1395y0) arrayList2.get(i24)).tango();
                                                            if (tango.length() == 3) {
                                                                int i26 = 0;
                                                                while (i26 < tango.length()) {
                                                                    int codePointAt = tango.codePointAt(i26);
                                                                    if (Character.isLetter(codePointAt)) {
                                                                        i26 += Character.charCount(codePointAt);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z02.crimson().f7634d.alpha("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                        c1379u04.golf();
                                                        C1383v0.yankee((C1383v0) c1379u04.purple, i23);
                                                        sierra(c1379u04, "_c");
                                                        romeo(c1379u04, 19, "currency");
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!"_e".equals(c1379u04.mike())) {
                                                z02.alpha();
                                                if (au.f0((C1383v0) c1379u04.echo(), "_fr") == null) {
                                                    if (c1379u02 != null && Math.abs(c1379u02.india() - c1379u04.india()) <= 1000) {
                                                        C1379u0 c1379u05 = (C1379u0) c1379u02.clone();
                                                        if (z02.bronze(c1379u04, c1379u05)) {
                                                            c03 = c02;
                                                            c03.amber(i18, c1379u05);
                                                            c1379u0 = null;
                                                            c1379u02 = null;
                                                        }
                                                    }
                                                    c03 = c02;
                                                    i17 = i4;
                                                    c1379u0 = c1379u04;
                                                } else {
                                                    c03 = c02;
                                                    c1379u0 = c1379u03;
                                                }
                                            } else {
                                                c03 = c02;
                                                if ("_vs".equals(c1379u04.mike())) {
                                                    z02.alpha();
                                                    if (au.f0((C1383v0) c1379u04.echo(), str3) == null) {
                                                        if (c1379u03 != null && Math.abs(c1379u03.india() - c1379u04.india()) <= 1000) {
                                                            C1379u0 c1379u06 = (C1379u0) c1379u03.clone();
                                                            if (z02.bronze(c1379u06, c1379u04)) {
                                                                c03.amber(i17, c1379u06);
                                                                c1379u0 = null;
                                                                c1379u02 = null;
                                                            }
                                                        }
                                                        i18 = i4;
                                                        c1379u02 = c1379u04;
                                                    }
                                                }
                                                c1379u0 = c1379u03;
                                            }
                                            if (((C1383v0) c1379u04.purple).oscar() == 0) {
                                                z02.alpha();
                                                Bundle e02 = au.e0(c1379u04.november());
                                                int i27 = 0;
                                                while (i27 < ((C1383v0) c1379u04.purple).oscar()) {
                                                    C1395y0 lima = c1379u04.lima(i27);
                                                    String str15 = str14;
                                                    if (lima.sierra().equals(str15) && !lima.uniform().isEmpty()) {
                                                        String romeo3 = ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo();
                                                        List uniform = lima.uniform();
                                                        Bundle[] bundleArr = new Bundle[uniform.size()];
                                                        int i28 = 0;
                                                        while (i28 < uniform.size()) {
                                                            C1395y0 c1395y0 = (C1395y0) uniform.get(i28);
                                                            z02.alpha();
                                                            int i29 = i17;
                                                            Bundle e03 = au.e0(c1395y0.uniform());
                                                            Iterator it = c1395y0.uniform().iterator();
                                                            while (it.hasNext()) {
                                                                z02.orange(c1379u04.mike(), (C1391x0) ((C1395y0) it.next()).foxtrot(), e03, romeo3);
                                                                i27 = i27;
                                                                uniform = uniform;
                                                            }
                                                            bundleArr[i28] = e03;
                                                            i28++;
                                                            i17 = i29;
                                                            i27 = i27;
                                                            uniform = uniform;
                                                        }
                                                        i13 = i17;
                                                        i14 = i27;
                                                        e02.putParcelableArray(str15, bundleArr);
                                                    } else {
                                                        i13 = i17;
                                                        i14 = i27;
                                                        if (!lima.sierra().equals(str15)) {
                                                            z02.orange(c1379u04.mike(), (C1391x0) lima.foxtrot(), e02, ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo());
                                                        }
                                                    }
                                                    i27 = i14 + 1;
                                                    i17 = i13;
                                                    str14 = str15;
                                                }
                                                str6 = str14;
                                                i11 = i17;
                                                c1379u04.golf();
                                                C1383v0.xray((C1383v0) c1379u04.purple);
                                                au alpha2 = z02.alpha();
                                                ArrayList arrayList3 = new ArrayList();
                                                for (String str16 : e02.keySet()) {
                                                    C1391x0 romeo4 = C1395y0.romeo();
                                                    romeo4.india(str16);
                                                    Object obj = e02.get(str16);
                                                    if (obj != null) {
                                                        alpha2.I0(romeo4, obj);
                                                        arrayList3.add((C1395y0) romeo4.echo());
                                                    }
                                                }
                                                Iterator it2 = arrayList3.iterator();
                                                while (it2.hasNext()) {
                                                    c1379u04.kilo((C1395y0) it2.next());
                                                }
                                            } else {
                                                str6 = str14;
                                                i11 = i17;
                                            }
                                            i12 = i10;
                                            ((ArrayList) dVar.silver).set(i12, (C1383v0) c1379u04.echo());
                                            c03.lime(c1379u04);
                                            i20 = i4 + 1;
                                            i17 = i11;
                                        }
                                    } else {
                                        z12 = o02;
                                    }
                                    str5 = str10;
                                    i15 = 0;
                                    z13 = false;
                                    z14 = false;
                                    while (true) {
                                        str4 = str11;
                                        if (i15 >= ((C1383v0) c1379u04.purple).oscar()) {
                                            break;
                                        }
                                        if ("_c".equals(c1379u04.lima(i15).sierra())) {
                                            C1391x0 c1391x02 = (C1391x0) c1379u04.lima(i15).foxtrot();
                                            str7 = str13;
                                            c1391x02.hotel(1L);
                                            C1395y0 c1395y02 = (C1395y0) c1391x02.echo();
                                            c1379u04.golf();
                                            C1383v0.amber((C1383v0) c1379u04.purple, i15, c1395y02);
                                            z13 = true;
                                        } else {
                                            str7 = str13;
                                            if ("_r".equals(c1379u04.lima(i15).sierra())) {
                                                C1391x0 c1391x03 = (C1391x0) c1379u04.lima(i15).foxtrot();
                                                c1391x03.hotel(1L);
                                                C1395y0 c1395y03 = (C1395y0) c1391x03.echo();
                                                c1379u04.golf();
                                                C1383v0.amber((C1383v0) c1379u04.purple, i15, c1395y03);
                                                z14 = true;
                                                z13 = z13;
                                            }
                                        }
                                        i15++;
                                        str11 = str4;
                                        str13 = str7;
                                    }
                                    str3 = str13;
                                    if (!z13 && z12) {
                                        z02.crimson().c0().bravo(g2.kilo().delta(c1379u04.mike()), "Marking event as conversion");
                                        C1391x0 romeo5 = C1395y0.romeo();
                                        romeo5.india("_c");
                                        romeo5.hotel(1L);
                                        c1379u04.juliet(romeo5);
                                    }
                                    if (!z14) {
                                        z02.crimson().c0().bravo(g2.kilo().delta(c1379u04.mike()), "Marking event as real-time");
                                        C1391x0 romeo6 = C1395y0.romeo();
                                        romeo6.india("_r");
                                        romeo6.hotel(1L);
                                        c1379u04.juliet(romeo6);
                                    }
                                    if (z02.yellow().W0(z02.quebec(), ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), false, true, false, false).echo > z02.white().c0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.papa)) {
                                        sierra(c1379u04, "_r");
                                    } else {
                                        i5 = 1;
                                    }
                                    if (d1.R0(c1379u04.mike()) && z12 && z02.yellow().W0(z02.quebec(), ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), true, false, false, false).charlie > z02.white().c0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.oscar)) {
                                        z02.crimson().d0().bravo(ar.e0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()), "Too many conversions. Not logging as conversion. appId");
                                        int i30 = -1;
                                        c1391x0 = null;
                                        z15 = false;
                                        for (i16 = 0; i16 < ((C1383v0) c1379u04.purple).oscar(); i16++) {
                                            C1395y0 lima2 = c1379u04.lima(i16);
                                            if ("_c".equals(lima2.sierra())) {
                                                c1391x0 = (C1391x0) lima2.foxtrot();
                                                i30 = i16;
                                            } else if ("_err".equals(lima2.sierra())) {
                                                z15 = true;
                                            }
                                        }
                                        if (z15) {
                                            if (c1391x0 != null) {
                                                c1379u04.golf();
                                                C1383v0.yankee((C1383v0) c1379u04.purple, i30);
                                            } else {
                                                c1391x0 = null;
                                            }
                                        }
                                        if (c1391x0 == null) {
                                            C1391x0 c1391x04 = (C1391x0) c1391x0.clone();
                                            c1391x04.india("_err");
                                            c1391x04.hotel(10L);
                                            C1395y0 c1395y04 = (C1395y0) c1391x04.echo();
                                            c1379u04.golf();
                                            C1383v0.amber((C1383v0) c1379u04.purple, i30, c1395y04);
                                        } else {
                                            z02.crimson().b0().bravo(ar.e0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()), "Did not find conversion parameter. appId");
                                        }
                                    }
                                    if (z12) {
                                    }
                                    if (!"_e".equals(c1379u04.mike())) {
                                    }
                                    if (((C1383v0) c1379u04.purple).oscar() == 0) {
                                    }
                                    i12 = i10;
                                    ((ArrayList) dVar.silver).set(i12, (C1383v0) c1379u04.echo());
                                    c03.lime(c1379u04);
                                    i20 = i4 + 1;
                                    i17 = i11;
                                }
                            }
                            str8 = "returning_buyer";
                            romeo.juliet(str8);
                            c1379u04.kilo((C1395y0) romeo.echo());
                            z17 = true;
                            if (c1379u04.mike().equals(W.delta(str10, W.charlie, W.alpha))) {
                            }
                            o02 = z02.d().o0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u04.mike());
                            if (!o02) {
                            }
                            str5 = str10;
                            i15 = 0;
                            z13 = false;
                            z14 = false;
                            while (true) {
                                str4 = str11;
                                if (i15 >= ((C1383v0) c1379u04.purple).oscar()) {
                                }
                                i15++;
                                str11 = str4;
                                str13 = str7;
                            }
                            str3 = str13;
                            if (!z13) {
                                z02.crimson().c0().bravo(g2.kilo().delta(c1379u04.mike()), "Marking event as conversion");
                                C1391x0 romeo52 = C1395y0.romeo();
                                romeo52.india("_c");
                                romeo52.hotel(1L);
                                c1379u04.juliet(romeo52);
                            }
                            if (!z14) {
                            }
                            if (z02.yellow().W0(z02.quebec(), ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), false, true, false, false).echo > z02.white().c0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.papa)) {
                            }
                            if (d1.R0(c1379u04.mike())) {
                                z02.crimson().d0().bravo(ar.e0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()), "Too many conversions. Not logging as conversion. appId");
                                int i302 = -1;
                                c1391x0 = null;
                                z15 = false;
                                while (i16 < ((C1383v0) c1379u04.purple).oscar()) {
                                }
                                if (z15) {
                                }
                                if (c1391x0 == null) {
                                }
                            }
                            if (z12) {
                            }
                            if (!"_e".equals(c1379u04.mike())) {
                            }
                            if (((C1383v0) c1379u04.purple).oscar() == 0) {
                            }
                            i12 = i10;
                            ((ArrayList) dVar.silver).set(i12, (C1383v0) c1379u04.echo());
                            c03.lime(c1379u04);
                            i20 = i4 + 1;
                            i17 = i11;
                        }
                        i10 = i19;
                        if (c1379u04.mike().equals(W.delta(str10, W.charlie, W.alpha))) {
                        }
                        o02 = z02.d().o0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u04.mike());
                        if (!o02) {
                        }
                        str5 = str10;
                        i15 = 0;
                        z13 = false;
                        z14 = false;
                        while (true) {
                            str4 = str11;
                            if (i15 >= ((C1383v0) c1379u04.purple).oscar()) {
                            }
                            i15++;
                            str11 = str4;
                            str13 = str7;
                        }
                        str3 = str13;
                        if (!z13) {
                        }
                        if (!z14) {
                        }
                        if (z02.yellow().W0(z02.quebec(), ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), false, true, false, false).echo > z02.white().c0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.papa)) {
                        }
                        if (d1.R0(c1379u04.mike())) {
                        }
                        if (z12) {
                        }
                        if (!"_e".equals(c1379u04.mike())) {
                        }
                        if (((C1383v0) c1379u04.purple).oscar() == 0) {
                        }
                        i12 = i10;
                        ((ArrayList) dVar.silver).set(i12, (C1383v0) c1379u04.echo());
                        c03.lime(c1379u04);
                        i20 = i4 + 1;
                        i17 = i11;
                    }
                    z16 = z17;
                    i21 = i5;
                    int i31 = i12 + 1;
                    str12 = str6;
                    str10 = str5;
                    str11 = str4;
                    i19 = i31;
                    str9 = str2;
                }
                long j10 = 0;
                int i32 = i4;
                long j11 = 0;
                int i33 = 0;
                while (i33 < i32) {
                    C1383v0 b12 = ((com.google.android.gms.internal.measurement.D0) c02.purple).b1(i33);
                    if ("_e".equals(b12.tango())) {
                        z02.alpha();
                        if (au.f0(b12, "_fr") != null) {
                            c02.india(i33);
                            i32--;
                            i33--;
                            i33++;
                        }
                    }
                    z02.alpha();
                    C1395y0 f02 = au.f0(b12, "_et");
                    if (f02 != null) {
                        if (f02.crimson()) {
                            l10 = Long.valueOf(f02.quebec());
                        } else {
                            l10 = null;
                        }
                        if (l10 != null && l10.longValue() > 0) {
                            j11 += l10.longValue();
                        }
                    }
                    i33++;
                }
                z02.zulu(c02, j11, false);
                Iterator it3 = c02.yankee().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((C1383v0) it3.next()).tango())) {
                        z02.yellow().p0(c02.xray(), "_se");
                        break;
                    }
                }
                if (au.q0(c02, "_sid") >= 0) {
                    z02.zulu(c02, j11, true);
                } else {
                    int q02 = au.q0(c02, "_se");
                    if (q02 >= 0) {
                        c02.golf();
                        com.google.android.gms.internal.measurement.D0.y((com.google.android.gms.internal.measurement.D0) c02.purple, q02);
                        z02.crimson().b0().bravo(ar.e0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String romeo7 = ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo();
                z02.u().W();
                z02.foxtrot();
                ao T02 = z02.yellow().T0(romeo7);
                if (T02 == null) {
                    z02.crimson().b0().bravo(ar.e0(romeo7), "Cannot fix consent fields without appInfo. appId");
                } else {
                    z02.juliet(T02, c02);
                }
                String romeo8 = ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo();
                z02.u().W();
                z02.foxtrot();
                ao T03 = z02.yellow().T0(romeo8);
                if (T03 == null) {
                    z02.crimson().d0().bravo(ar.e0(romeo8), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    z02.fuchsia(T03, c02);
                }
                c02.golf();
                com.google.android.gms.internal.measurement.D0.q0((com.google.android.gms.internal.measurement.D0) c02.purple, Long.MAX_VALUE);
                c02.golf();
                com.google.android.gms.internal.measurement.D0.silver((com.google.android.gms.internal.measurement.D0) c02.purple, Long.MIN_VALUE);
                for (int i34 = 0; i34 < c02.ivory(); i34++) {
                    C1383v0 b13 = ((com.google.android.gms.internal.measurement.D0) c02.purple).b1(i34);
                    if (b13.quebec() < ((com.google.android.gms.internal.measurement.D0) c02.purple).V0()) {
                        long quebec = b13.quebec();
                        c02.golf();
                        com.google.android.gms.internal.measurement.D0.q0((com.google.android.gms.internal.measurement.D0) c02.purple, quebec);
                    }
                    if (b13.quebec() > ((com.google.android.gms.internal.measurement.D0) c02.purple).R0()) {
                        long quebec2 = b13.quebec();
                        c02.golf();
                        com.google.android.gms.internal.measurement.D0.silver((com.google.android.gms.internal.measurement.D0) c02.purple, quebec2);
                    }
                }
                c02.hotel();
                V v4 = V.charlie;
                V foxtrot = z02.e(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()).foxtrot(V.echo(100, ((com.google.android.gms.internal.measurement.D0) dVar.purple).whiskey()));
                V Z02 = z02.yellow().Z0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo());
                z02.yellow().t0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), foxtrot);
                U u4 = U.ANALYTICS_STORAGE;
                if (!foxtrot.kilo(u4) && Z02.kilo(u4)) {
                    z02.yellow().i0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo());
                } else if (foxtrot.kilo(u4) && !Z02.kilo(u4)) {
                    z02.yellow().q0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo());
                }
                U u10 = U.AD_STORAGE;
                if (!foxtrot.kilo(u10)) {
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.t((com.google.android.gms.internal.measurement.D0) c02.purple);
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.q((com.google.android.gms.internal.measurement.D0) c02.purple);
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.n((com.google.android.gms.internal.measurement.D0) c02.purple);
                }
                if (!foxtrot.kilo(u4)) {
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.k((com.google.android.gms.internal.measurement.D0) c02.purple);
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.u((com.google.android.gms.internal.measurement.D0) c02.purple);
                }
                C1317f3.bravo();
                if (z02.white().j0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.f7574O)) {
                    z02.bravo();
                    if (d1.E0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()) && z02.e(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()).kilo(u10) && ((com.google.android.gms.internal.measurement.D0) dVar.purple).x0()) {
                        z02.kilo(c02, dVar);
                    }
                }
                c02.golf();
                com.google.android.gms.internal.measurement.D0.l((com.google.android.gms.internal.measurement.D0) c02.purple);
                c02.jade(z02.teal().a0(c02.xray(), c02.yankee(), Collections.unmodifiableList(((com.google.android.gms.internal.measurement.D0) c02.purple).fuchsia()), Long.valueOf(((com.google.android.gms.internal.measurement.D0) c02.purple).V0()), Long.valueOf(((com.google.android.gms.internal.measurement.D0) c02.purple).R0()), !foxtrot.kilo(u4)));
                if (z02.white().Y(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom i03 = z02.bravo().i0();
                    int i35 = 0;
                    while (i35 < c02.ivory()) {
                        C1379u0 c1379u07 = (C1379u0) ((com.google.android.gms.internal.measurement.D0) c02.purple).b1(i35).foxtrot();
                        if (c1379u07.mike().equals("_ep")) {
                            z02.alpha();
                            String str17 = (String) au.g0((C1383v0) c1379u07.echo(), "_en");
                            C1460o c1460o = (C1460o) hashMap.get(str17);
                            if (c1460o == null) {
                                C1450j yellow2 = z02.yellow();
                                String romeo9 = ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo();
                                V5.x.hotel(str17);
                                c1460o = yellow2.y0("events", romeo9, str17);
                                if (c1460o != null) {
                                    hashMap.put(str17, c1460o);
                                }
                            }
                            if (c1460o != null && c1460o.india == null) {
                                Long l11 = c1460o.juliet;
                                if (l11 != null && l11.longValue() > 1) {
                                    z02.alpha();
                                    au.d0(c1379u07, "_sr", l11);
                                }
                                Boolean bool = c1460o.kilo;
                                if (bool != null && bool.booleanValue()) {
                                    z02.alpha();
                                    au.d0(c1379u07, "_efs", 1L);
                                }
                                arrayList4.add((C1383v0) c1379u07.echo());
                            }
                            c02.amber(i35, c1379u07);
                            j7 = j10;
                        } else {
                            A d4 = z02.d();
                            String romeo10 = ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo();
                            String d9 = d4.d(romeo10, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(d9)) {
                                try {
                                    j7 = j10;
                                    j10 = Long.parseLong(d9);
                                } catch (NumberFormatException e) {
                                    j7 = j10;
                                    ((G) d4.alpha).crimson().d0().charlie(ar.e0(romeo10), e, "Unable to parse timezone offset. appId");
                                    j10 = j7;
                                }
                            } else {
                                j7 = j10;
                            }
                            z02.bravo();
                            long j12 = j10 * 60000;
                            long india = (j12 + c1379u07.india()) / Constants.ONE_DAY_IN_MILLIS;
                            C1383v0 c1383v0 = (C1383v0) c1379u07.echo();
                            Long l12 = 1L;
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator it4 = c1383v0.uniform().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    C1395y0 c1395y05 = (C1395y0) it4.next();
                                    if ("_dbg".equals(c1395y05.sierra())) {
                                        if (l12.equals(Long.valueOf(c1395y05.quebec()))) {
                                            i02 = 1;
                                        }
                                    }
                                }
                            }
                            i02 = d().i0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u07.mike());
                            if (i02 <= 0) {
                                crimson().d0().charlie(c1379u07.mike(), Integer.valueOf(i02), "Sample rate must be positive. event, rate");
                                arrayList4.add((C1383v0) c1379u07.echo());
                                c02.amber(i35, c1379u07);
                            } else {
                                C1460o c1460o2 = (C1460o) hashMap.get(c1379u07.mike());
                                if (c1460o2 == null && (c1460o2 = yellow().y0("events", ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u07.mike())) == null) {
                                    crimson().d0().charlie(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u07.mike(), "Event being bundled has no eventAggregate. appId, eventName");
                                    c1460o2 = new C1460o(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c1379u07.mike(), 1L, 1L, 1L, c1379u07.india(), 0L, null, null, null, null);
                                }
                                alpha();
                                Long l13 = (Long) au.g0((C1383v0) c1379u07.echo(), "_eid");
                                if (l13 != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (i02 == 1) {
                                    arrayList4.add((C1383v0) c1379u07.echo());
                                    if (z11 && (c1460o2.india != null || c1460o2.juliet != null || c1460o2.kilo != null)) {
                                        hashMap.put(c1379u07.mike(), c1460o2.alpha(null, null, null));
                                    }
                                    c02.amber(i35, c1379u07);
                                } else {
                                    if (i03.nextInt(i02) == 0) {
                                        alpha();
                                        Long valueOf = Long.valueOf(i02);
                                        au.d0(c1379u07, "_sr", valueOf);
                                        arrayList4.add((C1383v0) c1379u07.echo());
                                        if (z11) {
                                            c1460o2 = c1460o2.alpha(null, valueOf, null);
                                        }
                                        hashMap.put(c1379u07.mike(), new C1460o(c1460o2.alpha, c1460o2.bravo, c1460o2.charlie, c1460o2.delta, c1460o2.echo, c1460o2.foxtrot, c1379u07.india(), Long.valueOf(india), c1460o2.india, c1460o2.juliet, c1460o2.kilo));
                                    } else {
                                        Long l14 = c1460o2.hotel;
                                        if (l14 != null) {
                                            hotel = l14.longValue();
                                        } else {
                                            bravo();
                                            hotel = (j12 + c1379u07.hotel()) / Constants.ONE_DAY_IN_MILLIS;
                                        }
                                        if (hotel != india) {
                                            alpha();
                                            au.d0(c1379u07, "_efs", 1L);
                                            alpha();
                                            Long valueOf2 = Long.valueOf(i02);
                                            au.d0(c1379u07, "_sr", valueOf2);
                                            arrayList4.add((C1383v0) c1379u07.echo());
                                            if (z11) {
                                                c1460o2 = c1460o2.alpha(null, valueOf2, Boolean.TRUE);
                                            }
                                            hashMap.put(c1379u07.mike(), new C1460o(c1460o2.alpha, c1460o2.bravo, c1460o2.charlie, c1460o2.delta, c1460o2.echo, c1460o2.foxtrot, c1379u07.india(), Long.valueOf(india), c1460o2.india, c1460o2.juliet, c1460o2.kilo));
                                        } else if (z11) {
                                            hashMap.put(c1379u07.mike(), c1460o2.alpha(l13, null, null));
                                        }
                                    }
                                    c02.amber(i35, c1379u07);
                                    i35++;
                                    z02 = this;
                                    j10 = j7;
                                }
                            }
                        }
                        i35++;
                        z02 = this;
                        j10 = j7;
                    }
                    j6 = j10;
                    z10 = true;
                    if (arrayList4.size() < c02.ivory()) {
                        c02.golf();
                        com.google.android.gms.internal.measurement.D0.o((com.google.android.gms.internal.measurement.D0) c02.purple);
                        c02.golf();
                        com.google.android.gms.internal.measurement.D0.f((com.google.android.gms.internal.measurement.D0) c02.purple, arrayList4);
                    }
                    Iterator it5 = hashMap.entrySet().iterator();
                    while (it5.hasNext()) {
                        yellow().D0("events", (C1460o) ((Map.Entry) it5.next()).getValue());
                    }
                } else {
                    j6 = 0;
                    z10 = true;
                }
                String romeo11 = ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo();
                ao T04 = yellow().T0(romeo11);
                if (T04 == null) {
                    crimson().b0().bravo(ar.e0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()), "Bundling raw events w/o app info. appId");
                } else if (c02.ivory() > 0) {
                    E e4 = T04.alpha.f7508c;
                    G.foxtrot(e4);
                    e4.W();
                    long j13 = T04.india;
                    if (j13 != j6) {
                        c02.cyan(j13);
                    } else {
                        c02.navy();
                    }
                    E e5 = T04.alpha.f7508c;
                    G.foxtrot(e5);
                    e5.W();
                    long j14 = T04.hotel;
                    if (j14 != j6) {
                        j13 = j14;
                    }
                    if (j13 != j6) {
                        c02.emerald(j13);
                    } else {
                        c02.ochre();
                    }
                    T04.juliet(c02.ivory());
                    E e10 = T04.alpha.f7508c;
                    G.foxtrot(e10);
                    e10.W();
                    int i36 = (int) T04.coral;
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.orange((com.google.android.gms.internal.measurement.D0) c02.purple, i36);
                    E e11 = T04.alpha.f7508c;
                    G.foxtrot(e11);
                    e11.W();
                    c02.romeo((int) T04.golf);
                    T04.green(((com.google.android.gms.internal.measurement.D0) c02.purple).V0());
                    T04.gold(((com.google.android.gms.internal.measurement.D0) c02.purple).R0());
                    String bravo = T04.bravo();
                    if (bravo != null) {
                        c02.bronze(bravo);
                    } else {
                        c02.maroon();
                    }
                    yellow().s0(T04, false);
                }
                if (c02.ivory() > 0) {
                    g2.getClass();
                    C1314f0 l02 = d().l0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo());
                    try {
                        try {
                            if (l02 != null && l02.crimson()) {
                                long papa = l02.papa();
                                c02.golf();
                                com.google.android.gms.internal.measurement.D0.maroon((com.google.android.gms.internal.measurement.D0) c02.purple, papa);
                                yellow = yellow();
                                g5 = (G) yellow.alpha;
                                d02 = (com.google.android.gms.internal.measurement.D0) c02.echo();
                                yellow.W();
                                yellow.X();
                                V5.x.echo(d02.romeo());
                                V5.x.kilo(d02.P());
                                yellow.o0();
                                alpha = g5.pink().alpha();
                                R02 = d02.R0();
                                abVar = ac.lavender;
                                if (R02 >= alpha - ((Long) abVar.alpha(null)).longValue() || d02.R0() > ((Long) abVar.alpha(null)).longValue() + alpha) {
                                    g5.crimson().d0().delta("Storing bundle outside of the max uploading time span. appId, now, timestamp", ar.e0(d02.romeo()), Long.valueOf(alpha), Long.valueOf(d02.R0()));
                                }
                                byte[] b02 = yellow.purple.alpha().b0(d02.charlie());
                                g5.crimson().c0().bravo(Integer.valueOf(b02.length), "Saving bundle, size");
                                contentValues = new ContentValues();
                                contentValues.put("app_id", d02.romeo());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(d02.R0()));
                                contentValues.put(Column.DATA, b02);
                                contentValues.put("has_realtime", Integer.valueOf(i5));
                                if (d02.W()) {
                                    contentValues.put("retry_count", Integer.valueOf(d02.K0()));
                                }
                                if (yellow.S0().insert("queue", null, contentValues) == -1) {
                                    g5.crimson().b0().bravo(ar.e0(d02.romeo()), "Failed to insert bundle (got -1). appId");
                                }
                            }
                            if (yellow.S0().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e12) {
                            g5.crimson().b0().charlie(ar.e0(d02.romeo()), e12, "Error storing bundle. appId");
                        }
                        byte[] b022 = yellow.purple.alpha().b0(d02.charlie());
                        g5.crimson().c0().bravo(Integer.valueOf(b022.length), "Saving bundle, size");
                        contentValues = new ContentValues();
                        contentValues.put("app_id", d02.romeo());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(d02.R0()));
                        contentValues.put(Column.DATA, b022);
                        contentValues.put("has_realtime", Integer.valueOf(i5));
                        if (d02.W()) {
                        }
                    } catch (IOException e13) {
                        g5.crimson().b0().charlie(ar.e0(d02.romeo()), e13, "Data loss. Failed to serialize bundle. appId");
                    }
                    if (((com.google.android.gms.internal.measurement.D0) dVar.purple).azure().isEmpty()) {
                        c02.golf();
                        com.google.android.gms.internal.measurement.D0.maroon((com.google.android.gms.internal.measurement.D0) c02.purple, -1L);
                    } else {
                        crimson().d0().bravo(ar.e0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo()), "Did not find measurement config or missing version info. appId");
                    }
                    yellow = yellow();
                    g5 = (G) yellow.alpha;
                    d02 = (com.google.android.gms.internal.measurement.D0) c02.echo();
                    yellow.W();
                    yellow.X();
                    V5.x.echo(d02.romeo());
                    V5.x.kilo(d02.P());
                    yellow.o0();
                    alpha = g5.pink().alpha();
                    R02 = d02.R0();
                    abVar = ac.lavender;
                    if (R02 >= alpha - ((Long) abVar.alpha(null)).longValue()) {
                    }
                    g5.crimson().d0().delta("Storing bundle outside of the max uploading time span. appId, now, timestamp", ar.e0(d02.romeo()), Long.valueOf(alpha), Long.valueOf(d02.R0()));
                }
                yellow().j0((ArrayList) dVar.red);
                C1450j yellow3 = yellow();
                try {
                    yellow3.S0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{romeo11, romeo11});
                } catch (SQLiteException e14) {
                    ((G) yellow3.alpha).crimson().b0().charlie(ar.e0(romeo11), e14, "Failed to remove unused event metadata. appId");
                }
                yellow().r0();
                z2 = z10;
            } else {
                yellow().r0();
                z2 = false;
            }
            yellow().l0();
            return z2;
        } catch (Throwable th) {
            yellow().l0();
            throw th;
        }
    }

    public final boolean black() {
        ao.ad.crimson(this);
        C1450j c1450j = this.red;
        cyan(c1450j);
        if (c1450j.N0("select count(1) > 0 from raw_events", null) == 0) {
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            if (!TextUtils.isEmpty(c1450j2.a0())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean blue(String str, String str2) {
        C1450j c1450j = this.red;
        cyan(c1450j);
        C1460o y02 = c1450j.y0("events", str, str2);
        if (y02 != null && y02.charlie >= 1) {
            return false;
        }
        return true;
    }

    public final d1 bravo() {
        G g2 = this.e;
        V5.x.hotel(g2);
        d1 d1Var = g2.e;
        G.delta(d1Var);
        return d1Var;
    }

    public final boolean bronze(C1379u0 c1379u0, C1379u0 c1379u02) {
        String tango;
        V5.x.bravo("_e".equals(c1379u0.mike()));
        alpha();
        C1395y0 f02 = au.f0((C1383v0) c1379u0.echo(), "_sc");
        String str = null;
        if (f02 == null) {
            tango = null;
        } else {
            tango = f02.tango();
        }
        alpha();
        C1395y0 f03 = au.f0((C1383v0) c1379u02.echo(), "_pc");
        if (f03 != null) {
            str = f03.tango();
        }
        if (str != null && str.equals(tango)) {
            V5.x.bravo("_e".equals(c1379u0.mike()));
            alpha();
            C1395y0 f04 = au.f0((C1383v0) c1379u0.echo(), "_et");
            if (f04 != null && f04.crimson() && f04.quebec() > 0) {
                long quebec = f04.quebec();
                alpha();
                C1395y0 f05 = au.f0((C1383v0) c1379u02.echo(), "_et");
                if (f05 != null && f05.quebec() > 0) {
                    quebec += f05.quebec();
                }
                alpha();
                au.d0(c1379u02, "_et", Long.valueOf(quebec));
                alpha();
                au.d0(c1379u0, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    public final av c() {
        av avVar = this.silver;
        if (avVar != null) {
            return avVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final String charlie(V v4) {
        if (v4.kilo(U.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            bravo().i0().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final ar crimson() {
        G g2 = this.e;
        V5.x.hotel(g2);
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        return arVar;
    }

    public final A d() {
        A a6 = this.alpha;
        cyan(a6);
        return a6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        if (r1.moveToFirst() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        r3 = r1.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        r0.add(new com.google.android.gms.measurement.internal.zzov(r1.getInt(2), r1.getLong(1), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (r1.moveToNext() != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List delta(Bundle bundle, zzr zzrVar) {
        ?? arrayList;
        Cursor cursor;
        u().W();
        C1317f3.bravo();
        C1440e white = white();
        String str = zzrVar.alpha;
        if (white.j0(str, ac.f7574O) && str != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i4 = 0; i4 < intArray.length; i4++) {
                            C1450j c1450j = this.red;
                            cyan(c1450j);
                            G g2 = (G) c1450j.alpha;
                            int i5 = intArray[i4];
                            long j5 = longArray[i4];
                            V5.x.echo(str);
                            c1450j.W();
                            c1450j.X();
                            try {
                                int delete = c1450j.S0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i5), String.valueOf(j5)});
                                ar arVar = g2.f7507b;
                                G.foxtrot(arVar);
                                arVar.f7636g.delta("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i5), Long.valueOf(j5));
                            } catch (SQLiteException e) {
                                ar arVar2 = g2.f7507b;
                                G.foxtrot(arVar2);
                                arVar2.white.charlie(ar.e0(str), e, "Error pruning trigger URIs. appId");
                            }
                        }
                    } else {
                        crimson().white.alpha("Uri sources and timestamps do not match");
                    }
                }
            }
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            String str2 = zzrVar.alpha;
            V5.x.echo(str2);
            c1450j2.W();
            c1450j2.X();
            arrayList = new ArrayList();
            cursor = null;
            try {
                try {
                    cursor = c1450j2.S0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                } catch (SQLiteException e4) {
                    ar arVar3 = ((G) c1450j2.alpha).f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.charlie(ar.e0(str2), e4, "Error querying trigger uris. appId");
                    arrayList = Collections.EMPTY_LIST;
                }
            } finally {
            }
        } else {
            return new ArrayList();
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    public final V e(String str) {
        V v4 = V.charlie;
        ao.ad.crimson(this);
        HashMap hashMap = this.f7557u;
        V v6 = (V) hashMap.get(str);
        if (v6 == null) {
            C1450j c1450j = this.red;
            cyan(c1450j);
            v6 = c1450j.a1(str);
            if (v6 == null) {
                v6 = V.charlie;
            }
            u().W();
            foxtrot();
            hashMap.put(str, v6);
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            c1450j2.u0(str, v6);
        }
        return v6;
    }

    public final void echo() {
        ao.ad.crimson(this);
        if (!this.f7543g) {
            this.f7543g = true;
            u().W();
            FileLock fileLock = this.f7552p;
            G g2 = this.e;
            if (fileLock != null && fileLock.isValid()) {
                crimson().f7636g.alpha("Storage concurrent access okay");
            } else {
                ((G) this.red.alpha).getClass();
                try {
                    FileChannel channel = new RandomAccessFile(new File(new File(g2.alpha.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                    this.f7553q = channel;
                    FileLock tryLock = channel.tryLock();
                    this.f7552p = tryLock;
                    if (tryLock != null) {
                        crimson().f7636g.alpha("Storage concurrent access okay");
                    } else {
                        crimson().white.alpha("Storage concurrent data access panic");
                        return;
                    }
                } catch (FileNotFoundException e) {
                    crimson().white.bravo(e, "Failed to acquire storage lock");
                    return;
                } catch (IOException e4) {
                    crimson().white.bravo(e4, "Failed to access storage lock file");
                    return;
                } catch (OverlappingFileLockException e5) {
                    crimson().f7632b.bravo(e5, "Storage lock already acquired");
                    return;
                }
            }
            FileChannel fileChannel = this.f7553q;
            u().W();
            int i4 = 0;
            if (fileChannel != null && fileChannel.isOpen()) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read != 4) {
                        if (read != -1) {
                            crimson().f7632b.bravo(Integer.valueOf(read), "Unexpected data length. Bytes read");
                        }
                    } else {
                        allocate.flip();
                        i4 = allocate.getInt();
                    }
                } catch (IOException e10) {
                    crimson().white.bravo(e10, "Failed to read from channel");
                }
            } else {
                crimson().white.alpha("Bad channel to read from");
            }
            aj india = g2.india();
            india.X();
            int i5 = india.teal;
            u().W();
            if (i4 > i5) {
                ar crimson = crimson();
                crimson.white.charlie(Integer.valueOf(i4), Integer.valueOf(i5), "Panic: can't downgrade version. Previous, current version");
                return;
            }
            if (i4 < i5) {
                FileChannel fileChannel2 = this.f7553q;
                u().W();
                if (fileChannel2 != null && fileChannel2.isOpen()) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(i5);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            crimson().white.bravo(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                        }
                        ar crimson2 = crimson();
                        crimson2.f7636g.charlie(Integer.valueOf(i4), Integer.valueOf(i5), "Storage version upgraded. Previous, current version");
                        return;
                    } catch (IOException e11) {
                        crimson().white.bravo(e11, "Failed to write to channel");
                    }
                } else {
                    crimson().white.alpha("Bad channel to read from");
                }
                ar crimson3 = crimson();
                crimson3.white.charlie(Integer.valueOf(i4), Integer.valueOf(i5), "Storage version upgrade failed. Previous, current version");
            }
        }
    }

    public final void foxtrot() {
        if (this.f7542f.get()) {
        } else {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void fuchsia(ao aoVar, com.google.android.gms.internal.measurement.C0 c02) {
        boolean z2;
        u().W();
        foxtrot();
        C1344l0 xray = C1348m0.xray();
        G g2 = aoVar.alpha;
        E e = g2.f7508c;
        G.foxtrot(e);
        e.W();
        byte[] bArr = aoVar.cyan;
        if (bArr != null) {
            try {
                xray = (C1344l0) au.C0(xray, bArr);
            } catch (zzmm unused) {
                crimson().f7632b.bravo(ar.e0(aoVar.charlie()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        for (C1383v0 c1383v0 : c02.yankee()) {
            if (c1383v0.tango().equals("_cmp")) {
                Serializable g02 = au.g0(c1383v0, "gclid");
                Object obj = "";
                if (g02 == null) {
                    g02 = "";
                }
                String str = (String) g02;
                Serializable g03 = au.g0(c1383v0, "gbraid");
                if (g03 == null) {
                    g03 = "";
                }
                String str2 = (String) g03;
                Object g04 = au.g0(c1383v0, "gad_source");
                if (g04 != null) {
                    obj = g04;
                }
                String str3 = (String) obj;
                if (!str.isEmpty() || !str2.isEmpty()) {
                    Object obj2 = 0L;
                    Object g05 = au.g0(c1383v0, "click_timestamp");
                    if (g05 != null) {
                        obj2 = g05;
                    }
                    long longValue = ((Long) obj2).longValue();
                    if (longValue <= 0) {
                        longValue = c1383v0.quebec();
                    }
                    if ("referrer API v2".equals(au.g0(c1383v0, "_cis"))) {
                        if (longValue > ((C1348m0) xray.purple).whiskey()) {
                            if (str.isEmpty()) {
                                xray.golf();
                                C1348m0.fuchsia((C1348m0) xray.purple);
                            } else {
                                xray.golf();
                                C1348m0.lime((C1348m0) xray.purple, str);
                            }
                            if (str2.isEmpty()) {
                                xray.golf();
                                C1348m0.emerald((C1348m0) xray.purple);
                            } else {
                                xray.golf();
                                C1348m0.lavender((C1348m0) xray.purple, str2);
                            }
                            if (str3.isEmpty()) {
                                xray.golf();
                                C1348m0.cyan((C1348m0) xray.purple);
                            } else {
                                xray.golf();
                                C1348m0.jade((C1348m0) xray.purple, str3);
                            }
                            xray.golf();
                            C1348m0.ivory((C1348m0) xray.purple, longValue);
                        }
                    } else if (longValue > ((C1348m0) xray.purple).victor()) {
                        if (str.isEmpty()) {
                            xray.golf();
                            C1348m0.crimson((C1348m0) xray.purple);
                        } else {
                            xray.golf();
                            C1348m0.green((C1348m0) xray.purple, str);
                        }
                        if (str2.isEmpty()) {
                            xray.golf();
                            C1348m0.coral((C1348m0) xray.purple);
                        } else {
                            xray.golf();
                            C1348m0.gray((C1348m0) xray.purple, str2);
                        }
                        if (str3.isEmpty()) {
                            xray.golf();
                            C1348m0.bronze((C1348m0) xray.purple);
                        } else {
                            xray.golf();
                            C1348m0.gold((C1348m0) xray.purple, str3);
                        }
                        xray.golf();
                        C1348m0.indigo((C1348m0) xray.purple, longValue);
                    }
                }
            }
        }
        if (!((C1348m0) xray.echo()).equals(C1348m0.yankee())) {
            C1348m0 c1348m0 = (C1348m0) xray.echo();
            c02.golf();
            com.google.android.gms.internal.measurement.D0.z((com.google.android.gms.internal.measurement.D0) c02.purple, c1348m0);
        }
        byte[] charlie = ((C1348m0) xray.echo()).charlie();
        E e4 = g2.f7508c;
        G.foxtrot(e4);
        e4.W();
        boolean z10 = aoVar.lavender;
        if (aoVar.cyan != charlie) {
            z2 = true;
        } else {
            z2 = false;
        }
        aoVar.lavender = z10 | z2;
        aoVar.cyan = charlie;
        if (aoVar.sierra()) {
            C1450j c1450j = this.red;
            cyan(c1450j);
            c1450j.s0(aoVar, false);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:74|75|(2:77|(8:79|(3:81|(2:83|(1:85))(1:105)|104)(1:106)|86|(1:88)(1:103)|89|90|91|(4:93|(1:95)(1:99)|96|(1:98))))|107|90|91|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0334, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0335, code lost:
    
        r2.crimson().white.charlie(com.google.android.gms.measurement.internal.ar.e0(r8), r0, "Application info is null, first open report might be inaccurate. appId");
        r12 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ce A[Catch: all -> 0x02b8, TryCatch #4 {all -> 0x02b8, blocks: (B:61:0x028b, B:63:0x02a3, B:68:0x0366, B:69:0x0369, B:70:0x03f0, B:75:0x02bb, B:77:0x02d8, B:79:0x02e0, B:81:0x02e6, B:85:0x02f9, B:86:0x030c, B:89:0x0318, B:91:0x032a, B:102:0x0335, B:93:0x0347, B:95:0x034f, B:96:0x0357, B:98:0x035d, B:105:0x0304, B:110:0x02c6, B:154:0x0380, B:156:0x03b5, B:157:0x03b8, B:158:0x03ce, B:160:0x03d6), top: B:45:0x013b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x012f A[Catch: all -> 0x00cb, TryCatch #5 {all -> 0x00cb, blocks: (B:25:0x00aa, B:27:0x00bb, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x0105, B:40:0x0112, B:41:0x011b, B:44:0x0122, B:47:0x013d, B:51:0x0155, B:124:0x0197, B:162:0x012f, B:163:0x0118, B:164:0x00fa, B:168:0x0102), top: B:24:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0118 A[Catch: all -> 0x00cb, TryCatch #5 {all -> 0x00cb, blocks: (B:25:0x00aa, B:27:0x00bb, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x0105, B:40:0x0112, B:41:0x011b, B:44:0x0122, B:47:0x013d, B:51:0x0155, B:124:0x0197, B:162:0x012f, B:163:0x0118, B:164:0x00fa, B:168:0x0102), top: B:24:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112 A[Catch: all -> 0x00cb, TryCatch #5 {all -> 0x00cb, blocks: (B:25:0x00aa, B:27:0x00bb, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x0105, B:40:0x0112, B:41:0x011b, B:44:0x0122, B:47:0x013d, B:51:0x0155, B:124:0x0197, B:162:0x012f, B:163:0x0118, B:164:0x00fa, B:168:0x0102), top: B:24:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122 A[Catch: all -> 0x00cb, TRY_ENTER, TryCatch #5 {all -> 0x00cb, blocks: (B:25:0x00aa, B:27:0x00bb, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x0105, B:40:0x0112, B:41:0x011b, B:44:0x0122, B:47:0x013d, B:51:0x0155, B:124:0x0197, B:162:0x012f, B:163:0x0118, B:164:0x00fa, B:168:0x0102), top: B:24:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #5 {all -> 0x00cb, blocks: (B:25:0x00aa, B:27:0x00bb, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x0105, B:40:0x0112, B:41:0x011b, B:44:0x0122, B:47:0x013d, B:51:0x0155, B:124:0x0197, B:162:0x012f, B:163:0x0118, B:164:0x00fa, B:168:0x0102), top: B:24:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0283 A[Catch: all -> 0x01d6, TryCatch #2 {all -> 0x01d6, blocks: (B:117:0x0177, B:119:0x0181, B:121:0x0187, B:56:0x0257, B:58:0x0283, B:59:0x0286, B:126:0x01a3, B:128:0x01ca, B:129:0x01db, B:131:0x01e2, B:133:0x01e8, B:135:0x01f2, B:137:0x01f8, B:139:0x01fe, B:141:0x0204, B:143:0x0209, B:146:0x0222, B:151:0x0226, B:152:0x0235, B:153:0x0240, B:55:0x024b), top: B:116:0x0177, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a3 A[Catch: all -> 0x02b8, TRY_LEAVE, TryCatch #4 {all -> 0x02b8, blocks: (B:61:0x028b, B:63:0x02a3, B:68:0x0366, B:69:0x0369, B:70:0x03f0, B:75:0x02bb, B:77:0x02d8, B:79:0x02e0, B:81:0x02e6, B:85:0x02f9, B:86:0x030c, B:89:0x0318, B:91:0x032a, B:102:0x0335, B:93:0x0347, B:95:0x034f, B:96:0x0357, B:98:0x035d, B:105:0x0304, B:110:0x02c6, B:154:0x0380, B:156:0x03b5, B:157:0x03b8, B:158:0x03ce, B:160:0x03d6), top: B:45:0x013b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0366 A[Catch: all -> 0x02b8, TryCatch #4 {all -> 0x02b8, blocks: (B:61:0x028b, B:63:0x02a3, B:68:0x0366, B:69:0x0369, B:70:0x03f0, B:75:0x02bb, B:77:0x02d8, B:79:0x02e0, B:81:0x02e6, B:85:0x02f9, B:86:0x030c, B:89:0x0318, B:91:0x032a, B:102:0x0335, B:93:0x0347, B:95:0x034f, B:96:0x0357, B:98:0x035d, B:105:0x0304, B:110:0x02c6, B:154:0x0380, B:156:0x03b5, B:157:0x03b8, B:158:0x03ce, B:160:0x03d6), top: B:45:0x013b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0347 A[Catch: all -> 0x02b8, TryCatch #4 {all -> 0x02b8, blocks: (B:61:0x028b, B:63:0x02a3, B:68:0x0366, B:69:0x0369, B:70:0x03f0, B:75:0x02bb, B:77:0x02d8, B:79:0x02e0, B:81:0x02e6, B:85:0x02f9, B:86:0x030c, B:89:0x0318, B:91:0x032a, B:102:0x0335, B:93:0x0347, B:95:0x034f, B:96:0x0357, B:98:0x035d, B:105:0x0304, B:110:0x02c6, B:154:0x0380, B:156:0x03b5, B:157:0x03b8, B:158:0x03ce, B:160:0x03d6), top: B:45:0x013b, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.measurement.internal.zzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.android.gms.measurement.internal.Z0] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.measurement.internal.Z0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gold(zzr zzrVar) {
        long j5;
        long j6;
        C1460o y02;
        boolean z2;
        boolean z10;
        String str;
        long Q02;
        PackageInfo packageInfo;
        zzr zzrVar2;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j7;
        boolean z11;
        long j10;
        long j11;
        Z0 z02 = zzrVar;
        u().W();
        foxtrot();
        V5.x.hotel(z02);
        String str2 = z02.alpha;
        V5.x.echo(str2);
        if (!coral(z02)) {
            return;
        }
        C1450j c1450j = this.red;
        cyan(c1450j);
        ao T02 = c1450j.T0(str2);
        if (T02 != null && TextUtils.isEmpty(T02.golf()) && !TextUtils.isEmpty(z02.purple)) {
            T02.uniform(0L);
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            c1450j2.s0(T02, false);
            A a6 = this.alpha;
            cyan(a6);
            a6.W();
            a6.f7496a.remove(str2);
        }
        if (!z02.f7697a) {
            silver(zzrVar);
            return;
        }
        long j12 = z02.e;
        if (j12 == 0) {
            pink().getClass();
            j12 = System.currentTimeMillis();
        }
        long j13 = j12;
        G g2 = this.e;
        C1456m hotel = g2.hotel();
        Context context = g2.alpha;
        hotel.W();
        int i4 = z02.f7701f;
        if (i4 != 0 && i4 != 1) {
            crimson().f7632b.charlie(ar.e0(str2), Integer.valueOf(i4), "Incorrect app type, assuming installed app. appId, appType");
            i4 = 0;
        }
        C1450j c1450j3 = this.red;
        cyan(c1450j3);
        c1450j3.h0();
        try {
            C1450j c1450j4 = this.red;
            cyan(c1450j4);
            c1 c12 = c1450j4.c1(str2, "_npa");
            Boolean emerald = emerald(z02);
            int i5 = i4;
            try {
                if (c12 != null) {
                    j5 = 1;
                    if (!"auto".equals(c12.bravo)) {
                        j6 = j13;
                        if (!white().j0(null, ac.f7593e0)) {
                            india(z02, z02.f7720y);
                        } else {
                            india(z02, j6);
                        }
                        silver(zzrVar);
                        if (i5 != 0) {
                            C1450j c1450j5 = this.red;
                            cyan(c1450j5);
                            y02 = c1450j5.y0("events", str2, "_f");
                            z2 = false;
                        } else {
                            C1450j c1450j6 = this.red;
                            cyan(c1450j6);
                            y02 = c1450j6.y0("events", str2, "_v");
                            z2 = true;
                        }
                        if (y02 != null) {
                            long j14 = ((j6 / 3600000) + j5) * 3600000;
                            boolean z12 = z02.f7703h;
                            if (!z2) {
                                long j15 = j6;
                                maroon(new zzqb(j15, Long.valueOf(j14), "_fot", "auto"), z02);
                                u().W();
                                ay ayVar = this.f7541d;
                                V5.x.hotel(ayVar);
                                G g5 = ayVar.bravo;
                                if (str2 != null) {
                                    try {
                                        if (!str2.isEmpty()) {
                                            E e = g5.f7508c;
                                            z10 = z12;
                                            Context context2 = g5.alpha;
                                            G.foxtrot(e);
                                            e.W();
                                            boolean alpha = ayVar.alpha();
                                            ar arVar = g5.f7507b;
                                            if (!alpha) {
                                                G.foxtrot(arVar);
                                                arVar.e.alpha("Install Referrer Reporter is not available");
                                            } else {
                                                ServiceConnectionC0716b serviceConnectionC0716b = new ServiceConnectionC0716b(1, ayVar, str2);
                                                E e4 = g5.f7508c;
                                                G.foxtrot(e4);
                                                e4.W();
                                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                                PackageManager packageManager = context2.getPackageManager();
                                                if (packageManager == null) {
                                                    G.foxtrot(arVar);
                                                    arVar.f7633c.alpha("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                                } else {
                                                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                        if (serviceInfo != null) {
                                                            String str3 = serviceInfo.packageName;
                                                            if (serviceInfo.name != null && "com.android.vending".equals(str3) && ayVar.alpha()) {
                                                                try {
                                                                    boolean alpha2 = C1590a.bravo().alpha(context2, new Intent(intent), serviceConnectionC0716b, 1);
                                                                    G.foxtrot(arVar);
                                                                    a4.j jVar = arVar.f7636g;
                                                                    if (alpha2) {
                                                                        str = "available";
                                                                    } else {
                                                                        str = "not available";
                                                                    }
                                                                    jVar.bravo(str, "Install Referrer Service is");
                                                                } catch (RuntimeException e5) {
                                                                    G.foxtrot(arVar);
                                                                    arVar.white.bravo(e5.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                                }
                                                            } else {
                                                                G.foxtrot(arVar);
                                                                arVar.f7632b.alpha("Play Store version 8.3.73 or higher required for Install Referrer");
                                                            }
                                                        }
                                                    } else {
                                                        G.foxtrot(arVar);
                                                        arVar.e.alpha("Play Service for fetching Install Referrer is unavailable on device");
                                                    }
                                                }
                                            }
                                            u().W();
                                            foxtrot();
                                            Bundle bundle = new Bundle();
                                            long j16 = j5;
                                            bundle.putLong("_c", j16);
                                            bundle.putLong("_r", j16);
                                            bundle.putLong("_uwa", 0L);
                                            bundle.putLong("_pfo", 0L);
                                            bundle.putLong("_sys", 0L);
                                            bundle.putLong("_sysu", 0L);
                                            bundle.putLong("_et", 1L);
                                            if (z10) {
                                                bundle.putLong("_dac", 1L);
                                            }
                                            V5.x.hotel(str2);
                                            z02 = this;
                                            C1450j c1450j7 = z02.red;
                                            cyan(c1450j7);
                                            V5.x.echo(str2);
                                            c1450j7.W();
                                            c1450j7.X();
                                            Q02 = c1450j7.Q0(str2);
                                            if (context.getPackageManager() != null) {
                                                z02.crimson().white.bravo(ar.e0(str2), "PackageManager is null, first open report might be inaccurate. appId");
                                                zzrVar2 = zzrVar;
                                            } else {
                                                try {
                                                    packageInfo = C1754b.alpha(context).charlie(0, str2);
                                                } catch (PackageManager.NameNotFoundException e10) {
                                                    z02.crimson().white.charlie(ar.e0(str2), e10, "Package info is null, first open report might be inaccurate. appId");
                                                    packageInfo = null;
                                                }
                                                if (packageInfo != null) {
                                                    long j17 = packageInfo.firstInstallTime;
                                                    if (j17 != 0) {
                                                        if (j17 != packageInfo.lastUpdateTime) {
                                                            applicationInfo = null;
                                                            if (z02.white().j0(null, ac.A)) {
                                                                if (Q02 == 0) {
                                                                    bundle.putLong("_uwa", 1L);
                                                                    z11 = false;
                                                                    Q02 = 0;
                                                                }
                                                            } else {
                                                                bundle.putLong("_uwa", 1L);
                                                            }
                                                            z11 = false;
                                                        } else {
                                                            applicationInfo = null;
                                                            z11 = true;
                                                        }
                                                        if (true != z11) {
                                                            j10 = 0;
                                                        } else {
                                                            j10 = 1;
                                                        }
                                                        zzrVar2 = zzrVar;
                                                        z02.maroon(new zzqb(j15, Long.valueOf(j10), "_fi", "auto"), zzrVar2);
                                                        applicationInfo2 = C1754b.alpha(context).bravo(0, str2);
                                                        if (applicationInfo2 != null) {
                                                            if ((applicationInfo2.flags & 1) != 0) {
                                                                j7 = 1;
                                                                bundle.putLong("_sys", 1L);
                                                            } else {
                                                                j7 = 1;
                                                            }
                                                            if ((applicationInfo2.flags & 128) != 0) {
                                                                bundle.putLong("_sysu", j7);
                                                            }
                                                        }
                                                    }
                                                }
                                                zzrVar2 = zzrVar;
                                                applicationInfo = null;
                                                applicationInfo2 = C1754b.alpha(context).bravo(0, str2);
                                                if (applicationInfo2 != null) {
                                                }
                                            }
                                            if (Q02 >= 0) {
                                                bundle.putLong("_pfo", Q02);
                                            }
                                            z02.november(new zzbh("_f", new zzbf(bundle), "auto", j15), zzrVar2);
                                            z02 = z02;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        z02 = this;
                                        C1450j c1450j8 = z02.red;
                                        cyan(c1450j8);
                                        c1450j8.l0();
                                        throw th;
                                    }
                                }
                                z10 = z12;
                                ar arVar2 = g5.f7507b;
                                G.foxtrot(arVar2);
                                arVar2.f7633c.alpha("Install Referrer Reporter was called with invalid app package name");
                                u().W();
                                foxtrot();
                                Bundle bundle2 = new Bundle();
                                long j162 = j5;
                                bundle2.putLong("_c", j162);
                                bundle2.putLong("_r", j162);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", 1L);
                                if (z10) {
                                }
                                V5.x.hotel(str2);
                                z02 = this;
                                C1450j c1450j72 = z02.red;
                                cyan(c1450j72);
                                V5.x.echo(str2);
                                c1450j72.W();
                                c1450j72.X();
                                Q02 = c1450j72.Q0(str2);
                                if (context.getPackageManager() != null) {
                                }
                                if (Q02 >= 0) {
                                }
                                z02.november(new zzbh("_f", new zzbf(bundle2), "auto", j15), zzrVar2);
                                z02 = z02;
                            } else {
                                Z0 z03 = this;
                                long j18 = j6;
                                z03.maroon(new zzqb(j18, Long.valueOf(j14), "_fvt", "auto"), z02);
                                z03.u().W();
                                z03.foxtrot();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("_c", 1L);
                                bundle3.putLong("_r", 1L);
                                bundle3.putLong("_et", 1L);
                                if (z12) {
                                    bundle3.putLong("_dac", 1L);
                                }
                                z03.november(new zzbh("_v", new zzbf(bundle3), "auto", j18), z02);
                                z02 = z03;
                            }
                        } else {
                            long j19 = j6;
                            Z0 z04 = this;
                            boolean z13 = z02.f7698b;
                            z02 = z04;
                            if (z13) {
                                z04.november(new zzbh("_cd", new zzbf(new Bundle()), "auto", j19), z02);
                                z02 = z04;
                            }
                        }
                        C1450j c1450j9 = z02.red;
                        cyan(c1450j9);
                        c1450j9.r0();
                        C1450j c1450j10 = z02.red;
                        cyan(c1450j10);
                        c1450j10.l0();
                        return;
                    }
                } else {
                    j5 = 1;
                }
                if (y02 != null) {
                }
                C1450j c1450j92 = z02.red;
                cyan(c1450j92);
                c1450j92.r0();
                C1450j c1450j102 = z02.red;
                cyan(c1450j102);
                c1450j102.l0();
                return;
            } catch (Throwable th2) {
                th = th2;
                C1450j c1450j82 = z02.red;
                cyan(c1450j82);
                c1450j82.l0();
                throw th;
            }
            if (emerald != null) {
                if (true != emerald.booleanValue()) {
                    j11 = 0;
                } else {
                    j11 = j5;
                }
                zzqb zzqbVar = new zzqb(j13, Long.valueOf(j11), "_npa", "auto");
                j6 = j13;
                if (c12 == null || !c12.echo.equals(zzqbVar.silver)) {
                    maroon(zzqbVar, z02);
                }
            } else {
                j6 = j13;
                if (c12 != null) {
                    indigo("_npa", z02);
                }
            }
            if (!white().j0(null, ac.f7593e0)) {
            }
            silver(zzrVar);
            if (i5 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
            z02 = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011f, code lost:
    
        if (r4 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void golf(com.google.android.gms.internal.measurement.C0 c02, String str) {
        int q02;
        int indexOf;
        A a6 = this.alpha;
        cyan(a6);
        a6.W();
        a6.e0(str);
        bv.e eVar = a6.teal;
        Set set = (Set) eVar.get(str);
        if (set != null) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.h((com.google.android.gms.internal.measurement.D0) c02.purple, set);
        }
        cyan(a6);
        a6.W();
        a6.e0(str);
        if (eVar.get(str) != null && (((Set) eVar.get(str)).contains("device_model") || ((Set) eVar.get(str)).contains("device_info"))) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.m((com.google.android.gms.internal.measurement.D0) c02.purple);
        }
        cyan(a6);
        if (a6.b0(str)) {
            String black = ((com.google.android.gms.internal.measurement.D0) c02.purple).black();
            if (!TextUtils.isEmpty(black) && (indexOf = black.indexOf(".")) != -1) {
                String substring = black.substring(0, indexOf);
                c02.golf();
                com.google.android.gms.internal.measurement.D0.g0((com.google.android.gms.internal.measurement.D0) c02.purple, substring);
            }
        }
        cyan(a6);
        a6.W();
        a6.e0(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("user_id") && (q02 = au.q0(c02, Column.ID)) != -1) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.y((com.google.android.gms.internal.measurement.D0) c02.purple, q02);
        }
        cyan(a6);
        a6.W();
        a6.e0(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("google_signals")) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.n((com.google.android.gms.internal.measurement.D0) c02.purple);
        }
        cyan(a6);
        if (a6.a0(str)) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.k((com.google.android.gms.internal.measurement.D0) c02.purple);
            if (e(str).kilo(U.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.f7559w;
                X0 x02 = (X0) hashMap.get(str);
                if (x02 != null) {
                    long e02 = white().e0(str, ac.f7589c) + x02.bravo;
                    pink().getClass();
                }
                x02 = new X0(this, bravo().f0());
                hashMap.put(str, x02);
                c02.golf();
                com.google.android.gms.internal.measurement.D0.teal((com.google.android.gms.internal.measurement.D0) c02.purple, x02.alpha);
            }
        }
        cyan(a6);
        a6.W();
        a6.e0(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("enhanced_user_id")) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.u((com.google.android.gms.internal.measurement.D0) c02.purple);
        }
    }

    public final void gray(zzai zzaiVar, zzr zzrVar) {
        Bundle bundle;
        V5.x.echo(zzaiVar.alpha);
        V5.x.hotel(zzaiVar.red);
        V5.x.echo(zzaiVar.red.purple);
        u().W();
        foxtrot();
        if (!coral(zzrVar)) {
            return;
        }
        if (!zzrVar.f7697a) {
            silver(zzrVar);
            return;
        }
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1450j.h0();
        try {
            silver(zzrVar);
            String str = zzaiVar.alpha;
            V5.x.hotel(str);
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            zzai U02 = c1450j2.U0(str, zzaiVar.red.purple);
            G g2 = this.e;
            if (U02 != null) {
                crimson().f7635f.charlie(zzaiVar.alpha, g2.f7510f.foxtrot(zzaiVar.red.purple), "Removing conditional user property");
                C1450j c1450j3 = this.red;
                cyan(c1450j3);
                c1450j3.x0(str, zzaiVar.red.purple);
                if (U02.teal) {
                    C1450j c1450j4 = this.red;
                    cyan(c1450j4);
                    c1450j4.p0(str, zzaiVar.red.purple);
                }
                zzbh zzbhVar = zzaiVar.f7696d;
                if (zzbhVar != null) {
                    zzbf zzbfVar = zzbhVar.purple;
                    if (zzbfVar != null) {
                        bundle = zzbfVar.o();
                    } else {
                        bundle = null;
                    }
                    zzbh c02 = bravo().c0(zzbhVar.alpha, bundle, U02.purple, zzbhVar.silver, true);
                    V5.x.hotel(c02);
                    peach(c02, zzrVar);
                }
            } else {
                crimson().f7632b.charlie(ar.e0(zzaiVar.alpha), g2.f7510f.foxtrot(zzaiVar.red.purple), "Conditional user property doesn't exist");
            }
            C1450j c1450j5 = this.red;
            cyan(c1450j5);
            c1450j5.r0();
            C1450j c1450j6 = this.red;
            cyan(c1450j6);
            c1450j6.l0();
        } catch (Throwable th) {
            C1450j c1450j7 = this.red;
            cyan(c1450j7);
            c1450j7.l0();
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final Context green() {
        return this.e.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [bv.aw] */
    /* JADX WARN: Type inference failed for: r3v12, types: [bv.aw] */
    public final void hotel(ao aoVar) {
        Map map;
        Map map2;
        u().W();
        if (TextUtils.isEmpty(aoVar.golf()) && TextUtils.isEmpty(aoVar.alpha())) {
            String charlie = aoVar.charlie();
            V5.x.hotel(charlie);
            oscar(charlie, 204, null, null, null);
            return;
        }
        String charlie2 = aoVar.charlie();
        V5.x.hotel(charlie2);
        crimson().f7636g.bravo(charlie2, "Fetching remote configuration");
        A a6 = this.alpha;
        cyan(a6);
        C1314f0 l02 = a6.l0(charlie2);
        cyan(a6);
        a6.W();
        String str = (String) a6.f7500f.get(charlie2);
        if (l02 != null) {
            if (!TextUtils.isEmpty(str)) {
                ?? awVar = new bv.aw(0);
                awVar.put("If-Modified-Since", str);
                map2 = awVar;
            } else {
                map2 = null;
            }
            cyan(a6);
            a6.W();
            String str2 = (String) a6.f7501g.get(charlie2);
            Map map3 = map2;
            Map map4 = map2;
            if (!TextUtils.isEmpty(str2)) {
                if (map2 == null) {
                    map3 = new bv.aw(0);
                }
                map3.put("If-None-Match", str2);
                map4 = map3;
            }
            map = map4;
        } else {
            map = null;
        }
        this.f7549m = true;
        au auVar = this.purple;
        cyan(auVar);
        av.ah ahVar = new av.ah(21, this);
        G g2 = (G) auVar.alpha;
        auVar.W();
        auVar.X();
        W0 w02 = auVar.purple.f7540c;
        Uri.Builder builder = new Uri.Builder();
        String golf = aoVar.golf();
        if (TextUtils.isEmpty(golf)) {
            golf = aoVar.alpha();
        }
        Uri.Builder appendQueryParameter = builder.scheme((String) ac.foxtrot.alpha(null)).encodedAuthority((String) ac.golf.alpha(null)).path("config/app/".concat(String.valueOf(golf))).appendQueryParameter("platform", "android");
        ((G) w02.alpha).yellow.d0();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(119002L)).appendQueryParameter("runtime_version", ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO);
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            E e = g2.f7508c;
            G.foxtrot(e);
            e.f0(new at(auVar, aoVar.charlie(), url, (byte[]) null, map, ahVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.charlie(ar.e0(aoVar.charlie()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }

    public final void india(zzr zzrVar, long j5) {
        boolean z2;
        C1450j c1450j = this.red;
        cyan(c1450j);
        String str = zzrVar.alpha;
        V5.x.hotel(str);
        ao T02 = c1450j.T0(str);
        if (T02 != null) {
            if (bravo().V0(zzrVar.purple, T02.golf(), zzrVar.f7704i, T02.alpha())) {
                crimson().f7632b.bravo(ar.e0(T02.charlie()), "New GMP App Id passed in. Removing cached database data. appId");
                C1450j c1450j2 = this.red;
                cyan(c1450j2);
                G g2 = (G) c1450j2.alpha;
                String charlie = T02.charlie();
                c1450j2.X();
                c1450j2.W();
                V5.x.echo(charlie);
                try {
                    SQLiteDatabase S02 = c1450j2.S0();
                    String[] strArr = {charlie};
                    int delete = S02.delete("events", "app_id=?", strArr) + S02.delete("user_attributes", "app_id=?", strArr) + S02.delete("conditional_properties", "app_id=?", strArr) + S02.delete("apps", "app_id=?", strArr) + S02.delete("raw_events", "app_id=?", strArr) + S02.delete("raw_events_metadata", "app_id=?", strArr) + S02.delete("event_filters", "app_id=?", strArr) + S02.delete("property_filters", "app_id=?", strArr) + S02.delete("audience_filter_values", "app_id=?", strArr) + S02.delete("consent_settings", "app_id=?", strArr) + S02.delete("default_event_params", "app_id=?", strArr) + S02.delete("trigger_uris", "app_id=?", strArr);
                    if (delete > 0) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.f7636g.charlie(charlie, Integer.valueOf(delete), "Deleted application data. app, records");
                    }
                } catch (SQLiteException e) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(ar.e0(charlie), e, "Error deleting application data. appId, error");
                }
                T02 = null;
            }
        }
        if (T02 != null) {
            boolean z10 = true;
            if (T02.lime() != -2147483648L && T02.lime() != zzrVar.f7699c) {
                z2 = true;
            } else {
                z2 = false;
            }
            String echo = T02.echo();
            if (T02.lime() != -2147483648L || echo == null || echo.equals(zzrVar.red)) {
                z10 = false;
            }
            if (z2 | z10) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", echo);
                zzbh zzbhVar = new zzbh("_au", new zzbf(bundle), "auto", j5);
                if (white().j0(null, ac.f7595f0)) {
                    november(zzbhVar, zzrVar);
                } else {
                    lima(zzbhVar, zzrVar);
                }
            }
        }
    }

    public final void indigo(String str, zzr zzrVar) {
        long j5;
        u().W();
        foxtrot();
        if (!coral(zzrVar)) {
            return;
        }
        if (!zzrVar.f7697a) {
            silver(zzrVar);
            return;
        }
        Boolean emerald = emerald(zzrVar);
        if ("_npa".equals(str) && emerald != null) {
            crimson().f7635f.alpha("Falling back to manifest metadata value for ad personalization");
            pink().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (true != emerald.booleanValue()) {
                j5 = 0;
            } else {
                j5 = 1;
            }
            maroon(new zzqb(currentTimeMillis, Long.valueOf(j5), "_npa", "auto"), zzrVar);
            return;
        }
        ar crimson = crimson();
        G g2 = this.e;
        crimson.f7635f.bravo(g2.f7510f.foxtrot(str), "Removing user property");
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1450j.h0();
        try {
            silver(zzrVar);
            boolean equals = Column.ID.equals(str);
            String str2 = zzrVar.alpha;
            if (equals) {
                C1450j c1450j2 = this.red;
                cyan(c1450j2);
                V5.x.hotel(str2);
                c1450j2.p0(str2, "_lair");
            }
            C1450j c1450j3 = this.red;
            cyan(c1450j3);
            V5.x.hotel(str2);
            c1450j3.p0(str2, str);
            C1450j c1450j4 = this.red;
            cyan(c1450j4);
            c1450j4.r0();
            crimson().f7635f.bravo(g2.f7510f.foxtrot(str), "User property removed");
            C1450j c1450j5 = this.red;
            cyan(c1450j5);
            c1450j5.l0();
        } catch (Throwable th) {
            C1450j c1450j6 = this.red;
            cyan(c1450j6);
            c1450j6.l0();
            throw th;
        }
    }

    public final void ivory(zzr zzrVar) {
        boolean z2;
        ao.ad.crimson(this);
        String str = zzrVar.alpha;
        V5.x.echo(str);
        C1454l bravo = C1454l.bravo(zzrVar.f7715t);
        crimson().f7636g.charlie(str, bravo, "Setting DMA consent for package");
        u().W();
        foxtrot();
        S charlie = C1454l.alpha(100, purple(str)).charlie();
        this.f7558v.put(str, bravo);
        C1450j c1450j = this.red;
        cyan(c1450j);
        V5.x.hotel(str);
        V5.x.hotel(bravo);
        c1450j.W();
        c1450j.X();
        V a12 = c1450j.a1(str);
        V v4 = V.charlie;
        if (a12 == v4) {
            c1450j.u0(str, v4);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", bravo.bravo);
        c1450j.E0(contentValues);
        S charlie2 = C1454l.alpha(100, purple(str)).charlie();
        ao.ad.crimson(this);
        S s3 = S.DENIED;
        S s9 = S.GRANTED;
        boolean z10 = true;
        if (charlie == s3 && charlie2 == s9) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (charlie != s9 || charlie2 != s3) {
            z10 = false;
        }
        if (!z2 && !z10) {
            return;
        }
        crimson().f7636g.bravo(str, "Generated _dcu event for");
        Bundle bundle = new Bundle();
        C1450j c1450j2 = this.red;
        cyan(c1450j2);
        if (c1450j2.W0(quebec(), str, false, false, false, false).foxtrot < white().c0(str, ac.e)) {
            bundle.putLong("_r", 1L);
            C1450j c1450j3 = this.red;
            cyan(c1450j3);
            C1444g W02 = c1450j3.W0(quebec(), str, false, false, true, false);
            crimson().f7636g.charlie(str, Long.valueOf(W02.foxtrot), "_dcu realtime event count");
        }
        this.C.bronze(str, "_dcu", bundle);
    }

    public final void jade(zzr zzrVar) {
        ao.ad.crimson(this);
        String str = zzrVar.alpha;
        V5.x.echo(str);
        V echo = V.echo(zzrVar.f7714s, zzrVar.f7709n);
        e(str);
        crimson().f7636g.charlie(str, echo, "Setting storage consent for package");
        u().W();
        foxtrot();
        this.f7557u.put(str, echo);
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1450j.u0(str, echo);
    }

    public final void juliet(ao aoVar, com.google.android.gms.internal.measurement.C0 c02) {
        av.ah ahVar;
        com.google.android.gms.internal.measurement.M0 m02;
        boolean z2;
        EnumC1442f enumC1442f;
        ao.ad.crimson(this);
        String victor = ((com.google.android.gms.internal.measurement.D0) c02.purple).victor();
        EnumMap enumMap = new EnumMap(U.class);
        int length = victor.length();
        int length2 = U.values().length;
        EnumC1442f enumC1442f2 = EnumC1442f.UNSET;
        int i4 = 0;
        if (length >= length2 && victor.charAt(0) == '1') {
            U[] values = U.values();
            int length3 = values.length;
            int i5 = 0;
            int i10 = 1;
            while (i5 < length3) {
                U u4 = values[i5];
                int i11 = i10 + 1;
                char charAt = victor.charAt(i10);
                EnumC1442f[] values2 = EnumC1442f.values();
                int length4 = values2.length;
                int i12 = i4;
                while (true) {
                    if (i12 < length4) {
                        enumC1442f = values2[i12];
                        if (enumC1442f.alpha == charAt) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        enumC1442f = enumC1442f2;
                        break;
                    }
                }
                enumMap.put((EnumMap) u4, (U) enumC1442f);
                i5++;
                i10 = i11;
                i4 = 0;
            }
            ahVar = new av.ah(enumMap);
        } else {
            ahVar = new av.ah(18);
        }
        String charlie = aoVar.charlie();
        u().W();
        foxtrot();
        V e = e(charlie);
        U u10 = U.AD_STORAGE;
        EnumMap enumMap2 = e.alpha;
        S s3 = (S) enumMap2.get(u10);
        S s9 = S.UNINITIALIZED;
        if (s3 == null) {
            s3 = s9;
        }
        int ordinal = s3.ordinal();
        EnumC1442f enumC1442f3 = EnumC1442f.REMOTE_ENFORCED_DEFAULT;
        EnumC1442f enumC1442f4 = EnumC1442f.FAILSAFE;
        int i13 = e.bravo;
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                ahVar.white(u10, enumC1442f4);
            } else {
                ahVar.teal(u10, i13);
            }
        } else {
            ahVar.white(u10, enumC1442f3);
        }
        U u11 = U.ANALYTICS_STORAGE;
        S s10 = (S) enumMap2.get(u11);
        if (s10 != null) {
            s9 = s10;
        }
        int ordinal2 = s9.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2 && ordinal2 != 3) {
                ahVar.white(u11, enumC1442f4);
            } else {
                ahVar.teal(u11, i13);
            }
        } else {
            ahVar.white(u11, enumC1442f3);
        }
        String charlie2 = aoVar.charlie();
        u().W();
        foxtrot();
        C1454l a6 = a(charlie2, b(charlie2), e(charlie2), ahVar);
        Boolean bool = a6.charlie;
        V5.x.hotel(bool);
        boolean booleanValue = bool.booleanValue();
        c02.golf();
        com.google.android.gms.internal.measurement.D0.e((com.google.android.gms.internal.measurement.D0) c02.purple, booleanValue);
        String str = a6.delta;
        if (!TextUtils.isEmpty(str)) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.olive((com.google.android.gms.internal.measurement.D0) c02.purple, str);
        }
        ao.ad.crimson(this);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.D0) c02.purple).fuchsia()).iterator();
        while (true) {
            if (it.hasNext()) {
                m02 = (com.google.android.gms.internal.measurement.M0) it.next();
                if ("_npa".equals(m02.sierra())) {
                    break;
                }
            } else {
                m02 = null;
                break;
            }
        }
        if (m02 != null) {
            U u12 = U.AD_PERSONALIZATION;
            EnumC1442f enumC1442f5 = (EnumC1442f) ((EnumMap) ahVar.purple).get(u12);
            if (enumC1442f5 == null) {
                enumC1442f5 = enumC1442f2;
            }
            if (enumC1442f5 == enumC1442f2) {
                C1450j c1450j = this.red;
                cyan(c1450j);
                c1 c12 = c1450j.c1(aoVar.charlie(), "_npa");
                EnumC1442f enumC1442f6 = EnumC1442f.MANIFEST;
                EnumC1442f enumC1442f7 = EnumC1442f.API;
                if (c12 != null) {
                    String str2 = c12.bravo;
                    if ("tcf".equals(str2)) {
                        ahVar.white(u12, EnumC1442f.TCF);
                    } else if ("app".equals(str2)) {
                        ahVar.white(u12, enumC1442f7);
                    } else {
                        ahVar.white(u12, enumC1442f6);
                    }
                } else {
                    Boolean maroon = aoVar.maroon();
                    if (maroon != null && ((!maroon.booleanValue() || m02.papa() == 1) && (maroon.booleanValue() || m02.papa() == 0))) {
                        ahVar.white(u12, enumC1442f6);
                    } else {
                        ahVar.white(u12, enumC1442f7);
                    }
                }
            }
        } else {
            int tango = tango(ahVar, aoVar.charlie());
            com.google.android.gms.internal.measurement.L0 romeo = com.google.android.gms.internal.measurement.M0.romeo();
            romeo.golf();
            com.google.android.gms.internal.measurement.M0.zulu((com.google.android.gms.internal.measurement.M0) romeo.purple, "_npa");
            pink().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            romeo.golf();
            com.google.android.gms.internal.measurement.M0.amber((com.google.android.gms.internal.measurement.M0) romeo.purple, currentTimeMillis);
            romeo.golf();
            com.google.android.gms.internal.measurement.M0.yankee((com.google.android.gms.internal.measurement.M0) romeo.purple, tango);
            com.google.android.gms.internal.measurement.M0 m03 = (com.google.android.gms.internal.measurement.M0) romeo.echo();
            c02.golf();
            com.google.android.gms.internal.measurement.D0.j((com.google.android.gms.internal.measurement.D0) c02.purple, m03);
            crimson().f7636g.charlie("non_personalized_ads(_npa)", Integer.valueOf(tango), "Setting user property");
        }
        String ahVar2 = ahVar.toString();
        c02.golf();
        com.google.android.gms.internal.measurement.D0.navy((com.google.android.gms.internal.measurement.D0) c02.purple, ahVar2);
        String charlie3 = aoVar.charlie();
        A a8 = this.alpha;
        a8.W();
        a8.e0(charlie3);
        C1289a0 k02 = a8.k0(charlie3);
        if (k02 != null && k02.tango() && !k02.sierra()) {
            z2 = false;
        } else {
            z2 = true;
        }
        List yankee = c02.yankee();
        for (int i14 = 0; i14 < yankee.size(); i14++) {
            if ("_tcf".equals(((C1383v0) yankee.get(i14)).tango())) {
                C1379u0 c1379u0 = (C1379u0) ((C1383v0) yankee.get(i14)).foxtrot();
                List november = c1379u0.november();
                int i15 = 0;
                while (true) {
                    if (i15 >= november.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((C1395y0) november.get(i15)).sierra())) {
                        String tango2 = ((C1395y0) november.get(i15)).tango();
                        if (z2 && tango2.length() > 4) {
                            char[] charArray = tango2.toCharArray();
                            int i16 = 1;
                            while (true) {
                                if (i16 < 64) {
                                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16)) {
                                        break;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i16 = 0;
                                    break;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16 | 1);
                            tango2 = String.valueOf(charArray);
                        }
                        C1391x0 romeo2 = C1395y0.romeo();
                        romeo2.india("_tcfd");
                        romeo2.juliet(tango2);
                        c1379u0.golf();
                        C1383v0.amber((C1383v0) c1379u0.purple, i15, (C1395y0) romeo2.echo());
                    } else {
                        i15++;
                    }
                }
                c02.amber(i14, c1379u0);
                return;
            }
        }
    }

    public final void kilo(com.google.android.gms.internal.measurement.C0 c02, C2.d dVar) {
        String str;
        String str2;
        for (int i4 = 0; i4 < c02.ivory(); i4++) {
            C1379u0 c1379u0 = (C1379u0) ((com.google.android.gms.internal.measurement.D0) c02.purple).b1(i4).foxtrot();
            Iterator it = c1379u0.november().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((C1395y0) it.next()).sierra())) {
                    if (((com.google.android.gms.internal.measurement.D0) dVar.purple).gray() >= white().c0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.f7591d)) {
                        int c03 = white().c0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.f7611q);
                        LinkedList linkedList = this.f7546j;
                        au auVar = this.yellow;
                        if (c03 > 0) {
                            C1450j c1450j = this.red;
                            cyan(c1450j);
                            if (c1450j.W0(quebec(), ((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), false, false, false, true).golf > c03) {
                                C1391x0 romeo = C1395y0.romeo();
                                romeo.india("_tnr");
                                romeo.hotel(1L);
                                c1379u0.kilo((C1395y0) romeo.echo());
                            } else {
                                if (white().j0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.Q)) {
                                    str2 = bravo().f0();
                                    C1391x0 romeo2 = C1395y0.romeo();
                                    romeo2.india("_tu");
                                    romeo2.juliet(str2);
                                    c1379u0.kilo((C1395y0) romeo2.echo());
                                } else {
                                    str2 = null;
                                }
                                C1391x0 romeo3 = C1395y0.romeo();
                                romeo3.india("_tr");
                                romeo3.hotel(1L);
                                c1379u0.kilo((C1395y0) romeo3.echo());
                                cyan(auVar);
                                zzov A02 = auVar.A0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c02, c1379u0, str2);
                                if (A02 != null) {
                                    crimson().f7636g.charlie(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), A02.alpha, "Generated trigger URI. appId, uri");
                                    C1450j c1450j2 = this.red;
                                    cyan(c1450j2);
                                    c1450j2.G0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), A02);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo());
                                    }
                                }
                            }
                        } else {
                            if (white().j0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), ac.Q)) {
                                str = bravo().f0();
                                C1391x0 romeo4 = C1395y0.romeo();
                                romeo4.india("_tu");
                                romeo4.juliet(str);
                                c1379u0.kilo((C1395y0) romeo4.echo());
                            } else {
                                str = null;
                            }
                            C1391x0 romeo5 = C1395y0.romeo();
                            romeo5.india("_tr");
                            romeo5.hotel(1L);
                            c1379u0.kilo((C1395y0) romeo5.echo());
                            cyan(auVar);
                            zzov A03 = auVar.A0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), c02, c1379u0, str);
                            if (A03 != null) {
                                crimson().f7636g.charlie(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), A03.alpha, "Generated trigger URI. appId, uri");
                                C1450j c1450j3 = this.red;
                                cyan(c1450j3);
                                c1450j3.G0(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo(), A03);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.D0) dVar.purple).romeo());
                                }
                            }
                        }
                    }
                    C1383v0 c1383v0 = (C1383v0) c1379u0.echo();
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.white((com.google.android.gms.internal.measurement.D0) c02.purple, i4, c1383v0);
                }
            }
        }
    }

    public final void lavender(ArrayList arrayList) {
        V5.x.bravo(!arrayList.isEmpty());
        if (this.f7554r != null) {
            crimson().white.alpha("Set uploading progress before finishing the previous upload");
        } else {
            this.f7554r = new ArrayList(arrayList);
        }
    }

    public final void lima(zzbh zzbhVar, zzr zzrVar) {
        C1474v0 c1474v0;
        List c02;
        G g2;
        List c03;
        List<zzai> c04;
        String str;
        V5.x.hotel(zzrVar);
        String str2 = zzrVar.alpha;
        V5.x.echo(str2);
        u().W();
        foxtrot();
        Nb.i echo = Nb.i.echo(zzbhVar);
        u().W();
        if (this.f7561y == null || (str = this.f7562z) == null || !str.equals(str2)) {
            c1474v0 = null;
        } else {
            c1474v0 = this.f7561y;
        }
        d1.m0(c1474v0, (Bundle) echo.teal, false);
        zzbh delta = echo.delta();
        alpha();
        if (TextUtils.isEmpty(zzrVar.purple) && TextUtils.isEmpty(zzrVar.f7704i)) {
            return;
        }
        if (!zzrVar.f7697a) {
            silver(zzrVar);
            return;
        }
        List list = zzrVar.f7707l;
        if (list != null) {
            String str3 = delta.alpha;
            if (list.contains(str3)) {
                Bundle o5 = delta.purple.o();
                o5.putLong("ga_safelisted", 1L);
                delta = new zzbh(str3, new zzbf(o5), delta.red, delta.silver);
            } else {
                crimson().f7635f.delta("Dropping non-safelisted event. appId, event name, origin", str2, delta.alpha, delta.red);
                return;
            }
        }
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1450j.h0();
        try {
            boolean j02 = white().j0(null, ac.f7588b0);
            String str4 = delta.alpha;
            if (j02 && "_s".equals(str4)) {
                C1450j c1450j2 = this.red;
                cyan(c1450j2);
                if (!c1450j2.w0(str2, "_s") && delta.purple.alpha.getLong("_sid") != 0) {
                    C1450j c1450j3 = this.red;
                    cyan(c1450j3);
                    if (!c1450j3.w0(str2, "_f")) {
                        C1450j c1450j4 = this.red;
                        cyan(c1450j4);
                        if (!c1450j4.w0(str2, "_v")) {
                            C1450j c1450j5 = this.red;
                            cyan(c1450j5);
                            pink().getClass();
                            c1450j5.g0(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", red(delta, str2));
                        }
                    }
                    C1450j c1450j6 = this.red;
                    cyan(c1450j6);
                    c1450j6.g0(str2, null, "_sid", red(delta, str2));
                }
            }
            C1450j c1450j7 = this.red;
            cyan(c1450j7);
            V5.x.echo(str2);
            c1450j7.W();
            c1450j7.X();
            long j5 = zzbhVar.silver;
            if (j5 < 0) {
                ar arVar = ((G) c1450j7.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.charlie(ar.e0(str2), Long.valueOf(j5), "Invalid time querying timed out conditional properties");
                c02 = Collections.EMPTY_LIST;
            } else {
                c02 = c1450j7.c0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j5)});
            }
            Iterator it = c02.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                g2 = this.e;
                if (!hasNext) {
                    break;
                }
                zzai zzaiVar = (zzai) it.next();
                if (zzaiVar != null) {
                    crimson().f7636g.delta("User property timed out", zzaiVar.alpha, g2.f7510f.foxtrot(zzaiVar.red.purple), zzaiVar.red.o());
                    zzbh zzbhVar2 = zzaiVar.yellow;
                    if (zzbhVar2 != null) {
                        peach(new zzbh(zzbhVar2, j5), zzrVar);
                    }
                    C1450j c1450j8 = this.red;
                    cyan(c1450j8);
                    c1450j8.x0(str2, zzaiVar.red.purple);
                }
            }
            C1450j c1450j9 = this.red;
            cyan(c1450j9);
            V5.x.echo(str2);
            c1450j9.W();
            c1450j9.X();
            if (j5 < 0) {
                ar arVar2 = ((G) c1450j9.alpha).f7507b;
                G.foxtrot(arVar2);
                arVar2.f7632b.charlie(ar.e0(str2), Long.valueOf(j5), "Invalid time querying expired conditional properties");
                c03 = Collections.EMPTY_LIST;
            } else {
                c03 = c1450j9.c0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j5)});
            }
            ArrayList arrayList = new ArrayList(c03.size());
            Iterator it2 = c03.iterator();
            while (it2.hasNext()) {
                zzai zzaiVar2 = (zzai) it2.next();
                if (zzaiVar2 != null) {
                    Iterator it3 = it2;
                    crimson().f7636g.delta("User property expired", zzaiVar2.alpha, g2.f7510f.foxtrot(zzaiVar2.red.purple), zzaiVar2.red.o());
                    C1450j c1450j10 = this.red;
                    cyan(c1450j10);
                    c1450j10.p0(str2, zzaiVar2.red.purple);
                    zzbh zzbhVar3 = zzaiVar2.f7696d;
                    if (zzbhVar3 != null) {
                        arrayList.add(zzbhVar3);
                    }
                    C1450j c1450j11 = this.red;
                    cyan(c1450j11);
                    c1450j11.x0(str2, zzaiVar2.red.purple);
                    it2 = it3;
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                peach(new zzbh((zzbh) it4.next(), j5), zzrVar);
            }
            C1450j c1450j12 = this.red;
            cyan(c1450j12);
            V5.x.echo(str2);
            V5.x.echo(str4);
            c1450j12.W();
            c1450j12.X();
            if (j5 < 0) {
                G g5 = (G) c1450j12.alpha;
                ar arVar3 = g5.f7507b;
                G.foxtrot(arVar3);
                arVar3.f7632b.delta("Invalid time querying triggered conditional properties", ar.e0(str2), g5.f7510f.delta(str4), Long.valueOf(j5));
                c04 = Collections.EMPTY_LIST;
            } else {
                c04 = c1450j12.c0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j5)});
            }
            ArrayList arrayList2 = new ArrayList(c04.size());
            for (zzai zzaiVar3 : c04) {
                if (zzaiVar3 != null) {
                    zzqb zzqbVar = zzaiVar3.red;
                    String str5 = zzaiVar3.alpha;
                    V5.x.hotel(str5);
                    String str6 = zzaiVar3.purple;
                    String str7 = zzqbVar.purple;
                    Object o10 = zzqbVar.o();
                    V5.x.hotel(o10);
                    long j6 = j5;
                    c1 c1Var = new c1(str5, str6, str7, j6, o10);
                    j5 = j6;
                    Object obj = c1Var.echo;
                    String str8 = c1Var.charlie;
                    C1450j c1450j13 = this.red;
                    cyan(c1450j13);
                    if (c1450j13.K0(c1Var)) {
                        crimson().f7636g.delta("User property triggered", zzaiVar3.alpha, g2.f7510f.foxtrot(str8), obj);
                    } else {
                        crimson().white.delta("Too many active user properties, ignoring", ar.e0(zzaiVar3.alpha), g2.f7510f.foxtrot(str8), obj);
                    }
                    zzbh zzbhVar4 = zzaiVar3.f7694b;
                    if (zzbhVar4 != null) {
                        arrayList2.add(zzbhVar4);
                    }
                    zzaiVar3.red = new zzqb(c1Var);
                    zzaiVar3.teal = true;
                    C1450j c1450j14 = this.red;
                    cyan(c1450j14);
                    c1450j14.J0(zzaiVar3);
                }
            }
            peach(delta, zzrVar);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                peach(new zzbh((zzbh) it5.next(), j5), zzrVar);
            }
            C1450j c1450j15 = this.red;
            cyan(c1450j15);
            c1450j15.r0();
            C1450j c1450j16 = this.red;
            cyan(c1450j16);
            c1450j16.l0();
        } catch (Throwable th) {
            C1450j c1450j17 = this.red;
            cyan(c1450j17);
            c1450j17.l0();
            throw th;
        }
    }

    public final void lime(zzai zzaiVar, zzr zzrVar) {
        zzbh zzbhVar;
        V5.x.echo(zzaiVar.alpha);
        V5.x.hotel(zzaiVar.purple);
        V5.x.hotel(zzaiVar.red);
        V5.x.echo(zzaiVar.red.purple);
        u().W();
        foxtrot();
        if (!coral(zzrVar)) {
            return;
        }
        if (!zzrVar.f7697a) {
            silver(zzrVar);
            return;
        }
        zzai zzaiVar2 = new zzai(zzaiVar);
        boolean z2 = false;
        zzaiVar2.teal = false;
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1450j.h0();
        try {
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            String str = zzaiVar2.alpha;
            V5.x.hotel(str);
            zzai U02 = c1450j2.U0(str, zzaiVar2.red.purple);
            G g2 = this.e;
            if (U02 != null && !U02.purple.equals(zzaiVar2.purple)) {
                crimson().f7632b.delta("Updating a conditional user property with different origin. name, origin, origin (from DB)", g2.f7510f.foxtrot(zzaiVar2.red.purple), zzaiVar2.purple, U02.purple);
            }
            if (U02 != null && U02.teal) {
                zzaiVar2.purple = U02.purple;
                zzaiVar2.silver = U02.silver;
                zzaiVar2.f7693a = U02.f7693a;
                zzaiVar2.white = U02.white;
                zzaiVar2.f7694b = U02.f7694b;
                zzaiVar2.teal = true;
                zzqb zzqbVar = zzaiVar2.red;
                zzaiVar2.red = new zzqb(U02.red.red, zzqbVar.o(), zzqbVar.purple, U02.red.white);
            } else if (TextUtils.isEmpty(zzaiVar2.white)) {
                zzqb zzqbVar2 = zzaiVar2.red;
                zzaiVar2.red = new zzqb(zzaiVar2.silver, zzqbVar2.o(), zzqbVar2.purple, zzaiVar2.red.white);
                zzaiVar2.teal = true;
                z2 = true;
            }
            if (zzaiVar2.teal) {
                zzqb zzqbVar3 = zzaiVar2.red;
                String str2 = zzaiVar2.alpha;
                V5.x.hotel(str2);
                String str3 = zzaiVar2.purple;
                String str4 = zzqbVar3.purple;
                long j5 = zzqbVar3.red;
                Object o5 = zzqbVar3.o();
                V5.x.hotel(o5);
                c1 c1Var = new c1(str2, str3, str4, j5, o5);
                Object obj = c1Var.echo;
                String str5 = c1Var.charlie;
                C1450j c1450j3 = this.red;
                cyan(c1450j3);
                if (c1450j3.K0(c1Var)) {
                    crimson().f7635f.delta("User property updated immediately", zzaiVar2.alpha, g2.f7510f.foxtrot(str5), obj);
                } else {
                    crimson().white.delta("(2)Too many active user properties, ignoring", ar.e0(zzaiVar2.alpha), g2.f7510f.foxtrot(str5), obj);
                }
                if (z2 && (zzbhVar = zzaiVar2.f7694b) != null) {
                    peach(new zzbh(zzbhVar, zzaiVar2.silver), zzrVar);
                }
            }
            C1450j c1450j4 = this.red;
            cyan(c1450j4);
            if (c1450j4.J0(zzaiVar2)) {
                crimson().f7635f.delta("Conditional property added", zzaiVar2.alpha, g2.f7510f.foxtrot(zzaiVar2.red.purple), zzaiVar2.red.o());
            } else {
                crimson().white.delta("Too many conditional properties, ignoring", ar.e0(zzaiVar2.alpha), g2.f7510f.foxtrot(zzaiVar2.red.purple), zzaiVar2.red.o());
            }
            C1450j c1450j5 = this.red;
            cyan(c1450j5);
            c1450j5.r0();
            C1450j c1450j6 = this.red;
            cyan(c1450j6);
            c1450j6.l0();
        } catch (Throwable th) {
            C1450j c1450j7 = this.red;
            cyan(c1450j7);
            c1450j7.l0();
            throw th;
        }
    }

    public final void magenta(String str, boolean z2, Long l10, Long l11) {
        boolean z10;
        C1450j c1450j = this.red;
        cyan(c1450j);
        ao T02 = c1450j.T0(str);
        if (T02 != null) {
            G g2 = T02.alpha;
            E e = g2.f7508c;
            G.foxtrot(e);
            e.W();
            boolean z11 = T02.lavender;
            if (T02.zulu != z2) {
                z10 = true;
            } else {
                z10 = false;
            }
            T02.lavender = z11 | z10;
            T02.zulu = z2;
            E e4 = g2.f7508c;
            G.foxtrot(e4);
            e4.W();
            T02.lavender |= !Objects.equals(T02.amber, l10);
            T02.amber = l10;
            E e5 = g2.f7508c;
            G.foxtrot(e5);
            e5.W();
            T02.lavender |= !Objects.equals(T02.azure, l11);
            T02.azure = l11;
            if (T02.sierra()) {
                C1450j c1450j2 = this.red;
                cyan(c1450j2);
                c1450j2.s0(T02, false);
            }
        }
    }

    public final void maroon(zzqb zzqbVar, zzr zzrVar) {
        long j5;
        int i4;
        u().W();
        foxtrot();
        if (coral(zzrVar)) {
            if (!zzrVar.f7697a) {
                silver(zzrVar);
                return;
            }
            d1 bravo = bravo();
            String str = zzqbVar.purple;
            int d12 = bravo.d1(str);
            androidx.core.widget.f fVar = this.C;
            if (d12 != 0) {
                bravo();
                white();
                int i5 = 0;
                String g02 = d1.g0(str, 24, true);
                if (str != null) {
                    i5 = str.length();
                }
                bravo();
                d1.q0(fVar, zzrVar.alpha, d12, "_ev", g02, i5);
                return;
            }
            int Z02 = bravo().Z0(zzqbVar.o(), str);
            if (Z02 != 0) {
                bravo();
                white();
                String g03 = d1.g0(str, 24, true);
                Object o5 = zzqbVar.o();
                if (o5 == null || (!(o5 instanceof String) && !(o5 instanceof CharSequence))) {
                    i4 = 0;
                } else {
                    i4 = o5.toString().length();
                }
                bravo();
                d1.q0(fVar, zzrVar.alpha, Z02, "_ev", g03, i4);
                return;
            }
            Object e02 = bravo().e0(zzqbVar.o(), str);
            if (e02 != null) {
                boolean equals = "_sid".equals(str);
                long j6 = 0;
                String str2 = zzrVar.alpha;
                if (equals) {
                    V5.x.hotel(str2);
                    C1450j c1450j = this.red;
                    cyan(c1450j);
                    c1 c12 = c1450j.c1(str2, "_sno");
                    if (c12 != null) {
                        Object obj = c12.echo;
                        if (obj instanceof Long) {
                            j5 = ((Long) obj).longValue();
                            maroon(new zzqb(zzqbVar.red, Long.valueOf(j5 + 1), "_sno", zzqbVar.white), zzrVar);
                        }
                    }
                    if (c12 != null) {
                        crimson().f7632b.bravo(c12.echo, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    C1450j c1450j2 = this.red;
                    cyan(c1450j2);
                    C1460o y02 = c1450j2.y0("events", str2, "_s");
                    if (y02 != null) {
                        ar crimson = crimson();
                        long j7 = y02.charlie;
                        crimson.f7636g.bravo(Long.valueOf(j7), "Backfill the session number. Last used session number");
                        j5 = j7;
                    } else {
                        j5 = 0;
                    }
                    maroon(new zzqb(zzqbVar.red, Long.valueOf(j5 + 1), "_sno", zzqbVar.white), zzrVar);
                }
                V5.x.hotel(str2);
                String str3 = zzqbVar.white;
                V5.x.hotel(str3);
                c1 c1Var = new c1(str2, str3, str, zzqbVar.red, e02);
                ar crimson2 = crimson();
                G g2 = this.e;
                am amVar = g2.f7510f;
                String str4 = c1Var.charlie;
                crimson2.f7636g.charlie(amVar.foxtrot(str4), e02, "Setting user property");
                C1450j c1450j3 = this.red;
                cyan(c1450j3);
                c1450j3.h0();
                try {
                    boolean equals2 = Column.ID.equals(str4);
                    Object obj2 = c1Var.echo;
                    if (equals2) {
                        C1450j c1450j4 = this.red;
                        cyan(c1450j4);
                        c1 c13 = c1450j4.c1(str2, Column.ID);
                        if (c13 != null && !obj2.equals(c13.echo)) {
                            C1450j c1450j5 = this.red;
                            cyan(c1450j5);
                            c1450j5.p0(str2, "_lair");
                        }
                    }
                    silver(zzrVar);
                    C1450j c1450j6 = this.red;
                    cyan(c1450j6);
                    boolean K02 = c1450j6.K0(c1Var);
                    if ("_sid".equals(str)) {
                        au auVar = this.yellow;
                        cyan(auVar);
                        String str5 = zzrVar.f7711p;
                        if (!TextUtils.isEmpty(str5)) {
                            j6 = auVar.w0(str5.getBytes(Charset.forName("UTF-8")));
                        }
                        long j10 = j6;
                        C1450j c1450j7 = this.red;
                        cyan(c1450j7);
                        ao T02 = c1450j7.T0(str2);
                        if (T02 != null) {
                            T02.quebec(j10);
                            if (T02.sierra()) {
                                C1450j c1450j8 = this.red;
                                cyan(c1450j8);
                                c1450j8.s0(T02, false);
                            }
                        }
                    }
                    C1450j c1450j9 = this.red;
                    cyan(c1450j9);
                    c1450j9.r0();
                    if (!K02) {
                        crimson().white.charlie(g2.f7510f.foxtrot(str4), obj2, "Too many unique user properties are set. Ignoring user property");
                        bravo();
                        d1.q0(fVar, str2, 9, null, null, 0);
                    }
                    C1450j c1450j10 = this.red;
                    cyan(c1450j10);
                    c1450j10.l0();
                } catch (Throwable th) {
                    C1450j c1450j11 = this.red;
                    cyan(c1450j11);
                    c1450j11.l0();
                    throw th;
                }
            }
        }
    }

    public final void mike(zzbh zzbhVar, String str) {
        C1450j c1450j = this.red;
        cyan(c1450j);
        ao T02 = c1450j.T0(str);
        if (T02 != null && !TextUtils.isEmpty(T02.echo())) {
            Boolean whiskey = whiskey(T02);
            if (whiskey == null) {
                if (!"_ui".equals(zzbhVar.alpha)) {
                    ar crimson = crimson();
                    crimson.f7632b.bravo(ar.e0(str), "Could not find package. appId");
                }
            } else if (!whiskey.booleanValue()) {
                ar crimson2 = crimson();
                crimson2.white.bravo(ar.e0(str), "App version does not match; dropping event. appId");
                return;
            }
            String golf = T02.golf();
            String echo = T02.echo();
            long lime = T02.lime();
            G g2 = T02.alpha;
            E e = g2.f7508c;
            G.foxtrot(e);
            e.W();
            String str2 = T02.lima;
            E e4 = g2.f7508c;
            G.foxtrot(e4);
            e4.W();
            long j5 = T02.mike;
            E e5 = g2.f7508c;
            G.foxtrot(e5);
            e5.W();
            long j6 = T02.november;
            E e10 = g2.f7508c;
            G.foxtrot(e10);
            e10.W();
            boolean z2 = T02.oscar;
            String foxtrot = T02.foxtrot();
            E e11 = g2.f7508c;
            G.foxtrot(e11);
            e11.W();
            boolean z10 = T02.papa;
            String alpha = T02.alpha();
            Boolean maroon = T02.maroon();
            long magenta = T02.magenta();
            E e12 = g2.f7508c;
            G.foxtrot(e12);
            e12.W();
            ArrayList arrayList = T02.tango;
            String juliet = e(str).juliet();
            boolean tango = T02.tango();
            E e13 = g2.f7508c;
            G.foxtrot(e13);
            e13.W();
            long j7 = T02.whiskey;
            V e14 = e(str);
            String str3 = b(str).bravo;
            E e15 = g2.f7508c;
            G.foxtrot(e15);
            e15.W();
            int i4 = T02.yankee;
            E e16 = g2.f7508c;
            G.foxtrot(e16);
            e16.W();
            november(zzbhVar, new zzr(str, golf, echo, lime, str2, j5, j6, (String) null, z2, false, foxtrot, 0L, 0, z10, false, alpha, maroon, magenta, (List) arrayList, (String) null, juliet, "", (String) null, tango, j7, e14.bravo, str3, i4, T02.beige, T02.india(), T02.hotel(), 0L, T02.lavender()));
            return;
        }
        crimson().f7635f.bravo(str, "No app data available; dropping event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0120, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019b, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.Z0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void navy() {
        C1450j c1450j;
        long longValue;
        SQLiteException e;
        ao.ad.crimson(this);
        this.f7551o = true;
        try {
            G g2 = this.e;
            g2.getClass();
            Boolean bool = g2.mike().teal;
            if (bool == null) {
                crimson().f7632b.alpha("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                crimson().white.alpha("Upload called in the client side when service should be used");
            } else if (this.f7544h > 0) {
                azure();
            } else {
                u().W();
                if (this.f7554r != null) {
                    crimson().f7636g.alpha("Uploading requested multiple times");
                } else {
                    au auVar = this.purple;
                    cyan(auVar);
                    if (!auVar.v0()) {
                        crimson().f7636g.alpha("Network not connected, ignoring upload request");
                        azure();
                    } else {
                        pink().getClass();
                        ?? currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int c02 = white().c0(null, ac.f7585a);
                        white();
                        long longValue2 = currentTimeMillis - ((Long) ac.echo.alpha(null)).longValue();
                        for (int i4 = 0; i4 < c02 && beige(longValue2, null); i4++) {
                        }
                        C1317f3.bravo();
                        u().W();
                        amber();
                        long alpha = this.f7539b.f7534a.alpha();
                        if (alpha != 0) {
                            crimson().f7635f.bravo(Long.valueOf(Math.abs(currentTimeMillis - alpha)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        C1450j c1450j2 = this.red;
                        cyan(c1450j2);
                        String a02 = c1450j2.a0();
                        long j5 = -1;
                        if (!TextUtils.isEmpty(a02)) {
                            if (this.f7556t == -1) {
                                C1450j c1450j3 = this.red;
                                cyan(c1450j3);
                                try {
                                    try {
                                        cursor2 = c1450j3.S0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j5 = cursor2.getLong(0);
                                        }
                                    } catch (SQLiteException e4) {
                                        ar arVar = ((G) c1450j3.alpha).f7507b;
                                        G.foxtrot(arVar);
                                        arVar.white.bravo(e4, "Error querying raw events");
                                    }
                                    cursor2.close();
                                    this.f7556t = j5;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            }
                            ochre(currentTimeMillis, a02);
                        } else {
                            try {
                                this.f7556t = -1L;
                                c1450j = this.red;
                                cyan(c1450j);
                                white();
                                longValue = currentTimeMillis - ((Long) ac.echo.alpha(null)).longValue();
                                c1450j.W();
                                c1450j.X();
                            } catch (Throwable th) {
                                th = th;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = c1450j.S0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (!currentTimeMillis.moveToFirst()) {
                                        ar arVar2 = ((G) c1450j.alpha).f7507b;
                                        G.foxtrot(arVar2);
                                        arVar2.f7636g.alpha("No expired configs for apps with pending events");
                                    } else {
                                        str = currentTimeMillis.getString(0);
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    ar arVar3 = ((G) c1450j.alpha).f7507b;
                                    G.foxtrot(arVar3);
                                    arVar3.white.bravo(e, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e10) {
                                e = e10;
                                currentTimeMillis = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                C1450j c1450j4 = this.red;
                                cyan(c1450j4);
                                ao T02 = c1450j4.T0(str);
                                if (T02 != null) {
                                    hotel(T02);
                                }
                            }
                        }
                    }
                }
            }
            this.f7551o = false;
            yankee();
        } catch (Throwable th3) {
            this.f7551o = false;
            yankee();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0090, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x007b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:124), block:B:33:0x007b */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void november(zzbh zzbhVar, zzr zzrVar) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        String str = zzrVar.alpha;
        V5.x.echo(str);
        Nb.i echo = Nb.i.echo(zzbhVar);
        d1 bravo = bravo();
        C1450j c1450j = this.red;
        cyan(c1450j);
        G g2 = (G) c1450j.alpha;
        c1450j.W();
        c1450j.X();
        Cursor cursor3 = null;
        r4 = null;
        Bundle bundle = null;
        try {
            try {
                cursor = c1450j.S0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e) {
                    e = e;
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.white.bravo(e, "Error selecting default event parameters");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 == null) {
                    cursor3.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 == null) {
            }
        }
        if (!cursor.moveToFirst()) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7636g.alpha("Default event parameters not found");
        } else {
            try {
                C1383v0 c1383v0 = (C1383v0) ((C1379u0) au.C0(C1383v0.romeo(), cursor.getBlob(0))).echo();
                c1450j.purple.alpha();
                bundle = au.e0(c1383v0.uniform());
            } catch (IOException e5) {
                ar arVar3 = g2.f7507b;
                G.foxtrot(arVar3);
                arVar3.white.charlie(ar.e0(str), e5, "Failed to retrieve default event parameters. appId");
            }
            cursor.close();
            bravo.n0((Bundle) echo.teal, bundle);
            d1 bravo2 = bravo();
            C1440e white = white();
            white.getClass();
            bravo2.p0(echo, Math.max(Math.min(white.c0(str, ac.olive), 100), 25));
            zzbh delta = echo.delta();
            if ("_cmp".equals(delta.alpha)) {
                zzbf zzbfVar = delta.purple;
                if ("referrer API v2".equals(zzbfVar.alpha.getString("_cis"))) {
                    String string = zzbfVar.alpha.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        maroon(new zzqb(delta.silver, string, "_lgclid", "auto"), zzrVar);
                    }
                }
            }
            lima(delta, zzrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a75  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ochre(long j5, String str) {
        boolean z2;
        boolean z10;
        Cursor cursor;
        Cursor cursor2;
        List list;
        boolean z11;
        boolean z12;
        int i4;
        ArrayList arrayList;
        V0 v0;
        com.google.android.gms.internal.measurement.K0 k02;
        V0 v02;
        String str2;
        V0 v03;
        V0 v04;
        au auVar;
        G g2;
        boolean z13;
        String str3;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        V0 v05;
        String romeo;
        boolean j02;
        String str4;
        List list2;
        int i5;
        com.google.android.gms.internal.measurement.A0 a02;
        com.google.android.gms.internal.measurement.K0 k03;
        V0 v06;
        C1314f0 c1314f0;
        String str5;
        Cursor query;
        C1450j c1450j;
        au auVar2;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        long j6;
        com.google.android.gms.internal.measurement.D0 d02;
        long j7;
        long j10;
        int c02 = white().c0(str, ac.hotel);
        int i10 = 0;
        int max = Math.max(0, white().c0(str, ac.india));
        C1450j c1450j2 = this.red;
        cyan(c1450j2);
        G g5 = (G) c1450j2.alpha;
        c1450j2.W();
        c1450j2.X();
        int i11 = 1;
        if (c02 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.bravo(z2);
        if (max > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        V5.x.bravo(z10);
        V5.x.echo(str);
        try {
            try {
                query = c1450j2.S0().query("queue", new String[]{"rowid", Column.DATA, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(c02));
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!query.moveToFirst()) {
                    list = Collections.EMPTY_LIST;
                    query.close();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (true) {
                        long j11 = query.getLong(i10);
                        try {
                            byte[] blob = query.getBlob(i11);
                            auVar2 = c1450j2.purple.yellow;
                            cyan(auVar2);
                            try {
                                byteArrayInputStream = new ByteArrayInputStream(blob);
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                c1450j = c1450j2;
                            } catch (IOException e) {
                                e = e;
                                c1450j = c1450j2;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            c1450j = c1450j2;
                            cursor2 = query;
                        }
                        try {
                            byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
                            while (true) {
                                int read = gZIPInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                cursor2 = query;
                                try {
                                    try {
                                        byteArrayOutputStream.write(bArr, 0, read);
                                        query = cursor2;
                                    } catch (IOException e5) {
                                        e = e5;
                                        try {
                                            ar arVar = ((G) auVar2.alpha).f7507b;
                                            G.foxtrot(arVar);
                                            arVar.white.bravo(e, "Failed to ungzip content");
                                            throw e;
                                            break;
                                        } catch (IOException e10) {
                                            e = e10;
                                            ar arVar2 = g5.f7507b;
                                            G.foxtrot(arVar2);
                                            arVar2.white.charlie(ar.e0(str), e, "Failed to unzip queued bundle. appId");
                                            if (cursor2.moveToNext()) {
                                                break;
                                            }
                                            c1450j2 = c1450j;
                                            query = cursor2;
                                            i10 = 0;
                                            i11 = 1;
                                            cursor2.close();
                                            list = arrayList2;
                                            if (list.isEmpty()) {
                                            }
                                        }
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    ar arVar3 = g5.f7507b;
                                    G.foxtrot(arVar3);
                                    arVar3.white.charlie(ar.e0(str), e, "Error querying bundles. appId");
                                    list = Collections.EMPTY_LIST;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (list.isEmpty()) {
                                    }
                                }
                            }
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (!arrayList2.isEmpty() && byteArray.length + i12 > max) {
                                break;
                            }
                            try {
                                com.google.android.gms.internal.measurement.C0 c03 = (com.google.android.gms.internal.measurement.C0) au.C0(com.google.android.gms.internal.measurement.D0.c1(), byteArray);
                                if (!arrayList2.isEmpty()) {
                                    com.google.android.gms.internal.measurement.D0 d03 = (com.google.android.gms.internal.measurement.D0) ((Pair) arrayList2.get(0)).first;
                                    com.google.android.gms.internal.measurement.D0 d04 = (com.google.android.gms.internal.measurement.D0) c03.echo();
                                    if (!d03.whiskey().equals(d04.whiskey()) || !d03.victor().equals(d04.victor()) || d03.y0() != d04.y0() || !d03.xray().equals(d04.xray())) {
                                        break;
                                    }
                                    Iterator it = d03.fuchsia().iterator();
                                    while (true) {
                                        j6 = -1;
                                        Iterator it2 = it;
                                        if (it.hasNext()) {
                                            com.google.android.gms.internal.measurement.M0 m02 = (com.google.android.gms.internal.measurement.M0) it2.next();
                                            d02 = d04;
                                            if ("_npa".equals(m02.sierra())) {
                                                j7 = m02.papa();
                                                break;
                                            } else {
                                                it = it2;
                                                d04 = d02;
                                            }
                                        } else {
                                            d02 = d04;
                                            j7 = -1;
                                            break;
                                        }
                                    }
                                    Iterator it3 = d02.fuchsia().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            com.google.android.gms.internal.measurement.M0 m03 = (com.google.android.gms.internal.measurement.M0) it3.next();
                                            j10 = j7;
                                            if ("_npa".equals(m03.sierra())) {
                                                j6 = m03.papa();
                                                break;
                                            }
                                            j7 = j10;
                                        } else {
                                            j10 = j7;
                                            break;
                                        }
                                    }
                                    if (j10 != j6) {
                                        break;
                                    }
                                }
                                if (!query.isNull(2)) {
                                    int i13 = query.getInt(2);
                                    c03.golf();
                                    com.google.android.gms.internal.measurement.D0.m0((com.google.android.gms.internal.measurement.D0) c03.purple, i13);
                                }
                                i12 += byteArray.length;
                                arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.D0) c03.echo(), Long.valueOf(j11)));
                            } catch (IOException e12) {
                                ar arVar4 = g5.f7507b;
                                G.foxtrot(arVar4);
                                arVar4.white.charlie(ar.e0(str), e12, "Failed to merge queued bundle. appId");
                            }
                            cursor2 = query;
                            if (cursor2.moveToNext() || i12 > max) {
                                break;
                                break;
                            }
                            c1450j2 = c1450j;
                            query = cursor2;
                            i10 = 0;
                            i11 = 1;
                        } catch (IOException e13) {
                            e = e13;
                            cursor2 = query;
                            ar arVar5 = ((G) auVar2.alpha).f7507b;
                            G.foxtrot(arVar5);
                            arVar5.white.bravo(e, "Failed to ungzip content");
                            throw e;
                            break;
                            break;
                        }
                    }
                    cursor2.close();
                    list = arrayList2;
                }
            } catch (SQLiteException e14) {
                e = e14;
                cursor2 = query;
                ar arVar32 = g5.f7507b;
                G.foxtrot(arVar32);
                arVar32.white.charlie(ar.e0(str), e, "Error querying bundles. appId");
                list = Collections.EMPTY_LIST;
                if (cursor2 != null) {
                }
                if (list.isEmpty()) {
                }
            } catch (Throwable th2) {
                th = th2;
                Cursor cursor3 = query;
                cursor = cursor3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e15) {
            e = e15;
            cursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (list.isEmpty()) {
            V e16 = e(str);
            U u4 = U.AD_STORAGE;
            if (e16.kilo(u4)) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        com.google.android.gms.internal.measurement.D0 d05 = (com.google.android.gms.internal.measurement.D0) ((Pair) it4.next()).first;
                        if (!d05.bronze().isEmpty()) {
                            str5 = d05.bronze();
                            break;
                        }
                    } else {
                        str5 = null;
                        break;
                    }
                }
                if (str5 != null) {
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        com.google.android.gms.internal.measurement.D0 d06 = (com.google.android.gms.internal.measurement.D0) ((Pair) list.get(i14)).first;
                        if (!d06.bronze().isEmpty() && !d06.bronze().equals(str5)) {
                            z11 = false;
                            list = list.subList(0, i14);
                            break;
                        }
                    }
                }
            }
            z11 = false;
            com.google.android.gms.internal.measurement.A0 oscar = com.google.android.gms.internal.measurement.B0.oscar();
            int size = list.size();
            ArrayList arrayList3 = new ArrayList(list.size());
            if ("1".equals(white().silver.d(str, "gaia_collection_enabled")) && e(str).kilo(u4)) {
                z12 = true;
            } else {
                z12 = z11;
            }
            boolean kilo = e(str).kilo(u4);
            boolean kilo2 = e(str).kilo(U.ANALYTICS_STORAGE);
            boolean j03 = white().j0(str, ac.f7564E);
            W0 w02 = this.f7540c;
            G g10 = (G) w02.alpha;
            C1440e c1440e = g10.yellow;
            ab abVar = ac.f7568I;
            boolean j04 = c1440e.j0(null, abVar);
            EnumC1472u0 enumC1472u0 = EnumC1472u0.SGTM;
            boolean z14 = z12;
            EnumC1472u0 enumC1472u02 = EnumC1472u0.GOOGLE_ANALYTICS;
            EnumC1472u0 enumC1472u03 = EnumC1472u0.SGTM_CLIENT;
            Z0 z02 = w02.purple;
            com.google.android.gms.internal.measurement.A0 a03 = oscar;
            ar arVar6 = g10.f7507b;
            if (j04) {
                C1450j c1450j3 = z02.red;
                cyan(c1450j3);
                ao T02 = c1450j3.T0(str);
                if (T02 == null || !T02.tango()) {
                    i4 = size;
                    arrayList = arrayList3;
                    v0 = new V0(w02.X(str), Collections.EMPTY_MAP, enumC1472u02, null);
                } else {
                    com.google.android.gms.internal.measurement.J0 november = com.google.android.gms.internal.measurement.K0.november();
                    november.golf();
                    arrayList = arrayList3;
                    com.google.android.gms.internal.measurement.K0.uniform((com.google.android.gms.internal.measurement.K0) november.purple, 2);
                    int echo = ao.ad.echo(T02.lavender());
                    Q0.c.yankee(echo);
                    november.hotel(echo);
                    if (!w02.Y(str, T02.delta())) {
                        november.golf();
                        com.google.android.gms.internal.measurement.K0.tango((com.google.android.gms.internal.measurement.K0) november.purple, 3);
                        v04 = new V0(w02.X(str), Collections.EMPTY_MAP, enumC1472u02, (com.google.android.gms.internal.measurement.K0) november.echo());
                        i4 = size;
                    } else {
                        String charlie = T02.charlie();
                        november.golf();
                        i4 = size;
                        com.google.android.gms.internal.measurement.K0.uniform((com.google.android.gms.internal.measurement.K0) november.purple, 2);
                        A a6 = z02.alpha;
                        cyan(a6);
                        C1314f0 l02 = a6.l0(T02.charlie());
                        if (l02 != null && l02.coral()) {
                            HashMap hashMap = new HashMap();
                            if (!TextUtils.isEmpty(T02.india())) {
                                c1314f0 = l02;
                                hashMap.put("x-gtm-server-preview", T02.india());
                            } else {
                                c1314f0 = l02;
                            }
                            String quebec = c1314f0.uniform().quebec();
                            int echo2 = ao.ad.echo(T02.lavender());
                            if (echo2 != 0 && echo2 != 2) {
                                november.hotel(echo2);
                            } else if (!g10.yellow.j0(null, abVar)) {
                                november.hotel(10);
                            } else if (W0.Z(T02.charlie())) {
                                november.hotel(11);
                            } else if (TextUtils.isEmpty(quebec)) {
                                november.hotel(12);
                            } else {
                                G.foxtrot(arVar6);
                                arVar6.f7636g.bravo(charlie, "[sgtm] Eligible for client side upload. appId");
                                november.golf();
                                com.google.android.gms.internal.measurement.K0.uniform((com.google.android.gms.internal.measurement.K0) november.purple, 3);
                                november.hotel(2);
                                v06 = new V0(quebec, hashMap, enumC1472u03, (com.google.android.gms.internal.measurement.K0) november.echo());
                                if (v06 != null) {
                                    v04 = v06;
                                } else {
                                    v0 = new V0(w02.X(str), Collections.EMPTY_MAP, enumC1472u02, (com.google.android.gms.internal.measurement.K0) november.echo());
                                }
                            }
                            c1314f0.uniform().getClass();
                            c1314f0.uniform().getClass();
                            if (!TextUtils.isEmpty(quebec)) {
                                G.foxtrot(arVar6);
                                arVar6.f7636g.bravo(charlie, "[sgtm] Eligible for local service direct upload. appId");
                                november.golf();
                                com.google.android.gms.internal.measurement.K0.uniform((com.google.android.gms.internal.measurement.K0) november.purple, 5);
                                november.golf();
                                com.google.android.gms.internal.measurement.K0.tango((com.google.android.gms.internal.measurement.K0) november.purple, 2);
                                v06 = new V0(quebec, hashMap, enumC1472u0, (com.google.android.gms.internal.measurement.K0) november.echo());
                                if (v06 != null) {
                                }
                            } else {
                                november.golf();
                                com.google.android.gms.internal.measurement.K0.tango((com.google.android.gms.internal.measurement.K0) november.purple, 6);
                                G.foxtrot(arVar6);
                                arVar6.f7636g.bravo(T02.charlie(), "[sgtm] Local service, missing sgtm_server_url");
                            }
                        } else {
                            G.foxtrot(arVar6);
                            arVar6.f7636g.bravo(charlie, "[sgtm] Missing sgtm_setting in remote config. appId");
                            november.golf();
                            com.google.android.gms.internal.measurement.K0.tango((com.google.android.gms.internal.measurement.K0) november.purple, 4);
                        }
                        v06 = null;
                        if (v06 != null) {
                        }
                    }
                }
                v04 = v0;
            } else {
                i4 = size;
                arrayList = arrayList3;
                C1450j c1450j4 = z02.red;
                cyan(c1450j4);
                ao T03 = c1450j4.T0(str);
                if (T03 == null) {
                    v0 = new V0(w02.X(str), Collections.EMPTY_MAP, enumC1472u02, null);
                } else if (w02.Y(str, T03.delta())) {
                    if (T03.tango()) {
                        G.foxtrot(arVar6);
                        a4.j jVar = arVar6.f7636g;
                        jVar.alpha("sgtm upload enabled in manifest.");
                        A a8 = z02.alpha;
                        cyan(a8);
                        C1314f0 l03 = a8.l0(T03.charlie());
                        if (l03 != null) {
                            if (l03.coral()) {
                                String romeo2 = l03.uniform().romeo();
                                if (!TextUtils.isEmpty(romeo2)) {
                                    String papa = l03.uniform().papa();
                                    G.foxtrot(arVar6);
                                    if (true != TextUtils.isEmpty(papa)) {
                                        str2 = "N";
                                    } else {
                                        str2 = "Y";
                                    }
                                    jVar.charlie(romeo2, str2, "sgtm configured with upload_url, server_info");
                                    if (TextUtils.isEmpty(papa)) {
                                        k02 = null;
                                        v03 = new V0(romeo2, Collections.EMPTY_MAP, enumC1472u0, null);
                                    } else {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("x-sgtm-server-info", papa);
                                        if (!TextUtils.isEmpty(T03.india())) {
                                            hashMap2.put("x-gtm-server-preview", T03.india());
                                        }
                                        k02 = null;
                                        v03 = new V0(romeo2, hashMap2, enumC1472u0, null);
                                    }
                                    v02 = v03;
                                }
                            }
                        } else {
                            k02 = null;
                            v02 = null;
                        }
                        if (v02 == null) {
                            v04 = v02;
                        } else {
                            v0 = new V0(w02.X(str), Collections.EMPTY_MAP, enumC1472u02, k02);
                        }
                    }
                    k02 = null;
                    v02 = null;
                    if (v02 == null) {
                    }
                } else {
                    v0 = new V0(w02.X(str), Collections.EMPTY_MAP, enumC1472u02, null);
                }
                v04 = v0;
            }
            int i15 = 0;
            while (true) {
                auVar = this.yellow;
                g2 = this.e;
                int i16 = i4;
                if (i15 >= i16) {
                    break;
                }
                com.google.android.gms.internal.measurement.C0 c04 = (com.google.android.gms.internal.measurement.C0) ((com.google.android.gms.internal.measurement.D0) ((Pair) list.get(i15)).first).foxtrot();
                ArrayList arrayList4 = arrayList;
                arrayList4.add((Long) ((Pair) list.get(i15)).second);
                white().d0();
                c04.golf();
                com.google.android.gms.internal.measurement.D0.u0((com.google.android.gms.internal.measurement.D0) c04.purple);
                c04.golf();
                com.google.android.gms.internal.measurement.D0.t0((com.google.android.gms.internal.measurement.D0) c04.purple, j5);
                g2.getClass();
                c04.golf();
                com.google.android.gms.internal.measurement.D0.n0((com.google.android.gms.internal.measurement.D0) c04.purple);
                if (!z14) {
                    c04.golf();
                    com.google.android.gms.internal.measurement.D0.n((com.google.android.gms.internal.measurement.D0) c04.purple);
                }
                if (!kilo) {
                    c04.golf();
                    com.google.android.gms.internal.measurement.D0.t((com.google.android.gms.internal.measurement.D0) c04.purple);
                    c04.golf();
                    com.google.android.gms.internal.measurement.D0.q((com.google.android.gms.internal.measurement.D0) c04.purple);
                }
                if (!kilo2) {
                    c04.golf();
                    com.google.android.gms.internal.measurement.D0.k((com.google.android.gms.internal.measurement.D0) c04.purple);
                }
                golf(c04, str);
                if (!j03) {
                    c04.golf();
                    com.google.android.gms.internal.measurement.D0.u((com.google.android.gms.internal.measurement.D0) c04.purple);
                }
                if (!kilo2) {
                    c04.golf();
                    com.google.android.gms.internal.measurement.D0.l((com.google.android.gms.internal.measurement.D0) c04.purple);
                }
                String bronze = ((com.google.android.gms.internal.measurement.D0) c04.purple).bronze();
                if (!TextUtils.isEmpty(bronze) && !bronze.equals("00000000-0000-0000-0000-000000000000")) {
                    list2 = list;
                    i4 = i16;
                    i5 = i15;
                } else {
                    ArrayList arrayList5 = new ArrayList(c04.yankee());
                    Iterator it5 = arrayList5.iterator();
                    list2 = list;
                    i4 = i16;
                    Long l10 = null;
                    Long l11 = null;
                    boolean z15 = false;
                    boolean z16 = false;
                    while (it5.hasNext()) {
                        int i17 = i15;
                        C1383v0 c1383v0 = (C1383v0) it5.next();
                        Iterator it6 = it5;
                        if ("_fx".equals(c1383v0.tango())) {
                            it6.remove();
                            it5 = it6;
                            i15 = i17;
                            z15 = true;
                        } else if ("_f".equals(c1383v0.tango())) {
                            alpha();
                            C1395y0 f02 = au.f0(c1383v0, "_pfo");
                            if (f02 != null) {
                                l10 = Long.valueOf(f02.quebec());
                            }
                            alpha();
                            C1395y0 f03 = au.f0(c1383v0, "_uwa");
                            if (f03 != null) {
                                l11 = Long.valueOf(f03.quebec());
                            }
                            it5 = it6;
                            i15 = i17;
                        } else {
                            it5 = it6;
                            i15 = i17;
                        }
                        z16 = true;
                    }
                    i5 = i15;
                    if (z15) {
                        c04.golf();
                        com.google.android.gms.internal.measurement.D0.o((com.google.android.gms.internal.measurement.D0) c04.purple);
                        c04.golf();
                        com.google.android.gms.internal.measurement.D0.f((com.google.android.gms.internal.measurement.D0) c04.purple, arrayList5);
                    }
                    if (z16) {
                        magenta(c04.xray(), true, l10, l11);
                    }
                }
                if (c04.ivory() == 0) {
                    a02 = a03;
                } else {
                    if (white().j0(str, ac.f7615u)) {
                        byte[] charlie2 = ((com.google.android.gms.internal.measurement.D0) c04.echo()).charlie();
                        cyan(auVar);
                        long w03 = auVar.w0(charlie2);
                        c04.golf();
                        com.google.android.gms.internal.measurement.D0.magenta((com.google.android.gms.internal.measurement.D0) c04.purple, w03);
                    }
                    if (white().j0(null, ac.f7568I) && (k03 = v04.delta) != null) {
                        c04.golf();
                        com.google.android.gms.internal.measurement.D0.p0((com.google.android.gms.internal.measurement.D0) c04.purple, k03);
                    }
                    a03.golf();
                    a02 = a03;
                    com.google.android.gms.internal.measurement.B0.victor((com.google.android.gms.internal.measurement.B0) a02.purple, (com.google.android.gms.internal.measurement.D0) c04.echo());
                }
                i15 = i5 + 1;
                a03 = a02;
                arrayList = arrayList4;
                list = list2;
            }
            com.google.android.gms.internal.measurement.A0 a04 = a03;
            ArrayList arrayList6 = arrayList;
            if (((com.google.android.gms.internal.measurement.B0) a04.purple).november() == 0) {
                lavender(arrayList6);
                papa(false, 204, null, null, str, Collections.EMPTY_LIST);
                return;
            }
            com.google.android.gms.internal.measurement.B0 b02 = (com.google.android.gms.internal.measurement.B0) a04.echo();
            ArrayList arrayList7 = new ArrayList();
            boolean j05 = white().j0(null, ac.f7568I);
            EnumC1472u0 enumC1472u04 = v04.charlie;
            if (j05 && enumC1472u04 == enumC1472u03) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (enumC1472u04 != enumC1472u0) {
                if (z13) {
                    z13 = true;
                }
                j02 = white().j0(null, ac.f7567H);
                au auVar3 = this.purple;
                if (j02) {
                    cyan(auVar3);
                    if (!auVar3.v0()) {
                        return;
                    }
                }
                if (!Log.isLoggable(crimson().h0(), 2)) {
                    cyan(auVar);
                    str4 = auVar.D0(b02);
                } else {
                    str4 = null;
                }
                alpha();
                byte[] charlie3 = b02.charlie();
                lavender(arrayList6);
                this.f7539b.f7535b.bravo(j5);
                crimson().f7636g.delta("Uploading data. app, uncompressed size, data", str, Integer.valueOf(charlie3.length), str4);
                this.f7550n = true;
                cyan(auVar3);
                auVar3.u0(str, v04, b02, new C1298c(this, str, arrayList7));
            }
            Iterator it7 = ((com.google.android.gms.internal.measurement.B0) a04.echo()).tango().iterator();
            while (true) {
                if (it7.hasNext()) {
                    if (((com.google.android.gms.internal.measurement.D0) it7.next()).N()) {
                        str3 = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    str3 = null;
                    break;
                }
            }
            com.google.android.gms.internal.measurement.B0 b03 = (com.google.android.gms.internal.measurement.B0) a04.echo();
            u().W();
            foxtrot();
            com.google.android.gms.internal.measurement.A0 papa2 = com.google.android.gms.internal.measurement.B0.papa(b03);
            if (!TextUtils.isEmpty(str3)) {
                papa2.golf();
                com.google.android.gms.internal.measurement.B0.yankee((com.google.android.gms.internal.measurement.B0) papa2.purple, str3);
            }
            A a10 = this.alpha;
            cyan(a10);
            String m04 = a10.m0(str);
            if (!TextUtils.isEmpty(m04)) {
                papa2.golf();
                com.google.android.gms.internal.measurement.B0.zulu((com.google.android.gms.internal.measurement.B0) papa2.purple, m04);
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it8 = b03.tango().iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.C0 november2 = com.google.android.gms.internal.measurement.D0.november((com.google.android.gms.internal.measurement.D0) it8.next());
                november2.golf();
                com.google.android.gms.internal.measurement.D0.n((com.google.android.gms.internal.measurement.D0) november2.purple);
                arrayList8.add((com.google.android.gms.internal.measurement.D0) november2.echo());
            }
            papa2.golf();
            com.google.android.gms.internal.measurement.B0.whiskey((com.google.android.gms.internal.measurement.B0) papa2.purple);
            papa2.golf();
            com.google.android.gms.internal.measurement.B0.uniform((com.google.android.gms.internal.measurement.B0) papa2.purple, arrayList8);
            C1440e white = white();
            ab abVar2 = ac.f7566G;
            if (white.j0(null, abVar2)) {
                ar crimson = crimson();
                if (TextUtils.isEmpty(str3)) {
                    romeo = BuildConfig.TRAVIS;
                } else {
                    romeo = ((com.google.android.gms.internal.measurement.B0) papa2.purple).romeo();
                }
                crimson.f7636g.bravo(romeo, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
            } else {
                crimson().f7636g.alpha("[sgtm] Processed MeasurementBatch for sGTM.");
            }
            com.google.android.gms.internal.measurement.B0 b04 = (com.google.android.gms.internal.measurement.B0) papa2.echo();
            if (!TextUtils.isEmpty(str3) && white().j0(null, abVar2)) {
                com.google.android.gms.internal.measurement.B0 b05 = (com.google.android.gms.internal.measurement.B0) a04.echo();
                u().W();
                foxtrot();
                com.google.android.gms.internal.measurement.A0 oscar2 = com.google.android.gms.internal.measurement.B0.oscar();
                crimson().f7636g.bravo(str3, "[sgtm] Processing Google Signal, sgtmJoinId:");
                oscar2.golf();
                com.google.android.gms.internal.measurement.B0.yankee((com.google.android.gms.internal.measurement.B0) oscar2.purple, str3);
                for (com.google.android.gms.internal.measurement.D0 d07 : b05.tango()) {
                    com.google.android.gms.internal.measurement.C0 c12 = com.google.android.gms.internal.measurement.D0.c1();
                    String zulu = d07.zulu();
                    c12.golf();
                    com.google.android.gms.internal.measurement.D0.plum((com.google.android.gms.internal.measurement.D0) c12.purple, zulu);
                    int H02 = d07.H0();
                    c12.golf();
                    com.google.android.gms.internal.measurement.D0.orange((com.google.android.gms.internal.measurement.D0) c12.purple, H02);
                    oscar2.golf();
                    com.google.android.gms.internal.measurement.B0.victor((com.google.android.gms.internal.measurement.B0) oscar2.purple, (com.google.android.gms.internal.measurement.D0) c12.echo());
                }
                com.google.android.gms.internal.measurement.B0 b06 = (com.google.android.gms.internal.measurement.B0) oscar2.echo();
                A a11 = z02.alpha;
                cyan(a11);
                String m05 = a11.m0(str);
                boolean isEmpty = TextUtils.isEmpty(m05);
                EnumC1472u0 enumC1472u05 = EnumC1472u0.GOOGLE_SIGNAL;
                EnumC1472u0 enumC1472u06 = EnumC1472u0.GOOGLE_SIGNAL_PENDING;
                if (!isEmpty) {
                    Uri parse = Uri.parse((String) ac.sierra.alpha(null));
                    Uri.Builder buildUpon = parse.buildUpon();
                    buildUpon.authority(m05 + "." + parse.getAuthority());
                    String uri = buildUpon.build().toString();
                    if (z13) {
                        enumC1472u05 = enumC1472u06;
                    }
                    v05 = new V0(uri, Collections.EMPTY_MAP, enumC1472u05, null);
                } else {
                    String str6 = (String) ac.sierra.alpha(null);
                    if (z13) {
                        enumC1472u05 = enumC1472u06;
                    }
                    v05 = new V0(str6, Collections.EMPTY_MAP, enumC1472u05, null);
                }
                arrayList7.add(Pair.create(b06, v05));
            }
            if (z13) {
                com.google.android.gms.internal.measurement.A0 a05 = (com.google.android.gms.internal.measurement.A0) b04.foxtrot();
                for (int i18 = 0; i18 < b04.november(); i18++) {
                    com.google.android.gms.internal.measurement.C0 c05 = (com.google.android.gms.internal.measurement.C0) b04.quebec(i18).foxtrot();
                    c05.golf();
                    com.google.android.gms.internal.measurement.D0.w((com.google.android.gms.internal.measurement.D0) c05.purple);
                    c05.golf();
                    com.google.android.gms.internal.measurement.D0.lavender((com.google.android.gms.internal.measurement.D0) c05.purple, j5);
                    a05.golf();
                    com.google.android.gms.internal.measurement.B0.xray((com.google.android.gms.internal.measurement.B0) a05.purple, i18, (com.google.android.gms.internal.measurement.D0) c05.echo());
                }
                arrayList7.add(Pair.create((com.google.android.gms.internal.measurement.B0) a05.echo(), v04));
                lavender(arrayList6);
                papa(false, 204, null, null, str, arrayList7);
                if (plum(str, v04.alpha)) {
                    crimson().f7636g.bravo(str, "[sgtm] Sending sgtm batches available notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    Context context = g2.alpha;
                    if (Build.VERSION.SDK_INT >= 34) {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                        return;
                    }
                    context.sendBroadcast(intent);
                    return;
                }
                return;
            }
            b02 = b04;
            j02 = white().j0(null, ac.f7567H);
            au auVar32 = this.purple;
            if (j02) {
            }
            if (!Log.isLoggable(crimson().h0(), 2)) {
            }
            alpha();
            byte[] charlie32 = b02.charlie();
            lavender(arrayList6);
            this.f7539b.f7535b.bravo(j5);
            crimson().f7636g.delta("Uploading data. app, uncompressed size, data", str, Integer.valueOf(charlie32.length), str4);
            this.f7550n = true;
            cyan(auVar32);
            auVar32.u0(str, v04, b02, new C1298c(this, str, arrayList7));
        }
    }

    public final void olive(String str) {
        ao.ad.crimson(this);
        this.f7551o = true;
        try {
            G g2 = this.e;
            g2.getClass();
            Boolean bool = g2.mike().teal;
            if (bool == null) {
                crimson().f7632b.alpha("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                crimson().white.alpha("Upload called in the client side when service should be used");
            } else if (this.f7544h > 0) {
                azure();
            } else {
                au auVar = this.purple;
                cyan(auVar);
                if (!auVar.v0()) {
                    crimson().f7636g.alpha("Network not connected, ignoring upload request");
                    azure();
                } else {
                    C1450j c1450j = this.red;
                    cyan(c1450j);
                    if (!c1450j.v0(str)) {
                        crimson().f7636g.bravo(str, "[sgtm] Upload queue has no batches for appId");
                    } else {
                        C1450j c1450j2 = this.red;
                        cyan(c1450j2);
                        a1 b12 = c1450j2.b1(str);
                        if (b12 != null) {
                            com.google.android.gms.internal.measurement.B0 b02 = b12.bravo;
                            crimson().f7636g.delta("[sgtm] Uploading data from upload queue. appId, type, url", str, b12.echo, b12.charlie);
                            byte[] charlie = b02.charlie();
                            if (Log.isLoggable(crimson().h0(), 2)) {
                                au auVar2 = this.yellow;
                                cyan(auVar2);
                                crimson().f7636g.delta("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(charlie.length), auVar2.D0(b02));
                            }
                            this.f7550n = true;
                            au auVar3 = this.purple;
                            cyan(auVar3);
                            auVar3.u0(str, new V0(b12.charlie, b12.delta, b12.echo, null), b02, new com.bumptech.glide.load.engine.h(this, str, b12));
                        }
                    }
                }
            }
            this.f7551o = false;
            yankee();
        } catch (Throwable th) {
            this.f7551o = false;
            yankee();
            throw th;
        }
    }

    public final void orange(String str, C1391x0 c1391x0, Bundle bundle, String str2) {
        int max;
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (!d1.Q0(((C1395y0) c1391x0.purple).sierra()) && !d1.Q0(str)) {
            C1440e white = white();
            white.getClass();
            max = Math.max(Math.min(white.c0(str2, ac.yellow), HttpConstants.HTTP_INTERNAL_ERROR), 100);
        } else {
            C1440e white2 = white();
            white2.getClass();
            max = Math.max(Math.max(Math.min(white2.c0(str2, ac.yellow), HttpConstants.HTTP_INTERNAL_ERROR), 100), Barcode.FORMAT_QR_CODE);
        }
        long j5 = max;
        long codePointCount = ((C1395y0) c1391x0.purple).tango().codePointCount(0, ((C1395y0) c1391x0.purple).tango().length());
        bravo();
        String sierra = ((C1395y0) c1391x0.purple).sierra();
        white();
        String g02 = d1.g0(sierra, 40, true);
        if (codePointCount > j5 && !unmodifiableList.contains(((C1395y0) c1391x0.purple).sierra())) {
            if ("_ev".equals(((C1395y0) c1391x0.purple).sierra())) {
                bravo();
                String tango = ((C1395y0) c1391x0.purple).tango();
                C1440e white3 = white();
                white3.getClass();
                bundle.putString("_ev", d1.g0(tango, Math.max(Math.max(Math.min(white3.c0(str2, ac.yellow), HttpConstants.HTTP_INTERNAL_ERROR), 100), Barcode.FORMAT_QR_CODE), true));
                return;
            }
            crimson().f7634d.charlie(g02, Long.valueOf(codePointCount), "Param value is too long; discarded. Name, value length");
            if (bundle.getLong("_err") == 0) {
                bundle.putLong("_err", 4L);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", g02);
                    bundle.putLong("_el", codePointCount);
                }
            }
            bundle.remove(((C1395y0) c1391x0.purple).sierra());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0169, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0146, B:46:0x014f, B:48:0x015e, B:49:0x0166, B:50:0x0118, B:51:0x00e5, B:53:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0169, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0146, B:46:0x014f, B:48:0x015e, B:49:0x0166, B:50:0x0118, B:51:0x00e5, B:53:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0169, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0146, B:46:0x014f, B:48:0x015e, B:49:0x0166, B:50:0x0118, B:51:0x00e5, B:53:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0169, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0146, B:46:0x014f, B:48:0x015e, B:49:0x0166, B:50:0x0118, B:51:0x00e5, B:53:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oscar(String str, int i4, IOException iOException, byte[] bArr, Map map) {
        boolean z2;
        au auVar = this.purple;
        u().W();
        foxtrot();
        V5.x.echo(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th) {
                this.f7549m = false;
                yankee();
                throw th;
            }
        }
        a4.j jVar = crimson().f7636g;
        Integer valueOf = Integer.valueOf(bArr.length);
        jVar.bravo(valueOf, "onConfigFetched. Response size");
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1450j.h0();
        try {
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            ao T02 = c1450j2.T0(str);
            if (i4 != 200 && i4 != 204) {
                if (i4 == 304) {
                    i4 = 304;
                }
                z2 = false;
                if (T02 == null) {
                    crimson().f7632b.bravo(ar.e0(str), "App does not exist in onConfigFetched. appId");
                } else {
                    A a6 = this.alpha;
                    if (!z2 && i4 != 404) {
                        pink().getClass();
                        T02.bronze(System.currentTimeMillis());
                        C1450j c1450j3 = this.red;
                        cyan(c1450j3);
                        c1450j3.s0(T02, false);
                        crimson().f7636g.charlie(Integer.valueOf(i4), iOException, "Fetching config failed. code, error");
                        cyan(a6);
                        a6.W();
                        a6.f7500f.put(str, null);
                        aw awVar = this.f7539b.f7535b;
                        pink().getClass();
                        awVar.bravo(System.currentTimeMillis());
                        if (i4 == 503 || i4 == 429) {
                            aw awVar2 = this.f7539b.yellow;
                            pink().getClass();
                            awVar2.bravo(System.currentTimeMillis());
                        }
                        azure();
                    } else {
                        String xray = xray("Last-Modified", map);
                        String xray2 = xray("ETag", map);
                        if (i4 != 404 && i4 != 304) {
                            cyan(a6);
                            a6.q0(str, bArr, xray, xray2);
                            pink().getClass();
                            T02.uniform(System.currentTimeMillis());
                            C1450j c1450j4 = this.red;
                            cyan(c1450j4);
                            c1450j4.s0(T02, false);
                            if (i4 != 404) {
                                crimson().f7634d.bravo(str, "Config not found. Using empty config. appId");
                            } else {
                                crimson().f7636g.charlie(Integer.valueOf(i4), valueOf, "Successfully fetched config. Got network response. code, size");
                            }
                            cyan(auVar);
                            if (!auVar.v0() && black()) {
                                navy();
                            } else {
                                if (white().j0(null, ac.f7565F)) {
                                    cyan(auVar);
                                    if (auVar.v0()) {
                                        C1450j c1450j5 = this.red;
                                        cyan(c1450j5);
                                        if (c1450j5.v0(T02.charlie())) {
                                            olive(T02.charlie());
                                        }
                                    }
                                }
                                azure();
                            }
                        }
                        cyan(a6);
                        if (a6.l0(str) == null) {
                            cyan(a6);
                            a6.q0(str, null, null, null);
                        }
                        pink().getClass();
                        T02.uniform(System.currentTimeMillis());
                        C1450j c1450j42 = this.red;
                        cyan(c1450j42);
                        c1450j42.s0(T02, false);
                        if (i4 != 404) {
                        }
                        cyan(auVar);
                        if (!auVar.v0()) {
                        }
                        if (white().j0(null, ac.f7565F)) {
                        }
                        azure();
                    }
                }
                C1450j c1450j6 = this.red;
                cyan(c1450j6);
                c1450j6.r0();
                this.f7549m = false;
                yankee();
            }
            if (iOException == null) {
                z2 = true;
                if (T02 == null) {
                }
                C1450j c1450j62 = this.red;
                cyan(c1450j62);
                c1450j62.r0();
                this.f7549m = false;
                yankee();
            }
            z2 = false;
            if (T02 == null) {
            }
            C1450j c1450j622 = this.red;
            cyan(c1450j622);
            c1450j622.r0();
            this.f7549m = false;
            yankee();
        } finally {
            C1450j c1450j7 = this.red;
            cyan(c1450j7);
            c1450j7.l0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r21 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void papa(boolean z2, int i4, IOException iOException, byte[] bArr, String str, List list) {
        byte[] bArr2;
        C1450j c1450j;
        long longValue;
        EnumC1472u0 enumC1472u0;
        int i5 = i4;
        ao.ad.crimson(this);
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } finally {
                this.f7550n = false;
                yankee();
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList<Long> arrayList = this.f7554r;
        V5.x.hotel(arrayList);
        this.f7554r = null;
        try {
            if (z2) {
                if (i5 != 200) {
                    if (i5 == 204) {
                        i5 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    crimson().f7634d.delta("Network upload failed. Will retry later. code, error", Integer.valueOf(i5), iOException, str2.substring(0, Math.min(32, str2.length())));
                    aw awVar = this.f7539b.f7535b;
                    pink().getClass();
                    awVar.bravo(System.currentTimeMillis());
                    if (i5 == 503 || i5 == 429) {
                        aw awVar2 = this.f7539b.yellow;
                        pink().getClass();
                        awVar2.bravo(System.currentTimeMillis());
                    }
                    C1450j c1450j2 = this.red;
                    cyan(c1450j2);
                    c1450j2.m0(arrayList);
                    azure();
                    this.f7550n = false;
                    yankee();
                    return;
                }
            }
            if (white().j0(null, ac.f7565F)) {
                if (white().j0(null, ac.f7568I)) {
                    HashMap hashMap = new HashMap();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        enumC1472u0 = EnumC1472u0.SGTM_CLIENT;
                        if (!hasNext) {
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        com.google.android.gms.internal.measurement.B0 b02 = (com.google.android.gms.internal.measurement.B0) pair.first;
                        V0 v0 = (V0) pair.second;
                        if (v0.charlie != enumC1472u0) {
                            C1450j c1450j3 = this.red;
                            cyan(c1450j3);
                            String str3 = v0.alpha;
                            Map map = v0.bravo;
                            if (map == null) {
                                map = Collections.EMPTY_MAP;
                            }
                            EnumC1472u0 enumC1472u02 = v0.charlie;
                            long P02 = c1450j3.P0(str, b02, str3, map, enumC1472u02, null);
                            if (enumC1472u02 == EnumC1472u0.GOOGLE_SIGNAL_PENDING && P02 != -1 && !b02.romeo().isEmpty()) {
                                hashMap.put(b02.romeo(), Long.valueOf(P02));
                            }
                        }
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        com.google.android.gms.internal.measurement.B0 b03 = (com.google.android.gms.internal.measurement.B0) pair2.first;
                        V0 v02 = (V0) pair2.second;
                        if (v02.charlie == enumC1472u0) {
                            Long l10 = (Long) hashMap.get(b03.romeo());
                            C1450j c1450j4 = this.red;
                            cyan(c1450j4);
                            String str4 = v02.alpha;
                            Map map2 = v02.bravo;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            c1450j4.P0(str, b03, str4, map2, v02.charlie, l10);
                            enumC1472u0 = enumC1472u0;
                        }
                    }
                } else {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Pair pair3 = (Pair) it3.next();
                        com.google.android.gms.internal.measurement.B0 b04 = (com.google.android.gms.internal.measurement.B0) pair3.first;
                        V0 v03 = (V0) pair3.second;
                        C1450j c1450j5 = this.red;
                        cyan(c1450j5);
                        String str5 = v03.alpha;
                        Map map3 = v03.bravo;
                        if (map3 == null) {
                            map3 = Collections.EMPTY_MAP;
                        }
                        c1450j5.P0(str, b04, str5, map3, v03.charlie, null);
                    }
                }
            }
            for (Long l11 : arrayList) {
                try {
                    c1450j = this.red;
                    cyan(c1450j);
                    longValue = l11.longValue();
                    c1450j.W();
                    c1450j.X();
                } catch (SQLiteException e) {
                    ArrayList arrayList2 = this.f7555s;
                    if (arrayList2 == null || !arrayList2.contains(l11)) {
                        throw e;
                    }
                }
                try {
                    if (c1450j.S0().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                        break;
                    }
                } catch (SQLiteException e4) {
                    ar arVar = ((G) c1450j.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.white.bravo(e4, "Failed to delete a bundle in a queue table");
                    throw e4;
                    break;
                }
            }
            C1450j c1450j6 = this.red;
            cyan(c1450j6);
            c1450j6.r0();
            C1450j c1450j7 = this.red;
            cyan(c1450j7);
            c1450j7.l0();
            this.f7555s = null;
            boolean j02 = white().j0(null, ac.f7565F);
            au auVar = this.purple;
            if (j02) {
                cyan(auVar);
                if (auVar.v0()) {
                    C1450j c1450j8 = this.red;
                    cyan(c1450j8);
                    if (c1450j8.v0(str)) {
                        olive(str);
                        this.f7544h = 0L;
                        this.f7550n = false;
                        yankee();
                        return;
                    }
                }
            }
            cyan(auVar);
            if (auVar.v0() && black()) {
                navy();
            } else {
                this.f7556t = -1L;
                azure();
            }
            this.f7544h = 0L;
            this.f7550n = false;
            yankee();
            return;
        } catch (Throwable th) {
            C1450j c1450j9 = this.red;
            cyan(c1450j9);
            c1450j9.l0();
            throw th;
        }
        a4.j jVar = crimson().f7636g;
        Integer valueOf = Integer.valueOf(i5);
        jVar.charlie(valueOf, Boolean.valueOf(z2), "Network upload successful with code, uploadAttempted");
        if (z2) {
            try {
                aw awVar3 = this.f7539b.f7534a;
                pink().getClass();
                awVar3.bravo(System.currentTimeMillis());
            } catch (SQLiteException e5) {
                crimson().white.bravo(e5, "Database error while trying to delete uploaded bundles");
                pink().getClass();
                this.f7544h = SystemClock.elapsedRealtime();
                crimson().f7636g.bravo(Long.valueOf(this.f7544h), "Disable upload, time");
            }
        }
        this.f7539b.f7535b.bravo(0L);
        azure();
        if (z2) {
            crimson().f7636g.charlie(valueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
        } else {
            crimson().f7636g.alpha("Purged empty bundles");
        }
        C1450j c1450j10 = this.red;
        cyan(c1450j10);
        c1450j10.h0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:393|(2:395|(3:397|398|(8:400|62|(0)(0)|65|66|(0)(0)|72|73)(9:401|61|62|(0)(0)|65|66|(0)(0)|72|73)))|402|403|404|405|406|407|408|409|398|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(75:(2:75|(3:77|(1:79)|80))|81|(2:83|(3:85|(1:87)|88))(1:362)|89|90|(1:92)|93|(2:97|(1:99))|100|(2:110|111)|114|115|116|117|118|119|120|(1:122)|123|(2:125|(2:129|130)(1:128))(1:358)|131|(1:133)|134|(1:136)(1:357)|137|(1:139)(1:356)|140|(1:142)(1:355)|143|(2:145|146)|147|(1:149)(1:354)|150|(1:154)|155|156|(2:158|(42:160|(1:164)|165|(1:167)(1:352)|168|(1:170)(15:323|(1:325)(1:351)|326|(1:328)(1:350)|329|(1:331)(1:349)|332|(1:334)(1:348)|335|(1:337)(1:347)|338|(1:340)(1:346)|341|(1:343)(1:345)|344)|171|(1:173)|174|(1:176)(1:322)|(1:321)(34:180|(2:181|(3:183|(3:185|186|(2:188|(2:190|192)(1:312))(1:314))(1:318)|313)(2:319|320))|193|(1:195)|(1:198)|199|(1:201)|202|(4:206|(1:208)(1:310)|209|(4:211|(1:213)|214|(3:220|221|(29:223|(1:225)(1:309)|226|(1:228)|229|230|(2:232|(1:234)(2:235|236))|237|(3:239|(1:241)|242)(1:308)|243|(1:247)|248|(1:250)|251|(6:254|(2:256|(5:258|(1:260)(1:267)|261|(2:263|264)(1:266)|265))|268|269|265|252)|270|271|272|273|274|(2:275|(2:277|(1:279)(1:294))(3:295|296|(1:300)))|280|281|282|283|(1:285)(2:290|291)|286|287|288))))|311|230|(0)|237|(0)(0)|243|(2:245|247)|248|(0)|251|(1:252)|270|271|272|273|274|(3:275|(0)(0)|294)|280|281|282|283|(0)(0)|286|287|288)|196|(0)|199|(0)|202|(5:204|206|(0)(0)|209|(0))|311|230|(0)|237|(0)(0)|243|(0)|248|(0)|251|(1:252)|270|271|272|273|274|(3:275|(0)(0)|294)|280|281|282|283|(0)(0)|286|287|288))|353|171|(0)|174|(0)(0)|(1:178)|321|196|(0)|199|(0)|202|(0)|311|230|(0)|237|(0)(0)|243|(0)|248|(0)|251|(1:252)|270|271|272|273|274|(3:275|(0)(0)|294)|280|281|282|283|(0)(0)|286|287|288) */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0c2d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0c34, code lost:
    
        ((com.google.android.gms.measurement.internal.G) r2.alpha).crimson().b0().charlie(com.google.android.gms.measurement.internal.ar.e0(r15.alpha), r0, "Error storing raw event. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0c4c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0c69, code lost:
    
        crimson().b0().charlie(com.google.android.gms.measurement.internal.ar.e0(r3.xray()), r0, "Data loss. Failed to insert raw event metadata. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x02d7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x02dc, code lost:
    
        ((com.google.android.gms.measurement.internal.G) r14.alpha).crimson().b0().charlie(com.google.android.gms.measurement.internal.ar.e0(r15), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x02d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x02da, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x07b7 A[Catch: all -> 0x01cf, TRY_ENTER, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07e5 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x088b A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x089b A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08b2 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x08c1 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08d9 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x09b1 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x09d1 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a3c A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a5a A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a73 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b74 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0c17 A[Catch: all -> 0x01cf, SQLiteException -> 0x0c2d, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x0c2d, blocks: (B:283:0x0c06, B:285:0x0c17), top: B:282:0x0c06, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0b82 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08c6 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07e8 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x035f A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0314 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03cc A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:46:0x01b0, B:49:0x01bd, B:51:0x01c5, B:54:0x01d2, B:62:0x034d, B:66:0x038b, B:68:0x03cc, B:70:0x03d1, B:71:0x03e8, B:75:0x03f3, B:77:0x040d, B:79:0x0413, B:80:0x042a, B:83:0x044b, B:87:0x0472, B:88:0x0489, B:89:0x0494, B:92:0x04b1, B:93:0x04c5, B:95:0x04cd, B:97:0x04d7, B:99:0x04dd, B:100:0x04e4, B:102:0x04f1, B:104:0x04f9, B:106:0x0501, B:108:0x0507, B:111:0x050b, B:114:0x0517, B:116:0x051f, B:118:0x0528, B:122:0x0568, B:123:0x057d, B:125:0x05a6, B:128:0x05ce, B:130:0x061c, B:131:0x0649, B:133:0x0676, B:134:0x0679, B:136:0x067f, B:137:0x0687, B:139:0x068d, B:140:0x0695, B:142:0x069b, B:146:0x06ad, B:147:0x06b0, B:149:0x06bb, B:150:0x06c7, B:152:0x06f3, B:154:0x06f9, B:155:0x06fe, B:158:0x070f, B:160:0x0718, B:164:0x072d, B:168:0x073a, B:173:0x07b7, B:174:0x07ba, B:176:0x07e5, B:178:0x07ee, B:180:0x07f9, B:181:0x0813, B:183:0x0819, B:186:0x0833, B:188:0x083f, B:190:0x084c, B:193:0x0881, B:198:0x088b, B:199:0x088e, B:201:0x089b, B:202:0x089e, B:204:0x08b2, B:206:0x08b6, B:208:0x08c1, B:209:0x08cf, B:211:0x08d9, B:213:0x08e4, B:214:0x08ed, B:216:0x08f7, B:218:0x0903, B:221:0x090f, B:223:0x091b, B:225:0x0931, B:226:0x094b, B:228:0x0957, B:229:0x0960, B:230:0x0970, B:232:0x09b1, B:235:0x09bc, B:236:0x09c6, B:237:0x09c7, B:239:0x09d1, B:241:0x09f1, B:242:0x09fc, B:243:0x0a34, B:245:0x0a3c, B:247:0x0a46, B:248:0x0a50, B:250:0x0a5a, B:251:0x0a64, B:252:0x0a6d, B:254:0x0a73, B:256:0x0abd, B:258:0x0acf, B:261:0x0aee, B:263:0x0afe, B:267:0x0ade, B:271:0x0b11, B:273:0x0b53, B:274:0x0b5e, B:275:0x0b6e, B:277:0x0b74, B:281:0x0bba, B:283:0x0c06, B:285:0x0c17, B:286:0x0c7e, B:291:0x0c31, B:293:0x0c34, B:296:0x0b82, B:298:0x0ba8, B:303:0x0c4f, B:304:0x0c68, B:307:0x0c69, B:310:0x08c6, B:316:0x086d, B:322:0x07e8, B:323:0x0743, B:326:0x0750, B:329:0x075e, B:332:0x076c, B:335:0x077a, B:338:0x0788, B:341:0x0794, B:344:0x07a2, B:358:0x0639, B:361:0x0551, B:363:0x035f, B:364:0x036b, B:366:0x0371, B:373:0x037f, B:376:0x01f0, B:379:0x01fa, B:381:0x020f, B:386:0x0227, B:389:0x0257, B:391:0x025d, B:393:0x026b, B:395:0x027b, B:397:0x0285, B:398:0x030a, B:400:0x0314, B:403:0x02aa, B:405:0x02c3, B:408:0x02c9, B:409:0x02f1, B:412:0x02dc, B:416:0x0233, B:418:0x0251), top: B:45:0x01b0, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void peach(zzbh zzbhVar, zzr zzrVar) {
        boolean z2;
        String str;
        String str2;
        long j5;
        c1 c1Var;
        String str3;
        String str4;
        androidx.core.widget.f fVar;
        long j6;
        long intValue;
        androidx.core.widget.f fVar2;
        long j7;
        androidx.core.widget.f fVar3;
        C1458n c1458n;
        C1460o bravo;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        long j10;
        long j11;
        com.google.android.gms.internal.measurement.X0 alpha;
        Map bravo2;
        String str10;
        ArrayList arrayList;
        V foxtrot;
        String str11;
        C1458n c1458n2;
        U u4;
        ao T02;
        int i4;
        List e02;
        int i5;
        C1450j yellow;
        com.google.android.gms.internal.measurement.D0 d02;
        C1450j yellow2;
        Iterator<String> it;
        ContentValues contentValues;
        String str12;
        long w02;
        Pair pair;
        ao T03;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object obj;
        c1 c12;
        V5.x.hotel(zzrVar);
        long j12 = zzrVar.f7706k;
        String str13 = zzrVar.f7709n;
        long j13 = zzrVar.teal;
        String str14 = zzrVar.f7711p;
        String str15 = zzrVar.red;
        String str16 = zzrVar.silver;
        String str17 = zzrVar.alpha;
        V5.x.echo(str17);
        long nanoTime = System.nanoTime();
        u().W();
        foxtrot();
        alpha();
        String str18 = zzrVar.purple;
        boolean isEmpty = TextUtils.isEmpty(str18);
        String str19 = zzrVar.f7704i;
        if (isEmpty && TextUtils.isEmpty(str19)) {
            return;
        }
        boolean z18 = zzrVar.f7697a;
        if (!z18) {
            silver(zzrVar);
            return;
        }
        A d4 = d();
        String str20 = zzbhVar.alpha;
        boolean p02 = d4.p0(str17, str20);
        G g2 = this.e;
        androidx.core.widget.f fVar4 = this.C;
        if (p02) {
            crimson().d0().charlie(ar.e0(str17), g2.kilo().delta(str20), "Dropping blocked event. appId");
            if (!"1".equals(d().d(str17, "measurement.upload.blacklist_internal")) && !"1".equals(d().d(str17, "measurement.upload.blacklist_public"))) {
                if (!"_err".equals(str20)) {
                    bravo();
                    d1.q0(fVar4, str17, 11, "_ev", str20, 0);
                    return;
                }
                return;
            }
            ao T04 = yellow().T0(str17);
            if (T04 != null) {
                G g5 = T04.alpha;
                E e = g5.f7508c;
                G.foxtrot(e);
                e.W();
                long j14 = T04.magenta;
                E e4 = g5.f7508c;
                G.foxtrot(e4);
                e4.W();
                long abs = Math.abs(pink().alpha() - Math.max(j14, T04.lime));
                white();
                if (abs > ((Long) ac.green.alpha(null)).longValue()) {
                    crimson().a0().alpha("Fetching config for blocked app");
                    hotel(T04);
                    return;
                }
                return;
            }
            return;
        }
        Nb.i echo = Nb.i.echo(zzbhVar);
        d1 bravo3 = bravo();
        C1440e white = white();
        white.getClass();
        bravo3.p0(echo, Math.max(Math.min(white.c0(str17, ac.olive), 100), 25));
        int max = Math.max(Math.min(white().c0(str17, ac.white), 35), 10);
        Bundle bundle = (Bundle) echo.teal;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            String str21 = (String) it2.next();
            if ("items".equals(str21)) {
                bravo().o0(bundle.getParcelableArray(str21), max);
            }
        }
        zzbh delta = echo.delta();
        String str22 = delta.alpha;
        if (Log.isLoggable(crimson().h0(), 2)) {
            crimson().c0().bravo(g2.kilo().charlie(delta), "Logging event");
        }
        yellow().h0();
        try {
            silver(zzrVar);
            if ("ecommerce_purchase".equals(str22) || "purchase".equals(str22) || "refund".equals(str22)) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean equals = "_iap".equals(str22);
            zzbf zzbfVar = delta.purple;
            if (!equals) {
                if (z2) {
                    z2 = true;
                } else {
                    str = str15;
                    str2 = str16;
                    str4 = str18;
                    fVar = fVar4;
                    boolean R02 = d1.R0(str22);
                    boolean equals2 = "_err".equals(str22);
                    bravo();
                    if (zzbfVar != null) {
                        j6 = 0;
                    } else {
                        Iterator<String> it3 = zzbfVar.alpha.keySet().iterator();
                        j6 = 0;
                        while (it3.hasNext()) {
                            if (zzbfVar.F(it3.next()) instanceof Parcelable[]) {
                                j6 += ((Parcelable[]) r6).length;
                            }
                        }
                    }
                    String str23 = str17;
                    C1444g X02 = yellow().X0(quebec(), str23, j6 + 1, true, R02, false, equals2, false, false, false);
                    long j15 = X02.bravo;
                    white();
                    androidx.core.widget.f fVar5 = fVar;
                    intValue = j15 - ((Integer) ac.lima.alpha(null)).intValue();
                    if (intValue <= 0) {
                        if (intValue % 1000 == 1) {
                            crimson().b0().charlie(ar.e0(str23), Long.valueOf(X02.bravo), "Data loss. Too many events logged. appId, count");
                        }
                        yellow().r0();
                    } else {
                        if (R02) {
                            long j16 = X02.alpha;
                            white();
                            long intValue2 = j16 - ((Integer) ac.november.alpha(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    crimson().b0().charlie(ar.e0(str23), Long.valueOf(X02.alpha), "Data loss. Too many public events logged. appId, count");
                                }
                                bravo();
                                d1.q0(fVar5, str23, 16, "_ev", delta.alpha, 0);
                                yellow().r0();
                            }
                        }
                        String str24 = zzrVar.alpha;
                        if (equals2) {
                            fVar2 = fVar5;
                            long max2 = X02.delta - Math.max(0, Math.min(1000000, white().c0(str24, ac.mike)));
                            if (max2 > 0) {
                                if (max2 == 1) {
                                    crimson().b0().charlie(ar.e0(str23), Long.valueOf(X02.delta), "Too many error events logged. appId, count");
                                }
                                yellow().r0();
                            }
                        } else {
                            fVar2 = fVar5;
                        }
                        Bundle o5 = zzbfVar.o();
                        d1 bravo4 = bravo();
                        String str25 = delta.red;
                        bravo4.r0(o5, "_o", str25);
                        if (bravo().M0(str23, zzrVar.f7718w)) {
                            bravo().r0(o5, "_dbg", 1L);
                            bravo().r0(o5, "_r", 1L);
                        }
                        if ("_s".equals(str22) && (c12 = yellow().c1(str24, "_sno")) != null) {
                            Object obj2 = c12.echo;
                            if (obj2 instanceof Long) {
                                bravo().r0(o5, "_sno", obj2);
                            }
                        }
                        if (white().j0(null, ac.f7584Z) && Objects.equals(str25, "am") && str22.equals("_ai") && (obj = o5.get("value")) != null && (obj instanceof String)) {
                            try {
                                double parseDouble = Double.parseDouble((String) obj);
                                o5.remove("value");
                                o5.putDouble("value", parseDouble);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        C1450j yellow3 = yellow();
                        G g10 = (G) yellow3.alpha;
                        V5.x.echo(str23);
                        yellow3.W();
                        yellow3.X();
                        try {
                            j7 = yellow3.S0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str23, String.valueOf(Math.max(0, Math.min(1000000, g10.yellow.c0(str23, ac.quebec))))});
                        } catch (SQLiteException e5) {
                            g10.crimson().b0().charlie(ar.e0(str23), e5, "Error deleting over the limit events. appId");
                            j7 = 0;
                        }
                        if (j7 > 0) {
                            crimson().d0().charlie(ar.e0(str23), Long.valueOf(j7), "Data lost. Too many events stored on disk, deleted. appId");
                        }
                        G g11 = this.e;
                        C1458n c1458n3 = new C1458n(g11, delta.red, str23, delta.alpha, delta.silver, 0L, o5);
                        C1450j yellow4 = yellow();
                        String str26 = c1458n3.bravo;
                        C1460o y02 = yellow4.y0("events", str23, str26);
                        if (y02 == null) {
                            long R03 = yellow().R0(str23);
                            white().getClass();
                            ab abVar = ac.ochre;
                            if (R03 >= Math.max(Math.min(r6.c0(str23, abVar), 2000), HttpConstants.HTTP_INTERNAL_ERROR) && R02) {
                                a4.j b02 = crimson().b0();
                                aq e03 = ar.e0(str23);
                                String delta2 = g11.kilo().delta(str26);
                                C1440e white2 = white();
                                white2.getClass();
                                b02.delta("Too many event names used, ignoring event. appId, name, supported count", e03, delta2, Integer.valueOf(Math.max(Math.min(white2.c0(str23, abVar), 2000), HttpConstants.HTTP_INTERNAL_ERROR)));
                                bravo();
                                d1.q0(fVar2, str23, 8, null, null, 0);
                            } else {
                                fVar3 = fVar2;
                                bravo = new C1460o(str23, str26, 0L, 0L, 0L, c1458n3.delta, 0L, null, null, null, null);
                                c1458n = c1458n3;
                            }
                        } else {
                            fVar3 = fVar2;
                            C1458n alpha2 = c1458n3.alpha(g11, y02.foxtrot);
                            c1458n = alpha2;
                            bravo = y02.bravo(alpha2.delta);
                        }
                        yellow().D0("events", bravo);
                        u().W();
                        foxtrot();
                        String str27 = c1458n.alpha;
                        V5.x.echo(str27);
                        V5.x.bravo(str27.equals(str24));
                        com.google.android.gms.internal.measurement.C0 c13 = com.google.android.gms.internal.measurement.D0.c1();
                        c13.fuchsia();
                        c13.crimson();
                        if (!TextUtils.isEmpty(str24)) {
                            c13.lima(str24);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            str5 = str2;
                            c13.november(str5);
                        } else {
                            str5 = str2;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            str6 = str;
                            c13.oscar(str6);
                        } else {
                            str6 = str;
                        }
                        if (!TextUtils.isEmpty(str14)) {
                            str7 = str14;
                            c13.gray(str7);
                        } else {
                            str7 = str14;
                        }
                        long j17 = zzrVar.f7699c;
                        if (j17 != -2147483648L) {
                            c13.papa((int) j17);
                        }
                        c13.blue(j13);
                        if (!TextUtils.isEmpty(str4)) {
                            str8 = "raw_events";
                            str9 = str4;
                            c13.black(str9);
                        } else {
                            str8 = "raw_events";
                            str9 = str4;
                        }
                        V5.x.hotel(str24);
                        String str28 = str7;
                        V foxtrot2 = e(str24).foxtrot(V.echo(100, str13));
                        c13.sierra(foxtrot2.india());
                        if (((com.google.android.gms.internal.measurement.D0) c13.purple).azure().isEmpty() && !TextUtils.isEmpty(str19)) {
                            c13.kilo(str19);
                        }
                        C1317f3.bravo();
                        boolean j02 = white().j0(str24, ac.f7574O);
                        U u10 = U.AD_STORAGE;
                        try {
                            if (j02) {
                                bravo();
                                if (d1.E0(str24)) {
                                    c13.juliet(zzrVar.f7716u);
                                    j10 = j17;
                                    long j18 = zzrVar.f7717v;
                                    if (!foxtrot2.kilo(u10) && j18 != 0) {
                                        j18 = (j18 & (-2)) | 32;
                                    }
                                    if (j18 == 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    c13.zulu(z10);
                                    if (j18 != 0) {
                                        C1356o0 november = C1360p0.november();
                                        if ((j18 & 1) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        november.juliet(z11);
                                        if ((j18 & 2) != 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        november.lima(z12);
                                        if ((j18 & 4) != 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        november.mike(z13);
                                        if ((j18 & 8) != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        november.november(z14);
                                        if ((j18 & 16) != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        november.india(z15);
                                        if ((j18 & 32) != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        november.hotel(z16);
                                        if ((j18 & 64) != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        november.kilo(z17);
                                        c13.quebec((C1360p0) november.echo());
                                    }
                                    j11 = zzrVar.white;
                                    if (j11 != 0) {
                                        c13.tango(j11);
                                    }
                                    c13.victor(j12);
                                    au alpha3 = alpha();
                                    String str29 = str5;
                                    alpha = com.google.android.gms.internal.measurement.X0.alpha(alpha3.purple.e.green().getContentResolver(), AbstractC1305d1.alpha(), new K1.n(1));
                                    if (alpha != null) {
                                        bravo2 = Collections.EMPTY_MAP;
                                    } else {
                                        bravo2 = alpha.bravo();
                                    }
                                    if (bravo2 != null || bravo2.isEmpty()) {
                                        str10 = str6;
                                    } else {
                                        arrayList = new ArrayList();
                                        int intValue3 = ((Integer) ac.teal.alpha(null)).intValue();
                                        Iterator it4 = bravo2.entrySet().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it4.next();
                                                Iterator it5 = it4;
                                                str10 = str6;
                                                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                                    try {
                                                        int parseInt = Integer.parseInt((String) entry.getValue());
                                                        if (parseInt != 0) {
                                                            arrayList.add(Integer.valueOf(parseInt));
                                                            if (arrayList.size() >= intValue3) {
                                                                ((G) alpha3.alpha).crimson().d0().bravo(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                                break;
                                                            }
                                                            continue;
                                                        } else {
                                                            continue;
                                                        }
                                                    } catch (NumberFormatException e10) {
                                                        ((G) alpha3.alpha).crimson().d0().bravo(e10, "Experiment ID NumberFormatException");
                                                    }
                                                }
                                                it4 = it5;
                                                str6 = str10;
                                            } else {
                                                str10 = str6;
                                                break;
                                            }
                                        }
                                        if (arrayList.isEmpty()) {
                                        }
                                        if (arrayList != null) {
                                            c13.lavender(arrayList);
                                        }
                                        if (white().j0(null, ac.f7592d0)) {
                                            c13.azure();
                                        }
                                        foxtrot = e(str24).foxtrot(V.echo(100, str13));
                                        if (foxtrot.kilo(u10) && zzrVar.f7702g) {
                                            J0 j03 = this.f7539b;
                                            j03.getClass();
                                            if (!foxtrot.kilo(u10)) {
                                                pair = j03.a0(str24);
                                            } else {
                                                pair = new Pair("", Boolean.FALSE);
                                            }
                                            if (!TextUtils.isEmpty((CharSequence) pair.first)) {
                                                c13.gold((String) pair.first);
                                                Object obj3 = pair.second;
                                                if (obj3 != null) {
                                                    c13.coral(((Boolean) obj3).booleanValue());
                                                }
                                                if (!c1458n.bravo.equals("_fx") && !((String) pair.first).equals("00000000-0000-0000-0000-000000000000") && (T03 = yellow().T0(str24)) != null) {
                                                    G g12 = T03.alpha;
                                                    E e11 = g12.f7508c;
                                                    G.foxtrot(e11);
                                                    e11.W();
                                                    if (T03.zulu) {
                                                        magenta(str24, false, null, null);
                                                        Bundle bundle2 = new Bundle();
                                                        E e12 = g12.f7508c;
                                                        G.foxtrot(e12);
                                                        e12.W();
                                                        Long l10 = T03.amber;
                                                        if (l10 != null) {
                                                            u4 = u10;
                                                            str11 = str9;
                                                            c1458n2 = c1458n;
                                                            bundle2.putLong("_pfo", Math.max(0L, l10.longValue()));
                                                        } else {
                                                            str11 = str9;
                                                            c1458n2 = c1458n;
                                                            u4 = u10;
                                                        }
                                                        E e13 = g12.f7508c;
                                                        G.foxtrot(e13);
                                                        e13.W();
                                                        Long l11 = T03.azure;
                                                        if (l11 != null) {
                                                            bundle2.putLong("_uwa", l11.longValue());
                                                        }
                                                        bundle2.putLong("_r", 1L);
                                                        fVar3.bronze(str24, "_fx", bundle2);
                                                        g2.hotel().Y();
                                                        String str30 = Build.MODEL;
                                                        c13.uniform();
                                                        g2.hotel().Y();
                                                        String str31 = Build.VERSION.RELEASE;
                                                        c13.golf();
                                                        com.google.android.gms.internal.measurement.D0.g0((com.google.android.gms.internal.measurement.D0) c13.purple, str31);
                                                        c13.indigo((int) g2.hotel().a0());
                                                        c13.whiskey(g2.hotel().b0());
                                                        c13.green(zzrVar.f7713r);
                                                        if (g2.alpha()) {
                                                            c13.xray();
                                                            if (!TextUtils.isEmpty(null)) {
                                                                c13.golf();
                                                                com.google.android.gms.internal.measurement.D0.plum((com.google.android.gms.internal.measurement.D0) c13.purple, null);
                                                                throw null;
                                                            }
                                                        }
                                                        T02 = yellow().T0(str24);
                                                        if (T02 != null) {
                                                            T02 = new ao(g2, str24);
                                                            T02.lima(charlie(foxtrot));
                                                            T02.coral(zzrVar.f7700d);
                                                            T02.crimson(str11);
                                                            if (foxtrot.kilo(u4)) {
                                                                T02.ivory(this.f7539b.b0(str24, zzrVar.f7702g));
                                                            }
                                                            T02.gray(0L);
                                                            T02.green(0L);
                                                            T02.gold(0L);
                                                            T02.november(str10);
                                                            T02.oscar(j10);
                                                            T02.mike(str29);
                                                            T02.cyan(j13);
                                                            T02.beige(j11);
                                                            T02.indigo(z18);
                                                            T02.blue(j12);
                                                            i4 = 0;
                                                            yellow().s0(T02, false);
                                                        } else {
                                                            i4 = 0;
                                                        }
                                                        if (foxtrot.kilo(U.ANALYTICS_STORAGE) && !TextUtils.isEmpty(T02.delta())) {
                                                            String delta3 = T02.delta();
                                                            V5.x.hotel(delta3);
                                                            c13.mike(delta3);
                                                        }
                                                        if (!TextUtils.isEmpty(T02.foxtrot())) {
                                                            String foxtrot3 = T02.foxtrot();
                                                            V5.x.hotel(foxtrot3);
                                                            c13.beige(foxtrot3);
                                                        }
                                                        e02 = yellow().e0(str24);
                                                        i5 = i4;
                                                        while (i5 < e02.size()) {
                                                            com.google.android.gms.internal.measurement.L0 romeo = com.google.android.gms.internal.measurement.M0.romeo();
                                                            String str32 = ((c1) e02.get(i5)).charlie;
                                                            romeo.golf();
                                                            com.google.android.gms.internal.measurement.M0.zulu((com.google.android.gms.internal.measurement.M0) romeo.purple, str32);
                                                            long j19 = ((c1) e02.get(i5)).delta;
                                                            romeo.golf();
                                                            com.google.android.gms.internal.measurement.M0.amber((com.google.android.gms.internal.measurement.M0) romeo.purple, j19);
                                                            alpha().J0(romeo, ((c1) e02.get(i5)).echo);
                                                            c13.magenta(romeo);
                                                            if ("_sid".equals(((c1) e02.get(i5)).charlie)) {
                                                                E e14 = T02.alpha.f7508c;
                                                                G.foxtrot(e14);
                                                                e14.W();
                                                                if (T02.xray != 0) {
                                                                    au alpha4 = alpha();
                                                                    if (TextUtils.isEmpty(str28)) {
                                                                        str12 = str28;
                                                                        w02 = 0;
                                                                    } else {
                                                                        str12 = str28;
                                                                        w02 = alpha4.w0(str12.getBytes(Charset.forName("UTF-8")));
                                                                    }
                                                                    E e15 = T02.alpha.f7508c;
                                                                    G.foxtrot(e15);
                                                                    e15.W();
                                                                    if (w02 != T02.xray) {
                                                                        c13.golf();
                                                                        com.google.android.gms.internal.measurement.D0.u((com.google.android.gms.internal.measurement.D0) c13.purple);
                                                                    }
                                                                    i5++;
                                                                    str28 = str12;
                                                                }
                                                            }
                                                            str12 = str28;
                                                            i5++;
                                                            str28 = str12;
                                                        }
                                                        yellow = yellow();
                                                        d02 = (com.google.android.gms.internal.measurement.D0) c13.echo();
                                                        yellow.W();
                                                        yellow.X();
                                                        V5.x.echo(d02.romeo());
                                                        byte[] charlie = d02.charlie();
                                                        long w03 = yellow.purple.alpha().w0(charlie);
                                                        ContentValues contentValues2 = new ContentValues();
                                                        contentValues2.put("app_id", d02.romeo());
                                                        contentValues2.put("metadata_fingerprint", Long.valueOf(w03));
                                                        contentValues2.put("metadata", charlie);
                                                        yellow.S0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                        yellow2 = yellow();
                                                        it = c1458n2.foxtrot.alpha.keySet().iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                if ("_r".equals(it.next())) {
                                                                    break;
                                                                }
                                                            } else {
                                                                A d9 = d();
                                                                String str33 = c1458n2.alpha;
                                                                boolean o02 = d9.o0(str33, c1458n2.bravo);
                                                                C1444g W02 = yellow().W0(quebec(), str33, false, false, false, false);
                                                                if (o02 && W02.echo < white().c0(str33, ac.papa)) {
                                                                }
                                                            }
                                                        }
                                                        i4 = 1;
                                                        yellow2.W();
                                                        yellow2.X();
                                                        String str34 = c1458n2.alpha;
                                                        V5.x.echo(str34);
                                                        byte[] charlie2 = yellow2.purple.alpha().B0(c1458n2).charlie();
                                                        contentValues = new ContentValues();
                                                        contentValues.put("app_id", str34);
                                                        contentValues.put("name", c1458n2.bravo);
                                                        contentValues.put("timestamp", Long.valueOf(c1458n2.delta));
                                                        contentValues.put("metadata_fingerprint", Long.valueOf(w03));
                                                        contentValues.put(Column.DATA, charlie2);
                                                        contentValues.put("realtime", Integer.valueOf(i4));
                                                        if (yellow2.S0().insert(str8, null, contentValues) != -1) {
                                                            ((G) yellow2.alpha).crimson().b0().bravo(ar.e0(str34), "Failed to insert raw event (got -1). appId");
                                                        } else {
                                                            this.f7544h = 0L;
                                                        }
                                                        yellow().r0();
                                                        yellow().l0();
                                                        azure();
                                                        crimson().c0().bravo(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                        str11 = str9;
                                        c1458n2 = c1458n;
                                        u4 = u10;
                                        g2.hotel().Y();
                                        String str302 = Build.MODEL;
                                        c13.uniform();
                                        g2.hotel().Y();
                                        String str312 = Build.VERSION.RELEASE;
                                        c13.golf();
                                        com.google.android.gms.internal.measurement.D0.g0((com.google.android.gms.internal.measurement.D0) c13.purple, str312);
                                        c13.indigo((int) g2.hotel().a0());
                                        c13.whiskey(g2.hotel().b0());
                                        c13.green(zzrVar.f7713r);
                                        if (g2.alpha()) {
                                        }
                                        T02 = yellow().T0(str24);
                                        if (T02 != null) {
                                        }
                                        if (foxtrot.kilo(U.ANALYTICS_STORAGE)) {
                                            String delta32 = T02.delta();
                                            V5.x.hotel(delta32);
                                            c13.mike(delta32);
                                        }
                                        if (!TextUtils.isEmpty(T02.foxtrot())) {
                                        }
                                        e02 = yellow().e0(str24);
                                        i5 = i4;
                                        while (i5 < e02.size()) {
                                        }
                                        yellow = yellow();
                                        d02 = (com.google.android.gms.internal.measurement.D0) c13.echo();
                                        yellow.W();
                                        yellow.X();
                                        V5.x.echo(d02.romeo());
                                        byte[] charlie3 = d02.charlie();
                                        long w032 = yellow.purple.alpha().w0(charlie3);
                                        ContentValues contentValues22 = new ContentValues();
                                        contentValues22.put("app_id", d02.romeo());
                                        contentValues22.put("metadata_fingerprint", Long.valueOf(w032));
                                        contentValues22.put("metadata", charlie3);
                                        yellow.S0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                        yellow2 = yellow();
                                        it = c1458n2.foxtrot.alpha.keySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                            }
                                        }
                                        i4 = 1;
                                        yellow2.W();
                                        yellow2.X();
                                        String str342 = c1458n2.alpha;
                                        V5.x.echo(str342);
                                        byte[] charlie22 = yellow2.purple.alpha().B0(c1458n2).charlie();
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str342);
                                        contentValues.put("name", c1458n2.bravo);
                                        contentValues.put("timestamp", Long.valueOf(c1458n2.delta));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(w032));
                                        contentValues.put(Column.DATA, charlie22);
                                        contentValues.put("realtime", Integer.valueOf(i4));
                                        if (yellow2.S0().insert(str8, null, contentValues) != -1) {
                                        }
                                        yellow().r0();
                                        yellow().l0();
                                        azure();
                                        crimson().c0().bravo(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                        return;
                                    }
                                    arrayList = null;
                                    if (arrayList != null) {
                                    }
                                    if (white().j0(null, ac.f7592d0)) {
                                    }
                                    foxtrot = e(str24).foxtrot(V.echo(100, str13));
                                    if (foxtrot.kilo(u10)) {
                                        J0 j032 = this.f7539b;
                                        j032.getClass();
                                        if (!foxtrot.kilo(u10)) {
                                        }
                                        if (!TextUtils.isEmpty((CharSequence) pair.first)) {
                                        }
                                    }
                                    str11 = str9;
                                    c1458n2 = c1458n;
                                    u4 = u10;
                                    g2.hotel().Y();
                                    String str3022 = Build.MODEL;
                                    c13.uniform();
                                    g2.hotel().Y();
                                    String str3122 = Build.VERSION.RELEASE;
                                    c13.golf();
                                    com.google.android.gms.internal.measurement.D0.g0((com.google.android.gms.internal.measurement.D0) c13.purple, str3122);
                                    c13.indigo((int) g2.hotel().a0());
                                    c13.whiskey(g2.hotel().b0());
                                    c13.green(zzrVar.f7713r);
                                    if (g2.alpha()) {
                                    }
                                    T02 = yellow().T0(str24);
                                    if (T02 != null) {
                                    }
                                    if (foxtrot.kilo(U.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(T02.foxtrot())) {
                                    }
                                    e02 = yellow().e0(str24);
                                    i5 = i4;
                                    while (i5 < e02.size()) {
                                    }
                                    yellow = yellow();
                                    d02 = (com.google.android.gms.internal.measurement.D0) c13.echo();
                                    yellow.W();
                                    yellow.X();
                                    V5.x.echo(d02.romeo());
                                    byte[] charlie32 = d02.charlie();
                                    long w0322 = yellow.purple.alpha().w0(charlie32);
                                    ContentValues contentValues222 = new ContentValues();
                                    contentValues222.put("app_id", d02.romeo());
                                    contentValues222.put("metadata_fingerprint", Long.valueOf(w0322));
                                    contentValues222.put("metadata", charlie32);
                                    yellow.S0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                    yellow2 = yellow();
                                    it = c1458n2.foxtrot.alpha.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                    }
                                    i4 = 1;
                                    yellow2.W();
                                    yellow2.X();
                                    String str3422 = c1458n2.alpha;
                                    V5.x.echo(str3422);
                                    byte[] charlie222 = yellow2.purple.alpha().B0(c1458n2).charlie();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str3422);
                                    contentValues.put("name", c1458n2.bravo);
                                    contentValues.put("timestamp", Long.valueOf(c1458n2.delta));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(w0322));
                                    contentValues.put(Column.DATA, charlie222);
                                    contentValues.put("realtime", Integer.valueOf(i4));
                                    if (yellow2.S0().insert(str8, null, contentValues) != -1) {
                                    }
                                    yellow().r0();
                                    yellow().l0();
                                    azure();
                                    crimson().c0().bravo(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            yellow.S0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                            yellow2 = yellow();
                            it = c1458n2.foxtrot.alpha.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            i4 = 1;
                            yellow2.W();
                            yellow2.X();
                            String str34222 = c1458n2.alpha;
                            V5.x.echo(str34222);
                            byte[] charlie2222 = yellow2.purple.alpha().B0(c1458n2).charlie();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str34222);
                            contentValues.put("name", c1458n2.bravo);
                            contentValues.put("timestamp", Long.valueOf(c1458n2.delta));
                            contentValues.put("metadata_fingerprint", Long.valueOf(w0322));
                            contentValues.put(Column.DATA, charlie2222);
                            contentValues.put("realtime", Integer.valueOf(i4));
                            if (yellow2.S0().insert(str8, null, contentValues) != -1) {
                            }
                            yellow().r0();
                            yellow().l0();
                            azure();
                            crimson().c0().bravo(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e16) {
                            ((G) yellow.alpha).crimson().b0().charlie(ar.e0(d02.romeo()), e16, "Error storing raw event metadata. appId");
                            throw e16;
                        }
                        j10 = j17;
                        j11 = zzrVar.white;
                        if (j11 != 0) {
                        }
                        c13.victor(j12);
                        au alpha32 = alpha();
                        String str292 = str5;
                        alpha = com.google.android.gms.internal.measurement.X0.alpha(alpha32.purple.e.green().getContentResolver(), AbstractC1305d1.alpha(), new K1.n(1));
                        if (alpha != null) {
                        }
                        if (bravo2 != null) {
                        }
                        str10 = str6;
                        arrayList = null;
                        if (arrayList != null) {
                        }
                        if (white().j0(null, ac.f7592d0)) {
                        }
                        foxtrot = e(str24).foxtrot(V.echo(100, str13));
                        if (foxtrot.kilo(u10)) {
                        }
                        str11 = str9;
                        c1458n2 = c1458n;
                        u4 = u10;
                        g2.hotel().Y();
                        String str30222 = Build.MODEL;
                        c13.uniform();
                        g2.hotel().Y();
                        String str31222 = Build.VERSION.RELEASE;
                        c13.golf();
                        com.google.android.gms.internal.measurement.D0.g0((com.google.android.gms.internal.measurement.D0) c13.purple, str31222);
                        c13.indigo((int) g2.hotel().a0());
                        c13.whiskey(g2.hotel().b0());
                        c13.green(zzrVar.f7713r);
                        if (g2.alpha()) {
                        }
                        T02 = yellow().T0(str24);
                        if (T02 != null) {
                        }
                        if (foxtrot.kilo(U.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(T02.foxtrot())) {
                        }
                        e02 = yellow().e0(str24);
                        i5 = i4;
                        while (i5 < e02.size()) {
                        }
                        yellow = yellow();
                        d02 = (com.google.android.gms.internal.measurement.D0) c13.echo();
                        yellow.W();
                        yellow.X();
                        V5.x.echo(d02.romeo());
                        byte[] charlie322 = d02.charlie();
                        long w03222 = yellow.purple.alpha().w0(charlie322);
                        ContentValues contentValues2222 = new ContentValues();
                        contentValues2222.put("app_id", d02.romeo());
                        contentValues2222.put("metadata_fingerprint", Long.valueOf(w03222));
                        contentValues2222.put("metadata", charlie322);
                    }
                    yellow().l0();
                }
            }
            String G9 = zzbfVar.G();
            str = str15;
            Bundle bundle3 = zzbfVar.alpha;
            if (z2) {
                double doubleValue = zzbfVar.E().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    str2 = str16;
                    doubleValue = bundle3.getLong("value") * 1000000.0d;
                } else {
                    str2 = str16;
                }
                if (doubleValue <= 9.223372036854776E18d && doubleValue >= -9.223372036854776E18d) {
                    j5 = Math.round(doubleValue);
                    if ("refund".equals(str22)) {
                        j5 = -j5;
                    }
                } else {
                    crimson().d0().charlie(ar.e0(str17), Double.valueOf(doubleValue), "Data lost. Currency value is too big. appId");
                    yellow().r0();
                    yellow().l0();
                }
            } else {
                str2 = str16;
                j5 = bundle3.getLong("value");
            }
            if (!TextUtils.isEmpty(G9)) {
                String upperCase = G9.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    c1 c14 = yellow().c1(str17, concat);
                    if (c14 != null) {
                        Object obj4 = c14.echo;
                        if (obj4 instanceof Long) {
                            long longValue = ((Long) obj4).longValue();
                            String str35 = delta.red;
                            long alpha5 = pink().alpha();
                            Long valueOf = Long.valueOf(longValue + j5);
                            str3 = str18;
                            c1Var = new c1(str17, str35, concat, alpha5, valueOf);
                            if (!yellow().K0(c1Var)) {
                                str4 = str3;
                                crimson().b0().delta("Too many unique user properties are set. Ignoring user property. appId", ar.e0(str17), g2.kilo().foxtrot(c1Var.charlie), c1Var.echo);
                                bravo();
                                str17 = str17;
                                d1.q0(fVar4, str17, 9, null, null, 0);
                                fVar = fVar4;
                                boolean R022 = d1.R0(str22);
                                boolean equals22 = "_err".equals(str22);
                                bravo();
                                if (zzbfVar != null) {
                                }
                                String str232 = str17;
                                C1444g X022 = yellow().X0(quebec(), str232, j6 + 1, true, R022, false, equals22, false, false, false);
                                long j152 = X022.bravo;
                                white();
                                androidx.core.widget.f fVar52 = fVar;
                                intValue = j152 - ((Integer) ac.lima.alpha(null)).intValue();
                                if (intValue <= 0) {
                                }
                                yellow().l0();
                            }
                            str4 = str3;
                            fVar = fVar4;
                            boolean R0222 = d1.R0(str22);
                            boolean equals222 = "_err".equals(str22);
                            bravo();
                            if (zzbfVar != null) {
                            }
                            String str2322 = str17;
                            C1444g X0222 = yellow().X0(quebec(), str2322, j6 + 1, true, R0222, false, equals222, false, false, false);
                            long j1522 = X0222.bravo;
                            white();
                            androidx.core.widget.f fVar522 = fVar;
                            intValue = j1522 - ((Integer) ac.lima.alpha(null)).intValue();
                            if (intValue <= 0) {
                            }
                            yellow().l0();
                        }
                    }
                    C1450j yellow5 = yellow();
                    int c02 = white().c0(str17, ac.magenta) - 1;
                    V5.x.echo(str17);
                    yellow5.W();
                    yellow5.X();
                    long j20 = j5;
                    yellow5.S0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str17, str17, String.valueOf(c02)});
                    str3 = str18;
                    c1Var = new c1(str17, delta.red, concat, pink().alpha(), Long.valueOf(j20));
                    if (!yellow().K0(c1Var)) {
                    }
                }
            }
            str4 = str18;
            fVar = fVar4;
            boolean R02222 = d1.R0(str22);
            boolean equals2222 = "_err".equals(str22);
            bravo();
            if (zzbfVar != null) {
            }
            String str23222 = str17;
            C1444g X02222 = yellow().X0(quebec(), str23222, j6 + 1, true, R02222, false, equals2222, false, false, false);
            long j15222 = X02222.bravo;
            white();
            androidx.core.widget.f fVar5222 = fVar;
            intValue = j15222 - ((Integer) ac.lima.alpha(null)).intValue();
            if (intValue <= 0) {
            }
            yellow().l0();
        } catch (Throwable th) {
            yellow().l0();
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final C1629a pink() {
        G g2 = this.e;
        V5.x.hotel(g2);
        return g2.f7511g;
    }

    public final boolean plum(String str, String str2) {
        C1450j c1450j = this.red;
        cyan(c1450j);
        ao T02 = c1450j.T0(str);
        HashMap hashMap = this.f7560x;
        if (T02 != null && bravo().M0(str, T02.india())) {
            hashMap.remove(str2);
            return true;
        }
        Y0 y02 = (Y0) hashMap.get(str2);
        if (y02 != null) {
            y02.alpha.pink().getClass();
            if (System.currentTimeMillis() < y02.charlie) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle purple(String str) {
        String str2;
        int i4;
        String str3;
        ao.ad.crimson(this);
        A a6 = this.alpha;
        cyan(a6);
        if (a6.k0(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        V e = e(str);
        Bundle bundle2 = new Bundle();
        Iterator it = e.alpha.entrySet().iterator();
        while (true) {
            str2 = "denied";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((S) entry.getValue()).ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    str2 = "granted";
                } else {
                    str2 = null;
                }
            }
            if (str2 != null) {
                bundle2.putString(((U) entry.getKey()).alpha, str2);
            }
        }
        bundle.putAll(bundle2);
        C1454l a8 = a(str, b(str), e, new av.ah(18));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : a8.echo.entrySet()) {
            int ordinal2 = ((S) entry2.getValue()).ordinal();
            if (ordinal2 == 2) {
                str3 = "denied";
            } else if (ordinal2 == 3) {
                str3 = "granted";
            } else {
                str3 = null;
            }
            if (str3 != null) {
                bundle3.putString(((U) entry2.getKey()).alpha, str3);
            }
        }
        Boolean bool = a8.charlie;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = a8.delta;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1 c12 = c1450j.c1(str, "_npa");
        if (c12 != null) {
            i4 = c12.echo.equals(1L);
        } else {
            i4 = tango(new av.ah(18), str);
        }
        if (1 != i4) {
            str2 = "granted";
        }
        bundle.putString("ad_personalization", str2);
        return bundle;
    }

    public final long quebec() {
        pink().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        J0 j02 = this.f7539b;
        j02.X();
        j02.W();
        aw awVar = j02.f7536c;
        long alpha = awVar.alpha();
        if (alpha == 0) {
            G.delta(((G) j02.alpha).e);
            alpha = r2.i0().nextInt(86400000) + 1;
            awVar.bravo(alpha);
        }
        return ((((currentTimeMillis + alpha) / 1000) / 60) / 60) / 24;
    }

    public final Bundle red(zzbh zzbhVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbhVar.purple.alpha.getLong("_sid"));
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1 c12 = c1450j.c1(str, "_sno");
        if (c12 != null) {
            Object obj = c12.echo;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ao silver(zzr zzrVar) {
        String str;
        Pair pair;
        boolean z2;
        String str2;
        long j5;
        String str3;
        String str4;
        String str5;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str6;
        String str7;
        boolean z14;
        String str8;
        String str9;
        boolean z15;
        boolean z16;
        u().W();
        foxtrot();
        V5.x.hotel(zzrVar);
        String str10 = zzrVar.alpha;
        V5.x.echo(str10);
        String str11 = zzrVar.f7710o;
        if (!str11.isEmpty()) {
            this.f7559w.put(str10, new X0(this, str11));
        }
        C1450j c1450j = this.red;
        cyan(c1450j);
        ao T02 = c1450j.T0(str10);
        V foxtrot = e(str10).foxtrot(V.echo(100, zzrVar.f7709n));
        U u4 = U.AD_STORAGE;
        boolean kilo = foxtrot.kilo(u4);
        boolean z17 = zzrVar.f7702g;
        if (!kilo) {
            str = "";
        } else {
            str = this.f7539b.b0(str10, z17);
        }
        U u10 = U.ANALYTICS_STORAGE;
        boolean z18 = false;
        boolean z19 = true;
        if (T02 == null) {
            T02 = new ao(this.e, str10);
            if (foxtrot.kilo(u10)) {
                T02.lima(charlie(foxtrot));
            }
            if (foxtrot.kilo(u4)) {
                T02.ivory(str);
            }
        } else {
            if (foxtrot.kilo(u4) && str != null) {
                G g2 = T02.alpha;
                E e = g2.f7508c;
                G.foxtrot(e);
                e.W();
                if (!str.equals(T02.echo)) {
                    E e4 = g2.f7508c;
                    G.foxtrot(e4);
                    e4.W();
                    boolean isEmpty = TextUtils.isEmpty(T02.echo);
                    T02.ivory(str);
                    if (z17) {
                        J0 j02 = this.f7539b;
                        j02.getClass();
                        if (foxtrot.kilo(u4)) {
                            pair = j02.a0(str10);
                        } else {
                            pair = new Pair("", Boolean.FALSE);
                        }
                        if (!"00000000-0000-0000-0000-000000000000".equals(pair.first) && !isEmpty) {
                            if (foxtrot.kilo(u10)) {
                                T02.lima(charlie(foxtrot));
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            C1450j c1450j2 = this.red;
                            cyan(c1450j2);
                            if (c1450j2.c1(str10, Column.ID) != null) {
                                C1450j c1450j3 = this.red;
                                cyan(c1450j3);
                                if (c1450j3.c1(str10, "_lair") == null) {
                                    pink().getClass();
                                    c1 c1Var = new c1(str10, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    C1450j c1450j4 = this.red;
                                    cyan(c1450j4);
                                    c1450j4.K0(c1Var);
                                }
                            }
                            T02.crimson(zzrVar.purple);
                            T02.kilo(zzrVar.f7704i);
                            str2 = zzrVar.f7700d;
                            if (!TextUtils.isEmpty(str2)) {
                                T02.coral(str2);
                            }
                            j5 = zzrVar.teal;
                            if (j5 != 0) {
                                T02.cyan(j5);
                            }
                            str3 = zzrVar.red;
                            if (!TextUtils.isEmpty(str3)) {
                                T02.november(str3);
                            }
                            T02.oscar(zzrVar.f7699c);
                            str4 = zzrVar.silver;
                            if (str4 != null) {
                                T02.mike(str4);
                            }
                            T02.beige(zzrVar.white);
                            T02.indigo(zzrVar.f7697a);
                            str5 = zzrVar.yellow;
                            if (!TextUtils.isEmpty(str5)) {
                                T02.emerald(str5);
                            }
                            G g5 = T02.alpha;
                            E e5 = g5.f7508c;
                            G.foxtrot(e5);
                            e5.W();
                            boolean z20 = T02.lavender;
                            if (T02.papa == z17) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            T02.lavender = z20 | z10;
                            T02.papa = z17;
                            E e10 = g5.f7508c;
                            G.foxtrot(e10);
                            e10.W();
                            boolean z21 = T02.lavender;
                            Boolean bool = T02.romeo;
                            Boolean bool2 = zzrVar.f7705j;
                            T02.lavender = z21 | (!Objects.equals(bool, bool2));
                            T02.romeo = bool2;
                            T02.blue(zzrVar.f7706k);
                            E e11 = g5.f7508c;
                            G.foxtrot(e11);
                            e11.W();
                            boolean z22 = T02.lavender;
                            String str12 = T02.uniform;
                            String str13 = zzrVar.f7711p;
                            T02.lavender = z22 | (!Objects.equals(str12, str13));
                            T02.uniform = str13;
                            B2 b2 = B2.purple;
                            if (!white().j0(null, ac.f7563D)) {
                                T02.jade(zzrVar.f7707l);
                            } else {
                                if (white().j0(null, ac.C)) {
                                    T02.jade(null);
                                }
                            }
                            E e12 = g5.f7508c;
                            G.foxtrot(e12);
                            e12.W();
                            boolean z23 = T02.lavender;
                            z11 = T02.victor;
                            z12 = zzrVar.f7712q;
                            if (z11 == z12) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            T02.lavender = z23 | z13;
                            T02.victor = z12;
                            E e13 = g5.f7508c;
                            G.foxtrot(e13);
                            e13.W();
                            boolean z24 = T02.lavender;
                            str6 = T02.black;
                            str7 = zzrVar.f7718w;
                            if (str6 == str7) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            T02.lavender = z24 | z14;
                            T02.black = str7;
                            C1317f3.bravo();
                            if (white().j0(null, ac.f7574O)) {
                                E e14 = g5.f7508c;
                                G.foxtrot(e14);
                                e14.W();
                                boolean z25 = T02.lavender;
                                int i4 = T02.yankee;
                                int i5 = zzrVar.f7716u;
                                if (i4 != i5) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                T02.lavender = z25 | z16;
                                T02.yankee = i5;
                            }
                            T02.romeo(zzrVar.f7713r);
                            E e15 = g5.f7508c;
                            G.foxtrot(e15);
                            e15.W();
                            boolean z26 = T02.lavender;
                            str8 = T02.crimson;
                            str9 = zzrVar.f7719x;
                            if (str8 == str9) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            T02.lavender = z26 | z15;
                            T02.crimson = str9;
                            if (white().j0(null, ac.f7568I)) {
                                E e16 = g5.f7508c;
                                G.foxtrot(e16);
                                e16.W();
                                boolean z27 = T02.lavender;
                                int i10 = T02.emerald;
                                int i11 = zzrVar.f7721z;
                                if (i10 != i11) {
                                    z18 = true;
                                }
                                T02.lavender = z27 | z18;
                                T02.emerald = i11;
                            }
                            if (T02.sierra()) {
                                if (!z2) {
                                    return T02;
                                }
                            } else {
                                z19 = z2;
                            }
                            C1450j c1450j5 = this.red;
                            cyan(c1450j5);
                            c1450j5.s0(T02, z19);
                            return T02;
                        }
                    }
                    if (TextUtils.isEmpty(T02.delta()) && foxtrot.kilo(u10)) {
                        T02.lima(charlie(foxtrot));
                    }
                }
            }
            if (TextUtils.isEmpty(T02.delta()) && foxtrot.kilo(u10)) {
                T02.lima(charlie(foxtrot));
            }
        }
        z2 = false;
        T02.crimson(zzrVar.purple);
        T02.kilo(zzrVar.f7704i);
        str2 = zzrVar.f7700d;
        if (!TextUtils.isEmpty(str2)) {
        }
        j5 = zzrVar.teal;
        if (j5 != 0) {
        }
        str3 = zzrVar.red;
        if (!TextUtils.isEmpty(str3)) {
        }
        T02.oscar(zzrVar.f7699c);
        str4 = zzrVar.silver;
        if (str4 != null) {
        }
        T02.beige(zzrVar.white);
        T02.indigo(zzrVar.f7697a);
        str5 = zzrVar.yellow;
        if (!TextUtils.isEmpty(str5)) {
        }
        G g52 = T02.alpha;
        E e52 = g52.f7508c;
        G.foxtrot(e52);
        e52.W();
        boolean z202 = T02.lavender;
        if (T02.papa == z17) {
        }
        T02.lavender = z202 | z10;
        T02.papa = z17;
        E e102 = g52.f7508c;
        G.foxtrot(e102);
        e102.W();
        boolean z212 = T02.lavender;
        Boolean bool3 = T02.romeo;
        Boolean bool22 = zzrVar.f7705j;
        T02.lavender = z212 | (!Objects.equals(bool3, bool22));
        T02.romeo = bool22;
        T02.blue(zzrVar.f7706k);
        E e112 = g52.f7508c;
        G.foxtrot(e112);
        e112.W();
        boolean z222 = T02.lavender;
        String str122 = T02.uniform;
        String str132 = zzrVar.f7711p;
        T02.lavender = z222 | (!Objects.equals(str122, str132));
        T02.uniform = str132;
        B2 b22 = B2.purple;
        if (!white().j0(null, ac.f7563D)) {
        }
        E e122 = g52.f7508c;
        G.foxtrot(e122);
        e122.W();
        boolean z232 = T02.lavender;
        z11 = T02.victor;
        z12 = zzrVar.f7712q;
        if (z11 == z12) {
        }
        T02.lavender = z232 | z13;
        T02.victor = z12;
        E e132 = g52.f7508c;
        G.foxtrot(e132);
        e132.W();
        boolean z242 = T02.lavender;
        str6 = T02.black;
        str7 = zzrVar.f7718w;
        if (str6 == str7) {
        }
        T02.lavender = z242 | z14;
        T02.black = str7;
        C1317f3.bravo();
        if (white().j0(null, ac.f7574O)) {
        }
        T02.romeo(zzrVar.f7713r);
        E e152 = g52.f7508c;
        G.foxtrot(e152);
        e152.W();
        boolean z262 = T02.lavender;
        str8 = T02.crimson;
        str9 = zzrVar.f7719x;
        if (str8 == str9) {
        }
        T02.lavender = z262 | z15;
        T02.crimson = str9;
        if (white().j0(null, ac.f7568I)) {
        }
        if (T02.sierra()) {
        }
        C1450j c1450j52 = this.red;
        cyan(c1450j52);
        c1450j52.s0(T02, z19);
        return T02;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int tango(av.ah ahVar, String str) {
        S j02;
        A a6 = this.alpha;
        C1289a0 k02 = a6.k0(str);
        U u4 = U.AD_PERSONALIZATION;
        if (k02 == null) {
            ahVar.white(u4, EnumC1442f.FAILSAFE);
            return 1;
        }
        C1450j c1450j = this.red;
        cyan(c1450j);
        ao T02 = c1450j.T0(str);
        if (T02 != null) {
            if (((S) androidx.core.widget.f.beige(T02.hotel()).purple) == S.POLICY && (j02 = a6.j0(str, u4)) != S.UNINITIALIZED) {
                ahVar.white(u4, EnumC1442f.REMOTE_ENFORCED_DEFAULT);
                if (j02 != S.GRANTED) {
                    return 1;
                }
                return 0;
            }
        }
        ahVar.white(u4, EnumC1442f.REMOTE_DEFAULT);
        if (a6.n0(str, u4)) {
            return 0;
        }
    }

    public final C1436c teal() {
        C1436c c1436c = this.white;
        cyan(c1436c);
        return c1436c;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final E u() {
        G g2 = this.e;
        V5.x.hotel(g2);
        E e = g2.f7508c;
        G.foxtrot(e);
        return e;
    }

    public final zzr uniform(String str) {
        C1450j c1450j = this.red;
        cyan(c1450j);
        ao T02 = c1450j.T0(str);
        if (T02 != null && !TextUtils.isEmpty(T02.echo())) {
            Boolean whiskey = whiskey(T02);
            if (whiskey != null && !whiskey.booleanValue()) {
                ar crimson = crimson();
                crimson.white.bravo(ar.e0(str), "App version does not match; dropping. appId");
                return null;
            }
            String golf = T02.golf();
            String echo = T02.echo();
            long lime = T02.lime();
            G g2 = T02.alpha;
            E e = g2.f7508c;
            G.foxtrot(e);
            e.W();
            String str2 = T02.lima;
            E e4 = g2.f7508c;
            G.foxtrot(e4);
            e4.W();
            long j5 = T02.mike;
            E e5 = g2.f7508c;
            G.foxtrot(e5);
            e5.W();
            long j6 = T02.november;
            E e10 = g2.f7508c;
            G.foxtrot(e10);
            e10.W();
            boolean z2 = T02.oscar;
            String foxtrot = T02.foxtrot();
            E e11 = g2.f7508c;
            G.foxtrot(e11);
            e11.W();
            boolean z10 = T02.papa;
            String alpha = T02.alpha();
            Boolean maroon = T02.maroon();
            long magenta = T02.magenta();
            E e12 = g2.f7508c;
            G.foxtrot(e12);
            e12.W();
            ArrayList arrayList = T02.tango;
            String juliet = e(str).juliet();
            boolean tango = T02.tango();
            E e13 = g2.f7508c;
            G.foxtrot(e13);
            e13.W();
            long j7 = T02.whiskey;
            V e14 = e(str);
            String str3 = b(str).bravo;
            E e15 = g2.f7508c;
            G.foxtrot(e15);
            e15.W();
            int i4 = T02.yankee;
            E e16 = g2.f7508c;
            G.foxtrot(e16);
            e16.W();
            return new zzr(str, golf, echo, lime, str2, j5, j6, (String) null, z2, false, foxtrot, 0L, 0, z10, false, alpha, maroon, magenta, (List) arrayList, (String) null, juliet, "", (String) null, tango, j7, e14.bravo, str3, i4, T02.beige, T02.india(), T02.hotel(), 0L, T02.lavender());
        }
        crimson().f7635f.bravo(str, "No app data available; dropping");
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final r6.u victor() {
        return this.e.white;
    }

    public final Boolean whiskey(ao aoVar) {
        try {
            long lime = aoVar.lime();
            G g2 = this.e;
            if (lime != -2147483648L) {
                if (aoVar.lime() == C1754b.alpha(g2.alpha).charlie(0, aoVar.charlie()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C1754b.alpha(g2.alpha).charlie(0, aoVar.charlie()).versionName;
                String echo = aoVar.echo();
                if (echo != null && echo.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final C1440e white() {
        G g2 = this.e;
        V5.x.hotel(g2);
        return g2.yellow;
    }

    public final void yankee() {
        u().W();
        if (!this.f7549m && !this.f7550n && !this.f7551o) {
            crimson().f7636g.alpha("Stopping uploading service(s)");
            ArrayList arrayList = this.f7545i;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ArrayList arrayList2 = this.f7545i;
            V5.x.hotel(arrayList2);
            arrayList2.clear();
            return;
        }
        ar crimson = crimson();
        crimson.f7636g.delta("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f7549m), Boolean.valueOf(this.f7550n), Boolean.valueOf(this.f7551o));
    }

    public final C1450j yellow() {
        C1450j c1450j = this.red;
        cyan(c1450j);
        return c1450j;
    }

    public final void zulu(com.google.android.gms.internal.measurement.C0 c02, long j5, boolean z2) {
        String str;
        c1 c1Var;
        String str2;
        Object obj;
        if (true != z2) {
            str = "_lte";
        } else {
            str = "_se";
        }
        String str3 = str;
        C1450j c1450j = this.red;
        cyan(c1450j);
        c1 c12 = c1450j.c1(c02.xray(), str3);
        if (c12 != null && (obj = c12.echo) != null) {
            String xray = c02.xray();
            pink().getClass();
            c1Var = new c1(xray, "auto", str3, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j5));
        } else {
            String xray2 = c02.xray();
            pink().getClass();
            c1Var = new c1(xray2, "auto", str3, System.currentTimeMillis(), Long.valueOf(j5));
        }
        com.google.android.gms.internal.measurement.L0 romeo = com.google.android.gms.internal.measurement.M0.romeo();
        romeo.golf();
        com.google.android.gms.internal.measurement.M0.zulu((com.google.android.gms.internal.measurement.M0) romeo.purple, str3);
        pink().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        romeo.golf();
        com.google.android.gms.internal.measurement.M0.amber((com.google.android.gms.internal.measurement.M0) romeo.purple, currentTimeMillis);
        Object obj2 = c1Var.echo;
        long longValue = ((Long) obj2).longValue();
        romeo.golf();
        com.google.android.gms.internal.measurement.M0.yankee((com.google.android.gms.internal.measurement.M0) romeo.purple, longValue);
        com.google.android.gms.internal.measurement.M0 m02 = (com.google.android.gms.internal.measurement.M0) romeo.echo();
        int q02 = au.q0(c02, str3);
        if (q02 >= 0) {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.v0((com.google.android.gms.internal.measurement.D0) c02.purple, q02, m02);
        } else {
            c02.golf();
            com.google.android.gms.internal.measurement.D0.j((com.google.android.gms.internal.measurement.D0) c02.purple, m02);
        }
        if (j5 > 0) {
            C1450j c1450j2 = this.red;
            cyan(c1450j2);
            c1450j2.K0(c1Var);
            if (true != z2) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            crimson().f7636g.charlie(str2, obj2, "Updated engagement user property. scope, value");
        }
    }
}
