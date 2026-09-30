package com.fingerprintjs.android.fpjs_pro.tools.threading;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SafeWithTimeoutProContext {

    @NotNull
    public static final SafeWithTimeoutProContext INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext] */
    static {
        if ((((1 | 35) << 1) - (1 ^ 35)) % 2 != 0) {
            int i4 = 33 / 0;
        }
    }

    public static void alpha() {
        if (!Thread.interrupted()) {
        } else {
            throw new InterruptedException();
        }
    }
}
