package oc;

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
import x9.AbstractC3307a;

/* renamed from: oc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2218a extends AbstractC3307a {

    /* renamed from: r, reason: collision with root package name */
    public ContextWrapper f13126r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13127s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13128t = false;

    public final void blue() {
        if (this.f13126r == null) {
            this.f13126r = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f13127s = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f13127s) {
            return null;
        }
        blue();
        return this.f13126r;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        blue();
        zulu();
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // x9.AbstractC3307a
    public final void zulu() {
        if (!this.f13128t) {
            this.f13128t = true;
            InterfaceC2220c interfaceC2220c = (InterfaceC2220c) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            interfaceC2220c.getClass();
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f13126r;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        blue();
        zulu();
    }
}
