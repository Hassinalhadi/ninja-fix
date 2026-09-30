package Qb;

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
import x9.AbstractC3309c;

/* loaded from: classes2.dex */
public abstract class e extends AbstractC3309c {

    /* renamed from: q, reason: collision with root package name */
    public ContextWrapper f1928q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1929r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1930s = false;

    public final void amber() {
        if (this.f1928q == null) {
            this.f1928q = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f1929r = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f1929r) {
            return null;
        }
        amber();
        return this.f1928q;
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        amber();
        whiskey();
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // x9.AbstractC3309c
    public final void whiskey() {
        if (!this.f1930s) {
            this.f1930s = true;
            s sVar = (s) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            sVar.getClass();
        }
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f1928q;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        amber();
        whiskey();
    }
}
