package b;

import androidx.compose.runtime.C0564b;
import com.checkout.components.interfaces.model.CardSchemeName;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintUseCase;
import com.checkout.components.kmp.rememberme.model.OTPViewState;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.authentication.ComposableSingletons$AuthenticationViewKt;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.clevertap.android.sdk.db.DBManager;
import com.clevertap.android.sdk.network.NetworkRepo;
import com.clevertap.android.sdk.utils.PlayStoreReviewHandler;
import com.clevertap.android.sdk.variables.CTVariables;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Function0 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ c0(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List a6;
        CreateHintUseCase createHintUseCase_delegate$lambda$0;
        Function1 clickHandler_delegate$lambda$1;
        DesignTokens designTokens_delegate$lambda$2;
        ResourceProvider resourceProvider_delegate$lambda$3;
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        Unit unit5;
        Unit unit6;
        Unit lambda$init$1;
        switch (this.alpha) {
            case 0:
                return new g0(0);
            case 1:
                S.x xVar = new S.x(new a5.c(17));
                xVar.echo();
                return xVar;
            case 2:
                return RememberMeModule.charlie();
            case 3:
                return C0564b.zulu(Boolean.FALSE);
            case 4:
                return C0564b.whiskey(0);
            case 5:
                return new zd.i();
            case 6:
                a6 = CardSchemeName.Companion.a();
                return a6;
            case 7:
                return CardTypeName.Companion.alpha();
            case 8:
                return OTPViewState.alpha();
            case 9:
                createHintUseCase_delegate$lambda$0 = CheckoutKMPRememberMe.createHintUseCase_delegate$lambda$0();
                return createHintUseCase_delegate$lambda$0;
            case 10:
                clickHandler_delegate$lambda$1 = CheckoutKMPRememberMe.clickHandler_delegate$lambda$1();
                return clickHandler_delegate$lambda$1;
            case 11:
                designTokens_delegate$lambda$2 = CheckoutKMPRememberMe.designTokens_delegate$lambda$2();
                return designTokens_delegate$lambda$2;
            case 12:
                resourceProvider_delegate$lambda$3 = CheckoutKMPRememberMe.resourceProvider_delegate$lambda$3();
                return resourceProvider_delegate$lambda$3;
            case 13:
                return ComposableSingletons$AuthenticationViewKt.alpha();
            case 14:
                unit = Unit.INSTANCE;
                return unit;
            case 15:
                unit2 = Unit.INSTANCE;
                return unit2;
            case 16:
                unit3 = Unit.INSTANCE;
                return unit3;
            case 17:
                unit4 = Unit.INSTANCE;
                return unit4;
            case 18:
                unit5 = Unit.INSTANCE;
                return unit5;
            case 19:
                unit6 = Unit.INSTANCE;
                return unit6;
            case 20:
                return CountryPickerViewModel.bravo();
            case 21:
                return DBManager.bravo();
            case 22:
                return DBManager.alpha();
            case 23:
                return Integer.valueOf(NetworkRepo.alpha());
            case 24:
                return PlayStoreReviewHandler.charlie();
            case 25:
                lambda$init$1 = CTVariables.lambda$init$1();
                return lambda$init$1;
            case 26:
                float f5 = d.ab.alpha;
                return Boolean.TRUE;
            case 27:
                return RememberMeScreen.alpha();
            case 28:
                return RememberMeScreen.Alternative.bravo();
            default:
                return RememberMeScreen.Authentication.bravo();
        }
    }
}
