package delivery.samurai.android.ui.referralProgram;

import B9.ab;
import Hb.b;
import Xa.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.au;
import av.ao;
import com.app.base.BaseViewModel;
import com.clevertap.android.sdk.inapp.fragment.a;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.home.HomeViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import n.Y;
import pc.AbstractC2300a;
import pc.C2301b;
import r3.C2492a;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/referralProgram/ReferYourFriendFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ReferYourFriendFragment extends AbstractC2300a {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public ao f12448f;

    public ReferYourFriendFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new je.ab(24, new je.ab(23, this)));
        this.e = new ab(u.alpha.bravo(HomeViewModel.class), new ga.ab(alpha, 18), new f(29, this, alpha), new ga.ab(alpha, 19));
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_refer_your_friend, viewGroup, false);
        int i4 = R.id.btnCopy;
        TextView textView = (TextView) S3.bravo(R.id.btnCopy, inflate);
        if (textView != null) {
            i4 = R.id.btnShareReferralLink;
            MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnShareReferralLink, inflate);
            if (materialButton != null) {
                i4 = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) S3.bravo(R.id.container, inflate);
                if (constraintLayout != null) {
                    i4 = R.id.tvCode;
                    TextView textView2 = (TextView) S3.bravo(R.id.tvCode, inflate);
                    if (textView2 != null) {
                        i4 = R.id.tvShareMessage;
                        TextView textView3 = (TextView) S3.bravo(R.id.tvShareMessage, inflate);
                        if (textView3 != null) {
                            this.f12448f = new ao((FrameLayout) inflate, textView, materialButton, constraintLayout, textView2, textView3);
                            return (FrameLayout) quebec().alpha;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        HomeViewModel homeViewModel = (HomeViewModel) this.e.getValue();
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(homeViewModel, null, new b(homeViewModel, auVar, null), 1, null);
        auVar.observe(getViewLifecycleOwner(), new C2301b(0, new Y(7, this)));
    }

    @Override // d3.n
    public final void oscar() {
        ao quebec = quebec();
        ((TextView) quebec.purple).setOnClickListener(new a(13, this));
    }

    public final ao quebec() {
        ao aoVar = this.f12448f;
        if (aoVar != null) {
            return aoVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
