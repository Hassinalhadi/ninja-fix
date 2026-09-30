package com.checkout.components.kmp.rememberme.data.usecase;

import Nd.c;
import R4.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.model.RespondChallengeRequest;
import com.checkout.components.kmp.rememberme.data.model.RespondChallengeResponse;
import com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepository;
import com.checkout.components.kmp.rememberme.logging.LogErrorNames;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.components.kmp.rememberme.logging.LoggingExtensionsKt;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.utils.ErrorCode;
import com.checkout.components.kmp.rememberme.utils.RememberMeError;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.v;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/usecase/RespondChallengeUseCaseImpl;", "Lcom/checkout/components/kmp/rememberme/data/usecase/RespondChallengeUseCase;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "repository", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "logger", "<init>", "(Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;)V", "Lcom/checkout/components/kmp/rememberme/utils/RememberMeError;", RedirectCustomTabEventLogger.RESULT_ERROR, "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Failed;", "logAndReturn", "(Lcom/checkout/components/kmp/rememberme/utils/RememberMeError;)Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Failed;", "", "challengeId", "otpCode", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RespondChallengeUseCaseImpl implements RespondChallengeUseCase {
    public static final int $stable = 0;

    @NotNull
    private final RememberMeLogger logger;

    @NotNull
    private final ConsumerRepository repository;

    public RespondChallengeUseCaseImpl(@NotNull ConsumerRepository repository, @NotNull RememberMeLogger logger) {
        Intrinsics.echo(repository, "repository");
        Intrinsics.echo(logger, "logger");
        this.repository = repository;
        this.logger = logger;
    }

    private final RequestResult.Failed logAndReturn(RememberMeError error) {
        RememberMeLogger rememberMeLogger = this.logger;
        String message = error.getMessage();
        if (message == null) {
            message = error.getCode$rememberme_release().getMessage();
        }
        a.echo(rememberMeLogger, LogMessages.RESPOND_CHALLENGE_REQUEST_FAILED, LogErrorNames.REMEMBER_ME_RESPOND_CHALLENGE_FAILED, message, null, 8, null);
        return new RequestResult.Failed(null, error, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.checkout.components.kmp.rememberme.data.usecase.RespondChallengeUseCase
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull String str2, @NotNull c<? super RequestResult<String>> cVar) {
        RespondChallengeUseCaseImpl$invoke$1 respondChallengeUseCaseImpl$invoke$1;
        int i4;
        RequestResult requestResult;
        if (cVar instanceof RespondChallengeUseCaseImpl$invoke$1) {
            respondChallengeUseCaseImpl$invoke$1 = (RespondChallengeUseCaseImpl$invoke$1) cVar;
            int i5 = respondChallengeUseCaseImpl$invoke$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                respondChallengeUseCaseImpl$invoke$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = respondChallengeUseCaseImpl$invoke$1.result;
                Od.a aVar = Od.a.alpha;
                i4 = respondChallengeUseCaseImpl$invoke$1.label;
                Integer num = null;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    ConsumerRepository consumerRepository = this.repository;
                    RespondChallengeRequest respondChallengeRequest = new RespondChallengeRequest(str2);
                    respondChallengeUseCaseImpl$invoke$1.L$0 = null;
                    respondChallengeUseCaseImpl$invoke$1.L$1 = null;
                    respondChallengeUseCaseImpl$invoke$1.label = 1;
                    obj = consumerRepository.respondChallenge(str, respondChallengeRequest, respondChallengeUseCaseImpl$invoke$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                requestResult = (RequestResult) obj;
                if (!(requestResult instanceof RequestResult.Success)) {
                    RequestResult.Success success = (RequestResult.Success) requestResult;
                    String clientToken = ((RespondChallengeResponse) success.getData()).getClientToken();
                    if (clientToken != null && !StringsKt.gray(clientToken)) {
                        return new RequestResult.Success(((RespondChallengeResponse) success.getData()).getClientToken());
                    }
                    if (((RespondChallengeResponse) success.getData()).getChallenge().getAttemptCount() == ((RespondChallengeResponse) success.getData()).getChallenge().getMaxAttemptCount()) {
                        return logAndReturn(new RememberMeError(ErrorCode.OTP_MAX_RETRIES_REACHED));
                    }
                    if (!((RespondChallengeResponse) success.getData()).getSuccess()) {
                        return logAndReturn(new RememberMeError(ErrorCode.OTP_INCORRECT_CODE));
                    }
                    String clientToken2 = ((RespondChallengeResponse) success.getData()).getClientToken();
                    if (clientToken2 != null && !StringsKt.gray(clientToken2)) {
                        return logAndReturn(new RememberMeError(ErrorCode.UNKNOWN));
                    }
                    return logAndReturn(new RememberMeError(ErrorCode.BLANK_CLIENT_TOKEN));
                }
                if (requestResult instanceof RequestResult.Failed) {
                    RememberMeLogger rememberMeLogger = this.logger;
                    RequestResult.Failed failed = (RequestResult.Failed) requestResult;
                    String message = failed.getError().getMessage();
                    if (message == null) {
                        message = LogMessages.UNKNOWN_ERROR;
                    }
                    Exception error = failed.getError();
                    v code = failed.getCode();
                    if (code != null) {
                        num = new Integer(code.alpha);
                    }
                    rememberMeLogger.logError(LogMessages.RESPOND_CHALLENGE_REQUEST_FAILED, LogErrorNames.REMEMBER_ME_RESPOND_CHALLENGE_FAILED, message, LoggingExtensionsKt.formatStackTraceWithServerCode(error, num));
                    return requestResult;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        respondChallengeUseCaseImpl$invoke$1 = new RespondChallengeUseCaseImpl$invoke$1(this, cVar);
        Object obj2 = respondChallengeUseCaseImpl$invoke$1.result;
        Od.a aVar2 = Od.a.alpha;
        i4 = respondChallengeUseCaseImpl$invoke$1.label;
        Integer num2 = null;
        if (i4 == 0) {
        }
        requestResult = (RequestResult) obj2;
        if (!(requestResult instanceof RequestResult.Success)) {
        }
    }
}
