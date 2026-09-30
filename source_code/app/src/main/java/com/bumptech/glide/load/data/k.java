package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import av.q;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k implements e {
    public final J3.h alpha;
    public final int purple;
    public HttpURLConnection red;
    public InputStream silver;
    public volatile boolean teal;

    public k(J3.h hVar, int i4) {
        this.alpha = hVar;
        this.purple = i4;
    }

    public static int bravo(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.teal = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final E3.a charlie() {
        return E3.a.purple;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        InputStream inputStream = this.silver;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.red;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.red = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void delta(com.bumptech.glide.g gVar, d dVar) {
        J3.h hVar = this.alpha;
        int i4 = Y3.h.bravo;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.echo(echo(hVar.delta(), 0, null, hVar.bravo.bravo()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + Y3.h.alpha(elapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                dVar.bravo(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + Y3.h.alpha(elapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + Y3.h.alpha(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream echo(URL url, int i4, URL url2, Map map) {
        if (i4 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i5 = this.purple;
                httpURLConnection.setConnectTimeout(i5);
                httpURLConnection.setReadTimeout(i5);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.red = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.silver = this.red.getInputStream();
                    if (this.teal) {
                        return null;
                    }
                    int bravo = bravo(this.red);
                    int i10 = bravo / 100;
                    if (i10 == 2) {
                        HttpURLConnection httpURLConnection2 = this.red;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.silver = new Y3.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.silver = httpURLConnection2.getInputStream();
                            }
                            return this.silver;
                        } catch (IOException e) {
                            throw new HttpException("Failed to obtain InputStream", bravo(httpURLConnection2), e);
                        }
                    }
                    if (i10 == 3) {
                        String headerField = this.red.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                cleanup();
                                return echo(url3, i4 + 1, url, map);
                            } catch (MalformedURLException e4) {
                                throw new HttpException(q.echo("Bad redirect url: ", headerField), bravo, e4);
                            }
                        }
                        throw new HttpException("Received empty or null redirect url", bravo);
                    }
                    if (bravo == -1) {
                        throw new HttpException(bravo);
                    }
                    try {
                        throw new HttpException(this.red.getResponseMessage(), bravo);
                    } catch (IOException e5) {
                        throw new HttpException("Failed to get a response message", bravo, e5);
                    }
                } catch (IOException e10) {
                    throw new HttpException("Failed to connect or obtain data", bravo(this.red), e10);
                }
            } catch (IOException e11) {
                throw new HttpException("URL.openConnection threw", 0, e11);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }
}
