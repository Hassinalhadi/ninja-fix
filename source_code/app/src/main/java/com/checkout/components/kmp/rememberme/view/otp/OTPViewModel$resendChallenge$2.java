package com.checkout.components.kmp.rememberme.view.otp;

import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.model.OTPViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.AbstractC3220y;
import vf.ab;
import vf.ad;
import yf.N;
import yf.at;

@e(c = "com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$resendChallenge$2", f = "OTPViewModel.kt", l = {199}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class OTPViewModel$resendChallenge$2 extends i implements l {
    final /* synthetic */ String $hintId;
    final /* synthetic */ int $hintOrdinal;
    int label;
    final /* synthetic */ OTPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPViewModel$resendChallenge$2(OTPViewModel oTPViewModel, int i4, String str, Nd.c<? super OTPViewModel$resendChallenge$2> cVar) {
        super(2, cVar);
        this.this$0 = oTPViewModel;
        this.$hintOrdinal = i4;
        this.$hintId = str;
    }

    @Override // Pd.a
    public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
        return new OTPViewModel$resendChallenge$2(this.this$0, this.$hintOrdinal, this.$hintId, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3220y abstractC3220y;
        N n5;
        Object value;
        ChallengeRepository challengeRepository;
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
            abstractC3220y = this.this$0.networkDispatcher;
            OTPViewModel$resendChallenge$2$result$1 oTPViewModel$resendChallenge$2$result$1 = new OTPViewModel$resendChallenge$2$result$1(this.this$0, this.$hintOrdinal, this.$hintId, null);
            this.label = 1;
            obj = ad.blue(abstractC3220y, oTPViewModel$resendChallenge$2$result$1, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        RequestResult requestResult = (RequestResult) obj;
        if (requestResult instanceof RequestResult.Success) {
            challengeRepository = this.this$0.challengeRepository;
            challengeRepository.updateChallenge((CreateChallengeResponse) ((RequestResult.Success) requestResult).getData());
        } else if (!(requestResult instanceof RequestResult.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        at atVar = this.this$0.get_state();
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, OTPViewState.copy$default((OTPViewState) value, null, false, null, 60, 5, null)));
        this.this$0.countDownTimeLeft();
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, Nd.c<? super Unit> cVar) {
        return ((OTPViewModel$resendChallenge$2) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
