package wa;

import B9.AbstractC0063s;
import Dc.t;
import Ua.w;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.P0;
import com.app.network.network.models.Bank;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.Image;
import com.app.network.network.models.PlatformListResponse;
import com.app.network.network.models.SignUpResponse;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import java.util.Date;
import java.util.HashMap;
import k4.C2007a;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal.ws.WebSocketProtocol;
import r3.C2492a;
import s6.AbstractC2634d5;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SignUpActivity purple;

    public /* synthetic */ i(SignUpActivity signUpActivity, int i4) {
        this.alpha = i4;
        this.purple = signUpActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num;
        int i15 = 8;
        String str13 = null;
        String str14 = "";
        SignUpActivity signUpActivity = this.purple;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i16 = SignUpActivity.f12184d0;
                int i17 = c2492a.alpha;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            signUpActivity.bronze();
                        }
                    } else {
                        signUpActivity.tango();
                        SignUpResponse signUpResponse = (SignUpResponse) c2492a.charlie;
                        if (signUpResponse != null) {
                            AbstractC0063s green = signUpActivity.green();
                            String name = signUpResponse.getName();
                            if (name == null || (str = (String) CollectionsKt.green(StringsKt.maroon(name, new String[]{" "}, 6))) == null) {
                                str = "";
                            }
                            green.f676t.setText(str);
                            AbstractC0063s green2 = signUpActivity.green();
                            String name2 = signUpResponse.getName();
                            if (name2 != null && (str12 = (String) StringsKt.maroon(name2, new String[]{" "}, 6).get(1)) != null) {
                                str14 = str12;
                            }
                            green2.f682x.setText(str14);
                            AbstractC0063s green3 = signUpActivity.green();
                            Date dob = signUpResponse.getDob();
                            if (dob != null) {
                                str2 = AbstractC2634d5.charlie(dob);
                            } else {
                                str2 = null;
                            }
                            green3.f674s.setText(str2);
                            signUpActivity.green().f680v.setText(signUpResponse.getIdNumber());
                            signUpActivity.f12190M = signUpResponse.getCountry();
                            signUpActivity.f12192O = signUpResponse.getPreferredVertical();
                            signUpActivity.f12193P = signUpResponse.getPreferredPlatform();
                            signUpActivity.green().B.setText(signUpActivity.f12192O);
                            signUpActivity.green().f621D.setText(signUpResponse.getVehiclePlateNumber());
                            signUpActivity.green().f622E.setText(signUpResponse.getVehicleSequenceNumber());
                            AbstractC0063s green4 = signUpActivity.green();
                            PlatformListResponse platformListResponse = signUpActivity.f12193P;
                            if (platformListResponse != null) {
                                str3 = platformListResponse.getName();
                            } else {
                                str3 = null;
                            }
                            green4.A.setText(str3);
                            AbstractC0063s green5 = signUpActivity.green();
                            Country country = signUpActivity.f12190M;
                            if (country != null) {
                                str4 = country.getLocalizedName();
                            } else {
                                str4 = null;
                            }
                            green5.f672r.setText(str4);
                            signUpActivity.green().f683y.setText(signUpResponse.getMobileNumber());
                            AbstractC0063s green6 = signUpActivity.green();
                            Country country2 = signUpActivity.f12190M;
                            if (country2 != null) {
                                str5 = country2.getMobileCountryCode();
                            } else {
                                str5 = null;
                            }
                            green6.f641Y.setPrefixText(str5);
                            signUpActivity.f12194R = signUpResponse.getCity();
                            AbstractC0063s green7 = signUpActivity.green();
                            City city = signUpActivity.f12194R;
                            if (city != null) {
                                str6 = city.getName();
                            } else {
                                str6 = null;
                            }
                            green7.f670q.setText(str6);
                            signUpActivity.f12191N = signUpResponse.getBank();
                            AbstractC0063s green8 = signUpActivity.green();
                            Bank bank = signUpActivity.f12191N;
                            if (bank != null) {
                                str7 = bank.getName();
                            } else {
                                str7 = null;
                            }
                            green8.f668p.setText(str7);
                            signUpActivity.f12191N = signUpResponse.getBank();
                            AbstractC0063s green9 = signUpActivity.green();
                            Bank bank2 = signUpActivity.f12191N;
                            if (bank2 != null) {
                                str8 = bank2.getName();
                            } else {
                                str8 = null;
                            }
                            green9.f668p.setText(str8);
                            signUpActivity.green().f623F.setText(signUpResponse.getIbanName());
                            signUpActivity.green().f681w.setText(signUpResponse.getIban());
                            signUpActivity.green().f678u.setText(signUpResponse.getFintechAccountId());
                            ImageView ivIdCardSnap = signUpActivity.green().f653h0;
                            Intrinsics.delta(ivIdCardSnap, "ivIdCardSnap");
                            Image idFile = signUpResponse.getIdFile();
                            if (idFile != null) {
                                str9 = idFile.getUrl();
                            } else {
                                str9 = null;
                            }
                            AbstractC2643e5.charlie(ivIdCardSnap, str9, R.dimen.spacing_12, 4);
                            ImageView ivDrivingLicenseSnap = signUpActivity.green().f651g0;
                            Intrinsics.delta(ivDrivingLicenseSnap, "ivDrivingLicenseSnap");
                            Image drivingLicenseFile = signUpResponse.getDrivingLicenseFile();
                            if (drivingLicenseFile != null) {
                                str10 = drivingLicenseFile.getUrl();
                            } else {
                                str10 = null;
                            }
                            AbstractC2643e5.charlie(ivDrivingLicenseSnap, str10, R.dimen.spacing_12, 4);
                            ImageView ivRegistrationSnap = signUpActivity.green().f657j0;
                            Intrinsics.delta(ivRegistrationSnap, "ivRegistrationSnap");
                            Image registrationFile = signUpResponse.getRegistrationFile();
                            if (registrationFile != null) {
                                str11 = registrationFile.getUrl();
                            } else {
                                str11 = null;
                            }
                            AbstractC2643e5.charlie(ivRegistrationSnap, str11, R.dimen.spacing_12, 4);
                            ImageView ivProfilePicture = signUpActivity.green().f655i0;
                            Intrinsics.delta(ivProfilePicture, "ivProfilePicture");
                            Image profilePicFile = signUpResponse.getProfilePicFile();
                            if (profilePicFile != null) {
                                str13 = profilePicFile.getUrl();
                            }
                            AbstractC2643e5.charlie(ivProfilePicture, str13, R.dimen.spacing_12, 4);
                            signUpActivity.green().f662m.setText(R.string.update);
                            FloatingActionButton info = signUpActivity.green().f649f0;
                            Intrinsics.delta(info, "info");
                            info.setVisibility(8);
                            signUpActivity.green().f649f0.setOnClickListener(new Kb.k(13, signUpActivity, signUpResponse));
                            signUpActivity.indigo().getNationalities().observe(signUpActivity, new t(20, new C2007a(16, signUpActivity, signUpResponse)));
                        }
                    }
                } else {
                    signUpActivity.tango();
                }
                return Unit.INSTANCE;
            case 1:
                HashMap hashMap = (HashMap) obj;
                int i18 = SignUpActivity.f12184d0;
                boolean containsKey = hashMap.containsKey(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY));
                ImageButton btnClearIdCardSnap = signUpActivity.green().f652h;
                Intrinsics.delta(btnClearIdCardSnap, "btnClearIdCardSnap");
                if (containsKey) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                btnClearIdCardSnap.setVisibility(i4);
                ImageView ivIdCardSnap2 = signUpActivity.green().f653h0;
                Intrinsics.delta(ivIdCardSnap2, "ivIdCardSnap");
                if (containsKey) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                ivIdCardSnap2.setVisibility(i5);
                boolean containsKey2 = hashMap.containsKey(1002);
                ImageButton btnClearDrivingLicenseSnap = signUpActivity.green().f650g;
                Intrinsics.delta(btnClearDrivingLicenseSnap, "btnClearDrivingLicenseSnap");
                if (containsKey2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                btnClearDrivingLicenseSnap.setVisibility(i10);
                ImageView ivDrivingLicenseSnap2 = signUpActivity.green().f651g0;
                Intrinsics.delta(ivDrivingLicenseSnap2, "ivDrivingLicenseSnap");
                if (containsKey2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                ivDrivingLicenseSnap2.setVisibility(i11);
                boolean containsKey3 = hashMap.containsKey(1003);
                ImageButton btnClearRegistrationSnap = signUpActivity.green().f656j;
                Intrinsics.delta(btnClearRegistrationSnap, "btnClearRegistrationSnap");
                if (containsKey3) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                btnClearRegistrationSnap.setVisibility(i12);
                ImageView ivRegistrationSnap2 = signUpActivity.green().f657j0;
                Intrinsics.delta(ivRegistrationSnap2, "ivRegistrationSnap");
                if (containsKey3) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                ivRegistrationSnap2.setVisibility(i13);
                boolean containsKey4 = hashMap.containsKey(1004);
                ImageButton btnClearProfileSnap = signUpActivity.green().f654i;
                Intrinsics.delta(btnClearProfileSnap, "btnClearProfileSnap");
                if (containsKey4) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                btnClearProfileSnap.setVisibility(i14);
                ImageView ivProfilePicture2 = signUpActivity.green().f655i0;
                Intrinsics.delta(ivProfilePicture2, "ivProfilePicture");
                if (containsKey4) {
                    i15 = 0;
                }
                ivProfilePicture2.setVisibility(i15);
                return Unit.INSTANCE;
            case 2:
                PlatformListResponse it = (PlatformListResponse) obj;
                int i19 = SignUpActivity.f12184d0;
                Intrinsics.echo(it, "it");
                signUpActivity.f12193P = it;
                signUpActivity.green().A.setText(it.getName());
                return Unit.INSTANCE;
            case 3:
                City it2 = (City) obj;
                int i20 = SignUpActivity.f12184d0;
                Intrinsics.echo(it2, "it");
                signUpActivity.f12194R = it2;
                signUpActivity.green().f670q.setText(it2.getLocalizedName());
                return Unit.INSTANCE;
            case 4:
                Bank it3 = (Bank) obj;
                int i21 = SignUpActivity.f12184d0;
                Intrinsics.echo(it3, "it");
                signUpActivity.f12191N = it3;
                signUpActivity.green().f668p.setText(it3.getLocalizedName());
                return Unit.INSTANCE;
            case 5:
                Country it4 = (Country) obj;
                int i22 = SignUpActivity.f12184d0;
                Intrinsics.echo(it4, "it");
                signUpActivity.Q = it4;
                signUpActivity.green().f684z.setText(it4.getValidDemonym());
                return Unit.INSTANCE;
            case 6:
                C2492a c2492a2 = (C2492a) obj;
                int i23 = SignUpActivity.f12184d0;
                int i24 = c2492a2.alpha;
                if (i24 != 0) {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            signUpActivity.bronze();
                        }
                    } else {
                        signUpActivity.tango();
                        new w().romeo(signUpActivity.getSupportFragmentManager(), "");
                    }
                } else {
                    signUpActivity.tango();
                    String str15 = c2492a2.bravo;
                    if (str15 == null) {
                        return Unit.INSTANCE;
                    }
                    L9.d.pink(signUpActivity, str15);
                }
                return Unit.INSTANCE;
            case 7:
                Long l10 = (Long) obj;
                int i25 = SignUpActivity.f12184d0;
                AbstractC0063s green10 = signUpActivity.green();
                Intrinsics.checkNotNull(l10);
                green10.f674s.setText(AbstractC2634d5.charlie(new Date(l10.longValue())));
                return Unit.INSTANCE;
            default:
                Country it5 = (Country) obj;
                int i26 = SignUpActivity.f12184d0;
                Intrinsics.echo(it5, "it");
                City city2 = signUpActivity.f12194R;
                if (city2 != null) {
                    num = city2.getId();
                } else {
                    num = null;
                }
                if (!Intrinsics.areEqual(num, it5.getId())) {
                    signUpActivity.f12194R = null;
                    signUpActivity.green().f670q.setText("");
                }
                signUpActivity.f12190M = it5;
                AbstractC0063s green11 = signUpActivity.green();
                green11.f672r.setText(it5.getLocalizedName());
                String mobileCountryCode = it5.getMobileCountryCode();
                if (mobileCountryCode != null) {
                    str13 = r.oscar(r.oscar(mobileCountryCode, "+", ""), "00", "");
                }
                green11.f636T.setPrefixText(P0.crimson(str13, "5"));
                green11.f641Y.setPrefixText(it5.getMobileCountryCode());
                return Unit.INSTANCE;
        }
    }
}
