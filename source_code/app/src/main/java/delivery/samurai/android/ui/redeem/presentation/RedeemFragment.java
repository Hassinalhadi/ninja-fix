package delivery.samurai.android.ui.redeem.presentation;

import B9.ab;
import F8.q;
import S5.k;
import Xa.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.clevertap.android.sdk.inapp.fragment.a;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import g.C1718a;
import h9.aq;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import n.Y;
import nc.AbstractC2168a;
import nc.C2170c;
import nc.C2171d;
import oc.C2223f;
import t6.S3;
import vf.ad;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/redeem/presentation/RedeemFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class RedeemFragment extends AbstractC2168a {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public ab f12442f;

    /* renamed from: g, reason: collision with root package name */
    public float f12443g;

    /* renamed from: h, reason: collision with root package name */
    public C2223f f12444h;

    /* renamed from: i, reason: collision with root package name */
    public int f12445i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12446j;

    /* renamed from: k, reason: collision with root package name */
    public final C1718a f12447k;

    public RedeemFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new je.ab(21, new je.ab(20, this)));
        this.e = new ab(u.alpha.bravo(RedeemViewModel.class), new ga.ab(alpha, 16), new f(24, this, alpha), new ga.ab(alpha, 17));
        this.f12445i = -1;
        this.f12447k = new C1718a(12, this);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_redeem, viewGroup, false);
        int i4 = R.id.btn_retry_redeem;
        Button button = (Button) S3.bravo(R.id.btn_retry_redeem, inflate);
        if (button != null) {
            i4 = R.id.ll_empty_error_redeem;
            LinearLayout linearLayout = (LinearLayout) S3.bravo(R.id.ll_empty_error_redeem, inflate);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                i4 = R.id.rv_redeem;
                RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_redeem, inflate);
                if (recyclerView != null) {
                    i4 = R.id.sr_redeem;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.sr_redeem, inflate);
                    if (swipeRefreshLayout != null) {
                        i4 = R.id.tv_message_redeem;
                        TextView textView = (TextView) S3.bravo(R.id.tv_message_redeem, inflate);
                        if (textView != null) {
                            this.f12442f = new ab(constraintLayout, button, linearLayout, recyclerView, swipeRefreshLayout, textView);
                            Intrinsics.delta(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        float f5;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            f5 = arguments.getFloat("BALANCE");
        } else {
            f5 = 0.0f;
        }
        this.f12443g = f5;
        C2223f c2223f = new C2223f(f5, new Y(3, this));
        this.f12444h = c2223f;
        ab abVar = this.f12442f;
        if (abVar != null) {
            ((RecyclerView) abVar.white).setAdapter(c2223f);
            oscar();
            ad.zulu(T.foxtrot(this), null, null, new C2171d(this, null), 3);
            ad.zulu(T.foxtrot(this), null, null, new C2170c(this, null), 3);
            ab abVar2 = this.f12442f;
            if (abVar2 != null) {
                RecyclerView recyclerView = (RecyclerView) abVar2.white;
                if (recyclerView.getAdapter() != null) {
                    if (recyclerView.getLayoutManager() != null) {
                        new k(recyclerView, this.f12447k, 2, false, new q(recyclerView.getLayoutManager()));
                        return;
                    }
                    throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                }
                throw new IllegalStateException("Adapter needs to be set!");
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
        ab abVar = this.f12442f;
        if (abVar != null) {
            ((SwipeRefreshLayout) abVar.teal).setOnRefreshListener(new aq(7, this));
            ab abVar2 = this.f12442f;
            if (abVar2 != null) {
                ((Button) abVar2.purple).setOnClickListener(new a(10, this));
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final RedeemViewModel quebec() {
        return (RedeemViewModel) this.e.getValue();
    }
}
