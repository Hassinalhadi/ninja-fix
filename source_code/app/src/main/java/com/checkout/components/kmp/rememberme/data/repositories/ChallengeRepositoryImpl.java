package com.checkout.components.kmp.rememberme.data.repositories;

import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;
import yf.av;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepositoryImpl;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "<init>", "()V", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "Lcom/checkout/components/kmp/rememberme/data/model/Challenge;", "challenge", "", "updateChallenge", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;)V", "Lcom/checkout/components/kmp/rememberme/shared/model/HintType;", "hintType", "updateHintType", "(Lcom/checkout/components/kmp/rememberme/shared/model/HintType;)V", "clear", "Lyf/at;", "_challenge", "Lyf/at;", "Lyf/L;", "Lyf/L;", "getChallenge", "()Lyf/L;", "_hintType", "getHintType", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChallengeRepositoryImpl implements ChallengeRepository {
    public static final int $stable = 8;

    @NotNull
    private final at _challenge;

    @NotNull
    private final at _hintType;

    @NotNull
    private final L challenge;

    @NotNull
    private final L hintType;

    public ChallengeRepositoryImpl() {
        N charlie = AbstractC3428A.charlie(null);
        this._challenge = charlie;
        this.challenge = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(null);
        this._hintType = charlie2;
        this.hintType = new av(charlie2);
    }

    @Override // com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository
    public void clear() {
        N n5;
        Object value;
        N n10;
        Object value2;
        at atVar = this._challenge;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, null));
        at atVar2 = this._hintType;
        do {
            n10 = (N) atVar2;
            value2 = n10.getValue();
        } while (!n10.hotel(value2, null));
    }

    @Override // com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository
    @NotNull
    public L getChallenge() {
        return this.challenge;
    }

    @Override // com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository
    @NotNull
    public L getHintType() {
        return this.hintType;
    }

    @Override // com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository
    public void updateChallenge(@Nullable CreateChallengeResponse challenge) {
        N n5;
        Object value;
        at atVar = this._challenge;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, challenge));
    }

    @Override // com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository
    public void updateHintType(@Nullable HintType hintType) {
        N n5;
        Object value;
        at atVar = this._hintType;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, hintType));
    }
}
