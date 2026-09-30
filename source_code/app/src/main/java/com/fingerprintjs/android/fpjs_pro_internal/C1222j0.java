package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult;", "p0", "Lkotlin/text/MatchResult$Destructured;", "alpha", "(Lkotlin/text/MatchResult;)Lkotlin/text/MatchResult$Destructured;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1222j0 extends Lambda implements Function1<MatchResult, MatchResult.Destructured> {
    public static final C1222j0 alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.j0, kotlin.jvm.internal.Lambda] */
    static {
        if (81 % 2 != 0) {
        } else {
            throw null;
        }
    }

    public C1222j0() {
        super(1);
    }

    @NotNull
    public final MatchResult.Destructured alpha(@NotNull MatchResult matchResult) {
        int i4 = purple;
        red = ((i4 & 59) + (i4 | 59)) % 128;
        MatchResult.Destructured destructured = matchResult.getDestructured();
        int i5 = red;
        purple = (((i5 | 113) << 1) - (i5 ^ 113)) % 128;
        return destructured;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ MatchResult.Destructured invoke(MatchResult matchResult) {
        m3.setPivotYN16904();
        System.identityHashCode(this);
        MatchResult.Destructured alpha2 = alpha(matchResult);
        red = (purple + 33) % 128;
        return alpha2;
    }
}
