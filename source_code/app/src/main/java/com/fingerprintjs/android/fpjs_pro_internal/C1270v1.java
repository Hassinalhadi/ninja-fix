package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1270v1 extends Lambda implements Function0<Long> {
    public final /* synthetic */ C1274w1 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1270v1(C1274w1 c1274w1) {
        super(0);
        this.alpha = c1274w1;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final Long invoke() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        int i4 = C1274w1.charlie;
        C1274w1.delta = ((i4 & 33) + (i4 | 33)) % 128;
        ActivityManager activityManager = this.alpha.alpha;
        int i5 = i4 + 45;
        C1274w1.delta = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 81 / 0;
        }
        Intrinsics.checkNotNull(activityManager);
        activityManager.getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem);
    }
}
