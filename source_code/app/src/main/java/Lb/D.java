package Lb;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t0.A0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LLb/D;", "Lx9/a;", "<init>", "()V", "Lb/B", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class D extends AbstractC0224g {
    public final androidx.compose.runtime.ax A;
    public final androidx.compose.runtime.ax B;
    public final androidx.compose.runtime.ax C;

    /* renamed from: D, reason: collision with root package name */
    public final r0 f1704D;

    /* renamed from: E, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1705E;

    /* renamed from: F, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1706F;

    /* renamed from: G, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1707G;

    /* renamed from: H, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1708H;

    /* renamed from: u, reason: collision with root package name */
    public final B9.ab f1709u;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f1710v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1711w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1712x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1713y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1714z;

    public D() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C(1, new C(0, this)));
        this.f1709u = new B9.ab(kotlin.jvm.internal.u.alpha.bravo(MyAccountViewModel.class), new Aa.h(alpha, 26), new Aa.i(19, this, alpha), new Aa.h(alpha, 27));
        this.f1711w = C0564b.zulu(B.alpha);
        this.f1712x = C0564b.zulu("");
        this.f1713y = C0564b.zulu(null);
        this.f1714z = C0564b.zulu("");
        this.A = C0564b.zulu(null);
        this.B = C0564b.zulu(Boolean.FALSE);
        this.C = C0564b.zulu(null);
        this.f1704D = C0564b.xray(0L);
        this.f1705E = C0564b.zulu(null);
        this.f1706F = C0564b.zulu(null);
        this.f1707G = C0564b.zulu(null);
        this.f1708H = C0564b.zulu(null);
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4 != null) goto L15;
     */
    @Override // androidx.fragment.app.ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Intrinsics.echo(inflater, "inflater");
        androidx.compose.runtime.ax axVar = this.f1712x;
        Bundle arguments = getArguments();
        if (arguments != null && (str = arguments.getString("arg_current_value")) != null) {
            if (StringsKt.gray(str) || Intrinsics.areEqual(str, "-")) {
                str = null;
            }
        }
        str = "";
        ((t0) axVar).setValue(str);
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setBackgroundColor(0);
        composeView.setViewCompositionStrategy(A0.alpha);
        composeView.setContent(new P.d(new ay(this, 0), 1958542122, true));
        return composeView;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        amber();
    }
}
