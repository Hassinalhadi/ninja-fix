package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class S extends Lambda implements Function0<Integer> {
    public static final S alpha = new Lambda(0);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.S, kotlin.jvm.internal.Lambda] */
    static {
        if ((1 + 41) % 2 != 0) {
            int i4 = 25 / 0;
        }
    }

    public S() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final Integer invoke() {
        Runtime runtime = Runtime.getRuntime();
        Intrinsics.checkNotNull(runtime);
        return Integer.valueOf(runtime.availableProcessors());
    }
}
