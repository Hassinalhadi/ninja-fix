package delivery.samurai.android.ui.wallet;

import B9.ab;
import Lb.C;
import P.d;
import Qb.l;
import Tc.a;
import Tc.b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t0.A0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/wallet/WalletFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class WalletFragment extends a {
    public final ab e;

    public WalletFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new C(14, new C(13, this)));
        this.e = new ab(u.alpha.bravo(WalletViewModel.class), new l(alpha, 6), new Aa.i(24, this, alpha), new l(alpha, 7));
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(A0.alpha);
        composeView.setContent(new d(new b(this, 0), 1954009574, true));
        return composeView;
    }

    @Override // d3.n
    public final void oscar() {
    }
}
