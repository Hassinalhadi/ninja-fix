package com.checkout.components.rememberme.usecase;

import Nd.c;
import Od.a;
import Xd.l;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.PayRequestPayload;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.checkout.components.interfaces.model.TokenizationResult;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.rememberme.C0974q1;
import com.checkout.components.rememberme.C0977r1;
import com.checkout.components.rememberme.C0980s1;
import com.checkout.components.rememberme.C0983t1;
import com.checkout.components.rememberme.model.CardDetails;
import com.checkout.components.rememberme.model.CvvTokenResponse;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.PaymentMethod;
import com.checkout.components.rememberme.model.SubmitSavedCardUseCaseRequest;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.utils.Constants;
import com.clevertap.android.sdk.db.Column;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;
import vf.AbstractC3220y;
import vf.ad;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/rememberme/usecase/SubmitSavedCardUseCase;", "Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "Lkotlin/Function0;", "", "Lcom/checkout/components/rememberme/model/SubmitSavedCardUseCaseRequest;", "request", "<init>", "(Lcom/checkout/components/rememberme/model/SubmitSavedCardUseCaseRequest;)V", Column.DATA, "execute", "(Lkotlin/jvm/functions/Function0;LNd/c;)Ljava/lang/Object;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubmitSavedCardUseCase implements SuspendUseCase<Function0<? extends Unit>, Unit> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SubmitSavedCardUseCaseRequest f6339a;

    public SubmitSavedCardUseCase(@NotNull SubmitSavedCardUseCaseRequest request) {
        Intrinsics.echo(request, "request");
        this.f6339a = request;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0195, code lost:
    
        if (r1.invoke(r14, r2) == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Headers headers, TokenDetailsResponse tokenDetailsResponse, String str, String str2, String str3, Function0 function0, c cVar) {
        C0983t1 c0983t1;
        int i4;
        SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest;
        String token;
        String str4;
        int i5;
        String str5;
        CallbackResult callbackResult;
        String str6;
        Function0 function02;
        String str7;
        String str8;
        String str9;
        String str10;
        int i10;
        String str11;
        N n5;
        Object value;
        String errorMessage;
        if (cVar instanceof C0983t1) {
            c0983t1 = (C0983t1) cVar;
            int i11 = c0983t1.f6314o;
            if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0983t1.f6314o = i11 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0983t1.f6312m;
                a aVar = a.alpha;
                i4 = c0983t1.f6314o;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = c0983t1.f6311l;
                    str10 = (String) c0983t1.f6308i;
                    token = (String) c0983t1.f6307h;
                    submitSavedCardUseCaseRequest = (SubmitSavedCardUseCaseRequest) c0983t1.f6306g;
                    function02 = (Function0) c0983t1.f6305f;
                    str11 = (String) c0983t1.f6304d;
                    str9 = (String) c0983t1.f6303c;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    submitSavedCardUseCaseRequest = this.f6339a;
                    String str12 = headers.get("X-Tokenizationreference");
                    if (str12 == null) {
                        str12 = "";
                    }
                    token = tokenDetailsResponse.getToken();
                    TokenDetails map = submitSavedCardUseCaseRequest.getTokenMapper().map(tokenDetailsResponse);
                    CardMetadata cardMetadata = submitSavedCardUseCaseRequest.getCardMetadataRepository().getState().get(str3);
                    String scheme = tokenDetailsResponse.getScheme();
                    if (scheme != null) {
                        str4 = scheme.toLowerCase(Locale.ROOT);
                        Intrinsics.delta(str4, "toLowerCase(...)");
                    } else {
                        str4 = null;
                    }
                    TokenizationResult tokenizationResult = new TokenizationResult("card", map, cardMetadata, str4);
                    l onTokenized = submitSavedCardUseCaseRequest.getOnTokenized();
                    i5 = 0;
                    if (onTokenized != null) {
                        c0983t1.f6301a = null;
                        c0983t1.f6302b = null;
                        str9 = str;
                        c0983t1.f6303c = str9;
                        c0983t1.f6304d = str2;
                        c0983t1.e = null;
                        c0983t1.f6305f = function0;
                        c0983t1.f6306g = submitSavedCardUseCaseRequest;
                        c0983t1.f6307h = token;
                        c0983t1.f6308i = str12;
                        c0983t1.f6309j = null;
                        c0983t1.f6311l = 0;
                        c0983t1.f6314o = 1;
                        Object invoke = onTokenized.invoke(tokenizationResult, c0983t1);
                        if (invoke != aVar) {
                            str10 = str12;
                            obj = invoke;
                            i10 = 0;
                            str11 = str2;
                            function02 = function0;
                        }
                        return aVar;
                    }
                    str5 = str12;
                    callbackResult = null;
                    str6 = str2;
                    function02 = function0;
                    str7 = str;
                    str8 = token;
                    if ((callbackResult instanceof CallbackResult.Accepted) && callbackResult != null) {
                        if (callbackResult instanceof CallbackResult.Rejected) {
                            at uiPaymentErrorMessage = submitSavedCardUseCaseRequest.getRmStateManager().getUiPaymentErrorMessage();
                            do {
                                n5 = (N) uiPaymentErrorMessage;
                                value = n5.getValue();
                                errorMessage = ((CallbackResult.Rejected) callbackResult).getErrorMessage();
                                if (errorMessage == null) {
                                    errorMessage = "";
                                }
                            } while (!n5.hotel(value, errorMessage));
                            function02.invoke();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        l onPayRememberMe = submitSavedCardUseCaseRequest.getOnPayRememberMe();
                        PayRequestPayload.RememberMe rememberMe = new PayRequestPayload.RememberMe(str8, str5, str6, false, null, str7, null, 64, null);
                        c0983t1.f6301a = null;
                        c0983t1.f6302b = null;
                        c0983t1.f6303c = null;
                        c0983t1.f6304d = null;
                        c0983t1.e = null;
                        c0983t1.f6305f = null;
                        c0983t1.f6306g = null;
                        c0983t1.f6307h = null;
                        c0983t1.f6308i = null;
                        c0983t1.f6309j = null;
                        c0983t1.f6310k = null;
                        c0983t1.f6311l = i5;
                        c0983t1.f6314o = 2;
                    }
                    return Unit.INSTANCE;
                }
                callbackResult = (CallbackResult) obj;
                str5 = str10;
                str6 = str11;
                i5 = i10;
                str8 = token;
                str7 = str9;
                if (callbackResult instanceof CallbackResult.Accepted) {
                }
                l onPayRememberMe2 = submitSavedCardUseCaseRequest.getOnPayRememberMe();
                PayRequestPayload.RememberMe rememberMe2 = new PayRequestPayload.RememberMe(str8, str5, str6, false, null, str7, null, 64, null);
                c0983t1.f6301a = null;
                c0983t1.f6302b = null;
                c0983t1.f6303c = null;
                c0983t1.f6304d = null;
                c0983t1.e = null;
                c0983t1.f6305f = null;
                c0983t1.f6306g = null;
                c0983t1.f6307h = null;
                c0983t1.f6308i = null;
                c0983t1.f6309j = null;
                c0983t1.f6310k = null;
                c0983t1.f6311l = i5;
                c0983t1.f6314o = 2;
            }
        }
        c0983t1 = new C0983t1(this, cVar);
        Object obj2 = c0983t1.f6312m;
        a aVar2 = a.alpha;
        i4 = c0983t1.f6314o;
        if (i4 == 0) {
        }
        callbackResult = (CallbackResult) obj2;
        str5 = str10;
        str6 = str11;
        i5 = i10;
        str8 = token;
        str7 = str9;
        if (callbackResult instanceof CallbackResult.Accepted) {
        }
        l onPayRememberMe22 = submitSavedCardUseCaseRequest.getOnPayRememberMe();
        PayRequestPayload.RememberMe rememberMe22 = new PayRequestPayload.RememberMe(str8, str5, str6, false, null, str7, null, 64, null);
        c0983t1.f6301a = null;
        c0983t1.f6302b = null;
        c0983t1.f6303c = null;
        c0983t1.f6304d = null;
        c0983t1.e = null;
        c0983t1.f6305f = null;
        c0983t1.f6306g = null;
        c0983t1.f6307h = null;
        c0983t1.f6308i = null;
        c0983t1.f6309j = null;
        c0983t1.f6310k = null;
        c0983t1.f6311l = i5;
        c0983t1.f6314o = 2;
    }

    @Override // com.checkout.components.interfaces.usecase.SuspendUseCase
    public final /* bridge */ /* synthetic */ Object execute(Function0<? extends Unit> function0, c<? super Unit> cVar) {
        return execute2((Function0<Unit>) function0, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02d5, code lost:
    
        if (r1.a(r2, r4, r1, r5, r6, r7, r8) == r9) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0355, code lost:
    
        if (r1.a(r6, r13, null, r5, r4, r7, r8) == r9) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Nullable
    /* renamed from: execute, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute2(@NotNull Function0<Unit> function0, @NotNull c<? super Unit> cVar) {
        C0974q1 c0974q1;
        int i4;
        String selectedMethodId;
        String str;
        WalletScreenViewState walletScreenViewState;
        int i5;
        WalletScreenViewState walletScreenViewState2;
        String str2;
        String str3;
        Object blue;
        SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest;
        Function0<Unit> function02;
        int i10;
        String str4;
        int i11;
        List<WalletListItem> walletListItems;
        Iterator<T> it;
        Object obj;
        WalletListItem walletListItem;
        List<PaymentMethod> paymentMethods;
        Object obj2;
        CardDetails cardDetails;
        Object obj3;
        Object obj4;
        Headers headers;
        Object obj5;
        Function0<Unit> function03;
        int i12;
        String str5;
        TokenDetailsResponse tokenDetailsResponse;
        Object obj6;
        Function0<Unit> function04;
        Object obj7;
        Function0<Unit> function05;
        Throwable m207exceptionOrNullimpl;
        Throwable m207exceptionOrNullimpl2;
        SubmitSavedCardUseCase submitSavedCardUseCase = this;
        if (cVar instanceof C0974q1) {
            c0974q1 = (C0974q1) cVar;
            int i13 = c0974q1.f6198r;
            if ((i13 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0974q1.f6198r = i13 - RecyclerView.UNDEFINED_DURATION;
                C0974q1 c0974q12 = c0974q1;
                Object obj8 = c0974q12.f6196p;
                a aVar = a.alpha;
                i4 = c0974q12.f6198r;
                if (i4 != 0) {
                    ResultKt.alpha(obj8);
                    SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest2 = submitSavedCardUseCase.f6339a;
                    WalletScreenViewState walletScreenViewState3 = (WalletScreenViewState) submitSavedCardUseCaseRequest2.getWalletScreenViewStateRepository().getFlow().getValue();
                    if (walletScreenViewState3 != null && (selectedMethodId = walletScreenViewState3.getSelectedMethodId()) != null) {
                        if (Intrinsics.areEqual(selectedMethodId, Constants.ADD_CARD_ITEM_ID) || StringsKt.gray(selectedMethodId)) {
                            selectedMethodId = null;
                        }
                        if (selectedMethodId != null) {
                            String str6 = (String) submitSavedCardUseCaseRequest2.getJwtTokenRepository().getFlow().getValue();
                            if (str6 != null) {
                                if (StringsKt.gray(str6)) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    try {
                                        String sub = submitSavedCardUseCaseRequest2.getJwtDecoder().getSub(str6);
                                        if (sub == null) {
                                            SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest3 = submitSavedCardUseCase.f6339a;
                                            CheckoutError.Validation validation = new CheckoutError.Validation("Failed to decode consumer token", CheckoutErrorCode.VALIDATION_FAILED, ErrorExtensionsKt.toPaymentMethodErrorDetails(submitSavedCardUseCaseRequest3.getLogDetails()));
                                            Function1<CheckoutError, Unit> onError = submitSavedCardUseCaseRequest3.getOnError();
                                            if (onError != null) {
                                                onError.invoke(validation);
                                            }
                                            N4.a.alpha(submitSavedCardUseCaseRequest3.getLogger(), validation, null, false, 4, null);
                                            return Unit.INSTANCE;
                                        }
                                        GetWalletResponse getWalletResponse = (GetWalletResponse) submitSavedCardUseCaseRequest2.getWalletRepository().getFlow().getValue();
                                        if (getWalletResponse != null && (paymentMethods = getWalletResponse.getPaymentMethods()) != null) {
                                            Iterator<T> it2 = paymentMethods.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    obj2 = null;
                                                    break;
                                                }
                                                obj2 = it2.next();
                                                if (Intrinsics.areEqual(((PaymentMethod) obj2).getId(), selectedMethodId)) {
                                                    break;
                                                }
                                            }
                                            PaymentMethod paymentMethod = (PaymentMethod) obj2;
                                            if (paymentMethod != null && (cardDetails = paymentMethod.getCardDetails()) != null) {
                                                str = cardDetails.getBin();
                                                walletScreenViewState = (WalletScreenViewState) submitSavedCardUseCaseRequest2.getWalletScreenViewStateRepository().getFlow().getValue();
                                                if (walletScreenViewState != null && (walletListItems = walletScreenViewState.getWalletListItems()) != null) {
                                                    it = walletListItems.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            obj = null;
                                                            break;
                                                        }
                                                        obj = it.next();
                                                        if (Intrinsics.areEqual(((WalletListItem) obj).getId(), selectedMethodId)) {
                                                            break;
                                                        }
                                                    }
                                                    walletListItem = (WalletListItem) obj;
                                                    if (walletListItem != null) {
                                                        i5 = walletListItem.getShowCvvInputField();
                                                        walletScreenViewState2 = (WalletScreenViewState) submitSavedCardUseCaseRequest2.getWalletScreenViewStateRepository().getFlow().getValue();
                                                        if (walletScreenViewState2 != null || (str2 = walletScreenViewState2.getCvvInput()) == null || StringsKt.gray(str2) || i5 == 0) {
                                                            str2 = null;
                                                        }
                                                        AbstractC3220y dispatcher = submitSavedCardUseCaseRequest2.getDispatcher();
                                                        String str7 = selectedMethodId;
                                                        C0977r1 c0977r1 = new C0977r1(submitSavedCardUseCaseRequest2, str6, sub, str7, null);
                                                        str3 = str7;
                                                        c0974q12.f6182a = function0;
                                                        c0974q12.f6183b = submitSavedCardUseCaseRequest2;
                                                        c0974q12.f6184c = null;
                                                        c0974q12.f6185d = null;
                                                        c0974q12.e = str2;
                                                        c0974q12.f6186f = str;
                                                        c0974q12.f6187g = str3;
                                                        c0974q12.f6193m = 0;
                                                        c0974q12.f6194n = i5;
                                                        c0974q12.f6198r = 1;
                                                        blue = ad.blue(dispatcher, c0977r1, c0974q12);
                                                        if (blue != aVar) {
                                                            submitSavedCardUseCaseRequest = submitSavedCardUseCaseRequest2;
                                                            function02 = function0;
                                                            obj8 = blue;
                                                            i10 = 0;
                                                            str4 = str;
                                                            i11 = i5;
                                                        }
                                                        return aVar;
                                                    }
                                                }
                                                i5 = 0;
                                                walletScreenViewState2 = (WalletScreenViewState) submitSavedCardUseCaseRequest2.getWalletScreenViewStateRepository().getFlow().getValue();
                                                if (walletScreenViewState2 != null) {
                                                }
                                                str2 = null;
                                                AbstractC3220y dispatcher2 = submitSavedCardUseCaseRequest2.getDispatcher();
                                                String str72 = selectedMethodId;
                                                C0977r1 c0977r12 = new C0977r1(submitSavedCardUseCaseRequest2, str6, sub, str72, null);
                                                str3 = str72;
                                                c0974q12.f6182a = function0;
                                                c0974q12.f6183b = submitSavedCardUseCaseRequest2;
                                                c0974q12.f6184c = null;
                                                c0974q12.f6185d = null;
                                                c0974q12.e = str2;
                                                c0974q12.f6186f = str;
                                                c0974q12.f6187g = str3;
                                                c0974q12.f6193m = 0;
                                                c0974q12.f6194n = i5;
                                                c0974q12.f6198r = 1;
                                                blue = ad.blue(dispatcher2, c0977r12, c0974q12);
                                                if (blue != aVar) {
                                                }
                                                return aVar;
                                            }
                                        }
                                        str = null;
                                        walletScreenViewState = (WalletScreenViewState) submitSavedCardUseCaseRequest2.getWalletScreenViewStateRepository().getFlow().getValue();
                                        if (walletScreenViewState != null) {
                                            it = walletListItems.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                }
                                            }
                                            walletListItem = (WalletListItem) obj;
                                            if (walletListItem != null) {
                                            }
                                        }
                                        i5 = 0;
                                        walletScreenViewState2 = (WalletScreenViewState) submitSavedCardUseCaseRequest2.getWalletScreenViewStateRepository().getFlow().getValue();
                                        if (walletScreenViewState2 != null) {
                                        }
                                        str2 = null;
                                        AbstractC3220y dispatcher22 = submitSavedCardUseCaseRequest2.getDispatcher();
                                        String str722 = selectedMethodId;
                                        C0977r1 c0977r122 = new C0977r1(submitSavedCardUseCaseRequest2, str6, sub, str722, null);
                                        str3 = str722;
                                        c0974q12.f6182a = function0;
                                        c0974q12.f6183b = submitSavedCardUseCaseRequest2;
                                        c0974q12.f6184c = null;
                                        c0974q12.f6185d = null;
                                        c0974q12.e = str2;
                                        c0974q12.f6186f = str;
                                        c0974q12.f6187g = str3;
                                        c0974q12.f6193m = 0;
                                        c0974q12.f6194n = i5;
                                        c0974q12.f6198r = 1;
                                        blue = ad.blue(dispatcher22, c0977r122, c0974q12);
                                        if (blue != aVar) {
                                        }
                                        return aVar;
                                    } catch (Exception e) {
                                        String echo = AbstractC2689j6.echo(e);
                                        SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest4 = submitSavedCardUseCase.f6339a;
                                        CheckoutError.Validation validation2 = new CheckoutError.Validation("Failed to decode consumer token", CheckoutErrorCode.VALIDATION_FAILED, ErrorExtensionsKt.toPaymentMethodErrorDetails(submitSavedCardUseCaseRequest4.getLogDetails()));
                                        Function1<CheckoutError, Unit> onError2 = submitSavedCardUseCaseRequest4.getOnError();
                                        if (onError2 != null) {
                                            onError2.invoke(validation2);
                                        }
                                        N4.a.alpha(submitSavedCardUseCaseRequest4.getLogger(), validation2, echo, false, 4, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                            SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest5 = submitSavedCardUseCase.f6339a;
                            CheckoutError.Validation validation3 = new CheckoutError.Validation("Consumer token is missing", CheckoutErrorCode.VALIDATION_FAILED, ErrorExtensionsKt.toPaymentMethodErrorDetails(submitSavedCardUseCaseRequest5.getLogDetails()));
                            Function1<CheckoutError, Unit> onError3 = submitSavedCardUseCaseRequest5.getOnError();
                            if (onError3 != null) {
                                onError3.invoke(validation3);
                            }
                            N4.a.alpha(submitSavedCardUseCaseRequest5.getLogger(), validation3, null, false, 4, null);
                            return Unit.INSTANCE;
                        }
                    }
                    SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest6 = submitSavedCardUseCase.f6339a;
                    CheckoutError.Validation validation4 = new CheckoutError.Validation("None of the payment methods are selected", CheckoutErrorCode.VALIDATION_FAILED, ErrorExtensionsKt.toPaymentMethodErrorDetails(submitSavedCardUseCaseRequest6.getLogDetails()));
                    Function1<CheckoutError, Unit> onError4 = submitSavedCardUseCaseRequest6.getOnError();
                    if (onError4 != null) {
                        onError4.invoke(validation4);
                    }
                    return Unit.INSTANCE;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        i12 = c0974q12.f6195o;
                        i11 = c0974q12.f6194n;
                        i10 = c0974q12.f6193m;
                        tokenDetailsResponse = (TokenDetailsResponse) c0974q12.f6190j;
                        headers = (Headers) c0974q12.f6189i;
                        str5 = (String) c0974q12.f6188h;
                        String str8 = (String) c0974q12.f6187g;
                        obj5 = c0974q12.f6186f;
                        function03 = (Function0) c0974q12.f6182a;
                        ResultKt.alpha(obj8);
                        str4 = str8;
                        obj6 = ((Result) obj8).alpha;
                        if (obj6 instanceof k) {
                            String token = ((CvvTokenResponse) ((Pair) obj6).second).getToken();
                            c0974q12.f6182a = function03;
                            c0974q12.f6183b = null;
                            c0974q12.f6184c = null;
                            c0974q12.f6185d = null;
                            c0974q12.e = null;
                            c0974q12.f6186f = obj5;
                            c0974q12.f6187g = null;
                            c0974q12.f6188h = null;
                            c0974q12.f6189i = null;
                            c0974q12.f6190j = null;
                            c0974q12.f6191k = obj6;
                            c0974q12.f6192l = null;
                            c0974q12.f6193m = i10;
                            c0974q12.f6194n = i11;
                            c0974q12.f6195o = i12;
                            c0974q12.f6198r = 3;
                            Headers headers2 = headers;
                            String str9 = str5;
                            function04 = function03;
                            submitSavedCardUseCase = this;
                        } else {
                            submitSavedCardUseCase = this;
                            function04 = function03;
                        }
                        obj7 = obj6;
                        function05 = function04;
                        m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj7);
                        if (m207exceptionOrNullimpl != null) {
                        }
                        obj4 = obj5;
                        m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(obj4);
                        if (m207exceptionOrNullimpl2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj4 = c0974q12.f6186f;
                        ResultKt.alpha(obj8);
                        m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(obj4);
                        if (m207exceptionOrNullimpl2 != null) {
                            String message = m207exceptionOrNullimpl2.getMessage();
                            String concat = "Could not create merchant token. ".concat(message != null ? message : "");
                            String echo2 = AbstractC2689j6.echo(m207exceptionOrNullimpl2);
                            SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest7 = submitSavedCardUseCase.f6339a;
                            CheckoutError.Request request = new CheckoutError.Request(concat, CheckoutErrorCode.SERVER_COMMUNICATION_ERROR, ErrorExtensionsKt.toRequestErrorDetails$default(submitSavedCardUseCaseRequest7.getLogDetails(), null, null, null, null, 15, null));
                            Function1<CheckoutError, Unit> onError5 = submitSavedCardUseCaseRequest7.getOnError();
                            if (onError5 != null) {
                                onError5.invoke(request);
                            }
                            N4.a.alpha(submitSavedCardUseCaseRequest7.getLogger(), request, echo2, false, 4, null);
                        }
                        return Unit.INSTANCE;
                    }
                    obj7 = c0974q12.f6191k;
                    Object obj9 = c0974q12.f6186f;
                    function05 = (Function0) c0974q12.f6182a;
                    ResultKt.alpha(obj8);
                    obj5 = obj9;
                    m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj7);
                    if (m207exceptionOrNullimpl != null) {
                        String message2 = m207exceptionOrNullimpl.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        String concat2 = "Could not create cvv token. ".concat(message2);
                        String echo3 = AbstractC2689j6.echo(m207exceptionOrNullimpl);
                        SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest8 = submitSavedCardUseCase.f6339a;
                        CheckoutError.Request request2 = new CheckoutError.Request(concat2, CheckoutErrorCode.SERVER_COMMUNICATION_ERROR, ErrorExtensionsKt.toRequestErrorDetails$default(submitSavedCardUseCaseRequest8.getLogDetails(), null, null, null, null, 15, null));
                        Function1<CheckoutError, Unit> onError6 = submitSavedCardUseCaseRequest8.getOnError();
                        if (onError6 != null) {
                            onError6.invoke(request2);
                        }
                        N4.a.alpha(submitSavedCardUseCaseRequest8.getLogger(), request2, echo3, false, 4, null);
                        function05.invoke();
                    }
                    obj4 = obj5;
                    m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(obj4);
                    if (m207exceptionOrNullimpl2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                i11 = c0974q12.f6194n;
                i10 = c0974q12.f6193m;
                String str10 = (String) c0974q12.f6187g;
                String str11 = (String) c0974q12.f6186f;
                str2 = (String) c0974q12.e;
                submitSavedCardUseCaseRequest = (SubmitSavedCardUseCaseRequest) c0974q12.f6183b;
                Function0<Unit> function06 = (Function0) c0974q12.f6182a;
                ResultKt.alpha(obj8);
                function02 = function06;
                str3 = str10;
                str4 = str11;
                obj3 = ((Result) obj8).alpha;
                if (!(obj3 instanceof k)) {
                    Pair pair = (Pair) obj3;
                    headers = (Headers) pair.first;
                    TokenDetailsResponse tokenDetailsResponse2 = (TokenDetailsResponse) pair.second;
                    if (str2 != null) {
                        AbstractC3220y dispatcher3 = submitSavedCardUseCaseRequest.getDispatcher();
                        C0980s1 c0980s1 = new C0980s1(submitSavedCardUseCaseRequest, str2, null);
                        c0974q12.f6182a = function02;
                        c0974q12.f6183b = null;
                        c0974q12.f6184c = null;
                        c0974q12.f6185d = null;
                        c0974q12.e = null;
                        c0974q12.f6186f = obj3;
                        c0974q12.f6187g = str4;
                        c0974q12.f6188h = str3;
                        c0974q12.f6189i = headers;
                        c0974q12.f6190j = tokenDetailsResponse2;
                        c0974q12.f6193m = i10;
                        c0974q12.f6194n = i11;
                        c0974q12.f6195o = 0;
                        c0974q12.f6198r = 2;
                        Object blue2 = ad.blue(dispatcher3, c0980s1, c0974q12);
                        if (blue2 != aVar) {
                            obj5 = obj3;
                            obj8 = blue2;
                            function03 = function02;
                            i12 = 0;
                            str5 = str3;
                            tokenDetailsResponse = tokenDetailsResponse2;
                            obj6 = ((Result) obj8).alpha;
                            if (obj6 instanceof k) {
                            }
                            obj7 = obj6;
                            function05 = function04;
                            m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj7);
                            if (m207exceptionOrNullimpl != null) {
                            }
                            obj4 = obj5;
                            m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(obj4);
                            if (m207exceptionOrNullimpl2 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        c0974q12.f6182a = null;
                        c0974q12.f6183b = null;
                        c0974q12.f6184c = null;
                        c0974q12.f6185d = null;
                        c0974q12.e = null;
                        c0974q12.f6186f = obj3;
                        c0974q12.f6187g = null;
                        c0974q12.f6188h = null;
                        c0974q12.f6189i = null;
                        c0974q12.f6190j = null;
                        c0974q12.f6193m = i10;
                        c0974q12.f6194n = i11;
                        c0974q12.f6195o = 0;
                        c0974q12.f6198r = 4;
                    }
                    return aVar;
                }
                obj4 = obj3;
                m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(obj4);
                if (m207exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            }
        }
        c0974q1 = new C0974q1(submitSavedCardUseCase, cVar);
        C0974q1 c0974q122 = c0974q1;
        Object obj82 = c0974q122.f6196p;
        a aVar2 = a.alpha;
        i4 = c0974q122.f6198r;
        if (i4 != 0) {
        }
        obj3 = ((Result) obj82).alpha;
        if (!(obj3 instanceof k)) {
        }
        obj4 = obj3;
        m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(obj4);
        if (m207exceptionOrNullimpl2 != null) {
        }
        return Unit.INSTANCE;
    }
}
