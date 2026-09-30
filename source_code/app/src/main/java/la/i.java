package la;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import d3.n;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.ui.agreement.AgreementDetailFragment;
import w9.m;

/* loaded from: classes2.dex */
public abstract class i extends n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f12947b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12948c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12949d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f12948c) {
            return null;
        }
        papa();
        return this.f12947b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f12949d) {
            this.f12949d = true;
            f fVar = (f) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ((AgreementDetailFragment) UnsafeCasts.unsafeCast(this)).white = (z9.i) ((m) fVar).alpha.crimson.get();
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
        if (this.f12947b == null) {
            this.f12947b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f12948c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f12947b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
