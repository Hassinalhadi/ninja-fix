package delivery.samurai.android.ui.points.presentation;

import B9.ab;
import Ca.c;
import Cf.e;
import V1.a;
import Xa.f;
import Y1.aa;
import Y1.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RunnableC0643m;
import androidx.lifecycle.T;
import androidx.lifecycle.al;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import g.C1718a;
import h9.aq;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import lc.AbstractC2064a;
import lc.d;
import lc.h;
import lc.j;
import lc.l;
import t6.S3;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/points/presentation/PointsFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class PointsFragment extends AbstractC2064a {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public i1 f12435f;

    /* renamed from: g, reason: collision with root package name */
    public final c f12436g;

    /* renamed from: h, reason: collision with root package name */
    public int f12437h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12438i;

    /* renamed from: j, reason: collision with root package name */
    public float f12439j;

    /* renamed from: k, reason: collision with root package name */
    public List f12440k;

    /* renamed from: l, reason: collision with root package name */
    public final C1718a f12441l;

    public PointsFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new je.ab(17, new je.ab(16, this)));
        this.e = new ab(u.alpha.bravo(PointsViewModel.class), new ga.ab(alpha, 12), new f(21, this, alpha), new ga.ab(alpha, 13));
        this.f12436g = new c(16);
        this.f12441l = new C1718a(10, this);
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_points, viewGroup, false);
        int i4 = R.id.abl_points;
        if (((AppBarLayout) S3.bravo(R.id.abl_points, inflate)) != null) {
            i4 = R.id.btn_info;
            ImageView imageView = (ImageView) S3.bravo(R.id.btn_info, inflate);
            if (imageView != null) {
                i4 = R.id.btn_redeem;
                MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btn_redeem, inflate);
                if (materialButton != null) {
                    i4 = R.id.ll_empty_error_transactions;
                    LinearLayout linearLayout = (LinearLayout) S3.bravo(R.id.ll_empty_error_transactions, inflate);
                    if (linearLayout != null) {
                        i4 = R.id.rv_transactions;
                        RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_transactions, inflate);
                        if (recyclerView != null) {
                            i4 = R.id.sr_transaction;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.sr_transaction, inflate);
                            if (swipeRefreshLayout != null) {
                                i4 = R.id.tv_balance;
                                TextView textView = (TextView) S3.bravo(R.id.tv_balance, inflate);
                                if (textView != null) {
                                    i4 = R.id.tv_label;
                                    if (((TextView) S3.bravo(R.id.tv_label, inflate)) != null) {
                                        i4 = R.id.tv_message_transactions;
                                        TextView textView2 = (TextView) S3.bravo(R.id.tv_message_transactions, inflate);
                                        if (textView2 != null) {
                                            i4 = R.id.tv_points;
                                            if (((TextView) S3.bravo(R.id.tv_points, inflate)) != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                ?? obj = new Object();
                                                obj.bravo = imageView;
                                                obj.alpha = materialButton;
                                                obj.delta = linearLayout;
                                                obj.echo = recyclerView;
                                                obj.foxtrot = swipeRefreshLayout;
                                                obj.charlie = textView;
                                                obj.golf = textView2;
                                                this.f12435f = obj;
                                                Intrinsics.delta(constraintLayout, "getRoot(...)");
                                                return constraintLayout;
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
        i1 i1Var = this.f12435f;
        if (i1Var != null) {
            ((RecyclerView) i1Var.echo).setAdapter(this.f12436g);
            al viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ad.zulu(T.foxtrot(viewLifecycleOwner), null, null, new h(this, null), 3);
            al viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.delta(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            ad.zulu(T.foxtrot(viewLifecycleOwner2), null, null, new lc.f(this, null), 3);
            al viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.delta(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            ad.zulu(T.foxtrot(viewLifecycleOwner3), null, null, new d(this, null), 3);
            oscar();
            i1 i1Var2 = this.f12435f;
            if (i1Var2 != null) {
                ((RecyclerView) i1Var2.echo).post(new RunnableC0643m(25, this, view));
                PointsViewModel quebec = quebec();
                a hotel = T.hotel(quebec);
                e eVar = ao.alpha;
                Cf.d dVar = Cf.d.purple;
                ad.zulu(hotel, dVar, null, new j(quebec, null), 2);
                PointsViewModel quebec2 = quebec();
                ad.zulu(T.hotel(quebec2), dVar, null, new l(quebec2, null), 2);
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
        i1 i1Var = this.f12435f;
        if (i1Var != null) {
            ((SwipeRefreshLayout) i1Var.foxtrot).setOnRefreshListener(new aq(5, this));
            final int i4 = 0;
            ((ImageView) i1Var.bravo).setOnClickListener(new View.OnClickListener(this) { // from class: lc.b
                public final /* synthetic */ PointsFragment purple;

                {
                    this.purple = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            PointsFragment pointsFragment = this.purple;
                            List list = pointsFragment.f12440k;
                            if (list != null) {
                                mc.c cVar = new mc.c();
                                cVar.f12971u = list;
                                cVar.f14101q = true;
                                cVar.romeo(pointsFragment.getChildFragmentManager(), null);
                                return;
                            }
                            return;
                        default:
                            PointsFragment pointsFragment2 = this.purple;
                            pointsFragment2.getClass();
                            r alpha = B7.b.alpha(pointsFragment2);
                            aa foxtrot = alpha.bravo.foxtrot();
                            if (foxtrot == null || foxtrot.purple.charlie != R.id.nav_points) {
                                alpha = null;
                            }
                            if (alpha != null) {
                                Bundle bundle = new Bundle();
                                bundle.putFloat("BALANCE", pointsFragment2.f12439j);
                                alpha.charlie(R.id.nav_redeem, bundle, null);
                                return;
                            }
                            return;
                    }
                }
            });
            final int i5 = 1;
            ((MaterialButton) i1Var.alpha).setOnClickListener(new View.OnClickListener(this) { // from class: lc.b
                public final /* synthetic */ PointsFragment purple;

                {
                    this.purple = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            PointsFragment pointsFragment = this.purple;
                            List list = pointsFragment.f12440k;
                            if (list != null) {
                                mc.c cVar = new mc.c();
                                cVar.f12971u = list;
                                cVar.f14101q = true;
                                cVar.romeo(pointsFragment.getChildFragmentManager(), null);
                                return;
                            }
                            return;
                        default:
                            PointsFragment pointsFragment2 = this.purple;
                            pointsFragment2.getClass();
                            r alpha = B7.b.alpha(pointsFragment2);
                            aa foxtrot = alpha.bravo.foxtrot();
                            if (foxtrot == null || foxtrot.purple.charlie != R.id.nav_points) {
                                alpha = null;
                            }
                            if (alpha != null) {
                                Bundle bundle = new Bundle();
                                bundle.putFloat("BALANCE", pointsFragment2.f12439j);
                                alpha.charlie(R.id.nav_redeem, bundle, null);
                                return;
                            }
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final PointsViewModel quebec() {
        return (PointsViewModel) this.e.getValue();
    }

    public final void romeo(String str) {
        i1 i1Var = this.f12435f;
        if (i1Var != null) {
            ((RecyclerView) i1Var.echo).setVisibility(8);
            ((LinearLayout) i1Var.delta).setVisibility(0);
            ((TextView) i1Var.golf).setText(str);
            ((SwipeRefreshLayout) i1Var.foxtrot).setRefreshing(false);
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
