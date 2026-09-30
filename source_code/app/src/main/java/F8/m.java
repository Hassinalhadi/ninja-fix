package F8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.mlkit.vision.barcode.common.Barcode;
import e6.AbstractC1630b;
import e6.C1629a;
import j8.InterfaceC1947d;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m {
    public static final int[] sierra = {2, 4, 8, 16, 32, 64, 128, Barcode.FORMAT_QR_CODE};
    public static final Pattern tango = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet alpha;
    public int charlie;
    public HttpURLConnection foxtrot;
    public c golf;
    public final ScheduledExecutorService hotel;
    public final j india;
    public final B7.g juliet;
    public final InterfaceC1947d kilo;
    public final e lima;
    public final Context mike;
    public final String november;
    public final o quebec;
    public boolean bravo = false;
    public final Random oscar = new Random();
    public final C1629a papa = C1629a.alpha;
    public boolean delta = false;
    public boolean echo = false;
    public final Object romeo = new Object();

    public m(B7.g gVar, InterfaceC1947d interfaceC1947d, j jVar, e eVar, Context context, String str, LinkedHashSet linkedHashSet, o oVar, ScheduledExecutorService scheduledExecutorService) {
        this.alpha = linkedHashSet;
        this.hotel = scheduledExecutorService;
        this.charlie = Math.max(8 - oVar.charlie().alpha, 1);
        this.juliet = gVar;
        this.india = jVar;
        this.kilo = interfaceC1947d;
        this.lima = eVar;
        this.mike = context;
        this.november = str;
        this.quebec = oVar;
    }

    public static boolean delta(int i4) {
        if (i4 != 408 && i4 != 429 && i4 != 502 && i4 != 503 && i4 != 504) {
            return false;
        }
        return true;
    }

    public static String foxtrot(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean alpha() {
        boolean z2;
        if (!this.alpha.isEmpty() && !this.bravo && !this.delta) {
            if (!this.echo) {
                z2 = true;
            }
        }
        z2 = false;
        return z2;
    }

    public final void bravo(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.foxtrot;
        if (httpURLConnection != null && !this.echo) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e4) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e4);
            }
        }
    }

    public final String charlie(String str) {
        String str2;
        B7.g gVar = this.juliet;
        gVar.alpha();
        Matcher matcher = tango.matcher(gVar.charlie.bravo);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return av.q.golf("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", str2, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void echo(long j5) {
        try {
            if (!alpha()) {
                return;
            }
            int i4 = this.charlie;
            if (i4 > 0) {
                this.charlie = i4 - 1;
                this.hotel.schedule(new F6.b(1, this), j5, TimeUnit.MILLISECONDS);
            } else if (!this.echo) {
                new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", E8.c.purple);
                golf();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void golf() {
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            ((l) it.next()).alpha();
        }
    }

    public final synchronized void hotel() {
        this.charlie = 8;
    }

    public final synchronized void india() {
        this.papa.getClass();
        echo(Math.max(0L, this.quebec.charlie().bravo.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void juliet(boolean z2) {
        this.bravo = z2;
    }

    public final void kilo(boolean z2) {
        HttpURLConnection httpURLConnection;
        synchronized (this.romeo) {
            try {
                this.echo = z2;
                c cVar = this.golf;
                if (cVar != null) {
                    cVar.alpha = z2;
                }
                if (Build.VERSION.SDK_INT >= 26 && z2 && (httpURLConnection = this.foxtrot) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lima(HttpURLConnection httpURLConnection, String str, String str2) {
        String str3;
        Matcher matcher;
        byte[] charlie;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        B7.g gVar = this.juliet;
        gVar.alpha();
        B7.i iVar = gVar.charlie;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", iVar.alpha);
        Context context = this.mike;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        String str4 = null;
        try {
            charlie = AbstractC1630b.charlie(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        if (charlie == null) {
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
            str3 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str3);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
            httpURLConnection.setRequestProperty(CtApi.HEADER_CONTENT_TYPE, "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            HashMap hashMap = new HashMap();
            gVar.alpha();
            matcher = tango.matcher(iVar.bravo);
            if (matcher.matches()) {
                str4 = matcher.group(1);
            }
            hashMap.put("project", str4);
            hashMap.put("namespace", this.november);
            hashMap.put("lastKnownVersionNumber", Long.toString(this.india.golf.alpha.getLong("last_template_version", 0L)));
            gVar.alpha();
            hashMap.put("appId", iVar.bravo);
            hashMap.put("sdkVersion", "22.1.2");
            hashMap.put("appInstanceId", str);
            byte[] bytes = new JSONObject(hashMap).toString().getBytes("utf-8");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        str3 = AbstractC1630b.alpha(charlie);
        httpURLConnection.setRequestProperty("X-Android-Cert", str3);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty(CtApi.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap hashMap2 = new HashMap();
        gVar.alpha();
        matcher = tango.matcher(iVar.bravo);
        if (matcher.matches()) {
        }
        hashMap2.put("project", str4);
        hashMap2.put("namespace", this.november);
        hashMap2.put("lastKnownVersionNumber", Long.toString(this.india.golf.alpha.getLong("last_template_version", 0L)));
        gVar.alpha();
        hashMap2.put("appId", iVar.bravo);
        hashMap2.put("sdkVersion", "22.1.2");
        hashMap2.put("appInstanceId", str);
        byte[] bytes2 = new JSONObject(hashMap2).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream2.write(bytes2);
        bufferedOutputStream2.flush();
        bufferedOutputStream2.close();
    }

    public final synchronized c mike(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.india, this.lima, this.alpha, new l(this), this.hotel);
    }

    public final void november(Date date) {
        o oVar = this.quebec;
        int i4 = oVar.charlie().alpha + 1;
        int i5 = 8;
        if (i4 < 8) {
            i5 = i4;
        }
        oVar.foxtrot(new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(sierra[i5 - 1]) / 2) + this.oscar.nextInt((int) r2)), i4);
    }
}
