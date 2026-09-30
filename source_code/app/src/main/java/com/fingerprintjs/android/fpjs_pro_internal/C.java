package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class C extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ D alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d4) {
        super(0);
        this.alpha = d4;
    }

    @NotNull
    public final String alpha() {
        int i4 = purple;
        int i5 = (i4 ^ 57) + ((i4 & 57) << 1);
        red = i5 % 128;
        int i10 = i5 % 2;
        D d4 = this.alpha;
        if (i10 != 0) {
            bh bravo = D.bravo(d4);
            if (F0.alpha()) {
                String pivotYN16904 = bravo.setPivotYN16904(d4.bravo);
                Intrinsics.checkNotNull(pivotYN16904);
                int i11 = purple + 9;
                red = i11 % 128;
                if (i11 % 2 != 0) {
                    return pivotYN16904;
                }
                throw null;
            }
            throw new bd(null, null, 3, null);
        }
        D.bravo(d4);
        F0.alpha();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        purple = (((i4 | 83) << 1) - (i4 ^ 83)) % 128;
        String alpha = alpha();
        int i5 = red;
        int i10 = ((i5 | 13) << 1) - (i5 ^ 13);
        purple = i10 % 128;
        if (i10 % 2 == 0) {
            return alpha;
        }
        throw null;
    }
}
