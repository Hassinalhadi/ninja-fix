package com.checkout.components.rememberme.wallet;

import Nd.c;
import Od.a;
import Xd.n;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.rememberme.E1;
import com.checkout.components.rememberme.data.PaymentStateRepository;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.usecase.SubmitSavedCardUseCase;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.rememberme.wallet.WalletButtonDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.N;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u00124\u0010\n\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/rememberme/wallet/WalletButtonDelegate;", "", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "jwtTokenRepository", "Lkotlin/Function4;", "", "Lkotlin/Function0;", "", "LNd/c;", "onSubmitNewCard", "isTokenizationInProgress", "Lcom/checkout/components/rememberme/usecase/SubmitSavedCardUseCase;", "submitSavedCardUseCase", "Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "viewStateRepository", "Lcom/checkout/components/rememberme/data/PaymentStateRepository;", "paymentStateRepository", "Lcom/checkout/components/rememberme/model/RememberMeCallback;", "rememberMeCallback", "<init>", "(Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;LXd/n;Lkotlin/jvm/functions/Function0;Lcom/checkout/components/rememberme/usecase/SubmitSavedCardUseCase;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/rememberme/data/PaymentStateRepository;Lcom/checkout/components/rememberme/model/RememberMeCallback;)V", "isPaymentInProgressOrComplete$rememberme_standardRelease", "()Z", "isPaymentInProgressOrComplete", "onClick$rememberme_standardRelease", "(LNd/c;)Ljava/lang/Object;", "onClick", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletButtonDelegate {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveStateFlowRepository f6369a;

    /* renamed from: b, reason: collision with root package name */
    private final n f6370b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f6371c;

    /* renamed from: d, reason: collision with root package name */
    private final SubmitSavedCardUseCase f6372d;
    private final PrimitiveStateFlowRepository e;

    /* renamed from: f, reason: collision with root package name */
    private final PaymentStateRepository f6373f;

    /* renamed from: g, reason: collision with root package name */
    private final RememberMeCallback f6374g;

    public WalletButtonDelegate(@NotNull PrimitiveStateFlowRepository<String> jwtTokenRepository, @NotNull n onSubmitNewCard, @NotNull Function0<Boolean> isTokenizationInProgress, @NotNull SubmitSavedCardUseCase submitSavedCardUseCase, @NotNull PrimitiveStateFlowRepository<WalletScreenViewState> viewStateRepository, @NotNull PaymentStateRepository paymentStateRepository, @Nullable RememberMeCallback rememberMeCallback) {
        Intrinsics.echo(jwtTokenRepository, "jwtTokenRepository");
        Intrinsics.echo(onSubmitNewCard, "onSubmitNewCard");
        Intrinsics.echo(isTokenizationInProgress, "isTokenizationInProgress");
        Intrinsics.echo(submitSavedCardUseCase, "submitSavedCardUseCase");
        Intrinsics.echo(viewStateRepository, "viewStateRepository");
        Intrinsics.echo(paymentStateRepository, "paymentStateRepository");
        this.f6369a = jwtTokenRepository;
        this.f6370b = onSubmitNewCard;
        this.f6371c = isTokenizationInProgress;
        this.f6372d = submitSavedCardUseCase;
        this.e = viewStateRepository;
        this.f6373f = paymentStateRepository;
        this.f6374g = rememberMeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(WalletButtonDelegate walletButtonDelegate) {
        ((N) walletButtonDelegate.f6373f.getStateFlow()).india(PaymentState.Default.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(WalletButtonDelegate walletButtonDelegate) {
        ((N) walletButtonDelegate.f6373f.getStateFlow()).india(PaymentState.Default.INSTANCE);
        return Unit.INSTANCE;
    }

    public final boolean isPaymentInProgressOrComplete$rememberme_standardRelease() {
        if (((Boolean) this.f6371c.invoke()).booleanValue() || CollectionsKt.listOf(PaymentState.InProgress.INSTANCE, PaymentState.Completed.INSTANCE).contains(this.f6373f.getFlow().getValue())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (r3.invoke(r2, r9, r6, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r9.execute2(r2, (Nd.c<? super kotlin.Unit>) r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005f, code lost:
    
        if (r9 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onClick$rememberme_standardRelease(@NotNull c<? super Unit> cVar) {
        E1 e12;
        Object obj;
        int i4;
        Function1<c<? super Boolean>, Object> handlePayButtonTap;
        RememberMeCallback rememberMeCallback;
        WalletScreenViewState walletScreenViewState;
        if (cVar instanceof E1) {
            e12 = (E1) cVar;
            int i5 = e12.e;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                e12.e = i5 - RecyclerView.UNDEFINED_DURATION;
                obj = e12.f5749c;
                a aVar = a.alpha;
                i4 = e12.e;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        ResultKt.alpha(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    if (isPaymentInProgressOrComplete$rememberme_standardRelease()) {
                        return Unit.INSTANCE;
                    }
                    RememberMeCallback rememberMeCallback2 = this.f6374g;
                    if (rememberMeCallback2 != null && (handlePayButtonTap = rememberMeCallback2.getHandlePayButtonTap()) != null) {
                        e12.e = 1;
                        obj = handlePayButtonTap.invoke(e12);
                    }
                    rememberMeCallback = this.f6374g;
                    if (rememberMeCallback != null) {
                        rememberMeCallback.getOnSubmit().invoke();
                    }
                    walletScreenViewState = (WalletScreenViewState) this.e.getFlow().getValue();
                    if (walletScreenViewState != null) {
                        ((N) this.f6373f.getStateFlow()).india(PaymentState.InProgress.INSTANCE);
                        if (Intrinsics.areEqual(walletScreenViewState.getSelectedMethodId(), Constants.ADD_CARD_ITEM_ID)) {
                            String str = (String) this.f6369a.getFlow().getValue();
                            if (str != null) {
                                n nVar = this.f6370b;
                                Boolean valueOf = Boolean.valueOf(walletScreenViewState.getDefaultPaymentChecked());
                                final int i10 = 0;
                                Function0 function0 = new Function0(this) { // from class: h5.b
                                    public final /* synthetic */ WalletButtonDelegate purple;

                                    {
                                        this.purple = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit a6;
                                        Unit b2;
                                        switch (i10) {
                                            case 0:
                                                a6 = WalletButtonDelegate.a(this.purple);
                                                return a6;
                                            default:
                                                b2 = WalletButtonDelegate.b(this.purple);
                                                return b2;
                                        }
                                    }
                                };
                                e12.f5747a = null;
                                e12.f5748b = null;
                                e12.e = 2;
                            }
                        } else {
                            SubmitSavedCardUseCase submitSavedCardUseCase = this.f6372d;
                            final int i11 = 1;
                            Function0<Unit> function02 = new Function0(this) { // from class: h5.b
                                public final /* synthetic */ WalletButtonDelegate purple;

                                {
                                    this.purple = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit a6;
                                    Unit b2;
                                    switch (i11) {
                                        case 0:
                                            a6 = WalletButtonDelegate.a(this.purple);
                                            return a6;
                                        default:
                                            b2 = WalletButtonDelegate.b(this.purple);
                                            return b2;
                                    }
                                }
                            };
                            e12.f5747a = null;
                            e12.e = 3;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                rememberMeCallback = this.f6374g;
                if (rememberMeCallback != null) {
                }
                walletScreenViewState = (WalletScreenViewState) this.e.getFlow().getValue();
                if (walletScreenViewState != null) {
                }
                return Unit.INSTANCE;
            }
        }
        e12 = new E1(this, cVar);
        obj = e12.f5749c;
        a aVar2 = a.alpha;
        i4 = e12.e;
        if (i4 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        rememberMeCallback = this.f6374g;
        if (rememberMeCallback != null) {
        }
        walletScreenViewState = (WalletScreenViewState) this.e.getFlow().getValue();
        if (walletScreenViewState != null) {
        }
        return Unit.INSTANCE;
    }
}
