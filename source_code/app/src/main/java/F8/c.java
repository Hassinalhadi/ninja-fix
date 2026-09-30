package F8;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.P0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import j2.AbstractC1936c;
import j2.InterfaceC1935b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public boolean alpha;
    public final Object bravo;
    public final Object charlie;
    public final Object delta;
    public final Object echo;
    public final Object foxtrot;
    public Object golf;
    public Serializable hotel;

    public c(HttpURLConnection httpURLConnection, j jVar, e eVar, LinkedHashSet linkedHashSet, l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.charlie = httpURLConnection;
        this.delta = jVar;
        this.echo = eVar;
        this.bravo = linkedHashSet;
        this.foxtrot = lVar;
        this.golf = scheduledExecutorService;
        this.hotel = new Random();
        this.alpha = false;
    }

    public void alpha(int i4, long j5) {
        if (i4 == 0) {
            new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", E8.c.silver);
            echo();
            return;
        }
        ((ScheduledExecutorService) this.golf).schedule(new b(this, i4, j5), ((Random) this.hotel).nextInt(4), TimeUnit.SECONDS);
    }

    public void bravo(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = P0.crimson(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                    str = "";
                } else {
                    str = str.substring(indexOf, lastIndexOf + 1);
                }
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e) {
                        new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause(), E8.c.red);
                        echo();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        l lVar = (l) this.foxtrot;
                        new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", E8.c.teal);
                        lVar.alpha();
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((LinkedHashSet) this.bravo).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j5 = ((j) this.delta).golf.alpha.getLong("last_template_version", 0L);
                        long j6 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j6 > j5) {
                            alpha(3, j6);
                        }
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public void charlie() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.charlie;
        if (httpURLConnection != null) {
            InputStream inputStream = null;
            try {
                try {
                    try {
                        inputStream = httpURLConnection.getInputStream();
                        bravo(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e) {
                        Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                    }
                } catch (IOException e4) {
                    if (!this.alpha) {
                        Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e4);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e5);
                    }
                }
                throw th;
            }
        }
    }

    public FileInputStream delta(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((InterfaceC1935b) this.charlie).lima();
                return null;
            }
            return null;
        }
    }

    public synchronized void echo() {
        Iterator it = ((LinkedHashSet) this.bravo).iterator();
        while (it.hasNext()) {
            ((l) it.next()).alpha();
        }
    }

    public void foxtrot(int i4, Serializable serializable) {
        ((Executor) this.bravo).execute(new ae.l(i4, 6, this, serializable));
    }

    public c(AssetManager assetManager, Executor executor, InterfaceC1935b interfaceC1935b, String str, File file) {
        this.alpha = false;
        this.bravo = executor;
        this.charlie = interfaceC1935b;
        this.foxtrot = str;
        this.echo = file;
        int i4 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i4 >= 24) {
            if (i4 >= 31) {
                bArr = AbstractC1936c.delta;
            } else {
                switch (i4) {
                    case 24:
                    case 25:
                        bArr = AbstractC1936c.hotel;
                        break;
                    case 26:
                        bArr = AbstractC1936c.golf;
                        break;
                    case 27:
                        bArr = AbstractC1936c.foxtrot;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = AbstractC1936c.echo;
                        break;
                }
            }
        }
        this.delta = bArr;
    }
}
