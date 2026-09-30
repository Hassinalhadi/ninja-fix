package com.google.firebase.messaging;

import B9.ab;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class t {
    public static WeakReference delta;
    public final SharedPreferences alpha;
    public ab bravo;
    public final ScheduledThreadPoolExecutor charlie;

    public t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.charlie = scheduledThreadPoolExecutor;
        this.alpha = sharedPreferences;
    }

    public final synchronized s alpha() {
        s sVar;
        String green = this.bravo.green();
        Pattern pattern = s.delta;
        sVar = null;
        if (!TextUtils.isEmpty(green)) {
            String[] split = green.split("!", -1);
            if (split.length == 2) {
                sVar = new s(split[0], split[1]);
            }
        }
        return sVar;
    }

    public final synchronized void bravo() {
        this.bravo = ab.zulu(this.alpha, this.charlie);
    }

    public final synchronized void charlie(s sVar) {
        this.bravo.ivory(sVar.charlie);
    }
}
