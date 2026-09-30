package delivery.samurai.android.ui.about;

import B9.K;
import B9.ab;
import Dc.t;
import Qb.l;
import Xa.f;
import Xe.s;
import Y1.a;
import Y1.aa;
import Y1.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.P0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Envelop;
import com.app.network.network.models.UserInfo;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.viewmodel.MoreViewModel;
import ga.h;
import ga.m;
import ga.n;
import ga.o;
import ka.C2023a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import t6.S3;
import vf.ad;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/about/MoreFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class MoreFragment extends h {
    public K e;

    /* renamed from: f, reason: collision with root package name */
    public final ab f12109f;

    public MoreFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new s(18, new s(17, this)));
        this.f12109f = new ab(u.alpha.bravo(MoreViewModel.class), new l(alpha, 26), new f(8, this, alpha), new l(alpha, 27));
    }

    public static final void quebec(ShapeableImageView shapeableImageView, String str) {
        if (str != null && !StringsKt.gray(str)) {
            Intrinsics.checkNotNull(((j) b.foxtrot(shapeableImageView).quebec(str).bravo()).azure(shapeableImageView));
        } else {
            shapeableImageView.setImageResource(R.drawable.img_place_holder);
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.more_fragment, viewGroup, false);
        int i4 = R.id.btnAboutUs;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnAboutUs, inflate);
        if (materialButton != null) {
            i4 = R.id.btnAgreement;
            MaterialButton materialButton2 = (MaterialButton) S3.bravo(R.id.btnAgreement, inflate);
            if (materialButton2 != null) {
                i4 = R.id.btnCaptainsUniforms;
                MaterialButton materialButton3 = (MaterialButton) S3.bravo(R.id.btnCaptainsUniforms, inflate);
                if (materialButton3 != null) {
                    i4 = R.id.btnComponentShowcase;
                    MaterialButton materialButton4 = (MaterialButton) S3.bravo(R.id.btnComponentShowcase, inflate);
                    if (materialButton4 != null) {
                        i4 = R.id.btnFaq;
                        MaterialButton materialButton5 = (MaterialButton) S3.bravo(R.id.btnFaq, inflate);
                        if (materialButton5 != null) {
                            i4 = R.id.btnMyAccount;
                            MaterialButton materialButton6 = (MaterialButton) S3.bravo(R.id.btnMyAccount, inflate);
                            if (materialButton6 != null) {
                                i4 = R.id.btnNinjaStore;
                                MaterialButton materialButton7 = (MaterialButton) S3.bravo(R.id.btnNinjaStore, inflate);
                                if (materialButton7 != null) {
                                    i4 = R.id.btnOrderHistory;
                                    MaterialButton materialButton8 = (MaterialButton) S3.bravo(R.id.btnOrderHistory, inflate);
                                    if (materialButton8 != null) {
                                        i4 = R.id.btnPrivacyPolicy;
                                        MaterialButton materialButton9 = (MaterialButton) S3.bravo(R.id.btnPrivacyPolicy, inflate);
                                        if (materialButton9 != null) {
                                            i4 = R.id.btnReferralProgram;
                                            MaterialButton materialButton10 = (MaterialButton) S3.bravo(R.id.btnReferralProgram, inflate);
                                            if (materialButton10 != null) {
                                                i4 = R.id.btnScores;
                                                MaterialButton materialButton11 = (MaterialButton) S3.bravo(R.id.btnScores, inflate);
                                                if (materialButton11 != null) {
                                                    i4 = R.id.btnTraining;
                                                    MaterialButton materialButton12 = (MaterialButton) S3.bravo(R.id.btnTraining, inflate);
                                                    if (materialButton12 != null) {
                                                        i4 = R.id.btnWithdrawHistory;
                                                        MaterialButton materialButton13 = (MaterialButton) S3.bravo(R.id.btnWithdrawHistory, inflate);
                                                        if (materialButton13 != null) {
                                                            i4 = R.id.cl_trophy_widget;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) S3.bravo(R.id.cl_trophy_widget, inflate);
                                                            if (constraintLayout != null) {
                                                                i4 = R.id.img1;
                                                                ShapeableImageView shapeableImageView = (ShapeableImageView) S3.bravo(R.id.img1, inflate);
                                                                if (shapeableImageView != null) {
                                                                    i4 = R.id.img2;
                                                                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) S3.bravo(R.id.img2, inflate);
                                                                    if (shapeableImageView2 != null) {
                                                                        i4 = R.id.img3;
                                                                        ShapeableImageView shapeableImageView3 = (ShapeableImageView) S3.bravo(R.id.img3, inflate);
                                                                        if (shapeableImageView3 != null) {
                                                                            i4 = R.id.iv_next;
                                                                            if (((ImageView) S3.bravo(R.id.iv_next, inflate)) != null) {
                                                                                i4 = R.id.medalStack;
                                                                                if (((FrameLayout) S3.bravo(R.id.medalStack, inflate)) != null) {
                                                                                    i4 = R.id.showAll;
                                                                                    if (((LinearLayout) S3.bravo(R.id.showAll, inflate)) != null) {
                                                                                        i4 = R.id.showAllText;
                                                                                        if (((TextView) S3.bravo(R.id.showAllText, inflate)) != null) {
                                                                                            i4 = R.id.titleRow;
                                                                                            if (((LinearLayout) S3.bravo(R.id.titleRow, inflate)) != null) {
                                                                                                i4 = R.id.trophyCard;
                                                                                                MaterialCardView materialCardView = (MaterialCardView) S3.bravo(R.id.trophyCard, inflate);
                                                                                                if (materialCardView != null) {
                                                                                                    i4 = R.id.trophyNewChip;
                                                                                                    if (((ConstraintLayout) S3.bravo(R.id.trophyNewChip, inflate)) != null) {
                                                                                                        i4 = R.id.trophySubtitle;
                                                                                                        if (((TextView) S3.bravo(R.id.trophySubtitle, inflate)) != null) {
                                                                                                            i4 = R.id.trophyTitle;
                                                                                                            if (((TextView) S3.bravo(R.id.trophyTitle, inflate)) != null) {
                                                                                                                i4 = R.id.versionInfo;
                                                                                                                TextView textView = (TextView) S3.bravo(R.id.versionInfo, inflate);
                                                                                                                if (textView != null) {
                                                                                                                    this.e = new K((NestedScrollView) inflate, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, materialButton7, materialButton8, materialButton9, materialButton10, materialButton11, materialButton12, materialButton13, constraintLayout, shapeableImageView, shapeableImageView2, shapeableImageView3, materialCardView, textView);
                                                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) sierra().alpha;
                                                                                                                    Intrinsics.delta(nestedScrollView, "getRoot(...)");
                                                                                                                    return nestedScrollView;
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
        K sierra = sierra();
        ((TextView) sierra.tango).setText(P0.crimson(getString(R.string.app_name), "\nVersion 568(1.12.131)"));
        ((MaterialButton) sierra().echo).setVisibility(8);
        K sierra2 = sierra();
        ((MaterialButton) sierra2.echo).setOnClickListener(new n(this, 3));
        MoreViewModel moreViewModel = (MoreViewModel) this.f12109f.getValue();
        BaseViewModel.launchApi$default(moreViewModel, null, new C2023a(moreViewModel, null), 1, null);
        ad.zulu(T.foxtrot(this), null, null, new o(this, null), 3);
        kilo().oscar().observe(getViewLifecycleOwner(), new t(15, new m(this, 0)));
    }

    @Override // d3.n
    public final void oscar() {
        int i4;
        K sierra = sierra();
        ((MaterialButton) sierra.golf).setOnClickListener(new n(this, 5));
        K sierra2 = sierra();
        ((MaterialButton) sierra2.charlie).setOnClickListener(new n(this, 6));
        K sierra3 = sierra();
        ((MaterialCardView) sierra3.sierra).setOnClickListener(new n(this, 7));
        K sierra4 = sierra();
        ((MaterialButton) sierra4.india).setOnClickListener(new n(this, 8));
        K sierra5 = sierra();
        ((MaterialButton) sierra5.november).setOnClickListener(new n(this, 9));
        K sierra6 = sierra();
        ((MaterialButton) sierra6.kilo).setOnClickListener(new n(this, 10));
        K sierra7 = sierra();
        ((MaterialButton) sierra7.lima).setOnClickListener(new n(this, 11));
        K sierra8 = sierra();
        ((MaterialButton) sierra8.delta).setOnClickListener(new n(this, 12));
        K sierra9 = sierra();
        ((MaterialButton) sierra9.juliet).setOnClickListener(new n(this, 13));
        K sierra10 = sierra();
        ((MaterialButton) sierra10.bravo).setOnClickListener(new n(this, 0));
        K sierra11 = sierra();
        ((MaterialButton) sierra11.mike).setOnClickListener(new n(this, 1));
        K sierra12 = sierra();
        ((MaterialButton) sierra12.foxtrot).setOnClickListener(new n(this, 2));
        String romeo = romeo();
        K sierra13 = sierra();
        if (romeo != null && !StringsKt.gray(romeo)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        ((MaterialButton) sierra13.hotel).setVisibility(i4);
        K sierra14 = sierra();
        ((MaterialButton) sierra14.hotel).setOnClickListener(new n(this, 4));
    }

    public final String romeo() {
        Envelop envelop;
        String storeUrl;
        UserInfo userInfo = (UserInfo) kilo().oscar().getValue();
        if (userInfo != null) {
            envelop = userInfo.getEnvelop();
        } else {
            envelop = null;
        }
        if (envelop == null || (storeUrl = envelop.getStoreUrl()) == null || StringsKt.gray(storeUrl)) {
            return null;
        }
        return storeUrl;
    }

    public final K sierra() {
        K k6 = this.e;
        if (k6 != null) {
            return k6;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void tango(int i4) {
        r alpha = J2.f.alpha(this);
        aa foxtrot = alpha.bravo.foxtrot();
        if (foxtrot == null || foxtrot.purple.charlie != R.id.nav_more) {
            alpha = null;
        }
        if (alpha != null) {
            alpha.charlie(i4, null, null);
        }
    }

    public final void uniform(a aVar) {
        r alpha = J2.f.alpha(this);
        aa foxtrot = alpha.bravo.foxtrot();
        if (foxtrot == null || foxtrot.purple.charlie != R.id.nav_more) {
            alpha = null;
        }
        if (alpha != null) {
            alpha.charlie(aVar.alpha, aVar.bravo, null);
        }
    }
}
