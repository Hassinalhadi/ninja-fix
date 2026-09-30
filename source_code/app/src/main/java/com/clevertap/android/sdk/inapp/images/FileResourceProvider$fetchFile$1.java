package com.clevertap.android.sdk.inapp.images;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FileResourceProvider$fetchFile$1 extends i implements Function1<String, byte[]> {
    public FileResourceProvider$fetchFile$1(Object obj) {
        super(1, 0, FileResourceProvider.class, obj, "cachedFileInBytes", "cachedFileInBytes(Ljava/lang/String;)[B");
    }

    @Override // kotlin.jvm.functions.Function1
    public final byte[] invoke(String str) {
        return ((FileResourceProvider) this.receiver).cachedFileInBytes(str);
    }
}
