package delivery.samurai.android.ui.suspension;

import Aa.g;
import Aa.h;
import B9.ab;
import Cb.a;
import Jc.b;
import P.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t0.A0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/suspension/SuspensionFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class SuspensionFragment extends b {
    public final ab e;

    public SuspensionFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new g(29, new g(28, this)));
        this.e = new ab(u.alpha.bravo(SuspensionViewModel.class), new h(alpha, 24), new Aa.i(16, this, alpha), new h(alpha, 25));
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(A0.alpha);
        composeView.setContent(new d(new a(8, this, composeView), -1734646782, true));
        return composeView;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // d3.n
    public final void oscar() {
    }

    public final SuspensionViewModel quebec() {
        return (SuspensionViewModel) this.e.getValue();
    }
}
