package delivery.samurai.android.ui.auth.signup.step1worksetup;

import Aa.j;
import Aa.n;
import Aa.p;
import B9.C0058p;
import B9.ab;
import Dc.t;
import Va.d;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.PlatformListResponse;
import com.app.network.network.models.SignUpRequest;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import s1.C2576i;
import t6.S3;
import tg.b;
import ya.AbstractC3405a;
import ya.C3407c;
import ya.C3409e;
import ya.h;
import za.C3495d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signup/step1worksetup/StartWorkFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class StartWorkFragment extends AbstractC3405a {
    public final ab e = new ab(u.alpha.bravo(AuthViewModel.class), new h(this, 0), new h(this, 2), new h(this, 1));

    /* renamed from: f, reason: collision with root package name */
    public List f12206f;

    /* renamed from: g, reason: collision with root package name */
    public List f12207g;

    /* renamed from: h, reason: collision with root package name */
    public Country f12208h;

    /* renamed from: i, reason: collision with root package name */
    public City f12209i;

    /* renamed from: j, reason: collision with root package name */
    public PlatformListResponse f12210j;

    /* renamed from: k, reason: collision with root package name */
    public final C3495d f12211k;

    /* renamed from: l, reason: collision with root package name */
    public final d f12212l;

    /* renamed from: m, reason: collision with root package name */
    public n f12213m;

    /* renamed from: n, reason: collision with root package name */
    public p f12214n;

    /* renamed from: o, reason: collision with root package name */
    public j f12215o;

    /* renamed from: p, reason: collision with root package name */
    public C0058p f12216p;

    public StartWorkFragment() {
        Integer num;
        Country country = this.f12208h;
        if (country != null) {
            num = country.getId();
        } else {
            num = null;
        }
        this.f12211k = new C3495d(num);
        this.f12212l = new d(3);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_start_work, viewGroup, false);
        int i4 = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnContinue, inflate);
        if (materialButton != null) {
            i4 = R.id.clCountrySelection;
            if (((ConstraintLayout) S3.bravo(R.id.clCountrySelection, inflate)) != null) {
                i4 = R.id.clPlatformSelection;
                if (((ConstraintLayout) S3.bravo(R.id.clPlatformSelection, inflate)) != null) {
                    i4 = R.id.cvContinueButton;
                    if (((MaterialCardView) S3.bravo(R.id.cvContinueButton, inflate)) != null) {
                        i4 = R.id.etCitySelection;
                        TextInputEditText textInputEditText = (TextInputEditText) S3.bravo(R.id.etCitySelection, inflate);
                        if (textInputEditText != null) {
                            i4 = R.id.etCountrySelection;
                            TextInputEditText textInputEditText2 = (TextInputEditText) S3.bravo(R.id.etCountrySelection, inflate);
                            if (textInputEditText2 != null) {
                                i4 = R.id.etPlatformSelection;
                                TextInputEditText textInputEditText3 = (TextInputEditText) S3.bravo(R.id.etPlatformSelection, inflate);
                                if (textInputEditText3 != null) {
                                    i4 = R.id.ilCitySelection;
                                    if (((TextInputLayout) S3.bravo(R.id.ilCitySelection, inflate)) != null) {
                                        i4 = R.id.ilCountrySelection;
                                        TextInputLayout textInputLayout = (TextInputLayout) S3.bravo(R.id.ilCountrySelection, inflate);
                                        if (textInputLayout != null) {
                                            i4 = R.id.ilPlatformSelection;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) S3.bravo(R.id.ilPlatformSelection, inflate);
                                            if (textInputLayout2 != null) {
                                                i4 = R.id.rvCountries;
                                                RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rvCountries, inflate);
                                                if (recyclerView != null) {
                                                    i4 = R.id.rvPlatforms;
                                                    RecyclerView recyclerView2 = (RecyclerView) S3.bravo(R.id.rvPlatforms, inflate);
                                                    if (recyclerView2 != null) {
                                                        i4 = R.id.toolbar;
                                                        if (((Toolbar) S3.bravo(R.id.toolbar, inflate)) != null) {
                                                            i4 = R.id.tvCityTitle;
                                                            if (((TextView) S3.bravo(R.id.tvCityTitle, inflate)) != null) {
                                                                i4 = R.id.tvCountryTitle;
                                                                if (((AppCompatCheckedTextView) S3.bravo(R.id.tvCountryTitle, inflate)) != null) {
                                                                    i4 = R.id.tvDescription;
                                                                    if (((TextView) S3.bravo(R.id.tvDescription, inflate)) != null) {
                                                                        i4 = R.id.tvPlatformTitle;
                                                                        TextView textView = (TextView) S3.bravo(R.id.tvPlatformTitle, inflate);
                                                                        if (textView != null) {
                                                                            i4 = R.id.tvTitle;
                                                                            if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                                                                                this.f12216p = new C0058p((ConstraintLayout) inflate, materialButton, textInputEditText, textInputEditText2, textInputEditText3, textInputLayout, textInputLayout2, recyclerView, recyclerView2, textView);
                                                                                return (ConstraintLayout) quebec().bravo;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        if (this.f12209i != null) {
            ((TextInputEditText) quebec().echo).setTypeface(Typeface.defaultFromStyle(1));
        }
        if (this.f12210j != null) {
            ((TextInputEditText) quebec().golf).setTypeface(Typeface.defaultFromStyle(1));
        }
        if (this.f12208h != null) {
            ((TextInputEditText) quebec().foxtrot).setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        oscar();
        SignUpRequest signUpRequest = (SignUpRequest) romeo().getSignUpRequest().getValue();
        Integer countryId = signUpRequest.getCountryId();
        Integer cityId = signUpRequest.getCityId();
        Integer preferredPlatformId = signUpRequest.getPreferredPlatformId();
        if (countryId != null) {
            int intValue = countryId.intValue();
            List list = this.f12206f;
            Country country = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Integer id2 = ((Country) next).getId();
                    if (id2 != null && id2.intValue() == intValue) {
                        country = next;
                        break;
                    }
                }
                country = country;
            }
            if (country != null) {
                uniform(country);
                ((TextInputEditText) quebec().foxtrot).setText(country.getLocalizedName());
                C0058p quebec = quebec();
                ((TextInputEditText) quebec.foxtrot).setTypeface(Typeface.defaultFromStyle(1));
            }
        }
        if (countryId != null && cityId != null) {
            romeo().getCities(countryId.intValue(), 0).observe(getViewLifecycleOwner(), new t(21, new C3409e(cityId, this, 0)));
        }
        if (countryId != null && preferredPlatformId != null) {
            romeo().getPlatformListByCountryId(countryId.intValue()).observe(getViewLifecycleOwner(), new t(21, new C3409e(preferredPlatformId, this, 1)));
        }
        ((RecyclerView) quebec().juliet).setAdapter(this.f12211k);
        ((RecyclerView) quebec().kilo).setAdapter(this.f12212l);
        romeo().resetCountriesPagination();
        romeo().getCountries();
        romeo().getCountriesLiveData().observe(getViewLifecycleOwner(), new t(21, new C3407c(this, 4)));
        sierra();
    }

    @Override // d3.n
    public final void oscar() {
        C0058p quebec = quebec();
        final int i4 = 2;
        ((TextInputEditText) quebec.echo).setOnClickListener(new View.OnClickListener(this) { // from class: ya.b
            public final /* synthetic */ StartWorkFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5;
                int i10 = 2;
                int i11 = 0;
                int i12 = 1;
                StartWorkFragment startWorkFragment = this.purple;
                switch (i4) {
                    case 0:
                        if (startWorkFragment.f12208h == null) {
                            k kilo = startWorkFragment.kilo();
                            Fc.b bVar = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo);
                            return;
                        }
                        if (startWorkFragment.f12214n == null) {
                            List platforms = startWorkFragment.f12207g;
                            if (platforms == null) {
                                platforms = CollectionsKt.emptyList();
                            }
                            C3407c c3407c = new C3407c(startWorkFragment, i10);
                            C3408d c3408d = new C3408d(startWorkFragment, i12);
                            Intrinsics.echo(platforms, "platforms");
                            p pVar = new p();
                            pVar.f51u = platforms;
                            pVar.f52v = c3407c;
                            pVar.f53w = c3408d;
                            pVar.f14101q = true;
                            startWorkFragment.f12214n = pVar;
                            pVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 1:
                        if (startWorkFragment.f12213m == null) {
                            List initialCountries = startWorkFragment.f12206f;
                            if (initialCountries == null) {
                                initialCountries = CollectionsKt.emptyList();
                            }
                            C3407c c3407c2 = new C3407c(startWorkFragment, 5);
                            C3408d c3408d2 = new C3408d(startWorkFragment, i10);
                            Intrinsics.echo(initialCountries, "initialCountries");
                            n nVar = new n();
                            nVar.f45u = initialCountries;
                            nVar.f46v = c3407c2;
                            nVar.f47w = c3408d2;
                            nVar.f14101q = true;
                            startWorkFragment.f12213m = nVar;
                            nVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 2:
                        Country country = startWorkFragment.f12208h;
                        if (country == null) {
                            k kilo2 = startWorkFragment.kilo();
                            Fc.b bVar2 = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo2);
                            return;
                        }
                        if (startWorkFragment.f12215o == null) {
                            Integer id2 = country.getId();
                            if (id2 != null) {
                                i5 = id2.intValue();
                            } else {
                                i5 = -1;
                            }
                            C3407c c3407c3 = new C3407c(startWorkFragment, i11);
                            C3408d c3408d3 = new C3408d(startWorkFragment, i11);
                            j jVar = new j();
                            jVar.f39u = i5;
                            jVar.f40v = c3407c3;
                            jVar.f41w = c3408d3;
                            jVar.f14101q = true;
                            startWorkFragment.f12215o = jVar;
                            jVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        startWorkFragment.romeo().updateRequest(new C3407c(startWorkFragment, 6));
                        J2.f.alpha(startWorkFragment).charlie(R.id.nav_about_you, null, null);
                        return;
                }
            }
        });
        C0058p quebec2 = quebec();
        final int i5 = 1;
        ((TextInputEditText) quebec2.foxtrot).setOnClickListener(new View.OnClickListener(this) { // from class: ya.b
            public final /* synthetic */ StartWorkFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52;
                int i10 = 2;
                int i11 = 0;
                int i12 = 1;
                StartWorkFragment startWorkFragment = this.purple;
                switch (i5) {
                    case 0:
                        if (startWorkFragment.f12208h == null) {
                            k kilo = startWorkFragment.kilo();
                            Fc.b bVar = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo);
                            return;
                        }
                        if (startWorkFragment.f12214n == null) {
                            List platforms = startWorkFragment.f12207g;
                            if (platforms == null) {
                                platforms = CollectionsKt.emptyList();
                            }
                            C3407c c3407c = new C3407c(startWorkFragment, i10);
                            C3408d c3408d = new C3408d(startWorkFragment, i12);
                            Intrinsics.echo(platforms, "platforms");
                            p pVar = new p();
                            pVar.f51u = platforms;
                            pVar.f52v = c3407c;
                            pVar.f53w = c3408d;
                            pVar.f14101q = true;
                            startWorkFragment.f12214n = pVar;
                            pVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 1:
                        if (startWorkFragment.f12213m == null) {
                            List initialCountries = startWorkFragment.f12206f;
                            if (initialCountries == null) {
                                initialCountries = CollectionsKt.emptyList();
                            }
                            C3407c c3407c2 = new C3407c(startWorkFragment, 5);
                            C3408d c3408d2 = new C3408d(startWorkFragment, i10);
                            Intrinsics.echo(initialCountries, "initialCountries");
                            n nVar = new n();
                            nVar.f45u = initialCountries;
                            nVar.f46v = c3407c2;
                            nVar.f47w = c3408d2;
                            nVar.f14101q = true;
                            startWorkFragment.f12213m = nVar;
                            nVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 2:
                        Country country = startWorkFragment.f12208h;
                        if (country == null) {
                            k kilo2 = startWorkFragment.kilo();
                            Fc.b bVar2 = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo2);
                            return;
                        }
                        if (startWorkFragment.f12215o == null) {
                            Integer id2 = country.getId();
                            if (id2 != null) {
                                i52 = id2.intValue();
                            } else {
                                i52 = -1;
                            }
                            C3407c c3407c3 = new C3407c(startWorkFragment, i11);
                            C3408d c3408d3 = new C3408d(startWorkFragment, i11);
                            j jVar = new j();
                            jVar.f39u = i52;
                            jVar.f40v = c3407c3;
                            jVar.f41w = c3408d3;
                            jVar.f14101q = true;
                            startWorkFragment.f12215o = jVar;
                            jVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        startWorkFragment.romeo().updateRequest(new C3407c(startWorkFragment, 6));
                        J2.f.alpha(startWorkFragment).charlie(R.id.nav_about_you, null, null);
                        return;
                }
            }
        });
        C0058p quebec3 = quebec();
        final int i10 = 0;
        ((TextInputEditText) quebec3.golf).setOnClickListener(new View.OnClickListener(this) { // from class: ya.b
            public final /* synthetic */ StartWorkFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52;
                int i102 = 2;
                int i11 = 0;
                int i12 = 1;
                StartWorkFragment startWorkFragment = this.purple;
                switch (i10) {
                    case 0:
                        if (startWorkFragment.f12208h == null) {
                            k kilo = startWorkFragment.kilo();
                            Fc.b bVar = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo);
                            return;
                        }
                        if (startWorkFragment.f12214n == null) {
                            List platforms = startWorkFragment.f12207g;
                            if (platforms == null) {
                                platforms = CollectionsKt.emptyList();
                            }
                            C3407c c3407c = new C3407c(startWorkFragment, i102);
                            C3408d c3408d = new C3408d(startWorkFragment, i12);
                            Intrinsics.echo(platforms, "platforms");
                            p pVar = new p();
                            pVar.f51u = platforms;
                            pVar.f52v = c3407c;
                            pVar.f53w = c3408d;
                            pVar.f14101q = true;
                            startWorkFragment.f12214n = pVar;
                            pVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 1:
                        if (startWorkFragment.f12213m == null) {
                            List initialCountries = startWorkFragment.f12206f;
                            if (initialCountries == null) {
                                initialCountries = CollectionsKt.emptyList();
                            }
                            C3407c c3407c2 = new C3407c(startWorkFragment, 5);
                            C3408d c3408d2 = new C3408d(startWorkFragment, i102);
                            Intrinsics.echo(initialCountries, "initialCountries");
                            n nVar = new n();
                            nVar.f45u = initialCountries;
                            nVar.f46v = c3407c2;
                            nVar.f47w = c3408d2;
                            nVar.f14101q = true;
                            startWorkFragment.f12213m = nVar;
                            nVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 2:
                        Country country = startWorkFragment.f12208h;
                        if (country == null) {
                            k kilo2 = startWorkFragment.kilo();
                            Fc.b bVar2 = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo2);
                            return;
                        }
                        if (startWorkFragment.f12215o == null) {
                            Integer id2 = country.getId();
                            if (id2 != null) {
                                i52 = id2.intValue();
                            } else {
                                i52 = -1;
                            }
                            C3407c c3407c3 = new C3407c(startWorkFragment, i11);
                            C3408d c3408d3 = new C3408d(startWorkFragment, i11);
                            j jVar = new j();
                            jVar.f39u = i52;
                            jVar.f40v = c3407c3;
                            jVar.f41w = c3408d3;
                            jVar.f14101q = true;
                            startWorkFragment.f12215o = jVar;
                            jVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        startWorkFragment.romeo().updateRequest(new C3407c(startWorkFragment, 6));
                        J2.f.alpha(startWorkFragment).charlie(R.id.nav_about_you, null, null);
                        return;
                }
            }
        });
        this.f12211k.charlie = new C2576i(this);
        this.f12212l.bravo = new b(8, this);
        C0058p quebec4 = quebec();
        final int i11 = 3;
        ((MaterialButton) quebec4.charlie).setOnClickListener(new View.OnClickListener(this) { // from class: ya.b
            public final /* synthetic */ StartWorkFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52;
                int i102 = 2;
                int i112 = 0;
                int i12 = 1;
                StartWorkFragment startWorkFragment = this.purple;
                switch (i11) {
                    case 0:
                        if (startWorkFragment.f12208h == null) {
                            k kilo = startWorkFragment.kilo();
                            Fc.b bVar = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo);
                            return;
                        }
                        if (startWorkFragment.f12214n == null) {
                            List platforms = startWorkFragment.f12207g;
                            if (platforms == null) {
                                platforms = CollectionsKt.emptyList();
                            }
                            C3407c c3407c = new C3407c(startWorkFragment, i102);
                            C3408d c3408d = new C3408d(startWorkFragment, i12);
                            Intrinsics.echo(platforms, "platforms");
                            p pVar = new p();
                            pVar.f51u = platforms;
                            pVar.f52v = c3407c;
                            pVar.f53w = c3408d;
                            pVar.f14101q = true;
                            startWorkFragment.f12214n = pVar;
                            pVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 1:
                        if (startWorkFragment.f12213m == null) {
                            List initialCountries = startWorkFragment.f12206f;
                            if (initialCountries == null) {
                                initialCountries = CollectionsKt.emptyList();
                            }
                            C3407c c3407c2 = new C3407c(startWorkFragment, 5);
                            C3408d c3408d2 = new C3408d(startWorkFragment, i102);
                            Intrinsics.echo(initialCountries, "initialCountries");
                            n nVar = new n();
                            nVar.f45u = initialCountries;
                            nVar.f46v = c3407c2;
                            nVar.f47w = c3408d2;
                            nVar.f14101q = true;
                            startWorkFragment.f12213m = nVar;
                            nVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    case 2:
                        Country country = startWorkFragment.f12208h;
                        if (country == null) {
                            k kilo2 = startWorkFragment.kilo();
                            Fc.b bVar2 = Fc.b.purple;
                            L9.d.peach(R.string.VALIDATION_COUNTRY, kilo2);
                            return;
                        }
                        if (startWorkFragment.f12215o == null) {
                            Integer id2 = country.getId();
                            if (id2 != null) {
                                i52 = id2.intValue();
                            } else {
                                i52 = -1;
                            }
                            C3407c c3407c3 = new C3407c(startWorkFragment, i112);
                            C3408d c3408d3 = new C3408d(startWorkFragment, i112);
                            j jVar = new j();
                            jVar.f39u = i52;
                            jVar.f40v = c3407c3;
                            jVar.f41w = c3408d3;
                            jVar.f14101q = true;
                            startWorkFragment.f12215o = jVar;
                            jVar.romeo(startWorkFragment.getParentFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        startWorkFragment.romeo().updateRequest(new C3407c(startWorkFragment, 6));
                        J2.f.alpha(startWorkFragment).charlie(R.id.nav_about_you, null, null);
                        return;
                }
            }
        });
    }

    public final C0058p quebec() {
        C0058p c0058p = this.f12216p;
        if (c0058p != null) {
            return c0058p;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final AuthViewModel romeo() {
        return (AuthViewModel) this.e.getValue();
    }

    public final void sierra() {
        boolean z2;
        C0058p quebec = quebec();
        if (this.f12208h != null && this.f12209i != null && this.f12210j != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ((MaterialButton) quebec.charlie).setEnabled(z2);
    }

    public final void tango(City city) {
        String string;
        int i4;
        this.f12209i = city;
        sierra();
        C0058p quebec = quebec();
        if (city == null || (string = city.getLocalizedName()) == null) {
            string = getString(R.string.select_city);
            Intrinsics.delta(string, "getString(...)");
        }
        TextInputEditText textInputEditText = (TextInputEditText) quebec.echo;
        textInputEditText.setText(string);
        if (city != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        textInputEditText.setTypeface(Typeface.defaultFromStyle(i4));
        romeo().updateRequest(new C3407c(this, 1));
    }

    public final void uniform(Country country) {
        Integer id2;
        this.f12208h = country;
        Integer id3 = country.getId();
        C3495d c3495d = this.f12211k;
        c3495d.alpha = id3;
        c3495d.notifyDataSetChanged();
        sierra();
        Country country2 = this.f12208h;
        if (country2 != null && (id2 = country2.getId()) != null) {
            romeo().getPlatformListByCountryId(id2.intValue()).observe(getViewLifecycleOwner(), new t(21, new C3407c(this, 3)));
        }
        tango(null);
        victor(null);
        romeo().updateRequest(new C3407c(this, 1));
    }

    public final void victor(PlatformListResponse platformListResponse) {
        Integer num;
        this.f12210j = platformListResponse;
        if (platformListResponse != null) {
            num = platformListResponse.getId();
        } else {
            num = null;
        }
        d dVar = this.f12212l;
        dVar.foxtrot(num);
        dVar.notifyDataSetChanged();
        sierra();
        if (platformListResponse != null) {
            ((TextInputEditText) quebec().golf).setText(platformListResponse.getLocalizedName());
            ((TextInputEditText) quebec().golf).setTypeface(Typeface.defaultFromStyle(1));
        } else {
            Iterator it = dVar.alpha.iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((PlatformListResponse) it.next()).getId(), dVar.delta)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            dVar.foxtrot(null);
            if (i4 != -1) {
                dVar.notifyItemChanged(i4);
            }
            ((TextInputEditText) quebec().golf).setText(getString(R.string.select_platform));
            ((TextInputEditText) quebec().golf).setTypeface(Typeface.defaultFromStyle(0));
        }
        romeo().updateRequest(new C3407c(this, 1));
    }
}
