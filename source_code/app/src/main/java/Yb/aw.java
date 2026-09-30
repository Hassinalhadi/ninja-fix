package Yb;

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

/* loaded from: classes2.dex */
public abstract class aw extends AbstractC3307a {

    /* renamed from: r, reason: collision with root package name */
    public ContextWrapper f2380r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2381s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2382t = false;

    public final void blue() {
        if (this.f2380r == null) {
            this.f2380r = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2381s = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2381s) {
            return null;
        }
        blue();
        return this.f2380r;
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
        if (!this.f2382t) {
            this.f2382t = true;
            InterfaceC0332u interfaceC0332u = (InterfaceC0332u) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            interfaceC0332u.getClass();
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2380r;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        blue();
        zulu();
    }
}
