package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.C0665j;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.C1298c;
import d6.C1590a;
import e6.C1629a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class H0 extends AbstractC1481z {

    /* renamed from: a, reason: collision with root package name */
    public final C0665j f7531a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7532b;

    /* renamed from: c, reason: collision with root package name */
    public final F0 f7533c;
    public final G0 red;
    public ae silver;
    public volatile Boolean teal;
    public final F0 white;
    public ScheduledExecutorService yellow;

    public H0(G g2) {
        super(g2);
        this.f7532b = new ArrayList();
        this.f7531a = new C0665j(g2.f7511g);
        this.red = new G0(this);
        this.white = new F0(this, g2, 0);
        this.f7533c = new F0(this, g2, 1);
    }

    public static void p0(H0 h02, ComponentName componentName) {
        h02.W();
        if (h02.silver != null) {
            h02.silver = null;
            ar arVar = ((G) h02.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7636g.bravo(componentName, "Disconnected from device MeasurementService");
            h02.W();
            h02.a0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1481z
    public final boolean Z() {
        return false;
    }

    public final void a0() {
        W();
        X();
        if (!g0()) {
            if (!j0()) {
                G g2 = (G) this.alpha;
                if (!g2.yellow.Z()) {
                    List<ResolveInfo> queryIntentServices = g2.alpha.getPackageManager().queryIntentServices(new Intent().setClassName(g2.alpha, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        intent.setComponent(new ComponentName(g2.alpha, "com.google.android.gms.measurement.AppMeasurementService"));
                        G0 g02 = this.red;
                        H0 h02 = g02.charlie;
                        h02.W();
                        Context context = ((G) h02.alpha).alpha;
                        C1590a bravo = C1590a.bravo();
                        synchronized (g02) {
                            try {
                                if (g02.alpha) {
                                    ar arVar = ((G) g02.charlie.alpha).f7507b;
                                    G.foxtrot(arVar);
                                    arVar.f7636g.alpha("Connection attempt already in progress");
                                    return;
                                } else {
                                    H0 h03 = g02.charlie;
                                    ar arVar2 = ((G) h03.alpha).f7507b;
                                    G.foxtrot(arVar2);
                                    arVar2.f7636g.alpha("Using local app measurement service");
                                    g02.alpha = true;
                                    bravo.alpha(context, intent, h03.red, 129);
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    ar arVar3 = g2.f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.alpha("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            this.red.alpha();
        }
    }

    public final void b0() {
        W();
        X();
        G0 g02 = this.red;
        if (g02.bravo != null && (g02.bravo.golf() || g02.bravo.charlie())) {
            g02.bravo.echo();
        }
        g02.bravo = null;
        try {
            C1590a.bravo().charlie(((G) this.alpha).alpha, g02);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.silver = null;
    }

    public final void c0(AtomicReference atomicReference) {
        W();
        X();
        n0(new D2.d(this, atomicReference, k0(false), 10, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041b A[Catch: all -> 0x03a0, TRY_ENTER, TryCatch #0 {all -> 0x03a0, blocks: (B:181:0x0447, B:210:0x041b, B:212:0x0421, B:213:0x0424, B:202:0x0465, B:352:0x038b, B:356:0x0395, B:357:0x03a8), top: B:180:0x0447 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02c5 A[Catch: all -> 0x01e2, SQLiteException -> 0x02a1, SQLiteDatabaseLockedException -> 0x02a6, SQLiteFullException -> 0x02aa, TryCatch #36 {all -> 0x01e2, blocks: (B:162:0x01bb, B:170:0x01d1, B:172:0x01d6, B:222:0x01fe, B:223:0x0201, B:220:0x01fa, B:238:0x0214, B:241:0x0228, B:243:0x023e, B:246:0x0247, B:247:0x024a, B:249:0x0238, B:252:0x024e, B:255:0x0262, B:257:0x0278, B:262:0x0282, B:263:0x0285, B:260:0x0272, B:273:0x0289, B:281:0x029d, B:283:0x02c5, B:291:0x02cf, B:292:0x02d2, B:297:0x02bf, B:268:0x02df, B:270:0x02ea, B:349:0x0374), top: B:161:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x063d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(ae aeVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        int i4;
        ArrayList arrayList;
        G g2;
        int i5;
        int i10;
        SQLiteDatabase sQLiteDatabase;
        int i11;
        String str;
        String str2;
        String str3;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        long j5;
        String str4;
        String[] strArr;
        ar arVar;
        Cursor cursor4;
        G g5;
        long j6;
        String str5;
        Parcel obtain;
        zzbf zzbfVar;
        char c3;
        zzai zzaiVar;
        zzqb zzqbVar;
        int i12;
        int size;
        int i13;
        zzr zzrVar2;
        boolean z2;
        boolean z10;
        int i14;
        long j7;
        long j10;
        long currentTimeMillis;
        AbstractSafeParcelable abstractSafeParcelable2 = abstractSafeParcelable;
        W();
        X();
        o0();
        G g10 = (G) this.alpha;
        g10.getClass();
        zzr zzrVar3 = zzrVar;
        int i15 = 100;
        int i16 = 0;
        loop0: for (int i17 = 100; i16 < 1001 && i15 == i17; i17 = 100) {
            ArrayList arrayList2 = new ArrayList();
            al juliet = g10.juliet();
            String str6 = "entry";
            String str7 = Constants.KEY_TYPE;
            String str8 = "rowid";
            juliet.W();
            if (juliet.silver) {
                g2 = g10;
                i4 = i17;
                i5 = i16;
            } else {
                i4 = i17;
                arrayList = new ArrayList();
                G g11 = (G) juliet.alpha;
                if (g11.alpha.getDatabasePath("google_app_measurement_local.db").exists()) {
                    i5 = i16;
                    int i18 = 0;
                    int i19 = 5;
                    for (int i20 = 5; i18 < i20; i20 = 5) {
                        try {
                            SQLiteDatabase a02 = juliet.a0();
                            if (a02 == null) {
                                try {
                                    try {
                                        juliet.silver = true;
                                        g2 = g10;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = a02;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    i11 = i18;
                                    g2 = g10;
                                    str = str6;
                                    str2 = str7;
                                    str3 = str8;
                                    sQLiteDatabase = a02;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i19);
                                        i19 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i18 = i11 + 1;
                                        str7 = str2;
                                        str8 = str3;
                                        g10 = g2;
                                        str6 = str;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    i11 = i18;
                                    g2 = g10;
                                    str = str6;
                                    str2 = str7;
                                    str3 = str8;
                                    sQLiteDatabase = a02;
                                    cursor2 = null;
                                    ar arVar2 = g11.f7507b;
                                    G.foxtrot(arVar2);
                                    arVar2.white.bravo(e, "Error reading entries from local database");
                                    juliet.silver = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i18 = i11 + 1;
                                    str7 = str2;
                                    str8 = str3;
                                    g10 = g2;
                                    str6 = str;
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    i11 = i18;
                                    g2 = g10;
                                    str = str6;
                                    str2 = str7;
                                    str3 = str8;
                                    sQLiteDatabase = a02;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    ar arVar3 = g11.f7507b;
                                    G.foxtrot(arVar3);
                                    arVar3.white.bravo(e, "Error reading entries from local database");
                                    juliet.silver = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i18 = i11 + 1;
                                    str7 = str2;
                                    str8 = str3;
                                    g10 = g2;
                                    str6 = str;
                                }
                            } else {
                                a02.beginTransaction();
                                try {
                                    cursor3 = a02.query("messages", new String[]{str8}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j11 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i11 = i18;
                                            try {
                                                j5 = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    g2 = g10;
                                                    str = str6;
                                                    str2 = str7;
                                                    str3 = str8;
                                                    sQLiteDatabase = a02;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i19);
                                                    i19 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i11 + 1;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    g10 = g2;
                                                    str6 = str;
                                                } catch (SQLiteFullException e5) {
                                                    e = e5;
                                                    g2 = g10;
                                                    str = str6;
                                                    str2 = str7;
                                                    str3 = str8;
                                                    sQLiteDatabase = a02;
                                                    cursor2 = null;
                                                    ar arVar22 = g11.f7507b;
                                                    G.foxtrot(arVar22);
                                                    arVar22.white.bravo(e, "Error reading entries from local database");
                                                    juliet.silver = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i11 + 1;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    g10 = g2;
                                                    str6 = str;
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    g2 = g10;
                                                    str = str6;
                                                    str2 = str7;
                                                    str3 = str8;
                                                    sQLiteDatabase = a02;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    ar arVar32 = g11.f7507b;
                                                    G.foxtrot(arVar32);
                                                    arVar32.white.bravo(e, "Error reading entries from local database");
                                                    juliet.silver = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i11 + 1;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    g10 = g2;
                                                    str6 = str;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                g2 = g10;
                                                str = str6;
                                                str2 = str7;
                                                str3 = str8;
                                                sQLiteDatabase = a02;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i19);
                                                        i19 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i18 = i11 + 1;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        g10 = g2;
                                                        str6 = str;
                                                    } catch (SQLiteFullException e11) {
                                                        e = e11;
                                                        cursor2 = null;
                                                        ar arVar222 = g11.f7507b;
                                                        G.foxtrot(arVar222);
                                                        arVar222.white.bravo(e, "Error reading entries from local database");
                                                        juliet.silver = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i18 = i11 + 1;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        g10 = g2;
                                                        str6 = str;
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        ar arVar322 = g11.f7507b;
                                                        G.foxtrot(arVar322);
                                                        arVar322.white.bravo(e, "Error reading entries from local database");
                                                        juliet.silver = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i18 = i11 + 1;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        g10 = g2;
                                                        str6 = str;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor = null;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                                break loop0;
                                            }
                                        } else {
                                            i11 = i18;
                                            cursor3.close();
                                            j5 = -1;
                                        }
                                        if (j5 != -1) {
                                            str4 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j5)};
                                        } else {
                                            str4 = null;
                                            strArr = null;
                                        }
                                        String[] strArr2 = {str8, str7, str6};
                                        str = str6;
                                        try {
                                            int i21 = 4;
                                            if (g11.yellow.j0(null, ac.f7593e0)) {
                                                strArr2 = new String[]{str8, str7, str, "app_version", "app_version_int"};
                                            }
                                            Cursor query = a02.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i4));
                                            while (true) {
                                                try {
                                                    try {
                                                        boolean moveToNext = query.moveToNext();
                                                        arVar = g11.f7507b;
                                                        if (!moveToNext) {
                                                            break;
                                                        }
                                                        try {
                                                            j11 = query.getLong(0);
                                                            try {
                                                                int i22 = query.getInt(1);
                                                                str2 = str7;
                                                                try {
                                                                    try {
                                                                        byte[] blob = query.getBlob(2);
                                                                        try {
                                                                            str3 = str8;
                                                                            try {
                                                                                if (g11.yellow.j0(null, ac.f7593e0)) {
                                                                                    try {
                                                                                        str5 = query.getString(3);
                                                                                        cursor4 = query;
                                                                                        g5 = g10;
                                                                                        j6 = query.getLong(i21);
                                                                                    } catch (SQLiteDatabaseLockedException unused4) {
                                                                                        cursor2 = query;
                                                                                        g2 = g10;
                                                                                        sQLiteDatabase = a02;
                                                                                        SystemClock.sleep(i19);
                                                                                        i19 += 20;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i11 + 1;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        g10 = g2;
                                                                                        str6 = str;
                                                                                    } catch (SQLiteFullException e13) {
                                                                                        e = e13;
                                                                                        cursor2 = query;
                                                                                        g2 = g10;
                                                                                        sQLiteDatabase = a02;
                                                                                        ar arVar2222 = g11.f7507b;
                                                                                        G.foxtrot(arVar2222);
                                                                                        arVar2222.white.bravo(e, "Error reading entries from local database");
                                                                                        juliet.silver = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i11 + 1;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        g10 = g2;
                                                                                        str6 = str;
                                                                                    } catch (SQLiteException e14) {
                                                                                        e = e14;
                                                                                        cursor2 = query;
                                                                                        g2 = g10;
                                                                                        sQLiteDatabase = a02;
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        ar arVar3222 = g11.f7507b;
                                                                                        G.foxtrot(arVar3222);
                                                                                        arVar3222.white.bravo(e, "Error reading entries from local database");
                                                                                        juliet.silver = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i11 + 1;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        g10 = g2;
                                                                                        str6 = str;
                                                                                    }
                                                                                } else {
                                                                                    cursor4 = query;
                                                                                    g5 = g10;
                                                                                    j6 = 0;
                                                                                    str5 = null;
                                                                                }
                                                                                if (i22 == 0) {
                                                                                    cursor2 = cursor4;
                                                                                    try {
                                                                                        try {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                g2 = g5;
                                                                                                try {
                                                                                                    try {
                                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                                        obtain.setDataPosition(0);
                                                                                                        zzbh createFromParcel = zzbh.CREATOR.createFromParcel(obtain);
                                                                                                        try {
                                                                                                            if (createFromParcel != null) {
                                                                                                                arrayList.add(new ak(createFromParcel, str5, j6));
                                                                                                            }
                                                                                                        } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                            sQLiteDatabase = a02;
                                                                                                            SystemClock.sleep(i19);
                                                                                                            i19 += 20;
                                                                                                            if (cursor2 != null) {
                                                                                                            }
                                                                                                            if (sQLiteDatabase == null) {
                                                                                                            }
                                                                                                            sQLiteDatabase.close();
                                                                                                            i18 = i11 + 1;
                                                                                                            str7 = str2;
                                                                                                            str8 = str3;
                                                                                                            g10 = g2;
                                                                                                            str6 = str;
                                                                                                        } catch (SQLiteFullException e15) {
                                                                                                            e = e15;
                                                                                                            sQLiteDatabase = a02;
                                                                                                            ar arVar22222 = g11.f7507b;
                                                                                                            G.foxtrot(arVar22222);
                                                                                                            arVar22222.white.bravo(e, "Error reading entries from local database");
                                                                                                            juliet.silver = true;
                                                                                                            if (cursor2 != null) {
                                                                                                                cursor2.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabase == null) {
                                                                                                                i18 = i11 + 1;
                                                                                                                str7 = str2;
                                                                                                                str8 = str3;
                                                                                                                g10 = g2;
                                                                                                                str6 = str;
                                                                                                            }
                                                                                                            sQLiteDatabase.close();
                                                                                                            i18 = i11 + 1;
                                                                                                            str7 = str2;
                                                                                                            str8 = str3;
                                                                                                            g10 = g2;
                                                                                                            str6 = str;
                                                                                                        } catch (SQLiteException e16) {
                                                                                                            e = e16;
                                                                                                            sQLiteDatabase = a02;
                                                                                                            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                                                                                sQLiteDatabase.endTransaction();
                                                                                                            }
                                                                                                            ar arVar32222 = g11.f7507b;
                                                                                                            G.foxtrot(arVar32222);
                                                                                                            arVar32222.white.bravo(e, "Error reading entries from local database");
                                                                                                            juliet.silver = true;
                                                                                                            if (cursor2 != null) {
                                                                                                                cursor2.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabase == null) {
                                                                                                                i18 = i11 + 1;
                                                                                                                str7 = str2;
                                                                                                                str8 = str3;
                                                                                                                g10 = g2;
                                                                                                                str6 = str;
                                                                                                            }
                                                                                                            sQLiteDatabase.close();
                                                                                                            i18 = i11 + 1;
                                                                                                            str7 = str2;
                                                                                                            str8 = str3;
                                                                                                            g10 = g2;
                                                                                                            str6 = str;
                                                                                                        }
                                                                                                    } catch (SafeParcelReader$ParseException unused6) {
                                                                                                        G.foxtrot(arVar);
                                                                                                        arVar.white.alpha("Failed to load event from local database");
                                                                                                        obtain.recycle();
                                                                                                        c3 = 3;
                                                                                                        str7 = str2;
                                                                                                        str8 = str3;
                                                                                                        query = cursor2;
                                                                                                        g10 = g2;
                                                                                                        i21 = 4;
                                                                                                    }
                                                                                                } catch (Throwable th5) {
                                                                                                    th = th5;
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SafeParcelReader$ParseException unused7) {
                                                                                                g2 = g5;
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                            }
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            sQLiteDatabase = a02;
                                                                                            cursor = cursor2;
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused8) {
                                                                                        g2 = g5;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        g2 = g5;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        g2 = g5;
                                                                                    }
                                                                                } else {
                                                                                    cursor2 = cursor4;
                                                                                    g2 = g5;
                                                                                    if (i22 == 1) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                zzqbVar = zzqb.CREATOR.createFromParcel(obtain);
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (SafeParcelReader$ParseException unused9) {
                                                                                            G.foxtrot(arVar);
                                                                                            arVar.white.alpha("Failed to load user property from local database");
                                                                                            obtain.recycle();
                                                                                            zzqbVar = null;
                                                                                        }
                                                                                        if (zzqbVar != null) {
                                                                                            arrayList.add(new ak(zzqbVar, str5, j6));
                                                                                        }
                                                                                    } else if (i22 == 2) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                zzaiVar = zzai.CREATOR.createFromParcel(obtain);
                                                                                            } catch (SafeParcelReader$ParseException unused10) {
                                                                                                G.foxtrot(arVar);
                                                                                                arVar.white.alpha("Failed to load conditional user property from local database");
                                                                                                obtain.recycle();
                                                                                                zzaiVar = null;
                                                                                            }
                                                                                            if (zzaiVar != null) {
                                                                                                arrayList.add(new ak(zzaiVar, str5, j6));
                                                                                            }
                                                                                        } finally {
                                                                                        }
                                                                                    } else if (i22 == 4) {
                                                                                        try {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                                        obtain.setDataPosition(0);
                                                                                                        zzbfVar = zzbf.CREATOR.createFromParcel(obtain);
                                                                                                    } catch (Throwable th8) {
                                                                                                        th = th8;
                                                                                                        throw th;
                                                                                                        break loop0;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused11) {
                                                                                                    G.foxtrot(arVar);
                                                                                                    arVar.white.alpha("Failed to load default event parameters from local database");
                                                                                                    obtain.recycle();
                                                                                                    zzbfVar = null;
                                                                                                    if (zzbfVar != null) {
                                                                                                    }
                                                                                                    c3 = 3;
                                                                                                    str7 = str2;
                                                                                                    str8 = str3;
                                                                                                    query = cursor2;
                                                                                                    g10 = g2;
                                                                                                    i21 = 4;
                                                                                                }
                                                                                            } catch (SafeParcelReader$ParseException unused12) {
                                                                                            } catch (Throwable th9) {
                                                                                                th = th9;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused13) {
                                                                                            sQLiteDatabase = a02;
                                                                                            SystemClock.sleep(i19);
                                                                                            i19 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i11 + 1;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            g10 = g2;
                                                                                            str6 = str;
                                                                                        } catch (SQLiteFullException e19) {
                                                                                            e = e19;
                                                                                            sQLiteDatabase = a02;
                                                                                            ar arVar222222 = g11.f7507b;
                                                                                            G.foxtrot(arVar222222);
                                                                                            arVar222222.white.bravo(e, "Error reading entries from local database");
                                                                                            juliet.silver = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i11 + 1;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            g10 = g2;
                                                                                            str6 = str;
                                                                                        } catch (SQLiteException e20) {
                                                                                            e = e20;
                                                                                            sQLiteDatabase = a02;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            ar arVar322222 = g11.f7507b;
                                                                                            G.foxtrot(arVar322222);
                                                                                            arVar322222.white.bravo(e, "Error reading entries from local database");
                                                                                            juliet.silver = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i11 + 1;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            g10 = g2;
                                                                                            str6 = str;
                                                                                        }
                                                                                        try {
                                                                                            if (zzbfVar != null) {
                                                                                                arrayList.add(new ak(zzbfVar, str5, j6));
                                                                                            }
                                                                                            c3 = 3;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            query = cursor2;
                                                                                            g10 = g2;
                                                                                            i21 = 4;
                                                                                        } catch (SQLiteDatabaseLockedException unused14) {
                                                                                            sQLiteDatabase = a02;
                                                                                            SystemClock.sleep(i19);
                                                                                            i19 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i11 + 1;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            g10 = g2;
                                                                                            str6 = str;
                                                                                        } catch (SQLiteFullException e21) {
                                                                                            e = e21;
                                                                                            sQLiteDatabase = a02;
                                                                                            ar arVar2222222 = g11.f7507b;
                                                                                            G.foxtrot(arVar2222222);
                                                                                            arVar2222222.white.bravo(e, "Error reading entries from local database");
                                                                                            juliet.silver = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i11 + 1;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            g10 = g2;
                                                                                            str6 = str;
                                                                                        } catch (SQLiteException e22) {
                                                                                            e = e22;
                                                                                            sQLiteDatabase = a02;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            ar arVar3222222 = g11.f7507b;
                                                                                            G.foxtrot(arVar3222222);
                                                                                            arVar3222222.white.bravo(e, "Error reading entries from local database");
                                                                                            juliet.silver = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i11 + 1;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            g10 = g2;
                                                                                            str6 = str;
                                                                                        }
                                                                                    } else {
                                                                                        c3 = 3;
                                                                                        if (i22 == 3) {
                                                                                            G.foxtrot(arVar);
                                                                                            arVar.f7632b.alpha("Skipping app launch break");
                                                                                        } else {
                                                                                            G.foxtrot(arVar);
                                                                                            arVar.white.alpha("Unknown record type in local database");
                                                                                        }
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        query = cursor2;
                                                                                        g10 = g2;
                                                                                        i21 = 4;
                                                                                    }
                                                                                }
                                                                                c3 = 3;
                                                                                str7 = str2;
                                                                                str8 = str3;
                                                                                query = cursor2;
                                                                                g10 = g2;
                                                                                i21 = 4;
                                                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                                                cursor2 = query;
                                                                                g2 = g10;
                                                                            } catch (SQLiteFullException e23) {
                                                                                e = e23;
                                                                                cursor2 = query;
                                                                                g2 = g10;
                                                                            } catch (SQLiteException e24) {
                                                                                e = e24;
                                                                                cursor2 = query;
                                                                                g2 = g10;
                                                                            }
                                                                        } catch (SQLiteFullException e25) {
                                                                            e = e25;
                                                                            cursor2 = query;
                                                                            g2 = g10;
                                                                            str3 = str8;
                                                                        } catch (SQLiteException e26) {
                                                                            e = e26;
                                                                            cursor2 = query;
                                                                            g2 = g10;
                                                                            str3 = str8;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused16) {
                                                                        cursor2 = query;
                                                                        g2 = g10;
                                                                        str3 = str8;
                                                                        sQLiteDatabase = a02;
                                                                        SystemClock.sleep(i19);
                                                                        i19 += 20;
                                                                        if (cursor2 != null) {
                                                                            cursor2.close();
                                                                        }
                                                                        if (sQLiteDatabase == null) {
                                                                            i18 = i11 + 1;
                                                                            str7 = str2;
                                                                            str8 = str3;
                                                                            g10 = g2;
                                                                            str6 = str;
                                                                        }
                                                                        sQLiteDatabase.close();
                                                                        i18 = i11 + 1;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        g10 = g2;
                                                                        str6 = str;
                                                                    }
                                                                } catch (SQLiteFullException e27) {
                                                                    e = e27;
                                                                    cursor2 = query;
                                                                    g2 = g10;
                                                                    str3 = str8;
                                                                    sQLiteDatabase = a02;
                                                                    ar arVar22222222 = g11.f7507b;
                                                                    G.foxtrot(arVar22222222);
                                                                    arVar22222222.white.bravo(e, "Error reading entries from local database");
                                                                    juliet.silver = true;
                                                                    if (cursor2 != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i18 = i11 + 1;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    g10 = g2;
                                                                    str6 = str;
                                                                } catch (SQLiteException e28) {
                                                                    e = e28;
                                                                    cursor2 = query;
                                                                    g2 = g10;
                                                                    str3 = str8;
                                                                    sQLiteDatabase = a02;
                                                                    if (sQLiteDatabase != null) {
                                                                        sQLiteDatabase.endTransaction();
                                                                    }
                                                                    ar arVar32222222 = g11.f7507b;
                                                                    G.foxtrot(arVar32222222);
                                                                    arVar32222222.white.bravo(e, "Error reading entries from local database");
                                                                    juliet.silver = true;
                                                                    if (cursor2 != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i18 = i11 + 1;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    g10 = g2;
                                                                    str6 = str;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused17) {
                                                                cursor2 = query;
                                                                g2 = g10;
                                                                str2 = str7;
                                                            } catch (SQLiteFullException e29) {
                                                                e = e29;
                                                                cursor2 = query;
                                                                g2 = g10;
                                                                str2 = str7;
                                                            } catch (SQLiteException e30) {
                                                                e = e30;
                                                                cursor2 = query;
                                                                g2 = g10;
                                                                str2 = str7;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused18) {
                                                            cursor2 = query;
                                                            g2 = g10;
                                                            str2 = str7;
                                                            str3 = str8;
                                                        } catch (SQLiteFullException e31) {
                                                            e = e31;
                                                            cursor2 = query;
                                                            g2 = g10;
                                                            str2 = str7;
                                                            str3 = str8;
                                                        } catch (SQLiteException e32) {
                                                            e = e32;
                                                            cursor2 = query;
                                                            g2 = g10;
                                                            str2 = str7;
                                                            str3 = str8;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        cursor2 = query;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused19) {
                                                    cursor2 = query;
                                                    g2 = g10;
                                                    str2 = str7;
                                                    str3 = str8;
                                                } catch (SQLiteFullException e33) {
                                                    e = e33;
                                                    cursor2 = query;
                                                    g2 = g10;
                                                    str2 = str7;
                                                    str3 = str8;
                                                } catch (SQLiteException e34) {
                                                    e = e34;
                                                    cursor2 = query;
                                                    g2 = g10;
                                                    str2 = str7;
                                                    str3 = str8;
                                                }
                                            }
                                            cursor2 = query;
                                            g2 = g10;
                                            str2 = str7;
                                            str3 = str8;
                                            i10 = 0;
                                            sQLiteDatabase = a02;
                                            try {
                                                if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j11)}) < arrayList.size()) {
                                                    G.foxtrot(arVar);
                                                    arVar.white.alpha("Fewer entries removed from local database than expected");
                                                }
                                                sQLiteDatabase.setTransactionSuccessful();
                                                sQLiteDatabase.endTransaction();
                                                cursor2.close();
                                                sQLiteDatabase.close();
                                            } catch (SQLiteDatabaseLockedException unused20) {
                                                SystemClock.sleep(i19);
                                                i19 += 20;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i18 = i11 + 1;
                                                str7 = str2;
                                                str8 = str3;
                                                g10 = g2;
                                                str6 = str;
                                            } catch (SQLiteFullException e35) {
                                                e = e35;
                                                ar arVar222222222 = g11.f7507b;
                                                G.foxtrot(arVar222222222);
                                                arVar222222222.white.bravo(e, "Error reading entries from local database");
                                                juliet.silver = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i18 = i11 + 1;
                                                str7 = str2;
                                                str8 = str3;
                                                g10 = g2;
                                                str6 = str;
                                            } catch (SQLiteException e36) {
                                                e = e36;
                                                if (sQLiteDatabase != null) {
                                                }
                                                ar arVar322222222 = g11.f7507b;
                                                G.foxtrot(arVar322222222);
                                                arVar322222222.white.bravo(e, "Error reading entries from local database");
                                                juliet.silver = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i18 = i11 + 1;
                                                str7 = str2;
                                                str8 = str3;
                                                g10 = g2;
                                                str6 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused21) {
                                            g2 = g10;
                                            str2 = str7;
                                            str3 = str8;
                                            sQLiteDatabase = a02;
                                            cursor2 = null;
                                            SystemClock.sleep(i19);
                                            i19 += 20;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i18 = i11 + 1;
                                            str7 = str2;
                                            str8 = str3;
                                            g10 = g2;
                                            str6 = str;
                                        } catch (SQLiteFullException e37) {
                                            e = e37;
                                            g2 = g10;
                                            str2 = str7;
                                            str3 = str8;
                                            sQLiteDatabase = a02;
                                            cursor2 = null;
                                            ar arVar2222222222 = g11.f7507b;
                                            G.foxtrot(arVar2222222222);
                                            arVar2222222222.white.bravo(e, "Error reading entries from local database");
                                            juliet.silver = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i18 = i11 + 1;
                                            str7 = str2;
                                            str8 = str3;
                                            g10 = g2;
                                            str6 = str;
                                        } catch (SQLiteException e38) {
                                            e = e38;
                                            g2 = g10;
                                            str2 = str7;
                                            str3 = str8;
                                            sQLiteDatabase = a02;
                                            cursor2 = null;
                                            if (sQLiteDatabase != null) {
                                            }
                                            ar arVar3222222222 = g11.f7507b;
                                            G.foxtrot(arVar3222222222);
                                            arVar3222222222.white.bravo(e, "Error reading entries from local database");
                                            juliet.silver = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i18 = i11 + 1;
                                            str7 = str2;
                                            str8 = str3;
                                            g10 = g2;
                                            str6 = str;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        i11 = i18;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    i11 = i18;
                                    g2 = g10;
                                    str = str6;
                                    str2 = str7;
                                    str3 = str8;
                                    sQLiteDatabase = a02;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused22) {
                            i11 = i18;
                            g2 = g10;
                            str = str6;
                            str2 = str7;
                            str3 = str8;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e39) {
                            e = e39;
                            i11 = i18;
                            g2 = g10;
                            str = str6;
                            str2 = str7;
                            str3 = str8;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e40) {
                            e = e40;
                            i11 = i18;
                            g2 = g10;
                            str = str6;
                            str2 = str7;
                            str3 = str8;
                            sQLiteDatabase = null;
                        } catch (Throwable th13) {
                            th = th13;
                            sQLiteDatabase = null;
                        }
                    }
                    g2 = g10;
                    i10 = 0;
                    ar arVar4 = g11.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.f7632b.alpha("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    g2 = g10;
                    i5 = i16;
                    i10 = 0;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i12 = arrayList.size();
                } else {
                    i12 = i10;
                }
                int i23 = i4;
                if (abstractSafeParcelable2 != null && i12 < i23) {
                    arrayList2.add(new ak(abstractSafeParcelable2, zzrVar3.red, zzrVar3.f7699c));
                }
                ab abVar = ac.f7573N;
                G g12 = g2;
                C1440e c1440e = g12.yellow;
                String str9 = null;
                boolean j02 = c1440e.j0(null, abVar);
                size = arrayList2.size();
                zzr zzrVar4 = zzrVar3;
                i13 = i10;
                while (i13 < size) {
                    ak akVar = (ak) arrayList2.get(i13);
                    AbstractSafeParcelable abstractSafeParcelable3 = akVar.alpha;
                    ab abVar2 = ac.f7593e0;
                    if (c1440e.j0(str9, abVar2)) {
                        String str10 = akVar.bravo;
                        if (!TextUtils.isEmpty(str10)) {
                            zzrVar2 = new zzr(zzrVar4.alpha, zzrVar4.purple, str10, akVar.charlie, zzrVar4.silver, zzrVar4.teal, zzrVar4.white, zzrVar4.yellow, zzrVar4.f7697a, zzrVar4.f7698b, zzrVar4.f7700d, zzrVar4.e, zzrVar4.f7701f, zzrVar4.f7702g, zzrVar4.f7703h, zzrVar4.f7704i, zzrVar4.f7705j, zzrVar4.f7706k, zzrVar4.f7707l, zzrVar4.f7708m, zzrVar4.f7709n, zzrVar4.f7710o, zzrVar4.f7711p, zzrVar4.f7712q, zzrVar4.f7713r, zzrVar4.f7714s, zzrVar4.f7715t, zzrVar4.f7716u, zzrVar4.f7717v, zzrVar4.f7718w, zzrVar4.f7719x, zzrVar4.f7720y, zzrVar4.f7721z);
                            z2 = abstractSafeParcelable3 instanceof zzbh;
                            ar arVar5 = g12.f7507b;
                            if (!z2) {
                                Context context = g12.alpha;
                                C1629a c1629a = g12.f7511g;
                                if (j02) {
                                    try {
                                        c1629a.getClass();
                                        currentTimeMillis = System.currentTimeMillis();
                                    } catch (RemoteException e41) {
                                        e = e41;
                                        z10 = j02;
                                        i14 = i13;
                                        j7 = 0;
                                        j10 = 0;
                                    }
                                    try {
                                        c1629a.getClass();
                                        j10 = currentTimeMillis;
                                        j7 = SystemClock.elapsedRealtime();
                                    } catch (RemoteException e42) {
                                        e = e42;
                                        z10 = j02;
                                        i14 = i13;
                                        j10 = currentTimeMillis;
                                        j7 = 0;
                                        G.foxtrot(arVar5);
                                        arVar5.white.bravo(e, "Failed to send event to the service");
                                        if (z10) {
                                        }
                                        str9 = null;
                                        i13 = i14 + 1;
                                        zzrVar4 = zzrVar2;
                                        j02 = z10;
                                    }
                                } else {
                                    j7 = 0;
                                    j10 = 0;
                                }
                                try {
                                    try {
                                        aeVar.golf((zzbh) abstractSafeParcelable3, zzrVar2);
                                        if (j02) {
                                            G.foxtrot(arVar5);
                                            arVar5.f7636g.alpha("Logging telemetry for logEvent from database");
                                            if (C1298c.teal == null) {
                                                C1298c.teal = new C1298c(context, g12);
                                            }
                                            C1298c c1298c = C1298c.teal;
                                            c1629a.getClass();
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            c1629a.getClass();
                                            z10 = j02;
                                            i14 = i13;
                                            try {
                                                c1298c.uniform(0, (int) (SystemClock.elapsedRealtime() - j7), j10, currentTimeMillis2);
                                            } catch (RemoteException e43) {
                                                e = e43;
                                                G.foxtrot(arVar5);
                                                arVar5.white.bravo(e, "Failed to send event to the service");
                                                if (z10) {
                                                    if (C1298c.teal == null) {
                                                    }
                                                    C1298c c1298c2 = C1298c.teal;
                                                    c1629a.getClass();
                                                    long currentTimeMillis3 = System.currentTimeMillis();
                                                    c1629a.getClass();
                                                    c1298c2.uniform(13, (int) (SystemClock.elapsedRealtime() - j7), j10, currentTimeMillis3);
                                                }
                                                str9 = null;
                                                i13 = i14 + 1;
                                                zzrVar4 = zzrVar2;
                                                j02 = z10;
                                            }
                                        } else {
                                            z10 = j02;
                                            i14 = i13;
                                        }
                                    } catch (RemoteException e44) {
                                        e = e44;
                                        z10 = j02;
                                        i14 = i13;
                                        G.foxtrot(arVar5);
                                        arVar5.white.bravo(e, "Failed to send event to the service");
                                        if (z10 && j10 != 0) {
                                            if (C1298c.teal == null) {
                                                C1298c.teal = new C1298c(context, g12);
                                            }
                                            C1298c c1298c22 = C1298c.teal;
                                            c1629a.getClass();
                                            long currentTimeMillis32 = System.currentTimeMillis();
                                            c1629a.getClass();
                                            c1298c22.uniform(13, (int) (SystemClock.elapsedRealtime() - j7), j10, currentTimeMillis32);
                                        }
                                        str9 = null;
                                        i13 = i14 + 1;
                                        zzrVar4 = zzrVar2;
                                        j02 = z10;
                                    }
                                } catch (RemoteException e45) {
                                    e = e45;
                                }
                            } else {
                                z10 = j02;
                                i14 = i13;
                                if (abstractSafeParcelable3 instanceof zzqb) {
                                    try {
                                        aeVar.coral((zzqb) abstractSafeParcelable3, zzrVar2);
                                    } catch (RemoteException e46) {
                                        G.foxtrot(arVar5);
                                        arVar5.white.bravo(e46, "Failed to send user property to the service");
                                    }
                                } else if (abstractSafeParcelable3 instanceof zzai) {
                                    try {
                                        aeVar.bronze((zzai) abstractSafeParcelable3, zzrVar2);
                                    } catch (RemoteException e47) {
                                        G.foxtrot(arVar5);
                                        arVar5.white.bravo(e47, "Failed to send conditional user property to the service");
                                    }
                                } else {
                                    str9 = null;
                                    if (c1440e.j0(null, abVar2) && (abstractSafeParcelable3 instanceof zzbf)) {
                                        try {
                                            aeVar.juliet(((zzbf) abstractSafeParcelable3).o(), zzrVar2);
                                        } catch (RemoteException e48) {
                                            G.foxtrot(arVar5);
                                            arVar5.white.bravo(e48, "Failed to send default event parameters to the service");
                                        }
                                    } else {
                                        G.foxtrot(arVar5);
                                        arVar5.white.alpha("Discarding data. Unrecognized parcel type.");
                                    }
                                    i13 = i14 + 1;
                                    zzrVar4 = zzrVar2;
                                    j02 = z10;
                                }
                            }
                            str9 = null;
                            i13 = i14 + 1;
                            zzrVar4 = zzrVar2;
                            j02 = z10;
                        }
                    }
                    zzrVar2 = zzrVar4;
                    z2 = abstractSafeParcelable3 instanceof zzbh;
                    ar arVar52 = g12.f7507b;
                    if (!z2) {
                    }
                    str9 = null;
                    i13 = i14 + 1;
                    zzrVar4 = zzrVar2;
                    j02 = z10;
                }
                i16 = i5 + 1;
                abstractSafeParcelable2 = abstractSafeParcelable;
                zzrVar3 = zzrVar4;
                i15 = i12;
                g10 = g12;
            }
            i10 = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            int i232 = i4;
            if (abstractSafeParcelable2 != null) {
                arrayList2.add(new ak(abstractSafeParcelable2, zzrVar3.red, zzrVar3.f7699c));
            }
            ab abVar3 = ac.f7573N;
            G g122 = g2;
            C1440e c1440e2 = g122.yellow;
            String str92 = null;
            boolean j022 = c1440e2.j0(null, abVar3);
            size = arrayList2.size();
            zzr zzrVar42 = zzrVar3;
            i13 = i10;
            while (i13 < size) {
            }
            i16 = i5 + 1;
            abstractSafeParcelable2 = abstractSafeParcelable;
            zzrVar3 = zzrVar42;
            i15 = i12;
            g10 = g122;
        }
    }

    public final void e0(zzai zzaiVar) {
        boolean d02;
        W();
        X();
        G g2 = (G) this.alpha;
        g2.getClass();
        al juliet = g2.juliet();
        G g5 = (G) juliet.alpha;
        G.delta(g5.e);
        byte[] X02 = d1.X0(zzaiVar);
        if (X02.length > 131072) {
            ar arVar = g5.f7507b;
            G.foxtrot(arVar);
            arVar.yellow.alpha("Conditional user property too long for local database. Sending directly to service");
            d02 = false;
        } else {
            d02 = juliet.d0(2, X02);
        }
        boolean z2 = d02;
        n0(new S5.g(this, k0(true), z2, new zzai(zzaiVar), 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(Bundle bundle) {
        boolean z2;
        boolean d02;
        W();
        X();
        zzbf zzbfVar = new zzbf(bundle);
        o0();
        G g2 = (G) this.alpha;
        if (g2.yellow.j0(null, ac.f7593e0)) {
            al juliet = g2.juliet();
            G g5 = (G) juliet.alpha;
            G.delta(g5.e);
            byte[] X02 = d1.X0(zzbfVar);
            ar arVar = g5.f7507b;
            if (X02 == null) {
                G.foxtrot(arVar);
                arVar.yellow.alpha("Null default event parameters; not writing to database");
            } else if (X02.length > 131072) {
                G.foxtrot(arVar);
                arVar.yellow.alpha("Default event parameters too long for local database. Sending directly to service");
            } else {
                d02 = juliet.d0(4, X02);
                if (d02) {
                    z2 = true;
                    n0(new RunnableC1449i0(this, k0(false), z2, zzbfVar, bundle));
                }
            }
            d02 = false;
            if (d02) {
            }
        }
        z2 = false;
        n0(new RunnableC1449i0(this, k0(false), z2, zzbfVar, bundle));
    }

    public final boolean g0() {
        W();
        X();
        if (this.silver != null) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        W();
        X();
        if (!j0()) {
            return true;
        }
        d1 d1Var = ((G) this.alpha).e;
        G.delta(d1Var);
        if (d1Var.e1() >= ((Integer) ac.B.alpha(null)).intValue()) {
            return true;
        }
        return false;
    }

    public final boolean i0() {
        W();
        X();
        if (j0()) {
            d1 d1Var = ((G) this.alpha).e;
            G.delta(d1Var);
            if (d1Var.e1() < 241200) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j0() {
        Boolean valueOf;
        W();
        X();
        if (this.teal == null) {
            W();
            X();
            G g2 = (G) this.alpha;
            ax axVar = g2.f7506a;
            G.delta(axVar);
            axVar.W();
            boolean z2 = false;
            if (!axVar.b0().contains("use_service")) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(axVar.b0().getBoolean("use_service", false));
            }
            boolean z10 = true;
            if (valueOf == null || !valueOf.booleanValue()) {
                aj india = ((G) this.alpha).india();
                india.X();
                if (india.f7625f != 1) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.f7636g.alpha("Checking service availability");
                    d1 d1Var = g2.e;
                    G.delta(d1Var);
                    int isGooglePlayServicesAvailable = com.google.android.gms.common.d.getInstance().isGooglePlayServicesAvailable(((G) d1Var.alpha).alpha, com.google.android.gms.common.e.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (isGooglePlayServicesAvailable != 0) {
                        if (isGooglePlayServicesAvailable != 1) {
                            if (isGooglePlayServicesAvailable != 2) {
                                if (isGooglePlayServicesAvailable != 3) {
                                    if (isGooglePlayServicesAvailable != 9) {
                                        if (isGooglePlayServicesAvailable != 18) {
                                            ar arVar2 = g2.f7507b;
                                            G.foxtrot(arVar2);
                                            arVar2.f7632b.bravo(Integer.valueOf(isGooglePlayServicesAvailable), "Unexpected service status");
                                        } else {
                                            ar arVar3 = g2.f7507b;
                                            G.foxtrot(arVar3);
                                            arVar3.f7632b.alpha("Service updating");
                                        }
                                    } else {
                                        ar arVar4 = g2.f7507b;
                                        G.foxtrot(arVar4);
                                        arVar4.f7632b.alpha("Service invalid");
                                    }
                                } else {
                                    ar arVar5 = g2.f7507b;
                                    G.foxtrot(arVar5);
                                    arVar5.f7632b.alpha("Service disabled");
                                }
                                z10 = false;
                            } else {
                                ar arVar6 = g2.f7507b;
                                G.foxtrot(arVar6);
                                arVar6.f7635f.alpha("Service container out of date");
                                d1 d1Var2 = g2.e;
                                G.delta(d1Var2);
                                if (d1Var2.e1() >= 17443) {
                                    if (valueOf != null) {
                                        z10 = false;
                                    }
                                    z2 = z10;
                                    z10 = false;
                                }
                            }
                        } else {
                            ar arVar7 = g2.f7507b;
                            G.foxtrot(arVar7);
                            arVar7.f7636g.alpha("Service missing");
                        }
                        if (z2 && g2.yellow.Z()) {
                            ar arVar8 = g2.f7507b;
                            G.foxtrot(arVar8);
                            arVar8.white.alpha("No way to upload. Consider using the full version of Analytics");
                        } else if (z10) {
                            ax axVar2 = g2.f7506a;
                            G.delta(axVar2);
                            axVar2.W();
                            SharedPreferences.Editor edit = axVar2.b0().edit();
                            edit.putBoolean("use_service", z2);
                            edit.apply();
                        }
                        z10 = z2;
                    } else {
                        ar arVar9 = g2.f7507b;
                        G.foxtrot(arVar9);
                        arVar9.f7636g.alpha("Service available");
                    }
                }
                z2 = true;
                if (z2) {
                }
                if (z10) {
                }
                z10 = z2;
            }
            this.teal = Boolean.valueOf(z10);
        }
        return this.teal.booleanValue();
    }

    public final zzr k0(boolean z2) {
        long abs;
        Pair pair;
        G g2 = (G) this.alpha;
        g2.getClass();
        aj india = g2.india();
        String str = null;
        if (z2) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            G g5 = (G) arVar.alpha;
            ax axVar = g5.f7506a;
            G.delta(axVar);
            if (axVar.white != null) {
                ax axVar2 = g5.f7506a;
                G.delta(axVar2);
                C2.d dVar = axVar2.white;
                ax axVar3 = (ax) dVar.teal;
                axVar3.W();
                axVar3.W();
                long j5 = ((ax) dVar.teal).b0().getLong((String) dVar.purple, 0L);
                if (j5 == 0) {
                    dVar.foxtrot();
                    abs = 0;
                } else {
                    ((G) axVar3.alpha).f7511g.getClass();
                    abs = Math.abs(j5 - System.currentTimeMillis());
                }
                long j6 = dVar.alpha;
                if (abs >= j6) {
                    if (abs > j6 + j6) {
                        dVar.foxtrot();
                    } else {
                        String string = axVar3.b0().getString((String) dVar.silver, null);
                        long j7 = axVar3.b0().getLong((String) dVar.red, 0L);
                        dVar.foxtrot();
                        if (string != null && j7 > 0) {
                            pair = new Pair(string, Long.valueOf(j7));
                        } else {
                            pair = ax.f7637t;
                        }
                        if (pair != null && pair != ax.f7637t) {
                            str = ao.ad.amber(String.valueOf(pair.second), ":", (String) pair.first);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    str = ao.ad.amber(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
        }
        return india.a0(str);
    }

    public final void l0() {
        W();
        G g2 = (G) this.alpha;
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        ArrayList arrayList = this.f7532b;
        arVar.f7636g.bravo(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.bravo(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f7533c.alpha();
    }

    public final void m0() {
        W();
        C0665j c0665j = this.f7531a;
        ((C1629a) c0665j.red).getClass();
        c0665j.purple = SystemClock.elapsedRealtime();
        ((G) this.alpha).getClass();
        this.white.charlie(((Long) ac.orange.alpha(null)).longValue());
    }

    public final void n0(Runnable runnable) {
        W();
        if (g0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f7532b;
        long size = arrayList.size();
        G g2 = (G) this.alpha;
        g2.getClass();
        if (size >= 1000) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f7533c.charlie(60000L);
            a0();
        }
    }

    public final void o0() {
        ((G) this.alpha).getClass();
    }
}
