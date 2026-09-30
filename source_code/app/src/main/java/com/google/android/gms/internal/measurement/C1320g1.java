package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import r7.AbstractC2500b;
import r7.C2499a;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1320g1 {
    public static final Object golf = new Object();
    public static volatile W0 hotel;
    public static final AtomicInteger india;
    public final Pf.j alpha;
    public final String bravo;
    public final Object charlie;
    public volatile int delta = -1;
    public volatile Object echo;
    public final /* synthetic */ int foxtrot;

    static {
        new AtomicReference();
        india = new AtomicInteger();
    }

    public /* synthetic */ C1320g1(Pf.j jVar, String str, Object obj, int i4) {
        this.foxtrot = i4;
        if (((Uri) jVar.red) != null) {
            this.alpha = jVar;
            this.bravo = str;
            this.charlie = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public final Object alpha(Object obj) {
        switch (this.foxtrot) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                Log.e("PhenotypeFlag", "Invalid long value for " + this.bravo + ": " + obj.toString());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (S0.bravo.matcher(str).matches()) {
                        return Boolean.TRUE;
                    }
                    if (S0.charlie.matcher(str).matches()) {
                        return Boolean.FALSE;
                    }
                }
                Log.e("PhenotypeFlag", "Invalid boolean value for " + this.bravo + ": " + obj.toString());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                Log.e("PhenotypeFlag", "Invalid double value for " + this.bravo + ": " + obj.toString());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0085, B:29:0x0093, B:32:0x00b8, B:35:0x00c0, B:36:0x00c3, B:37:0x00c7, B:38:0x009c, B:40:0x00a0, B:42:0x00ae, B:44:0x00b4, B:48:0x00cc, B:49:0x00ce, B:51:0x00cf, B:52:0x00d4, B:54:0x0041, B:56:0x00d5), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0085, B:29:0x0093, B:32:0x00b8, B:35:0x00c0, B:36:0x00c3, B:37:0x00c7, B:38:0x009c, B:40:0x00a0, B:42:0x00ae, B:44:0x00b4, B:48:0x00cc, B:49:0x00ce, B:51:0x00cf, B:52:0x00d4, B:54:0x0041, B:56:0x00d5), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0085, B:29:0x0093, B:32:0x00b8, B:35:0x00c0, B:36:0x00c3, B:37:0x00c7, B:38:0x009c, B:40:0x00a0, B:42:0x00ae, B:44:0x00b4, B:48:0x00cc, B:49:0x00ce, B:51:0x00cf, B:52:0x00d4, B:54:0x0041, B:56:0x00d5), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo() {
        String str;
        boolean z2;
        X0 x02;
        Object obj;
        String kilo;
        bv.aw awVar;
        int i4 = india.get();
        if (this.delta < i4) {
            synchronized (this) {
                try {
                    if (this.delta < i4) {
                        W0 w02 = hotel;
                        AbstractC2500b abstractC2500b = C2499a.alpha;
                        Object obj2 = null;
                        if (w02 != null) {
                            abstractC2500b = (AbstractC2500b) w02.bravo.get();
                            if (abstractC2500b.bravo()) {
                                Y0 y02 = (Y0) abstractC2500b.alpha();
                                Uri uri = (Uri) this.alpha.red;
                                String str2 = this.bravo;
                                if (uri != null) {
                                    awVar = (bv.aw) y02.alpha.get(uri.toString());
                                } else {
                                    y02.getClass();
                                    awVar = null;
                                }
                                if (awVar != null) {
                                    str = (String) awVar.get("".concat(str2));
                                    if (w02 == null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        Pf.j jVar = this.alpha;
                                        Uri uri2 = (Uri) jVar.red;
                                        if (uri2 != null) {
                                            if (AbstractC1300c1.alpha(w02.alpha, uri2)) {
                                                x02 = X0.alpha(w02.alpha.getContentResolver(), uri2, new Object());
                                            } else {
                                                x02 = null;
                                            }
                                            if (x02 != null) {
                                                String str3 = (String) x02.bravo().get(this.bravo);
                                                if (str3 != null) {
                                                    obj = alpha(str3);
                                                    if (obj == null) {
                                                        if (!jVar.purple && (kilo = C1290a1.juliet(w02.alpha).kilo(this.bravo)) != null) {
                                                            obj2 = alpha(kilo);
                                                        }
                                                        if (obj2 == null) {
                                                            obj = this.charlie;
                                                        } else {
                                                            obj = obj2;
                                                        }
                                                    }
                                                    if (abstractC2500b.bravo()) {
                                                        if (str == null) {
                                                            obj = this.charlie;
                                                        } else {
                                                            obj = alpha(str);
                                                        }
                                                    }
                                                    this.echo = obj;
                                                    this.delta = i4;
                                                }
                                            }
                                            obj = null;
                                            if (obj == null) {
                                            }
                                            if (abstractC2500b.bravo()) {
                                            }
                                            this.echo = obj;
                                            this.delta = i4;
                                        } else {
                                            Context context = w02.alpha;
                                            throw null;
                                        }
                                    } else {
                                        throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                                    }
                                }
                            }
                        }
                        str = null;
                        if (w02 == null) {
                        }
                        if (!z2) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.echo;
    }
}
