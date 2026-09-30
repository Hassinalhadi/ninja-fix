package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/e1;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/e1;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class P extends Lambda implements Function0<C1203e1> {
    public static int alpha = 0;
    public static int purple = 1;
    public static int red;
    public static int silver;

    public static int setPivotYN16904() {
        int i4 = red;
        int i5 = i4 % 6577381;
        red = i4 + 1;
        if (i5 != 0) {
            return silver;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        silver = freeMemory;
        return freeMemory;
    }

    @NotNull
    public final C1203e1 alpha() {
        int i4 = alpha;
        int i5 = (i4 ^ 89) + ((i4 & 89) << 1);
        purple = i5 % 128;
        if (i5 % 2 != 0) {
            C1203e1 bravo = U.bravo();
            purple = (alpha + 85) % 128;
            return bravo;
        }
        U.bravo();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ C1203e1 invoke() {
        int i4 = purple;
        int i5 = ((i4 | 55) << 1) - (i4 ^ 55);
        alpha = i5 % 128;
        if (i5 % 2 == 0) {
            return alpha();
        }
        alpha();
        throw null;
    }
}
