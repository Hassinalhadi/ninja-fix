package Lb;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import com.app.network.network.models.Attribute;
import com.app.network.network.models.AttributeGroup;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import e3.InterfaceC1627a;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.A0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LLb/p;", "Lx9/a;", "<init>", "()V", "Lb/n", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: Lb.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0233p extends AbstractC0223f {

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1627a f1809u;

    /* renamed from: w, reason: collision with root package name */
    public ga.v f1811w;

    /* renamed from: v, reason: collision with root package name */
    public final B9.ab f1810v = new B9.ab(kotlin.jvm.internal.u.alpha.bravo(HomeViewModelV2.class), new C0232o(this, 0), new C0232o(this, 2), new C0232o(this, 1));

    /* renamed from: x, reason: collision with root package name */
    public final com.google.gson.l f1812x = new com.google.gson.l();

    /* renamed from: y, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1813y = C0564b.zulu(EnumC0231n.alpha);

    /* renamed from: z, reason: collision with root package name */
    public final S.t f1814z = new S.t();
    public final S.t A = new S.t();
    public final androidx.compose.runtime.ax B = C0564b.zulu("");
    public final p0 C = C0564b.whiskey(3);

    /* renamed from: D, reason: collision with root package name */
    public final r0 f1800D = C0564b.xray(0);

    /* renamed from: E, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1801E = C0564b.zulu(Boolean.FALSE);

    /* renamed from: F, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1802F = C0564b.zulu(null);

    /* renamed from: G, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1803G = C0564b.zulu("");

    /* renamed from: H, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1804H = C0564b.zulu(null);

    /* renamed from: I, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1805I = C0564b.zulu(null);

    /* renamed from: J, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1806J = C0564b.zulu(null);

    /* renamed from: K, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1807K = C0564b.zulu(null);

    /* renamed from: L, reason: collision with root package name */
    public final Lazy f1808L = LazyKt.lazy(new C0227j(this, 2));

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
        composeView.setViewCompositionStrategy(A0.alpha);
        AttributeGroup attributeGroup = (AttributeGroup) this.f1808L.getValue();
        if (attributeGroup == null) {
            kilo();
            return composeView;
        }
        List<Attribute> attributes = attributeGroup.getAttributes();
        if (attributes != null) {
            Iterator<T> it = attributes.iterator();
            while (it.hasNext()) {
                String key = ((Attribute) it.next()).getKey();
                if (key == null) {
                    key = "";
                }
                this.f1814z.put(key, "");
            }
        }
        composeView.setContent(new P.d(new C0229l(this, attributeGroup, 0), 2085325866, true));
        return composeView;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onResume() {
        View view;
        super.onResume();
        if (((t0) this.f1813y).getValue() == EnumC0231n.purple && (view = getView()) != null) {
            view.postDelayed(new RunnableC0226i(this, 1), 300L);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(36);
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        com.google.android.material.bottomsheet.l lVar;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = this.e;
        if (dialog instanceof com.google.android.material.bottomsheet.l) {
            lVar = (com.google.android.material.bottomsheet.l) dialog;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            lVar.getBehavior().sierra(3);
            lVar.getBehavior().C = true;
            Window window = lVar.getWindow();
            if (window != null) {
                window.setSoftInputMode(37);
            }
        }
    }
}
