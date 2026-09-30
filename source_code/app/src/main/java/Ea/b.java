package Ea;

import com.app.network.network.models.Bank;
import com.app.network.network.models.SignUpRequest;
import com.google.android.material.textfield.TextInputLayout;
import d3.k;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.step4earnmoney.EarnYourMoneyFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;
import t6.S2;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ EarnYourMoneyFragment purple;

    public /* synthetic */ b(EarnYourMoneyFragment earnYourMoneyFragment, int i4) {
        this.alpha = i4;
        this.purple = earnYourMoneyFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        String str;
        switch (this.alpha) {
            case 0:
                SignUpRequest it = (SignUpRequest) obj;
                Intrinsics.echo(it, "it");
                EarnYourMoneyFragment earnYourMoneyFragment = this.purple;
                TextInputLayout ilBankNumber = earnYourMoneyFragment.romeo().f69h;
                Intrinsics.delta(ilBankNumber, "ilBankNumber");
                it.setIbanNumber(S2.bravo(ilBankNumber));
                Bank bank = earnYourMoneyFragment.f12228f;
                String str2 = null;
                if (bank != null) {
                    num = bank.getId();
                } else {
                    num = null;
                }
                it.setBankId(num);
                TextInputLayout ilUrPay = earnYourMoneyFragment.romeo().f70i;
                Intrinsics.delta(ilUrPay, "ilUrPay");
                A3.a alpha = B3.b.alpha(StringsKt.b(S2.bravo(ilUrPay)).toString());
                if (alpha.alpha) {
                    str = (String) alpha.bravo;
                } else {
                    str = null;
                }
                it.setUrPayAccountIban(str);
                TextInputLayout ilUrPayId = earnYourMoneyFragment.romeo().f71j;
                Intrinsics.delta(ilUrPayId, "ilUrPayId");
                String obj2 = StringsKt.b(S2.bravo(ilUrPayId)).toString();
                if (!StringsKt.gray(obj2)) {
                    str2 = obj2;
                }
                it.setUrPayIdNumber(str2);
                return Unit.INSTANCE;
            case 1:
                Bank it2 = (Bank) obj;
                Intrinsics.echo(it2, "it");
                EarnYourMoneyFragment earnYourMoneyFragment2 = this.purple;
                earnYourMoneyFragment2.f12228f = it2;
                earnYourMoneyFragment2.romeo().f68g.setText(it2.getLocalizedName());
                ((AuthViewModel) earnYourMoneyFragment2.e.getValue()).updateRequest(new b(earnYourMoneyFragment2, 0));
                return Unit.INSTANCE;
            default:
                C2492a c2492a = (C2492a) obj;
                int i4 = c2492a.alpha;
                EarnYourMoneyFragment earnYourMoneyFragment3 = this.purple;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            earnYourMoneyFragment3.kilo().bronze();
                        }
                    } else {
                        earnYourMoneyFragment3.kilo().tango();
                        J2.f.alpha(earnYourMoneyFragment3).charlie(R.id.nav_application_submitted, null, null);
                    }
                } else {
                    earnYourMoneyFragment3.kilo().tango();
                    k kilo = earnYourMoneyFragment3.kilo();
                    String str3 = c2492a.bravo;
                    if (str3 == null) {
                        return Unit.INSTANCE;
                    }
                    L9.d.pink(kilo, str3);
                }
                return Unit.INSTANCE;
        }
    }
}
