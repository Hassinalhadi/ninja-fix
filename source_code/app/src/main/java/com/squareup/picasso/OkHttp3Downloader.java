package com.squareup.picasso;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class OkHttp3Downloader implements Downloader {
    private final okhttp3.Cache cache;
    final Call.Factory client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.Downloader
    public Response load(okhttp3.Request request) throws IOException {
        return FirebasePerfOkHttpClient.execute(this.client.newCall(request));
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        okhttp3.Cache cache;
        if (!this.sharedClient && (cache = this.cache) != null) {
            try {
                cache.close();
            } catch (IOException unused) {
            }
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j5) {
        this(Utils.createDefaultCacheDir(context), j5);
    }

    public OkHttp3Downloader(File file, long j5) {
        this(new OkHttpClient.Builder().cache(new okhttp3.Cache(file, j5)).build());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(OkHttpClient okHttpClient) {
        this.sharedClient = true;
        this.client = okHttpClient;
        this.cache = okHttpClient.cache();
    }

    public OkHttp3Downloader(Call.Factory factory) {
        this.sharedClient = true;
        this.client = factory;
        this.cache = null;
    }
}
