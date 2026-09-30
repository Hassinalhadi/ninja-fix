package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class m1 {
    public static boolean alpha;
    public static Method bravo;
    public static final boolean charlie;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 27) {
            z2 = true;
        } else {
            z2 = false;
        }
        charlie = z2;
    }
}
