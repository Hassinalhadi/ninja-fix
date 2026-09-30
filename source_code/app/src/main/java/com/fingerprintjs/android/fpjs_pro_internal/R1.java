package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.os.SystemClock;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class R1 extends Lambda implements Function1<SafeWithTimeoutProContext, Long> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ Location alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(Location location) {
        super(1);
        this.alpha = location;
    }

    @NotNull
    public final Long alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = red + 55;
        purple = i4 % 128;
        int i5 = i4 % 2;
        Location location = this.alpha;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos();
        if (i5 != 0) {
            return Long.valueOf(1000000 | (elapsedRealtimeNanos % elapsedRealtimeNanos2));
        }
        return Long.valueOf((elapsedRealtimeNanos - elapsedRealtimeNanos2) / 1000000);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Long invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = red;
        purple = ((i4 & 51) + (i4 | 51)) % 128;
        Long alpha = alpha(safeWithTimeoutProContext);
        int i5 = purple;
        red = (((i5 | 31) << 1) - (i5 ^ 31)) % 128;
        return alpha;
    }
}
