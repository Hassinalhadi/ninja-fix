package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/ActivityManager;", "alpha", "()Landroid/app/ActivityManager;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class as extends Lambda implements Function0<ActivityManager> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ Context alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(Context context) {
        super(0);
        this.alpha = context;
    }

    @Nullable
    public final ActivityManager alpha() {
        red = (purple + 101) % 128;
        Object systemService = this.alpha.getSystemService("activity");
        if (!(systemService instanceof ActivityManager)) {
            int i4 = red;
            int i5 = ((i4 | 121) << 1) - (i4 ^ 121);
            purple = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i10 = purple;
        int i11 = i10 + 15;
        red = i11 % 128;
        ActivityManager activityManager = (ActivityManager) systemService;
        if (i11 % 2 == 0) {
            int i12 = 32 / 0;
        }
        red = (i10 + 119) % 128;
        return activityManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ ActivityManager invoke() {
        red = (purple + 83) % 128;
        ActivityManager alpha = alpha();
        int i4 = purple;
        red = (((i4 | 1) << 1) - (i4 ^ 1)) % 128;
        return alpha;
    }
}
