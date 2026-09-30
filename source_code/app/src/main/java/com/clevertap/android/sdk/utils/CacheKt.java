package com.clevertap.android.sdk.utils;

import android.graphics.Bitmap;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"sizeInKb", "", "", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheKt {
    public static final int sizeInKb(@Nullable Object obj) {
        if (obj instanceof Bitmap) {
            return ((Bitmap) obj).getByteCount() / Barcode.FORMAT_UPC_E;
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj).length / Barcode.FORMAT_UPC_E;
        }
        return 1;
    }
}
