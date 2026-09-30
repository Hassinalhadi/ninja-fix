package delivery.samurai.android.ui.about;

import N9.a;
import N9.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import ga.ac;
import ga.k;
import ga.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q3.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/about/MyAccountRouterFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class MyAccountRouterFragment extends k {
    public g e;

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_my_account_router, viewGroup, false);
        Intrinsics.delta(inflate, "inflate(...)");
        return inflate;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        ai uVar;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().black(R.id.myAccountRouterContainer) != null) {
            return;
        }
        g gVar = this.e;
        if (gVar != null) {
            if (((i) gVar).bravo(a.juliet)) {
                uVar = new ac();
            } else {
                uVar = new u();
            }
            L childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0606a c0606a = new C0606a(childFragmentManager);
            c0606a.echo(uVar, null, R.id.myAccountRouterContainer);
            c0606a.india();
            return;
        }
        Intrinsics.lima("featureFlagProvider");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
    }
}
