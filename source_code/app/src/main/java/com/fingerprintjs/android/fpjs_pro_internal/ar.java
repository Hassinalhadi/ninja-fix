package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/ActivityManager;", "alpha", "()Landroid/app/ActivityManager;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class ar extends Lambda implements Function0<ActivityManager> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ Context alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(Context context) {
        super(0);
        this.alpha = context;
    }

    @NotNull
    public final ActivityManager alpha() {
        red = (purple + 109) % 128;
        ActivityManager activityManager = (ActivityManager) this.alpha.getSystemService("activity");
        int i4 = red + 45;
        purple = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return activityManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ ActivityManager invoke() {
        int i4 = red;
        int i5 = (i4 & 39) + (i4 | 39);
        purple = i5 % 128;
        if (i5 % 2 == 0) {
            ActivityManager alpha = alpha();
            red = (purple + 27) % 128;
            return alpha;
        }
        alpha();
        throw null;
    }
}
