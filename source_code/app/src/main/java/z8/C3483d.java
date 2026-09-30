package z8;

import android.app.ActivityManager;
import android.content.Context;
import u8.C3146a;

/* renamed from: z8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3483d {
    public final Runtime alpha = Runtime.getRuntime();
    public final ActivityManager bravo;
    public final ActivityManager.MemoryInfo charlie;

    static {
        C3146a.delta();
    }

    public C3483d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.bravo = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.charlie = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
