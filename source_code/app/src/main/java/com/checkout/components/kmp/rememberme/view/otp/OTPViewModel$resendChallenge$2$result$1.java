package com.checkout.components.kmp.rememberme.view.otp;

import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

@e(c = "com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$resendChallenge$2$result$1", f = "OTPViewModel.kt", l = {200}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvf/ab;", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "<anonymous>", "(Lvf/ab;)Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class OTPViewModel$resendChallenge$2$result$1 extends i implements l {
    final /* synthetic */ String $hintId;
    final /* synthetic */ int $hintOrdinal;
    int label;
    final /* synthetic */ OTPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPViewModel$resendChallenge$2$result$1(OTPViewModel oTPViewModel, int i4, String str, Nd.c<? super OTPViewModel$resendChallenge$2$result$1> cVar) {
        super(2, cVar);
        this.this$0 = oTPViewModel;
        this.$hintOrdinal = i4;
        this.$hintId = str;
    }

    @Override // Pd.a
    public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
        return new OTPViewModel$resendChallenge$2$result$1(this.this$0, this.$hintOrdinal, this.$hintId, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        CreateHintChallengeUseCase createHintChallengeUseCase;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        createHintChallengeUseCase = this.this$0.createHintChallengeUseCase;
        int i5 = this.$hintOrdinal;
        String str = this.$hintId;
        this.label = 1;
        Object invoke = createHintChallengeUseCase.invoke(i5, str, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, Nd.c<? super RequestResult<CreateChallengeResponse>> cVar) {
        return ((OTPViewModel$resendChallenge$2$result$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
