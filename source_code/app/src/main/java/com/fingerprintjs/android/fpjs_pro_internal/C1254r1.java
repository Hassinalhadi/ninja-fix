package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1254r1 extends Lambda implements Function0<String> {
    public static final C1254r1 alpha = new Lambda(0);
    public static int purple = 0;
    public static int red = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.r1, kotlin.jvm.internal.Lambda] */
    static {
        if (ao.ad.victor(0, -78, 1, 2) != 0) {
        } else {
            throw null;
        }
    }

    public C1254r1() {
        super(0);
    }

    @NotNull
    public final String alpha() {
        String str = Build.MODEL;
        int i4 = red + 123;
        purple = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNull(str);
        if (i5 == 0) {
            return str;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        purple = (red + 39) % 128;
        String alpha2 = alpha();
        red = (purple + 55) % 128;
        return alpha2;
    }
}
