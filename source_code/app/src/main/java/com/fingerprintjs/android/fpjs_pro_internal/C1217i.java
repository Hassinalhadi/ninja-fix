package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1217i extends Lambda implements Function1<String, Boolean> {
    public static final C1217i alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.i, kotlin.jvm.internal.Lambda] */
    static {
        if (((1 & 33) + (1 | 33)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public C1217i() {
        super(1);
    }

    @NotNull
    public final Boolean alpha(@NotNull String str) {
        boolean z2;
        int i4 = red + 25;
        purple = i4 % 128;
        if (i4 % 2 == 0) {
            if (str.length() == 0) {
                int i5 = red;
                purple = ((i5 & 83) + (i5 | 83)) % 128;
                z2 = true;
            } else {
                red = (purple + 107) % 128;
                z2 = false;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            int i10 = red + 103;
            purple = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 53 / 0;
            }
            return valueOf;
        }
        str.length();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(String str) {
        purple = (red + 29) % 128;
        Boolean alpha2 = alpha(str);
        int i4 = red;
        int i5 = ((i4 | 3) << 1) - (i4 ^ 3);
        purple = i5 % 128;
        if (i5 % 2 == 0) {
            return alpha2;
        }
        throw null;
    }
}
