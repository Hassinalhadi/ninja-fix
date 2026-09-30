package com.checkout.components.kmp.rememberme.data.usecase;

import Nd.c;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/usecase/RespondChallengeUseCase;", "", "", "challengeId", "otpCode", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RespondChallengeUseCase {
    @Nullable
    Object invoke(@NotNull String str, @NotNull String str2, @NotNull c<? super RequestResult<String>> cVar);
}
