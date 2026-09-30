package com.fingerprintjs.android.fpjs_pro_internal;

import com.zendesk.service.HttpConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "p0", "Lcom/fingerprintjs/android/fpjs_pro_internal/m0;", "alpha", "(Lkotlin/text/MatchResult$Destructured;)Lcom/fingerprintjs/android/fpjs_pro_internal/m0;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1226k0 extends Lambda implements Function1<MatchResult.Destructured, C1234m0> {
    public static final C1226k0 alpha = new Lambda(1);

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, com.fingerprintjs.android.fpjs_pro_internal.k0] */
    static {
        if (ao.ad.victor(1, -18, 1, 2) == 0) {
        } else {
            throw null;
        }
    }

    public C1226k0() {
        super(1);
    }

    @Nullable
    public final C1234m0 alpha(@NotNull MatchResult.Destructured destructured) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(new C1234m0(destructured.getMatch().getGroupValues().get(1), destructured.getMatch().getGroupValues().get(2)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        return (C1234m0) component13.vD14832N6715(bk.component5(m206constructorimpl), null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ C1234m0 invoke(MatchResult.Destructured destructured) {
        C1234m0 alpha2 = alpha(destructured);
        int identityHashCode = System.identityHashCode(this);
        int i4 = ~identityHashCode;
        int i5 = (~((i4 & 1892032060) | (1892032060 ^ i4))) | (-1912585917);
        int i10 = ((-1078069297) & identityHashCode) | ((-1078069297) ^ identityHashCode);
        int i11 = (-1036111245) - (~(-(-((i5 | (~i10)) * (-502)))));
        int i12 = ~identityHashCode;
        int i13 = (i12 & 1892032060) | (1892032060 ^ i12);
        int i14 = ~((i13 & (-1098623153)) | (i13 ^ (-1098623153)));
        int i15 = ~i10;
        int i16 = ((i14 & i15) | (i14 ^ i15)) * HttpConstants.HTTP_BAD_GATEWAY;
        int i17 = (i11 ^ i16) + ((i16 & i11) << 1);
        int identityHashCode2 = System.identityHashCode(this);
        int i18 = ~identityHashCode2;
        int i19 = -(-(((~((i18 & (-948274494)) | ((-948274494) ^ i18))) | 8683836) * (-241)));
        int i20 = ((1660024755 ^ i19) + ((i19 & 1660024755) << 1)) - 1692352926;
        int i21 = ~identityHashCode2;
        int i22 = (i21 & (-948274494)) | ((-948274494) ^ i21);
        int i23 = ~((i22 & (-980633154)) | (i22 ^ (-980633154)));
        int i24 = ((i23 & (-989316990)) | ((-989316990) ^ i23)) * 241;
        if (i17 <= (i20 & i24) + (i24 | i20)) {
            int i25 = 77 / 0;
        }
        return alpha2;
    }
}
