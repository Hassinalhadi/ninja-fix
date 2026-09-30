package delivery.samurai.android.ui.about;

import B9.C0058p;
import B9.I;
import B9.ab;
import Xa.f;
import Xe.s;
import Y1.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.lifecycle.T;
import androidx.lifecycle.al;
import com.app.base.BaseViewModel;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.TrophiesCollectionsFragment;
import delivery.samurai.android.ui.about.viewmodel.TrophiesCollectionsViewModel;
import ga.ap;
import ga.l;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import t6.S3;
import vf.ad;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/about/TrophiesCollectionsFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class TrophiesCollectionsFragment extends l {
    public C0058p e;

    /* renamed from: f, reason: collision with root package name */
    public final ab f12110f;

    public TrophiesCollectionsFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new s(23, new s(22, this)));
        this.f12110f = new ab(u.alpha.bravo(TrophiesCollectionsViewModel.class), new ga.ab(alpha, 2), new f(11, this, alpha), new ga.ab(alpha, 3));
    }

    public static final void quebec(ShapeableImageView shapeableImageView, String str) {
        if (str != null && !StringsKt.gray(str)) {
            ((j) b.foxtrot(shapeableImageView).quebec(str).bravo()).azure(shapeableImageView);
        } else {
            shapeableImageView.setImageResource(R.drawable.img_place_holder);
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_trophies_collections, viewGroup, false);
        int i4 = R.id.activeRow;
        if (((LinearLayout) S3.bravo(R.id.activeRow, inflate)) != null) {
            i4 = R.id.btnActiveShowAll;
            if (((LinearLayout) S3.bravo(R.id.btnActiveShowAll, inflate)) != null) {
                i4 = R.id.btnCompletedShowAll;
                if (((LinearLayout) S3.bravo(R.id.btnCompletedShowAll, inflate)) != null) {
                    i4 = R.id.cardActive;
                    MaterialCardView materialCardView = (MaterialCardView) S3.bravo(R.id.cardActive, inflate);
                    if (materialCardView != null) {
                        i4 = R.id.cardCompleted;
                        MaterialCardView materialCardView2 = (MaterialCardView) S3.bravo(R.id.cardCompleted, inflate);
                        if (materialCardView2 != null) {
                            i4 = R.id.completedStack;
                            if (((FrameLayout) S3.bravo(R.id.completedStack, inflate)) != null) {
                                i4 = R.id.i_trophy_1;
                                View bravo = S3.bravo(R.id.i_trophy_1, inflate);
                                if (bravo != null) {
                                    I alpha = I.alpha(bravo);
                                    i4 = R.id.i_trophy_2;
                                    View bravo2 = S3.bravo(R.id.i_trophy_2, inflate);
                                    if (bravo2 != null) {
                                        I alpha2 = I.alpha(bravo2);
                                        i4 = R.id.i_trophy_3;
                                        View bravo3 = S3.bravo(R.id.i_trophy_3, inflate);
                                        if (bravo3 != null) {
                                            I alpha3 = I.alpha(bravo3);
                                            i4 = R.id.iv_active_next;
                                            if (((ImageView) S3.bravo(R.id.iv_active_next, inflate)) != null) {
                                                i4 = R.id.iv_completed_next;
                                                if (((ImageView) S3.bravo(R.id.iv_completed_next, inflate)) != null) {
                                                    i4 = R.id.ll_active_trophies;
                                                    LinearLayout linearLayout = (LinearLayout) S3.bravo(R.id.ll_active_trophies, inflate);
                                                    if (linearLayout != null) {
                                                        i4 = R.id.siv_trophy_image_1;
                                                        ShapeableImageView shapeableImageView = (ShapeableImageView) S3.bravo(R.id.siv_trophy_image_1, inflate);
                                                        if (shapeableImageView != null) {
                                                            i4 = R.id.siv_trophy_image_2;
                                                            ShapeableImageView shapeableImageView2 = (ShapeableImageView) S3.bravo(R.id.siv_trophy_image_2, inflate);
                                                            if (shapeableImageView2 != null) {
                                                                i4 = R.id.siv_trophy_image_3;
                                                                ShapeableImageView shapeableImageView3 = (ShapeableImageView) S3.bravo(R.id.siv_trophy_image_3, inflate);
                                                                if (shapeableImageView3 != null) {
                                                                    i4 = R.id.tvActiveSubtitle;
                                                                    if (((TextView) S3.bravo(R.id.tvActiveSubtitle, inflate)) != null) {
                                                                        i4 = R.id.tvActiveTitle;
                                                                        if (((TextView) S3.bravo(R.id.tvActiveTitle, inflate)) != null) {
                                                                            i4 = R.id.tvCompletedSubtitle;
                                                                            if (((TextView) S3.bravo(R.id.tvCompletedSubtitle, inflate)) != null) {
                                                                                i4 = R.id.tvCompletedTitle;
                                                                                if (((TextView) S3.bravo(R.id.tvCompletedTitle, inflate)) != null) {
                                                                                    this.e = new C0058p((ScrollView) inflate, materialCardView, materialCardView2, alpha, alpha2, alpha3, linearLayout, shapeableImageView, shapeableImageView2, shapeableImageView3);
                                                                                    return (ScrollView) romeo().bravo;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        al viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ad.zulu(T.foxtrot(viewLifecycleOwner), null, null, new ap(this, null), 3);
        oscar();
        TrophiesCollectionsViewModel trophiesCollectionsViewModel = (TrophiesCollectionsViewModel) this.f12110f.getValue();
        BaseViewModel.launchApi$default(trophiesCollectionsViewModel, null, new ka.f(trophiesCollectionsViewModel, null), 1, null);
    }

    @Override // d3.n
    public final void oscar() {
        C0058p romeo = romeo();
        final int i4 = 0;
        ((MaterialCardView) romeo.charlie).setOnClickListener(new View.OnClickListener(this) { // from class: ga.ao
            public final /* synthetic */ TrophiesCollectionsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.purple.sierra(true);
                        return;
                    default:
                        this.purple.sierra(false);
                        return;
                }
            }
        });
        C0058p romeo2 = romeo();
        final int i5 = 1;
        ((MaterialCardView) romeo2.echo).setOnClickListener(new View.OnClickListener(this) { // from class: ga.ao
            public final /* synthetic */ TrophiesCollectionsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.purple.sierra(true);
                        return;
                    default:
                        this.purple.sierra(false);
                        return;
                }
            }
        });
    }

    public final C0058p romeo() {
        C0058p c0058p = this.e;
        if (c0058p != null) {
            return c0058p;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void sierra(boolean z2) {
        int i4;
        if (z2) {
            i4 = R.string.trophy_active_title;
        } else {
            i4 = R.string.trophy_my_achievements;
        }
        String string = getString(i4);
        Intrinsics.delta(string, "getString(...)");
        a supportActionBar = kilo().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.tango(string);
        }
        r alpha = J2.f.alpha(this);
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_ACTIVE_TROPHY", z2);
        alpha.charlie(R.id.nav_trophies_list, bundle, null);
    }
}
