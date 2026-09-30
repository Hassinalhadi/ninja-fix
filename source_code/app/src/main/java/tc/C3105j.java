package tc;

import B9.ab;
import Jb.d0;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import bz.af;
import com.app.base.BaseViewModel;
import d3.C1585a;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.reposition.presentation.RepositionViewModel;
import ga.as;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qe.C2474j;
import t0.A0;
import yf.N;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Ltc/j;", "Lx9/c;", "<init>", "()V", "Ltc/q;", "state", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: tc.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3105j extends AbstractC3096a {

    /* renamed from: t, reason: collision with root package name */
    public long f13959t;

    /* renamed from: u, reason: collision with root package name */
    public L0.e f13960u;

    /* renamed from: v, reason: collision with root package name */
    public C1585a f13961v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13962w = true;

    /* renamed from: x, reason: collision with root package name */
    public final ab f13963x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13964y;

    public C3105j() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C2474j(11, new C2474j(10, this)));
        this.f13963x = new ab(kotlin.jvm.internal.u.alpha.bravo(RepositionViewModel.class), new ga.ab(alpha, 24), new qa.j(9, this, alpha), new ga.ab(alpha, 25));
    }

    public final RepositionViewModel azure() {
        return (RepositionViewModel) this.f13963x.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        Dialog mike = super.mike(bundle);
        mike.setCanceledOnTouchOutside(false);
        mike.setOnKeyListener(new d0(3));
        return mike;
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            view.post(new as(15, this));
        }
        xray();
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        oscar(false);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(A0.alpha);
        composeView.setContent(new P.d(new af(21, this), 72708183, true));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        L0.e eVar = this.f13960u;
        if (eVar != null) {
            eVar.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        Dialog dialog2 = this.e;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14108p) {
            return;
        }
        RepositionViewModel azure = azure();
        long j5 = this.f13959t;
        C3111p c3111p = C3111p.alpha;
        N n5 = azure.bravo;
        n5.getClass();
        n5.juliet(null, c3111p);
        BaseViewModel.launchApi$default(azure, null, new C3114s(azure, j5, null), 1, null);
        BaseViewModel.launchApi$default(azure(), null, new C3103h(this, null), 1, null);
        BaseViewModel.launchApi$default(azure(), null, new C3104i(this, null), 1, null);
    }

    @Override // x9.AbstractC3309c
    /* renamed from: uniform, reason: from getter */
    public final boolean getF13962w() {
        return this.f13962w;
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
    }
}
