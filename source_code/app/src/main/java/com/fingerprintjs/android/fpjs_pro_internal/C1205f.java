package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "p0", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1205f extends Lambda implements Function1 {
    public static final C1205f alpha = new Lambda(1);
    public static int purple;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.f, kotlin.jvm.internal.Lambda] */
    static {
        if (((1 & 51) + (1 | 51)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public C1205f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Object invoke(@NotNull Object obj) {
        int i4 = purple;
        int i5 = ((i4 & 33) + (i4 | 33)) % 128;
        int i10 = (i5 ^ 7) + ((i5 & 7) << 1);
        purple = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 78 / 0;
        }
        return obj;
    }
}
