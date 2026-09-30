package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r7.AbstractC2500b;
import r7.C2499a;
import r7.C2501c;
import r7.InterfaceC2502d;

/* loaded from: classes2.dex */
public final class J1 implements InterfaceC2502d, N1 {
    public static final C1384v1 purple = new C1384v1(3);
    public final Object alpha;

    public /* synthetic */ J1(Object obj) {
        this.alpha = obj;
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public W1 alpha(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            N1 n1 = ((N1[]) this.alpha)[i4];
            if (n1.bravo(cls)) {
                return n1.alpha(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public boolean bravo(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (((N1[]) this.alpha)[i4].bravo(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [bv.aw] */
    public Object charlie() {
        HashMap hashMap;
        X0 x02 = (X0) this.alpha;
        ContentResolver contentResolver = x02.alpha;
        Uri uri = x02.bravo;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, X0.india, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                if (count <= 256) {
                    hashMap = new bv.aw(count);
                } else {
                    hashMap = new HashMap(count, 1.0f);
                }
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                if (!query.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map2 = Collections.EMPTY_MAP;
                    query.close();
                    return map2;
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (RemoteException e) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public void delta(int i4, Object obj, X1 x12) {
        C1365q1 c1365q1 = (C1365q1) this.alpha;
        c1365q1.lima(i4, 3);
        x12.echo((O1) obj, c1365q1.delta);
        c1365q1.lima(i4, 4);
    }

    public void echo(int i4, Object obj, X1 x12) {
        O1 o12 = (O1) obj;
        C1365q1 c1365q1 = (C1365q1) this.alpha;
        c1365q1.november((i4 << 3) | 2);
        c1365q1.november(((AbstractC1340k1) o12).alpha(x12));
        x12.echo(o12, c1365q1.delta);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(2:22|(1:24))|25|26|27|28|29|30|31|(1:33)(1:80)|34|(9:36|37|38|39|40|(2:41|(3:43|(3:58|59|60)(7:45|46|(2:48|(1:51))|52|(1:54)|55|56)|57)(1:61))|62|63|64)(1:79)|65|14) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0078, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0079, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r4);
        r5 = r7.C2499a.alpha;
     */
    @Override // r7.InterfaceC2502d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get() {
        AbstractC2500b abstractC2500b;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        AbstractC2500b abstractC2500b2;
        AbstractC2500b abstractC2500b3;
        boolean isDeviceProtectedStorage;
        Object obj = C1320g1.golf;
        Context context = (Context) this.alpha;
        AbstractC2500b abstractC2500b4 = AbstractC1295b1.alpha;
        if (abstractC2500b4 == null) {
            synchronized (AbstractC1295b1.class) {
                try {
                    abstractC2500b = AbstractC1295b1.alpha;
                    if (abstractC2500b == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        bv.e eVar = AbstractC1305d1.alpha;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            abstractC2500b = C2499a.alpha;
                            AbstractC1295b1.alpha = abstractC2500b;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            abstractC2500b = C2499a.alpha;
                            AbstractC1295b1.alpha = abstractC2500b;
                        }
                        if (V0.alpha()) {
                            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                            if (!isDeviceProtectedStorage) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                        }
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        StrictMode.allowThreadDiskWrites();
                        File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                        if (file.exists()) {
                            abstractC2500b2 = new C2501c(file);
                        } else {
                            abstractC2500b2 = C2499a.alpha;
                        }
                        if (abstractC2500b2.bravo()) {
                            File file2 = (File) abstractC2500b2.alpha();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    bv.aw awVar = new bv.aw(0);
                                    HashMap hashMap = new HashMap();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        String[] split = readLine.split(" ", 3);
                                        if (split.length != 3) {
                                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                        } else {
                                            String str3 = new String(split[0]);
                                            String decode = Uri.decode(new String(split[1]));
                                            String str4 = (String) hashMap.get(split[2]);
                                            if (str4 == null) {
                                                String str5 = new String(split[2]);
                                                str4 = Uri.decode(str5);
                                                if (str4.length() < 1024 || str4 == str5) {
                                                    hashMap.put(str5, str4);
                                                }
                                            }
                                            bv.aw awVar2 = (bv.aw) awVar.get(str3);
                                            if (awVar2 == null) {
                                                awVar2 = new bv.aw(0);
                                                awVar.put(str3, awVar2);
                                            }
                                            awVar2.put(decode, str4);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                    Y0 y02 = new Y0(awVar);
                                    bufferedReader.close();
                                    abstractC2500b3 = new C2501c(y02);
                                } finally {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            abstractC2500b3 = C2499a.alpha;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        abstractC2500b = abstractC2500b3;
                        AbstractC1295b1.alpha = abstractC2500b;
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th2;
                } finally {
                }
            }
            return abstractC2500b;
        }
        return abstractC2500b4;
    }

    public J1(int i4) {
        switch (i4) {
            case 1:
                this.alpha = new HashMap();
                return;
            default:
                U1 u12 = U1.charlie;
                J1 j12 = new J1(new N1[]{C1384v1.purple, purple});
                Charset charset = E1.alpha;
                this.alpha = j12;
                return;
        }
    }

    public J1(C1365q1 c1365q1) {
        Charset charset = E1.alpha;
        this.alpha = c1365q1;
        c1365q1.delta = this;
    }
}
