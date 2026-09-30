package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1221j extends Lambda implements Function1<Long, Boolean> {
    public static final C1221j alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.j, kotlin.jvm.internal.Lambda] */
    static {
        if (ao.ad.victor(0, -18, 1, 2) == 0) {
            int i4 = 25 / 0;
        }
    }

    public C1221j() {
        super(1);
    }

    @NotNull
    public final Boolean alpha(long j5) {
        boolean z2;
        int i4 = purple;
        int i5 = i4 + 3;
        red = i5 % 128;
        if (i5 % 2 != 0 ? j5 == 0 : j5 == 0) {
            z2 = true;
        } else {
            red = (i4 + 51) % 128;
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        purple = (red + 123) % 128;
        return valueOf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Long l10) {
        int i4 = purple;
        int i5 = ((i4 | 119) << 1) - (i4 ^ 119);
        red = i5 % 128;
        Long l11 = l10;
        if (i5 % 2 != 0) {
            Boolean alpha2 = alpha(l11.longValue());
            int i10 = red + 107;
            purple = i10 % 128;
            if (i10 % 2 == 0) {
                return alpha2;
            }
            throw null;
        }
        alpha(l11.longValue());
        throw null;
    }
}
