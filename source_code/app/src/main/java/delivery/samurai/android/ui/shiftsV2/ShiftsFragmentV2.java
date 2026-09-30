package delivery.samurai.android.ui.shiftsV2;

import Aa.g;
import Aa.h;
import B9.ab;
import Dc.f;
import Dc.n;
import Dc.p;
import Dc.t;
import Dc.v;
import P.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.ComposeView;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/shiftsV2/ShiftsFragmentV2;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ShiftsFragmentV2 extends f {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public final ab f12480f;

    /* renamed from: g, reason: collision with root package name */
    public long f12481g;

    /* renamed from: h, reason: collision with root package name */
    public int f12482h;

    /* renamed from: i, reason: collision with root package name */
    public final ax f12483i;

    /* renamed from: j, reason: collision with root package name */
    public final ax f12484j;

    /* renamed from: k, reason: collision with root package name */
    public final ax f12485k;

    /* renamed from: l, reason: collision with root package name */
    public final ax f12486l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12487m;

    public ShiftsFragmentV2() {
        v vVar = new v(this, 0);
        i iVar = i.purple;
        Lazy alpha = LazyKt.alpha(iVar, new g(10, vVar));
        kotlin.jvm.internal.v vVar2 = u.alpha;
        this.e = new ab(vVar2.bravo(ShiftsViewModelV2.class), new h(alpha, 8), new Dc.u(this, alpha, 1), new h(alpha, 9));
        Lazy alpha2 = LazyKt.alpha(iVar, new g(11, new v(this, 1)));
        this.f12480f = new ab(vVar2.bravo(ShiftSummariesViewModelV2.class), new h(alpha2, 10), new Dc.u(this, alpha2, 0), new h(alpha2, 11));
        this.f12483i = C0564b.zulu(CollectionsKt.emptyList());
        Boolean bool = Boolean.FALSE;
        this.f12484j = C0564b.zulu(bool);
        this.f12485k = C0564b.zulu(bool);
        this.f12486l = C0564b.zulu(null);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new d(new p(this, composeView, 0), 1897458002, true));
        return composeView;
    }

    @Override // androidx.fragment.app.ai
    public final void onPause() {
        super.onPause();
        this.f12487m = true;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        if (this.f12487m) {
            romeo().alpha(true);
            quebec().alpha(true);
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        romeo().november.observe(getViewLifecycleOwner(), new t(0, new n(this, 0)));
        romeo().oscar.observe(getViewLifecycleOwner(), new t(0, new n(this, 3)));
    }

    @Override // d3.n
    public final void oscar() {
    }

    public final ShiftSummariesViewModelV2 quebec() {
        return (ShiftSummariesViewModelV2) this.f12480f.getValue();
    }

    public final ShiftsViewModelV2 romeo() {
        return (ShiftsViewModelV2) this.e.getValue();
    }
}
