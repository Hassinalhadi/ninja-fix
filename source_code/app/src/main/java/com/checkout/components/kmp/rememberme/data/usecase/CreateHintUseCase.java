package com.checkout.components.kmp.rememberme.data.usecase;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.kmp.rememberme.data.model.CreateHintResponse;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepository;
import com.checkout.components.kmp.rememberme.logging.LogErrorNames;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.components.kmp.rememberme.logging.LoggingExtensionsKt;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.v;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0080B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintUseCase;", "", "Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "consumerRepository", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "challengeRepository", "Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "authInfoRepository", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "logger", "<init>", "(Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;)V", "", "email", "Lkotlin/Result;", "", "invoke-gIAlu-s$rememberme_release", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "invoke", "Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateHintUseCase {
    public static final int $stable = 8;

    @NotNull
    private final AuthInfoRepository authInfoRepository;

    @NotNull
    private final ChallengeRepository challengeRepository;

    @NotNull
    private final ConsumerRepository consumerRepository;

    @NotNull
    private final RememberMeLogger logger;

    public CreateHintUseCase(@NotNull ConsumerRepository consumerRepository, @NotNull ChallengeRepository challengeRepository, @NotNull AuthInfoRepository authInfoRepository, @NotNull RememberMeLogger logger) {
        Intrinsics.echo(consumerRepository, "consumerRepository");
        Intrinsics.echo(challengeRepository, "challengeRepository");
        Intrinsics.echo(authInfoRepository, "authInfoRepository");
        Intrinsics.echo(logger, "logger");
        this.consumerRepository = consumerRepository;
        this.challengeRepository = challengeRepository;
        this.authInfoRepository = authInfoRepository;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: invoke-gIAlu-s$rememberme_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116invokegIAlus$rememberme_release(@NotNull String str, @NotNull c<? super Result<Boolean>> cVar) {
        CreateHintUseCase$invoke$1 createHintUseCase$invoke$1;
        int i4;
        RequestResult requestResult;
        Integer num;
        if (cVar instanceof CreateHintUseCase$invoke$1) {
            createHintUseCase$invoke$1 = (CreateHintUseCase$invoke$1) cVar;
            int i5 = createHintUseCase$invoke$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                createHintUseCase$invoke$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = createHintUseCase$invoke$1.result;
                a aVar = a.alpha;
                i4 = createHintUseCase$invoke$1.label;
                if (i4 == 0) {
                    if (i4 == 1) {
                        str = (String) createHintUseCase$invoke$1.L$0;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (!ExtensionsKt.isEmail(str)) {
                        this.logger.logWarning(LogMessages.INVALID_EMAIL_FORMAT, LogErrorNames.REMEMBER_ME_CREATE_HINT_FAILED, LogMessages.INVALID_EMAIL_FORMAT);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m206constructorimpl(ResultKt.createFailure(new Throwable(LogMessages.INVALID_EMAIL_FORMAT)));
                    }
                    this.authInfoRepository.clear();
                    this.challengeRepository.clear();
                    ConsumerRepository consumerRepository = this.consumerRepository;
                    createHintUseCase$invoke$1.L$0 = str;
                    createHintUseCase$invoke$1.label = 1;
                    obj = consumerRepository.createHint(str, createHintUseCase$invoke$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                requestResult = (RequestResult) obj;
                if (!(requestResult instanceof RequestResult.Success)) {
                    AuthInfoRepository authInfoRepository = this.authInfoRepository;
                    authInfoRepository.updateEmail(str);
                    RequestResult.Success success = (RequestResult.Success) requestResult;
                    authInfoRepository.updateHintId(((CreateHintResponse) success.getData()).getId());
                    authInfoRepository.updateHints(((CreateHintResponse) success.getData()).getItems());
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m206constructorimpl(Boolean.TRUE);
                }
                if (requestResult instanceof RequestResult.Failed) {
                    RequestResult.Failed failed = (RequestResult.Failed) requestResult;
                    v code = failed.getCode();
                    if (code != null) {
                        v vVar = v.red;
                        if (code.alpha == v.f13708a.alpha) {
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m206constructorimpl(Boolean.FALSE);
                        }
                    }
                    RememberMeLogger rememberMeLogger = this.logger;
                    String message = failed.getError().getMessage();
                    if (message == null) {
                        message = LogMessages.UNKNOWN_ERROR;
                    }
                    Exception error = failed.getError();
                    v code2 = failed.getCode();
                    if (code2 != null) {
                        num = new Integer(code2.alpha);
                    } else {
                        num = null;
                    }
                    rememberMeLogger.logError(LogMessages.CREATE_HINT_REQUEST_FAILED, LogErrorNames.REMEMBER_ME_CREATE_HINT_FAILED, message, LoggingExtensionsKt.formatStackTraceWithServerCode(error, num));
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m206constructorimpl(ResultKt.createFailure(failed.getError()));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        createHintUseCase$invoke$1 = new CreateHintUseCase$invoke$1(this, cVar);
        Object obj2 = createHintUseCase$invoke$1.result;
        a aVar2 = a.alpha;
        i4 = createHintUseCase$invoke$1.label;
        if (i4 == 0) {
        }
        requestResult = (RequestResult) obj2;
        if (!(requestResult instanceof RequestResult.Success)) {
        }
    }
}
