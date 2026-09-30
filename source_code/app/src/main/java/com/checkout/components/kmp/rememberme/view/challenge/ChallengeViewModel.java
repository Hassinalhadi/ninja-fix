package com.checkout.components.kmp.rememberme.view.challenge;

import androidx.lifecycle.T;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCase;
import com.checkout.components.kmp.rememberme.interfaces.RememberMeViewModel;
import com.checkout.components.kmp.rememberme.model.ChallengeViewState;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.I;
import vf.ad;
import yf.AbstractC3428A;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/checkout/components/kmp/rememberme/view/challenge/ChallengeViewModel;", "Lcom/checkout/components/kmp/rememberme/interfaces/RememberMeViewModel;", "Lcom/checkout/components/kmp/rememberme/model/ChallengeViewState;", "Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "authInfoRepository", "Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCase;", "createHintChallengeUseCase", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "challengeRepository", "<init>", "(Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCase;Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;)V", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "result", "", "handleResult", "(Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;)V", "Lvf/I;", "observeEmail", "()Lvf/I;", "observeHints", "", "email", "", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "hints", "mapToViewState", "(Ljava/lang/String;Ljava/util/List;)Lcom/checkout/components/kmp/rememberme/model/ChallengeViewState;", "hint", "createChallenge$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/shared/model/Hint;)V", "createChallenge", "cancelChallengeRequest$rememberme_release", "()V", "cancelChallengeRequest", "Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCase;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "Lyf/at;", "_state", "Lyf/at;", "get_state", "()Lyf/at;", "challengeJob", "Lvf/I;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChallengeViewModel extends RememberMeViewModel<ChallengeViewState> {
    public static final int $stable = 8;

    @NotNull
    private final at _state;

    @NotNull
    private final AuthInfoRepository authInfoRepository;

    @Nullable
    private I challengeJob;

    @NotNull
    private final ChallengeRepository challengeRepository;

    @NotNull
    private final CreateHintChallengeUseCase createHintChallengeUseCase;

    public ChallengeViewModel(@NotNull AuthInfoRepository authInfoRepository, @NotNull CreateHintChallengeUseCase createHintChallengeUseCase, @NotNull ChallengeRepository challengeRepository) {
        Intrinsics.echo(authInfoRepository, "authInfoRepository");
        Intrinsics.echo(createHintChallengeUseCase, "createHintChallengeUseCase");
        Intrinsics.echo(challengeRepository, "challengeRepository");
        this.authInfoRepository = authInfoRepository;
        this.createHintChallengeUseCase = createHintChallengeUseCase;
        this.challengeRepository = challengeRepository;
        this._state = AbstractC3428A.charlie(mapToViewState((String) authInfoRepository.getEmail().getValue(), (List) authInfoRepository.getHints().getValue()));
        observeEmail();
        observeHints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(RequestResult<CreateChallengeResponse> result) {
        if (result instanceof RequestResult.Success) {
            this.challengeRepository.updateChallenge((CreateChallengeResponse) ((RequestResult.Success) result).getData());
        } else {
            if (result instanceof RequestResult.Failed) {
                this.challengeRepository.updateChallenge(null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeViewState mapToViewState(String email, List<Hint> hints) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterator<T> it = hints.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((Hint) obj2).getType() == HintType.WHATSAPP) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Hint hint = (Hint) obj2;
        Iterator<T> it2 = hints.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                if (((Hint) obj3).getType() == HintType.EMAIL) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        Hint hint2 = (Hint) obj3;
        Iterator<T> it3 = hints.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((Hint) next).getType() == HintType.PHONE) {
                obj = next;
                break;
            }
        }
        return new ChallengeViewState(email, hint, hint2, (Hint) obj, false);
    }

    private final I observeEmail() {
        return ad.zulu(T.hotel(this), null, null, new ChallengeViewModel$observeEmail$1(this, null), 3);
    }

    private final I observeHints() {
        return ad.zulu(T.hotel(this), null, null, new ChallengeViewModel$observeHints$1(this, null), 3);
    }

    public final void cancelChallengeRequest$rememberme_release() {
        I i4 = this.challengeJob;
        if (i4 != null) {
            i4.foxtrot(null);
        }
        ((N) get_state()).india(ChallengeViewState.copy$default((ChallengeViewState) ((N) get_state()).getValue(), null, null, null, null, false, 15, null));
        this.challengeRepository.updateHintType(null);
        this.challengeRepository.updateChallenge(null);
    }

    public final void createChallenge$rememberme_release(@NotNull Hint hint) {
        Intrinsics.echo(hint, "hint");
        this.challengeRepository.updateHintType(hint.getType());
        ((N) get_state()).india(ChallengeViewState.copy$default((ChallengeViewState) ((N) get_state()).getValue(), null, null, null, null, true, 15, null));
        I i4 = this.challengeJob;
        if (i4 != null) {
            i4.foxtrot(null);
        }
        this.challengeJob = ad.zulu(T.hotel(this), null, null, new ChallengeViewModel$createChallenge$1(this, hint, null), 3);
    }

    @Override // com.checkout.components.kmp.rememberme.interfaces.RememberMeViewModel
    @NotNull
    public at get_state() {
        return this._state;
    }
}
