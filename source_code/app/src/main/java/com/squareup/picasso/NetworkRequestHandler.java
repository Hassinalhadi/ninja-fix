package com.squareup.picasso;

import android.net.NetworkInfo;
import ao.ad;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    /* loaded from: classes2.dex */
    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        public ResponseException(int i4, int i5) {
            super(ad.zulu(i4, "HTTP "));
            this.code = i4;
            this.networkPolicy = i5;
        }
    }

    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static okhttp3.Request createRequest(Request request, int i4) {
        CacheControl cacheControl;
        if (i4 != 0) {
            if (NetworkPolicy.isOfflineOnly(i4)) {
                cacheControl = CacheControl.FORCE_CACHE;
            } else {
                CacheControl.Builder builder = new CacheControl.Builder();
                if (!NetworkPolicy.shouldReadFromDiskCache(i4)) {
                    builder.noCache();
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i4)) {
                    builder.noStore();
                }
                cacheControl = builder.build();
            }
        } else {
            cacheControl = null;
        }
        Request.Builder url = new Request.Builder().url(request.uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        if (!SCHEME_HTTP.equals(scheme) && !SCHEME_HTTPS.equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.RequestHandler
    public int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i4) throws IOException {
        Picasso.LoadedFrom loadedFrom;
        Response load = this.downloader.load(createRequest(request, i4));
        ResponseBody body = load.body();
        if (load.getIsSuccessful()) {
            if (load.cacheResponse() == null) {
                loadedFrom = Picasso.LoadedFrom.NETWORK;
            } else {
                loadedFrom = Picasso.LoadedFrom.DISK;
            }
            if (loadedFrom == Picasso.LoadedFrom.DISK && body.getContentLength() == 0) {
                body.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && body.getContentLength() > 0) {
                this.stats.dispatchDownloadFinished(body.getContentLength());
            }
            return new RequestHandler.Result(body.getBodySource(), loadedFrom);
        }
        body.close();
        throw new ResponseException(load.code(), request.networkPolicy);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean shouldRetry(boolean z2, NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean supportsReplay() {
        return true;
    }
}
