package Ua;

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
public abstract class b extends AbstractC3307a {

    /* renamed from: r, reason: collision with root package name */
    public ContextWrapper f2133r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2134s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2135t = false;

    public final void blue() {
        if (this.f2133r == null) {
            this.f2133r = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2134s = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2134s) {
            return null;
        }
        blue();
        return this.f2133r;
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
        if (!this.f2135t) {
            this.f2135t = true;
            x xVar = (x) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            xVar.getClass();
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2133r;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        blue();
        zulu();
    }
}
