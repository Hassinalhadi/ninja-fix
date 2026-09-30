package delivery.samurai.android.ui.compose.showcase;

import Cb.ag;
import Cb.e;
import P.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.an;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/compose/showcase/ComponentShowcaseFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ComponentShowcaseFragment extends ag {
    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new d(new e(this, 0), 1020555686, true));
        return composeView;
    }

    @Override // androidx.fragment.app.ai
    public final void onStart() {
        k kVar;
        a supportActionBar;
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
        a supportActionBar;
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
        a supportActionBar;
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
