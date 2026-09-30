package delivery.samurai.android.ui.auth.signup.step4earnmoney;

import A3.a;
import B2.q;
import B9.A;
import B9.ab;
import Ba.h;
import Ea.b;
import Ea.c;
import Ea.e;
import Ea.g;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.DataBinderMapperImpl;
import com.app.network.network.models.Bank;
import com.app.network.network.models.SignUpRequest;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.step4earnmoney.EarnYourMoneyFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import s6.T7;
import t6.S2;
import z1.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signup/step4earnmoney/EarnYourMoneyFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class EarnYourMoneyFragment extends e {

    /* renamed from: f, reason: collision with root package name */
    public Bank f12228f;

    /* renamed from: g, reason: collision with root package name */
    public g f12229g;

    /* renamed from: h, reason: collision with root package name */
    public A f12230h;
    public final ab e = new ab(u.alpha.bravo(AuthViewModel.class), new c(this, 0), new c(this, 2), new c(this, 1));

    /* renamed from: i, reason: collision with root package name */
    public final h f12231i = new h(3, this);

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = A.f66k;
        DataBinderMapperImpl dataBinderMapperImpl = d.alpha;
        A a6 = (A) z1.g.kilo(inflater, R.layout.fragment_earn_your_money, viewGroup, false, null);
        Intrinsics.delta(a6, "inflate(...)");
        this.f12230h = a6;
        return romeo().red;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ab abVar = this.e;
        SignUpRequest signUpRequest = (SignUpRequest) ((AuthViewModel) abVar.getValue()).getSignUpRequest().getValue();
        EditText editText = romeo().f69h.getEditText();
        String str = "";
        if (editText != null) {
            String ibanNumber = signUpRequest.getIbanNumber();
            if (ibanNumber == null) {
                ibanNumber = "";
            }
            editText.setText(ibanNumber);
        }
        EditText editText2 = romeo().f70i.getEditText();
        if (editText2 != null) {
            String urPayAccountIban = signUpRequest.getUrPayAccountIban();
            if (urPayAccountIban == null) {
                urPayAccountIban = "";
            }
            editText2.setText(urPayAccountIban);
        }
        EditText editText3 = romeo().f71j.getEditText();
        if (editText3 != null) {
            String urPayIdNumber = signUpRequest.getUrPayIdNumber();
            if (urPayIdNumber != null) {
                str = urPayIdNumber;
            }
            editText3.setText(str);
        }
        Integer bankId = signUpRequest.getBankId();
        if (bankId != null) {
            Iterator it = ((AuthViewModel) abVar.getValue()).getCachedBanks().getItems().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Bank) obj).getId(), bankId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Bank bank = (Bank) obj;
            if (bank != null) {
                this.f12228f = bank;
                romeo().f68g.setText(bank.getLocalizedName());
                ((AuthViewModel) abVar.getValue()).updateRequest(new b(this, 0));
            }
        }
        oscar();
        quebec();
    }

    @Override // d3.n
    public final void oscar() {
        EditText editText = romeo().f69h.getEditText();
        h hVar = this.f12231i;
        if (editText != null) {
            editText.addTextChangedListener(hVar);
        }
        EditText editText2 = romeo().f70i.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(hVar);
        }
        EditText editText3 = romeo().f71j.getEditText();
        if (editText3 != null) {
            editText3.addTextChangedListener(hVar);
        }
        A romeo = romeo();
        final int i4 = 0;
        romeo.f68g.setOnClickListener(new View.OnClickListener(this) { // from class: Ea.a
            public final /* synthetic */ EarnYourMoneyFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5;
                int i10;
                String str;
                String str2;
                switch (i4) {
                    case 0:
                        EarnYourMoneyFragment earnYourMoneyFragment = this.purple;
                        if (earnYourMoneyFragment.f12229g == null) {
                            b bVar = new b(earnYourMoneyFragment, 1);
                            q qVar = new q(7, earnYourMoneyFragment);
                            g gVar = new g();
                            gVar.f979u = bVar;
                            gVar.f980v = qVar;
                            gVar.f14101q = true;
                            earnYourMoneyFragment.f12229g = gVar;
                            gVar.romeo(earnYourMoneyFragment.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                    default:
                        EarnYourMoneyFragment earnYourMoneyFragment2 = this.purple;
                        ((AuthViewModel) earnYourMoneyFragment2.e.getValue()).updateRequest(new b(earnYourMoneyFragment2, 0));
                        ab abVar = earnYourMoneyFragment2.e;
                        SignUpRequest signUpRequest = (SignUpRequest) ((AuthViewModel) abVar.getValue()).getSignUpRequest().getValue();
                        AuthViewModel authViewModel = (AuthViewModel) abVar.getValue();
                        String name = signUpRequest.getName();
                        if (name == null) {
                            name = "";
                        }
                        String idNumber = signUpRequest.getIdNumber();
                        if (idNumber == null) {
                            idNumber = "";
                        }
                        String dob = signUpRequest.getDob();
                        if (dob == null) {
                            dob = "";
                        }
                        String preference = signUpRequest.getPreference();
                        if (preference == null) {
                            preference = "";
                        }
                        Integer preferredPlatformId = signUpRequest.getPreferredPlatformId();
                        int i11 = -1;
                        if (preferredPlatformId != null) {
                            i5 = preferredPlatformId.intValue();
                        } else {
                            i5 = -1;
                        }
                        String vehiclePlateNumber = signUpRequest.getVehiclePlateNumber();
                        if (vehiclePlateNumber == null) {
                            vehiclePlateNumber = "";
                        }
                        String vehicleSequenceNumber = signUpRequest.getVehicleSequenceNumber();
                        if (vehicleSequenceNumber == null) {
                            vehicleSequenceNumber = "";
                        }
                        String nationality = signUpRequest.getNationality();
                        if (nationality == null) {
                            nationality = "";
                        }
                        Integer countryId = signUpRequest.getCountryId();
                        if (countryId != null) {
                            i10 = countryId.intValue();
                        } else {
                            i10 = -1;
                        }
                        Integer cityId = signUpRequest.getCityId();
                        if (cityId != null) {
                            i11 = cityId.intValue();
                        }
                        String mobileNumber = signUpRequest.getMobileNumber();
                        if (mobileNumber == null) {
                            mobileNumber = "";
                        }
                        String ibanName = signUpRequest.getIbanName();
                        if (ibanName == null) {
                            str = "";
                        } else {
                            str = ibanName;
                        }
                        String ibanNumber = signUpRequest.getIbanNumber();
                        if (ibanNumber == null) {
                            str2 = "";
                        } else {
                            str2 = ibanNumber;
                        }
                        String str3 = name;
                        AuthViewModel.signUp$default(authViewModel, str3, idNumber, dob, preference, i5, vehiclePlateNumber, vehicleSequenceNumber, nationality, i10, i11, mobileNumber, null, str, str2, signUpRequest.getBankId(), signUpRequest.getReferralCode(), signUpRequest.getIdCardSnap(), signUpRequest.getDrivingLicenseSnap(), signUpRequest.getVehicleRegistrationSnap(), signUpRequest.getProfileSnap(), null, signUpRequest.getUrPayAccountIban(), signUpRequest.getUrPayIdNumber(), 1048576, null).observe(earnYourMoneyFragment2.getViewLifecycleOwner(), new Aa.f(3, new b(earnYourMoneyFragment2, 2)));
                        return;
                }
            }
        });
        A romeo2 = romeo();
        final int i5 = 1;
        romeo2.f67f.setOnClickListener(new View.OnClickListener(this) { // from class: Ea.a
            public final /* synthetic */ EarnYourMoneyFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52;
                int i10;
                String str;
                String str2;
                switch (i5) {
                    case 0:
                        EarnYourMoneyFragment earnYourMoneyFragment = this.purple;
                        if (earnYourMoneyFragment.f12229g == null) {
                            b bVar = new b(earnYourMoneyFragment, 1);
                            q qVar = new q(7, earnYourMoneyFragment);
                            g gVar = new g();
                            gVar.f979u = bVar;
                            gVar.f980v = qVar;
                            gVar.f14101q = true;
                            earnYourMoneyFragment.f12229g = gVar;
                            gVar.romeo(earnYourMoneyFragment.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                    default:
                        EarnYourMoneyFragment earnYourMoneyFragment2 = this.purple;
                        ((AuthViewModel) earnYourMoneyFragment2.e.getValue()).updateRequest(new b(earnYourMoneyFragment2, 0));
                        ab abVar = earnYourMoneyFragment2.e;
                        SignUpRequest signUpRequest = (SignUpRequest) ((AuthViewModel) abVar.getValue()).getSignUpRequest().getValue();
                        AuthViewModel authViewModel = (AuthViewModel) abVar.getValue();
                        String name = signUpRequest.getName();
                        if (name == null) {
                            name = "";
                        }
                        String idNumber = signUpRequest.getIdNumber();
                        if (idNumber == null) {
                            idNumber = "";
                        }
                        String dob = signUpRequest.getDob();
                        if (dob == null) {
                            dob = "";
                        }
                        String preference = signUpRequest.getPreference();
                        if (preference == null) {
                            preference = "";
                        }
                        Integer preferredPlatformId = signUpRequest.getPreferredPlatformId();
                        int i11 = -1;
                        if (preferredPlatformId != null) {
                            i52 = preferredPlatformId.intValue();
                        } else {
                            i52 = -1;
                        }
                        String vehiclePlateNumber = signUpRequest.getVehiclePlateNumber();
                        if (vehiclePlateNumber == null) {
                            vehiclePlateNumber = "";
                        }
                        String vehicleSequenceNumber = signUpRequest.getVehicleSequenceNumber();
                        if (vehicleSequenceNumber == null) {
                            vehicleSequenceNumber = "";
                        }
                        String nationality = signUpRequest.getNationality();
                        if (nationality == null) {
                            nationality = "";
                        }
                        Integer countryId = signUpRequest.getCountryId();
                        if (countryId != null) {
                            i10 = countryId.intValue();
                        } else {
                            i10 = -1;
                        }
                        Integer cityId = signUpRequest.getCityId();
                        if (cityId != null) {
                            i11 = cityId.intValue();
                        }
                        String mobileNumber = signUpRequest.getMobileNumber();
                        if (mobileNumber == null) {
                            mobileNumber = "";
                        }
                        String ibanName = signUpRequest.getIbanName();
                        if (ibanName == null) {
                            str = "";
                        } else {
                            str = ibanName;
                        }
                        String ibanNumber = signUpRequest.getIbanNumber();
                        if (ibanNumber == null) {
                            str2 = "";
                        } else {
                            str2 = ibanNumber;
                        }
                        String str3 = name;
                        AuthViewModel.signUp$default(authViewModel, str3, idNumber, dob, preference, i52, vehiclePlateNumber, vehicleSequenceNumber, nationality, i10, i11, mobileNumber, null, str, str2, signUpRequest.getBankId(), signUpRequest.getReferralCode(), signUpRequest.getIdCardSnap(), signUpRequest.getDrivingLicenseSnap(), signUpRequest.getVehicleRegistrationSnap(), signUpRequest.getProfileSnap(), null, signUpRequest.getUrPayAccountIban(), signUpRequest.getUrPayIdNumber(), 1048576, null).observe(earnYourMoneyFragment2.getViewLifecycleOwner(), new Aa.f(3, new b(earnYourMoneyFragment2, 2)));
                        return;
                }
            }
        });
    }

    public final void quebec() {
        boolean alpha;
        boolean z2;
        TextInputLayout ilUrPay = romeo().f70i;
        Intrinsics.delta(ilUrPay, "ilUrPay");
        String obj = StringsKt.b(S2.bravo(ilUrPay)).toString();
        boolean z10 = false;
        if (StringsKt.gray(obj)) {
            romeo().f70i.setError(null);
            romeo().f70i.setErrorEnabled(false);
            alpha = false;
        } else {
            a alpha2 = B3.b.alpha(obj);
            String str = (String) alpha2.bravo;
            if (str != null) {
                obj = str;
            }
            String upperCase = StringsKt.yellow(2, obj).toUpperCase(Locale.ROOT);
            Intrinsics.delta(upperCase, "toUpperCase(...)");
            TextInputLayout ilUrPay2 = romeo().f70i;
            Intrinsics.delta(ilUrPay2, "ilUrPay");
            alpha = T7.alpha(ilUrPay2, alpha2, upperCase);
        }
        TextInputLayout ilUrPayId = romeo().f71j;
        Intrinsics.delta(ilUrPayId, "ilUrPayId");
        String obj2 = StringsKt.b(S2.bravo(ilUrPayId)).toString();
        if (StringsKt.gray(obj2)) {
            romeo().f71j.setError(null);
            romeo().f71j.setErrorEnabled(false);
            z2 = false;
        } else {
            int length = obj2.length();
            if (9 <= length && length < 13) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                romeo().f71j.setError(getString(R.string.VALIDATION_URPAY_ID));
                romeo().f71j.setErrorEnabled(true);
            } else {
                romeo().f71j.setError(null);
                romeo().f71j.setErrorEnabled(false);
            }
        }
        A romeo = romeo();
        if (alpha && z2) {
            z10 = true;
        }
        romeo.f67f.setEnabled(z10);
    }

    public final A romeo() {
        A a6 = this.f12230h;
        if (a6 != null) {
            return a6;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
