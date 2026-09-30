package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003"}, d2 = {"com/fingerprintjs/android/fpjs_pro_internal/copy$D8871", "", "a", "Lcom/fingerprintjs/android/fpjs_pro_internal/copy$D8871$a;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class copy$D8871 {
    public static int alpha;
    public static int bravo;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/copy$D8871$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/copy$D8871;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends copy$D8871 {

        @NotNull
        public static final a charlie = new copy$D8871(null);
    }

    public copy$D8871(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static int component5() {
        int i4 = alpha;
        int i5 = i4 % 8702024;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int myPid = Process.myPid();
        bravo = myPid;
        return myPid;
    }
}
