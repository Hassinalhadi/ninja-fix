package delivery.samurai.android.ui.captainsuniforms;

import Aa.g;
import Aa.h;
import B9.ab;
import Ga.a;
import Ga.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.an;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/captainsuniforms/CaptainsUniformsFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class CaptainsUniformsFragment extends d {
    public final ab e;

    public CaptainsUniformsFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new g(19, new g(18, this)));
        this.e = new ab(u.alpha.bravo(CaptainsUniformsViewModel.class), new h(alpha, 14), new Aa.i(11, this, alpha), new h(alpha, 15));
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new P.d(new a(this, 0), 1881730577, true));
        return composeView;
    }

    @Override // androidx.fragment.app.ai
    public final void onStart() {
        k kVar;
        androidx.appcompat.app.a supportActionBar;
        super.onStart();
        an activity = getActivity();
        if (activity instanceof k) {
            kVar = (k) activity;
        } else {
            kVar = null;
        }
        if (kVar != null && (supportActionBar = kVar.getSupportActionBar()) != null) {
            supportActionBar.foxtrot();
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onStop() {
        k kVar;
        androidx.appcompat.app.a supportActionBar;
        super.onStop();
        an activity = getActivity();
        if (activity instanceof k) {
            kVar = (k) activity;
        } else {
            kVar = null;
        }
        if (kVar != null && (supportActionBar = kVar.getSupportActionBar()) != null) {
            supportActionBar.victor();
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        k kVar;
        androidx.appcompat.app.a supportActionBar;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        an activity = getActivity();
        if (activity instanceof k) {
            kVar = (k) activity;
        } else {
            kVar = null;
        }
        if (kVar != null && (supportActionBar = kVar.getSupportActionBar()) != null) {
            supportActionBar.foxtrot();
        }
    }

    @Override // d3.n
    public final void oscar() {
    }
}
