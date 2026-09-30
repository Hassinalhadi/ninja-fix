package H3;

import Aa.m;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes3.dex */
public final class d {
    public static final int echo;
    public final Context alpha;
    public final ActivityManager bravo;
    public final m charlie;
    public final float delta;

    static {
        int i4;
        if (Build.VERSION.SDK_INT < 26) {
            i4 = 4;
        } else {
            i4 = 1;
        }
        echo = i4;
    }

    public d(Context context) {
        this.delta = echo;
        this.alpha = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.bravo = activityManager;
        this.charlie = new m(15, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.delta = 0.0f;
        }
    }
}
