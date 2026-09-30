package com.checkout.components.kmp.rememberme.view.otp;

import Af.n;
import Cf.e;
import androidx.lifecycle.T;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCase;
import com.checkout.components.kmp.rememberme.data.usecase.RespondChallengeUseCase;
import com.checkout.components.kmp.rememberme.interfaces.RememberMeViewModel;
import com.checkout.components.kmp.rememberme.logging.LogErrorNames;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.model.OTPViewState;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import com.checkout.components.kmp.rememberme.utils.Constants;
import com.checkout.components.kmp.rememberme.utils.ErrorCode;
import com.checkout.components.kmp.rememberme.utils.RememberMeError;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import fe.C1713e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.AbstractC3220y;
import vf.I;
import vf.ad;
import vf.ao;
import yf.AbstractC3428A;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\u0017\u0010(\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\rH\u0001¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010,\u001a\u00020\rH\u0000¢\u0006\u0004\b+\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00108\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/checkout/components/kmp/rememberme/view/otp/OTPViewModel;", "Lcom/checkout/components/kmp/rememberme/interfaces/RememberMeViewModel;", "Lcom/checkout/components/kmp/rememberme/model/OTPViewState;", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "challengeRepository", "Lcom/checkout/components/kmp/rememberme/data/usecase/RespondChallengeUseCase;", "respondChallengeUseCase", "Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "authRepository", "Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCase;", "createHintChallengeUseCase", "Lkotlin/Function1;", "", "", "onAuthenticated", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "logger", "Lvf/y;", "mainDispatcher", "networkDispatcher", "<init>", "(Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;Lcom/checkout/components/kmp/rememberme/data/usecase/RespondChallengeUseCase;Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCase;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;Lvf/y;Lvf/y;)V", "respondChallenge", "()V", "countDownTimeLeft", "Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "code", "updateErrorCode", "(Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;)V", "handleUnexpectedError", "", "index", "value", "", "updateOTPCode", "(ILjava/lang/String;)Z", "Lcom/checkout/components/kmp/rememberme/utils/RememberMeError;", RedirectCustomTabEventLogger.RESULT_ERROR, "handleRememberError$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/utils/RememberMeError;)V", "handleRememberError", "observeChallengeExpiry$rememberme_release", "observeChallengeExpiry", "resendChallenge$rememberme_release", "resendChallenge", "Lcom/checkout/components/kmp/rememberme/data/repositories/ChallengeRepository;", "Lcom/checkout/components/kmp/rememberme/data/usecase/RespondChallengeUseCase;", "Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintChallengeUseCase;", "Lkotlin/jvm/functions/Function1;", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "Lvf/y;", "Lvf/I;", "challengeExpiryJob", "Lvf/I;", "countDownJob", "resendChallengeJob", "Lyf/at;", "_state", "Lyf/at;", "get_state", "()Lyf/at;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OTPViewModel extends RememberMeViewModel<OTPViewState> {
    public static final int $stable = 8;

    @NotNull
    private final at _state;

    @NotNull
    private final AuthInfoRepository authRepository;

    @Nullable
    private I challengeExpiryJob;

    @NotNull
    private final ChallengeRepository challengeRepository;

    @Nullable
    private I countDownJob;

    @NotNull
    private final CreateHintChallengeUseCase createHintChallengeUseCase;

    @NotNull
    private final RememberMeLogger logger;

    @NotNull
    private final AbstractC3220y mainDispatcher;

    @NotNull
    private final AbstractC3220y networkDispatcher;

    @NotNull
    private final Function1<String, Unit> onAuthenticated;

    @Nullable
    private I resendChallengeJob;

    @NotNull
    private final RespondChallengeUseCase respondChallengeUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            try {
                iArr[ErrorCode.OTP_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorCode.OTP_INCORRECT_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorCode.OTP_MAX_RETRIES_REACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorCode.BLANK_CLIENT_TOKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorCode.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OTPViewModel(ChallengeRepository challengeRepository, RespondChallengeUseCase respondChallengeUseCase, AuthInfoRepository authInfoRepository, CreateHintChallengeUseCase createHintChallengeUseCase, Function1 function1, RememberMeLogger rememberMeLogger, AbstractC3220y abstractC3220y, AbstractC3220y abstractC3220y2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeRepository, respondChallengeUseCase, authInfoRepository, createHintChallengeUseCase, function1, rememberMeLogger, r9, r10);
        AbstractC3220y abstractC3220y3;
        AbstractC3220y abstractC3220y4;
        if ((i4 & 64) != 0) {
            e eVar = ao.alpha;
            abstractC3220y3 = n.alpha;
        } else {
            abstractC3220y3 = abstractC3220y;
        }
        if ((i4 & 128) != 0) {
            e eVar2 = ao.alpha;
            abstractC3220y4 = Cf.d.purple;
        } else {
            abstractC3220y4 = abstractC3220y2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void countDownTimeLeft() {
        I i4 = this.countDownJob;
        if (i4 != null) {
            i4.foxtrot(null);
        }
        this.countDownJob = ad.zulu(T.hotel(this), this.mainDispatcher, null, new OTPViewModel$countDownTimeLeft$1(this, null), 2);
    }

    private final void handleUnexpectedError(ErrorCode code) {
        R4.a.echo(this.logger, LogMessages.RESPOND_CHALLENGE_REQUEST_FAILED, LogErrorNames.REMEMBER_ME_RESPOND_CHALLENGE_FAILED, code.getMessage(), null, 8, null);
    }

    private final void respondChallenge() {
        String id2;
        List<Integer> otpCodes = ((OTPViewState) getState$rememberme_release().getValue()).getOtpCodes();
        CreateChallengeResponse createChallengeResponse = (CreateChallengeResponse) this.challengeRepository.getChallenge().getValue();
        if (createChallengeResponse != null && (id2 = createChallengeResponse.getId()) != null) {
            ad.zulu(T.hotel(this), null, null, new OTPViewModel$respondChallenge$1(this, id2, otpCodes, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateErrorCode(ErrorCode code) {
        at atVar = get_state();
        while (true) {
            N n5 = (N) atVar;
            Object value = n5.getValue();
            ErrorCode errorCode = code;
            if (n5.hotel(value, OTPViewState.copy$default((OTPViewState) value, null, false, errorCode, 0, 11, null))) {
                return;
            } else {
                code = errorCode;
            }
        }
    }

    @Override // com.checkout.components.kmp.rememberme.interfaces.RememberMeViewModel
    @NotNull
    public at get_state() {
        return this._state;
    }

    public final void handleRememberError$rememberme_release(@NotNull RememberMeError error) {
        Intrinsics.echo(error, "error");
        int i4 = WhenMappings.$EnumSwitchMapping$0[error.getCode$rememberme_release().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            handleUnexpectedError(error.getCode$rememberme_release());
                            return;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    handleUnexpectedError(error.getCode$rememberme_release());
                    return;
                }
                updateErrorCode(error.getCode$rememberme_release());
                return;
            }
            updateErrorCode(error.getCode$rememberme_release());
            return;
        }
        RememberMeLogger rememberMeLogger = this.logger;
        String message = error.getMessage();
        if (message == null) {
            message = error.getCode$rememberme_release().getMessage();
        }
        R4.a.echo(rememberMeLogger, LogMessages.RESPOND_CHALLENGE_REQUEST_FAILED, LogErrorNames.REMEMBER_ME_RESPOND_CHALLENGE_FAILED, message, null, 8, null);
        updateErrorCode(error.getCode$rememberme_release());
    }

    public final void observeChallengeExpiry$rememberme_release() {
        this.challengeExpiryJob = ad.zulu(T.hotel(this), null, null, new OTPViewModel$observeChallengeExpiry$1(this, null), 3);
    }

    public final void resendChallenge$rememberme_release() {
        HintType hintType;
        Object obj;
        N n5;
        Object value;
        Object value2 = this.authRepository.getHintId().getValue();
        if (((String) value2).length() <= 0) {
            value2 = null;
        }
        String str = (String) value2;
        if (str != null && (hintType = (HintType) this.challengeRepository.getHintType().getValue()) != null) {
            Iterator it = ((Iterable) this.authRepository.getHints().getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Hint) obj).getType() == hintType) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Hint hint = (Hint) obj;
            if (hint != null) {
                int ordinal = hint.getOrdinal();
                at atVar = get_state();
                do {
                    n5 = (N) atVar;
                    value = n5.getValue();
                } while (!n5.hotel(value, OTPViewState.copy$default((OTPViewState) value, Constants.INSTANCE.getDEFAULT_OTP_CODES(), true, null, 0, 8, null)));
                I i4 = this.resendChallengeJob;
                if (i4 != null) {
                    i4.foxtrot(null);
                }
                this.resendChallengeJob = ad.zulu(T.hotel(this), null, null, new OTPViewModel$resendChallenge$2(this, ordinal, str, null), 3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fe.g, fe.e] */
    public final boolean updateOTPCode(int index, @NotNull String value) {
        int parseInt;
        Intrinsics.echo(value, "value");
        if (value.length() == 0) {
            parseInt = -1;
        } else {
            if (value.length() == 1) {
                ?? c1713e = new C1713e(0, 9, 1);
                Integer tango = r.tango(value);
                if (tango != null && c1713e.alpha(tango.intValue())) {
                    parseInt = Integer.parseInt(value);
                }
            }
            return false;
        }
        if (index >= 0 && index < ((OTPViewState) ((N) get_state()).getValue()).getOtpCodes().size()) {
            at atVar = get_state();
            OTPViewState oTPViewState = (OTPViewState) ((N) get_state()).getValue();
            ArrayList B = CollectionsKt.B(((OTPViewState) ((N) get_state()).getValue()).getOtpCodes());
            B.set(index, Integer.valueOf(parseInt));
            ((N) atVar).india(OTPViewState.copy$default(oTPViewState, CollectionsKt.z(B), false, null, 0, 10, null));
            List<Integer> otpCodes = ((OTPViewState) ((N) get_state()).getValue()).getOtpCodes();
            if (otpCodes == null || !otpCodes.isEmpty()) {
                Iterator<T> it = otpCodes.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() == -1) {
                        return true;
                    }
                }
            }
            respondChallenge();
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OTPViewModel(@NotNull ChallengeRepository challengeRepository, @NotNull RespondChallengeUseCase respondChallengeUseCase, @NotNull AuthInfoRepository authRepository, @NotNull CreateHintChallengeUseCase createHintChallengeUseCase, @NotNull Function1<? super String, Unit> onAuthenticated, @NotNull RememberMeLogger logger, @NotNull AbstractC3220y mainDispatcher, @NotNull AbstractC3220y networkDispatcher) {
        Intrinsics.echo(challengeRepository, "challengeRepository");
        Intrinsics.echo(respondChallengeUseCase, "respondChallengeUseCase");
        Intrinsics.echo(authRepository, "authRepository");
        Intrinsics.echo(createHintChallengeUseCase, "createHintChallengeUseCase");
        Intrinsics.echo(onAuthenticated, "onAuthenticated");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(mainDispatcher, "mainDispatcher");
        Intrinsics.echo(networkDispatcher, "networkDispatcher");
        this.challengeRepository = challengeRepository;
        this.respondChallengeUseCase = respondChallengeUseCase;
        this.authRepository = authRepository;
        this.createHintChallengeUseCase = createHintChallengeUseCase;
        this.onAuthenticated = onAuthenticated;
        this.logger = logger;
        this.mainDispatcher = mainDispatcher;
        this.networkDispatcher = networkDispatcher;
        this._state = AbstractC3428A.charlie(new OTPViewState(null, false, null, 0, 15, null));
        observeChallengeExpiry$rememberme_release();
        countDownTimeLeft();
    }
}
