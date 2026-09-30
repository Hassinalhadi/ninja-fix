package com.checkout.components.kmp.rememberme.view.otp;

import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.usecase.RespondChallengeUseCase;
import com.checkout.components.kmp.rememberme.logging.LogErrorNames;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.components.kmp.rememberme.logging.LoggingExtensionsKt;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.model.OTPViewState;
import com.checkout.components.kmp.rememberme.utils.ErrorCode;
import com.checkout.components.kmp.rememberme.utils.RememberMeError;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import sd.v;
import vf.ab;
import yf.N;
import yf.at;

@e(c = "com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$respondChallenge$1", f = "OTPViewModel.kt", l = {102}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class OTPViewModel$respondChallenge$1 extends i implements l {
    final /* synthetic */ String $challengeId;
    final /* synthetic */ List<Integer> $otpCode;
    int label;
    final /* synthetic */ OTPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPViewModel$respondChallenge$1(OTPViewModel oTPViewModel, String str, List<Integer> list, Nd.c<? super OTPViewModel$respondChallenge$1> cVar) {
        super(2, cVar);
        this.this$0 = oTPViewModel;
        this.$challengeId = str;
        this.$otpCode = list;
    }

    @Override // Pd.a
    public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
        return new OTPViewModel$respondChallenge$1(this.this$0, this.$challengeId, this.$otpCode, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        N n5;
        Object value;
        RespondChallengeUseCase respondChallengeUseCase;
        N n10;
        Object value2;
        RememberMeLogger rememberMeLogger;
        Integer num;
        Function1 function1;
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
            at atVar = this.this$0.get_state();
            do {
                n5 = (N) atVar;
                value = n5.getValue();
            } while (!n5.hotel(value, OTPViewState.copy$default((OTPViewState) value, null, true, null, 0, 13, null)));
            respondChallengeUseCase = this.this$0.respondChallengeUseCase;
            String str = this.$challengeId;
            String maroon = CollectionsKt.maroon(this.$otpCode, "", null, null, null, 62);
            this.label = 1;
            obj = respondChallengeUseCase.invoke(str, maroon, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        RequestResult requestResult = (RequestResult) obj;
        if (requestResult instanceof RequestResult.Success) {
            function1 = this.this$0.onAuthenticated;
            function1.invoke(((RequestResult.Success) requestResult).getData());
        } else if (requestResult instanceof RequestResult.Failed) {
            at atVar2 = this.this$0.get_state();
            do {
                n10 = (N) atVar2;
                value2 = n10.getValue();
            } while (!n10.hotel(value2, OTPViewState.copy$default((OTPViewState) value2, null, false, null, 0, 13, null)));
            RequestResult.Failed failed = (RequestResult.Failed) requestResult;
            if (failed.getError() instanceof RememberMeError) {
                this.this$0.handleRememberError$rememberme_release((RememberMeError) failed.getError());
            } else {
                Exception error = failed.getError();
                rememberMeLogger = this.this$0.logger;
                String message = error.getMessage();
                if (message == null) {
                    message = LogMessages.UNKNOWN_ERROR;
                }
                v code = failed.getCode();
                if (code != null) {
                    num = new Integer(code.alpha);
                } else {
                    num = null;
                }
                rememberMeLogger.logError(LogMessages.RESPOND_CHALLENGE_REQUEST_FAILED, LogErrorNames.REMEMBER_ME_RESPOND_CHALLENGE_FAILED, message, LoggingExtensionsKt.formatStackTraceWithServerCode(error, num));
                this.this$0.updateErrorCode(ErrorCode.UNKNOWN);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, Nd.c<? super Unit> cVar) {
        return ((OTPViewModel$respondChallenge$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
