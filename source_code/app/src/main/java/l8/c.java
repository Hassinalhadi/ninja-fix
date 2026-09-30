package l8;

import V5.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import av.q;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.firebase.installations.FirebaseInstallationsException;
import e6.AbstractC1630b;
import g8.e;
import i8.InterfaceC1904b;
import j8.EnumC1948e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import s6.V4;
import zendesk.support.GuideConstants;

/* loaded from: classes2.dex */
public final class c {
    public static final Pattern delta = Pattern.compile("[0-9]+s");
    public static final Charset echo = Charset.forName("UTF-8");
    public final Context alpha;
    public final InterfaceC1904b bravo;
    public final d charlie = new d();

    public c(Context context, InterfaceC1904b interfaceC1904b) {
        this.alpha = context;
        this.bravo = interfaceC1904b;
    }

    public static URL alpha(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), EnumC1948e.purple);
        }
    }

    public static void bravo(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String echo2;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, echo));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            if (TextUtils.isEmpty(str)) {
                echo2 = "";
            } else {
                echo2 = q.echo(", ", str);
            }
            Log.w("Firebase-Installations", q.golf("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, echo2));
        }
    }

    public static long delta(String str) {
        x.alpha("Invalid Expiration Timestamp.", delta.matcher(str).matches());
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static C2060a echo(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, echo));
        B0.a alpha = b.alpha();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        alpha.charlie = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        alpha.delta = Long.valueOf(delta(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b alpha2 = alpha.alpha();
                jsonReader.endObject();
                bVar = alpha2;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C2060a(str, str2, str3, bVar, 1);
    }

    public static b foxtrot(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, echo));
        B0.a alpha = b.alpha();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                alpha.charlie = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                alpha.delta = Long.valueOf(delta(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        alpha.bravo = 1;
        return alpha.alpha();
    }

    public static void golf(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            india(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void hotel(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            india(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void india(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final HttpURLConnection charlie(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(CtApi.HEADER_CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty(GuideConstants.STANDARD_CACHING_HEADER, "no-cache");
            Context context = this.alpha;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            e eVar = (e) this.bravo.get();
            if (eVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) V4.bravo(((g8.c) eVar).bravo()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e4) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e4);
                }
            }
            String str2 = null;
            try {
                byte[] charlie = AbstractC1630b.charlie(context, context.getPackageName());
                if (charlie == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    str2 = AbstractC1630b.alpha(charlie);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e5);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", EnumC1948e.purple);
        }
    }
}
