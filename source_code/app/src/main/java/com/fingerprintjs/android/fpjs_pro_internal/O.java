package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class O extends Lambda implements Function0<String> {
    public static final O alpha = new Lambda(0);

    public O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        String str = Build.SUPPORTED_ABIS[0];
        Intrinsics.checkNotNull(str);
        return str;
    }
}
