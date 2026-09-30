package Ga;

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
import delivery.samurai.android.ui.captainsuniforms.CaptainsUniformsFragment;
import w9.m;
import z9.i;

/* loaded from: classes2.dex */
public abstract class d extends n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f1361b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1362c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1363d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f1362c) {
            return null;
        }
        papa();
        return this.f1361b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f1363d) {
            this.f1363d = true;
            c cVar = (c) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ((CaptainsUniformsFragment) UnsafeCasts.unsafeCast(this)).white = (i) ((m) cVar).alpha.crimson.get();
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
        if (this.f1361b == null) {
            this.f1361b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f1362c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f1361b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
