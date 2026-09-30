package Jb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.ConnectionDiagnosticsViewModelV2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3070v2;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJb/x;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: Jb.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0215x extends com.google.android.material.bottomsheet.m implements GeneratedComponentManagerHolder {

    /* renamed from: k, reason: collision with root package name */
    public ContextWrapper f1659k;

    /* renamed from: m, reason: collision with root package name */
    public volatile FragmentComponentManager f1661m;

    /* renamed from: p, reason: collision with root package name */
    public J2.i f1664p;

    /* renamed from: q, reason: collision with root package name */
    public final B9.ab f1665q;

    /* renamed from: r, reason: collision with root package name */
    public m3.d f1666r;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1660l = false;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1662n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public boolean f1663o = false;

    public C0215x() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Aa.g(26, new Aa.g(25, this)));
        this.f1665q = new B9.ab(kotlin.jvm.internal.u.alpha.bravo(ConnectionDiagnosticsViewModelV2.class), new Aa.h(alpha, 20), new Aa.i(14, this, alpha), new Aa.h(alpha, 21));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f1660l) {
            return null;
        }
        victor();
        return this.f1659k;
    }

    @Override // androidx.fragment.app.ai, androidx.lifecycle.InterfaceC0651v
    public final androidx.lifecycle.a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        victor();
        whiskey();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [J2.i, java.lang.Object] */
    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.bottomsheet_connection_diagnostics, viewGroup, false);
        int i4 = R.id.tvDiagnosticsDetails;
        TextView textView = (TextView) S3.bravo(R.id.tvDiagnosticsDetails, inflate);
        if (textView != null) {
            i4 = R.id.tvOfflineDuration;
            TextView textView2 = (TextView) S3.bravo(R.id.tvOfflineDuration, inflate);
            if (textView2 != null) {
                i4 = R.id.tvReason;
                TextView textView3 = (TextView) S3.bravo(R.id.tvReason, inflate);
                if (textView3 != null) {
                    i4 = R.id.tvStatus;
                    TextView textView4 = (TextView) S3.bravo(R.id.tvStatus, inflate);
                    if (textView4 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        ?? obj = new Object();
                        obj.alpha = textView;
                        obj.purple = textView2;
                        obj.red = textView3;
                        obj.silver = textView4;
                        this.f1664p = obj;
                        Intrinsics.checkNotNull(obj);
                        Intrinsics.delta(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onDestroyView() {
        super.onDestroyView();
        this.f1664p = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(8192);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStop() {
        Window window;
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(8192);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        J2.i iVar = this.f1664p;
        Intrinsics.checkNotNull(iVar);
        ((TextView) iVar.silver).setText(getString(R.string.connection_diagnostics_status));
        B9.ab abVar = this.f1665q;
        ((ConnectionDiagnosticsViewModelV2) abVar.getValue()).charlie.observe(getViewLifecycleOwner(), new C0211t(0, this));
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        AbstractC3070v2.charlie(requireContext, "connection_diag_shown", kotlin.collections.t.alpha);
        ConnectionDiagnosticsViewModelV2 connectionDiagnosticsViewModelV2 = (ConnectionDiagnosticsViewModelV2) abVar.getValue();
        vf.ad.zulu(androidx.lifecycle.T.hotel(connectionDiagnosticsViewModelV2), null, null, new aa(connectionDiagnosticsViewModelV2, null), 3);
        ConnectionDiagnosticsViewModelV2 connectionDiagnosticsViewModelV22 = (ConnectionDiagnosticsViewModelV2) abVar.getValue();
        vf.ad.zulu(androidx.lifecycle.T.hotel(connectionDiagnosticsViewModelV22), null, null, new ab(connectionDiagnosticsViewModelV22, null), 3);
        androidx.lifecycle.al viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        vf.ad.zulu(androidx.lifecycle.T.foxtrot(viewLifecycleOwner), null, null, new C0212u(this, null), 3);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: uniform, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f1661m == null) {
            synchronized (this.f1662n) {
                try {
                    if (this.f1661m == null) {
                        this.f1661m = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f1661m;
    }

    public final void victor() {
        if (this.f1659k == null) {
            this.f1659k = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f1660l = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    public final void whiskey() {
        if (!this.f1663o) {
            this.f1663o = true;
            InterfaceC0216y interfaceC0216y = (InterfaceC0216y) generatedComponent();
            ((C0215x) UnsafeCasts.unsafeCast(this)).f1666r = (m3.d) ((w9.m) interfaceC0216y).alpha.orange.get();
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f1659k;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        victor();
        whiskey();
    }
}
