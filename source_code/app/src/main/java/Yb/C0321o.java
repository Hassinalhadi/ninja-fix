package Yb;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.C0564b;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x9.AbstractC3307a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/o;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: Yb.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0321o extends AbstractC3307a {

    /* renamed from: r, reason: collision with root package name */
    public final B9.ab f2431r = new B9.ab(kotlin.jvm.internal.u.alpha.bravo(AllAddressNoteViewModel.class), new C0319n(this, 0), new C0319n(this, 2), new C0319n(this, 1));

    /* renamed from: s, reason: collision with root package name */
    public final androidx.compose.runtime.ax f2432s = C0564b.zulu(Boolean.FALSE);

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(t0.A0.alpha);
        composeView.setContent(new P.d(new Ac.k(17, this), -878218426, true));
        return composeView;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        com.google.android.material.bottomsheet.l lVar;
        BottomSheetBehavior<FrameLayout> behavior;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = this.e;
        if (dialog instanceof com.google.android.material.bottomsheet.l) {
            lVar = (com.google.android.material.bottomsheet.l) dialog;
        } else {
            lVar = null;
        }
        if (lVar != null && (behavior = lVar.getBehavior()) != null) {
            behavior.sierra(3);
            behavior.C = true;
        }
    }
}
