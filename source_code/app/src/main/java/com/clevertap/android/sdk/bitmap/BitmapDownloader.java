package com.clevertap.android.sdk.bitmap;

import android.net.TrafficStats;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.DownloadedBitmapFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/clevertap/android/sdk/bitmap/BitmapDownloader;", "", "httpUrlConnectionParams", "Lcom/clevertap/android/sdk/bitmap/HttpUrlConnectionParams;", "bitmapInputStreamReader", "Lcom/clevertap/android/sdk/bitmap/IBitmapInputStreamReader;", "sizeConstrainedPair", "Lkotlin/Pair;", "", "", "<init>", "(Lcom/clevertap/android/sdk/bitmap/HttpUrlConnectionParams;Lcom/clevertap/android/sdk/bitmap/IBitmapInputStreamReader;Lkotlin/Pair;)V", "downloadStartTimeInMilliseconds", "", "connection", "Ljava/net/HttpURLConnection;", "srcUrl", "", "downloadBitmap", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "createConnection", Constants.KEY_URL, "Ljava/net/URL;", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapDownloader {
    public static final int NETWORK_TAG_DOWNLOAD_REQUESTS = 21;

    @NotNull
    private final IBitmapInputStreamReader bitmapInputStreamReader;
    private HttpURLConnection connection;
    private long downloadStartTimeInMilliseconds;

    @NotNull
    private final HttpUrlConnectionParams httpUrlConnectionParams;

    @NotNull
    private final Pair<Boolean, Integer> sizeConstrainedPair;
    private String srcUrl;

    public BitmapDownloader(@NotNull HttpUrlConnectionParams httpUrlConnectionParams, @NotNull IBitmapInputStreamReader bitmapInputStreamReader, @NotNull Pair<Boolean, Integer> sizeConstrainedPair) {
        Intrinsics.echo(httpUrlConnectionParams, "httpUrlConnectionParams");
        Intrinsics.echo(bitmapInputStreamReader, "bitmapInputStreamReader");
        Intrinsics.echo(sizeConstrainedPair, "sizeConstrainedPair");
        this.httpUrlConnectionParams = httpUrlConnectionParams;
        this.bitmapInputStreamReader = bitmapInputStreamReader;
        this.sizeConstrainedPair = sizeConstrainedPair;
    }

    private final HttpURLConnection createConnection(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Intrinsics.charlie(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setConnectTimeout(this.httpUrlConnectionParams.getConnectTimeout());
        httpURLConnection.setReadTimeout(this.httpUrlConnectionParams.getReadTimeout());
        httpURLConnection.setUseCaches(this.httpUrlConnectionParams.getUseCaches());
        httpURLConnection.setDoInput(this.httpUrlConnectionParams.getDoInput());
        for (Map.Entry<String, String> entry : this.httpUrlConnectionParams.getRequestMap().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }

    @NotNull
    public final DownloadedBitmap downloadBitmap(@NotNull String srcUrl) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        DownloadedBitmap readInputStream;
        HttpURLConnection httpURLConnection3;
        Intrinsics.echo(srcUrl, "srcUrl");
        Logger.v("initiating bitmap download in BitmapDownloader....");
        this.srcUrl = srcUrl;
        this.downloadStartTimeInMilliseconds = Utils.getNowInMillis();
        try {
            TrafficStats.setThreadStatsTag(21);
            HttpURLConnection createConnection = createConnection(new URL(srcUrl));
            this.connection = createConnection;
            if (createConnection != null) {
                createConnection.connect();
                if (createConnection.getResponseCode() != 200) {
                    Logger.d("File not loaded completely not going forward. URL was: ".concat(srcUrl));
                    readInputStream = DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.DOWNLOAD_FAILED);
                    httpURLConnection3 = this.connection;
                    if (httpURLConnection3 == null) {
                        Intrinsics.lima("connection");
                        throw null;
                    }
                } else {
                    Logger.v("Downloading " + srcUrl + "....");
                    int contentLength = createConnection.getContentLength();
                    Pair<Boolean, Integer> pair = this.sizeConstrainedPair;
                    boolean booleanValue = ((Boolean) pair.first).booleanValue();
                    int intValue = ((Number) pair.second).intValue();
                    if (booleanValue && contentLength > intValue) {
                        Logger.v("Image size is larger than " + intValue + " bytes. Cancelling download!");
                        readInputStream = DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.SIZE_LIMIT_EXCEEDED);
                        httpURLConnection3 = this.connection;
                        if (httpURLConnection3 == null) {
                            Intrinsics.lima("connection");
                            throw null;
                        }
                    } else {
                        IBitmapInputStreamReader iBitmapInputStreamReader = this.bitmapInputStreamReader;
                        InputStream inputStream = createConnection.getInputStream();
                        Intrinsics.delta(inputStream, "getInputStream(...)");
                        readInputStream = iBitmapInputStreamReader.readInputStream(inputStream, createConnection, this.downloadStartTimeInMilliseconds);
                        httpURLConnection3 = this.connection;
                        if (httpURLConnection3 == null) {
                            Intrinsics.lima("connection");
                            throw null;
                        }
                    }
                }
                httpURLConnection3.disconnect();
                TrafficStats.clearThreadStatsTag();
                return readInputStream;
            }
            Intrinsics.lima("connection");
            throw null;
        } catch (Throwable th) {
            try {
                Logger.v("Couldn't download the notification media. URL was: ".concat(srcUrl));
                th.printStackTrace();
                DownloadedBitmap nullBitmapWithStatus = DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.DOWNLOAD_FAILED);
                try {
                    httpURLConnection2 = this.connection;
                } catch (Throwable th2) {
                    Logger.v("Couldn't close connection!", th2);
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return nullBitmapWithStatus;
                }
                Intrinsics.lima("connection");
                throw null;
            } catch (Throwable th3) {
                try {
                    httpURLConnection = this.connection;
                } catch (Throwable th4) {
                    Logger.v("Couldn't close connection!", th4);
                }
                if (httpURLConnection == null) {
                    Intrinsics.lima("connection");
                    throw null;
                }
                httpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th3;
            }
        }
    }

    public /* synthetic */ BitmapDownloader(HttpUrlConnectionParams httpUrlConnectionParams, IBitmapInputStreamReader iBitmapInputStreamReader, Pair pair, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrlConnectionParams, iBitmapInputStreamReader, (i4 & 4) != 0 ? new Pair(Boolean.FALSE, 0) : pair);
    }
}
