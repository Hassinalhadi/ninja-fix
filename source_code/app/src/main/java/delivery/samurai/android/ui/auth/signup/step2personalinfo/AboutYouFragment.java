package delivery.samurai.android.ui.auth.signup.step2personalinfo;

import B2.q;
import B9.ab;
import B9.ay;
import Ba.f;
import Ba.g;
import Ba.h;
import Ba.j;
import Ba.n;
import Fc.a;
import Fc.b;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.T;
import com.app.network.network.models.Country;
import com.app.network.network.models.SignUpRequest;
import com.google.android.material.datepicker.v;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import t6.S2;
import vf.ad;
import z1.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signup/step2personalinfo/AboutYouFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AboutYouFragment extends j {

    /* renamed from: f, reason: collision with root package name */
    public ay f12217f;

    /* renamed from: g, reason: collision with root package name */
    public List f12218g;

    /* renamed from: h, reason: collision with root package name */
    public v f12219h;

    /* renamed from: i, reason: collision with root package name */
    public n f12220i;

    /* renamed from: j, reason: collision with root package name */
    public Country f12221j;
    public final ab e = new ab(u.alpha.bravo(AuthViewModel.class), new g(this, 0), new g(this, 2), new g(this, 1));

    /* renamed from: k, reason: collision with root package name */
    public final h f12222k = new h(0, this);

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        z1.g charlie = d.charlie(inflater, R.layout.fragment_about_you, viewGroup, false);
        Intrinsics.delta(charlie, "inflate(...)");
        this.f12217f = (ay) charlie;
        View view = romeo().red;
        Intrinsics.delta(view, "getRoot(...)");
        return view;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z2;
        int i4;
        int collectionSizeOrDefault;
        EditText editText;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        int i5 = 0;
        this.f12218g = CollectionsKt.listOf(romeo().f405n, romeo().f407p, romeo().f410s, romeo().f409r, romeo().f406o, romeo().f408q);
        Context context = getContext();
        if (context != null) {
            z2 = L9.d.whiskey((ContextWrapper) context);
        } else {
            z2 = false;
        }
        TextInputLayout tilReferral = romeo().f411t;
        Intrinsics.delta(tilReferral, "tilReferral");
        if (z2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        tilReferral.setVisibility(i4);
        TextView tvReferralSection = romeo().f412u;
        Intrinsics.delta(tvReferralSection, "tvReferralSection");
        if (!z2) {
            i5 = 8;
        }
        tvReferralSection.setVisibility(i5);
        Object obj = null;
        ad.zulu(T.foxtrot(this), null, null, new f(this, null), 3);
        oscar();
        List<TextInputLayout> list = this.f12218g;
        if (list != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (TextInputLayout textInputLayout : list) {
                if (textInputLayout != null) {
                    editText = textInputLayout.getEditText();
                } else {
                    editText = null;
                }
                arrayList.add(editText);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                EditText editText2 = (EditText) it.next();
                if (editText2 != null) {
                    editText2.addTextChangedListener(this.f12222k);
                }
            }
            quebec();
            SignUpRequest signUpRequest = (SignUpRequest) sierra().getSignUpRequest().getValue();
            String firstName = signUpRequest.getFirstName();
            if (firstName != null && !StringsKt.gray(firstName)) {
                romeo().f398g.setText(signUpRequest.getFirstName());
            }
            String lastName = signUpRequest.getLastName();
            if (lastName != null && !StringsKt.gray(lastName)) {
                romeo().f400i.setText(signUpRequest.getLastName());
            }
            String dob = signUpRequest.getDob();
            if (dob != null && !StringsKt.gray(dob)) {
                romeo().f403l.setText(signUpRequest.getDob());
            }
            String idNumber = signUpRequest.getIdNumber();
            if (idNumber != null && !StringsKt.gray(idNumber)) {
                romeo().f399h.setText(signUpRequest.getIdNumber());
            }
            String mobileNumber = signUpRequest.getMobileNumber();
            if (mobileNumber != null && !StringsKt.gray(mobileNumber)) {
                romeo().f401j.setText(signUpRequest.getMobileNumber());
            }
            String referralCode = signUpRequest.getReferralCode();
            if (referralCode != null && !StringsKt.gray(referralCode)) {
                romeo().f402k.setText(signUpRequest.getReferralCode());
            }
            String nationality = signUpRequest.getNationality();
            if (nationality != null && !StringsKt.gray(nationality)) {
                Iterator it2 = sierra().readNationalitiesFromAssets().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (ArraysKt.whiskey(((Country) next).getAltSpellings(), signUpRequest.getNationality())) {
                        obj = next;
                        break;
                    }
                }
                Country country = (Country) obj;
                if (country != null) {
                    this.f12221j = country;
                    romeo().f404m.setText(country.getLocalizedName());
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.lima("formFields");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
        ay romeo = romeo();
        final int i4 = 2;
        romeo.f403l.setOnClickListener(new View.OnClickListener(this) { // from class: Ba.b
            public final /* synthetic */ AboutYouFragment purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.material.datepicker.DateSelector, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        AboutYouFragment aboutYouFragment = this.purple;
                        aboutYouFragment.sierra().updateRequest(new a(aboutYouFragment, 3));
                        J2.f.alpha(aboutYouFragment).charlie(R.id.nav_share_documents, null, null);
                        return;
                    case 1:
                        AboutYouFragment aboutYouFragment2 = this.purple;
                        if (aboutYouFragment2.f12220i == null) {
                            a aVar = new a(aboutYouFragment2, 2);
                            q qVar = new q(2, aboutYouFragment2);
                            n nVar = new n();
                            nVar.f740u = aVar;
                            nVar.f741v = qVar;
                            nVar.f14101q = true;
                            aboutYouFragment2.f12220i = nVar;
                            nVar.romeo(aboutYouFragment2.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                    default:
                        AboutYouFragment aboutYouFragment3 = this.purple;
                        if (aboutYouFragment3.f12219h == null) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(1, -18);
                            long timeInMillis = calendar.getTimeInMillis();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.add(1, -100);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            com.google.android.material.datepicker.u uVar = new com.google.android.material.datepicker.u(new Object());
                            com.google.android.material.datepicker.b bVar = new com.google.android.material.datepicker.b();
                            bVar.alpha = timeInMillis2;
                            bVar.bravo = timeInMillis;
                            uVar.bravo = bVar.alpha();
                            v alpha = uVar.alpha();
                            alpha.f8005j.add(new c(0, new a(aboutYouFragment3, 1)));
                            alpha.f8008m.add(new d(0, aboutYouFragment3));
                            aboutYouFragment3.f12219h = alpha;
                            alpha.romeo(aboutYouFragment3.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                }
            }
        });
        ay romeo2 = romeo();
        final int i5 = 1;
        romeo2.f404m.setOnClickListener(new View.OnClickListener(this) { // from class: Ba.b
            public final /* synthetic */ AboutYouFragment purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.material.datepicker.DateSelector, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        AboutYouFragment aboutYouFragment = this.purple;
                        aboutYouFragment.sierra().updateRequest(new a(aboutYouFragment, 3));
                        J2.f.alpha(aboutYouFragment).charlie(R.id.nav_share_documents, null, null);
                        return;
                    case 1:
                        AboutYouFragment aboutYouFragment2 = this.purple;
                        if (aboutYouFragment2.f12220i == null) {
                            a aVar = new a(aboutYouFragment2, 2);
                            q qVar = new q(2, aboutYouFragment2);
                            n nVar = new n();
                            nVar.f740u = aVar;
                            nVar.f741v = qVar;
                            nVar.f14101q = true;
                            aboutYouFragment2.f12220i = nVar;
                            nVar.romeo(aboutYouFragment2.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                    default:
                        AboutYouFragment aboutYouFragment3 = this.purple;
                        if (aboutYouFragment3.f12219h == null) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(1, -18);
                            long timeInMillis = calendar.getTimeInMillis();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.add(1, -100);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            com.google.android.material.datepicker.u uVar = new com.google.android.material.datepicker.u(new Object());
                            com.google.android.material.datepicker.b bVar = new com.google.android.material.datepicker.b();
                            bVar.alpha = timeInMillis2;
                            bVar.bravo = timeInMillis;
                            uVar.bravo = bVar.alpha();
                            v alpha = uVar.alpha();
                            alpha.f8005j.add(new c(0, new a(aboutYouFragment3, 1)));
                            alpha.f8008m.add(new d(0, aboutYouFragment3));
                            aboutYouFragment3.f12219h = alpha;
                            alpha.romeo(aboutYouFragment3.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                }
            }
        });
        ay romeo3 = romeo();
        final int i10 = 0;
        romeo3.f397f.setOnClickListener(new View.OnClickListener(this) { // from class: Ba.b
            public final /* synthetic */ AboutYouFragment purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.material.datepicker.DateSelector, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        AboutYouFragment aboutYouFragment = this.purple;
                        aboutYouFragment.sierra().updateRequest(new a(aboutYouFragment, 3));
                        J2.f.alpha(aboutYouFragment).charlie(R.id.nav_share_documents, null, null);
                        return;
                    case 1:
                        AboutYouFragment aboutYouFragment2 = this.purple;
                        if (aboutYouFragment2.f12220i == null) {
                            a aVar = new a(aboutYouFragment2, 2);
                            q qVar = new q(2, aboutYouFragment2);
                            n nVar = new n();
                            nVar.f740u = aVar;
                            nVar.f741v = qVar;
                            nVar.f14101q = true;
                            aboutYouFragment2.f12220i = nVar;
                            nVar.romeo(aboutYouFragment2.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                    default:
                        AboutYouFragment aboutYouFragment3 = this.purple;
                        if (aboutYouFragment3.f12219h == null) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(1, -18);
                            long timeInMillis = calendar.getTimeInMillis();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.add(1, -100);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            com.google.android.material.datepicker.u uVar = new com.google.android.material.datepicker.u(new Object());
                            com.google.android.material.datepicker.b bVar = new com.google.android.material.datepicker.b();
                            bVar.alpha = timeInMillis2;
                            bVar.bravo = timeInMillis;
                            uVar.bravo = bVar.alpha();
                            v alpha = uVar.alpha();
                            alpha.f8005j.add(new c(0, new a(aboutYouFragment3, 1)));
                            alpha.f8008m.add(new d(0, aboutYouFragment3));
                            aboutYouFragment3.f12219h = alpha;
                            alpha.romeo(aboutYouFragment3.getParentFragmentManager(), "");
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final void quebec() {
        boolean z2 = false;
        ay romeo = romeo();
        AuthViewModel sierra = sierra();
        TextInputLayout ilFName = romeo().f405n;
        Intrinsics.delta(ilFName, "ilFName");
        a aVar = a.purple;
        Regex regex = aVar.alpha;
        b bVar = b.purple;
        Integer valueOf = Integer.valueOf(R.string.validation_first_name);
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        Boolean valueOf2 = Boolean.valueOf(sierra.validateField(ilFName, regex, valueOf, requireContext));
        AuthViewModel sierra2 = sierra();
        TextInputLayout ilLName = romeo().f407p;
        Intrinsics.delta(ilLName, "ilLName");
        Integer valueOf3 = Integer.valueOf(R.string.validation_last_name);
        Context requireContext2 = requireContext();
        Intrinsics.delta(requireContext2, "requireContext(...)");
        Boolean valueOf4 = Boolean.valueOf(sierra2.validateField(ilLName, aVar.alpha, valueOf3, requireContext2));
        AuthViewModel sierra3 = sierra();
        TextInputLayout ilSelectNationality = romeo().f410s;
        Intrinsics.delta(ilSelectNationality, "ilSelectNationality");
        Context requireContext3 = requireContext();
        Intrinsics.delta(requireContext3, "requireContext(...)");
        Boolean valueOf5 = Boolean.valueOf(AuthViewModel.validateField$default(sierra3, ilSelectNationality, null, null, requireContext3, 6, null));
        AuthViewModel sierra4 = sierra();
        TextInputLayout ilIdNumber = romeo().f406o;
        Intrinsics.delta(ilIdNumber, "ilIdNumber");
        Regex regex2 = a.silver.alpha;
        Integer valueOf6 = Integer.valueOf(R.string.validation_id_number);
        Context requireContext4 = requireContext();
        Intrinsics.delta(requireContext4, "requireContext(...)");
        Boolean valueOf7 = Boolean.valueOf(sierra4.validateField(ilIdNumber, regex2, valueOf6, requireContext4));
        AuthViewModel sierra5 = sierra();
        TextInputLayout ilMobileNumber = romeo().f408q;
        Intrinsics.delta(ilMobileNumber, "ilMobileNumber");
        Regex regex3 = a.red.alpha;
        Integer valueOf8 = Integer.valueOf(R.string.VALIDATION_MOBILE_NO);
        Context requireContext5 = requireContext();
        Intrinsics.delta(requireContext5, "requireContext(...)");
        Boolean valueOf9 = Boolean.valueOf(sierra5.validateField(ilMobileNumber, regex3, valueOf8, requireContext5));
        TextInputLayout ilSelectDate = romeo().f409r;
        Intrinsics.delta(ilSelectDate, "ilSelectDate");
        List listOf = CollectionsKt.listOf(valueOf2, valueOf4, valueOf5, valueOf7, valueOf9, Boolean.valueOf(!StringsKt.gray(S2.bravo(ilSelectDate))));
        if (listOf == null || !listOf.isEmpty()) {
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    break;
                }
            }
        }
        z2 = true;
        romeo.f397f.setEnabled(z2);
    }

    public final ay romeo() {
        ay ayVar = this.f12217f;
        if (ayVar != null) {
            return ayVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final AuthViewModel sierra() {
        return (AuthViewModel) this.e.getValue();
    }
}
