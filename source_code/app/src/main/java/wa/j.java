package wa;

import B9.AbstractC0063s;
import Dc.t;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.az;
import ao.ad;
import com.app.network.network.models.Bank;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.PlatformListResponse;
import com.google.android.material.datepicker.u;
import com.google.android.material.datepicker.v;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.HashMap;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import t6.R2;
import t6.S2;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SignUpActivity purple;

    public /* synthetic */ j(SignUpActivity signUpActivity, int i4) {
        this.alpha = i4;
        this.purple = signUpActivity;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.android.material.datepicker.DateSelector, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer id2;
        Integer id3;
        Integer id4;
        String[] altSpellings;
        String str;
        Integer id5;
        Integer id6;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer id7;
        Integer num2;
        Integer id8;
        int i4 = 2;
        int i5 = -1;
        SignUpActivity signUpActivity = this.purple;
        switch (this.alpha) {
            case 0:
                int i10 = SignUpActivity.f12184d0;
                signUpActivity.onBackPressed();
                return;
            case 1:
                Bank bank = signUpActivity.f12191N;
                if (bank != null && (id2 = bank.getId()) != null) {
                    i5 = id2.intValue();
                }
                Integer valueOf = Integer.valueOf(i5);
                i iVar = new i(signUpActivity, 4);
                Va.a aVar = new Va.a();
                aVar.f2169u = valueOf;
                aVar.f2170v = iVar;
                aVar.f14101q = true;
                aVar.romeo(signUpActivity.getSupportFragmentManager(), null);
                return;
            case 2:
                PlatformListResponse platformListResponse = signUpActivity.f12193P;
                if (platformListResponse != null && (id3 = platformListResponse.getId()) != null) {
                    i5 = id3.intValue();
                }
                i iVar2 = new i(signUpActivity, i4);
                Ya.d dVar = new Ya.d();
                dVar.f2273u = i5;
                dVar.f2274v = iVar2;
                dVar.f14101q = true;
                dVar.romeo(signUpActivity.getSupportFragmentManager(), null);
                return;
            case 3:
                int i11 = SignUpActivity.f12184d0;
                az signUpValidation = signUpActivity.indigo().getSignUpValidation();
                Fc.b bVar = Fc.b.purple;
                signUpValidation.postValue(bVar);
                Fc.b ivory = signUpActivity.ivory();
                signUpActivity.indigo().getSignUpValidation().postValue(ivory);
                int ordinal = ivory.ordinal();
                if (1 <= ordinal && ordinal <= 13 && !signUpActivity.green().f626I.isExpanded()) {
                    signUpActivity.green().f660l.performClick();
                } else {
                    int ordinal2 = ivory.ordinal();
                    if (12 <= ordinal2 && ordinal2 <= 16 && !signUpActivity.green().f624G.isExpanded()) {
                        signUpActivity.green().f648f.performClick();
                    } else {
                        int ordinal3 = ivory.ordinal();
                        if (17 <= ordinal3 && ordinal3 <= 20 && !signUpActivity.green().f625H.isExpanded()) {
                            signUpActivity.green().f658k.performClick();
                        }
                    }
                }
                if (ivory == bVar) {
                    AuthViewModel indigo = signUpActivity.indigo();
                    TextInputLayout ilFName = signUpActivity.green().f635S;
                    Intrinsics.delta(ilFName, "ilFName");
                    String bravo = S2.bravo(ilFName);
                    TextInputLayout ilLName = signUpActivity.green().f640X;
                    Intrinsics.delta(ilLName, "ilLName");
                    String amber = ad.amber(bravo, " ", S2.bravo(ilLName));
                    TextInputLayout ilIDNumber = signUpActivity.green().f637U;
                    Intrinsics.delta(ilIDNumber, "ilIDNumber");
                    String bravo2 = S2.bravo(ilIDNumber);
                    TextInputLayout ilDob = signUpActivity.green().f634R;
                    Intrinsics.delta(ilDob, "ilDob");
                    String bravo3 = S2.bravo(ilDob);
                    String str12 = signUpActivity.f12192O;
                    if (str12 == null) {
                        signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.yellow);
                        return;
                    }
                    PlatformListResponse platformListResponse2 = signUpActivity.f12193P;
                    if (platformListResponse2 != null && (id4 = platformListResponse2.getId()) != null) {
                        int intValue = id4.intValue();
                        TextInputLayout ilVehiclePlate = signUpActivity.green().f646d0;
                        Intrinsics.delta(ilVehiclePlate, "ilVehiclePlate");
                        String bravo4 = S2.bravo(ilVehiclePlate);
                        TextInputLayout ilVehicleSequenceNumber = signUpActivity.green().f647e0;
                        Intrinsics.delta(ilVehicleSequenceNumber, "ilVehicleSequenceNumber");
                        String bravo5 = S2.bravo(ilVehicleSequenceNumber);
                        Country country = signUpActivity.Q;
                        if (country != null && (altSpellings = country.getAltSpellings()) != null && (str = (String) ArraysKt.fuchsia(altSpellings)) != null) {
                            Country country2 = signUpActivity.f12190M;
                            if (country2 != null && (id5 = country2.getId()) != null) {
                                int intValue2 = id5.intValue();
                                City city = signUpActivity.f12194R;
                                if (city != null && (id6 = city.getId()) != null) {
                                    int intValue3 = id6.intValue();
                                    TextInputLayout ilMobileNo = signUpActivity.green().f641Y;
                                    Intrinsics.delta(ilMobileNo, "ilMobileNo");
                                    String bravo6 = S2.bravo(ilMobileNo);
                                    CharSequence prefixText = signUpActivity.green().f636T.getPrefixText();
                                    if (prefixText != null) {
                                        str2 = prefixText.toString();
                                    } else {
                                        str2 = null;
                                    }
                                    TextInputLayout ilFintechId = signUpActivity.green().f636T;
                                    Intrinsics.delta(ilFintechId, "ilFintechId");
                                    String crimson = P0.crimson(str2, S2.bravo(ilFintechId));
                                    TextInputLayout ilIbanName = signUpActivity.green().f638V;
                                    Intrinsics.delta(ilIbanName, "ilIbanName");
                                    String bravo7 = S2.bravo(ilIbanName);
                                    TextInputLayout ilIbanNo = signUpActivity.green().f639W;
                                    Intrinsics.delta(ilIbanNo, "ilIbanNo");
                                    String bravo8 = S2.bravo(ilIbanNo);
                                    Bank bank2 = signUpActivity.f12191N;
                                    if (bank2 != null) {
                                        num = bank2.getId();
                                    } else {
                                        num = null;
                                    }
                                    TextInputLayout ilReferralCode = signUpActivity.green().f645c0;
                                    Intrinsics.delta(ilReferralCode, "ilReferralCode");
                                    String bravo9 = S2.bravo(ilReferralCode);
                                    az azVar = signUpActivity.f12197U;
                                    HashMap hashMap = (HashMap) azVar.getValue();
                                    if (hashMap != null && (str10 = (String) hashMap.get(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY))) != null) {
                                        str3 = str10;
                                    } else if (signUpActivity.f12195S != null) {
                                        str3 = null;
                                    } else {
                                        signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.f1303i);
                                        return;
                                    }
                                    HashMap hashMap2 = (HashMap) azVar.getValue();
                                    if (hashMap2 != null && (str9 = (String) hashMap2.get(1002)) != null) {
                                        str4 = str9;
                                    } else if (signUpActivity.f12195S != null) {
                                        str4 = null;
                                    } else {
                                        signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.f1304j);
                                        return;
                                    }
                                    HashMap hashMap3 = (HashMap) azVar.getValue();
                                    if (hashMap3 != null && (str8 = (String) hashMap3.get(1003)) != null) {
                                        str5 = str8;
                                    } else if (signUpActivity.f12195S != null) {
                                        str5 = null;
                                    } else {
                                        signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.f1305k);
                                        return;
                                    }
                                    HashMap hashMap4 = (HashMap) azVar.getValue();
                                    if (hashMap4 != null && (str7 = (String) hashMap4.get(1004)) != null) {
                                        str6 = str7;
                                    } else if (signUpActivity.f12195S != null) {
                                        str6 = null;
                                    } else {
                                        signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.f1306l);
                                        return;
                                    }
                                    AuthViewModel.signUp$default(indigo, amber, bravo2, bravo3, str12, intValue, bravo4, bravo5, str, intValue2, intValue3, bravo6, crimson, bravo7, bravo8, num, bravo9, str3, str4, str5, str6, signUpActivity.f12195S, null, null, 6291456, null).observe(signUpActivity, new t(20, new i(signUpActivity, 6)));
                                    return;
                                }
                                signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.f1300f);
                                return;
                            }
                            signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.e);
                            return;
                        }
                        signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.f1299d);
                        return;
                    }
                    signUpActivity.indigo().getSignUpValidation().postValue(Fc.b.f1296a);
                    return;
                }
                return;
            case 4:
                int i12 = SignUpActivity.f12184d0;
                signUpActivity.gray(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                return;
            case 5:
                int i13 = SignUpActivity.f12184d0;
                signUpActivity.gray(1002);
                return;
            case 6:
                int i14 = SignUpActivity.f12184d0;
                signUpActivity.gray(1003);
                return;
            case 7:
                int i15 = SignUpActivity.f12184d0;
                C3462a.alpha("SIGNUP", 12, "Take photo tapped for PROFILE_PICTURE_SNAP", null);
                signUpActivity.gray(1004);
                return;
            case 8:
                int i16 = SignUpActivity.f12184d0;
                v alpha = new u(new Object()).alpha();
                alpha.f8005j.add(new Ba.c(2, new i(signUpActivity, 7)));
                alpha.romeo(signUpActivity.getSupportFragmentManager(), "");
                return;
            case 9:
                Country country3 = signUpActivity.Q;
                if (country3 != null) {
                    str11 = country3.getValidDemonym();
                } else {
                    str11 = null;
                }
                new Xa.g(null, str11, Xa.c.alpha, new i(signUpActivity, 5)).romeo(signUpActivity.getSupportFragmentManager(), null);
                return;
            case 10:
                Country country4 = signUpActivity.f12190M;
                if (country4 != null && (id7 = country4.getId()) != null) {
                    i5 = id7.intValue();
                }
                new Xa.g(Integer.valueOf(i5), null, Xa.c.purple, new i(signUpActivity, 8)).romeo(signUpActivity.getSupportFragmentManager(), null);
                return;
            case 11:
                if (signUpActivity.f12190M == null) {
                    Fc.b bVar2 = Fc.b.purple;
                    L9.d.peach(R.string.VALIDATION_COUNTRY, signUpActivity);
                    return;
                }
                signUpActivity.green().Q.setError("");
                Country country5 = signUpActivity.f12190M;
                if (country5 != null && (id8 = country5.getId()) != null) {
                    i5 = id8.intValue();
                }
                City city2 = signUpActivity.f12194R;
                if (city2 != null) {
                    num2 = city2.getId();
                } else {
                    num2 = null;
                }
                i iVar3 = new i(signUpActivity, 3);
                Wa.b bVar3 = new Wa.b();
                bVar3.f2202u = i5;
                bVar3.f2203v = num2;
                bVar3.f2204w = iVar3;
                bVar3.f14101q = true;
                bVar3.romeo(signUpActivity.getSupportFragmentManager(), null);
                return;
            case 12:
                HashMap hashMap5 = (HashMap) signUpActivity.f12197U.getValue();
                if (hashMap5 != null) {
                    hashMap5.remove(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY));
                    signUpActivity.f12197U.postValue(hashMap5);
                    return;
                }
                return;
            case 13:
                HashMap hashMap6 = (HashMap) signUpActivity.f12197U.getValue();
                if (hashMap6 != null) {
                    hashMap6.remove(1002);
                    signUpActivity.f12197U.postValue(hashMap6);
                    return;
                }
                return;
            case 14:
                HashMap hashMap7 = (HashMap) signUpActivity.f12197U.getValue();
                if (hashMap7 != null) {
                    hashMap7.remove(1003);
                    signUpActivity.f12197U.postValue(hashMap7);
                    return;
                }
                return;
            case 15:
                HashMap hashMap8 = (HashMap) signUpActivity.f12197U.getValue();
                if (hashMap8 != null) {
                    hashMap8.remove(1004);
                    signUpActivity.f12197U.postValue(hashMap8);
                    return;
                }
                return;
            case 16:
                int i17 = SignUpActivity.f12184d0;
                AbstractC0063s green = signUpActivity.green();
                boolean isExpanded = signUpActivity.green().f626I.isExpanded();
                boolean z2 = !isExpanded;
                ImageButton btnPersonalInfoArrow = signUpActivity.green().f660l;
                Intrinsics.delta(btnPersonalInfoArrow, "btnPersonalInfoArrow");
                R2.bravo(btnPersonalInfoArrow, z2);
                if (isExpanded) {
                    Intrinsics.checkNotNull(view);
                    d3.k.sierra(signUpActivity, view);
                }
                green.f626I.setExpanded(z2);
                return;
            case 17:
                int i18 = SignUpActivity.f12184d0;
                AbstractC0063s green2 = signUpActivity.green();
                boolean isExpanded2 = signUpActivity.green().f624G.isExpanded();
                boolean z10 = !isExpanded2;
                ImageButton btnBankDetailsArrow = signUpActivity.green().f648f;
                Intrinsics.delta(btnBankDetailsArrow, "btnBankDetailsArrow");
                R2.bravo(btnBankDetailsArrow, z10);
                if (isExpanded2) {
                    Intrinsics.checkNotNull(view);
                    d3.k.sierra(signUpActivity, view);
                }
                green2.f624G.setExpanded(z10);
                return;
            default:
                int i19 = SignUpActivity.f12184d0;
                AbstractC0063s green3 = signUpActivity.green();
                boolean isExpanded3 = signUpActivity.green().f625H.isExpanded();
                boolean z11 = !isExpanded3;
                ImageButton btnLicenseInfoArrow = signUpActivity.green().f658k;
                Intrinsics.delta(btnLicenseInfoArrow, "btnLicenseInfoArrow");
                R2.bravo(btnLicenseInfoArrow, z11);
                if (isExpanded3) {
                    Intrinsics.checkNotNull(view);
                    d3.k.sierra(signUpActivity, view);
                }
                green3.f625H.setExpanded(z11);
                return;
        }
    }
}
