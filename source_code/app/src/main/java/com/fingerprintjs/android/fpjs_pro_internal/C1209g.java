package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1209g extends Lambda implements Function1<String, Boolean> {
    public static final C1209g alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.g, kotlin.jvm.internal.Lambda] */
    static {
        if (((1 ^ 105) + ((1 & 105) << 1)) % 2 != 0) {
            int i4 = 27 / 0;
        }
    }

    public C1209g() {
        super(1);
    }

    @NotNull
    public final Boolean alpha(@NotNull String str) {
        red = (purple + 97) % 128;
        boolean z2 = false;
        if (str.length() == 0) {
            int i4 = red;
            int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
            purple = i5 % 128;
            if (i5 % 2 == 0) {
                z2 = true;
            }
        } else {
            int i10 = purple;
            red = ((i10 ^ 117) + ((i10 & 117) << 1)) % 128;
        }
        return Boolean.valueOf(z2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(String str) {
        purple = (red + 117) % 128;
        Boolean alpha2 = alpha(str);
        int i4 = purple;
        int i5 = (i4 & 71) + (i4 | 71);
        red = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 34 / 0;
        }
        return alpha2;
    }
}
