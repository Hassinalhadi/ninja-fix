package Lb;

import com.app.network.network.models.SignUpRequest;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import delivery.samurai.android.ui.auth.signup.RegisterActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ae implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;

    public /* synthetic */ ae(String str, int i4) {
        this.alpha = i4;
        this.purple = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WalletScreenViewState a6;
        String str = this.purple;
        switch (this.alpha) {
            case 0:
                A0.ad semantics = (A0.ad) obj;
                Intrinsics.echo(semantics, "$this$semantics");
                A0.aa.bravo(semantics, str);
                return Unit.INSTANCE;
            case 1:
                A0.ad semantics2 = (A0.ad) obj;
                Intrinsics.echo(semantics2, "$this$semantics");
                A0.aa.bravo(semantics2, str);
                return Unit.INSTANCE;
            case 2:
                A0.ad semantics3 = (A0.ad) obj;
                Intrinsics.echo(semantics3, "$this$semantics");
                A0.aa.bravo(semantics3, str);
                return Unit.INSTANCE;
            case 3:
                A0.ad semantics4 = (A0.ad) obj;
                Intrinsics.echo(semantics4, "$this$semantics");
                A0.aa.bravo(semantics4, str);
                return Unit.INSTANCE;
            case 4:
                A0.ad semantics5 = (A0.ad) obj;
                Intrinsics.echo(semantics5, "$this$semantics");
                A0.aa.bravo(semantics5, str);
                return Unit.INSTANCE;
            case 5:
                A0.ad adVar = (A0.ad) obj;
                A0.aa.bravo(adVar, str);
                A0.aa.echo(adVar, 5);
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(Intrinsics.areEqual((String) obj, str));
            case 7:
                A0.ad adVar2 = (A0.ad) obj;
                A0.aa.bravo(adVar2, str);
                A0.aa.echo(adVar2, 5);
                return Unit.INSTANCE;
            case 8:
                Pair it = (Pair) obj;
                Intrinsics.echo(it, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it.getFirst(), str));
            case 9:
                A0.ad semantics6 = (A0.ad) obj;
                Intrinsics.echo(semantics6, "$this$semantics");
                A0.aa.bravo(semantics6, str);
                return Unit.INSTANCE;
            case 10:
                a6 = WalletScreenViewModel.a(str, (WalletScreenViewState) obj);
                return a6;
            case 11:
                SignUpRequest it2 = (SignUpRequest) obj;
                int i4 = RegisterActivity.f12181J;
                Intrinsics.echo(it2, "it");
                it2.setReferralCode(str);
                return Unit.INSTANCE;
            default:
                A0.ad adVar3 = (A0.ad) obj;
                A0.aa.bravo(adVar3, str);
                A0.aa.echo(adVar3, 5);
                return Unit.INSTANCE;
        }
    }
}
