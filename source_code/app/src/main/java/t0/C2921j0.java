package t0;

import android.view.MotionEvent;
import com.airbnb.lottie.compose.LottieConstants;
import org.jetbrains.annotations.NotNull;

/* renamed from: t0.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2921j0 {
    public static final C2921j0 alpha = new Object();

    public final boolean alpha(@NotNull MotionEvent motionEvent, int i4) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i4);
        if ((Float.floatToRawIntBits(rawX) & LottieConstants.IterateForever) < 2139095040) {
            rawY = motionEvent.getRawY(i4);
            if ((Float.floatToRawIntBits(rawY) & LottieConstants.IterateForever) < 2139095040) {
                return true;
            }
            return false;
        }
        return false;
    }
}
