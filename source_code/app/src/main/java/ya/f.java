package ya;

import Dc.t;
import Xd.l;
import android.graphics.Typeface;
import com.app.network.network.models.Country;
import com.app.network.network.models.SignUpRequest;
import com.google.android.material.textfield.TextInputEditText;
import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import java.util.Iterator;
import java.util.List;
import k4.C2007a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ StartWorkFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StartWorkFragment startWorkFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = startWorkFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        f fVar = new f(this.purple, cVar);
        fVar.alpha = obj;
        return fVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((SignUpRequest) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Country country;
        Object obj2;
        SignUpRequest signUpRequest = (SignUpRequest) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        StartWorkFragment startWorkFragment = this.purple;
        List list = startWorkFragment.f12206f;
        Integer num = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((Country) obj2).getId(), signUpRequest.getCountryId())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            country = (Country) obj2;
        } else {
            country = null;
        }
        if (country != null) {
            Integer id2 = country.getId();
            Country country2 = startWorkFragment.f12208h;
            if (country2 != null) {
                num = country2.getId();
            }
            if (!Intrinsics.areEqual(id2, num)) {
                startWorkFragment.uniform(country);
                ((TextInputEditText) startWorkFragment.quebec().foxtrot).setText(country.getLocalizedName());
                ((TextInputEditText) startWorkFragment.quebec().foxtrot).setTypeface(Typeface.defaultFromStyle(1));
            }
        }
        Integer countryId = signUpRequest.getCountryId();
        Integer cityId = signUpRequest.getCityId();
        if (countryId != null && cityId != null) {
            startWorkFragment.romeo().getCities(countryId.intValue(), 0).observe(startWorkFragment.getViewLifecycleOwner(), new t(21, new C3409e(cityId, startWorkFragment, 2)));
        }
        if (countryId != null && signUpRequest.getPreferredPlatformId() != null) {
            startWorkFragment.romeo().getPlatformListByCountryId(countryId.intValue()).observe(startWorkFragment.getViewLifecycleOwner(), new t(21, new C2007a(20, signUpRequest, startWorkFragment)));
        }
        return Unit.INSTANCE;
    }
}
