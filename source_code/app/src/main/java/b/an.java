package b;

import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public abstract class an {
    public static final float alpha = ViewConfiguration.getScrollFriction();
    public static final double bravo;
    public static final double charlie;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        bravo = log;
        charlie = log - 1.0d;
    }
}
