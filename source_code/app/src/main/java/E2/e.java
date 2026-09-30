package E2;

import android.app.job.JobParameters;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.RunnableC0534p;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class e {
    public static Handler alpha(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler bravo(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static List charlie(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] delta(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long echo(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Network foxtrot(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static int golf(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String hotel(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int india(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int juliet(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int kilo(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int lima(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int mike(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params november(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int oscar(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri papa(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean quebec(Handler handler, RunnableC0534p runnableC0534p, long j5) {
        return handler.postDelayed(runnableC0534p, "retry_token", j5);
    }

    public static void romeo(TextView textView, int i4) {
        textView.setFirstBaselineToTopHeight(i4);
    }

    public static boolean sierra(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
