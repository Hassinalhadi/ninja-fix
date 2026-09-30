package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a extends Thread {
    public final /* synthetic */ HashMap alpha;

    public a(HashMap hashMap) {
        this.alpha = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.alpha;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(uri);
                    Log.w("HttpUrlPinger", sb2.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
            sb3.append("Error while pinging URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message);
            Log.w("HttpUrlPinger", sb3.toString(), e);
        } catch (IndexOutOfBoundsException e4) {
            String message2 = e4.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
            sb4.append("Error while parsing ping URL: ");
            sb4.append(uri);
            sb4.append(". ");
            sb4.append(message2);
            Log.w("HttpUrlPinger", sb4.toString(), e4);
        } catch (RuntimeException e5) {
            e = e5;
            String message3 = e.getMessage();
            StringBuilder sb32 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
            sb32.append("Error while pinging URL: ");
            sb32.append(uri);
            sb32.append(". ");
            sb32.append(message3);
            Log.w("HttpUrlPinger", sb32.toString(), e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
