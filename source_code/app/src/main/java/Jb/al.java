package Jb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.app.feature.location.LocationBroadcastConfig;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import u3.InterfaceC3143f;

/* loaded from: classes2.dex */
public abstract class al extends d3.n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f1634b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1635c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1636d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f1635c) {
            return null;
        }
        papa();
        return this.f1634b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f1636d) {
            this.f1636d = true;
            c0 c0Var = (c0) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            OrdersFragmentV2 ordersFragmentV2 = (OrdersFragmentV2) UnsafeCasts.unsafeCast(this);
            w9.p pVar = ((w9.m) c0Var).alpha;
            ordersFragmentV2.white = (z9.i) pVar.crimson.get();
            ordersFragmentV2.e = (Nb.h) pVar.jade.get();
            ordersFragmentV2.f12298f = (LocationBroadcastConfig) pVar.gray.get();
            ordersFragmentV2.f12299g = (InterfaceC3143f) pVar.lavender.get();
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        papa();
        mike();
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    public final void papa() {
        if (this.f1634b == null) {
            this.f1634b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f1635c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f1634b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
