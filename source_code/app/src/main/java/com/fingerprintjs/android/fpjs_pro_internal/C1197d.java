package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1197d extends Lambda implements Function1<Integer, Boolean> {
    public static final C1197d alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    public C1197d() {
        super(1);
    }

    @NotNull
    public final Boolean alpha(int i4) {
        int i5 = red;
        boolean z2 = true;
        int i10 = (i5 ^ 93) + ((i5 & 93) << 1);
        int i11 = i10 % 128;
        purple = i11;
        if (i10 % 2 == 0) {
            if (i4 == 0) {
                red = (i11 + 37) % 128;
            } else {
                red = ((i11 ^ 49) + ((i11 & 49) << 1)) % 128;
                z2 = false;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            int i12 = red + 27;
            purple = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 48 / 0;
            }
            return valueOf;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Integer num) {
        int i4 = red + 61;
        purple = i4 % 128;
        int i5 = i4 % 2;
        Boolean alpha2 = alpha(num.intValue());
        if (i5 != 0) {
            int i10 = 79 / 0;
        }
        red = (purple + 7) % 128;
        return alpha2;
    }
}
