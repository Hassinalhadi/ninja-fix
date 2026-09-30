package com.google.firebase.perf.network;

import A8.h;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import v8.d;
import x8.c;
import x8.g;

/* loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        h hVar = h.f18l;
        Timer timer = new Timer();
        timer.echo();
        long j5 = timer.alpha;
        d dVar = new d(hVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new x8.d((HttpsURLConnection) openConnection, timer, dVar).alpha.bravo();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, timer, dVar).alpha.bravo();
            }
            return openConnection.getContent();
        } catch (IOException e) {
            dVar.hotel(j5);
            dVar.kilo(timer.charlie());
            dVar.lima(url.toString());
            g.charlie(dVar);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new x8.d((HttpsURLConnection) obj, new Timer(), new d(h.f18l));
        }
        if (obj instanceof HttpURLConnection) {
            return new c((HttpURLConnection) obj, new Timer(), new d(h.f18l));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        h hVar = h.f18l;
        Timer timer = new Timer();
        if (!hVar.red.get()) {
            return url.openConnection().getInputStream();
        }
        timer.echo();
        long j5 = timer.alpha;
        d dVar = new d(hVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new x8.d((HttpsURLConnection) openConnection, timer, dVar).alpha.echo();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, timer, dVar).alpha.echo();
            }
            return openConnection.getInputStream();
        } catch (IOException e) {
            dVar.hotel(j5);
            dVar.kilo(timer.charlie());
            dVar.lima(url.toString());
            g.charlie(dVar);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        h hVar = h.f18l;
        Timer timer = new Timer();
        timer.echo();
        long j5 = timer.alpha;
        d dVar = new d(hVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new x8.d((HttpsURLConnection) openConnection, timer, dVar).alpha.charlie(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, timer, dVar).alpha.charlie(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            dVar.hotel(j5);
            dVar.kilo(timer.charlie());
            dVar.lima(url.toString());
            g.charlie(dVar);
            throw e;
        }
    }
}
