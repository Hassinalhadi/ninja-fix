package B8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] alpha;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        alpha = iArr;
        try {
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            alpha[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            alpha[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
