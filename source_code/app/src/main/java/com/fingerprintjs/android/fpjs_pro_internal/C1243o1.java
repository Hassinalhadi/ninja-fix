package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1243o1 extends Lambda implements Function1<Byte, CharSequence> {
    public static final C1243o1 alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    public C1243o1() {
        super(1);
    }

    @NotNull
    public final CharSequence alpha(byte b2) {
        red = (purple + 113) % 128;
        String format = String.format("%02x", Byte.valueOf(b2));
        int i4 = red + 83;
        purple = i4 % 128;
        if (i4 % 2 == 0) {
            return format;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ CharSequence invoke(Byte b2) {
        int i4 = purple;
        int i5 = (i4 ^ 125) + ((i4 & 125) << 1);
        red = i5 % 128;
        int i10 = i5 % 2;
        byte byteValue = b2.byteValue();
        if (i10 != 0) {
            return alpha(byteValue);
        }
        alpha(byteValue);
        throw null;
    }
}
