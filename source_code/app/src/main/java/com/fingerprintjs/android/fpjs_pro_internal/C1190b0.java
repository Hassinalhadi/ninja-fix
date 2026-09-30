package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1190b0 extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1194c0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190b0(C1194c0 c1194c0) {
        super(0);
        this.alpha = c1194c0;
    }

    @NotNull
    public final String alpha() {
        int i4 = red;
        purple = ((i4 & 103) + (i4 | 103)) % 128;
        int i5 = (C1194c0.bravo + 71) % 128;
        bh bhVar = this.alpha.alpha;
        C1194c0.bravo = (i5 + 95) % 128;
        if (F0.alpha()) {
            String D8871 = bhVar.D8871();
            Intrinsics.checkNotNull(D8871);
            red = (purple + 97) % 128;
            return D8871;
        }
        throw new bd(null, null, 3, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        String alpha;
        int i4 = purple + 19;
        red = i4 % 128;
        if (i4 % 2 == 0) {
            alpha = alpha();
            int i5 = 16 / 0;
        } else {
            alpha = alpha();
        }
        purple = (red + 29) % 128;
        return alpha;
    }
}
