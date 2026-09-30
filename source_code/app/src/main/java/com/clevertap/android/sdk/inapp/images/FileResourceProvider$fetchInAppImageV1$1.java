package com.clevertap.android.sdk.inapp.images;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FileResourceProvider$fetchInAppImageV1$1 extends i implements Function1<String, Bitmap> {
    public FileResourceProvider$fetchInAppImageV1$1(Object obj) {
        super(1, 0, FileResourceProvider.class, obj, "cachedInAppImageV1", "cachedInAppImageV1(Ljava/lang/String;)Landroid/graphics/Bitmap;");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Bitmap invoke(String str) {
        return ((FileResourceProvider) this.receiver).cachedInAppImageV1(str);
    }
}
