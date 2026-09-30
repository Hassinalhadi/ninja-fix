package com.checkout.components.rememberme;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.di.NetworkModule;
import com.checkout.components.rememberme.di.RMStateManagerModule;
import com.checkout.components.rememberme.di.RTLModule;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.checkout.components.rememberme.di.RepositoryModule;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.model.SelectedPaymentMethod;
import com.checkout.components.rememberme.model.SubmitAddCardPayload;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.rememberme.RememberMeViewRenderer;
import com.checkout.components.ui.model.CardScheme;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2763s0;
import yf.at;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B§\u0001\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001ej\u0004\u0018\u0001` ¢\u0006\u0004\b\u0004\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0017¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020#¢\u0006\u0004\b5\u0010%J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b9\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028AX\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/checkout/components/rememberme/CheckoutRememberMe;", "Lcom/checkout/components/rememberme/rememberme/RememberMeViewRenderer;", "Lcom/checkout/components/rememberme/di/DiComponent;", "di", "<init>", "(Lcom/checkout/components/rememberme/di/DiComponent;)V", "", "publicKey", "Lcom/checkout/components/interfaces/Environment;", "environment", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "LNd/c;", "", "", "onPayRememberMe", "Lyf/at;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", Constants.KEY_CONFIG, "", "Lcom/checkout/components/ui/model/CardScheme;", "supportedSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedTypes", "Lcom/checkout/components/interfaces/localisation/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "(Ljava/lang/String;Lcom/checkout/components/interfaces/Environment;Landroid/content/Context;LXd/l;Lyf/at;Lcom/checkout/components/interfaces/component/RememberMeConfiguration;Ljava/util/List;Ljava/util/List;Lcom/checkout/components/interfaces/localisation/Locale;Ljava/util/Map;)V", "", "isSaveCardChecked", "()Z", "getCustomerJWTTokenOrShowError", "()Ljava/lang/String;", "Lcom/checkout/components/interfaces/model/contact/Country;", "supportedCountries", "()Ljava/util/List;", "checkPrefilledData", "(LNd/c;)Ljava/lang/Object;", "configuration", "()Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "currentScreen", "()Lcom/checkout/components/rememberme/model/RememberMeScreen;", "Lcom/checkout/components/rememberme/model/SubmitAddCardPayload;", "getSubmitAddCardPayload", "()Lcom/checkout/components/rememberme/model/SubmitAddCardPayload;", "isValid", "Lcom/checkout/components/rememberme/model/SelectedPaymentMethod;", "selectedPaymentMethod", "()Lcom/checkout/components/rememberme/model/SelectedPaymentMethod;", "submitSavedCard", "b", "Lcom/checkout/components/rememberme/di/DiComponent;", "getDi$rememberme_standardRelease", "()Lcom/checkout/components/rememberme/di/DiComponent;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckoutRememberMe extends RememberMeViewRenderer {
    public static final int $stable = 0;

    /* renamed from: b, reason: from kotlin metadata */
    private final DiComponent di;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutRememberMe(@NotNull DiComponent di) {
        super(di);
        Intrinsics.echo(di, "di");
        this.di = di;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkPrefilledData(@NotNull Nd.c<? super Unit> cVar) {
        C0960m c0960m;
        int i4;
        String str;
        RememberMeConfiguration.Data data;
        if (cVar instanceof C0960m) {
            c0960m = (C0960m) cVar;
            int i5 = c0960m.f5997c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0960m.f5997c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0960m.f5995a;
                Od.a aVar = Od.a.alpha;
                i4 = c0960m.f5997c;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (!this.di.hasInitialCheckedRepository().getState().booleanValue()) {
                        SuspendUseCase<String, Unit> checkIsAccountAvailablePrefilledUseCase = this.di.checkIsAccountAvailablePrefilledUseCase();
                        RememberMeConfiguration config = this.di.config();
                        if (config != null && (data = config.getData()) != null) {
                            str = data.getEmail();
                        } else {
                            str = null;
                        }
                        c0960m.f5997c = 1;
                        if (checkIsAccountAvailablePrefilledUseCase.execute(str, c0960m) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.INSTANCE;
                }
                this.di.hasInitialCheckedRepository().update((PrimitiveStateRepository<Boolean>) Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }
        c0960m = new C0960m(this, cVar);
        Object obj2 = c0960m.f5995a;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0960m.f5997c;
        if (i4 == 0) {
        }
        this.di.hasInitialCheckedRepository().update((PrimitiveStateRepository<Boolean>) Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Nullable
    public final RememberMeConfiguration configuration() {
        return this.di.config();
    }

    @NotNull
    public final RememberMeScreen currentScreen() {
        return this.di.screenRepository().getState();
    }

    @Nullable
    public final String getCustomerJWTTokenOrShowError() {
        return this.di.saveCardViewStateRepository().validateOrGetJWTToken$rememberme_standardRelease();
    }

    @NotNull
    /* renamed from: getDi$rememberme_standardRelease, reason: from getter */
    public final DiComponent getDi() {
        return this.di;
    }

    @NotNull
    public final SubmitAddCardPayload getSubmitAddCardPayload() {
        boolean z2;
        String str = (String) this.di.jwtTokenRepository().getFlow().getValue();
        if (str == null) {
            str = "";
        }
        WalletScreenViewState walletScreenViewState = (WalletScreenViewState) this.di.walletScreenViewStateRepository().getFlow().getValue();
        if (walletScreenViewState != null) {
            z2 = walletScreenViewState.getDefaultPaymentChecked();
        } else {
            z2 = false;
        }
        return new SubmitAddCardPayload(str, z2);
    }

    public final boolean isSaveCardChecked() {
        return this.di.saveCardViewStateRepository().isSaveCardChecked$rememberme_standardRelease();
    }

    public final boolean isValid() {
        if (!Intrinsics.areEqual(this.di.screenRepository().getState(), RememberMeScreen.Wallet.INSTANCE)) {
            return false;
        }
        int i4 = AbstractC0957l.f5985a[selectedPaymentMethod().ordinal()];
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2 || i4 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final SelectedPaymentMethod selectedPaymentMethod() {
        String str;
        WalletScreenViewState walletScreenViewState = (WalletScreenViewState) this.di.walletScreenViewStateRepository().getFlow().getValue();
        if (walletScreenViewState != null) {
            str = walletScreenViewState.getSelectedMethodId();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, com.checkout.components.rememberme.utils.Constants.ADD_CARD_ITEM_ID)) {
            return SelectedPaymentMethod.ADD_CARD;
        }
        if (str != null && !StringsKt.gray(str)) {
            return SelectedPaymentMethod.SAVED_CARD;
        }
        return SelectedPaymentMethod.NONE;
    }

    @Nullable
    public final Object submitSavedCard(@NotNull Nd.c<? super Unit> cVar) {
        Object execute2 = this.di.submitSavedCardUseCase().execute2((Function0<Unit>) new Vc.i(22), cVar);
        if (execute2 == Od.a.alpha) {
            return execute2;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final List<Country> supportedCountries() {
        return com.checkout.components.rememberme.utils.Constants.INSTANCE.getSUPPORTED_COUNTRIES();
    }

    public /* synthetic */ CheckoutRememberMe(String str, Environment environment, Context context, Xd.l lVar, at atVar, RememberMeConfiguration rememberMeConfiguration, List list, List list2, Locale locale, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, environment, context, lVar, atVar, (i4 & 32) != 0 ? null : rememberMeConfiguration, (i4 & 64) != 0 ? CollectionsKt.emptyList() : list, (i4 & 128) != 0 ? CollectionsKt.emptyList() : list2, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? Locale.En.INSTANCE : locale, (i4 & 512) != 0 ? null : map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckoutRememberMe(@NotNull String publicKey, @NotNull Environment environment, @NotNull Context context, @NotNull Xd.l onPayRememberMe, @NotNull at paymentStateFlow, @Nullable RememberMeConfiguration rememberMeConfiguration, @NotNull List<? extends CardScheme> supportedSchemes, @NotNull List<? extends CardTypeName> supportedTypes, @NotNull Locale locale, @Nullable Map<ComponentTranslationKey, String> map) {
        super(r3);
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(onPayRememberMe, "onPayRememberMe");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(supportedSchemes, "supportedSchemes");
        Intrinsics.echo(supportedTypes, "supportedTypes");
        Intrinsics.echo(locale, "locale");
        AbstractC2763s0.bravo(Logger.class, null);
        AbstractC2763s0.bravo(RememberMeCallback.class, null);
        AbstractC2763s0.bravo(LogDetails.class, null);
        C0978s c0978s = new C0978s(new RTLModule(), new StyleModule(), new NetworkModule(), new RepositoryModule(), new UseCaseModule(), new RememberMeModule(), new RMStateManagerModule(), publicKey, environment, context, rememberMeConfiguration, supportedSchemes, supportedTypes, null, onPayRememberMe, paymentStateFlow, map, null, null, locale, null, null);
        this.di = c0978s;
    }
}
