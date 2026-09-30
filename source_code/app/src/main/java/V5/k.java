package V5;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class k {
    public static final g bravo = new g("LibraryVersion", "");
    public static final k charlie = new k();
    public final ConcurrentHashMap alpha = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String alpha(String str) {
        IOException e;
        String str2;
        InputStream inputStream;
        g gVar = bravo;
        x.foxtrot(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.alpha;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r6 = null;
        r6 = null;
        String str3 = null;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = k.class.getResourceAsStream("/" + str + ".properties");
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e4) {
            e = e4;
            str2 = null;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                String str4 = str + " version is " + str3;
                if (Log.isLoggable(gVar.alpha, 2)) {
                    Log.v("LibraryVersion", gVar.bravo(str4));
                }
            } else {
                String str5 = "Failed to get app version for libraryName: " + str;
                if (Log.isLoggable(gVar.alpha, 5)) {
                    Log.w("LibraryVersion", gVar.bravo(str5));
                }
            }
        } catch (IOException e5) {
            e = e5;
            String str6 = str3;
            inputStream2 = inputStream;
            str2 = str6;
            String str7 = "Failed to get app version for libraryName: " + str;
            if (Log.isLoggable(gVar.alpha, 6)) {
                Log.e("LibraryVersion", gVar.bravo(str7), e);
            }
            InputStream inputStream4 = inputStream2;
            str3 = str2;
            inputStream = inputStream4;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            concurrentHashMap.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream3 = inputStream;
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        if (str3 == null) {
            if (Log.isLoggable(gVar.alpha, 3)) {
                Log.d("LibraryVersion", gVar.bravo(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"));
            }
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
