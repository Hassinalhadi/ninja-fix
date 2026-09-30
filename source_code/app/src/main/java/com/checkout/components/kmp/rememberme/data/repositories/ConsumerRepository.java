package com.checkout.components.kmp.rememberme.data.repositories;

import Nd.c;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.model.CreateHintResponse;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.model.RespondChallengeRequest;
import com.checkout.components.kmp.rememberme.data.model.RespondChallengeResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "", "", "email", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateHintResponse;", "createHint", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;", "request", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "createChallenge", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;LNd/c;)Ljava/lang/Object;", "challengeId", "Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeRequest;", "Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeResponse;", "respondChallenge", "(Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeRequest;LNd/c;)Ljava/lang/Object;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ConsumerRepository {
    @Nullable
    Object createChallenge(@NotNull CreateChallengeRequest createChallengeRequest, @NotNull c<? super RequestResult<CreateChallengeResponse>> cVar);

    @Nullable
    Object createHint(@NotNull String str, @NotNull c<? super RequestResult<CreateHintResponse>> cVar);

    @Nullable
    Object respondChallenge(@NotNull String str, @NotNull RespondChallengeRequest respondChallengeRequest, @NotNull c<? super RequestResult<RespondChallengeResponse>> cVar);
}
