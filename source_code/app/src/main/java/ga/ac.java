package ga;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.T;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;
import t0.A0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lga/ac;", "Ld3/n;", "<init>", "()V", "Lga/f;", "state", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ac extends j {
    public q3.g e;

    /* renamed from: f, reason: collision with root package name */
    public final B9.ab f12673f;

    /* renamed from: g, reason: collision with root package name */
    public ComposeView f12674g;

    /* renamed from: h, reason: collision with root package name */
    public final B9.ab f12675h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12676i;

    /* renamed from: j, reason: collision with root package name */
    public String f12677j;

    public ac() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Xe.s(21, new aa(this, 3)));
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        this.f12673f = new B9.ab(vVar.bravo(MyAccountViewModel.class), new ab(alpha, 0), new Xa.f(10, this, alpha), new ab(alpha, 1));
        this.f12675h = new B9.ab(vVar.bravo(HomeViewModelV2.class), new aa(this, 0), new aa(this, 2), new aa(this, 1));
    }

    public static String romeo(String str) {
        String obj;
        if (str != null && (obj = StringsKt.b(str).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
            return "-";
        }
        return "-";
    }

    @Override // ga.j, d3.n, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        Intrinsics.echo(context, "context");
        super.onAttach(context);
        ImageButton imageButton = (ImageButton) requireActivity().findViewById(R.id.actionQrCode);
        if (imageButton != null) {
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(7, this));
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(A0.alpha);
        this.f12674g = composeView;
        return composeView;
    }

    @Override // androidx.fragment.app.ai
    public final void onDetach() {
        super.onDetach();
        ImageButton imageButton = (ImageButton) requireActivity().findViewById(R.id.actionQrCode);
        if (imageButton != null) {
            imageButton.setVisibility(8);
            imageButton.setOnClickListener(null);
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r5v14, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        int i4 = 3;
        int i5 = 2;
        int i10 = 0;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        q3.g gVar = this.e;
        if (gVar != null) {
            this.f12676i = ((N9.i) gVar).bravo(N9.a.foxtrot);
            MyAccountViewModel quebec = quebec();
            boolean z2 = this.f12676i;
            t0 t0Var = (t0) quebec.bravo;
            f updateState = (f) t0Var.getValue();
            Intrinsics.echo(updateState, "$this$updateState");
            t0Var.setValue(f.alpha(updateState, null, null, null, null, null, z2, null, null, null, false, false, 2015));
            ComposeView composeView = this.f12674g;
            if (composeView != null) {
                composeView.setContent(new P.d(new w(this, i10), 289131309, true));
                quebec().alpha().observe(getViewLifecycleOwner(), new Dc.t(17, new v(this, 4)));
                Context context = getContext();
                if (context != null) {
                    AtomicInteger atomicInteger = L9.d.alpha;
                    if (L9.k.golf((ContextWrapper) context).getBoolean("isNaqlBlocked", false)) {
                        MyAccountViewModel quebec2 = quebec();
                        ?? auVar = new au(new C2492a(2, "loading"));
                        BaseViewModel.launchApi$default(quebec2, null, new aj(quebec2, auVar, null), 1, null);
                        auVar.observe(getViewLifecycleOwner(), new Dc.t(17, new v(this, i5)));
                        MyAccountViewModel quebec3 = quebec();
                        ?? auVar2 = new au(new C2492a(2, "loading"));
                        BaseViewModel.launchApi$default(quebec3, null, new ah(quebec3, auVar2, null), 1, null);
                        auVar2.observe(getViewLifecycleOwner(), new Dc.t(17, new v(this, i4)));
                        androidx.lifecycle.al viewLifecycleOwner = getViewLifecycleOwner();
                        Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        vf.ad.zulu(T.foxtrot(viewLifecycleOwner), null, null, new z(this, null), 3);
                        return;
                    }
                }
                quebec().charlie(null);
                MyAccountViewModel quebec32 = quebec();
                ?? auVar22 = new au(new C2492a(2, "loading"));
                BaseViewModel.launchApi$default(quebec32, null, new ah(quebec32, auVar22, null), 1, null);
                auVar22.observe(getViewLifecycleOwner(), new Dc.t(17, new v(this, i4)));
                androidx.lifecycle.al viewLifecycleOwner2 = getViewLifecycleOwner();
                Intrinsics.delta(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                vf.ad.zulu(T.foxtrot(viewLifecycleOwner2), null, null, new z(this, null), 3);
                return;
            }
            Intrinsics.lima("composeView");
            throw null;
        }
        Intrinsics.lima("featureFlagProvider");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
        kilo().oscar().observe(getViewLifecycleOwner(), new Dc.t(17, new v(this, 1)));
    }

    public final MyAccountViewModel quebec() {
        return (MyAccountViewModel) this.f12673f.getValue();
    }
}
