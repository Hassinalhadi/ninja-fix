package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class t extends d {
    public static final byte[] bravo = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(E3.f.alpha);

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        messageDigest.update(bravo);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.d
    public final Bitmap charlie(G3.b bVar, Bitmap bitmap, int i4, int i5) {
        return y.bravo(bVar, bitmap, i4, i5);
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // E3.f
    public final int hashCode() {
        return 1572326941;
    }
}
