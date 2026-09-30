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
import delivery.samurai.android.ui.about.TrophiesCollectionsFragment;

/* loaded from: classes2.dex */
public abstract class l extends d3.n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f12690b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12691c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12692d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f12691c) {
            return null;
        }
        papa();
        return this.f12690b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f12692d) {
            this.f12692d = true;
            aq aqVar = (aq) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ((TrophiesCollectionsFragment) UnsafeCasts.unsafeCast(this)).white = (z9.i) ((w9.m) aqVar).alpha.crimson.get();
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
        if (this.f12690b == null) {
            this.f12690b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f12691c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f12690b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
