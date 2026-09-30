package delivery.samurai.android.ui.about;

import B9.G;
import B9.ab;
import Ca.c;
import Xa.f;
import Xe.s;
import Zd.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import com.app.base.BaseViewModel;
import com.app.network.network.models.trophies.Trophy;
import com.bumptech.glide.b;
import com.google.android.material.imageview.ShapeableImageView;
import d.C1534h0;
import d3.n;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.viewmodel.TrophyMilestonesViewModel;
import ka.j;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import s6.AbstractC2634d5;
import z1.d;
import z1.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/about/TrophyMilestonesFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrophyMilestonesFragment extends n {

    /* renamed from: b, reason: collision with root package name */
    public final ab f12117b;

    /* renamed from: c, reason: collision with root package name */
    public G f12118c;

    /* renamed from: d, reason: collision with root package name */
    public Trophy f12119d;
    public c e;

    public TrophyMilestonesFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new s(27, new s(26, this)));
        this.f12117b = new ab(u.alpha.bravo(TrophyMilestonesViewModel.class), new ga.ab(alpha, 6), new f(13, this, alpha), new ga.ab(alpha, 7));
        this.f12119d = new Trophy(0, null, null, null, null, null, null, null, null, 0.0d, 0.0d, 2047, null);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = G.f132o;
        DataBinderMapperImpl dataBinderMapperImpl = d.alpha;
        G g2 = (G) g.kilo(inflater, R.layout.fragment_trophy_milestone, viewGroup, false, null);
        Intrinsics.delta(g2, "inflate(...)");
        this.f12118c = g2;
        View view = g2.red;
        Intrinsics.delta(view, "getRoot(...)");
        return view;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Trophy trophy;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (trophy = (Trophy) arguments.getParcelable("TROPHY_DETAILS")) == null) {
            trophy = new Trophy(0, null, null, null, null, null, null, null, null, 0.0d, 0.0d, 2047, null);
        }
        this.f12119d = trophy;
        ab abVar = this.f12117b;
        TrophyMilestonesViewModel trophyMilestonesViewModel = (TrophyMilestonesViewModel) abVar.getValue();
        BaseViewModel.launchApi$default(trophyMilestonesViewModel, null, new j(trophyMilestonesViewModel, this.f12119d.getId(), null), 1, null);
        G g2 = this.f12118c;
        if (g2 != null) {
            g2.f133f.setProgress(a.charlie(this.f12119d.getCaptainProgress()));
            g2.f140m.setText(this.f12119d.localizedTitle());
            g2.f136i.setText(requireContext().getResources().getQuantityString(R.plurals.number_of_days, AbstractC2634d5.echo(this.f12119d.getEndsAt()), Integer.valueOf(AbstractC2634d5.echo(this.f12119d.getEndsAt()))));
            g2.f138k.setText(requireContext().getString(R.string.trophy_progress_label, Integer.valueOf(a.charlie(this.f12119d.getCaptainProgress()))));
            String localizedDescription = this.f12119d.localizedDescription();
            if (localizedDescription != null && !StringsKt.gray(localizedDescription)) {
                String localizedDescription2 = this.f12119d.localizedDescription();
                TextView textView = g2.f139l;
                textView.setText(localizedDescription2);
                textView.setVisibility(0);
            }
            ShapeableImageView shapeableImageView = g2.f135h;
            ((com.bumptech.glide.j) ((com.bumptech.glide.j) b.foxtrot(shapeableImageView).quebec(this.f12119d.localizedImage()).bravo()).lima(R.drawable.img_place_holder)).azure(shapeableImageView);
            c cVar = new c(13);
            this.e = cVar;
            G g5 = this.f12118c;
            if (g5 != null) {
                g5.f134g.setAdapter(cVar);
                ((TrophyMilestonesViewModel) abVar.getValue()).charlie.observe(getViewLifecycleOwner(), new Aa.f(26, new C1534h0(5, this)));
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
    }
}
