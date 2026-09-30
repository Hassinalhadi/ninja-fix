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
public abstract class au extends AbstractC3307a {

    /* renamed from: r, reason: collision with root package name */
    public ContextWrapper f2374r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2375s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2376t = false;

    public final void blue() {
        if (this.f2374r == null) {
            this.f2374r = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2375s = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2375s) {
            return null;
        }
        blue();
        return this.f2374r;
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
        if (!this.f2376t) {
            this.f2376t = true;
            InterfaceC0315l interfaceC0315l = (InterfaceC0315l) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            interfaceC0315l.getClass();
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2374r;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        blue();
        zulu();
    }
}
