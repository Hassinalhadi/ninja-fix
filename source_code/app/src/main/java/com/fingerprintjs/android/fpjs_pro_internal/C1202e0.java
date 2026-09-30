package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.pm.PackageManager;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Lcom/fingerprintjs/android/fpjs_pro_internal/a0;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Lcom/fingerprintjs/android/fpjs_pro_internal/a0;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1202e0 extends Lambda implements Function1<SafeWithTimeoutProContext, C1186a0> {
    public final /* synthetic */ av.ah alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202e0(av.ah ahVar, String str) {
        super(1);
        this.alpha = ahVar;
        this.purple = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final C1186a0 invoke(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = av.ah.red;
        int i5 = ((i4 & 79) + (i4 | 79)) % 128;
        PackageManager packageManager = (PackageManager) this.alpha.purple;
        av.ah.red = (((i5 | 125) << 1) - (i5 ^ 125)) % 128;
        Intrinsics.checkNotNull(packageManager);
        return new C1186a0(packageManager.getApplicationInfo(this.purple, 128).dataDir);
    }
}
