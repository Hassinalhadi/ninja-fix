package com.clevertap.android.sdk.inapp.images;

import com.clevertap.android.sdk.network.DownloadedBitmap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FileResourceProvider$fetchFile$2 extends i implements Function1<DownloadedBitmap, Pair<? extends byte[], ? extends byte[]>> {
    public FileResourceProvider$fetchFile$2(Object obj) {
        super(1, 0, FileResourceProvider.class, obj, "downloadedBytesFromApi", "downloadedBytesFromApi(Lcom/clevertap/android/sdk/network/DownloadedBitmap;)Lkotlin/Pair;");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<byte[], byte[]> invoke(DownloadedBitmap p02) {
        Pair<byte[], byte[]> downloadedBytesFromApi;
        Intrinsics.echo(p02, "p0");
        downloadedBytesFromApi = ((FileResourceProvider) this.receiver).downloadedBytesFromApi(p02);
        return downloadedBytesFromApi;
    }
}
