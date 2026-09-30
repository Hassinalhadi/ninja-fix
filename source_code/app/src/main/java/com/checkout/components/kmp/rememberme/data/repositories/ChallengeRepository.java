package com.checkout.components.kmp.rememberme.data.repositories;

import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.L;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "Lcom/checkout/components/kmp/rememberme/data/model/Challenge;", "challenge", "", "updateChallenge", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;)V", "Lcom/checkout/components/kmp/rememberme/shared/model/HintType;", "hintType", "updateHintType", "(Lcom/checkout/components/kmp/rememberme/shared/model/HintType;)V", "clear", "()V", "Lyf/L;", "getChallenge", "()Lyf/L;", "getHintType", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ChallengeRepository {
    void clear();

    @NotNull
    L getChallenge();

    @NotNull
    L getHintType();

    void updateChallenge(@Nullable CreateChallengeResponse challenge);

    void updateHintType(@Nullable HintType hintType);
}
