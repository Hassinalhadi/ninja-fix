package com.checkout.components.kmp.rememberme.view.challenge;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCase;
import com.checkout.components.kmp.rememberme.model.ChallengeViewState;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.N;

@e(c = "com.checkout.components.kmp.rememberme.view.challenge.ChallengeViewModel$createChallenge$1", f = "ChallengeViewModel.kt", l = {42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class ChallengeViewModel$createChallenge$1 extends i implements l {
    final /* synthetic */ Hint $hint;
    int label;
    final /* synthetic */ ChallengeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeViewModel$createChallenge$1(ChallengeViewModel challengeViewModel, Hint hint, c<? super ChallengeViewModel$createChallenge$1> cVar) {
        super(2, cVar);
        this.this$0 = challengeViewModel;
        this.$hint = hint;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ChallengeViewModel$createChallenge$1(this.this$0, this.$hint, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        CreateHintChallengeUseCase createHintChallengeUseCase;
        AuthInfoRepository authInfoRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            createHintChallengeUseCase = this.this$0.createHintChallengeUseCase;
            int ordinal = this.$hint.getOrdinal();
            authInfoRepository = this.this$0.authInfoRepository;
            String str = (String) authInfoRepository.getHintId().getValue();
            this.label = 1;
            obj = createHintChallengeUseCase.invoke(ordinal, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ((N) this.this$0.get_state()).india(ChallengeViewState.copy$default((ChallengeViewState) ((N) this.this$0.get_state()).getValue(), null, null, null, null, false, 15, null));
        this.this$0.handleResult((RequestResult) obj);
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((ChallengeViewModel$createChallenge$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
