package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s implements E3.e {
    @Override // E3.e
    public final ImageHeaderParser$ImageType alpha(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // E3.e
    public final int bravo(ByteBuffer byteBuffer, G3.g gVar) {
        AtomicReference atomicReference = Y3.b.alpha;
        return delta(new Y3.a(byteBuffer), gVar);
    }

    @Override // E3.e
    public final ImageHeaderParser$ImageType charlie(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // E3.e
    public final int delta(InputStream inputStream, G3.g gVar) {
        int charlie = new M1.g(inputStream).charlie(1, "Orientation");
        if (charlie == 0) {
            return -1;
        }
        return charlie;
    }
}
