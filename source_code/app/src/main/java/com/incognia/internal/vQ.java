package com.incognia.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class vQ {

    /* renamed from: W, reason: collision with root package name */
    public final String f11547W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11548b;

    /* renamed from: f9, reason: collision with root package name */
    public final SharedPreferences f11549f9;

    public vQ(Context context, String str) {
        this.f11548b = context;
        this.f11547W = str;
        this.f11549f9 = context.getSharedPreferences(str, 0);
    }

    public final String W(String str, String str2) {
        try {
            return (String) b(str, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:10:0x0023, B:15:0x002d, B:17:0x003e, B:21:0x0036), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        try {
            String string = this.f11549f9.getString(str, null);
            if (string != null) {
                ConcurrentHashMap b2 = b(string);
                if (b2 != null) {
                    String str3 = (String) b2.get("encoding_type");
                    String str4 = (String) b2.get("object");
                    if (str3 != null && str4 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt == 0) {
                            concurrentHashMap = b(str4);
                        } else if (parseInt == 1) {
                            concurrentHashMap = b(ICR.sVU(str4));
                        }
                        if (concurrentHashMap != null) {
                            return concurrentHashMap.get(str2);
                        }
                    }
                }
                concurrentHashMap = null;
                if (concurrentHashMap != null) {
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void b() {
        this.f11549f9.edit().clear().commit();
        String parent = this.f11548b.getFilesDir().getParent();
        String concat = parent != null ? parent.concat(String.format("/shared_prefs/%s.xml", Arrays.copyOf(new Object[]{this.f11547W}, 1))) : null;
        if (concat != null) {
            File file = new File(concat);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static ConcurrentHashMap b(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = StringsKt.maroon(str, new String[]{";"}, 6).iterator();
        while (it.hasNext()) {
            List maroon = StringsKt.maroon((String) it.next(), new String[]{":"}, 6);
            try {
                if (maroon.size() == 2) {
                    String str2 = (String) maroon.get(0);
                    String str3 = (String) maroon.get(1);
                    if (str3.length() >= 2 && str3.charAt(0) == '\"') {
                        concurrentHashMap.put(URLDecoder.decode(str2, "UTF-8"), URLDecoder.decode(str3.substring(1, str3.length() - 1), "UTF-8"));
                    } else {
                        concurrentHashMap.put(URLDecoder.decode(str2, "UTF-8"), URLDecoder.decode(str3, "UTF-8"));
                    }
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return concurrentHashMap;
    }
}
