package androidx.camera.core.impl;

import android.util.Size;
import com.google.maps.android.BuildConfig;

/* renamed from: androidx.camera.core.impl.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0510h {
    public final int alpha;
    public final U bravo;
    public final long charlie;

    public C0510h(int i4, U u4, long j5) {
        if (i4 != 0) {
            this.alpha = i4;
            this.bravo = u4;
            this.charlie = j5;
            return;
        }
        throw new NullPointerException("Null configType");
    }

    public static int alpha(int i4) {
        if (i4 == 35) {
            return 2;
        }
        if (i4 == 256) {
            return 3;
        }
        if (i4 == 4101) {
            return 4;
        }
        if (i4 == 32) {
            return 5;
        }
        return 1;
    }

    public static C0510h bravo(int i4, int i5, Size size, C0511i c0511i) {
        int alpha = alpha(i5);
        U u4 = U.NOT_SUPPORT;
        int alpha2 = bi.b.alpha(size);
        if (i4 == 1) {
            if (alpha2 <= bi.b.alpha((Size) c0511i.bravo.get(Integer.valueOf(i5)))) {
                u4 = U.s720p;
            } else {
                if (alpha2 <= bi.b.alpha((Size) c0511i.delta.get(Integer.valueOf(i5)))) {
                    u4 = U.s1440p;
                }
            }
        } else if (alpha2 <= bi.b.alpha(c0511i.alpha)) {
            u4 = U.VGA;
        } else if (alpha2 <= bi.b.alpha(c0511i.charlie)) {
            u4 = U.PREVIEW;
        } else if (alpha2 <= bi.b.alpha(c0511i.echo)) {
            u4 = U.RECORD;
        } else {
            if (alpha2 <= bi.b.alpha((Size) c0511i.foxtrot.get(Integer.valueOf(i5)))) {
                u4 = U.MAXIMUM;
            } else {
                Size size2 = (Size) c0511i.golf.get(Integer.valueOf(i5));
                if (size2 != null) {
                    if (alpha2 <= size2.getHeight() * size2.getWidth()) {
                        u4 = U.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new C0510h(alpha, u4, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0510h) {
                C0510h c0510h = (C0510h) obj;
                if (av.q.bravo(this.alpha, c0510h.alpha) && this.bravo.equals(c0510h.bravo) && this.charlie == c0510h.charlie) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int mike = (((av.q.mike(this.alpha) ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        long j5 = this.charlie;
        return mike ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("SurfaceConfig{configType=");
        int i4 = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            str = BuildConfig.TRAVIS;
                        } else {
                            str = "RAW";
                        }
                    } else {
                        str = "JPEG_R";
                    }
                } else {
                    str = "JPEG";
                }
            } else {
                str = "YUV";
            }
        } else {
            str = "PRIV";
        }
        sb2.append(str);
        sb2.append(", configSize=");
        sb2.append(this.bravo);
        sb2.append(", streamUseCase=");
        return Q0.c.mike(this.charlie, "}", sb2);
    }
}
