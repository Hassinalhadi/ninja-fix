package Ba;

import B9.ay;
import com.app.network.network.models.Country;
import com.app.network.network.models.SignUpRequest;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2634d5;
import t6.S2;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AboutYouFragment purple;

    public /* synthetic */ a(AboutYouFragment aboutYouFragment, int i4) {
        this.alpha = i4;
        this.purple = aboutYouFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String[] altSpellings;
        String str2;
        String[] altSpellings2;
        switch (this.alpha) {
            case 0:
                SignUpRequest request = (SignUpRequest) obj;
                Intrinsics.echo(request, "request");
                AboutYouFragment aboutYouFragment = this.purple;
                TextInputLayout ilFName = aboutYouFragment.romeo().f405n;
                Intrinsics.delta(ilFName, "ilFName");
                request.setFirstName(S2.bravo(ilFName));
                TextInputLayout ilLName = aboutYouFragment.romeo().f407p;
                Intrinsics.delta(ilLName, "ilLName");
                request.setLastName(S2.bravo(ilLName));
                TextInputLayout ilSelectDate = aboutYouFragment.romeo().f409r;
                Intrinsics.delta(ilSelectDate, "ilSelectDate");
                request.setDob(S2.bravo(ilSelectDate));
                Country country = aboutYouFragment.f12221j;
                if (country != null && (altSpellings = country.getAltSpellings()) != null) {
                    str = (String) ArraysKt.fuchsia(altSpellings);
                } else {
                    str = null;
                }
                request.setNationality(str);
                TextInputLayout ilIdNumber = aboutYouFragment.romeo().f406o;
                Intrinsics.delta(ilIdNumber, "ilIdNumber");
                request.setIdNumber(S2.bravo(ilIdNumber));
                TextInputLayout ilMobileNumber = aboutYouFragment.romeo().f408q;
                Intrinsics.delta(ilMobileNumber, "ilMobileNumber");
                request.setMobileNumber(S2.bravo(ilMobileNumber));
                return Unit.INSTANCE;
            case 1:
                Long l10 = (Long) obj;
                AboutYouFragment aboutYouFragment2 = this.purple;
                ay romeo = aboutYouFragment2.romeo();
                Intrinsics.checkNotNull(l10);
                romeo.f403l.setText(AbstractC2634d5.charlie(new Date(l10.longValue())));
                aboutYouFragment2.sierra().updateRequest(new a(aboutYouFragment2, 0));
                return Unit.INSTANCE;
            case 2:
                Country it = (Country) obj;
                Intrinsics.echo(it, "it");
                AboutYouFragment aboutYouFragment3 = this.purple;
                aboutYouFragment3.f12221j = it;
                aboutYouFragment3.romeo().f404m.setText(it.getLocalizedName());
                aboutYouFragment3.sierra().updateRequest(new a(aboutYouFragment3, 0));
                return Unit.INSTANCE;
            default:
                SignUpRequest it2 = (SignUpRequest) obj;
                Intrinsics.echo(it2, "it");
                AboutYouFragment aboutYouFragment4 = this.purple;
                TextInputLayout ilFName2 = aboutYouFragment4.romeo().f405n;
                Intrinsics.delta(ilFName2, "ilFName");
                it2.setFirstName(S2.bravo(ilFName2));
                TextInputLayout ilLName2 = aboutYouFragment4.romeo().f407p;
                Intrinsics.delta(ilLName2, "ilLName");
                it2.setLastName(S2.bravo(ilLName2));
                TextInputLayout ilSelectDate2 = aboutYouFragment4.romeo().f409r;
                Intrinsics.delta(ilSelectDate2, "ilSelectDate");
                it2.setDob(S2.bravo(ilSelectDate2));
                Country country2 = aboutYouFragment4.f12221j;
                if (country2 != null && (altSpellings2 = country2.getAltSpellings()) != null) {
                    str2 = (String) ArraysKt.fuchsia(altSpellings2);
                } else {
                    str2 = null;
                }
                it2.setNationality(str2);
                TextInputLayout ilIdNumber2 = aboutYouFragment4.romeo().f406o;
                Intrinsics.delta(ilIdNumber2, "ilIdNumber");
                it2.setIdNumber(S2.bravo(ilIdNumber2));
                TextInputLayout ilMobileNumber2 = aboutYouFragment4.romeo().f408q;
                Intrinsics.delta(ilMobileNumber2, "ilMobileNumber");
                it2.setMobileNumber(S2.bravo(ilMobileNumber2));
                return Unit.INSTANCE;
        }
    }
}
