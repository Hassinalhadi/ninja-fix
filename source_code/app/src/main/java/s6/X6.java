package s6;

import com.airbnb.lottie.compose.LottieConstants;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class X6 {
    public static long alpha(int i4, int i5, int i10, int i11) {
        int min;
        int i12;
        int i13 = 262142;
        int min2 = Math.min(i10, 262142);
        int i14 = LottieConstants.IterateForever;
        if (i11 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i11, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i12 = min2;
        } else {
            i12 = min;
        }
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i13 = 65534;
            } else if (i12 < 65535) {
                i13 = 32766;
            } else if (i12 < 262143) {
                i13 = 8190;
            } else {
                Q0.b.lima(i12);
                throw new KotlinNothingValueException();
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            i14 = Math.min(i13, i5);
        }
        return Q0.b.alpha(Math.min(i13, i4), i14, min2, min);
    }

    public static long bravo(int i4, int i5, int i10, int i11) {
        int min;
        int i12;
        int i13 = 262142;
        int min2 = Math.min(i4, 262142);
        int i14 = LottieConstants.IterateForever;
        if (i5 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i5, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i12 = min2;
        } else {
            i12 = min;
        }
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i13 = 65534;
            } else if (i12 < 65535) {
                i13 = 32766;
            } else if (i12 < 262143) {
                i13 = 8190;
            } else {
                Q0.b.lima(i12);
                throw new KotlinNothingValueException();
            }
        }
        if (i11 != Integer.MAX_VALUE) {
            i14 = Math.min(i13, i11);
        }
        return Q0.b.alpha(min2, min, Math.min(i13, i10), i14);
    }

    public static final void charlie(String key) {
        Intrinsics.echo(key, "key");
        throw new IllegalArgumentException(ao.ad.gray("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
