package ga;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.ui.about.MyAccountRouterFragment;

/* loaded from: classes2.dex */
public abstract class k extends d3.n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f12687b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12688c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12689d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f12688c) {
            return null;
        }
        papa();
        return this.f12687b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f12689d) {
            this.f12689d = true;
            af afVar = (af) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            MyAccountRouterFragment myAccountRouterFragment = (MyAccountRouterFragment) UnsafeCasts.unsafeCast(this);
            w9.p pVar = ((w9.m) afVar).alpha;
            myAccountRouterFragment.white = (z9.i) pVar.crimson.get();
            myAccountRouterFragment.e = (q3.g) pVar.november.get();
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
        if (this.f12687b == null) {
            this.f12687b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f12688c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f12687b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
