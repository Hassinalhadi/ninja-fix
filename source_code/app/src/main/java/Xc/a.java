package Xc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.app.feature.location.store.LastSentLocationStore;
import d3.n;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.ui.zones.ZonesFragment;
import w9.m;
import w9.p;
import z9.i;

/* loaded from: classes2.dex */
public abstract class a extends n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f2263b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2264c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2265d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2264c) {
            return null;
        }
        papa();
        return this.f2263b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f2265d) {
            this.f2265d = true;
            d dVar = (d) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ZonesFragment zonesFragment = (ZonesFragment) UnsafeCasts.unsafeCast(this);
            p pVar = ((m) dVar).alpha;
            zonesFragment.white = (i) pVar.crimson.get();
            zonesFragment.e = (LastSentLocationStore) pVar.beige.get();
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
        if (this.f2263b == null) {
            this.f2263b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2264c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2263b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
