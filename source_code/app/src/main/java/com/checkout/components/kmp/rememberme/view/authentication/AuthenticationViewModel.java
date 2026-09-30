package com.checkout.components.kmp.rememberme.view.authentication;

import C1.t;
import androidx.lifecycle.T;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.interfaces.RememberMeViewModel;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewState;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.I;
import vf.ad;
import yf.AbstractC3428A;
import yf.C3443m;
import yf.N;
import yf.at;
import yf.s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/kmp/rememberme/view/authentication/AuthenticationViewModel;", "Lcom/checkout/components/kmp/rememberme/interfaces/RememberMeViewModel;", "Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewState;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "challengeRepository", "Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "authInfoRepository", "<init>", "(Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;)V", "Lvf/I;", "observeChallenge", "()Lvf/I;", "", "goToChallengeView$rememberme_release", "()V", "goToChallengeView", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "Lyf/at;", "_state", "Lyf/at;", "get_state", "()Lyf/at;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthenticationViewModel extends RememberMeViewModel<AuthenticationViewState> {
    public static final int $stable = 8;

    @NotNull
    private final at _state;

    @NotNull
    private final ChallengeRepository challengeRepository;

    public AuthenticationViewModel(@NotNull ChallengeRepository challengeRepository, @NotNull AuthInfoRepository authInfoRepository) {
        Intrinsics.echo(challengeRepository, "challengeRepository");
        Intrinsics.echo(authInfoRepository, "authInfoRepository");
        this.challengeRepository = challengeRepository;
        this._state = AbstractC3428A.charlie(new AuthenticationViewState((String) authInfoRepository.getEmail().getValue(), AuthenticationViewType.CHALLENGE));
        observeChallenge();
    }

    private final I observeChallenge() {
        return ad.zulu(T.hotel(this), null, null, new C3443m(new s(AbstractC3428A.lima(new t(6, this.challengeRepository.getChallenge())), new AuthenticationViewModel$observeChallenge$1(this, null), 3), null), 3);
    }

    @Override // com.checkout.components.kmp.rememberme.interfaces.RememberMeViewModel
    @NotNull
    public at get_state() {
        return this._state;
    }

    public final void goToChallengeView$rememberme_release() {
        N n5;
        Object value;
        at atVar = get_state();
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, AuthenticationViewState.copy$default((AuthenticationViewState) ((N) get_state()).getValue(), null, AuthenticationViewType.CHALLENGE, 1, null)));
        this.challengeRepository.updateChallenge(null);
        this.challengeRepository.updateHintType(null);
    }
}
