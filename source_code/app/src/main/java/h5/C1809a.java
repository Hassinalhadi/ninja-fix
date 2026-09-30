package h5;

import Q0.k;
import com.checkout.address.utils.ContactDataUtilsKt;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.card.operations.usecase.DetermineSchemeChoiceUiVisibilityUseCase;
import com.checkout.components.rememberme.wallet.ComposableSingletons$WalletListViewKt;
import com.checkout.components.ui.mapper.ButtonStyleToInternalViewStyleMapper;
import com.checkout.components.wallet.WalletComponentFactory;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.material.internal.s;
import com.google.android.play.core.integrity.c;
import delivery.samurai.android.ui.agreement.Agreement;
import i.C1874w;
import j.t;
import java.util.LinkedHashMap;
import java.util.Set;
import kd.ae;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC2141p;
import rg.d;
import s6.E0;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1809a implements Function0 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1809a(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set PAYOUT_REQUIRED_COUNTRIES_delegate$lambda$27;
        Unit a6;
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        Unit a8;
        switch (this.alpha) {
            case 0:
                return ComposableSingletons$WalletListViewKt.bravo();
            case 1:
                return E0.bravo("io.ktor.client.plugins.SaveBody");
            case 2:
                return new C1874w(0, 0);
            case 3:
                PAYOUT_REQUIRED_COUNTRIES_delegate$lambda$27 = ContactDataUtilsKt.PAYOUT_REQUIRED_COUNTRIES_delegate$lambda$27();
                return PAYOUT_REQUIRED_COUNTRIES_delegate$lambda$27;
            case 4:
                return ButtonStyleToInternalViewStyleMapper.alpha();
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return new t(0, 0);
            case 9:
                a6 = CardComponent.a();
                return a6;
            case 10:
                unit = Unit.INSTANCE;
                return unit;
            case 11:
                unit2 = Unit.INSTANCE;
                return unit2;
            case 12:
                unit3 = Unit.INSTANCE;
                return unit3;
            case 13:
                s sVar = new s(16);
                try {
                    Class<?> cls = Class.forName("android.util.Log");
                    if (!(d.bravo().bravo() instanceof tg.d)) {
                        return new ae(sVar);
                    }
                    Intrinsics.checkNotNull(cls);
                    return new ae(new c(cls, sVar));
                } catch (ClassNotFoundException unused) {
                    return new ae(sVar);
                }
            case 14:
                unit4 = Unit.INSTANCE;
                return unit4;
            case 15:
                int i4 = Agreement.f12120R;
                return Unit.INSTANCE;
            case 16:
                int i5 = Agreement.f12120R;
                return Unit.INSTANCE;
            case 17:
                a8 = PaymentOperationManager.a();
                return a8;
            case 18:
                return WalletComponentFactory.alpha();
            case 19:
                androidx.compose.runtime.E0 e02 = AbstractC2141p.alpha;
                return null;
            case 20:
                return new k(0L);
            case 21:
                return new k(0L);
            case 22:
                return Unit.INSTANCE;
            case 23:
                return new LinkedHashMap();
            case 24:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 25:
                return C1477x.charlie();
            case 26:
                return DetermineSchemeChoiceUiVisibilityUseCase.alpha();
            case 27:
                return Unit.INSTANCE;
            case 28:
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}
