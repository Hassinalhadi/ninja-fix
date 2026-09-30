package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class X0 {
    public static final bv.e hotel = new bv.aw(0);
    public static final String[] india = {Constants.KEY_KEY, "value"};
    public final ContentResolver alpha;
    public final Uri bravo;
    public final Runnable charlie;
    public final U0 delta;
    public volatile Map foxtrot;
    public final Object echo = new Object();
    public final ArrayList golf = new ArrayList();

    public X0(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.alpha = contentResolver;
        this.bravo = uri;
        this.charlie = runnable;
        this.delta = new U0(1, this);
    }

    public static X0 alpha(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        X0 x02;
        synchronized (X0.class) {
            bv.e eVar = hotel;
            x02 = (X0) eVar.get(uri);
            if (x02 == null) {
                try {
                    X0 x03 = new X0(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, x03.delta);
                        eVar.put(uri, x03);
                    } catch (SecurityException unused) {
                    }
                    x02 = x03;
                } catch (SecurityException unused2) {
                }
            }
        }
        return x02;
    }

    public static synchronized void charlie() {
        synchronized (X0.class) {
            try {
                bv.e eVar = hotel;
                Iterator it = ((bv.d) eVar.values()).iterator();
                while (it.hasNext()) {
                    X0 x02 = (X0) it.next();
                    x02.alpha.unregisterContentObserver(x02.delta);
                }
                eVar.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map bravo() {
        Map map;
        Map map2;
        Object charlie;
        Map map3 = this.foxtrot;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.echo) {
                ?? r02 = this.foxtrot;
                map2 = r02;
                if (r02 == 0) {
                    try {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                J1 j12 = new J1(this);
                                try {
                                    charlie = j12.charlie();
                                } catch (SecurityException unused) {
                                    long clearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        charlie = j12.charlie();
                                    } finally {
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                    }
                                }
                                map = (Map) charlie;
                            } catch (SecurityException e) {
                                e = e;
                                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                this.foxtrot = map;
                                map2 = map;
                                map4 = map2;
                                if (map4 == null) {
                                }
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.foxtrot = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        } catch (IllegalStateException e5) {
                            e = e5;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.foxtrot = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        this.foxtrot = map;
                        map2 = map;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(r02);
                        throw th;
                    }
                }
            }
            map4 = map2;
        }
        if (map4 == null) {
            return map4;
        }
        return Collections.EMPTY_MAP;
    }
}
