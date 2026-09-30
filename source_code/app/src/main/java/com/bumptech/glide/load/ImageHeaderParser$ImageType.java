package com.bumptech.glide.load;

import E3.d;

/* loaded from: classes3.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    public final boolean alpha;

    ImageHeaderParser$ImageType(boolean z2) {
        this.alpha = z2;
    }

    public boolean hasAlpha() {
        return this.alpha;
    }

    public boolean isWebp() {
        int i4 = d.alpha[ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return true;
        }
        return false;
    }
}
