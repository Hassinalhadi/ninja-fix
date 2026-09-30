package com.checkout.components.kmp.rememberme.data.usecase;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.model.RequestResult;
import com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepository;
import com.checkout.components.kmp.rememberme.logging.LogErrorNames;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.components.kmp.rememberme.logging.LoggingExtensionsKt;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.v;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCaseImpl;", "Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCase;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "repository", "", "publicKey", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "logger", "<init>", "(Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;)V", "", "hintOrdinal", "hintId", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "invoke", "(ILjava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ConsumerRepository;", "Ljava/lang/String;", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateHintChallengeUseCaseImpl implements CreateHintChallengeUseCase {
    public static final int $stable = 0;

    @NotNull
    private final RememberMeLogger logger;

    @NotNull
    private final String publicKey;

    @NotNull
    private final ConsumerRepository repository;

    public CreateHintChallengeUseCaseImpl(@NotNull ConsumerRepository repository, @NotNull String publicKey, @NotNull RememberMeLogger logger) {
        Intrinsics.echo(repository, "repository");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(logger, "logger");
        this.repository = repository;
        this.publicKey = publicKey;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCase
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i4, @NotNull String str, @NotNull c<? super RequestResult<CreateChallengeResponse>> cVar) {
        CreateHintChallengeUseCaseImpl$invoke$1 createHintChallengeUseCaseImpl$invoke$1;
        int i5;
        RequestResult requestResult;
        if (cVar instanceof CreateHintChallengeUseCaseImpl$invoke$1) {
            createHintChallengeUseCaseImpl$invoke$1 = (CreateHintChallengeUseCaseImpl$invoke$1) cVar;
            int i10 = createHintChallengeUseCaseImpl$invoke$1.label;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                createHintChallengeUseCaseImpl$invoke$1.label = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = createHintChallengeUseCaseImpl$invoke$1.result;
                a aVar = a.alpha;
                i5 = createHintChallengeUseCaseImpl$invoke$1.label;
                Integer num = null;
                if (i5 == 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    ConsumerRepository consumerRepository = this.repository;
                    CreateChallengeRequest.Hint hint = new CreateChallengeRequest.Hint(this.publicKey, str, i4);
                    createHintChallengeUseCaseImpl$invoke$1.L$0 = null;
                    createHintChallengeUseCaseImpl$invoke$1.I$0 = i4;
                    createHintChallengeUseCaseImpl$invoke$1.label = 1;
                    obj = consumerRepository.createChallenge(hint, createHintChallengeUseCaseImpl$invoke$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                requestResult = (RequestResult) obj;
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
                    rememberMeLogger.logError(LogMessages.CREATE_CHALLENGE_REQUEST_FAILED, LogErrorNames.REMEMBER_ME_CHALLENGE_CREATE_FAILED, message, LoggingExtensionsKt.formatStackTraceWithServerCode(error, num));
                }
                return requestResult;
            }
        }
        createHintChallengeUseCaseImpl$invoke$1 = new CreateHintChallengeUseCaseImpl$invoke$1(this, cVar);
        Object obj2 = createHintChallengeUseCaseImpl$invoke$1.result;
        a aVar2 = a.alpha;
        i5 = createHintChallengeUseCaseImpl$invoke$1.label;
        Integer num2 = null;
        if (i5 == 0) {
        }
        requestResult = (RequestResult) obj2;
        if (requestResult instanceof RequestResult.Failed) {
        }
        return requestResult;
    }
}
