package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes3.dex */
public final class m {
    public static final m bravo = new m(2);
    public static final m charlie = new m(0);
    public static final m delta;
    public static final m echo;
    public static final m foxtrot;
    public static final E3.h golf;
    public static final boolean hotel;
    public final /* synthetic */ int alpha;

    static {
        m mVar = new m(1);
        delta = mVar;
        echo = new m(3);
        foxtrot = mVar;
        golf = E3.h.alpha(mVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        hotel = true;
    }

    public /* synthetic */ m(int i4) {
        this.alpha = i4;
    }

    public final int alpha(int i4, int i5, int i10, int i11) {
        switch (this.alpha) {
            case 0:
                if (bravo(i4, i5, i10, i11) == 1.0f) {
                    return 2;
                }
                return bravo.alpha(i4, i5, i10, i11);
            case 1:
                return 2;
            case 2:
                if (hotel) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    public final float bravo(int i4, int i5, int i10, int i11) {
        switch (this.alpha) {
            case 0:
                return Math.min(1.0f, bravo.bravo(i4, i5, i10, i11));
            case 1:
                return Math.max(i10 / i4, i11 / i5);
            case 2:
                if (hotel) {
                    return Math.min(i10 / i4, i11 / i5);
                }
                if (Math.max(i5 / i11, i4 / i10) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
