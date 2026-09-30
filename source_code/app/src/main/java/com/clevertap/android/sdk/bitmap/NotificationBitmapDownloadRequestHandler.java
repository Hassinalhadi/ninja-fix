package com.clevertap.android.sdk.bitmap;

import android.content.Context;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.DownloadedBitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/clevertap/android/sdk/bitmap/NotificationBitmapDownloadRequestHandler;", "Lcom/clevertap/android/sdk/bitmap/IBitmapDownloadRequestHandler;", "iBitmapDownloadRequestHandler", "<init>", "(Lcom/clevertap/android/sdk/bitmap/IBitmapDownloadRequestHandler;)V", "handleRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/bitmap/BitmapDownloadRequest;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationBitmapDownloadRequestHandler implements IBitmapDownloadRequestHandler {

    @NotNull
    private final IBitmapDownloadRequestHandler iBitmapDownloadRequestHandler;

    public NotificationBitmapDownloadRequestHandler(@NotNull IBitmapDownloadRequestHandler iBitmapDownloadRequestHandler) {
        Intrinsics.echo(iBitmapDownloadRequestHandler, "iBitmapDownloadRequestHandler");
        this.iBitmapDownloadRequestHandler = iBitmapDownloadRequestHandler;
    }

    @Override // com.clevertap.android.sdk.bitmap.IBitmapDownloadRequestHandler
    @NotNull
    public DownloadedBitmap handleRequest(@NotNull BitmapDownloadRequest bitmapDownloadRequest) {
        Intrinsics.echo(bitmapDownloadRequest, "bitmapDownloadRequest");
        Logger.v("handling bitmap download request in NotificationBitmapDownloadRequestHandler....");
        String bitmapPath = bitmapDownloadRequest.getBitmapPath();
        boolean fallbackToAppIcon = bitmapDownloadRequest.getFallbackToAppIcon();
        Context context = bitmapDownloadRequest.getContext();
        if (bitmapPath != null && !StringsKt.gray(bitmapPath)) {
            DownloadedBitmap downloadedBitmapPostFallbackIconCheck = Utils.getDownloadedBitmapPostFallbackIconCheck(fallbackToAppIcon, context, this.iBitmapDownloadRequestHandler.handleRequest(bitmapDownloadRequest));
            Intrinsics.delta(downloadedBitmapPostFallbackIconCheck, "getDownloadedBitmapPostFallbackIconCheck(...)");
            return downloadedBitmapPostFallbackIconCheck;
        }
        DownloadedBitmap downloadedBitmapPostFallbackIconCheck2 = Utils.getDownloadedBitmapPostFallbackIconCheck(fallbackToAppIcon, context, DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.NO_IMAGE));
        Intrinsics.delta(downloadedBitmapPostFallbackIconCheck2, "getDownloadedBitmapPostFallbackIconCheck(...)");
        return downloadedBitmapPostFallbackIconCheck2;
    }
}
