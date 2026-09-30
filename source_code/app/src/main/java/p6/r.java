package p6;

import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class r {
    public static final SimpleDateFormat alpha;
    public static final StringBuilder bravo;

    static {
        Locale locale = Locale.ROOT;
        alpha = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        bravo = new StringBuilder(33);
    }

    public static void alpha(long j5, StringBuilder sb2) {
        if (j5 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z2 = false;
        if (j5 < 0) {
            sb2.append("-");
            if (j5 != Long.MIN_VALUE) {
                j5 = -j5;
            } else {
                j5 = Long.MAX_VALUE;
                z2 = true;
            }
        }
        if (j5 >= Constants.ONE_DAY_IN_MILLIS) {
            sb2.append(j5 / Constants.ONE_DAY_IN_MILLIS);
            sb2.append(Constants.INAPP_DATA_TAG);
            j5 %= Constants.ONE_DAY_IN_MILLIS;
        }
        if (true == z2) {
            j5 = 25975808;
        }
        if (j5 >= 3600000) {
            sb2.append(j5 / 3600000);
            sb2.append("h");
            j5 %= 3600000;
        }
        if (j5 >= 60000) {
            sb2.append(j5 / 60000);
            sb2.append("m");
            j5 %= 60000;
        }
        if (j5 >= 1000) {
            sb2.append(j5 / 1000);
            sb2.append("s");
            j5 %= 1000;
        }
        if (j5 > 0) {
            sb2.append(j5);
            sb2.append("ms");
        }
    }
}
