package com.google.firebase.remoteconfig.internal;

import E2.e;
import F8.f;
import F8.g;
import F8.i;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import e6.AbstractC1630b;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {
    public static final Pattern hotel = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final long foxtrot;
    public final long golf;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j5, long j6) {
        String str4;
        this.alpha = context;
        this.bravo = str;
        this.charlie = str2;
        Matcher matcher = hotel.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.delta = str4;
        this.echo = str3;
        this.foxtrot = j5;
        this.golf = j6;
    }

    public static JSONObject charlie(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    public static void delta(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject alpha(String str, String str2, Map map, Long l10, Map map2) {
        long j5;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.bravo);
            Context context = this.alpha;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i4 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i4));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i4 >= 28) {
                        j5 = e.echo(packageInfo);
                    } else {
                        j5 = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j5));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "22.1.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (!map2.isEmpty()) {
                hashMap.put("customSignals", new JSONObject(map2));
                Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
            }
            if (l10 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l10));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection bravo() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.delta + "/namespaces/" + this.echo + ":fetch").openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d A[LOOP:0: B:8:0x0097->B:10:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7 A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:14:0x00bb, B:16:0x00d7, B:84:0x018f, B:85:0x0198, B:94:0x0199, B:95:0x01a0), top: B:13:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:14:0x00bb, B:16:0x00d7, B:84:0x018f, B:85:0x0198, B:94:0x0199, B:95:0x01a0), top: B:13:0x00bb }] */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date, Map<String, String> map3) throws FirebaseRemoteConfigException {
        String str4;
        int responseCode;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        String str5;
        JSONArray jSONArray2;
        boolean z2;
        byte[] charlie;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.foxtrot));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.golf));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.charlie);
        Context context = this.alpha;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            charlie = AbstractC1630b.charlie(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        if (charlie == null) {
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
            str4 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str4);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty(CtApi.HEADER_CONTENT_TYPE, "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            try {
                try {
                    delta(httpURLConnection, alpha(str, str2, map, l10, map3).toString().getBytes("utf-8"));
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String headerField = httpURLConnection.getHeaderField("ETag");
                        JSONObject charlie2 = charlie(httpURLConnection);
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (IOException unused) {
                        }
                        try {
                            f charlie3 = g.charlie();
                            charlie3.bravo = date;
                            try {
                                jSONObject = charlie2.getJSONObject("entries");
                            } catch (JSONException unused2) {
                                jSONObject = null;
                            }
                            if (jSONObject != null) {
                                try {
                                    charlie3.alpha = new JSONObject(jSONObject.toString());
                                } catch (JSONException unused3) {
                                }
                            }
                            try {
                                jSONArray = charlie2.getJSONArray("experimentDescriptions");
                            } catch (JSONException unused4) {
                                jSONArray = null;
                            }
                            if (jSONArray != null) {
                                try {
                                    charlie3.charlie = new JSONArray(jSONArray.toString());
                                } catch (JSONException unused5) {
                                }
                            }
                            try {
                                jSONObject2 = charlie2.getJSONObject("personalizationMetadata");
                            } catch (JSONException unused6) {
                                jSONObject2 = null;
                            }
                            if (jSONObject2 != null) {
                                try {
                                    charlie3.delta = new JSONObject(jSONObject2.toString());
                                } catch (JSONException unused7) {
                                }
                            }
                            if (charlie2.has("templateVersion")) {
                                str5 = charlie2.getString("templateVersion");
                            } else {
                                str5 = null;
                            }
                            if (str5 != null) {
                                charlie3.echo = Long.parseLong(str5);
                            }
                            try {
                                jSONArray2 = charlie2.getJSONArray("rolloutMetadata");
                            } catch (JSONException unused8) {
                                jSONArray2 = null;
                            }
                            if (jSONArray2 != null) {
                                try {
                                    charlie3.foxtrot = new JSONArray(jSONArray2.toString());
                                } catch (JSONException unused9) {
                                }
                            }
                            g alpha = charlie3.alpha();
                            try {
                                z2 = !charlie2.get("state").equals("NO_CHANGE");
                            } catch (JSONException unused10) {
                                z2 = true;
                            }
                            if (!z2) {
                                return new i(1, alpha, null);
                            }
                            return new i(0, alpha, headerField);
                        } catch (JSONException e4) {
                            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e4);
                        }
                    }
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                } finally {
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused11) {
                    }
                }
            } catch (IOException | JSONException e5) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e5);
            }
        }
        str4 = AbstractC1630b.alpha(charlie);
        httpURLConnection.setRequestProperty("X-Android-Cert", str4);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty(CtApi.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        while (r0.hasNext()) {
        }
        delta(httpURLConnection, alpha(str, str2, map, l10, map3).toString().getBytes("utf-8"));
        httpURLConnection.connect();
        responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
        }
    }
}
