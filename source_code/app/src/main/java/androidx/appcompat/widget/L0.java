package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class L0 {
    public Method alpha;
    public Method bravo;
    public Method charlie;

    public static void alpha() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
