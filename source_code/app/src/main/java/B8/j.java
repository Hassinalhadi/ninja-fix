package B8;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import u8.C3146a;

/* loaded from: classes2.dex */
public abstract class j {
    public static Boolean alpha;

    public static boolean alpha(Context context) {
        Boolean bool = alpha;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            alpha = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C3146a.delta().alpha("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static int bravo(long j5) {
        if (j5 > 2147483647L) {
            return LottieConstants.IterateForever;
        }
        if (j5 < -2147483648L) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return (int) j5;
    }
}
