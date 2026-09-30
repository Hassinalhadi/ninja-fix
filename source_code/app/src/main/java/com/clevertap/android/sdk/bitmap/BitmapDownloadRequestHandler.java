package com.clevertap.android.sdk.bitmap;

import android.content.Context;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.DownloadedBitmapFactory;
import com.clevertap.android.sdk.network.NetworkManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/bitmap/BitmapDownloadRequestHandler;", "Lcom/clevertap/android/sdk/bitmap/IBitmapDownloadRequestHandler;", "bitmapDownloader", "Lcom/clevertap/android/sdk/bitmap/BitmapDownloader;", "<init>", "(Lcom/clevertap/android/sdk/bitmap/BitmapDownloader;)V", "handleRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/bitmap/BitmapDownloadRequest;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BitmapDownloadRequestHandler implements IBitmapDownloadRequestHandler {

    @NotNull
    private final BitmapDownloader bitmapDownloader;

    public BitmapDownloadRequestHandler(@NotNull BitmapDownloader bitmapDownloader) {
        Intrinsics.echo(bitmapDownloader, "bitmapDownloader");
        this.bitmapDownloader = bitmapDownloader;
    }

    @Override // com.clevertap.android.sdk.bitmap.IBitmapDownloadRequestHandler
    @NotNull
    public DownloadedBitmap handleRequest(@NotNull BitmapDownloadRequest bitmapDownloadRequest) {
        Intrinsics.echo(bitmapDownloadRequest, "bitmapDownloadRequest");
        Logger.v("handling bitmap download request in BitmapDownloadRequestHandler....");
        String bitmapPath = bitmapDownloadRequest.getBitmapPath();
        Context context = bitmapDownloadRequest.getContext();
        if (bitmapPath != null && !StringsKt.gray(bitmapPath)) {
            String oscar = r.oscar(r.oscar(r.oscar(r.oscar(bitmapPath, "///", "/"), "//", "/"), "http:/", "http://"), "https:/", "https://");
            if (context != null && !NetworkManager.INSTANCE.isNetworkOnline(context)) {
                Logger.v("Network connectivity unavailable. Not downloading bitmap. URL was: ".concat(oscar));
                return DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.NO_NETWORK);
            }
            return this.bitmapDownloader.downloadBitmap(oscar);
        }
        return DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.NO_IMAGE);
    }
}
