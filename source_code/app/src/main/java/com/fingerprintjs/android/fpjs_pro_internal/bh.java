package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.os.Process;
import com.fingerprintjs.android.fpjs_pro.raw_signal_providers.file_timestamps.FileTimestamps;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bh {
    public static int alpha;
    public static int bravo;

    public static int alpha() {
        int i4 = alpha;
        int i5 = i4 % 6439363;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int myPid = Process.myPid();
        bravo = myPid;
        return myPid;
    }

    @Nullable
    public final native String D8871();

    @Nullable
    public final native FileTimestamps component5(@NotNull String str);

    @Nullable
    public final native List<String> component9(@NotNull List<String> list);

    @Nullable
    public final native String setPivotYN16904(@NotNull Context context);

    @Nullable
    public final native Boolean vD14832N6715(@NotNull Context context, @NotNull String str);
}
