package com.clevertap.android.sdk.bitmap;

import B2.ai;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.DownloadedBitmapFactory;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/clevertap/android/sdk/bitmap/BitmapDownloadRequestHandlerWithTimeLimit;", "Lcom/clevertap/android/sdk/bitmap/IBitmapDownloadRequestHandler;", "iBitmapDownloadRequestHandler", "<init>", "(Lcom/clevertap/android/sdk/bitmap/IBitmapDownloadRequestHandler;)V", "handleRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/bitmap/BitmapDownloadRequest;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapDownloadRequestHandlerWithTimeLimit implements IBitmapDownloadRequestHandler {

    @NotNull
    private final IBitmapDownloadRequestHandler iBitmapDownloadRequestHandler;

    public BitmapDownloadRequestHandlerWithTimeLimit(@NotNull IBitmapDownloadRequestHandler iBitmapDownloadRequestHandler) {
        Intrinsics.echo(iBitmapDownloadRequestHandler, "iBitmapDownloadRequestHandler");
        this.iBitmapDownloadRequestHandler = iBitmapDownloadRequestHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadedBitmap handleRequest$lambda$0(BitmapDownloadRequestHandlerWithTimeLimit this$0, BitmapDownloadRequest bitmapDownloadRequest) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(bitmapDownloadRequest, "$bitmapDownloadRequest");
        return this$0.iBitmapDownloadRequestHandler.handleRequest(bitmapDownloadRequest);
    }

    @Override // com.clevertap.android.sdk.bitmap.IBitmapDownloadRequestHandler
    @NotNull
    public DownloadedBitmap handleRequest(@NotNull BitmapDownloadRequest bitmapDownloadRequest) {
        Intrinsics.echo(bitmapDownloadRequest, "bitmapDownloadRequest");
        Logger.v("handling bitmap download request in BitmapDownloadRequestHandlerWithTimeLimit....");
        boolean fallbackToAppIcon = bitmapDownloadRequest.getFallbackToAppIcon();
        Context context = bitmapDownloadRequest.getContext();
        CleverTapInstanceConfig instanceConfig = bitmapDownloadRequest.getInstanceConfig();
        long downloadTimeLimitInMillis = bitmapDownloadRequest.getDownloadTimeLimitInMillis();
        if (instanceConfig != null && downloadTimeLimitInMillis != -1) {
            Task ioTask = CTExecutorFactory.executors(instanceConfig).ioTask();
            Intrinsics.delta(ioTask, "ioTask(...)");
            DownloadedBitmap downloadedBitmap = (DownloadedBitmap) ioTask.submitAndGetResult("getNotificationBitmap", new ai(7, this, bitmapDownloadRequest), downloadTimeLimitInMillis);
            if (downloadedBitmap == null) {
                downloadedBitmap = DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.DOWNLOAD_FAILED);
            }
            DownloadedBitmap downloadedBitmapPostFallbackIconCheck = Utils.getDownloadedBitmapPostFallbackIconCheck(fallbackToAppIcon, context, downloadedBitmap);
            Intrinsics.delta(downloadedBitmapPostFallbackIconCheck, "getDownloadedBitmapPostFallbackIconCheck(...)");
            return downloadedBitmapPostFallbackIconCheck;
        }
        Logger.v("either config is null or downloadTimeLimitInMillis is negative.");
        Logger.v("will download bitmap without time limit");
        return this.iBitmapDownloadRequestHandler.handleRequest(bitmapDownloadRequest);
    }
}
