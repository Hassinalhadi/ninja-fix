package vg;

import android.os.Build;
import o1.ExecutorC2190c;

/* loaded from: classes2.dex */
public abstract class aj {
    public static final ExecutorC2190c alpha;
    public static final C3222a bravo;
    public static final C3222a charlie;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (!property.equals("RoboVM")) {
            if (!property.equals("Dalvik")) {
                alpha = null;
                bravo = new ak(1);
                charlie = new C3222a(6);
                return;
            }
            alpha = new ExecutorC2190c();
            if (Build.VERSION.SDK_INT >= 24) {
                bravo = new ak(0);
                charlie = new C3222a(6);
                return;
            } else {
                bravo = new C3222a(7);
                charlie = new C3222a(6);
                return;
            }
        }
        alpha = null;
        bravo = new C3222a(7);
        charlie = new C3222a(6);
    }
}
